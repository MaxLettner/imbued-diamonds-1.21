package net.xeno2.imbued_diamonds.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.xeno2.imbued_diamonds.ImbuedDiamonds;

public class ModBlocks {
    public static final Block IMBUED_DIAMOND_BLOCK = registerBlock("imbued_diamond_block", new Block(AbstractBlock.Settings.create().
            strength(10f).sounds(BlockSoundGroup.NETHERITE).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ImbuedDiamonds.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ImbuedDiamonds.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ImbuedDiamonds.LOGGER.info("Registering Mod Blocks for " + ImbuedDiamonds.MOD_ID);
    }
}
