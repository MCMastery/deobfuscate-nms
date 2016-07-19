package com.dgrissom.deobfuscatenms.commands;

import net.minecraft.server.MinecraftServer;

// class az
public class SaveOffCommand extends j {
    public SaveOffCommand() {
    }

    public String getLabel() {
        return "save-off";
    }

    public String getUsageMessage(n ☃) {
        return "commands.save-off.usage";
    }

    public void execute(MinecraftServer server, n sender, String[] args) throws cc {
        boolean ☃3 = false;

        for (int ☃4 = 0; ☃4 < ☃.d.length; ++☃4) {
            if (☃.d[☃4] != null) {
                ls ☃5 = server.d[☃4];
                if(!☃5.b) {
                    ☃5.b = true;
                    ☃3 = true;
                }
            }
        }

        if (☃3) {
            a(sender, this, "commands.save.disabled", new Object[0]);
        } else {
            throw new cc("commands.save-off.alreadyOff", new Object[0]);
        }
    }
}
