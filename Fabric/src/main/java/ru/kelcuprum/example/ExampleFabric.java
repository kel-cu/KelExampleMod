package ru.kelcuprum.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ExampleFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Example.onInitializeClient();
    }
}