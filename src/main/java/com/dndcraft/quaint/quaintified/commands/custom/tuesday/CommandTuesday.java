package com.dndcraft.quaint.quaintified.commands.custom.tuesday;

import com.dndcraft.atlas.command.annotations.Cmd;
import com.dndcraft.quaint.quaintified.Quaintified;
import com.dndcraft.quaint.quaintified.commands.BaseCommand;
import com.dndcraft.quaint.quaintified.utils.StringAndTextUtils;

public class CommandTuesday extends BaseCommand {
    private SubCommandTaco subCommandTaco = new SubCommandTaco();
    private SubCommandBeans subCommandBeans = new SubCommandBeans();

    public void invoke() {
        getSender().sendMessage(StringAndTextUtils.codedText("&cIt's tuesday!?"));
    }

    @Cmd(value = "taco", permission = "quaintified.command.tuesday.taco")
    public BaseCommand subCommandTaco() {
        return subCommandTaco;
    }

    @Cmd(value = "beans", permission = "quaintified.command.tuesday.beans")
    public BaseCommand subCommandBeans() {
        return subCommandBeans;
    }
}
