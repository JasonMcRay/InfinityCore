package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import com.gmail.mcrayjason.infinitycore.creativetab.CreativeTabIFC;
import net.minecraft.item.Item;

public class ItemIFC extends Item
{
    public ItemIFC(String name)
    {
        super();
        this.setCreativeTab(CreativeTabIFC.IFC_TAB);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MODID + ":" + name);
    }
}
