package com.jvufu864.forgottensnowmanmod.registry;

import net.minecraftforge.eventbus.api.IEventBus;

public class ModRegistries {
    public static void register(IEventBus eventBus) {
        ModEntities.ENTITIES.register(eventBus);
        ModItems.ITEMS.register(eventBus);
        ModBlocks.BLOCKS.register(eventBus);
    }
}