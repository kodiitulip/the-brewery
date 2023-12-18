package kodie.brewery;

import kodie.brewery.item.AllModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheBrewery implements ModInitializer {
	public static final String MOD_ID = "brewery";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Heya Partner! Ready to brew some beers?");
		AllModItems.registerModItems();
	}
}