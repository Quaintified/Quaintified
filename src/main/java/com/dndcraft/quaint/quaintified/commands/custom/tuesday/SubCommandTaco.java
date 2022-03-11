package com.dndcraft.quaint.quaintified.commands.custom.tuesday;

import com.dndcraft.quaint.quaintified.commands.BaseCommand;
import com.dndcraft.quaint.quaintified.utils.StringAndTextUtils;

public class SubCommandTaco extends BaseCommand {
    public void invoke() {
        getSender().sendMessage(StringAndTextUtils.codedText("&eHere&8! &eHave a &2TACO&8!"));
    }
}
