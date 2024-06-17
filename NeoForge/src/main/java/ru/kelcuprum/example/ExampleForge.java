package ru.kelcuprum.example;

import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import ru.kelcuprum.example.screen.ConfigScreen;

@Mod("example")
public class ExampleForge {
    public ExampleForge(){
        Example.onInitializeClient();
        ModLoadingContext.get().registerExtensionPoint(
                IConfigScreenFactory.class,
                () -> (minecraftClient, screen) -> ConfigScreen.build(screen));
    }
}
