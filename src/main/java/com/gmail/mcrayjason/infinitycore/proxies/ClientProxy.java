package com.gmail.mcrayjason.infinitycore.proxies;

import com.jadarstudios.developercapes.DevCapes;

public class ClientProxy extends CommonProxy
{
    public ClientProxy()
    {

    }

    @SuppressWarnings("deprecation")
    public void cape()
    {
        DevCapes.getInstance().registerConfig("https://www.dropbox.com/s/73chwh31nk3jxgr/capes.json?raw=1", "InfinityCore");
    }
}
