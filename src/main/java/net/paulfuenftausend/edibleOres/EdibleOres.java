package net.paulfuenftausend.edibleOres;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.paulfuenftausend.edibleOres.registry.ModBlocks;
import net.paulfuenftausend.edibleOres.registry.ModItems;

public class EdibleOres implements ModInitializer {

	public static final String MOD_ID =  "ores";
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(ModItems.getCANDYCANE()));

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
