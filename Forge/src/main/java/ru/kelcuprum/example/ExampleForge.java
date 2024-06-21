package ru.kelcuprum.example;

import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import ru.kelcuprum.example.screen.ConfigScreen;

@Mod("example")
public class ExampleForge {
    public ExampleForge(){
        Example.onInitializeClient();
        ModLoadingContext.get().registerExtensionPoint(
                ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory(ConfigScreen::build));
    }
}
