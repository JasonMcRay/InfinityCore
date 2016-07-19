package com.gmail.mcrayjason.infinitycore.handlers;

import com.gmail.mcrayjason.infinitycore.Reference;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import joshie.enchiridion.designer.ItemBook;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;


public class EventHandler
{
    /*@SubscribeEvent
    public void playerLoggedIn(PlayerLoggedInEvent event)
    {
        EntityPlayer player = event.player;
        NBTTagCompound tag = player.getEntityData();

        if (!tag.hasKey(EntityPlayer.PERSISTED_NBT_TAG))
            tag.setTag(EntityPlayer.PERSISTED_NBT_TAG, new NBTTagCompound());

        NBTTagCompound persistTag = tag.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);

                if(!persistTag.getBoolean(Reference.MODID + ":givenNEIGuide"))
                {
                    persistTag.setBoolean(Reference.MODID + ":givenNEIGuide", true);

                    givePlayerNEIBook(player);
        }
    }

    public void givePlayerNEIBook(EntityPlayer player)
    {
        ItemBook itemBook = (ItemBook) GameRegistry.findItem("Enchiridion2", "book");
        ItemStack stack = new ItemStack(itemBook, 1, 0);
        if (!player.inventory.hasItem(itemBook))
        {
            stack.setTagCompound(new NBTTagCompound());
        stack.stackTagCompound.setString("identifier", "GUIDE_NEI");
            player.inventory.addItemStackToInventory(stack);
        }
    }*/
}
