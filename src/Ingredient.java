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

