package com.EEX5.terranova.item;

import com.EEX5.terranova.Terranova;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Terranova.MOD_ID);

    /*
    Copy this in order to make new items:
    Remember to create the item's .json file and textures.
     */
    public static final RegistryObject<Item> Aphid = ITEMS.register("aphid",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Ash_Weevil = ITEMS.register("ash_weevil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Bark_Beetle = ITEMS.register("bark_beetle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Bloodworm = ITEMS.register("bloodworm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Cabbage_Moth = ITEMS.register("cabbage_moth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Cabbage_Moth_Larva = ITEMS.register("cabbage_moth_larva",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Carpenter_Ant = ITEMS.register("carpenter_ant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Cave_Cricket = ITEMS.register("cave_cricket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Centipede = ITEMS.register("centipede",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Diving_Beetle = ITEMS.register("diving_beetle",//
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Dragonfly = ITEMS.register("dragonfly",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Dragonfly_Larva = ITEMS.register("dragonfly_larva",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Dung_Beetle = ITEMS.register("dung_beetle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Earthworm = ITEMS.register("earthworm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Earwig = ITEMS.register("earwig",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Ember_Mite = ITEMS.register("ember_mite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Firefly = ITEMS.register("firefly",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Flea_Beetle = ITEMS.register("flea_beetle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Fungus_Gnat = ITEMS.register("fungus_gnat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Fungus_Gnat_Larva = ITEMS.register("fungus_gnat_larva",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Ground_Beetle = ITEMS.register("ground_beetle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Lacewig = ITEMS.register("lacewig",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Leafcutter_Ant = ITEMS.register("leafcutter_ant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Longhorn_Beetle = ITEMS.register("longhorn_beetle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Pseudoscorpion = ITEMS.register("pseudoscorpion",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Scuttle_Fly = ITEMS.register("scuttle_fly",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Silverfish_Larva = ITEMS.register("silverfish_larva",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Stag_Beetle = ITEMS.register("stag_beetle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Stick_Insect = ITEMS.register("stick_insect",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Termite = ITEMS.register("termite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Water_Strider = ITEMS.register("water_strider",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Weevil = ITEMS.register("weevil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Whitefly = ITEMS.register("whitefly",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Wireworm = ITEMS.register("wireworm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Woodlouse = ITEMS.register("woodlouse",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
