package com.gmail.mcrayjason.infinitycore.init;


import com.gmail.mcrayjason.infinitycore.helpers.RegisterHelper;
import com.gmail.mcrayjason.infinitycore.items.ItemCluster;
import com.gmail.mcrayjason.infinitycore.items.ItemIFC;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item rodWooden = new ItemIFC("rodWooden");
    public static Item itemCluster = new ItemCluster("itemCluster");

    public static void registerItems()
    {
        RegisterHelper.registerItem(rodWooden);
        RegisterHelper.registerItem(itemCluster);
    }
}
