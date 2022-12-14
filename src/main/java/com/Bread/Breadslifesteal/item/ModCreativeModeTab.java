package com.Bread.Breadslifesteal.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BOOM = new CreativeModeTab("boom") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.Literally_Just_An_Explosive.get());
        }
    };
}
