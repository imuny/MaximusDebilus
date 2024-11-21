package fr.imuny.maximusdebilus.item;

import fr.imuny.maximusdebilus.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier IMUNYUM = new ForgeTier(100000,100,96f,500,
            ModTags.Blocks.NEED_IMUNYUM_TOOL,() -> Ingredient.of(ModItems.IMUNYUM_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_IMUNYUM_TOOL);
}
