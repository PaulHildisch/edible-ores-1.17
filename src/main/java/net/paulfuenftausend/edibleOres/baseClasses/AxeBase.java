package net.paulfuenftausend.edibleOres.baseClasses;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.paulfuenftausend.edibleOres.EdibleOres;

public class AxeBase extends AxeItem {

    public AxeBase(ToolMaterial material) {
        super(material, 1, -0.8f, new Item.Settings().group(EdibleOres.ITEM_GROUP));
    }
}
