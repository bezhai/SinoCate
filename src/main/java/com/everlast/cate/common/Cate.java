package com.everlast.cate.common;

import com.everlast.cate.common.util.CateRegs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.GeckoLib;


@Mod(Cate.MODID)
public class Cate
{
    public static final String MODID = "cate";

    public Cate() {
        GeckoLib.initialize();
        CateRegs.register();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
