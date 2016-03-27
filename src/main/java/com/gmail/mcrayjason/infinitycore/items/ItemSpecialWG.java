package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import witchinggadgets.api.IPrimordialCrafting;

import java.util.List;

public class ItemSpecialWG extends ItemIFC implements IPrimordialCrafting {

    int itemCount = 1;

    public IIcon[] icons = new IIcon[itemCount];
    public ItemSpecialWG(String name) {
        super(name);
        this.setHasSubtypes(true);
    }
    @Override
    public void registerIcons(IIconRegister regIcon)
    {
        this.icons[0] = regIcon.registerIcon(Reference.MODID + ":" + "itemSpecialWG/" + "dustNaquadah");
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

    @Override
    public int getReturnedPearls(ItemStack stack)
    {
        return 2;
    }
}

