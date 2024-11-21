package fr.imuny.maximusdebilus.datagen;

import fr.imuny.maximusdebilus.block.ModBlocks;
import fr.imuny.maximusdebilus.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.IMUNYUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_IMUNYUM_BLOCK.get());
        dropOre(ModBlocks.IMUNYUM_ORE.get(), ModItems.RAW_IMUNYUM.get());

        dropSelf(ModBlocks.RAZZIXIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_RAZZIXIUM_BLOCK.get());
        dropOre(ModBlocks.RAZZIXIUM_ORE.get(),ModItems.RAW_RAZZIXIUM.get());

        dropSelf(ModBlocks.SHRIGONIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_SHRIGONIUM_BLOCK.get());
        dropOre(ModBlocks.SHRIGONIUM_ORE.get(),ModItems.RAW_SHRIGONIUM.get());

        dropSelf(ModBlocks.BOULGIUM_BLOCK.get());

        this.add(ModBlocks.BOULGIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.BOULGIUM_ORE.get(),ModItems.BOULGIUM.get(), 2, 6));


    }

    private void dropOre(Block ore, Item item) {
        this.add(ore,
                block -> createOreDrop(ore, item));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}