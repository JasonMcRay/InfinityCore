package com.gmail.mcrayjason.infinitycore;

import com.gmail.mcrayjason.infinitycore.compatibility.CrossModCompat;
import com.gmail.mcrayjason.infinitycore.compatibility.OreDict;
import com.gmail.mcrayjason.infinitycore.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION/*, dependencies = "required-after:gregtech; after:Thaumcraft; after:PneumaticCraft; after:MagicBees; after:HardcoreEnderExpansion"*/)
public class InfinityCore
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance(Reference.MODID)
    public static InfinityCore instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) // Items, Blocks, Entities
    {
        CrossModCompat.sendIMCMessages();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) // Recipes and such
    {
        //Recipes.registerRecipes();
        OreDict.oreRegister();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.cape();
    }
}
