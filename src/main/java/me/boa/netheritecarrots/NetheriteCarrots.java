package me.boa.netheritecarrots;

import me.boa.netheritecarrots.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class NetheriteCarrots implements ModInitializer {

    public static final String MOD_ID = "netheritecarrots";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "general"))
            .icon(() -> new ItemStack(ModItems.NETHERITE_CARROT))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.NETHERITE_NUGGET));
                stacks.add(new ItemStack(ModItems.NETHERITE_CARROT));
            })
            .build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
