package com.touchcreator.coolnewitems.item;

import com.touchcreator.coolnewitems.TouchsCoolNewItems;
import com.touchcreator.coolnewitems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TouchsCoolNewItems.MOD_ID);

    public static final Supplier<CreativeModeTab> TOUCH_ITEMS_TAB = CREATIVE_MODE_TAB.register("touch_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ANTIMONY.get()))
                    .title(Component.translatable("creativetab.touchscoolnewitems.touch_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_ANTIMONY);
                        output.accept(ModItems.ANTIMONY);
                        output.accept(ModItems.ANTIMONY_DUST);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> TOUCH_BLOCKS_TAB = CREATIVE_MODE_TAB.register("touch_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.ANTIMONY_ORE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TouchsCoolNewItems.MOD_ID, "touch_items_tab"))
                    .title(Component.translatable("creativetab.touchscoolnewitems.touch_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ANTIMONY_ORE);
                    })
                    .build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TAB.register(eventbus);
    }
}
