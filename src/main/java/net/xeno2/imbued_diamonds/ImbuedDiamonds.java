package net.xeno2.imbued_diamonds;

import net.fabricmc.api.ModInitializer;

import net.xeno2.imbued_diamonds.block.custom.ModBlocks;
import net.xeno2.imbued_diamonds.item.custom.ModItemGroups;
import net.xeno2.imbued_diamonds.item.custom.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImbuedDiamonds implements ModInitializer {
	public static final String MOD_ID = "imbued_diamonds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}