package com.dndcraft.quaint.quaintified.commands.custom.menu;

import com.dndcraft.atlas.AtlasPaper;
import com.dndcraft.atlas.menu.MenuBuilder;
import com.dndcraft.atlas.menu.icon.Icon;
import com.dndcraft.atlas.menu.icon.Pad;
import com.dndcraft.atlas.menu.icon.SimpleButton;
import com.dndcraft.atlas.util.AtlasColor;
import com.dndcraft.atlas.util.ItemUtil;
import com.dndcraft.quaint.quaintified.utils.StringAndTextUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class MenuStarter {
    private Icon[] menuIcons = new Icon[9];

    public void openMenu(Player player) {
        var displayName = AtlasPaper.get().componentBuilder().append("Cancel Button", AtlasColor.ERROR_RED).build();
        var lore = AtlasPaper.get().componentBuilder().append("Closes the current menu.", AtlasColor.ERROR_TEXT_RED).build();
        menuIcons[0] = new SimpleButton(
                ItemUtil.make(Material.BARRIER, displayName, lore),
                (menuAction -> menuAction.getMenuAgent().close())
        );
        menuIcons[4] = new ButtonClicker();
        menuIcons[8] = new Pad(Material.END_ROD);

        MenuBuilder menuBuilder = new MenuBuilder("&cStarter Menu", menuIcons.length / 9);

        for (int i = 0; i < menuIcons.length; i ++) {
            try {
                if (menuIcons[i] != null) menuBuilder.icon(i, menuIcons[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        menuBuilder.build().openSession(player);
    }
}
