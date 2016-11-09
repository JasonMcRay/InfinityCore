package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemKami extends ItemIFC {
    private int itemCount = 5;

    private IIcon[] icons = new IIcon[itemCount];

    public ItemKami(String name) {
        super(name);
        this.setHasSubtypes(true);
    }
    @Override
    public void registerIcons(IIconRegister regIcon)
    {
        this.icons[0] = regIcon.registerIcon(Reference.MODID + ":" + "itemsKami/" + "inertCapIchor");
        this.icons[1] = regIcon.registerIcon(Reference.MODID + ":" + "itemsKami/" + "ringIchor");
        this.icons[2] = regIcon.registerIcon(Reference.MODID + ":" + "itemsKami/" + "threadIchor");
        this.icons[3] = regIcon.registerIcon(Reference.MODID + ":" + "itemsKami/" + "threadReinforced");
        this.icons[4] = regIcon.registerIcon(Reference.MODID + ":" + "itemsKami/" + "firestoneEnderShifted");
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
