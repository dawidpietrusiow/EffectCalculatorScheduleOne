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
        List<IngredientName> ingredients = InputOutput.getIngredients();
        long effects = CalcUtils.findEffects(ingredients);
        InputOutput.displayIngredientsToEffects(ingredients, effects);
    }
}
class EffectsToIngredients extends Mode {
    EffectsToIngredients() {
        super("Effects to Ingredients");
    }
    void run() {
        long goalEffects = InputOutput.getEffects();
        List<IngredientName> ingredients = IngredientUtils.getIngredientsNames(CalcUtils.findIngredients(goalEffects));
        InputOutput.displayEffectsToIngredients(ingredients, goalEffects);
    }
}
class ViewIngredients extends Mode {
    ViewIngredients() {
        super("View Ingredients");
    }
    void run() {
        InputOutput.displayViewIngredients();
    }
}
class ViewEffects extends Mode {
    ViewEffects() {
        super("View Effects");
    }
    void run() {
        InputOutput.displayViewEffects();
    }
}
