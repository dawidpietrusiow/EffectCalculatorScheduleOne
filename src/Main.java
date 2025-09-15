import java.util.List;

public class Main {
    public static void main(String[] args) {
        long goalEffects = InputOutput.getGoalEffects();
        List<Ingredient> ingredientSequence = IngredientUtils.findIngredients(goalEffects);
        System.out.println("-----------------------------------------");
        System.out.println("The recipe for " + String.join(", ", InputOutput.getStringEffects(goalEffects)) + ":");
        System.out.println(InputOutput.getStringSequence(ingredientSequence, " -> "));
    }
}



//Gasoline-->Cuke-->Iodine-->Megabean-->Battery-->Energy drink-->Banana
//[GINGERITIS, ATHLETIC, BRIGHT EYED, JENNERISING, LAXATIVE, FOCUSED, SHRINKING]
