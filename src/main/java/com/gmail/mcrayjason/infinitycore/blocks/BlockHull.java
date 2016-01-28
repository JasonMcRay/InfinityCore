package com.gmail.mcrayjason.infinitycore.blocks;

import com.gmail.mcrayjason.infinitycore.Reference;
import com.gmail.mcrayjason.infinitycore.creativetab.CreativeTabIFC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
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

    public IIcon frontTexture;
    public IIcon defaultTexture;

    public void registerBlockIcons(IIconRegister regIcon)
    {
        frontTexture = regIcon.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5) + "_FRONT");
        defaultTexture = regIcon.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }

    public IIcon getIcon(int side, int meta)
    {
        if (side == 1) return this.defaultTexture;
        else if (side == 0) return this.defaultTexture;
        else if (meta == 2 && side == 2) return this.frontTexture;
        else if (meta == 3 && side == 5) return this.frontTexture;
        else if (meta == 0 && side == 3) return this.frontTexture;
        else if (meta == 1 && side == 4) return this.frontTexture;
        else return this.defaultTexture;
    }

    public void onBlockPlacedBy(World par1World, int x, int y, int z, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int whichDirectionFacing = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(x, y, z, whichDirectionFacing, 2);
    }
}
