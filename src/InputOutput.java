import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputOutput {
    static String getStringSequence(List<Ingredient> sequence, String separator) {
        String result = sequence.stream()
                .map(ing -> ing.name)
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
    static long getGoalEffects() {
        long effects = 0L;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter each goal effect on a separate line\nConclude list with blank line:");
        while (true) {
            String line = sc.nextLine().toUpperCase().trim().replaceAll("\\s+", "_");

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
        sc.close();
        return effects;
    }
}
