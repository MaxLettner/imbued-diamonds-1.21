package net.xeno2.imbued_diamonds.item.custom;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.xeno2.imbued_diamonds.ImbuedDiamonds;
import net.xeno2.imbued_diamonds.item.ModArmorMaterial;

public class ModItems {

    public static final Item HOT_DIAMOND = registerItem("hot_diamond", new Item(new Item.Settings()));
    public static final Item IMBUED_DIAMOND = registerItem("imbued_diamond", new Item(new Item.Settings()));
    public static final Item IMBUED_DIAMOND_SHARD = registerItem("imbued_diamond_shard", new Item(new Item.Settings()));
    public static final Item POWERED_DIAMOND = registerItem("powered_diamond", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item BLANK_SCEPTER = registerItem("blank_scepter", new Item(new Item.Settings().maxCount(1)));
    public static final Item IMBUED_SCEPTER = registerItem("imbued_scepter", new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)));
    

    public static final Item IMBUED_DIAMOND_HELMET = registerItem("imbued_diamond_helmet",
            new ArmorItem(ModArmorMaterial.IMBUED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item IMBUED_DIAMOND_CHESTPLATE = registerItem("imbued_diamond_chestplate",
            new ArmorItem(ModArmorMaterial.IMBUED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item IMBUED_DIAMOND_LEGGINGS = registerItem("imbued_diamond_leggings",
        new ArmorItem(ModArmorMaterial.IMBUED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item IMBUED_DIAMOND_BOOTS = registerItem("imbued_diamond_boots",
            new ArmorItem(ModArmorMaterial.IMBUED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));


    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ImbuedDiamonds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ImbuedDiamonds.LOGGER.info("Registering Mod Items for " + ImbuedDiamonds.MOD_ID);

    }
}
