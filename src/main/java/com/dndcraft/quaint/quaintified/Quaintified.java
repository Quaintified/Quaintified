package com.dndcraft.quaint.quaintified;

import com.dndcraft.atlas.command.Commands;
import com.dndcraft.atlas.command.exception.InvalidPluginCommandException;
import com.dndcraft.quaint.quaintified.commands.custom.hello.CommandHello;
import com.dndcraft.quaint.quaintified.commands.custom.menu.CommandMenu;
import com.dndcraft.quaint.quaintified.commands.custom.nbt.CommandNBT;
import com.dndcraft.quaint.quaintified.commands.custom.tuesday.CommandTuesday;
import org.bukkit.plugin.java.JavaPlugin;

public final class Quaintified extends JavaPlugin {

    private static Quaintified instance;
    public static Quaintified get() {
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    public void registerCommands() {
        try {
            Commands.build(getCommand("hello-there"), CommandHello::new);
            Commands.build(getCommand("tuesday"), CommandTuesday::new);
            Commands.build(getCommand("menu"), CommandMenu::new);
            Commands.build(getCommand("nbt"), CommandNBT::new);
        } catch (InvalidPluginCommandException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
