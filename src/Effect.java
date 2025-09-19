public enum Effect {
    ENERGIZING,
    GINGERITIS,
    SNEAKY,
    CALORIE_DENSE,
    TROPIC_THUNDER,
    BALDING,
    SEDATING,
    TOXIC,
    ATHLETIC,
    SLIPPERY,
    FOGGY,
    SPICY,
    BRIGHT_EYED,
    JENNERISING,
    THOUGHT_PROVOKING,
    LONG_FACED,
    CALMING,
    REFRESHING,
    ANTI_GRAVITY,
    GLOWING,
    PARANOIA,
    EUPHORIC,
    MUNCHIES,
    CYCLOPEAN,
    LAXATIVE,
    SMELLY,
    EXPLOSIVE,
    ELECTRIFYING,
    DISORIENTING,
    SEIZURE_INDUCING,
    ZOMBIFYING,
    SCHIZOPHRENIC,
    FOCUSED,
    SHRINKING;

    public final long mask;

    Effect() {
        this.mask = 1L << this.ordinal();
    }
}

