package net.paulfuenftausend.edibleOres.baseClasses;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.paulfuenftausend.edibleOres.EdibleOres;

public class ShovelBase extends ShovelItem {

    public ShovelBase(ToolMaterial material) {
        super(material, 0, -1.4f, new Item.Settings().group(EdibleOres.ITEM_GROUP));
    }
}
