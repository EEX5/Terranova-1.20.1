package com.EEX5.terranova.util;

import com.EEX5.terranova.Terranova;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INFESTABLE = tag("infestable");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Terranova.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ARTHROPODS = tag("arthropods");

        private  static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Terranova.MOD_ID, name));
        }
    }
}
