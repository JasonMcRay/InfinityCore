package com.gmail.mcrayjason.infinitycore.init;

import cpw.mods.fml.common.registry.GameRegistry;
import crazypants.enderio.EnderIO;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import pneumaticCraft.common.block.Blockss;
import pneumaticCraft.common.item.Itemss;

public class Recipes
{
    @SuppressWarnings("RedundantArrayCreation")
    public static void registerRecipes()
    {
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
        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(ModItems.itemMaterial, 1, 0),
                "swf",
                's', "craftingToolSaw", 'w', "plateWood", 'f', "craftingToolFile"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.itemMaterial, 9, 1), "ingotEnderiumBase"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack (EnderIO.itemPowderIngot, 1, 6),
                "nnn", "nnn", "nnn",
                'n', "nuggetEnderiumBase"));

        // GregTech Processing Recipes
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModItems.itemMaterial, 8, 2), ItemList.Circuit_Integrated.getWithDamage(0L, 8L, new Object[0]), new ItemStack(ModBlocks.pneumaticCasing), 50, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModItems.itemMaterial, 4, 2), new ItemStack(Itemss.plastic, 4, 4), new ItemStack(ModBlocks.pneumaticCasingAdvanced), 50, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModBlocks.pneumaticCasing), new ItemStack(Blockss.pressureTube, 2), Materials.Plastic.getMolten(288) ,new ItemStack(ModBlocks.pneumaticHull), 50, 16);
        GT_Values.RA.addAssemblerRecipe(new ItemStack(ModBlocks.pneumaticCasingAdvanced), new ItemStack(Blockss.advancedPressureTube, 2), Materials.Plastic.getMolten(288),new ItemStack(ModBlocks.pneumaticHullAdvanced), 50, 16);
        GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silver, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Platinum, 1L), Materials.Tin.getMolten(288), Materials.EnderiumBase.getMolten(576), null, 100, 300);

        // Smelting Recipes
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 1),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Beryllium, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 2),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Cobalt, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 4),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Molybdenum, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 7),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Nickel, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 9),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Platinum, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 10),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Thorium, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 12),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Uranium235, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 13),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Uranium, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 14),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Zinc, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 15),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Tin, 4L)), 0F);
    }
}
