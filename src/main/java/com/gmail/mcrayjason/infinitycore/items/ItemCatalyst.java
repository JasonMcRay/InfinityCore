package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

@SuppressWarnings("deprecation")
public class ItemCatalyst extends ItemIFC {
    int itemCount = 8;

    public IIcon[] icons = new IIcon[itemCount];
    public ItemCatalyst(String name) {
        super(name);
        this.setHasSubtypes(true);
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack)
    {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack itemStack)
    {
        return EnumRarity.rare;
    }

    @Override
    public void registerIcons(IIconRegister regIcon)
    {
        this.icons[0] = regIcon.registerIcon(Reference.MODID + ":" + "catalysts/" + "magicCatalyst");
        this.icons[1] = regIcon.registerIcon(Reference.MODID + ":" + "catalysts/" + "fuelCatalyst");
        this.icons[2] = regIcon.registerIcon(Reference.MODID + ":" + "catalysts/" + "naturalCatalyst");
        this.icons[3] = regIcon.registerIcon(Reference.MODID + ":" + "catalysts/" + "alloyCatalyst");
        this.icons[4] = regIcon.registerIcon(Reference.MODID + ":" + "catalysts/" + "crystalCatalyst");
        this.icons[5] = regIcon.registerIcon(Reference.MODID + ":" + "catalysts/" + "lesserMetalCatalyst");
        this.icons[6] = regIcon.registerIcon(Reference.MODID + ":" + "catalysts/" + "preciousMetalCatalyst");
        this.icons[7] = regIcon.registerIcon(Reference.MODID + ":" + "catalysts/" + "greaterMetalCatalyst");

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

