package net.xeno2.imbued_diamonds.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.xeno2.imbued_diamonds.ImbuedDiamonds;
import net.xeno2.imbued_diamonds.item.custom.ModItems;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterial {
    public static final RegistryEntry<ArmorMaterial> IMBUED_DIAMOND_ARMOR_MATERIAL = registerArmorMaterial("imbued_diamond",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,  () -> Ingredient.ofItems(ModItems.IMBUED_DIAMOND),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ImbuedDiamonds.MOD_ID, "imbued_diamond"))), 3.0f, 0.1f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material){
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(ImbuedDiamonds.MOD_ID, name), material.get());
    }
}
