package com.gmail.mcrayjason.infinitycore.init;

import com.gmail.mcrayjason.infinitycore.blocks.BlockIFC;
import com.gmail.mcrayjason.infinitycore.helpers.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks
{
    public static Block infinityStone = new BlockIFC("infinityStone");

    public static void registerBlocks()
    {
        RegisterHelper.registerBlock(infinityStone);
    }
}
