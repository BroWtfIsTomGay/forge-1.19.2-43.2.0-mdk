package com.Bread.Breadslifesteal.item;

import com.Bread.Breadslifesteal.Breadslifesteal;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Breadslifesteal.MOD_ID);

    public static final RegistryObject<Item> Literally_Just_An_Explosive = ITEMS.register("literally_just_an_explosive",
        () -> new Item(new Item.Properties().stacksTo(69).tab(ModCreativeModeTab.BOOM)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
