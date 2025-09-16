import java.util.*;
import java.util.stream.Collectors;

public class InputOutput {
    public static final Scanner scanner = new Scanner(System.in);
    public static final long CONSOLE_WIDTH = 80;
    public static final long CONSOLE_WRAP_WIDTH = CONSOLE_WIDTH - 10;

    static <E extends Enum<E>> String enumToString(E value) {
        return String.valueOf(value).replace("_", " ");
    }

    static <E extends Enum<E>> String listToString(List<E> values, String separator) {
        if (values.isEmpty())
            return "<nothing>";
        String result = values.stream()
                .map(val -> enumToString(val))
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
    static long getEffects() {
        long effects = 0L;

        System.out.println("\nEnter each goal effect on a separate line\nConclude list with blank line ('q' to quit to menu):");
        while (true) {
            String line = InputOutput.scanner.nextLine().toUpperCase().trim().replaceAll("\\s+", "_");

            if ("Q".equals(line))
                return -1;

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

        System.out.println("\n('q' to exit)\nEnter each ingredient on a separate line\nConclude list with blank line:");
        while (true) {
            String line = InputOutput.scanner.nextLine().toUpperCase().trim().replaceAll("\\s+", "_");

            if ("Q".equals(line))
                return null;

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
    static Drug getDrugType() {
        System.out.println("\n('q' to exit)\nEnter drug type:");
        while (true) {
            String line = InputOutput.scanner.nextLine().toUpperCase().trim().replaceAll("\\s+", "_");

            if("Q".equals(line))
                return null;

            boolean effectMatch = false;
            for (Drug drug : Drug.values()) {
                if(drug.toString().equals(line)) {
                    return drug;
                }
            }
            if(!effectMatch) {
                System.out.println("Invalid drug type. Please try again.");
            }
        }
    }
    static int getModeIndex(Mode[] modes) {

        System.out.println("\nEnter mode number from list or empty line to exit");
        for (int i = 0; i < modes.length; i++) {
            System.out.println((i + 1) + ": " + modes[i].name);
        }
        while (true) {
            String line = InputOutput.scanner.nextLine();
            if ("Q".toLowerCase().equals(line))
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
    static String lineWrap(String text) {
        int previousBlankIndex = 0;
        String[] lines = text.split("\n");
        for (int row = 0; row < lines.length; row++) {
            for (int i = 0; i < lines[row].length(); i++) {
                if (lines[row].charAt(i) == ' ')
                    previousBlankIndex = i;
                if ((i + 1) % CONSOLE_WRAP_WIDTH == 0)
                    lines[row] = lines[row].substring(0, previousBlankIndex) + "\n" + lines[row].substring(previousBlankIndex + 1);
            }
        }
        return String.join("\n", lines);
    }
    static void displayWithFrame(String body) {
        int maxLength = 0;
        //Find max line length
        String[] lines = lineWrap(body).split("\n");
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].length() > maxLength)
                maxLength = lines[i].length();
        }
        //Add padding and side borders
        for (int i = 0; i < lines.length; i++) {
            lines[i] = "| " + lines[i] + " ".repeat(maxLength - lines[i].length()) + " |";
        }
        //Combine lines and add top and bottom border
        String result =
                "+" + "-".repeat(maxLength + 2) + "+\n" +
                String.join("\n", lines) +
                "\n+" + "-".repeat(maxLength + 2) + "+";
        System.out.println(result);
    }
    static void displayIngredientsToEffects(Drug drug, List<IngredientName> ingredients, long effects) {
        String body =
                "Mixing " + enumToString(drug) + " with " + InputOutput.listToString(ingredients, " -> ") + ":\n\n" +
                InputOutput.listToString(effects, ", ");
        displayWithFrame(body);
        InputOutput.scanner.nextLine();
    }
    static void displayEffectsToIngredients(Drug drug, List<IngredientName> ingredients, long effects) {
        String body =
                "The recipe for " + enumToString(drug) + " to get " + InputOutput.listToString(effects, ", ") + ":\n\n" +
                InputOutput.listToString(ingredients, " -> ");
        displayWithFrame(body);
        InputOutput.scanner.nextLine();
    }
    static <E extends Enum<E>> void displayViewAll(List<E> values) {
        displayWithFrame(listToString(values, ", "));
        InputOutput.scanner.nextLine();
    }
    static void displayWelcome() {
        displayWithFrame("EFFECT CALCULATOR FOR SCHEDULE ONE");
        System.out.println("* 'ENTER' for [SUBMIT] or [CONTINUE]");
        System.out.println("* 'q' for [BACK TO MENU] or [EXIT]");
    }
}
