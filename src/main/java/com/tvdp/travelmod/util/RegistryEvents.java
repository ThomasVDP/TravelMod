package com.tvdp.travelmod.util;

import com.tvdp.travelmod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class RegistryEvents
{
    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
}
