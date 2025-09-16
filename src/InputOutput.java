import java.util.*;
import java.util.stream.Collectors;

public class InputOutput {
    public static final Scanner scanner = new Scanner(System.in);

    static <E extends Enum<E>> String listToString(List<E> ingredients, String separator) {
        String result = ingredients.stream()
                .map(ing -> String.valueOf(ing).replace("_", " "))
                .collect(Collectors.joining(separator));
        return result;
    }
    static String listToString(long effectMask, String separator) {
        List<Effect> effectsList = new LinkedList<>();
        Effect[] effects = Effect.values();
        int index = 0;

        while (effectMask != 0 && index < effects.length) {
            if ((effectMask & 1L) != 0) {
                effectsList.add(effects[index]);
            }
            effectMask >>= 1;
            index++;
        }

        return listToString(effectsList, separator);
    }
    static String getAllStringEffects() {
        return listToString(( (long) 1 << Effect.values().length) - 1, ", "); // Bitmask with all ones
    }
    static String getAllStringIngredients() {
        return listToString(Arrays.asList(IngredientName.values()), ", ");
    }
    static long getEffects() {
        long effects = 0L;

        System.out.println("Enter each goal effect on a separate line\nConclude list with blank line:");
        while (true) {
            String line = InputOutput.scanner.nextLine().toUpperCase().trim().replaceAll("\\s+", "_");

            if (line.isEmpty())
                break;

            boolean effectMatch = false;
            for (Effect effect : Effect.values()) {
                if(effect.toString().equals(line)) {
                    effects |= effect.mask;
                    effectMatch = true;
                }
            }
            if(!effectMatch) {
                System.out.println("Invalid effect. Please try again.");
            }
        }
        return effects;
    }
    static List<IngredientName> getIngredients() {
        List<IngredientName> ingredients = new LinkedList<>();

        System.out.println("Enter each ingredient on a separate line\nConclude list with blank line:");
        while (true) {
            String line = InputOutput.scanner.nextLine().toUpperCase().trim().replaceAll("\\s+", "_");

            if (line.isEmpty())
                break;

            boolean ingredientMatch = false;
            for (IngredientName ingredient : IngredientName.values()) {
                if(ingredient.toString().equals(line)) {
                    ingredients.add(ingredient);
                    ingredientMatch = true;
                }
            }
            if(!ingredientMatch) {
                System.out.println("Invalid ingredient. Please try again");
            }
        }
        return ingredients;
    }
    static int getModeIndex(Mode[] modes) {

        System.out.println("Enter mode number from list or empty line to exit");
        for (int i = 0; i < modes.length; i++) {
            System.out.println((i + 1) + ": " + modes[i].name);
        }
        while (true) {
            String line = InputOutput.scanner.nextLine();
            if (line.isEmpty())
                return -1;
            try {
                int modeNum = Integer.parseInt(line);
                if (modeNum <= 0 || modeNum > modes.length) {
                    throw new NumberFormatException();
                }
                System.out.println();
                return modeNum - 1;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again");
            }
        }
    }
    static void displayResult(String body) {
        System.out.println("-------------------------------------------------");
        System.out.print(body);
        InputOutput.scanner.nextLine();
        System.out.println("-------------------------------------------------\n");
    }
    static void displayIngredientsToEffects(List<IngredientName> ingredients, long effects) {
        String body =
                "The result of " + InputOutput.listToString(ingredients, " -> ") + ":\n" +
                InputOutput.listToString(effects, ", ");
        displayResult(body);
    }
    static void displayEffectsToIngredients(List<IngredientName> ingredients, long effects) {
        String body =
                "The recipe for " + InputOutput.listToString(effects, ", ") + ":\n" +
                InputOutput.listToString(ingredients, " -> ");
        displayResult(body);
    }
    static void displayViewIngredients() {
        displayResult(getAllStringIngredients());
    }
    static void displayViewEffects() {
        displayResult(getAllStringEffects());
    }
}
