import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

        System.out.println("\nEnter each ingredient on a separate line:");
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
        System.out.println("\nEnter drug type:");
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

        System.out.println("\nEnter mode number from menu");
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
        StringBuilder sb = new StringBuilder();
        String[] lines = text.split("\n");
        for (String line : lines) {
            List<Integer> breakPoints = findBreakPoints(line);
            int lastBreakPoint = 0;
            for (int i = 0; i < breakPoints.size() - 1; i++) {
                int currentBreakPoint = breakPoints.get(i);
                int nextBreakPoint = breakPoints.get(i + 1);
                if (nextBreakPoint - lastBreakPoint > CONSOLE_WRAP_WIDTH) {
                    sb.append(line.substring(lastBreakPoint, currentBreakPoint)).append("\n");
                    lastBreakPoint = currentBreakPoint;
                }
            }
            sb.append(line.substring(lastBreakPoint)).append("\n");
        }
        return sb.toString();
    }
    static List<Integer> findBreakPoints(String line) {
        List<Integer> breakPoints = new LinkedList<>();
        Pattern pattern = Pattern.compile("[^A-Za-z\\s]\\s+");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find())
            breakPoints.add(matcher.end());
        return breakPoints;
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
                "Mixing " + enumToString(drug) + " with\n" + InputOutput.listToString(ingredients, " -> ") + ":\n\n" +
                InputOutput.listToString(effects, ", ");
        displayWithFrame(body);
        InputOutput.scanner.nextLine();
    }
    static void displayEffectsToIngredients(Drug drug, List<IngredientName> ingredients, long effects) {
        String body =
                "The recipe for " + enumToString(drug) + " to get\n" + InputOutput.listToString(effects, ", ") + ":\n\n" +
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
