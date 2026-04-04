package com.EEX5.terranova.datagen;

import com.EEX5.terranova.Terranova;
import com.EEX5.terranova.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
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
        simpleItem(ModItems.Stag_Beetle);
        simpleItem(ModItems.Stick_Insect);
        simpleItem(ModItems.Termite);
        simpleItem(ModItems.Water_Strider);
        simpleItem(ModItems.Weevil);
        simpleItem(ModItems.Whitefly);
        simpleItem(ModItems.Wireworm);
        simpleItem(ModItems.Woodlouse);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.fromNamespaceAndPath(Terranova.MOD_ID, "item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Terranova.MOD_ID, "item/" + item.getId().getPath()));
    }
}
