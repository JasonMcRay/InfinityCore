package com.gmail.mcrayjason.infinitycore.blocks;

import com.gmail.mcrayjason.infinitycore.Reference;
import com.gmail.mcrayjason.infinitycore.creativetab.CreativeTabIFC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMachine extends Block {

    public BlockMachine(String name)
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTabIFC.IFC_TAB);
        this.setBlockName(name);
        this.setBlockTextureName(Reference.MODID + ":" + name);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }
}
