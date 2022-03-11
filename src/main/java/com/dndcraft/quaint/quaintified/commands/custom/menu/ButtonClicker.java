package com.dndcraft.quaint.quaintified.commands.custom.menu;

import com.dndcraft.atlas.AtlasPaper;
import com.dndcraft.atlas.menu.MenuAction;
import com.dndcraft.atlas.menu.MenuAgent;
import com.dndcraft.atlas.menu.icon.Button;
import com.dndcraft.atlas.util.AtlasColor;
import com.dndcraft.atlas.util.ItemUtil;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ButtonClicker extends Button {
    @Getter private int amount = 1;

    @Override
    public ItemStack getItemStack(MenuAgent menuAgent) {
        var displayName = AtlasPaper.get().componentBuilder().append("Current amount: " + amount, AtlasColor.DANDELION).build();
        var lore = AtlasPaper.get().componentBuilder().append("The number of times you clicked!", AtlasColor.BABY_BLUE).build();
        var item = ItemUtil.make(Material.PAPER, displayName, lore);
        item.setAmount(amount);
        return item;
    }

    @Override
    public void click(MenuAction menuAction) {
        if (amount <= 0) amount = 1;
        amount ++;

        menuAction.refreshItem(this);
    }
}
