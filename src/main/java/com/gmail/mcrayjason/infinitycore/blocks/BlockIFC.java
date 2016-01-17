package com.gmail.mcrayjason.infinitycore.blocks;

import com.gmail.mcrayjason.infinitycore.Reference;
import com.gmail.mcrayjason.infinitycore.creativetab.CreativeTabIFC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIFC extends Block
{
    public BlockIFC(String name)
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabIFC.IFC_TAB);
        this.setBlockName(name);
        this.setBlockTextureName(Reference.MODID + ":" + name);
    }

}
