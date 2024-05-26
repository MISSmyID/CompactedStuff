package MISSmyIDmods.compactedstuff.block;

import MISSmyIDmods.compactedstuff.Compactedstuff;
import MISSmyIDmods.compactedstuff.CompactedstuffConfig;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import turniplabs.halplibe.helper.BlockBuilder;

public class CompactedBlocks {
	private static int blockID(String blockName) {
		return CompactedstuffConfig.cfg.getInt("Block IDs." + blockName);
	}

	public static Block compactedDirt;
	public static Block doubleCompactedDirt;
	public static Block compactedCobble;
	public static Block doubleCompactedCobble;
	public static Block compactedGravel;
	public static Block doubleCompactedGravel;
	public static Block compactedSand;
	public static Block doubleCompactedSand;
	public static Block compactedBasaltCobble;
	public static Block doubleCompactedBasaltCobble;
	public static Block compactedLimestoneCobble;
	public static Block doubleCompactedLimestoneCobble;
	public static Block compactedGraniteCobble;
	public static Block doubleCompactedGraniteCobble;

	public static BlockBuilder blockBuilder = new BlockBuilder(Compactedstuff.MOD_ID);

	public static void InitializeBlocks() {
		compactedDirt = blockBuilder.setTextures("PackedDirt.png").build(new Block("packedDirt", blockID("compactedDirt"), Material.dirt));
		doubleCompactedDirt = blockBuilder.setTextures("DoublePackedDirt.png").build(new Block("doublePackedDirt", blockID("doubleCompactedDirt"), Material.dirt));
		compactedCobble = blockBuilder.setTextures("PackedCobble.png").build(new Block("packedCobble", blockID("compactedCobble"), Material.stone));
		doubleCompactedCobble = blockBuilder.setTextures("DoublePackedCobble.png").build(new Block("doublePackedCobble", blockID("doubleCompactedCobble"), Material.stone));
		compactedGravel = blockBuilder.setTextures("PackedGravel.png").build(new CompactedGravel("packedGravel", blockID("compactedGravel"), Material.sand));
		doubleCompactedGravel = blockBuilder.setTextures("DoublePackedGravel.png").build(new DoubleCompactedGravel("doublePackedGravel", blockID("doubleCompactedGravel"), Material.sand));
		compactedSand = blockBuilder.setTextures("PackedSand.png").build(new CompactedSand("packedSand", blockID("compactedSand"), Material.sand));
		doubleCompactedSand = blockBuilder.setTextures("DoublePackedSand.png").build(new DoubleCompactedSand("doublePackedSand", blockID("doubleCompactedSand"), Material.sand));
		compactedBasaltCobble = blockBuilder.setTextures("PackedBasaltCobble.png").build(new Block("packedBasaltCobble", blockID("compactedBasaltCobble"), Material.stone));
		doubleCompactedBasaltCobble = blockBuilder.setTextures("DoublePackedBasaltCobble.png").build(new Block("doublePackedBasaltCobble", blockID("doubleCompactedBasaltCobble"), Material.stone));
		compactedLimestoneCobble = blockBuilder.setTextures("PackedLimestoneC.png").build(new Block("packedLimestoneCobble", blockID("compactedLimestoneCobble"), Material.stone));
		doubleCompactedLimestoneCobble = blockBuilder.setTextures("DoublePackedLimestoneC.png").build(new Block("doublePackedLimestoneCobble", blockID("doubleCompactedLimestoneCobble"), Material.stone));
		compactedGraniteCobble = blockBuilder.setTextures("PackedGraniteC.png").build(new Block("packedGraniteCobble", blockID("compactedGraniteCobble"), Material.stone));
		doubleCompactedGraniteCobble = blockBuilder.setTextures("DoublePackedGraniteC.png").build(new Block("doublePackedGraniteCobble", blockID("doubleCompactedGraniteCobble"), Material.stone));
	}
}
