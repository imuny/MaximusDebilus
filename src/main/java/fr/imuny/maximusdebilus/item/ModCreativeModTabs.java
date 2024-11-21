package fr.imuny.maximusdebilus.item;

import fr.imuny.maximusdebilus.MaximusDebilus;
import fr.imuny.maximusdebilus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MaximusDebilus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAXIMUS_DEBILUS_TAB =
            CREATIVE_MODE_TABS.register("maximus_debilus_tab",
                    () -> CreativeModeTab.builder()
                            .icon(()-> new ItemStack(ModItems.IMUNYUM_INGOT.get()))
                            .title(Component.translatable("creative.maximusdebilus.tab"))
                            .displayItems((itemDisplayParameters,output)->{

                                output.accept(ModBlocks.IMUNYUM_BLOCK.get());
                                output.accept(ModBlocks.IMUNYUM_ORE.get());
                                output.accept(ModBlocks.MAGIC_BLOCK.get());
                                
                
                                output.accept(ModBlocks.RAZZIXIUM_BLOCK.get());
                                output.accept(ModBlocks.RAW_RAZZIXIUM_BLOCK.get());
                                output.accept(ModBlocks.RAZZIXIUM_ORE.get());

                                output.accept(ModBlocks.SHRIGONIUM_BLOCK.get());
                                output.accept(ModBlocks.RAW_SHRIGONIUM_BLOCK.get());
                                output.accept(ModBlocks.SHRIGONIUM_ORE.get());

                                output.accept(ModBlocks.BOULGIUM_BLOCK.get());
                                output.accept(ModBlocks.BOULGIUM_ORE.get());


                                output.accept(ModItems.IMUNYUM_NUGGET.get());
                                output.accept(ModItems.IMUNYUM_INGOT.get());
                                output.accept(ModItems.RAW_IMUNYUM.get());

                                output.accept(ModItems.RAZZIXIUM_NUGGET.get());
                                output.accept(ModItems.RAZZIXIUM_INGOT.get());
                                output.accept(ModItems.RAW_RAZZIXIUM.get());

                                output.accept(ModItems.SHRIGONIUM_NUGGET.get());
                                output.accept(ModItems.SHRIGONIUM_INGOT.get());
                                output.accept(ModItems.RAW_SHRIGONIUM.get());

                                output.accept(ModItems.BOULGIUM.get());
                                
                                output.accept(ModItems.CHISEL.get());

                                output.accept(ModItems.IMUNYUM_SWORD.get());
                                output.accept(ModItems.IMUNYUM_SHOVEL.get());
                                output.accept(ModItems.IMUNYUM_PICKAXE.get());
                                output.accept(ModItems.IMUNYUM_AXE.get());
                                output.accept(ModItems.IMUNYUM_HOE.get());

                                output.accept(ModItems.IMUNYUM_HELMET.get());
                                output.accept(ModItems.IMUNYUM_CHESTPLATE.get());
                                output.accept(ModItems.IMUNYUM_LEGGINGS.get());
                                output.accept(ModItems.IMUNYUM_BOOTS.get());



                            })
                            .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
