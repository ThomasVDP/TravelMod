package com.tvdp.travelmod;

import com.tvdp.travelmod.item.ModItems;
import com.tvdp.travelmod.proxy.ClientProxy;
import com.tvdp.travelmod.proxy.IProxy;
import com.tvdp.travelmod.proxy.ServerProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class TravelMod
{
    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public TravelMod()
    {
        LOGGER.info("Travelmod init");
        FMLJavaModLoadingContext.get().getModEventBus().register(ModItems.class);
    }
}
