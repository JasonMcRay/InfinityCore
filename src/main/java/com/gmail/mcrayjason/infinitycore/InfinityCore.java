package com.gmail.mcrayjason.infinitycore;

import com.gmail.mcrayjason.infinitycore.compatibility.CrossModCompat;
import com.gmail.mcrayjason.infinitycore.compatibility.OreDict;
import com.gmail.mcrayjason.infinitycore.handlers.EventHandler;
import com.gmail.mcrayjason.infinitycore.helpers.LogHelper;
import com.gmail.mcrayjason.infinitycore.init.ModBlocks;
import com.gmail.mcrayjason.infinitycore.init.ModItems;
import com.gmail.mcrayjason.infinitycore.init.Recipes;
import com.gmail.mcrayjason.infinitycore.proxies.CommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:gregtech; after:Thaumcraft; after:PneumaticCraft; after:MagicBees")
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
        ModBlocks.registerBlocks();
        CrossModCompat.sendIMCMessages();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) // Recipes and such
    {
        Recipes.registerRecipes();
        OreDict.oreRegister();
        FMLCommonHandler.instance().bus().register(new EventHandler());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        Recipes.removeCraftingRecipes();
        Recipes.registerThaumcraftRecipes();
        Recipes.addResearches();
        LogHelper.info("Dressing Capes");
        proxy.cape();
    }
}
