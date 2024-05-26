package MISSmyIDmods.compactedstuff.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSand;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.EntityFallingSand;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

public class DoubleCompactedSand extends BlockSand {
	public DoubleCompactedSand(String key, int id, Material material) {
		super(key, id);
	}

	public void onBlockAdded(World world, int i, int j, int k) {
		super.onBlockAdded(world, i, j, k);
		world.scheduleBlockUpdate(i, j, k, this.id, this.tickRate());
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return dropCause == EnumDropCause.EXPLOSION ? null : new ItemStack[]{new ItemStack(this)};
	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		this.tryToFall(world, x, y, z);
	}

	private void tryToFall(World world, int i, int j, int k) {
		if (canFallBelow(world, i, j - 1, k) && j >= 0) {
			byte byte0 = 32;
			if (!fallInstantly && world.areBlocksLoaded(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0)) {
				EntityFallingSand entityfallingsand = new EntityFallingSand(world, (double)((float)i + 0.5F), (double)((float)j + 0.5F), (double)((float)k + 0.5F), this.id);
				world.entityJoinedWorld(entityfallingsand);
			} else {
				world.setBlockWithNotify(i, j, k, 0);

				while(canFallBelow(world, i, j - 1, k) && j > 0) {
					--j;
				}

				if (j > 0) {
					world.setBlockWithNotify(i, j, k, this.id);
				}
			}
		}

	}

	public int tickRate() {
		return 3;
	}

	public static boolean canFallBelow(World world, int i, int j, int k) {
		int blockId = world.getBlockId(i, j, k);
		if (blockId == 0) {
			return true;
		} else if (blockId == Block.fire.id) {
			return true;
		} else {
			return Block.hasTag(blockId, BlockTags.IS_WATER) || Block.hasTag(blockId, BlockTags.IS_LAVA);
		}
	}
}
