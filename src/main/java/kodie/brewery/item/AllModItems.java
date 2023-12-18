package kodie.brewery.item;

import kodie.brewery.TheBrewery;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class AllModItems {

    public static final Item BARLEY = registerItem("barley", new Item(new FabricItemSettings()));
    public static final Item GRAPES = registerItem("grapes", new Item(new FabricItemSettings()));


    private static void addItemToFoodTab(FabricItemGroupEntries entries) {
        entries.add(BARLEY);
        entries.add(GRAPES);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheBrewery.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheBrewery.LOGGER.info("[" + TheBrewery.MOD_ID + "]: All items registered!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(AllModItems::addItemToFoodTab);
    }
}
