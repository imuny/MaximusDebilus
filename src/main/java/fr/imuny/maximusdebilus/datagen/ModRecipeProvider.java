package fr.imuny.maximusdebilus.datagen;

import fr.imuny.maximusdebilus.MaximusDebilus;
import fr.imuny.maximusdebilus.block.ModBlocks;
import fr.imuny.maximusdebilus.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> IMUNYUM_INGOT_SMELTABLES = List.of(ModItems.RAW_IMUNYUM.get(),
                ModBlocks.IMUNYUM_ORE.get());
        List<ItemLike> IMUNYUM_BLOCK_SMELTABLES = List.of(ModBlocks.RAW_IMUNYUM_BLOCK.get());

        List<ItemLike> RAZZIXIUM_INGOT_SMELTABLES = List.of(ModItems.RAW_RAZZIXIUM.get(),
                ModBlocks.RAZZIXIUM_ORE.get());
        List<ItemLike> RAZZIXIUM_BLOCK_SMELTABLES = List.of(ModBlocks.RAW_RAZZIXIUM_BLOCK.get());

        List<ItemLike> SHRIGONIUM_INGOT_SMELTABLES = List.of(ModItems.RAW_SHRIGONIUM.get(),
                ModBlocks.SHRIGONIUM_ORE.get());
        List<ItemLike> SHRIGONIUM_BLOCK_SMELTABLES = List.of(ModBlocks.RAW_SHRIGONIUM_BLOCK.get());

        compactingItemsToBlock(ModBlocks.IMUNYUM_BLOCK.get(),ModItems.IMUNYUM_INGOT.get(),pRecipeOutput);
        compactingItemsToBlock(ModBlocks.RAW_IMUNYUM_BLOCK.get(),ModItems.RAW_IMUNYUM.get(),pRecipeOutput);
        compactingItemsToItem(ModItems.IMUNYUM_INGOT.get(),ModItems.IMUNYUM_NUGGET.get(),pRecipeOutput);

        compactingItemsToBlock(ModBlocks.RAZZIXIUM_BLOCK.get(),ModItems.RAZZIXIUM_INGOT.get(),pRecipeOutput);
        compactingItemsToBlock(ModBlocks.RAW_RAZZIXIUM_BLOCK.get(),ModItems.RAW_RAZZIXIUM.get(),pRecipeOutput);
        compactingItemsToItem(ModItems.RAZZIXIUM_INGOT.get(),ModItems.RAZZIXIUM_NUGGET.get(),pRecipeOutput);

        compactingItemsToBlock(ModBlocks.SHRIGONIUM_BLOCK.get(),ModItems.SHRIGONIUM_INGOT.get(),pRecipeOutput);
        compactingItemsToBlock(ModBlocks.RAW_SHRIGONIUM_BLOCK.get(),ModItems.RAW_SHRIGONIUM.get(),pRecipeOutput);
        compactingItemsToItem(ModItems.SHRIGONIUM_INGOT.get(),ModItems.SHRIGONIUM_NUGGET.get(),pRecipeOutput);

        compactingItemsToBlock(ModBlocks.BOULGIUM_BLOCK.get(),ModItems.BOULGIUM.get(),pRecipeOutput);

        unpackingItemToItems(ModItems.IMUNYUM_NUGGET.get(),ModItems.IMUNYUM_INGOT.get(),pRecipeOutput);
        unpackingBlockToItems(ModItems.IMUNYUM_INGOT.get(),ModBlocks.IMUNYUM_BLOCK.get(),pRecipeOutput);
        unpackingBlockToItems(ModItems.RAW_IMUNYUM.get(),ModBlocks.RAW_IMUNYUM_BLOCK.get(),pRecipeOutput);

        unpackingItemToItems(ModItems.RAZZIXIUM_NUGGET.get(),ModItems.RAZZIXIUM_INGOT.get(),pRecipeOutput);
        unpackingBlockToItems(ModItems.RAZZIXIUM_INGOT.get(),ModBlocks.RAZZIXIUM_BLOCK.get(),pRecipeOutput);
        unpackingBlockToItems(ModItems.RAW_RAZZIXIUM.get(),ModBlocks.RAW_RAZZIXIUM_BLOCK.get(),pRecipeOutput);

        unpackingItemToItems(ModItems.SHRIGONIUM_NUGGET.get(),ModItems.SHRIGONIUM_INGOT.get(),pRecipeOutput);
        unpackingBlockToItems(ModItems.SHRIGONIUM_INGOT.get(),ModBlocks.SHRIGONIUM_BLOCK.get(),pRecipeOutput);
        unpackingBlockToItems(ModItems.RAW_SHRIGONIUM.get(),ModBlocks.RAW_SHRIGONIUM_BLOCK.get(),pRecipeOutput);

        unpackingBlockToItems(ModItems.BOULGIUM.get(),ModBlocks.BOULGIUM_BLOCK.get(),pRecipeOutput);


        oreSmelting(pRecipeOutput, IMUNYUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.IMUNYUM_INGOT.get(), 0.25f, 200, "imunyum");
        oreBlasting(pRecipeOutput, IMUNYUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.IMUNYUM_INGOT.get(), 0.25f, 100, "imunyum");

        oreSmelting(pRecipeOutput, IMUNYUM_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.IMUNYUM_BLOCK.get(), 0.25f, 200, "imunyum");
        oreBlasting(pRecipeOutput, IMUNYUM_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.IMUNYUM_BLOCK.get(), 0.25f, 100, "imunyum");


        oreSmelting(pRecipeOutput, RAZZIXIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.RAZZIXIUM_INGOT.get(), 0.25f, 200, "razzixium");
        oreBlasting(pRecipeOutput, RAZZIXIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.RAZZIXIUM_INGOT.get(), 0.25f, 100, "razzixium");

        oreSmelting(pRecipeOutput, RAZZIXIUM_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.RAZZIXIUM_BLOCK.get(), 0.25f, 200, "razzixium");
        oreBlasting(pRecipeOutput, RAZZIXIUM_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.RAZZIXIUM_BLOCK.get(), 0.25f, 100, "razzixium");


        oreSmelting(pRecipeOutput, SHRIGONIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.SHRIGONIUM_INGOT.get(), 0.25f, 200, "shrigonium");
        oreBlasting(pRecipeOutput, SHRIGONIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.SHRIGONIUM_INGOT.get(), 0.25f, 100, "shrigonium");

        oreSmelting(pRecipeOutput, SHRIGONIUM_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.SHRIGONIUM_BLOCK.get(), 0.25f, 200, "shrigonium");
        oreBlasting(pRecipeOutput, SHRIGONIUM_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.SHRIGONIUM_BLOCK.get(), 0.25f, 100, "shrigonium");


    }

    private void unpackingItemToItems(Item output, Item input, RecipeOutput pRecipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 9)
                .requires(input)
                .unlockedBy(getHasName(input), has(input)).save(pRecipeOutput,output.toString()+"_from_unpacking");
    }

    private void unpackingBlockToItems(Item output, Block input, RecipeOutput pRecipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 9)
                .requires(input)
                .unlockedBy(getHasName(input), has(input)).save(pRecipeOutput,output.toString()+"_from_unpacking");
    }


    private void compactingItemsToItem(Item output, Item input, RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', input)
                .unlockedBy(getHasName(input), has(input)).save(pRecipeOutput,output.toString()+"_from_compacting");
    }

    protected static void compactingItemsToBlock(Block output, Item input, RecipeOutput pRecipeOutput){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', input)
                .unlockedBy(getHasName(input), has(input)).save(pRecipeOutput);

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MaximusDebilus.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}