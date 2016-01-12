package com.gmail.mcrayjason.infinitycore;

import com.gmail.mcrayjason.infinitycore.init.ModItems;
import com.gmail.mcrayjason.infinitycore.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class InfinityCore
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance(Reference.MODID)
    public static InfinityCore instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) // Items, Blocks, Entities
    {
        ModItems.registerItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) // Recipes and such
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
