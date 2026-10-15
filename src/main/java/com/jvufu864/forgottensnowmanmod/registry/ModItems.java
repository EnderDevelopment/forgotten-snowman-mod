package com.jvufu864.forgottensnowmanmod.registry;

import com.jvufu864.forgottensnowmanmod.item.FrostHeartItem;
import com.jvufu864.forgottensnowmanmod.item.IceShardItem;
import com.jvufu864.forgottensnowmanmod.item.SnowballItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "forgottensnowmanmod");

    public static final RegistryObject<Item> SNOWBALL = ITEMS.register("snowball", () -> new SnowballItem(new Item.Properties()));
    public static final RegistryObject<Item> ICE_SHARD = ITEMS.register("ice_shard", () -> new IceShardItem(new Item.Properties()));
    public static final RegistryObject<Item> FROST_HEART = ITEMS.register("frost_heart", () -> new FrostHeartItem(new Item.Properties()));
}