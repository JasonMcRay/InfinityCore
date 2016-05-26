package com.gmail.mcrayjason.infinitycore.init;


import com.gmail.mcrayjason.infinitycore.helpers.RegisterHelper;
import com.gmail.mcrayjason.infinitycore.items.*;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item itemCluster = new ItemCluster("itemCluster");
    public static Item itemMaterial = new ItemMaterial("itemMaterial");
    public static Item droneFrame = new ItemIFC("droneFrame");
    public static Item itemDummy = new ItemIFCDummy("itemDummy");
    public static Item itemSpecialWG = new ItemSpecialWG("itemSpecialWG");
    public static Item dormantEgg = new ItemDragon("dormantEgg");
    public static Item itemCatalyst = new ItemCatalyst("itemCatalyst");
    public static Item itemKami = new ItemKami("itemKami");

    public static void registerItems()
    {
        RegisterHelper.registerItem(itemCluster);
        RegisterHelper.registerItem(itemMaterial);
        RegisterHelper.registerItem(droneFrame);
        RegisterHelper.registerItem(itemDummy);
        RegisterHelper.registerItem(itemSpecialWG);
        RegisterHelper.registerItem(dormantEgg);
        RegisterHelper.registerItem(itemCatalyst);
        RegisterHelper.registerItem(itemKami);
    }
}
