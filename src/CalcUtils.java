import java.util.*;

public class CalcUtils {
    static long MAX_EFFECTS = 8;

    static List<Ingredient> findIngredients (long goalEffects, long effects) {
        PriorityQueue<Recipe> queue = new PriorityQueue<>(Comparator.comparingInt(r -> r.pathScore));
        Map<Long, Integer> bestCost = new HashMap<>();

        Recipe start = new Recipe(effects, new LinkedList<>(), 0, 0);
        queue.add(start);
        bestCost.put(start.effects, 0);

        while (!queue.isEmpty()) {
            Recipe current = queue.poll();

            if ((current.effects & goalEffects) == goalEffects) {
                return current.sequence;
            }

            for (Ingredient ingredient : IngredientsData.ingredients) {
                long newEffects = CalcUtils.getUpdatedEffects(current.effects, ingredient);
                int pathCost = current.pathCost + 1;
                int pathLeft = Long.bitCount(goalEffects & ~newEffects);

                if (!bestCost.containsKey(newEffects) || pathCost < bestCost.get(newEffects)) {
                    List<Ingredient> newSequence = new LinkedList<>(current.sequence);
                    newSequence.add(ingredient);
                    Recipe nextRecipe = new Recipe(newEffects, newSequence, pathCost, pathCost + pathLeft);
                    queue.add(nextRecipe);
                    bestCost.put(newEffects, pathCost);
                }
            }
        }
        return null;
    }
    static long findEffects (List<IngredientName> ingredientsNames, long effects) {
        for(IngredientName ingredientName : ingredientsNames) {
            effects = getUpdatedEffects(effects, IngredientsData.ingredients[ingredientName.ordinal()]);
        }
        return effects;
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
        if (getEffectsCount(newEffects) < MAX_EFFECTS)    // Effects are capped at MAX_EFFECTS, and can then only be replaced
            newEffects |= ingredient.baseMask;
        return newEffects;
    }
    static long getEffectsCount(long effects) {
        long count = 0L;
        while (effects != 0L) {
            if ((effects & 1L) != 0L) {
                count++;
            }
            effects >>= 1;
        }
        return count;
    }
}
