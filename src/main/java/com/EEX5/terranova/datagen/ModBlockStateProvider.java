package com.EEX5.terranova.datagen;

import com.EEX5.terranova.Terranova;
import com.EEX5.terranova.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Terranova.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //test
        blockWithItem(ModBlocks.TEST_BLOCK);
        
        stairsBlock(((StairBlock) ModBlocks.TEST_STAIRS.get()), blockTexture(ModBlocks.TEST_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.TEST_SLAB.get()), blockTexture(ModBlocks.TEST_BLOCK.get()), blockTexture(ModBlocks.TEST_BLOCK.get()));

        wallBlock(((WallBlock) ModBlocks.TEST_WALL.get()), blockTexture(ModBlocks.TEST_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.TEST_FENCE.get()), blockTexture(ModBlocks.TEST_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.TEST_FENCE_GATE.get()), blockTexture(ModBlocks.TEST_BLOCK.get()));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.TEST_TRAP_DOOR.get()), modLoc("block/test_trapdoor"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.TEST_BARS.get()), blockTexture(ModBlocks.TEST_BLOCK.get()), blockTexture(ModBlocks.TEST_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.TEST_DOOR.get()), modLoc("block/test_door_bottom"), modLoc("block/test_door_top"),"cutout");
        buttonBlock(((ButtonBlock) ModBlocks.TEST_BUTTON.get()), blockTexture(ModBlocks.TEST_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.TEST_PRESSURE_PLATE.get()), blockTexture(ModBlocks.TEST_BLOCK.get()));

        //oak
        stairsBlock(((StairBlock) ModBlocks.OAK_TRUNK.get()), blockTexture(Blocks.OAK_LOG));
        slabBlock(((SlabBlock) ModBlocks.WIDE_OAK_TRUNK.get()), blockTexture(Blocks.OAK_LOG), blockTexture(Blocks.OAK_LOG));
        wallBlock(((WallBlock) ModBlocks.THICK_TALL_OAK_BRANCH.get()), blockTexture(Blocks.OAK_LOG));
        fenceBlock(((FenceBlock) ModBlocks.TALL_OAK_BRANCH.get()), blockTexture(Blocks.OAK_LOG));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MEDIUM_OAK_BRANCH.get()), blockTexture(Blocks.OAK_LOG));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.OAK_BRANCH.get()), mcLoc("block/oak_log"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.THIN_TALL_OAK_BRANCH.get()), blockTexture(Blocks.OAK_LOG), blockTexture(Blocks.OAK_LOG));
        //birch
        stairsBlock(((StairBlock) ModBlocks.BIRCH_TRUNK.get()), blockTexture(Blocks.BIRCH_LOG));
        slabBlock(((SlabBlock) ModBlocks.WIDE_BIRCH_TRUNK.get()), blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LOG));
        wallBlock(((WallBlock) ModBlocks.THICK_TALL_BIRCH_BRANCH.get()), blockTexture(Blocks.BIRCH_LOG));
        fenceBlock(((FenceBlock) ModBlocks.TALL_BIRCH_BRANCH.get()), blockTexture(Blocks.BIRCH_LOG));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MEDIUM_BIRCH_BRANCH.get()), blockTexture(Blocks.BIRCH_LOG));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.BIRCH_BRANCH.get()), mcLoc("block/birch_log"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.THIN_TALL_BIRCH_BRANCH.get()), blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LOG));
        //spruce
        stairsBlock(((StairBlock) ModBlocks.SPRUCE_TRUNK.get()), blockTexture(Blocks.SPRUCE_LOG));
        slabBlock(((SlabBlock) ModBlocks.WIDE_SPRUCE_TRUNK.get()), blockTexture(Blocks.SPRUCE_LOG), blockTexture(Blocks.SPRUCE_LOG));
        wallBlock(((WallBlock) ModBlocks.THICK_TALL_SPRUCE_BRANCH.get()), blockTexture(Blocks.SPRUCE_LOG));
        fenceBlock(((FenceBlock) ModBlocks.TALL_SPRUCE_BRANCH.get()), blockTexture(Blocks.SPRUCE_LOG));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MEDIUM_SPRUCE_BRANCH.get()), blockTexture(Blocks.SPRUCE_LOG));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SPRUCE_BRANCH.get()), mcLoc("block/spruce_log"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.THIN_TALL_SPRUCE_BRANCH.get()), blockTexture(Blocks.SPRUCE_LOG), blockTexture(Blocks.SPRUCE_LOG));
        //jungle
        stairsBlock(((StairBlock) ModBlocks.JUNGLE_TRUNK.get()), blockTexture(Blocks.JUNGLE_LOG));
        slabBlock(((SlabBlock) ModBlocks.WIDE_JUNGLE_TRUNK.get()), blockTexture(Blocks.JUNGLE_LOG), blockTexture(Blocks.JUNGLE_LOG));
        wallBlock(((WallBlock) ModBlocks.THICK_TALL_JUNGLE_BRANCH.get()), blockTexture(Blocks.JUNGLE_LOG));
        fenceBlock(((FenceBlock) ModBlocks.TALL_JUNGLE_BRANCH.get()), blockTexture(Blocks.JUNGLE_LOG));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MEDIUM_JUNGLE_BRANCH.get()), blockTexture(Blocks.JUNGLE_LOG));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.JUNGLE_BRANCH.get()), mcLoc("block/jungle_log"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.THIN_TALL_JUNGLE_BRANCH.get()), blockTexture(Blocks.JUNGLE_LOG), blockTexture(Blocks.JUNGLE_LOG));
        //acacia
        stairsBlock(((StairBlock) ModBlocks.ACACIA_TRUNK.get()), blockTexture(Blocks.ACACIA_LOG));
        slabBlock(((SlabBlock) ModBlocks.WIDE_ACACIA_TRUNK.get()), blockTexture(Blocks.ACACIA_LOG), blockTexture(Blocks.ACACIA_LOG));
        wallBlock(((WallBlock) ModBlocks.THICK_TALL_ACACIA_BRANCH.get()), blockTexture(Blocks.ACACIA_LOG));
        fenceBlock(((FenceBlock) ModBlocks.TALL_ACACIA_BRANCH.get()), blockTexture(Blocks.ACACIA_LOG));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MEDIUM_ACACIA_BRANCH.get()), blockTexture(Blocks.ACACIA_LOG));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ACACIA_BRANCH.get()), mcLoc("block/acacia_log"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.THIN_TALL_ACACIA_BRANCH.get()), blockTexture(Blocks.ACACIA_LOG), blockTexture(Blocks.ACACIA_LOG));
        //dark oak
        stairsBlock(((StairBlock) ModBlocks.DARK_OAK_TRUNK.get()), blockTexture(Blocks.DARK_OAK_LOG));
        slabBlock(((SlabBlock) ModBlocks.WIDE_DARK_OAK_TRUNK.get()), blockTexture(Blocks.DARK_OAK_LOG), blockTexture(Blocks.DARK_OAK_LOG));
        wallBlock(((WallBlock) ModBlocks.THICK_TALL_DARK_OAK_BRANCH.get()), blockTexture(Blocks.DARK_OAK_LOG));
        fenceBlock(((FenceBlock) ModBlocks.TALL_DARK_OAK_BRANCH.get()), blockTexture(Blocks.DARK_OAK_LOG));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MEDIUM_DARK_OAK_BRANCH.get()), blockTexture(Blocks.DARK_OAK_LOG));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.DARK_OAK_BRANCH.get()), mcLoc("block/dark_oak_log"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.THIN_TALL_DARK_OAK_BRANCH.get()), blockTexture(Blocks.DARK_OAK_LOG), blockTexture(Blocks.DARK_OAK_LOG));
        //mangrove
        stairsBlock(((StairBlock) ModBlocks.MANGROVE_TRUNK.get()), blockTexture(Blocks.MANGROVE_LOG));
        slabBlock(((SlabBlock) ModBlocks.WIDE_MANGROVE_TRUNK.get()), blockTexture(Blocks.MANGROVE_LOG), blockTexture(Blocks.MANGROVE_LOG));
        wallBlock(((WallBlock) ModBlocks.THICK_TALL_MANGROVE_BRANCH.get()), blockTexture(Blocks.MANGROVE_LOG));
        fenceBlock(((FenceBlock) ModBlocks.TALL_MANGROVE_BRANCH.get()), blockTexture(Blocks.MANGROVE_LOG));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MEDIUM_MANGROVE_BRANCH.get()), blockTexture(Blocks.MANGROVE_LOG));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.MANGROVE_BRANCH.get()), mcLoc("block/mangrove_log"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.THIN_TALL_MANGROVE_BRANCH.get()), blockTexture(Blocks.MANGROVE_LOG), blockTexture(Blocks.MANGROVE_LOG));
        //cherry
        stairsBlock(((StairBlock) ModBlocks.CHERRY_TRUNK.get()), blockTexture(Blocks.CHERRY_LOG));
        slabBlock(((SlabBlock) ModBlocks.WIDE_CHERRY_TRUNK.get()), blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG));
        wallBlock(((WallBlock) ModBlocks.THICK_TALL_CHERRY_BRANCH.get()), blockTexture(Blocks.CHERRY_LOG));
        fenceBlock(((FenceBlock) ModBlocks.TALL_CHERRY_BRANCH.get()), blockTexture(Blocks.CHERRY_LOG));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MEDIUM_CHERRY_BRANCH.get()), blockTexture(Blocks.CHERRY_LOG));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CHERRY_BRANCH.get()), mcLoc("block/cherry_log"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.THIN_TALL_CHERRY_BRANCH.get()), blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
