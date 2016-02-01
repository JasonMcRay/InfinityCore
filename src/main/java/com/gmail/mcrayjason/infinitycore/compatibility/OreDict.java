package com.gmail.mcrayjason.infinitycore.compatibility;

import com.gmail.mcrayjason.infinitycore.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict
{
    public static void oreRegister()
    {
        OreDictionary.registerOre("nuggetEnderiumBase", new ItemStack(ModItems.itemMaterial, 1, 1));
        OreDictionary.registerOre("clusterAluminium", new ItemStack(ModItems.itemCluster, 1, 0));
        OreDictionary.registerOre("clusterBeryllium", new ItemStack(ModItems.itemCluster, 1, 1));
        OreDictionary.registerOre("clusterCobalt", new ItemStack(ModItems.itemCluster, 1, 2));
        OreDictionary.registerOre("clusterIridium", new ItemStack(ModItems.itemCluster, 1, 3));
        OreDictionary.registerOre("clusterMolybdenum", new ItemStack(ModItems.itemCluster, 1, 4));
        OreDictionary.registerOre("clusterNaquadah", new ItemStack(ModItems.itemCluster, 1, 5));
        OreDictionary.registerOre("clusterNeodymium", new ItemStack(ModItems.itemCluster, 1, 6));
        OreDictionary.registerOre("clusterNickel", new ItemStack(ModItems.itemCluster, 1, 7));
        OreDictionary.registerOre("clusterPalladium", new ItemStack(ModItems.itemCluster, 1, 8));
        OreDictionary.registerOre("clusterPlatinum", new ItemStack(ModItems.itemCluster, 1, 9));
        OreDictionary.registerOre("clusterThorium", new ItemStack(ModItems.itemCluster, 1, 10));
        OreDictionary.registerOre("clusterTungsten", new ItemStack(ModItems.itemCluster, 1, 11));
        OreDictionary.registerOre("clusterUranium235", new ItemStack(ModItems.itemCluster, 1, 12));
        OreDictionary.registerOre("clusterUranium", new ItemStack(ModItems.itemCluster, 1, 13));
        OreDictionary.registerOre("clusterZinc", new ItemStack(ModItems.itemCluster, 1, 14));
        OreDictionary.registerOre("clusterCassiterite", new ItemStack(ModItems.itemCluster, 1, 15));
        OreDictionary.registerOre("plateIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 2));
        OreDictionary.registerOre("stickIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 3));
        OreDictionary.registerOre("ringIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 4));
        OreDictionary.registerOre("boltIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 5));
        OreDictionary.registerOre("screwIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 6));
        OreDictionary.registerOre("dustIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 7));
        OreDictionary.registerOre("dustSmallIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 8));
        OreDictionary.registerOre("dustTinyIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 9));
        OreDictionary.registerOre("plateVoid", new ItemStack(ModItems.itemMaterial, 1, 10));
    }
}
