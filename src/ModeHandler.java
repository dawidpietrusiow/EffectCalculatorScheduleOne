public class ModeHandler {
    Mode[] modes = {new IngredientsToEffects(), new EffectsToIngredients(), new ViewIngredients(), new ViewEffects()};

    void run() {
        while (true) {
            int modeIndex = InputOutput.getModeIndex(this.modes);
            if (modeIndex == -1)
                break;

            this.modes[modeIndex].run();
        }
    }
}
