import java.util.Arrays;
import java.util.LinkedList;
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
        Drug drug = InputOutput.getDrugType();
        if(drug == null)
            return;

        List<IngredientName> ingredients = InputOutput.getIngredients();
        if(ingredients == null)
            return;

        long effects = CalcUtils.findEffects(ingredients, drug.mask);
        InputOutput.displayIngredientsToEffects(drug, ingredients, effects);
    }
}
class EffectsToIngredients extends Mode {
    EffectsToIngredients() {
        super("Effects to Ingredients");
    }
    void run() {
        Drug drug = InputOutput.getDrugType();
        if(drug == null)
            return;

        long goalEffects = InputOutput.getEffects();
        if(goalEffects == -1)
            return;

        List<IngredientName> ingredients = IngredientUtils.getIngredientsNames(CalcUtils.findIngredients(goalEffects, drug.mask));
        InputOutput.displayEffectsToIngredients(drug, ingredients, goalEffects);
    }
}
class ViewIngredients extends Mode {
    ViewIngredients() {
        super("View Ingredients");
    }
    void run() {
        List<IngredientName> allIngredients = Arrays.asList(IngredientName.values());
        InputOutput.displayViewAll(allIngredients);
    }
}
class ViewEffects extends Mode {
    ViewEffects() {
        super("View Effects");
    }
    void run() {
        List<Effect> allEffects = Arrays.asList(Effect.values());
        InputOutput.displayViewAll(allEffects);
    }
}
class ViewDrugs extends Mode {
    ViewDrugs() {
        super("View Drugs");
    }
    void run() {
        List<Drug> allDrugs = Arrays.asList(Drug.values());
        InputOutput.displayViewAll(allDrugs);
    }
}
