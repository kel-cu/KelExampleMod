package ru.kelcuprum.example;

import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.ConfigScreenHandler;
import ru.kelcuprum.example.screen.ConfigScreen;

@Mod("example")
public class ExampleForge {
    public ExampleForge(){
        Example.onInitializeClient();
        ModLoadingContext.get().registerExtensionPoint(
                ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory((minecraftClient, screen) -> ConfigScreen.build(screen)));
    }
}
