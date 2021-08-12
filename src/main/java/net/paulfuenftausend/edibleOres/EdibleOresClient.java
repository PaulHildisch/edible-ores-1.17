package net.paulfuenftausend.edibleOres;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.paulfuenftausend.edibleOres.registry.ModBlocks;

public class EdibleOresClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("Client load");
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.getCornPlant());
    }
}
