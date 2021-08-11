package net.paulfuenftausend.edibleOres.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class CandyOre extends Block {

    public CandyOre(Settings settings) {
        super(settings);
    }

    protected int droppedExp(Random rand){
        return MathHelper.nextInt(rand, 0, 4);
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if(EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0){
            int i = droppedExp(world.getRandom());
            if(i > 0){
                this.dropExperience(world, pos, i);
            }
        }
    }
}
