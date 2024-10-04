package me.jonasjones.nec;

import me.jonasjones.nec.block.ModBlocks;
import me.jonasjones.nec.item.ModItems;
import me.jonasjones.nec.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotEnoughCursedness implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static String MOD_ID = "nec";
	//public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
		ModRegistries.registerModStuffs();
	}
}
