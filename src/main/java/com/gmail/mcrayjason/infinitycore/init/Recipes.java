package com.gmail.mcrayjason.infinitycore.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void registerRecipes()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rodWooden), "swf", 's', "craftingToolSaw", 'w', "plankWood", 'f', "craftingToolFile"));
    }
}
