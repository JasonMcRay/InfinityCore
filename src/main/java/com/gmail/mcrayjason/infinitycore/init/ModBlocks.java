package com.gmail.mcrayjason.infinitycore.init;

import com.gmail.mcrayjason.infinitycore.blocks.BlockCatalyst;
import com.gmail.mcrayjason.infinitycore.blocks.BlockHull;
import com.gmail.mcrayjason.infinitycore.blocks.BlockIFC;
import com.gmail.mcrayjason.infinitycore.blocks.BlockMachine;
import com.gmail.mcrayjason.infinitycore.helpers.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks
{
    public static Block infinityStone = new BlockIFC("infinityStone");
    public static Block pneumaticCasing = new BlockMachine("pneumaticCasing");
    public static Block pneumaticCasingAdvanced = new BlockMachine("pneumaticCasingAdvanced");
    public static Block pneumaticHull = new BlockHull("pneumaticHull");
    public static Block pneumaticHullAdvanced = new BlockHull("pneumaticHullAdvanced");
    public static Block blockCatalyst = new BlockCatalyst("blockCatalyst");

    public static void registerBlocks()
    {
        RegisterHelper.registerBlock(infinityStone);
        RegisterHelper.registerBlock(pneumaticCasing);
        RegisterHelper.registerBlock(pneumaticCasingAdvanced);
        RegisterHelper.registerBlock(pneumaticHull);
        RegisterHelper.registerBlock(pneumaticHullAdvanced);
        RegisterHelper.registerBlock(blockCatalyst);
    }
}
