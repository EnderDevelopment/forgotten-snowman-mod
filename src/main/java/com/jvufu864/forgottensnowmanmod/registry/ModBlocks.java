package com.jvufu864.forgottensnowmanmod.registry;

import com.jvufu864.forgottensnowmanmod.block.FrostAltarBlock;
import com.jvufu864.forgottensnowmanmod.block.FrostBlock;
import com.jvufu864.forgottensnowmanmod.block.FrostOreBlock;
import com.jvufu864.forgottensnowmanmod.block.IceBlock;
import com.jvufu864.forgottensnowmanmod.block.IceOreBlock;
import com.jvufu864.forgottensnowmanmod.block.SnowAltarBlock;
import com.jvufu864.forgottensnowmanmod.block.SnowBlock;
import com.jvufu864.forgottensnowmanmod.block.SnowOreBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "forgottensnowmanmod");

    public static final RegistryObject<Block> SNOW_ALTAR = BLOCKS.register("snow_altar", () -> new SnowAltarBlock(Block.Properties.of()));
    public static final RegistryObject<Block> ICE_ORE = BLOCKS.register("ice_ore", () -> new IceOreBlock(Block.Properties.of()));
    public static final RegistryObject<Block> FROST_ORE = BLOCKS.register("frost_ore", () -> new FrostOreBlock(Block.Properties.of()));
    public static final RegistryObject<Block> SNOW_ORE = BLOCKS.register("snow_ore", () -> new SnowOreBlock(Block.Properties.of()));
    public static final RegistryObject<Block> FROST_BLOCK = BLOCKS.register("frost_block", () -> new FrostBlock(Block.Properties.of()));
    public static final RegistryObject<Block> SNOW_BLOCK = BLOCKS.register("snow_block", () -> new SnowBlock(Block.Properties.of()));
    public static final RegistryObject<Block> ICE_BLOCK = BLOCKS.register("ice_block", () -> new IceBlock(Block.Properties.of()));
    public static final RegistryObject<Block> FROST_ALTAR = BLOCKS.register("frost_altar", () -> new FrostAltarBlock(Block.Properties.of()));
}