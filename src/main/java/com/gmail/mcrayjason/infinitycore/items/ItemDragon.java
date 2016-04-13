package com.gmail.mcrayjason.infinitycore.items;

import com.gmail.mcrayjason.infinitycore.Reference;
import com.gmail.mcrayjason.infinitycore.creativetab.CreativeTabIFC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class ItemDragon extends Item {
    public ItemDragon(String name)
    {
        super();
        this.setCreativeTab(CreativeTabIFC.IFC_TAB);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MODID + ":" + name);
    }

    @SuppressWarnings("unchecked")
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean bool) {
        if (itemstack != null) {
            if (GuiScreen.isShiftKeyDown()) {
                info.add(EnumChatFormatting.LIGHT_PURPLE + "Needs to be infused with at least 150 Dragon Essence");
        } else {
                info.add(EnumChatFormatting.WHITE + "<Press SHIFT>");
            }
        }
    }
}
