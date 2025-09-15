public enum IngredientName {
    CUKE,
    BANANA,
    PARACETAMOL,
    DONUT,
    VIAGOR,
    MOUTH_WASH,
    FLU_MEDICINE,
    GASOLINE,
    ENERGY_DRINK,
    MOTOR_OIL,
    MEGA_BEAN,
    CHILI,
    BATTERY,
    IODINE,
    ADDY,
    HORSE_SEMEN;

    public final long mask;

    IngredientName() {
        this.mask = 1L << this.ordinal();
    }
}
