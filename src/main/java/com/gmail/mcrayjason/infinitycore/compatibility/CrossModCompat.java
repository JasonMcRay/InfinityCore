package com.gmail.mcrayjason.infinitycore.compatibility;

import com.gmail.mcrayjason.infinitycore.InfinityCore;
import com.gmail.mcrayjason.infinitycore.helpers.LogHelper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.nbt.NBTTagCompound;

import java.io.IOException;


public class CrossModCompat {
    public static void sendIMCMessages() {
        if (Loader.isModLoaded("headcrumbs")) {
            addPatronHeads();
        }
    }

    private static void addPatronHeads() {
        LogHelper.info("Adding Patreon Heads to the Loot tables. Thank you very much my Patrons!");
        try {
            String data = Resources.toString(Resources.getResource(InfinityCore.class, "/minetweaker/PatreonHeads.zs"), Charsets.UTF_8);
            NBTTagCompound nbtData = new NBTTagCompound();
            nbtData.setString("name", "PatreonHeads.zs");
            nbtData.setString("content", data);
            FMLInterModComms.sendMessage("MineTweaker3", "addMineTweakerScript", nbtData);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}