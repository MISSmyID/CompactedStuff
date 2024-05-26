package MISSmyIDmods.compactedstuff;

import MISSmyIDmods.compactedstuff.block.*;
import MISSmyIDmods.compactedstuff.block.entity.EntityDoubleCompactedGravel;
import MISSmyIDmods.compactedstuff.block.entity.EntityDoubleCompactedSand;
import MISSmyIDmods.compactedstuff.block.entity.EntityCompactedGravel;
import MISSmyIDmods.compactedstuff.block.entity.EntityCompactedSand;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class Compactedstuff implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
	public static final String MOD_ID = "compactedstuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static int entityID = 320;


	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("compactedstuff initialized.");
	}

	@Override
	public void beforeGameStart() {
		CompactedBlocks.InitializeBlocks();
		EntityHelper.Core.createEntity(EntityCompactedSand.class,entityID++, "FallingCompactedSand");
		EntityHelper.Core.createEntity(EntityDoubleCompactedSand.class,entityID++, "FallingDoubleCompactedSand");
		EntityHelper.Core.createEntity(EntityCompactedGravel.class,entityID++, "FallingCompactedGravel");
		EntityHelper.Core.createEntity(EntityDoubleCompactedGravel.class,entityID++, "FallingCompactedSand");
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
	CompactedRecipes.InitializeRecipes();
	}


}
