import java.util.*;

public class IngredientUtils {
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
                long newEffects = Recipe.getUpdatedEffects(current.effects, ingredient);

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
}
