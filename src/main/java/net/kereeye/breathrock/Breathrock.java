package net.kereeye.breathrock;

import net.fabricmc.api.ModInitializer;

import net.kereeye.breathrock.Items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Breathrock implements ModInitializer {
	public static final String MOD_ID = "breathrock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}