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

    //Other Natural
    public static final RegistryObject<Block> STONE_PEBBLE = registerBlock("stone_pebble", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, true));

    //Oak
    public static final RegistryObject<Block> OAK_TRUNK = registerBlock("oak_trunk", () -> new ModFlammableStairBlock(Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> WIDE_OAK_TRUNK = registerBlock("wide_oak_trunk", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> THICK_TALL_OAK_BRANCH = registerBlock("thick_tall_oak_branch", () -> new ModFlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> TALL_OAK_BRANCH = registerBlock("tall_oak_branch", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> MEDIUM_OAK_BRANCH = registerBlock("medium_oak_branch", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD), WoodType.OAK));
    public static final RegistryObject<Block> OAK_BRANCH = registerBlock("oak_branch", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> THIN_TALL_OAK_BRANCH = registerBlock("thin_tall_oak_branch", () -> new ModFlammableIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    //Birch
    public static final RegistryObject<Block> BIRCH_TRUNK = registerBlock("birch_trunk", () -> new ModFlammableStairBlock(Blocks.BIRCH_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));
    public static final RegistryObject<Block> WIDE_BIRCH_TRUNK = registerBlock("wide_birch_trunk", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));
    public static final RegistryObject<Block> THICK_TALL_BIRCH_BRANCH = registerBlock("thick_tall_birch_branch", () -> new ModFlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));
    public static final RegistryObject<Block> TALL_BIRCH_BRANCH = registerBlock("tall_birch_branch", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));
    public static final RegistryObject<Block> MEDIUM_BIRCH_BRANCH = registerBlock("medium_birch_branch", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD), WoodType.BIRCH));
    public static final RegistryObject<Block> BIRCH_BRANCH = registerBlock("birch_branch", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).noOcclusion(), BlockSetType.BIRCH));
    public static final RegistryObject<Block> THIN_TALL_BIRCH_BRANCH = registerBlock("thin_tall_birch_branch", () -> new ModFlammableIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));
    //Spruce
    public static final RegistryObject<Block> SPRUCE_TRUNK = registerBlock("spruce_trunk", () -> new ModFlammableStairBlock(Blocks.SPRUCE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));
    public static final RegistryObject<Block> WIDE_SPRUCE_TRUNK = registerBlock("wide_spruce_trunk", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));
    public static final RegistryObject<Block> THICK_TALL_SPRUCE_BRANCH = registerBlock("thick_tall_spruce_branch", () -> new ModFlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));
    public static final RegistryObject<Block> TALL_SPRUCE_BRANCH = registerBlock("tall_spruce_branch", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));
    public static final RegistryObject<Block> MEDIUM_SPRUCE_BRANCH = registerBlock("medium_spruce_branch", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD), WoodType.SPRUCE));
    public static final RegistryObject<Block> SPRUCE_BRANCH = registerBlock("spruce_branch", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).noOcclusion(), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> THIN_TALL_SPRUCE_BRANCH = registerBlock("thin_tall_spruce_branch", () -> new ModFlammableIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));
    //Jungle
    public static final RegistryObject<Block> JUNGLE_TRUNK = registerBlock("jungle_trunk", () -> new ModFlammableStairBlock(Blocks.JUNGLE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));
    public static final RegistryObject<Block> WIDE_JUNGLE_TRUNK = registerBlock("wide_jungle_trunk", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));
    public static final RegistryObject<Block> THICK_TALL_JUNGLE_BRANCH = registerBlock("thick_tall_jungle_branch", () -> new ModFlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));
    public static final RegistryObject<Block> TALL_JUNGLE_BRANCH = registerBlock("tall_jungle_branch", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));
    public static final RegistryObject<Block> MEDIUM_JUNGLE_BRANCH = registerBlock("medium_jungle_branch", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD), WoodType.JUNGLE));
    public static final RegistryObject<Block> JUNGLE_BRANCH = registerBlock("jungle_branch", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).noOcclusion(), BlockSetType.JUNGLE));
    public static final RegistryObject<Block> THIN_TALL_JUNGLE_BRANCH = registerBlock("thin_tall_jungle_branch", () -> new ModFlammableIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));
    //Acacia
    public static final RegistryObject<Block> ACACIA_TRUNK = registerBlock("acacia_trunk", () -> new ModFlammableStairBlock(Blocks.ACACIA_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));
    public static final RegistryObject<Block> WIDE_ACACIA_TRUNK = registerBlock("wide_acacia_trunk", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));
    public static final RegistryObject<Block> THICK_TALL_ACACIA_BRANCH = registerBlock("thick_tall_acacia_branch", () -> new ModFlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));
    public static final RegistryObject<Block> TALL_ACACIA_BRANCH = registerBlock("tall_acacia_branch", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));
    public static final RegistryObject<Block> MEDIUM_ACACIA_BRANCH = registerBlock("medium_acacia_branch", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD), WoodType.ACACIA));
    public static final RegistryObject<Block> ACACIA_BRANCH = registerBlock("acacia_branch", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).noOcclusion(), BlockSetType.ACACIA));
    public static final RegistryObject<Block> THIN_TALL_ACACIA_BRANCH = registerBlock("thin_tall_acacia_branch", () -> new ModFlammableIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));
    //Dark Oak
    public static final RegistryObject<Block> DARK_OAK_TRUNK = registerBlock("dark_oak_trunk", () -> new ModFlammableStairBlock(Blocks.DARK_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));
    public static final RegistryObject<Block> WIDE_DARK_OAK_TRUNK = registerBlock("wide_dark_oak_trunk", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));
    public static final RegistryObject<Block> THICK_TALL_DARK_OAK_BRANCH = registerBlock("thick_tall_dark_oak_branch", () -> new ModFlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));
    public static final RegistryObject<Block> TALL_DARK_OAK_BRANCH = registerBlock("tall_dark_oak_branch", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));
    public static final RegistryObject<Block> MEDIUM_DARK_OAK_BRANCH = registerBlock("medium_dark_oak_branch", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD), WoodType.DARK_OAK));
    public static final RegistryObject<Block> DARK_OAK_BRANCH = registerBlock("dark_oak_branch", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).noOcclusion(), BlockSetType.DARK_OAK));
    public static final RegistryObject<Block> THIN_TALL_DARK_OAK_BRANCH = registerBlock("thin_tall_dark_oak_branch", () -> new ModFlammableIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));
    //Mangrove
    public static final RegistryObject<Block> MANGROVE_TRUNK = registerBlock("mangrove_trunk", () -> new ModFlammableStairBlock(Blocks.MANGROVE_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));
    public static final RegistryObject<Block> WIDE_MANGROVE_TRUNK = registerBlock("wide_mangrove_trunk", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));
    public static final RegistryObject<Block> THICK_TALL_MANGROVE_BRANCH = registerBlock("thick_tall_mangrove_branch", () -> new ModFlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));
    public static final RegistryObject<Block> TALL_MANGROVE_BRANCH = registerBlock("tall_mangrove_branch", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));
    public static final RegistryObject<Block> MEDIUM_MANGROVE_BRANCH = registerBlock("medium_mangrove_branch", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD), WoodType.MANGROVE));
    public static final RegistryObject<Block> MANGROVE_BRANCH = registerBlock("mangrove_branch", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD).noOcclusion(), BlockSetType.MANGROVE));
    public static final RegistryObject<Block> THIN_TALL_MANGROVE_BRANCH = registerBlock("thin_tall_mangrove_branch", () -> new ModFlammableIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));
    //Cherry
    public static final RegistryObject<Block> CHERRY_TRUNK = registerBlock("cherry_trunk", () -> new ModFlammableStairBlock(Blocks.CHERRY_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD)));
    public static final RegistryObject<Block> WIDE_CHERRY_TRUNK = registerBlock("wide_cherry_trunk", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD)));
    public static final RegistryObject<Block> THICK_TALL_CHERRY_BRANCH = registerBlock("thick_tall_cherry_branch", () -> new ModFlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD)));
    public static final RegistryObject<Block> TALL_CHERRY_BRANCH = registerBlock("tall_cherry_branch", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD)));
    public static final RegistryObject<Block> MEDIUM_CHERRY_BRANCH = registerBlock("medium_cherry_branch", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD), WoodType.CHERRY));
    public static final RegistryObject<Block> CHERRY_BRANCH = registerBlock("cherry_branch", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD).noOcclusion(), BlockSetType.CHERRY));
    public static final RegistryObject<Block> THIN_TALL_CHERRY_BRANCH = registerBlock("thin_tall_cherry_branch", () -> new ModFlammableIronBarsBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD)));

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
