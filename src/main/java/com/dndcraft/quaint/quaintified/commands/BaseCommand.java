package com.dndcraft.quaint.quaintified.commands;

import com.dndcraft.atlas.command.CommandTemplate;
import com.dndcraft.quaint.quaintified.Quaintified;

public class BaseCommand extends CommandTemplate {
    protected Quaintified instance = Quaintified.get();
}
