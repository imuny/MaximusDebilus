package fr.imuny.maximusdebilus.datagen;

import fr.imuny.maximusdebilus.MaximusDebilus;
import fr.imuny.maximusdebilus.block.ModBlocks;
import fr.imuny.maximusdebilus.item.ModItems;
import fr.imuny.maximusdebilus.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, MaximusDebilus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.COMPASS);


        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.IMUNYUM_HELMET.get())
                .add(ModItems.IMUNYUM_CHESTPLATE.get())
                .add(ModItems.IMUNYUM_LEGGINGS.get())
                .add(ModItems.IMUNYUM_BOOTS.get());

    }
}