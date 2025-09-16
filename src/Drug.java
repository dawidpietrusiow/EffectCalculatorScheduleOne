public enum Drug {
    OG_KUSH(Effect.CALMING.mask),
    SOUR_DIESEL(Effect.REFRESHING.mask),
    GREEN_CRACK(Effect.ENERGIZING.mask),
    GRANDDADDY_PURPLE(Effect.SEDATING.mask),
    METHAMPHETAMINE(0L), // No effect
    COCAINE(0L);         // No effect

    public final long mask;

    Drug(long mask) {
        this.mask = mask;
    }
}