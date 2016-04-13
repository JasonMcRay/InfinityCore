package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemCluster extends ItemIFC {
    public IIcon[] icons = new IIcon[16];
    public ItemCluster(String name) {
        super(name);
        this.setHasSubtypes(true);
    }
    @Override
    public void registerIcons(IIconRegister regIcon)
    {
            this.icons[0] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterAluminium");
            this.icons[1] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterBeryllium");
            this.icons[2] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterCobalt");
            this.icons[3] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterIridium");
            this.icons[4] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterMolybdenum");
            this.icons[5] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterNaquadah");
            this.icons[6] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterNeodymium");
            this.icons[7] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterNickel");
            this.icons[8] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterPalladium");
            this.icons[9] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterPlatinum");
            this.icons[10] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterThorium");
            this.icons[11] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterTungsten");
            this.icons[12] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterUranium235");
            this.icons[13] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterUranium238");
            this.icons[14] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterZinc");
            this.icons[15] = regIcon.registerIcon(Reference.MODID + ":" + "cluster/" + "clusterCassiterite");
    }

    @Override
    public IIcon getIconFromDamage(int meta)
    {
        if (meta > 15)
            meta = 0;

        return this.icons[meta];
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < 16; i ++)
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