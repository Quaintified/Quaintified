package com.dndcraft.quaint.quaintified.commands.custom.nbt;

import com.dndcraft.atlas.AtlasPaper;
import com.dndcraft.atlas.command.annotations.Cmd;
import com.dndcraft.atlas.util.AtlasColor;
import com.dndcraft.atlas.util.ItemUtil;
import com.dndcraft.quaint.quaintified.commands.BaseCommand;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Random;

public class CommandNBT extends BaseCommand {
    private SubCommandCheck subCommandCheck = new SubCommandCheck();

    public void invoke(Player player) {
        var name = AtlasPaper.get().componentBuilder().append("Your Present", AtlasColor.GRAY).build();
        var lore = AtlasPaper.get().componentBuilder().append("Merry Christmas!", AtlasColor.GREEN).build();

        Random RNG = new Random();

        int amount = RNG.nextInt(1, 17);

        ItemStack item = ItemUtil.make(Material.COAL, amount, name, lore);
        ItemUtil.setTag(item, "found-by", getSender().getName());

        player.getInventory().addItem(item);
    }

    @Cmd(value = "check", permission = "quaintified.command.nbt.check")
    public BaseCommand subCommandCheck() {
        return subCommandCheck;
    }
}
