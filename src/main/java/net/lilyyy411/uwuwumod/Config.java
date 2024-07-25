package net.lilyyy411.uwuwumod;

import net.lilyyy411.uwuwumod.owoify.OwoLevel;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = UwuwuMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec.ConfigValue<OwoLevel> OWO_LEVEL = BUILDER.comment("The level of owoification")
            .defineEnum("owo_level", OwoLevel.UWU);
    public static final ForgeConfigSpec SPEC = BUILDER.build();

}
