package com.gmail.mcrayjason.infinitycore.creativetab;

import com.gmail.mcrayjason.infinitycore.Reference;
import com.gmail.mcrayjason.infinitycore.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabIFC
{
    public static final CreativeTabs IFC_TAB = new CreativeTabs(Reference.MODID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.infinityStone);
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return Reference.TAB;
        }
    };
}
