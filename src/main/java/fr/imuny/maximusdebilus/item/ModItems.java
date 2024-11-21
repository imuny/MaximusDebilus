package fr.imuny.maximusdebilus.item;

import fr.imuny.maximusdebilus.MaximusDebilus;
import fr.imuny.maximusdebilus.item.custom.ChiselItem;
import fr.imuny.maximusdebilus.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MaximusDebilus.MOD_ID);
    public static final RegistryObject<Item> IMUNYUM_NUGGET = ITEMS.register("imunyum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMUNYUM_INGOT = ITEMS.register("imunyum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_IMUNYUM = ITEMS.register("raw_imunyum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAZZIXIUM_NUGGET = ITEMS.register("razzixium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAZZIXIUM_INGOT = ITEMS.register("razzixium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RAZZIXIUM = ITEMS.register("raw_razzixium",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SHRIGONIUM_NUGGET = ITEMS.register("shrigonium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHRIGONIUM_INGOT = ITEMS.register("shrigonium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SHRIGONIUM = ITEMS.register("raw_shrigonium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOULGIUM = ITEMS.register("boulgium",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> IMUNYUM_SWORD =ITEMS.register("imunyum_sword",()-> new SwordItem(ModToolTiers.IMUNYUM,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.IMUNYUM, 3,-2.4f))));
    public static final RegistryObject<Item> IMUNYUM_PICKAXE =ITEMS.register("imunyum_pickaxe",()-> new PickaxeItem(ModToolTiers.IMUNYUM,new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.IMUNYUM, 1,-2.8f))));
    public static final RegistryObject<Item> IMUNYUM_SHOVEL =ITEMS.register("imunyum_shovel",()-> new ShovelItem(ModToolTiers.IMUNYUM,new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.IMUNYUM, 1.5f,-3.0f))));
    public static final RegistryObject<Item> IMUNYUM_HOE =ITEMS.register("imunyum_hoe",()-> new HoeItem(ModToolTiers.IMUNYUM,new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.IMUNYUM, 6,-3.2f))));
    public static final RegistryObject<Item> IMUNYUM_AXE =ITEMS.register("imunyum_axe",()-> new AxeItem(ModToolTiers.IMUNYUM,new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.IMUNYUM, 0,-3.0f))));

    public static final RegistryObject<Item> IMUNYUM_HELMET = ITEMS.register("imunyum_helmet",
            () -> new ModArmorItem(ModArmorMaterials.IMUNYUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(800))));
    public static final RegistryObject<Item> IMUNYUM_CHESTPLATE = ITEMS.register("imunyum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.IMUNYUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(800))));
    public static final RegistryObject<Item> IMUNYUM_LEGGINGS = ITEMS.register("imunyum_leggings",
            () -> new ArmorItem(ModArmorMaterials.IMUNYUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(800))));
    public static final RegistryObject<Item> IMUNYUM_BOOTS = ITEMS.register("imunyum_boots",
            () -> new ArmorItem(ModArmorMaterials.IMUNYUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(800))));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            ()-> new ChiselItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
