import java.util.LinkedList;
import java.util.List;

public class Ingredient {
    final IngredientName name;
    final long baseMask;
    final Rule[] rules;

    Ingredient(IngredientName name, Effect baseEffect, Rule[] rules) {
        this.name = name;
        this.baseMask = baseEffect.mask;
        this.rules = rules;
    }
}
class IngredientUtils {
    static List<IngredientName> getIngredientsNames(List<Ingredient> ingredients) {
        List<IngredientName> ingredientsNames = new LinkedList<>();
        for (Ingredient ingredient : ingredients) {
            ingredientsNames.add(ingredient.name);
        }
        return ingredientsNames;
    }
}
