package com.tvdp.travelmod.item;

import com.tvdp.travelmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class TombstoneKeyItem extends Item
{
    public TombstoneKeyItem(Properties properties)
    {
        super(properties);
        this.setRegistryName(new ResourceLocation(Reference.MOD_ID, "tombstone_key"));

        ModItems.ITEMS.add(this);
    }
}
