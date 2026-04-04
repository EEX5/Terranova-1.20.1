package com.EEX5.terranova.datagen;

import com.EEX5.terranova.block.ModBlocks;
import com.EEX5.terranova.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        /*
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TEST_BLOCK.get())
                .pattern("ABC")
                .pattern("ABC")
                .pattern("ABC")
                .define('A', ExampleClass1.Example1.get())
                .define('B', ExampleClass2.Example2.get())
                //until all letters are defined
                .unlockedBy(getHasName(Exampleclass1.Example1.get()), has(Exampleclass1.Example1.get()))
                .unlockedBy(getHasName(Exampleclass2.Example2.get()), has(Exampleclass2.Example2.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ExampleClass1.Example1.get(), ExampleNumber)
                .requires(Exampleclass2.Example2.get())
                .unlockedBy(getHasName(Exampleclass2.Example2.get()), has(Exampleclass2.Example2.get()))
                .save(pWriter);
         */

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TEST_BLOCK.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', ModBlocks.TEST_BLOCK.get())
                .define('B', ModItems.Termite.get())
                .unlockedBy(getHasName(ModBlocks.TEST_BLOCK.get()), has(ModBlocks.TEST_BLOCK.get()))
                .unlockedBy(getHasName(ModItems.Termite.get()), has(ModItems.Termite.get()))
                .save(pWriter);
        /*
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TEST_BLOCK.get(), 64)
                .requires(ModBlocks.TEST_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TEST_BLOCK.get()), has(ModBlocks.TEST_BLOCK.get()))
                .save(pWriter);

         */
    }
}
