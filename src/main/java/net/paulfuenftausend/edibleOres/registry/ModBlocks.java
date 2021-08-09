package net.paulfuenftausend.edibleOres.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.paulfuenftausend.edibleOres.EdibleOres;

public class ModBlocks {

    private static final Block CANDY_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .strength(3, 1.8f)
            .breakByHand(false)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(EdibleOres.MOD_ID, "candy_ore"), CANDY_ORE);
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "candy_ore"), new BlockItem(CANDY_ORE, new Item.Settings().group(ItemGroup.MISC)));
    }
}
