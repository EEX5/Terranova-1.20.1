package com.EEX5.terranova.datagen;

import com.EEX5.terranova.Terranova;
import com.EEX5.terranova.block.ModBlocks;
import com.EEX5.terranova.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Terranova.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        /*
        this.tag(TAG_TYPE.TAG)
                .add(JavaClass.NAME.get()).addTag(Tags.type.tag);
         */
        this.tag(ModTags.Blocks.INFESTABLE)
                .add(ModBlocks.TEST_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TEST_BLOCK.get());

        //fences
        this.tag(BlockTags.FENCES)
                .add(ModBlocks.TEST_FENCE.get(),
                        ModBlocks.TALL_OAK_BRANCH.get(),
                        ModBlocks.TALL_BIRCH_BRANCH.get(),
                        ModBlocks.TALL_SPRUCE_BRANCH.get(),
                        ModBlocks.TALL_JUNGLE_BRANCH.get(),
                        ModBlocks.TALL_ACACIA_BRANCH.get(),
                        ModBlocks.TALL_DARK_OAK_BRANCH.get(),
                        ModBlocks.TALL_MANGROVE_BRANCH.get(),
                        ModBlocks.TALL_CHERRY_BRANCH.get());
        //fence gates
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.TEST_FENCE_GATE.get(),
                        ModBlocks.MEDIUM_OAK_BRANCH.get(),
                        ModBlocks.MEDIUM_BIRCH_BRANCH.get(),
                        ModBlocks.MEDIUM_SPRUCE_BRANCH.get(),
                        ModBlocks.MEDIUM_JUNGLE_BRANCH.get(),
                        ModBlocks.MEDIUM_ACACIA_BRANCH.get(),
                        ModBlocks.MEDIUM_DARK_OAK_BRANCH.get(),
                        ModBlocks.MEDIUM_MANGROVE_BRANCH.get(),
                        ModBlocks.MEDIUM_CHERRY_BRANCH.get());
        
        //walls
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.TEST_WALL.get(),
                        ModBlocks.THICK_TALL_OAK_BRANCH.get(),
                        ModBlocks.THICK_TALL_BIRCH_BRANCH.get(),
                        ModBlocks.THICK_TALL_SPRUCE_BRANCH.get(),
                        ModBlocks.THICK_TALL_JUNGLE_BRANCH.get(),
                        ModBlocks.THICK_TALL_ACACIA_BRANCH.get(),
                        ModBlocks.THICK_TALL_DARK_OAK_BRANCH.get(),
                        ModBlocks.THICK_TALL_MANGROVE_BRANCH.get(),
                        ModBlocks.THICK_TALL_CHERRY_BRANCH.get());
        //axe
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.OAK_TRUNK.get(),
                        ModBlocks.WIDE_OAK_TRUNK.get(),
                        ModBlocks.OAK_BRANCH.get(),
                        ModBlocks.TALL_OAK_BRANCH.get(),
                        ModBlocks.THIN_TALL_OAK_BRANCH.get(),
                        ModBlocks.THICK_TALL_OAK_BRANCH.get(),
                        ModBlocks.MEDIUM_OAK_BRANCH.get(),
                        
                        ModBlocks.BIRCH_TRUNK.get(),
                        ModBlocks.WIDE_BIRCH_TRUNK.get(),
                        ModBlocks.BIRCH_BRANCH.get(),
                        ModBlocks.TALL_BIRCH_BRANCH.get(),
                        ModBlocks.THIN_TALL_BIRCH_BRANCH.get(),
                        ModBlocks.THICK_TALL_BIRCH_BRANCH.get(),
                        ModBlocks.MEDIUM_BIRCH_BRANCH.get(),
                        
                        ModBlocks.SPRUCE_TRUNK.get(),
                        ModBlocks.WIDE_SPRUCE_TRUNK.get(),
                        ModBlocks.SPRUCE_BRANCH.get(),
                        ModBlocks.TALL_SPRUCE_BRANCH.get(),
                        ModBlocks.THIN_TALL_SPRUCE_BRANCH.get(),
                        ModBlocks.THICK_TALL_SPRUCE_BRANCH.get(),
                        ModBlocks.MEDIUM_SPRUCE_BRANCH.get(),

                        ModBlocks.JUNGLE_TRUNK.get(),
                        ModBlocks.WIDE_JUNGLE_TRUNK.get(),
                        ModBlocks.JUNGLE_BRANCH.get(),
                        ModBlocks.TALL_JUNGLE_BRANCH.get(),
                        ModBlocks.THIN_TALL_JUNGLE_BRANCH.get(),
                        ModBlocks.THICK_TALL_JUNGLE_BRANCH.get(),
                        ModBlocks.MEDIUM_JUNGLE_BRANCH.get(),

                        ModBlocks.ACACIA_TRUNK.get(),
                        ModBlocks.WIDE_ACACIA_TRUNK.get(),
                        ModBlocks.ACACIA_BRANCH.get(),
                        ModBlocks.TALL_ACACIA_BRANCH.get(),
                        ModBlocks.THIN_TALL_ACACIA_BRANCH.get(),
                        ModBlocks.THICK_TALL_ACACIA_BRANCH.get(),
                        ModBlocks.MEDIUM_ACACIA_BRANCH.get(),

                        ModBlocks.DARK_OAK_TRUNK.get(),
                        ModBlocks.WIDE_DARK_OAK_TRUNK.get(),
                        ModBlocks.DARK_OAK_BRANCH.get(),
                        ModBlocks.TALL_DARK_OAK_BRANCH.get(),
                        ModBlocks.THIN_TALL_DARK_OAK_BRANCH.get(),
                        ModBlocks.THICK_TALL_DARK_OAK_BRANCH.get(),
                        ModBlocks.MEDIUM_DARK_OAK_BRANCH.get(),

                        ModBlocks.MANGROVE_TRUNK.get(),
                        ModBlocks.WIDE_MANGROVE_TRUNK.get(),
                        ModBlocks.MANGROVE_BRANCH.get(),
                        ModBlocks.TALL_MANGROVE_BRANCH.get(),
                        ModBlocks.THIN_TALL_MANGROVE_BRANCH.get(),
                        ModBlocks.THICK_TALL_MANGROVE_BRANCH.get(),
                        ModBlocks.MEDIUM_MANGROVE_BRANCH.get(),

                        ModBlocks.CHERRY_TRUNK.get(),
                        ModBlocks.WIDE_CHERRY_TRUNK.get(),
                        ModBlocks.CHERRY_BRANCH.get(),
                        ModBlocks.TALL_CHERRY_BRANCH.get(),
                        ModBlocks.THIN_TALL_CHERRY_BRANCH.get(),
                        ModBlocks.THICK_TALL_CHERRY_BRANCH.get(),
                        ModBlocks.MEDIUM_CHERRY_BRANCH.get());
    }
}
