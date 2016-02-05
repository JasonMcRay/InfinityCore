package com.gmail.mcrayjason.infinitycore.init;


import com.gmail.mcrayjason.infinitycore.helpers.RegisterHelper;
import com.gmail.mcrayjason.infinitycore.items.ItemCluster;
import com.gmail.mcrayjason.infinitycore.items.ItemIFC;
import com.gmail.mcrayjason.infinitycore.items.ItemMaterial;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item itemCluster = new ItemCluster("itemCluster");
    public static Item itemMaterial = new ItemMaterial("itemMaterial");
    public static Item droneFrame = new ItemIFC("droneFrame");

    public static void registerItems()
    {
        RegisterHelper.registerItem(itemCluster);
        RegisterHelper.registerItem(itemMaterial);
        RegisterHelper.registerItem(droneFrame);
    }
}
