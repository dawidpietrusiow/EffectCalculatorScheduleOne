public class IngredientsData {
    static Ingredient[] ingredients = {
            new Ingredient(IngredientName.CUKE, Effect.ENERGIZING, new Rule[]{
                    new Rule(Effect.EUPHORIC, new Effect[]{Effect.EUPHORIC}, new Effect[]{Effect.LAXATIVE}),
                    new Rule(Effect.FOGGY, new Effect[]{Effect.FOGGY}, new Effect[]{Effect.CYCLOPEAN}),
                    new Rule(Effect.GINGERITIS, new Effect[]{Effect.GINGERITIS}, new Effect[]{Effect.THOUGHT_PROVOKING}),
                    new Rule(Effect.MUNCHIES, new Effect[]{Effect.MUNCHIES}, new Effect[]{Effect.ATHLETIC}),
                    new Rule(Effect.SLIPPERY, new Effect[]{Effect.SLIPPERY}, new Effect[]{Effect.MUNCHIES}),
                    new Rule(Effect.SNEAKY, new Effect[]{Effect.SNEAKY}, new Effect[]{Effect.PARANOIA}),
                    new Rule(Effect.TOXIC, new Effect[]{Effect.TOXIC}, new Effect[]{Effect.EUPHORIC}),
            }
            ),
            new Ingredient(IngredientName.BANANA, Effect.GINGERITIS, new Rule[]{
                    new Rule(Effect.CALMING, new Effect[]{Effect.CALMING}, new Effect[]{Effect.SNEAKY}),
                    new Rule(Effect.CYCLOPEAN, new Effect[]{Effect.CYCLOPEAN}, new Effect[]{Effect.ENERGIZING}),
                    new Rule(Effect.DISORIENTING, new Effect[]{Effect.DISORIENTING}, new Effect[]{Effect.FOCUSED}),
                    new Rule(Effect.ENERGIZING, new Effect[]{Effect.ENERGIZING}, new Effect[]{Effect.THOUGHT_PROVOKING}),
                    new Rule(Effect.FOCUSED, new Effect[]{Effect.FOCUSED}, new Effect[]{Effect.SEIZURE_INDUCING}),
                    new Rule(Effect.LONG_FACED, new Effect[]{Effect.LONG_FACED}, new Effect[]{Effect.REFRESHING}),
                    new Rule(Effect.PARANOIA, new Effect[]{Effect.PARANOIA}, new Effect[]{Effect.JENNERISING}),
                    new Rule(Effect.SMELLY, new Effect[]{Effect.SMELLY}, new Effect[]{Effect.ANTI_GRAVITY}),
                    new Rule(Effect.TOXIC, new Effect[]{Effect.TOXIC}, new Effect[]{Effect.SMELLY}),
            }
            ),
            new Ingredient(IngredientName.PARACETAMOL, Effect.SNEAKY, new Rule[]{
                    new Rule(Effect.CALMING, new Effect[]{Effect.CALMING}, new Effect[]{Effect.SLIPPERY}),
                    new Rule(Effect.ELECTRIFYING, new Effect[]{Effect.ELECTRIFYING}, new Effect[]{Effect.ATHLETIC}),
                    new Rule(Effect.ENERGIZING, new Effect[]{Effect.ENERGIZING}, new Effect[]{Effect.PARANOIA}),
                    new Rule(Effect.FOCUSED, new Effect[]{Effect.FOCUSED}, new Effect[]{Effect.GINGERITIS}),
                    new Rule(Effect.FOGGY, new Effect[]{Effect.FOGGY}, new Effect[]{Effect.CALMING}),
                    new Rule(Effect.GLOWING, new Effect[]{Effect.GLOWING}, new Effect[]{Effect.TOXIC}),
                    new Rule(Effect.MUNCHIES, new Effect[]{Effect.MUNCHIES}, new Effect[]{Effect.ANTI_GRAVITY}),
                    new Rule(Effect.PARANOIA, new Effect[]{Effect.PARANOIA}, new Effect[]{Effect.BALDING}),
                    new Rule(Effect.SPICY, new Effect[]{Effect.SPICY}, new Effect[]{Effect.BRIGHT_EYED}),
                    new Rule(Effect.TOXIC, new Effect[]{Effect.TOXIC}, new Effect[]{Effect.TROPIC_THUNDER}),

            }
            ),
            new Ingredient(IngredientName.DONUT, Effect.CALORIE_DENSE, new Rule[]{
                    new Rule(Effect.ANTI_GRAVITY, new Effect[]{Effect.ANTI_GRAVITY}, new Effect[]{Effect.SLIPPERY}),
                    new Rule(Effect.BALDING, new Effect[]{Effect.BALDING}, new Effect[]{Effect.SNEAKY}),
                    new Rule(Effect.CALORIE_DENSE, new Effect[]{}, new Effect[]{Effect.EXPLOSIVE}),
                    new Rule(Effect.FOCUSED, new Effect[]{Effect.FOCUSED}, new Effect[]{Effect.EUPHORIC}),
                    new Rule(Effect.JENNERISING, new Effect[]{Effect.JENNERISING}, new Effect[]{Effect.GINGERITIS}),
                    new Rule(Effect.MUNCHIES, new Effect[]{Effect.MUNCHIES}, new Effect[]{Effect.CALMING}),
                    new Rule(Effect.SHRINKING, new Effect[]{Effect.SHRINKING}, new Effect[]{Effect.ENERGIZING}),
            }
            ),
            new Ingredient(IngredientName.VIAGOR, Effect.TROPIC_THUNDER, new Rule[]{
                    new Rule(Effect.ATHLETIC, new Effect[]{Effect.ATHLETIC}, new Effect[]{Effect.SNEAKY}),
                    new Rule(Effect.DISORIENTING, new Effect[]{Effect.DISORIENTING}, new Effect[]{Effect.TOXIC}),
                    new Rule(Effect.EUPHORIC, new Effect[]{Effect.EUPHORIC}, new Effect[]{Effect.BRIGHT_EYED}),
                    new Rule(Effect.LAXATIVE, new Effect[]{Effect.LAXATIVE}, new Effect[]{Effect.CALMING}),
                    new Rule(Effect.SHRINKING, new Effect[]{Effect.SHRINKING}, new Effect[]{Effect.GINGERITIS}),
            }
            ),
            new Ingredient(IngredientName.MOUTH_WASH, Effect.BALDING, new Rule[]{
                    new Rule(Effect.CALMING, new Effect[]{Effect.CALMING}, new Effect[]{Effect.ANTI_GRAVITY}),
                    new Rule(Effect.CALORIE_DENSE, new Effect[]{Effect.CALORIE_DENSE}, new Effect[]{Effect.SNEAKY}),
                    new Rule(Effect.EXPLOSIVE, new Effect[]{Effect.EXPLOSIVE}, new Effect[]{Effect.SEDATING}),
                    new Rule(Effect.FOCUSED, new Effect[]{Effect.FOCUSED}, new Effect[]{Effect.JENNERISING}),
            }
            ),
            new Ingredient(IngredientName.FLU_MEDICINE, Effect.SEDATING, new Rule[]{
                    new Rule(Effect.ATHLETIC, new Effect[]{Effect.ATHLETIC}, new Effect[]{Effect.MUNCHIES}),
                    new Rule(Effect.CALMING, new Effect[]{Effect.CALMING}, new Effect[]{Effect.BRIGHT_EYED}),
                    new Rule(Effect.CYCLOPEAN, new Effect[]{Effect.CYCLOPEAN}, new Effect[]{Effect.FOGGY}),
                    new Rule(Effect.ELECTRIFYING, new Effect[]{Effect.ELECTRIFYING}, new Effect[]{Effect.REFRESHING}),
                    new Rule(Effect.EUPHORIC, new Effect[]{Effect.EUPHORIC}, new Effect[]{Effect.TOXIC}),
                    new Rule(Effect.FOCUSED, new Effect[]{Effect.FOCUSED}, new Effect[]{Effect.CALMING}),
                    new Rule(Effect.LAXATIVE, new Effect[]{Effect.LAXATIVE}, new Effect[]{Effect.EUPHORIC}),
                    new Rule(Effect.MUNCHIES, new Effect[]{Effect.MUNCHIES}, new Effect[]{Effect.SLIPPERY}),
                    new Rule(Effect.SHRINKING, new Effect[]{Effect.SHRINKING}, new Effect[]{Effect.PARANOIA}),
                    new Rule(Effect.THOUGHT_PROVOKING, new Effect[]{Effect.THOUGHT_PROVOKING}, new Effect[]{Effect.GINGERITIS}),
            }
            ),
            new Ingredient(IngredientName.GASOLINE, Effect.TOXIC, new Rule[]{
                    new Rule(Effect.DISORIENTING, new Effect[]{Effect.DISORIENTING}, new Effect[]{Effect.GLOWING}),
                    new Rule(Effect.ELECTRIFYING, new Effect[]{Effect.ELECTRIFYING}, new Effect[]{Effect.DISORIENTING}),
                    new Rule(Effect.ENERGIZING, new Effect[]{Effect.ENERGIZING}, new Effect[]{Effect.EUPHORIC}),
                    new Rule(Effect.EUPHORIC, new Effect[]{Effect.EUPHORIC}, new Effect[]{Effect.SPICY}),
                    new Rule(Effect.GINGERITIS, new Effect[]{Effect.GINGERITIS}, new Effect[]{Effect.SMELLY}),
                    new Rule(Effect.JENNERISING, new Effect[]{Effect.JENNERISING}, new Effect[]{Effect.SNEAKY}),
                    new Rule(Effect.LAXATIVE, new Effect[]{Effect.LAXATIVE}, new Effect[]{Effect.FOGGY}),
                    new Rule(Effect.MUNCHIES, new Effect[]{Effect.MUNCHIES}, new Effect[]{Effect.SEDATING}),
                    new Rule(Effect.PARANOIA, new Effect[]{Effect.PARANOIA}, new Effect[]{Effect.CALMING}),
                    new Rule(Effect.SHRINKING, new Effect[]{Effect.SHRINKING}, new Effect[]{Effect.FOCUSED}),
                    new Rule(Effect.SNEAKY, new Effect[]{Effect.SNEAKY}, new Effect[]{Effect.TROPIC_THUNDER}),
            }
            ),
            new Ingredient(IngredientName.ENERGY_DRINK, Effect.ATHLETIC, new Rule[]{
                    new Rule(Effect.DISORIENTING, new Effect[]{Effect.DISORIENTING}, new Effect[]{Effect.ELECTRIFYING}),
                    new Rule(Effect.EUPHORIC, new Effect[]{Effect.EUPHORIC}, new Effect[]{Effect.ENERGIZING}),
                    new Rule(Effect.FOCUSED, new Effect[]{Effect.FOCUSED}, new Effect[]{Effect.SHRINKING}),
                    new Rule(Effect.FOGGY, new Effect[]{Effect.FOGGY}, new Effect[]{Effect.LAXATIVE}),
                    new Rule(Effect.GLOWING, new Effect[]{Effect.GLOWING}, new Effect[]{Effect.DISORIENTING}),
                    new Rule(Effect.SCHIZOPHRENIC, new Effect[]{Effect.SCHIZOPHRENIC}, new Effect[]{Effect.BALDING}),
                    new Rule(Effect.SEDATING, new Effect[]{Effect.SEDATING}, new Effect[]{Effect.MUNCHIES}),
                    new Rule(Effect.SPICY, new Effect[]{Effect.SPICY}, new Effect[]{Effect.EUPHORIC}),
                    new Rule(Effect.TROPIC_THUNDER, new Effect[]{Effect.TROPIC_THUNDER}, new Effect[]{Effect.SNEAKY}),
            }
            ),
            new Ingredient(IngredientName.MOTOR_OIL, Effect.SLIPPERY, new Rule[]{
                    new Rule(Effect.ENERGIZING, new Effect[]{Effect.ENERGIZING}, new Effect[]{Effect.MUNCHIES}),
                    new Rule(Effect.EUPHORIC, new Effect[]{Effect.EUPHORIC}, new Effect[]{Effect.SEDATING}),
                    new Rule(Effect.FOGGY, new Effect[]{Effect.FOGGY}, new Effect[]{Effect.TOXIC}),
                    new Rule(Effect.MUNCHIES, new Effect[]{Effect.MUNCHIES}, new Effect[]{Effect.SCHIZOPHRENIC}),
                    new Rule(Effect.PARANOIA, new Effect[]{Effect.PARANOIA}, new Effect[]{Effect.ANTI_GRAVITY}),
            }
            ),
            new Ingredient(IngredientName.MEGA_BEAN, Effect.FOGGY, new Rule[]{
                    new Rule(Effect.ATHLETIC, new Effect[]{Effect.ATHLETIC}, new Effect[]{Effect.LAXATIVE}),
                    new Rule(Effect.CALMING, new Effect[]{Effect.CALMING}, new Effect[]{Effect.GLOWING}),
                    new Rule(Effect.ENERGIZING, new Effect[]{Effect.ENERGIZING}, new Effect[]{Effect.CYCLOPEAN}),
                    new Rule(Effect.FOCUSED, new Effect[]{Effect.FOCUSED}, new Effect[]{Effect.DISORIENTING}),
                    new Rule(Effect.JENNERISING, new Effect[]{Effect.JENNERISING}, new Effect[]{Effect.PARANOIA}),
                    new Rule(Effect.SEIZURE_INDUCING, new Effect[]{Effect.SEIZURE_INDUCING}, new Effect[]{Effect.FOCUSED}),
                    new Rule(Effect.SHRINKING, new Effect[]{Effect.SHRINKING}, new Effect[]{Effect.ELECTRIFYING}),
                    new Rule(Effect.SLIPPERY, new Effect[]{Effect.SLIPPERY}, new Effect[]{Effect.TOXIC}),
                    new Rule(Effect.SNEAKY, new Effect[]{Effect.SNEAKY}, new Effect[]{Effect.CALMING}),
                    new Rule(Effect.THOUGHT_PROVOKING, new Effect[]{Effect.THOUGHT_PROVOKING}, new Effect[]{Effect.ENERGIZING}),
            }
            ),
            new Ingredient(IngredientName.CHILI, Effect.SPICY, new Rule[]{
                    new Rule(Effect.ANTI_GRAVITY, new Effect[]{Effect.ANTI_GRAVITY}, new Effect[]{Effect.TROPIC_THUNDER}),
                    new Rule(Effect.ATHLETIC, new Effect[]{Effect.ATHLETIC}, new Effect[]{Effect.EUPHORIC}),
                    new Rule(Effect.LAXATIVE, new Effect[]{Effect.LAXATIVE}, new Effect[]{Effect.LONG_FACED}),
                    new Rule(Effect.MUNCHIES, new Effect[]{Effect.MUNCHIES}, new Effect[]{Effect.TOXIC}),
                    new Rule(Effect.SHRINKING, new Effect[]{Effect.SHRINKING}, new Effect[]{Effect.REFRESHING}),
                    new Rule(Effect.SNEAKY, new Effect[]{Effect.SNEAKY}, new Effect[]{Effect.BRIGHT_EYED}),
            }
            ),
            new Ingredient(IngredientName.BATTERY, Effect.BRIGHT_EYED, new Rule[]{
                    new Rule(Effect.CYCLOPEAN, new Effect[]{Effect.CYCLOPEAN}, new Effect[]{Effect.GLOWING}),
                    new Rule(Effect.ELECTRIFYING, new Effect[]{Effect.ELECTRIFYING}, new Effect[]{Effect.EUPHORIC}),
                    new Rule(Effect.EUPHORIC, new Effect[]{Effect.EUPHORIC}, new Effect[]{Effect.ZOMBIFYING}),
                    new Rule(Effect.LAXATIVE, new Effect[]{Effect.LAXATIVE}, new Effect[]{Effect.CALORIE_DENSE}),
                    new Rule(Effect.MUNCHIES, new Effect[]{Effect.MUNCHIES}, new Effect[]{Effect.TROPIC_THUNDER}),
                    new Rule(Effect.SHRINKING, new Effect[]{Effect.SHRINKING}, new Effect[]{Effect.MUNCHIES}),
            }
            ),
            new Ingredient(IngredientName.IODINE, Effect.JENNERISING, new Rule[]{
                    new Rule(Effect.CALMING, new Effect[]{Effect.CALMING}, new Effect[]{Effect.BALDING}),
                    new Rule(Effect.CALORIE_DENSE, new Effect[]{Effect.CALORIE_DENSE}, new Effect[]{Effect.GINGERITIS}),
                    new Rule(Effect.EUPHORIC, new Effect[]{Effect.EUPHORIC}, new Effect[]{Effect.SEIZURE_INDUCING}),
                    new Rule(Effect.FOGGY, new Effect[]{Effect.FOGGY}, new Effect[]{Effect.PARANOIA}),
                    new Rule(Effect.REFRESHING, new Effect[]{Effect.REFRESHING}, new Effect[]{Effect.THOUGHT_PROVOKING}),
                    new Rule(Effect.TOXIC, new Effect[]{Effect.TOXIC}, new Effect[]{Effect.SNEAKY}),
            }
            ),
            new Ingredient(IngredientName.ADDY, Effect.THOUGHT_PROVOKING, new Rule[]{
                    new Rule(Effect.EXPLOSIVE, new Effect[]{Effect.EXPLOSIVE}, new Effect[]{Effect.EUPHORIC}),
                    new Rule(Effect.FOGGY, new Effect[]{Effect.FOGGY}, new Effect[]{Effect.ENERGIZING}),
                    new Rule(Effect.GLOWING, new Effect[]{Effect.GLOWING}, new Effect[]{Effect.REFRESHING}),
                    new Rule(Effect.LONG_FACED, new Effect[]{Effect.LONG_FACED}, new Effect[]{Effect.ELECTRIFYING}),
                    new Rule(Effect.SEDATING, new Effect[]{Effect.SEDATING}, new Effect[]{Effect.GINGERITIS}),
            }
            ),
            new Ingredient(IngredientName.HORSE_SEMEN, Effect.LONG_FACED, new Rule[]{
                    new Rule(Effect.ANTI_GRAVITY, new Effect[]{Effect.ANTI_GRAVITY}, new Effect[]{Effect.CALMING}),
                    new Rule(Effect.GINGERITIS, new Effect[]{Effect.GINGERITIS}, new Effect[]{Effect.REFRESHING}),
                    new Rule(Effect.SEIZURE_INDUCING, new Effect[]{Effect.SEIZURE_INDUCING}, new Effect[]{Effect.ENERGIZING}),
                    new Rule(Effect.THOUGHT_PROVOKING, new Effect[]{Effect.THOUGHT_PROVOKING}, new Effect[]{Effect.ELECTRIFYING}),
            }
            ),
    };
}
