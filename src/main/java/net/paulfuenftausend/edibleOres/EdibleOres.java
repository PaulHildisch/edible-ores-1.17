package net.paulfuenftausend.edibleOres;

import net.fabricmc.api.ModInitializer;
import net.paulfuenftausend.edibleOres.registry.ModBlocks;
import net.paulfuenftausend.edibleOres.registry.ModItems;

public class EdibleOres implements ModInitializer {

	public static final String MOD_ID =  "ores";

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
