package com.dndcraft.quaint.quaintified.commands.custom.tuesday;

import com.dndcraft.quaint.quaintified.commands.BaseCommand;
import com.dndcraft.quaint.quaintified.utils.StringAndTextUtils;

public class SubCommandBeans extends BaseCommand {
    public void invoke() {
        getSender().sendMessage(StringAndTextUtils.codedText("&eHere&8! &eTake some &c&lBEANS&8!"));
    }
}
