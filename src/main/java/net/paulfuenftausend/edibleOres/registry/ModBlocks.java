package net.paulfuenftausend.edibleOres.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.HeightProvider;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.paulfuenftausend.edibleOres.Blocks.CandyOre;
import net.paulfuenftausend.edibleOres.EdibleOres;

public class ModBlocks {

    private static final Block CANDY_ORE = new CandyOre(FabricBlockSettings
            .of(Material.STONE)
            .strength(3, 1.8f)
            .breakByHand(false)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE));

    private static final Block RAINBOW = new Block(FabricBlockSettings
            .of(Material.WOOL)
            .strength(2.5f, 0.3f)
            .luminance(5)
            .sounds(BlockSoundGroup.WOOL));

    private static final ConfiguredFeature<?,?> CANDY_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    CANDY_ORE.getDefaultState(),
                    6))
            .range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64))))
            .spreadHorizontally()
            .repeat(10);

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(EdibleOres.MOD_ID, "candy_ore"), CANDY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(EdibleOres.MOD_ID, "rainbow"), RAINBOW);

        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "candy_ore"), new BlockItem(CANDY_ORE, new Item.Settings().group(EdibleOres.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(EdibleOres.MOD_ID, "rainbow"), new BlockItem(RAINBOW, new Item.Settings().group(EdibleOres.ITEM_GROUP)));

        //Ore Generation
        RegistryKey<ConfiguredFeature<?,?>> candy_ore_overworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(EdibleOres.MOD_ID, "candy_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, candy_ore_overworld.getValue(), CANDY_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, candy_ore_overworld);
    }
}
