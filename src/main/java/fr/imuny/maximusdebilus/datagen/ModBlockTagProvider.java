package fr.imuny.maximusdebilus.datagen;


import fr.imuny.maximusdebilus.MaximusDebilus;
import fr.imuny.maximusdebilus.block.ModBlocks;
import fr.imuny.maximusdebilus.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MaximusDebilus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.IMUNYUM_BLOCK.get())
                .add(ModBlocks.RAW_IMUNYUM_BLOCK.get())
                .add(ModBlocks.IMUNYUM_ORE.get())

                .add(ModBlocks.RAZZIXIUM_BLOCK.get())
                .add(ModBlocks.RAW_RAZZIXIUM_BLOCK.get())
                .add(ModBlocks.RAZZIXIUM_ORE.get())

                .add(ModBlocks.SHRIGONIUM_BLOCK.get())
                .add(ModBlocks.RAW_SHRIGONIUM_BLOCK.get())
                .add(ModBlocks.SHRIGONIUM_ORE.get())

                .add(ModBlocks.BOULGIUM_BLOCK.get())
                .add(ModBlocks.BOULGIUM_ORE.get());


        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SHRIGONIUM_BLOCK.get())
                .add(ModBlocks.SHRIGONIUM_ORE.get())
                .add(ModBlocks.RAW_SHRIGONIUM_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BOULGIUM_BLOCK.get())
                .add(ModBlocks.BOULGIUM_ORE.get());

        tag(ModTags.Blocks.NEED_IMUNYUM_TOOL)
                .add(ModBlocks.RAW_IMUNYUM_BLOCK.get())
                .addTags(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_IMUNYUM_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEED_IMUNYUM_TOOL);

    }

}