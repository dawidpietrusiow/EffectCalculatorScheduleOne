class Ingredient {
    final String name;
    final long baseMask;
    final Rule[] rules;

    Ingredient(String name, Effect baseEffect, Rule[] rules) {
        this.name = name;
        this.baseMask = baseEffect.mask;
        this.rules = rules;
    }
}

