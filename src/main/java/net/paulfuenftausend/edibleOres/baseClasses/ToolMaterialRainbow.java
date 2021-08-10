package net.paulfuenftausend.edibleOres.baseClasses;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.paulfuenftausend.edibleOres.registry.ModItems;

public class ToolMaterialRainbow implements ToolMaterial {

    @Override
    public int getDurability() {
        return 1242;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6f;
    }

    @Override
    public float getAttackDamage() {
        return 1.5f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 40;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.getRainbowShard());
    }
}
