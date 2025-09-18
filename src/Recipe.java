import java.util.List;

class Recipe {
    long effects;
    List<Ingredient> sequence;
    int pathCost;
    int pathScore;

    Recipe(long effects, List<Ingredient> sequence, int pathCost, int pathScore) {
        this.effects = effects;
        this.sequence = sequence;
        this.pathCost = pathCost;
        this.pathScore = pathScore;
    }
}
