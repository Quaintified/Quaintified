package com.dndcraft.quaint.quaintified.commands.custom.hello;

import com.dndcraft.quaint.quaintified.commands.BaseCommand;
import com.dndcraft.quaint.quaintified.commands.custom.tuesday.SubCommandTaco;
import com.dndcraft.quaint.quaintified.utils.StringAndTextUtils;

public class CommandHello extends BaseCommand {
    public void invoke() {
        getSender().sendMessage(StringAndTextUtils.codedText("&eHello there, &d" + getSender().getName() + "&8!"));
    }
}
