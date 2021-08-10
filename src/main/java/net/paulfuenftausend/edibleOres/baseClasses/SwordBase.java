package net.paulfuenftausend.edibleOres.baseClasses;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.paulfuenftausend.edibleOres.EdibleOres;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 3, -1f, new Item.Settings().group(EdibleOres.ITEM_GROUP));
    }
}
