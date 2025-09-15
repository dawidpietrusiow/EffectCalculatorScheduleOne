import java.util.*;

public class CalcUtils {
    static List<Ingredient> findIngredients (long goalMask) {
        Queue<Recipe> queue = new LinkedList<>();
        Set<Long> visited = new HashSet<>();

        Recipe start = new Recipe(0, new LinkedList<>());
        queue.add(start);
        visited.add(start.effects);

        while (!queue.isEmpty()) {
            Recipe current = queue.poll();

            if ((current.effects & goalMask) == goalMask) {
                return current.sequence;
            }

            for (Ingredient ingredient : IngredientsData.ingredients) {
                long newEffects = CalcUtils.getUpdatedEffects(current.effects, ingredient);

                if (!visited.contains(newEffects)) {
                    List<Ingredient> newSequence = new LinkedList<>(current.sequence);
                    newSequence.add(ingredient);
                    queue.add(new Recipe(newEffects, newSequence));
                    visited.add(newEffects);
                }
            }
        }
        return null;
    }
    static long getUpdatedEffects(long oldEffects, Ingredient ingredient) {
        List<Long> effectsFromRules = new LinkedList<>();
        for (Rule rule : ingredient.rules) {
            if ((rule.effectMask & oldEffects) != 0L) {
                oldEffects &= ~rule.removeMask;
                effectsFromRules.add(rule.addMask);
            }
        }
        long newEffects = oldEffects | effectsFromRules.stream().reduce(0L, (a, b) -> a | b);
        newEffects |= ingredient.baseMask;
        return newEffects;
    }
}
