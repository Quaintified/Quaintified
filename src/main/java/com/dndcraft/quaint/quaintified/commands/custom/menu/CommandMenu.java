package com.dndcraft.quaint.quaintified.commands.custom.menu;

import com.dndcraft.quaint.quaintified.commands.BaseCommand;
import org.bukkit.entity.Player;

public class CommandMenu extends BaseCommand {
    public void invoke(Player player) {
        MenuStarter menuStarter = new MenuStarter();
        menuStarter.openMenu(player);
    }
}
