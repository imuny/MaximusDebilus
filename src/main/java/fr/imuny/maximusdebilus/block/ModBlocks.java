package fr.imuny.maximusdebilus.block;

import fr.imuny.maximusdebilus.MaximusDebilus;
import fr.imuny.maximusdebilus.block.custom.MagicBlock;
import fr.imuny.maximusdebilus.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MaximusDebilus.MOD_ID);


    public static final RegistryObject<Block> IMUNYUM_BLOCK =
            registerBlock("imunyum_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL))
            );
    public static final RegistryObject<Block> RAW_IMUNYUM_BLOCK =
            registerBlock("raw_imunyum_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL))
            );
    public static final RegistryObject<Block> IMUNYUM_ORE = registerBlock("imunyum_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BOULGIUM_BLOCK =
            registerBlock("boulgium_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL))
            );
    public static final RegistryObject<Block> BOULGIUM_ORE = registerBlock("boulgium_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));


    public static final RegistryObject<Block> RAZZIXIUM_BLOCK =
            registerBlock("razzixium_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL))
            );
    public static final RegistryObject<Block> RAW_RAZZIXIUM_BLOCK =
            registerBlock("raw_razzixium_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL))
            );
    public static final RegistryObject<Block> RAZZIXIUM_ORE = registerBlock("razzixium_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SHRIGONIUM_BLOCK =
            registerBlock("shrigonium_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL))
            );
    public static final RegistryObject<Block> RAW_SHRIGONIUM_BLOCK =
            registerBlock("raw_shrigonium_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL))
            );
    public static final RegistryObject<Block> SHRIGONIUM_ORE = registerBlock("shrigonium_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAGIC_BLOCK = registerBlock("magic_block",
            () -> new MagicBlock(BlockBehaviour.Properties.of().strength(2f).noLootTable()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
