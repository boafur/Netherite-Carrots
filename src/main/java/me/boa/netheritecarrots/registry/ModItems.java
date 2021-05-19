package me.boa.netheritecarrots.registry;

import me.boa.netheritecarrots.NetheriteCarrots;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    // Items
    public static final Item NETHERITE_NUGGET = new Item(new Item.Settings().group(NetheriteCarrots.ITEM_GROUP).fireproof());
    public static final Item NETHERITE_CARROT = new Item(new Item.Settings().group(NetheriteCarrots.ITEM_GROUP).fireproof().food(
            new FoodComponent.Builder()
                    .hunger(8)
                    .saturationModifier(16.6f)
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*300, 0, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*292, 1, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*90, 0), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*1639, 1, true, false), 1)
                    .build())
    );
    public static final Item REDSTONE_COOKIE = new Item(new Item.Settings().group(NetheriteCarrots.ITEM_GROUP).fireproof().food(
            new FoodComponent.Builder()
                    .hunger(20)
                    .saturationModifier(40.0f)
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*600, 0, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*600, 1, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*120, 2, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20*1639, 2, true, false), 1)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*1639, 1, true, false), 1)
                    .build()
    ));

    public static void registerItems() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(NetheriteCarrots.MOD_ID, "netherite_nugget"), NETHERITE_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(NetheriteCarrots.MOD_ID, "netherite_carrot"), NETHERITE_CARROT);
        Registry.register(Registry.ITEM, new Identifier(NetheriteCarrots.MOD_ID, "redstone_cookie"), REDSTONE_COOKIE);
    }
}
