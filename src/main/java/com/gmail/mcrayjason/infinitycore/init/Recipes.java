package com.gmail.mcrayjason.infinitycore.init;

import com.gmail.mcrayjason.infinitycore.helpers.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import crazypants.enderio.EnderIO;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import li.cil.oc.api.API;
import li.cil.oc.api.detail.ItemAPI;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import pneumaticCraft.common.block.Blockss;
import pneumaticCraft.common.item.Itemss;

import java.util.Iterator;
import java.util.List;

public class Recipes {
    @SuppressWarnings("RedundantArrayCreation")
    public static void registerRecipes() {
        // Crafting Recipes
        // Blocks
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.pneumaticCasing),
                "ppp", "pwp", "ppp",
                'p', "plateIronCompressed", 'w', "craftingToolWrench"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.pneumaticCasingAdvanced),
                "pPp", "PwP", "pPp",
                'p', "plateIronCompressed", 'P', new ItemStack(Itemss.plastic, 1, 4), 'w', "craftingToolWrench"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.pneumaticHull),
                "wPw", "tCt",
                'w', "plateWroughtIron", 'P', new ItemStack(ModItems.itemMaterial, 1, 2), 't', new ItemStack(Blockss.pressureTube, 1, 0), 'C', new ItemStack(ModBlocks.pneumaticCasing)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.pneumaticHullAdvanced),
                "pPp", "tCt",
                'p', "platePlastic", 'P', new ItemStack(Itemss.plastic, 1, 4), 't', new ItemStack(Blockss.advancedPressureTube, 1, 0), 'C', new ItemStack(ModBlocks.pneumaticCasingAdvanced)));

        // Items
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemMaterial, 1, 0),
                "swf",
                's', "craftingToolSaw", 'w', "plateWood", 'f', "craftingToolFile"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.itemMaterial, 9, 1), "ingotEnderiumBase"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(EnderIO.itemPowderIngot, 1, 6),
                "nnn", "nnn", "nnn",
                'n', "nuggetEnderiumBase"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.droneFrame),
                "rer", "mcm", "Srs",
                'r', new ItemStack(Itemss.turbineRotor), 'e', "oc:eeprom", 'm', "oc:ram2", 'c', "oc:droneCase1", 'S', new ItemStack(ModItems.itemMaterial, 1, 6), 's', "craftingToolScrewdriver"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.droneFrame),
                "rer", "mcm", "srS",
                'r', new ItemStack(Itemss.turbineRotor), 'e', "oc:eeprom", 'm', "oc:ram2", 'c', "oc:droneCase1", 'S', new ItemStack(ModItems.itemMaterial, 1, 6), 's', "craftingToolScrewdriver"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemMaterial, 1, 13),
                "f  ", " c ",
                'f', "craftingToolFile", 'c', "cobblestone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemMaterial, 1, 14),
                "f  ", " s ",
                'f', "craftingToolFile", 's', "sandstone"));


        // GregTech Processing Recipes
        ItemAPI itemsOC = API.items;
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModItems.itemMaterial, 8, 2), ItemList.Circuit_Integrated.getWithDamage(0L, 8L, new Object[0]), new ItemStack(ModBlocks.pneumaticCasing), 50, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModItems.itemMaterial, 4, 2), new ItemStack(Itemss.plastic, 4, 4), new ItemStack(ModBlocks.pneumaticCasingAdvanced), 50, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModBlocks.pneumaticCasing), new ItemStack(Blockss.pressureTube, 2), Materials.Plastic.getMolten(288), new ItemStack(ModBlocks.pneumaticHull), 50, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModBlocks.pneumaticCasingAdvanced), new ItemStack(Blockss.advancedPressureTube, 2), Materials.Plastic.getMolten(288), new ItemStack(ModBlocks.pneumaticHullAdvanced), 50, 16);
        GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silver, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Platinum, 1L), Materials.Tin.getMolten(288), Materials.EnderiumBase.getMolten(576), null, 100, 300);
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModItems.droneFrame), new ItemStack(Itemss.printedCircuitBoard), Materials.Plastic.getMolten(144), new ItemStack(Itemss.drone), 600, 120);
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModItems.droneFrame), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 1L), Materials.Plastic.getMolten(144), new ItemStack(Itemss.logisticsDrone), 200, 30);
        GT_Values.RA.addChemicalBathRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Plastic, 1L), Materials.Epoxid.getMolten(144), new ItemStack(ModItems.itemMaterial, 1, 11), null, null, new int[] { 9000 }, 400, 10);
        GT_Values.RA.addFormingPressRecipe(new ItemStack(ModItems.itemMaterial, 1, 11), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.AnnealedCopper, 2L), new ItemStack(Itemss.emptyPCB, 1, 100), 200, 60);

        // Smelting Recipes
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 1), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Beryllium, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 2), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Cobalt, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 4), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Molybdenum, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 7), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Nickel, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 9), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Platinum, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 10), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Thorium, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 12), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Uranium235, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 13), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Uranium, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 14), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Zinc, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 15), (GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Tin, 4L)), 0F);
    }

    public static void removeCraftingRecipes() {
        removeRecipe(Itemss.drone);
        removeRecipe(Itemss.logisticsDrone);
        }

    @SuppressWarnings("unchecked")
    public static void removeRecipe(Item output){
            int recipesRemoved = 0;

        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
        Iterator<IRecipe> remover = recipes.iterator();

        while (remover.hasNext()) {
            ItemStack itemstack = remover.next().getRecipeOutput();

            if (itemstack != null && itemstack.getItem() == output && itemstack.getTagCompound() == null){
                remover.remove();
                recipesRemoved++;
            }
        }
            LogHelper.info("Removed %d recipes for %s", recipesRemoved, Item.itemRegistry.getNameForObject(output));
    }
}


