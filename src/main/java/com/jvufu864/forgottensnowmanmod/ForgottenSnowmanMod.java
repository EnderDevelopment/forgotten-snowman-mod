package com.jvufu864.forgottensnowmanmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.jvufu864.forgottensnowmanmod.registry.ModRegistries;

@Mod("forgottensnowmanmod")
public class ForgottenSnowmanMod {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "forgottensnowmanmod";

    public ForgottenSnowmanMod() {
        LOGGER.info("Forgotten Snowman Mod is loading");
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        ModRegistries.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Forgotten Snowman Mod is setting up");
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}