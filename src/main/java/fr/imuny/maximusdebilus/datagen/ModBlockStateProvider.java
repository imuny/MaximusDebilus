package fr.imuny.maximusdebilus.datagen;

import fr.imuny.maximusdebilus.MaximusDebilus;
import fr.imuny.maximusdebilus.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MaximusDebilus.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.IMUNYUM_BLOCK);
        blockWithItem(ModBlocks.RAW_IMUNYUM_BLOCK);
        blockWithItem(ModBlocks.IMUNYUM_ORE);

        blockWithItem(ModBlocks.RAZZIXIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_RAZZIXIUM_BLOCK);
        blockWithItem(ModBlocks.RAZZIXIUM_ORE);

        blockWithItem(ModBlocks.SHRIGONIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_SHRIGONIUM_BLOCK);
        blockWithItem(ModBlocks.SHRIGONIUM_ORE);

        blockWithItem(ModBlocks.BOULGIUM_BLOCK);
        blockWithItem(ModBlocks.BOULGIUM_ORE);

        blockWithItem(ModBlocks.MAGIC_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
