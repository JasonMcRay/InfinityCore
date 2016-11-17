package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

@SuppressWarnings("deprecation")
public class ItemMaterial extends ItemIFC
{
    int itemCount = 29;

    public IIcon[] icons = new IIcon[itemCount];
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
        this.icons[10] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "plateVoid");
        this.icons[11] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "epoxyCoatedPlastic");
        this.icons[12] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "hotGalgadorianMetal");
        this.icons[13] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "rodCobblestone");
        this.icons[14] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "rodSandstone");
        this.icons[15] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "rodHardenedClay");
        this.icons[16] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "foodSalt");
        this.icons[17] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "seedsBalancedInfused");
        this.icons[18] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "tinplateSteel");
        this.icons[19] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "dustChromicPlatinum");
        this.icons[20] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "dustEnergeticAlloy");
        this.icons[21] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "dustVibrantAlloy");
        this.icons[22] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "crystallineSeed");
        this.icons[23] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "plateElectricalSteel");
        this.icons[24] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "itemCasingElectricalSteel");
        this.icons[25] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "rottenLeather");
        this.icons[26] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "ingotHotDimensionalAlloy");
        this.icons[27] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "ingotDimensionalAlloy");
        this.icons[28] = regIcon.registerIcon(Reference.MODID + ":" + "materials/" + "plateDimensionalAlloy");
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
