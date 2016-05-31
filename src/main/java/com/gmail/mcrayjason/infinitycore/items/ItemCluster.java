package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemCluster extends ItemIFC {

    private int itemCount = 23;

    private IIcon[] icons = new IIcon[itemCount];
    public ItemCluster(String name) {
        super(name);
        this.setHasSubtypes(true);
    }
    @Override
    public void registerIcons(IIconRegister regIcon)
    {
            this.icons[0] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterAluminium");
            this.icons[1] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterBeryllium");
            this.icons[2] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterCobalt");
            this.icons[3] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterIridium");
            this.icons[4] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterMolybdenum");
            this.icons[5] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterNaquadah");
            this.icons[6] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterNeodymium");
            this.icons[7] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterNickel");
            this.icons[8] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterPalladium");
            this.icons[9] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterPlatinum");
            this.icons[10] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterThorium");
            this.icons[11] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterTungsten");
            this.icons[12] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterUranium235");
            this.icons[13] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterUranium238");
            this.icons[14] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterZinc");
            this.icons[15] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterCassiterite");
            this.icons[16] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterUniversal");
            this.icons[17] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterLithium");
            this.icons[18] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterManganese");
            this.icons[19] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterAntimony");
            this.icons[20] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterEndium");
            this.icons[21] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterYellorium");
            this.icons[22] = regIcon.registerIcon(Reference.MODID + ":" + "clusters/" + "clusterDesh");
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