package com.dndcraft.quaint.quaintified.commands.custom.nbt;

import com.dndcraft.atlas.util.ItemUtil;
import com.dndcraft.quaint.quaintified.commands.BaseCommand;
import com.dndcraft.quaint.quaintified.utils.StringAndTextUtils;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SubCommandCheck extends BaseCommand {
    public void invoke(Player player) {
        ItemStack stack = player.getInventory().getItem(player.getInventory().getHeldItemSlot());
        if (stack == null) {
            getSender().sendMessage(StringAndTextUtils.codedText("&cNo item found!"));
            return;
        }

        String foundBy = ItemUtil.getStringTag(stack, "found-by");

        if (foundBy.equals("")) foundBy = "&c&lITEM NEVER FOUND";

        getSender().sendMessage(StringAndTextUtils.codedText("&6The player who found this item is: &d" + foundBy));
    }
}
