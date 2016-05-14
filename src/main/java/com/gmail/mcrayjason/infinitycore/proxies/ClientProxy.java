package com.gmail.mcrayjason.infinitycore.proxies;

import com.gmail.mcrayjason.infinitycore.helpers.LogHelper;
import com.jadarstudios.developercapes.DevCapes;

public class ClientProxy extends CommonProxy
{
    public ClientProxy()
    {

    }

    @SuppressWarnings("deprecation")
    public void cape()
    {
        LogHelper.info("Dressing Capes");
        DevCapes.getInstance().registerConfig("https://gist.githubusercontent.com/JasonMcRay/6b0f52ef900be6fb24694e9ea6b5c7cd/raw/", "InfinityCore");
        LogHelper.info("Capes Dressed");

    }
}
