package ru.kelcuprum.example.screen;

import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import ru.kelcuprum.alinlib.gui.InterfaceUtils;
import ru.kelcuprum.alinlib.gui.components.builder.button.ButtonBuilder;
import ru.kelcuprum.alinlib.gui.components.text.TextBox;
import ru.kelcuprum.alinlib.gui.screens.ConfigScreenBuilder;

public class ConfigScreen {
    public static Screen build(Screen parent){
        return new ConfigScreenBuilder(parent, Component.translatable("example.name"))
                .addPanelWidget(new ButtonBuilder(Component.translatable("example.config"), (s)-> Minecraft.getInstance().setScreen(ConfigScreen.build(parent))).build())
                .addPanelWidget(new ButtonBuilder(Component.translatable("example.modrinth"), (s)-> Util.getPlatform().openUri("https://modrinth.com/")).build())

                .addWidget(new TextBox(Component.translatable("example.config"), true))
                .build();
    }
}
