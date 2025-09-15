import java.util.List;

public abstract class Mode {
    String name;
    abstract void run();

    Mode(String name) {
        this.name = name;
    }
}
class IngredientsToEffects extends Mode {
    IngredientsToEffects() {
        super("Ingredients to Effects");
    }
    void run() {

    }
}
class EffectsToIngredients extends Mode {
    EffectsToIngredients() {
        super("Effects to Ingredients");
    }
    void run() {
        long goalEffects = InputOutput.getEffects();
        List<Ingredient> ingredientSequence = CalcUtils.findIngredients(goalEffects);
        System.out.println("-----------------------------------------");
        System.out.println("The recipe for " + String.join(", ", InputOutput.getStringEffects(goalEffects)) + ":");
        System.out.println(InputOutput.getStringSequence(ingredientSequence, " -> "));
    }
}
