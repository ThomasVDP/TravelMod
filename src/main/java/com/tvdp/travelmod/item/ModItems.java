package com.tvdp.travelmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final TombstoneKeyItem TOMBSTONE_KEY_ITEM = new TombstoneKeyItem(new Item.Properties().group(ItemGroup.COMBAT));
}
