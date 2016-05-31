package com.gmail.mcrayjason.infinitycore.compatibility;

import com.gmail.mcrayjason.infinitycore.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict
{
    public static void oreRegister()
    {
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
        OreDictionary.registerOre("clusterUniversal", new ItemStack(ModItems.itemCluster, 1, 16));
        OreDictionary.registerOre("clusterLithium", new ItemStack(ModItems.itemCluster, 1, 17));
        OreDictionary.registerOre("clusterManganese", new ItemStack(ModItems.itemCluster, 1, 18));
        OreDictionary.registerOre("clusterAntimony", new ItemStack(ModItems.itemCluster, 1, 19));
        OreDictionary.registerOre("clusterEndium", new ItemStack(ModItems.itemCluster, 1, 20));
        OreDictionary.registerOre("clusterYellorium", new ItemStack(ModItems.itemCluster, 1, 21));
        OreDictionary.registerOre("clusterDesh", new ItemStack(ModItems.itemCluster, 1, 22));

        OreDictionary.registerOre("nuggetEnderiumBase", new ItemStack(ModItems.itemMaterial, 1, 1));
        OreDictionary.registerOre("plateIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 2));
        OreDictionary.registerOre("stickIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 3));
        OreDictionary.registerOre("ringIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 4));
        OreDictionary.registerOre("boltIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 5));
        OreDictionary.registerOre("screwIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 6));
        OreDictionary.registerOre("dustIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 7));
        OreDictionary.registerOre("dustSmallIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 8));
        OreDictionary.registerOre("dustTinyIronCompressed", new ItemStack(ModItems.itemMaterial, 1, 9));
        OreDictionary.registerOre("plateVoid", new ItemStack(ModItems.itemMaterial, 1, 10));
        OreDictionary.registerOre("stickCobblestone", new ItemStack(ModItems.itemMaterial, 1, 13));
        OreDictionary.registerOre("stickSandstone", new ItemStack(ModItems.itemMaterial, 1, 14));
        OreDictionary.registerOre("stickHardenedClay", new ItemStack(ModItems.itemMaterial, 1, 15));
        OreDictionary.registerOre("foodSalt", new ItemStack(ModItems.itemMaterial, 1, 16));
        OreDictionary.registerOre("dustChromicPlatinum", new ItemStack(ModItems.itemMaterial, 1, 19));
        OreDictionary.registerOre("dustEnergeticAlloy", new ItemStack(ModItems.itemMaterial, 1, 20));
        OreDictionary.registerOre("dustVibrantAlloy", new ItemStack(ModItems.itemMaterial, 1, 21));
        OreDictionary.registerOre("dustPhasedGold", new ItemStack(ModItems.itemMaterial, 1, 21));

        OreDictionary.registerOre("dustNaquadah", new ItemStack(ModItems.itemSpecialWG, 1, 0));

        OreDictionary.registerOre("craftingToolElectricSaw", new ItemStack(ModItems.itemDummy, 1, 2));
        OreDictionary.registerOre("craftingToolElectricWrench", new ItemStack(ModItems.itemDummy, 1, 3));
        OreDictionary.registerOre("craftingToolElectricBuzzsaw", new ItemStack(ModItems.itemDummy, 1, 4));
        OreDictionary.registerOre("craftingToolElectricScrewdriver", new ItemStack(ModItems.itemDummy, 1, 5));

        OreDictionary.registerOre("capInertIchorium", new ItemStack(ModItems.itemKami, 1, 0));
        OreDictionary.registerOre("ringIchorium", new ItemStack(ModItems.itemKami, 1, 1));
        OreDictionary.registerOre("threadIchorium", new ItemStack(ModItems.itemKami, 1, 2));
        OreDictionary.registerOre("threadReinforced", new ItemStack(ModItems.itemKami, 1, 3));

    }
}
