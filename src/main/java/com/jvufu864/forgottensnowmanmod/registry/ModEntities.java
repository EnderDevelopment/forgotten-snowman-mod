package com.jvufu864.forgottensnowmanmod.registry;

import com.jvufu864.forgottensnowmanmod.entity.ForgottenSnowmanEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "forgottensnowmanmod");

    public static final RegistryObject<EntityType<ForgottenSnowmanEntity>> FORGOTTEN_SNOWMAN = ENTITIES.register("forgotten_snowman", () -> EntityType.Builder.of(ForgottenSnowmanEntity::new, MobCategory.MONSTER).sized(1.0f, 2.0f).build("forgotten_snowman"));
}