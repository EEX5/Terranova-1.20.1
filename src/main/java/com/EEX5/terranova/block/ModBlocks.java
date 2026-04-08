package com.EEX5.terranova.block;

import com.EEX5.terranova.Terranova;
import com.EEX5.terranova.block.custom.*;
import com.EEX5.terranova.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Terranova.MOD_ID);

    //Test Blocks
    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEST_STAIRS = registerBlock("test_stairs", () -> new StairBlock(() -> ModBlocks.TEST_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> TEST_SLAB = registerBlock("test_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEST_WALL = registerBlock("test_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEST_FENCE = registerBlock("test_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEST_FENCE_GATE = registerBlock("test_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> TEST_TRAP_DOOR = registerBlock("test_trap_door", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<Block> TEST_BARS = registerBlock("test_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEST_DOOR = registerBlock("test_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<Block> TEST_BUTTON = registerBlock("test_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON), BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> TEST_PRESSURE_PLATE = registerBlock("test_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), BlockSetType.IRON));

    //Oak
    public static final RegistryObject<Block> OAK_TRUNK = registerBlock("oak_trunk", () -> new ModFlammableStairBlock(Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> WIDE_OAK_TRUNK = registerBlock("wide_oak_trunk", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> THICK_TALL_OAK_BRANCH = registerBlock("thick_tall_oak_branch", () -> new ModFlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> TALL_OAK_BRANCH = registerBlock("tall_oak_branch", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> MEDIUM_OAK_BRANCH = registerBlock("medium_oak_branch", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD), WoodType.OAK));
    public static final RegistryObject<Block> OAK_BRANCH = registerBlock("oak_branch", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<Block> THIN_TALL_OAK_BRANCH = registerBlock("thin_tall_oak_branch", () -> new ModFlammableIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    //Birch

    //Acacia

    //Jungle

    //Dark Oak

    //Mangrove

    //


    private  static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
