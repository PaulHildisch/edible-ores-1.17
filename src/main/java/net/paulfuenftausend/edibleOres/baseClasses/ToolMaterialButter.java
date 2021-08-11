package net.paulfuenftausend.edibleOres.baseClasses;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.paulfuenftausend.edibleOres.registry.ModItems;

public class ToolMaterialButter implements ToolMaterial {
    @Override
    public int getDurability() {
        return 100;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 3.5f;
    }

    @Override
    public float getAttackDamage() {
        return 2;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.getBUTTER());
    }
}
