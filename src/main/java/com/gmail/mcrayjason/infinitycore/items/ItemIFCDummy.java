package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;


public class ItemIFCDummy extends ItemIFC
{
    private int itemCount = 8;

    private IIcon[] icons = new IIcon[itemCount];
    public ItemIFCDummy(String name) {
        super(name);
        this.setHasSubtypes(true);
        this.setCreativeTab(null);
    }
    @Override
    public void registerIcons(IIconRegister regIcon)
    {
        this.icons[0] = regIcon.registerIcon(Reference.MODID + ":" + "dummy/" + "permutatio");
        this.icons[1] = regIcon.registerIcon(Reference.MODID + ":" + "dummy/" + "electrum");
        this.icons[2] = regIcon.registerIcon(Reference.MODID + ":" + "dummy/" + "elSaw");
        this.icons[3] = regIcon.registerIcon(Reference.MODID + ":" + "dummy/" + "elWrench");
        this.icons[4] = regIcon.registerIcon(Reference.MODID + ":" + "dummy/" + "elBuzzsaw");
        this.icons[5] = regIcon.registerIcon(Reference.MODID + ":" + "dummy/" + "elScrewdriver");
        this.icons[6] = regIcon.registerIcon(Reference.MODID + ":" + "dummy/" + "elDrill");
        this.icons[7] = regIcon.registerIcon(Reference.MODID + ":" + "dummy/" + "elSolder");
    }

    @Override
    public IIcon getIconFromDamage(int meta)
    {
        if (meta > itemCount - 1)
            meta = 0;

        return this.icons[meta];
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < itemCount; i ++)
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

