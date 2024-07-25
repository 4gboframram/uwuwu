package net.lilyyy411.uwuwumod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(UwuwuMod.MOD_ID)
public class UwuwuMod {
    public static final String MOD_ID = "uwuwu";
    public static final Logger LOGGER = LogUtils.getLogger();

    //    public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(Registries.ITEM, UwuwuMod.MOD_ID);
//    public static final RegistryObject<Item> ITEM = MOD_ITEMS.register("owo", () -> new Item(new Item.Properties()) {
//        @Override
//        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
//            LOGGER.debug("hover");
//           pTooltipComponents.add( Component.literal("You're a cute femboy"));
//        }
//    });
    public UwuwuMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
//        MOD_ITEMS.register(modEventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);


        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
