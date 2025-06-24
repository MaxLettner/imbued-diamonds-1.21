package net.xeno2.imbued_diamonds.item.custom;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xeno2.imbued_diamonds.ImbuedDiamonds;

public class ModItems {

    public static final Item HOT_DIAMOND = registerItem("hot_diamond", new Item(new Item.Settings()));
    public static final Item IMBUED_DIAMOND = registerItem("imbued_diamond", new Item(new Item.Settings()));


    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ImbuedDiamonds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ImbuedDiamonds.LOGGER.info("Registering Mod Items for " + ImbuedDiamonds.MOD_ID);

    }
}
