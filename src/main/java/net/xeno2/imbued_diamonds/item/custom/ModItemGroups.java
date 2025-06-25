package net.xeno2.imbued_diamonds.item.custom;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xeno2.imbued_diamonds.ImbuedDiamonds;
import net.xeno2.imbued_diamonds.block.custom.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ImbuedDiamonds.MOD_ID, "imbued_diamond_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.IMBUED_DIAMOND))
                    .displayName(Text.translatable("itemgroup.imbued_diamonds.imbued_diamond_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HOT_DIAMOND);
                        entries.add(ModItems.IMBUED_DIAMOND_SHARD);
                        entries.add(ModItems.IMBUED_DIAMOND);
                        entries.add(ModBlocks.IMBUED_DIAMOND_BLOCK);
                        entries.add(ModItems.IMBUED_DIAMOND_HELMET);
                        entries.add(ModItems.IMBUED_DIAMOND_CHESTPLATE);
                        entries.add(ModItems.IMBUED_DIAMOND_LEGGINGS);
                        entries.add(ModItems.IMBUED_DIAMOND_BOOTS);
                    })
                    .build());


    public static void registerItemGroups() {
        ImbuedDiamonds.LOGGER.info("Registering Mod Item Groups for " + ImbuedDiamonds.MOD_ID);

    }
}
