import java.util.LinkedList;
import java.util.List;

class Recipe {
    long effects;
    List<Ingredient> sequence;

    Recipe(long effects, List<Ingredient> sequence) {
        this.effects = effects;
        this.sequence = sequence;
    }
}
