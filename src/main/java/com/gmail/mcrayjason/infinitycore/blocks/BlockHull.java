package com.gmail.mcrayjason.infinitycore.blocks;

import com.gmail.mcrayjason.infinitycore.Reference;
import com.gmail.mcrayjason.infinitycore.creativetab.CreativeTabIFC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockHull extends Block {

    public BlockHull (String name)
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTabIFC.IFC_TAB);
        this.setBlockName(name);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

    public IIcon topTexture;
    public IIcon defaultTexture;

    public void registerBlockIcons(IIconRegister regIcon)
    {
        topTexture = regIcon.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5) + "_TOP");
        defaultTexture = regIcon.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }

    public IIcon getIcon(int side, int meta)
    {
        switch(ForgeDirection.getOrientation(side))
        {
            case UP:
                return topTexture;
            default:
                return defaultTexture;
        }
    }
}
