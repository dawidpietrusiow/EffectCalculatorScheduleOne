class Rule {
    final long effectMask;
    final long removeMask;
    final long addMask;

    Rule(Effect effect, Effect[] removeEffects, Effect[] addEffects) {
        this.effectMask = effect.mask;

        long removeMask = 0;
        for (Effect removeEffect : removeEffects) {
            removeMask |= removeEffect.mask;
        }
        this.removeMask = removeMask;

        long addMask = 0;
        for (Effect addEffect : addEffects) {
            addMask |= addEffect.mask;
        }
        this.addMask = addMask;


    }
}
