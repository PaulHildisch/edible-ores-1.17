package net.paulfuenftausend.edibleOres.registry;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.paulfuenftausend.edibleOres.EdibleOres;
import net.paulfuenftausend.edibleOres.baseClasses.*;

import java.math.BigInteger;

public class ModItems {

    public static Item getCandyCane() {
        return CANDYCANE;
    }
    public static Item getRainbowShard() {
        return RAINBOW_SHARD;
    }
    public static Item getBUTTER() {
        return BUTTER;
    }

    private static final Item CANDYCANE = new Item(new Item.Settings().group(EdibleOres.ITEM_GROUP));
    private static final Item BUTTER = new Item(new Item.Settings().group(EdibleOres.ITEM_GROUP).maxCount(6));
    private static final Item CORN = new Item(new Item.Settings().group(EdibleOres.ITEM_GROUP));
    private static final Item POPCORN = new Item(new Item.Settings().group(EdibleOres.ITEM_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(8f).build()));
    private static final Item BUTTER_POPCORN = new Item(new Item.Settings().group(EdibleOres.ITEM_GROUP).rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(10).saturationModifier(14f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5*20), 1f).build()));
    private static final Item RAINBOW_SHARD = new Item(new Item.Settings().group(EdibleOres.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(3.8f).snack().statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, (int)(1.5*20)), 0.8f).build()));
    private static final Item COTTON_CANDY = new Item(new Item.Settings().group(EdibleOres.ITEM_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(4.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, (int)(30*20)),0.5f).build()));
    private static final Item SUGAR_STICK = new Item(new Item.Settings().group(EdibleOres.ITEM_GROUP));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "candycane"), CANDYCANE);
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "butter"), BUTTER);
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "corn"), CORN);
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "popcorn"), POPCORN);
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "butter_popcorn"), BUTTER_POPCORN);
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "rainbow_shard"), RAINBOW_SHARD);
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "cotton_candy"), COTTON_CANDY);
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "sugar_stick"), SUGAR_STICK);

        //Tools
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "rainbow_pickaxe"), new PickaxeBase(new ToolMaterialRainbow()));
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "rainbow_axe"), new AxeBase(new ToolMaterialRainbow()));
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "rainbow_shovel"), new ShovelBase(new ToolMaterialRainbow()));
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "rainbow_hoe"), new HoeBase(new ToolMaterialRainbow()));
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "rainbow_sword"), new SwordBase(new ToolMaterialRainbow()));

    }
}
