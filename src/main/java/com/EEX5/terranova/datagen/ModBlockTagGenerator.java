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
                .add(ModBlocks.TEST_FENCE.get());
        this.tag(BlockTags.FENCES)
                .add(ModBlocks.TALL_OAK_BRANCH.get());

        //fence gates
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.TEST_FENCE_GATE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.MEDIUM_OAK_BRANCH.get());

        //walls
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.TEST_WALL.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.THICK_TALL_OAK_BRANCH.get());

    }
}
