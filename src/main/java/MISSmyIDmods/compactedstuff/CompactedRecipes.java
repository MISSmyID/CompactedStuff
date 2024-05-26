package MISSmyIDmods.compactedstuff;

import MISSmyIDmods.compactedstuff.block.CompactedBlocks;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class CompactedRecipes implements RecipeEntrypoint {

	public static void InitializeRecipes() {
		RecipeBuilderShaped templateItemtoBlock = new RecipeBuilderShaped("compactedstuff", new String[]{"XXX", "XXX", "XXX"});
		RecipeBuilderShaped templateBlocktoItem = new RecipeBuilderShaped("bonusblocks", new String[]{"X"});
		//Crafting
		templateItemtoBlock.addInput('X', Block.dirt).create("packedDirt", new ItemStack(CompactedBlocks.compactedDirt,1));
		templateItemtoBlock.addInput('X', CompactedBlocks.compactedDirt).create("doublePackedDirt", new ItemStack(CompactedBlocks.doubleCompactedDirt,1));
		templateItemtoBlock.addInput('X', Block.cobbleStone).create("packedCobble", new ItemStack(CompactedBlocks.compactedCobble,1));
		templateItemtoBlock.addInput('X', CompactedBlocks.compactedCobble).create("doublePackedCobble", new ItemStack(CompactedBlocks.doubleCompactedCobble,1));
		templateItemtoBlock.addInput('X', Block.gravel).create("packedGravel", new ItemStack(CompactedBlocks.compactedGravel,1));
		templateItemtoBlock.addInput('X', CompactedBlocks.compactedGravel).create("doublePackedGravel", new ItemStack(CompactedBlocks.doubleCompactedGravel,1));
		templateItemtoBlock.addInput('X', Block.sand).create("packedSand", new ItemStack(CompactedBlocks.compactedSand,1));
		templateItemtoBlock.addInput('X', CompactedBlocks.compactedSand).create("doublePackedSand", new ItemStack(CompactedBlocks.doubleCompactedSand,1));
		templateItemtoBlock.addInput('X', Block.cobbleBasalt).create("packedBasaltCobble", new ItemStack(CompactedBlocks.compactedBasaltCobble,1));
		templateItemtoBlock.addInput('X', CompactedBlocks.compactedBasaltCobble).create("doublePackedBasaltCobble", new ItemStack(CompactedBlocks.doubleCompactedBasaltCobble,1));
		templateItemtoBlock.addInput('X', Block.cobbleGranite).create("packedGraniteCobble", new ItemStack(CompactedBlocks.compactedGraniteCobble,1));
		templateItemtoBlock.addInput('X', CompactedBlocks.compactedGraniteCobble).create("doublePackedGraniteCobble", new ItemStack(CompactedBlocks.doubleCompactedGraniteCobble,1));
		templateItemtoBlock.addInput('X', Block.cobbleLimestone).create("packedLimestoneCobble", new ItemStack(CompactedBlocks.compactedLimestoneCobble,1));
		templateItemtoBlock.addInput('X', CompactedBlocks.compactedLimestoneCobble).create("doublePackedLimestoneCobble", new ItemStack(CompactedBlocks.doubleCompactedLimestoneCobble,1));
		//Uncrafting
		templateBlocktoItem.addInput('X', CompactedBlocks.compactedDirt).create("packedDirtU",new ItemStack(Block.dirt, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.doubleCompactedDirt).create("doublePackedDirtU",new ItemStack(CompactedBlocks.compactedDirt, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.compactedCobble).create("packedCobbleU",new ItemStack(Block.cobbleStone, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.doubleCompactedCobble).create("doublePackedCobbleU",new ItemStack(CompactedBlocks.compactedCobble, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.compactedGravel).create("packedGravelU",new ItemStack(Block.gravel, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.doubleCompactedGravel).create("doublePackedGravelU",new ItemStack(CompactedBlocks.compactedGravel, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.compactedSand).create("packedSandU",new ItemStack(Block.sand, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.doubleCompactedSand).create("doublePackedSandU",new ItemStack(CompactedBlocks.compactedSand, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.compactedBasaltCobble).create("packedBasaltCobbleU",new ItemStack(Block.cobbleBasalt, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.doubleCompactedBasaltCobble).create("doublePackedBasaltCobbleU",new ItemStack(CompactedBlocks.compactedBasaltCobble, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.compactedGraniteCobble).create("packedGraniteCobbleU",new ItemStack(Block.cobbleGranite, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.doubleCompactedGraniteCobble).create("doublePackedGraniteCobbleU",new ItemStack(CompactedBlocks.compactedGraniteCobble, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.compactedLimestoneCobble).create("packedLimestoneCobbleU",new ItemStack(Block.cobbleLimestone, 9));
		templateBlocktoItem.addInput('X', CompactedBlocks.doubleCompactedLimestoneCobble).create("doublePackedLimestoneCobbleU",new ItemStack(CompactedBlocks.compactedLimestoneCobble, 9));


		//TromelRecipes
		RecipeBuilder.Trommel(Compactedstuff.MOD_ID)
			.setInput(CompactedBlocks.compactedGravel)
			.addEntry(new WeightedRandomLootObject(Item.flint.getDefaultStack(),3,6),25)
			.addEntry(new WeightedRandomLootObject(Item.olivine.getDefaultStack(),3,9),30)
			.addEntry(new WeightedRandomLootObject(Item.oreRawIron.getDefaultStack(),3,6),10)
			//IDK how to drop Lapis lazuli
			//.addEntry(new WeightedRandomLootObject(Item.dye.getDefaultStack(),6,18),25)
			.addEntry(new WeightedRandomLootObject(Item.quartz.getDefaultStack(),3,6),10)
				.create("PacketGravel");
		RecipeBuilder.Trommel(Compactedstuff.MOD_ID)
			.setInput(CompactedBlocks.doubleCompactedGravel)
			.addEntry(new WeightedRandomLootObject(Item.flint.getDefaultStack(),6,12),25)
			.addEntry(new WeightedRandomLootObject(Item.olivine.getDefaultStack(),6,18),30)
			.addEntry(new WeightedRandomLootObject(Item.oreRawIron.getDefaultStack(),6,12),10)
			//IDK how to drop Lapis lazuli
			//.addEntry(new WeightedRandomLootObject(Item.dye.getDefaultStack(),12,20),25)
			.addEntry(new WeightedRandomLootObject(Item.quartz.getDefaultStack(),6,12),10)
			.create("DoublePacketGravel");
		RecipeBuilder.Trommel(Compactedstuff.MOD_ID)
			.setInput(CompactedBlocks.compactedSand)
			.addEntry(new WeightedRandomLootObject(Item.flint.getDefaultStack(),3,6),8)
			.addEntry(new WeightedRandomLootObject(Item.olivine.getDefaultStack(),5),4)
			.addEntry(new WeightedRandomLootObject(Item.oreRawGold.getDefaultStack(),3,6),13)
			.addEntry(new WeightedRandomLootObject(Item.bone.getDefaultStack(),3,9),10)
			.addEntry(new WeightedRandomLootObject(Item.quartz.getDefaultStack(),9,18),40)
			.addEntry(new WeightedRandomLootObject(Item.clay.getDefaultStack(),12,18),25)
			.create("PacketSand");
		// РАСКИДАТЬ ВЕСА
		RecipeBuilder.Trommel(Compactedstuff.MOD_ID)
			.setInput(CompactedBlocks.doubleCompactedSand)
			.addEntry(new WeightedRandomLootObject(Item.flint.getDefaultStack(),9,18),8)
			.addEntry(new WeightedRandomLootObject(Item.olivine.getDefaultStack(),15),4)
			.addEntry(new WeightedRandomLootObject(Item.oreRawGold.getDefaultStack(),9,18),13)
			.addEntry(new WeightedRandomLootObject(Item.bone.getDefaultStack(),9,27),10)
			.addEntry(new WeightedRandomLootObject(Item.quartz.getDefaultStack(),27,54),40)
			.addEntry(new WeightedRandomLootObject(Item.clay.getDefaultStack(),36,54),25)
			.create("DoubleCompactedSand");
		RecipeBuilder.Trommel(Compactedstuff.MOD_ID)
			.setInput(CompactedBlocks.compactedDirt)
			.addEntry(new WeightedRandomLootObject(Item.clay.getDefaultStack(),3,15),25)
			.addEntry(new WeightedRandomLootObject(Item.olivine.getDefaultStack(),3),30)
			.addEntry(new WeightedRandomLootObject(Item.oreRawIron.getDefaultStack(),3),10)
			.addEntry(new WeightedRandomLootObject(Item.flint.getDefaultStack(),3,6),25)
			.addEntry(new WeightedRandomLootObject(Item.quartz.getDefaultStack(),3,6),10)
			.create("PacketDirt");
		RecipeBuilder.Trommel(Compactedstuff.MOD_ID)
			.setInput(CompactedBlocks.doubleCompactedDirt)
			.addEntry(new WeightedRandomLootObject(Item.clay.getDefaultStack(),6,30),25)
			.addEntry(new WeightedRandomLootObject(Item.olivine.getDefaultStack(),6,12),30)
			.addEntry(new WeightedRandomLootObject(Item.oreRawIron.getDefaultStack(),6,12),10)
			.addEntry(new WeightedRandomLootObject(Item.flint.getDefaultStack(),6),25)
			.addEntry(new WeightedRandomLootObject(Item.quartz.getDefaultStack(),6,12),10)
			.create("DoublePacketDirt");

	}


	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}
}
