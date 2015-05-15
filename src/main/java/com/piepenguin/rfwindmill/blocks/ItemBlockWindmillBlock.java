package com.piepenguin.rfwindmill.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class ItemBlockWindmillBlock extends ItemBlock {

    public ItemBlockWindmillBlock(Block pBlock) {
        super(pBlock);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack pItemStack) {
        String name;
        switch(pItemStack.getItemDamage()) {
            default:
            case 0:
                name = "basic";
                break;
            case 1:
                name = "reinforced";
                break;
            case 2:
                name = "hardened";
                break;
            case 3:
                name = "resonant";
                break;
        }
        return getUnlocalizedName() + "." + name;
    }

    @Override
    public int getMetadata(int pMeta) {
        return pMeta;
    }
}