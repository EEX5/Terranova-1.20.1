package com.EEX5.terranova.item;

import com.EEX5.terranova.Terranova;
import com.EEX5.terranova.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Terranova.MOD_ID);

    /*
    public static final RegistryObject<CreativeModeTab> EXAMPLE = CREATIVE_MODE_TABS.register("example_name",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Example_Item.get()))
                    .title(Component.translatable("creativetab.example_name"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Example_Item1.get());
                        output.accept(ModItems.Example_Item2.get());
                    })
                    .build());
     */
    public static final RegistryObject<CreativeModeTab> INSECTS = CREATIVE_MODE_TABS.register("insects",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Termite.get()))
                    .title(Component.translatable("creativetab.insects"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Aphid.get());
                        output.accept(ModItems.Ash_Weevil.get());
                        output.accept(ModItems.Bark_Beetle.get());
                        output.accept(ModItems.Bloodworm.get());
                        output.accept(ModItems.Cabbage_Moth.get());
                        output.accept(ModItems.Cabbage_Moth_Larva.get());
                        output.accept(ModItems.Carpenter_Ant.get());
                        output.accept(ModItems.Cave_Cricket.get());
                        output.accept(ModItems.Centipede.get());
                        output.accept(ModItems.Diving_Beetle.get());
                        output.accept(ModItems.Dragonfly.get());
                        output.accept(ModItems.Dragonfly_Larva.get());
                        output.accept(ModItems.Dung_Beetle.get());
                        output.accept(ModItems.Earthworm.get());
                        output.accept(ModItems.Earwig.get());
                        output.accept(ModItems.Ember_Mite.get());
                        output.accept(ModItems.Firefly.get());
                        output.accept(ModItems.Flea_Beetle.get());
                        output.accept(ModItems.Fungus_Gnat.get());
                        output.accept(ModItems.Fungus_Gnat_Larva.get());
                        output.accept(ModItems.Ground_Beetle.get());
                        output.accept(ModItems.Lacewig.get());
                        output.accept(ModItems.Leafcutter_Ant.get());
                        output.accept(ModItems.Longhorn_Beetle.get());
                        output.accept(ModItems.Pseudoscorpion.get());
                        output.accept(ModItems.Scuttle_Fly.get());
                        output.accept(ModItems.Silverfish_Larva.get());
                        output.accept(ModItems.Stag_Beetle.get());
                        output.accept(ModItems.Stick_Insect.get());
                        output.accept(ModItems.Termite.get());
                        output.accept(ModItems.Water_Strider.get());
                        output.accept(ModItems.Weevil.get());
                        output.accept(ModItems.Whitefly.get());
                        output.accept(ModItems.Wireworm.get());
                        output.accept(ModItems.Woodlouse.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> WOOD_BLOCKS = CREATIVE_MODE_TABS.register("wood_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OAK_TRUNK.get()))
                    .title(Component.translatable("creativetab.wood_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        /*
                        output.accept(ModBlocks.TEST_BLOCK.get());
                        output.accept(ModBlocks.TEST_STAIRS.get());
                        output.accept(ModBlocks.TEST_SLAB.get());
                        output.accept(ModBlocks.TEST_WALL.get());
                        output.accept(ModBlocks.TEST_FENCE.get());
                        output.accept(ModBlocks.TEST_BARS.get());
                        output.accept(ModBlocks.TEST_FENCE_GATE.get());
                        output.accept(ModBlocks.TEST_BUTTON.get());
                        output.accept(ModBlocks.TEST_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.TEST_TRAP_DOOR.get());
                        output.accept(ModBlocks.TEST_DOOR.get());
                         */
                        //oak
                        output.accept(ModBlocks.OAK_TRUNK.get());
                        output.accept(ModBlocks.WIDE_OAK_TRUNK.get());
                        output.accept(ModBlocks.THICK_TALL_OAK_BRANCH.get());
                        output.accept(ModBlocks.TALL_OAK_BRANCH.get());
                        output.accept(ModBlocks.THIN_TALL_OAK_BRANCH.get());
                        output.accept(ModBlocks.MEDIUM_OAK_BRANCH.get());
                        output.accept(ModBlocks.OAK_BRANCH.get());
                        output.accept(Blocks.OAK_LOG);
                        output.accept(Blocks.OAK_WOOD);
                        //birch
                        output.accept(ModBlocks.BIRCH_TRUNK.get());
                        output.accept(ModBlocks.WIDE_BIRCH_TRUNK.get());
                        output.accept(ModBlocks.THICK_TALL_BIRCH_BRANCH.get());
                        output.accept(ModBlocks.TALL_BIRCH_BRANCH.get());
                        output.accept(ModBlocks.THIN_TALL_BIRCH_BRANCH.get());
                        output.accept(ModBlocks.MEDIUM_BIRCH_BRANCH.get());
                        output.accept(ModBlocks.BIRCH_BRANCH.get());
                        output.accept(Blocks.BIRCH_LOG);
                        output.accept(Blocks.BIRCH_WOOD);
                        //spruce
                        output.accept(ModBlocks.SPRUCE_TRUNK.get());
                        output.accept(ModBlocks.WIDE_SPRUCE_TRUNK.get());
                        output.accept(ModBlocks.THICK_TALL_SPRUCE_BRANCH.get());
                        output.accept(ModBlocks.TALL_SPRUCE_BRANCH.get());
                        output.accept(ModBlocks.THIN_TALL_SPRUCE_BRANCH.get());
                        output.accept(ModBlocks.MEDIUM_SPRUCE_BRANCH.get());
                        output.accept(ModBlocks.SPRUCE_BRANCH.get());
                        output.accept(Blocks.SPRUCE_LOG);
                        output.accept(Blocks.SPRUCE_WOOD);
                        //jungle
                        output.accept(ModBlocks.JUNGLE_TRUNK.get());
                        output.accept(ModBlocks.WIDE_JUNGLE_TRUNK.get());
                        output.accept(ModBlocks.THICK_TALL_JUNGLE_BRANCH.get());
                        output.accept(ModBlocks.TALL_JUNGLE_BRANCH.get());
                        output.accept(ModBlocks.THIN_TALL_JUNGLE_BRANCH.get());
                        output.accept(ModBlocks.MEDIUM_JUNGLE_BRANCH.get());
                        output.accept(ModBlocks.JUNGLE_BRANCH.get());
                        output.accept(Blocks.JUNGLE_LOG);
                        output.accept(Blocks.JUNGLE_WOOD);
                        //acacia
                        output.accept(ModBlocks.ACACIA_TRUNK.get());
                        output.accept(ModBlocks.WIDE_ACACIA_TRUNK.get());
                        output.accept(ModBlocks.THICK_TALL_ACACIA_BRANCH.get());
                        output.accept(ModBlocks.TALL_ACACIA_BRANCH.get());
                        output.accept(ModBlocks.THIN_TALL_ACACIA_BRANCH.get());
                        output.accept(ModBlocks.MEDIUM_ACACIA_BRANCH.get());
                        output.accept(ModBlocks.ACACIA_BRANCH.get());
                        output.accept(Blocks.ACACIA_LOG);
                        output.accept(Blocks.ACACIA_WOOD);
                        //dark oak
                        output.accept(ModBlocks.DARK_OAK_TRUNK.get());
                        output.accept(ModBlocks.WIDE_DARK_OAK_TRUNK.get());
                        output.accept(ModBlocks.THICK_TALL_DARK_OAK_BRANCH.get());
                        output.accept(ModBlocks.TALL_DARK_OAK_BRANCH.get());
                        output.accept(ModBlocks.THIN_TALL_DARK_OAK_BRANCH.get());
                        output.accept(ModBlocks.MEDIUM_DARK_OAK_BRANCH.get());
                        output.accept(ModBlocks.DARK_OAK_BRANCH.get());
                        output.accept(Blocks.DARK_OAK_LOG);
                        output.accept(Blocks.DARK_OAK_WOOD);
                        //mangrove
                        output.accept(ModBlocks.MANGROVE_TRUNK.get());
                        output.accept(ModBlocks.WIDE_MANGROVE_TRUNK.get());
                        output.accept(ModBlocks.THICK_TALL_MANGROVE_BRANCH.get());
                        output.accept(ModBlocks.TALL_MANGROVE_BRANCH.get());
                        output.accept(ModBlocks.THIN_TALL_MANGROVE_BRANCH.get());
                        output.accept(ModBlocks.MEDIUM_MANGROVE_BRANCH.get());
                        output.accept(ModBlocks.MANGROVE_BRANCH.get());
                        output.accept(Blocks.MANGROVE_LOG);
                        output.accept(Blocks.MANGROVE_WOOD);
                        //cherry
                        output.accept(ModBlocks.CHERRY_TRUNK.get());
                        output.accept(ModBlocks.WIDE_CHERRY_TRUNK.get());
                        output.accept(ModBlocks.THICK_TALL_CHERRY_BRANCH.get());
                        output.accept(ModBlocks.TALL_CHERRY_BRANCH.get());
                        output.accept(ModBlocks.THIN_TALL_CHERRY_BRANCH.get());
                        output.accept(ModBlocks.MEDIUM_CHERRY_BRANCH.get());
                        output.accept(ModBlocks.CHERRY_BRANCH.get());
                        output.accept(Blocks.CHERRY_LOG);
                        output.accept(Blocks.CHERRY_WOOD);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
