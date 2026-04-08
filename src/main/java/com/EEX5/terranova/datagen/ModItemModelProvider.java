package com.EEX5.terranova.datagen;

import com.EEX5.terranova.Terranova;
import com.EEX5.terranova.block.ModBlocks;
import com.EEX5.terranova.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Terranova.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.Aphid);
        simpleItem(ModItems.Ash_Weevil);
        simpleItem(ModItems.Bark_Beetle);
        simpleItem(ModItems.Bloodworm);
        simpleItem(ModItems.Cabbage_Moth);
        simpleItem(ModItems.Cabbage_Moth_Larva);
        simpleItem(ModItems.Cave_Cricket);
        simpleItem(ModItems.Carpenter_Ant);
        simpleItem(ModItems.Centipede);
        simpleItem(ModItems.Diving_Beetle);
        simpleItem(ModItems.Dragonfly);
        simpleItem(ModItems.Dragonfly_Larva);
        simpleItem(ModItems.Dung_Beetle);
        simpleItem(ModItems.Earthworm);
        simpleItem(ModItems.Earwig);
        simpleItem(ModItems.Ember_Mite);
        simpleItem(ModItems.Firefly);
        simpleItem(ModItems.Flea_Beetle);
        simpleItem(ModItems.Fungus_Gnat);
        simpleItem(ModItems.Fungus_Gnat_Larva);
        simpleItem(ModItems.Ground_Beetle);
        simpleItem(ModItems.Lacewig);
        simpleItem(ModItems.Leafcutter_Ant);
        simpleItem(ModItems.Longhorn_Beetle);
        simpleItem(ModItems.Pseudoscorpion);
        simpleItem(ModItems.Scuttle_Fly);
        simpleItem(ModItems.Silverfish_Larva);
        simpleItem(ModItems.Stag_Beetle);
        simpleItem(ModItems.Stick_Insect);
        simpleItem(ModItems.Termite);
        simpleItem(ModItems.Water_Strider);
        simpleItem(ModItems.Weevil);
        simpleItem(ModItems.Whitefly);
        simpleItem(ModItems.Wireworm);
        simpleItem(ModItems.Woodlouse);

        simpleBlockItem(ModBlocks.TEST_DOOR);
        simpleBlockItem(ModBlocks.TEST_BARS);

        fenceItem(ModBlocks.TEST_FENCE, ModBlocks.TEST_BLOCK);
        buttonItem(ModBlocks.TEST_BUTTON, ModBlocks.TEST_BLOCK);
        wallItem(ModBlocks.TEST_WALL, ModBlocks.TEST_BLOCK);

        evenSimplierBlockItem(ModBlocks.TEST_STAIRS);
        evenSimplierBlockItem(ModBlocks.TEST_SLAB);
        evenSimplierBlockItem(ModBlocks.TEST_PRESSURE_PLATE);
        evenSimplierBlockItem(ModBlocks.TEST_FENCE_GATE);

        trapdoorItem(ModBlocks.TEST_TRAP_DOOR);

        //oak
        simpleBlockItem(ModBlocks.THIN_TALL_OAK_BRANCH);

        VfenceItem(ModBlocks.TALL_OAK_BRANCH, Blocks.OAK_LOG);
        VwallItem(ModBlocks.THICK_TALL_OAK_BRANCH, Blocks.OAK_LOG);

        evenSimplierBlockItem(ModBlocks.OAK_TRUNK);
        evenSimplierBlockItem(ModBlocks.WIDE_OAK_TRUNK);
        evenSimplierBlockItem(ModBlocks.MEDIUM_OAK_BRANCH);

        trapdoorItem(ModBlocks.OAK_BRANCH);
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Terranova.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplierBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Terranova.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(Terranova.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void VfenceItem(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(Terranova.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(Terranova.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void VwallItem(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Terranova.MOD_ID,"item/" + item.getId().getPath()));
    }


}
