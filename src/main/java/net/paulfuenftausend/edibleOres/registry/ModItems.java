package net.paulfuenftausend.edibleOres.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.paulfuenftausend.edibleOres.EdibleOres;

public class ModItems {

    public static final Item CANDYCANE = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item BUTTER = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(6));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "candycane"), CANDYCANE);
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "butter"), BUTTER);
    }
}
