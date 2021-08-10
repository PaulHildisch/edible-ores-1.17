package net.paulfuenftausend.edibleOres.baseClasses;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.paulfuenftausend.edibleOres.EdibleOres;

public class HoeBase extends HoeItem {

    public HoeBase(ToolMaterial material) {
        super(material, 9, -0.6f, new Item.Settings().group(EdibleOres.ITEM_GROUP));
    }
}
