package MISSmyIDmods.compactedstuff;

import MISSmyIDmods.compactedstuff.block.CompactedBlocks;
import net.minecraft.core.block.Block;
import turniplabs.halplibe.util.ConfigUpdater;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompactedstuffConfig {
	public static ConfigUpdater updater = ConfigUpdater.fromProperties(new String[0]);
	private static final Toml properties = new Toml("Compacted Stuff Toml Config");
	public static TomlConfigHandler cfg;
	private static int BlockIDs = 3103;
	public CompactedstuffConfig(){}

	static {
		properties.addCategory("CompactedStuff").addEntry("cfgVersion",5);
		properties.addCategory("Block IDs");
		properties.addEntry("Block IDs.startingID", 3103);

		List blockFields = (List) Arrays.stream(CompactedBlocks.class.getDeclaredFields()).filter((F) -> {
			return Block.class.isAssignableFrom(F.getType());
		}).collect(Collectors.toList());

		for (Object field : blockFields) {
			Field blockField = (Field) field;
			properties.addEntry("Block IDs." + blockField.getName(), BlockIDs++);
		}

		cfg = new TomlConfigHandler(updater, "compactedstuff", properties);

	}
}
