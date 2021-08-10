package net.paulfuenftausend.edibleOres.baseClasses;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.paulfuenftausend.edibleOres.EdibleOres;

public class PickaxeBase extends PickaxeItem{

    public PickaxeBase(ToolMaterial material) {
        super(material, -1, -1.6f, new Item.Settings().group(EdibleOres.ITEM_GROUP));
    }
}
