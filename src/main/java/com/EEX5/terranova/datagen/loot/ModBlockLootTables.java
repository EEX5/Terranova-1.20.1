package com.EEX5.terranova.datagen.loot;

import com.EEX5.terranova.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
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
        this.dropSelf(ModBlocks.TEST_WALL.get());
        this.dropSelf(ModBlocks.TEST_FENCE.get());
        this.dropSelf(ModBlocks.TEST_FENCE_GATE.get());
        this.dropSelf(ModBlocks.TEST_WALL.get());
        this.dropSelf(ModBlocks.TEST_TRAP_DOOR.get());
        this.dropSelf(ModBlocks.TEST_BARS.get());
        this.dropSelf(ModBlocks.TEST_SLAB.get());
        this.dropSelf(ModBlocks.TEST_BUTTON.get());
        this.dropSelf(ModBlocks.TEST_PRESSURE_PLATE.get());


        this.add(ModBlocks.TEST_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TEST_SLAB.get()));
        this.add(ModBlocks.TEST_DOOR.get(),
                block -> createDoorTable(ModBlocks.TEST_DOOR.get()));

        //Oak

    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
