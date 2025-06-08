package com.touchcreator.coolnewitems.item;

import com.touchcreator.coolnewitems.TouchsCoolNewItems;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TouchsCoolNewItems.MOD_ID);

    // my items

    public static final DeferredItem<Item> ANTIMONY = ITEMS.register("antimony",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANTIMONY_DUST = ITEMS.register("antimony_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ANTIMONY = ITEMS.register("raw_antimony",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
