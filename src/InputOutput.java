import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputOutput {
    public static final Scanner scanner = new Scanner(System.in);

    static String getStringSequence(List<Ingredient> sequence, String separator) {
        String result = sequence.stream()
                .map(ing -> String.valueOf(ing.name).replace("_", " "))
                .collect(Collectors.joining(separator));
        return result;
    }
    static List<String> getStringEffects(long effectMask) {
        List<String> effectsList = new LinkedList<>();
        Effect[] effects = Effect.values();
        int index = 0;

        while (effectMask != 0 && index < effects.length) {
            if ((effectMask & 1L) != 0) {
                effectsList.add(effects[index].name().replace("_", " "));
            }
            effectMask >>= 1;
            index++;
        }

        return effectsList;
    }
    static List<String> getAllStringEffects() {
        return getStringEffects(( (long) 1 << Effect.values().length) - 1); // Bitmask with all ones
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
                System.out.println("Invalid effect. Please choose an effect from the list.");
                System.out.println("Available effects:\n" + String.join(", ", InputOutput.getAllStringEffects()) + "\n");
            }
        }
        return effects;
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
                return modeNum - 1;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
