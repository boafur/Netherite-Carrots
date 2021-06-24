package me.boa.netheritecarrots.registry;

import me.boa.netheritecarrots.NetheriteCarrots;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;


public class ModItems {

    static int absorptionDuration = NetheriteCarrots.CONFIG.SETTINGS.absorptionDuration;
    static int absorptionAmplifer = NetheriteCarrots.CONFIG.SETTINGS.absorptionAmplifer;
    static int FireResistanceDuration = NetheriteCarrots.CONFIG.SETTINGS.fireResistanceDuration;
    static int FireResistanceAmplifer = NetheriteCarrots.CONFIG.SETTINGS.fireResistanceAmplifer;
    static int ResistanceDuration = NetheriteCarrots.CONFIG.SETTINGS.resistanceDuration;
    static int ResistanceAmplifer = NetheriteCarrots.CONFIG.SETTINGS.resistanceAmplifer;
    static int RegenerationDuration = NetheriteCarrots.CONFIG.SETTINGS.regenerationDuration;
    static int RegenerationAmplifer = NetheriteCarrots.CONFIG.SETTINGS.regenerationAmplifer;

    // Items
    public static final Item NETHERITE_NUGGET = new Item(new Item.Settings().group(NetheriteCarrots.ITEM_GROUP).fireproof());
    public static final Item NETHERITE_CARROT = new Item(new Item.Settings().group(NetheriteCarrots.ITEM_GROUP).fireproof().rarity(Rarity.RARE).food(
            new FoodComponent.Builder()
                    .hunger(8)
                    .saturationModifier(16.6f)
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, FireResistanceDuration*20, FireResistanceAmplifer, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, ResistanceDuration*20, ResistanceAmplifer, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, RegenerationDuration*20, RegenerationAmplifer), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, absorptionDuration*20, absorptionAmplifer, true, false), 1)
                    .build())
    );

    public static void registerItems() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(NetheriteCarrots.MOD_ID, "netherite_nugget"), NETHERITE_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(NetheriteCarrots.MOD_ID, "netherite_carrot"), NETHERITE_CARROT);
    }
}
