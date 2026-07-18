package com.EEX5.terranova.datagen.loot;

import com.EEX5.terranova.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TEST_BLOCK.get());

        this.dropSelf(ModBlocks.TEST_STAIRS.get());
        this.dropSelf(ModBlocks.TEST_FENCE.get());
        this.dropSelf(ModBlocks.TEST_FENCE_GATE.get());
        this.dropSelf(ModBlocks.TEST_WALL.get());
        this.dropSelf(ModBlocks.TEST_TRAP_DOOR.get());
        this.dropSelf(ModBlocks.TEST_BARS.get());
        this.dropSelf(ModBlocks.TEST_BUTTON.get());
        this.dropSelf(ModBlocks.TEST_PRESSURE_PLATE.get());

        this.add(ModBlocks.TEST_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TEST_SLAB.get()));
        this.add(ModBlocks.TEST_DOOR.get(),
                block -> createDoorTable(ModBlocks.TEST_DOOR.get()));

        //Oak
        this.dropOther(ModBlocks.OAK_TRUNK.get(), Blocks.OAK_LOG);
        this.dropOther(ModBlocks.WIDE_OAK_TRUNK.get(), Blocks.OAK_LOG);
        this.dropOther(ModBlocks.TALL_OAK_BRANCH.get(), Blocks.OAK_LOG);
        this.dropOther(ModBlocks.MEDIUM_OAK_BRANCH.get(), Blocks.OAK_LOG);
        this.dropOther(ModBlocks.THICK_TALL_OAK_BRANCH.get(), Blocks.OAK_LOG);
        this.dropOther(ModBlocks.OAK_BRANCH.get(), Blocks.OAK_LOG);
        this.dropOther(ModBlocks.THIN_TALL_OAK_BRANCH.get(), Blocks.OAK_LOG);
        //Birch
        this.dropOther(ModBlocks.BIRCH_TRUNK.get(), Blocks.BIRCH_LOG);
        this.dropOther(ModBlocks.WIDE_BIRCH_TRUNK.get(), Blocks.BIRCH_LOG);
        this.dropOther(ModBlocks.TALL_BIRCH_BRANCH.get(), Blocks.BIRCH_LOG);
        this.dropOther(ModBlocks.MEDIUM_BIRCH_BRANCH.get(), Blocks.BIRCH_LOG);
        this.dropOther(ModBlocks.THICK_TALL_BIRCH_BRANCH.get(), Blocks.BIRCH_LOG);
        this.dropOther(ModBlocks.BIRCH_BRANCH.get(), Blocks.BIRCH_LOG);
        this.dropOther(ModBlocks.THIN_TALL_BIRCH_BRANCH.get(), Blocks.BIRCH_LOG);
        //Spruce
        this.dropOther(ModBlocks.SPRUCE_TRUNK.get(), Blocks.SPRUCE_LOG);
        this.dropOther(ModBlocks.WIDE_SPRUCE_TRUNK.get(), Blocks.SPRUCE_LOG);
        this.dropOther(ModBlocks.TALL_SPRUCE_BRANCH.get(), Blocks.SPRUCE_LOG);
        this.dropOther(ModBlocks.MEDIUM_SPRUCE_BRANCH.get(), Blocks.SPRUCE_LOG);
        this.dropOther(ModBlocks.THICK_TALL_SPRUCE_BRANCH.get(), Blocks.SPRUCE_LOG);
        this.dropOther(ModBlocks.SPRUCE_BRANCH.get(), Blocks.SPRUCE_LOG);
        this.dropOther(ModBlocks.THIN_TALL_SPRUCE_BRANCH.get(), Blocks.SPRUCE_LOG);
        //Jungle
        this.dropOther(ModBlocks.JUNGLE_TRUNK.get(), Blocks.JUNGLE_LOG);
        this.dropOther(ModBlocks.WIDE_JUNGLE_TRUNK.get(), Blocks.JUNGLE_LOG);
        this.dropOther(ModBlocks.TALL_JUNGLE_BRANCH.get(), Blocks.JUNGLE_LOG);
        this.dropOther(ModBlocks.MEDIUM_JUNGLE_BRANCH.get(), Blocks.JUNGLE_LOG);
        this.dropOther(ModBlocks.THICK_TALL_JUNGLE_BRANCH.get(), Blocks.JUNGLE_LOG);
        this.dropOther(ModBlocks.JUNGLE_BRANCH.get(), Blocks.JUNGLE_LOG);
        this.dropOther(ModBlocks.THIN_TALL_JUNGLE_BRANCH.get(), Blocks.JUNGLE_LOG);
        //Acacia
        this.dropOther(ModBlocks.ACACIA_TRUNK.get(), Blocks.ACACIA_LOG);
        this.dropOther(ModBlocks.WIDE_ACACIA_TRUNK.get(), Blocks.ACACIA_LOG);
        this.dropOther(ModBlocks.TALL_ACACIA_BRANCH.get(), Blocks.ACACIA_LOG);
        this.dropOther(ModBlocks.MEDIUM_ACACIA_BRANCH.get(), Blocks.ACACIA_LOG);
        this.dropOther(ModBlocks.THICK_TALL_ACACIA_BRANCH.get(), Blocks.ACACIA_LOG);
        this.dropOther(ModBlocks.ACACIA_BRANCH.get(), Blocks.ACACIA_LOG);
        this.dropOther(ModBlocks.THIN_TALL_ACACIA_BRANCH.get(), Blocks.ACACIA_LOG);
        //Dark Oak
        this.dropOther(ModBlocks.DARK_OAK_TRUNK.get(), Blocks.DARK_OAK_LOG);
        this.dropOther(ModBlocks.WIDE_DARK_OAK_TRUNK.get(), Blocks.DARK_OAK_LOG);
        this.dropOther(ModBlocks.TALL_DARK_OAK_BRANCH.get(), Blocks.DARK_OAK_LOG);
        this.dropOther(ModBlocks.MEDIUM_DARK_OAK_BRANCH.get(), Blocks.DARK_OAK_LOG);
        this.dropOther(ModBlocks.THICK_TALL_DARK_OAK_BRANCH.get(), Blocks.DARK_OAK_LOG);
        this.dropOther(ModBlocks.DARK_OAK_BRANCH.get(), Blocks.DARK_OAK_LOG);
        this.dropOther(ModBlocks.THIN_TALL_DARK_OAK_BRANCH.get(), Blocks.DARK_OAK_LOG);
        //Mangrove
        this.dropOther(ModBlocks.MANGROVE_TRUNK.get(), Blocks.MANGROVE_LOG);
        this.dropOther(ModBlocks.WIDE_MANGROVE_TRUNK.get(), Blocks.MANGROVE_LOG);
        this.dropOther(ModBlocks.TALL_MANGROVE_BRANCH.get(), Blocks.MANGROVE_LOG);
        this.dropOther(ModBlocks.MEDIUM_MANGROVE_BRANCH.get(), Blocks.MANGROVE_LOG);
        this.dropOther(ModBlocks.THICK_TALL_MANGROVE_BRANCH.get(), Blocks.MANGROVE_LOG);
        this.dropOther(ModBlocks.MANGROVE_BRANCH.get(), Blocks.MANGROVE_LOG);
        this.dropOther(ModBlocks.THIN_TALL_MANGROVE_BRANCH.get(), Blocks.MANGROVE_LOG);
        //Cherry
        this.dropOther(ModBlocks.CHERRY_TRUNK.get(), Blocks.CHERRY_LOG);
        this.dropOther(ModBlocks.WIDE_CHERRY_TRUNK.get(), Blocks.CHERRY_LOG);
        this.dropOther(ModBlocks.TALL_CHERRY_BRANCH.get(), Blocks.CHERRY_LOG);
        this.dropOther(ModBlocks.MEDIUM_CHERRY_BRANCH.get(), Blocks.CHERRY_LOG);
        this.dropOther(ModBlocks.THICK_TALL_CHERRY_BRANCH.get(), Blocks.CHERRY_LOG);
        this.dropOther(ModBlocks.CHERRY_BRANCH.get(), Blocks.CHERRY_LOG);
        this.dropOther(ModBlocks.THIN_TALL_CHERRY_BRANCH.get(), Blocks.CHERRY_LOG);

    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
