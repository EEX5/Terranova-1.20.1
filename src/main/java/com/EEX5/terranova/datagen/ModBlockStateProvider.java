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
        stairsBlock(((StairBlock) ModBlocks.OAK_TRUNK.get()), blockTexture(Blocks.OAK_WOOD));
        slabBlock(((SlabBlock) ModBlocks.WIDE_OAK_TRUNK.get()), blockTexture(Blocks.OAK_WOOD), blockTexture(Blocks.OAK_WOOD));
        wallBlock(((WallBlock) ModBlocks.THICK_TALL_OAK_BRANCH.get()), blockTexture(Blocks.OAK_WOOD));
        fenceBlock(((FenceBlock) ModBlocks.TALL_OAK_BRANCH.get()), blockTexture(Blocks.OAK_WOOD));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MEDIUM_OAK_BRANCH.get()), blockTexture(Blocks.OAK_WOOD));
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.OAK_BRANCH.get()), modLoc("block/test_trapdoor"), true, "cutout");
        paneBlock(((IronBarsBlock) ModBlocks.THIN_TALL_OAK_BRANCH.get()), blockTexture(Blocks.OAK_WOOD), blockTexture(Blocks.OAK_WOOD));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
