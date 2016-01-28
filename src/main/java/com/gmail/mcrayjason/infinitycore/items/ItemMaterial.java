package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemMaterial extends ItemIFC
{
    public IIcon[] icons = new IIcon[10];
    public ItemMaterial(String name) {
        super(name);
        this.setHasSubtypes(true);
    }
    @Override
    public void registerIcons(IIconRegister regIcon)
    {
        this.icons[0] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "rodWooden");
        this.icons[1] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "nuggetEnderiumBase");
        this.icons[2] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "plateIronCompressed");
        this.icons[3] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "stickIronCompressed");
        this.icons[4] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "ringIronCompressed");
        this.icons[5] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "boltIronCompressed");
        this.icons[6] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "screwIronCompressed");
        this.icons[7] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "dustIronCompressed");
        this.icons[8] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "dustSmallIronCompressed");
        this.icons[9] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "dustTinyIronCompressed");
    }

    @Override
    public IIcon getIconFromDamage(int meta)
    {
        if (meta > 9)
            meta = 0;

        return this.icons[meta];
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < 10; i ++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return this.getUnlocalizedName() + "." + stack.getItemDamage();
    }

    @Override
    public int getMetadata(int metadata)
    {
        return metadata;
    }
}
