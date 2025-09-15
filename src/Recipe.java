import java.util.LinkedList;
import java.util.List;

class Recipe {
    long effects;
    List<Ingredient> sequence;

    Recipe(long effects, List<Ingredient> sequence) {
        this.effects = effects;
        this.sequence = sequence;
    }

    static long getUpdatedEffects(long oldEffects, Ingredient ingredient) {
        List<Long> effectsFromRules = new LinkedList<>();
        for (Rule rule : ingredient.rules) {
            if ((rule.effectMask & oldEffects) != 0L) {
                oldEffects &= ~rule.removeMask;
                effectsFromRules.add(rule.addMask);
            }
        }
        long newEffects = oldEffects | effectsFromRules.stream().reduce(0L, (a, b) -> a | b);
        newEffects |= ingredient.baseMask;
        return newEffects;
    }
}
