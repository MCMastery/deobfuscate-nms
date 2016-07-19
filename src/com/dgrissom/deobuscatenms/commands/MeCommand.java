package com.dgrissom.deobfuscatenms.commands;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

// class ab
public class MeCommand extends Command {
    public MeCommand() {
    }

    public String getLabel() {
        return "me";
    }

    public int getPermissionLevel() {
        return 0;
    }

    public String getUsageMessage(n ☃) {
        return "commands.me.usage";
    }

    public void execute(MinecraftServer server, n sender, String[] args) throws cc {
        if (args.length <= 0) {
            throw new ci("commands.me.usage", new Object[0]);
        } else {
            ey ☃3 = b(sender, args, 0, !(sender instanceof zs));
            server.al().a(new ff("chat.type.emote", new Object[]{sender.i_(), ☃3}));
        }
    }

    public List<String> a(MinecraftServer ☃, n ☃1, String[] ☃2, @Nullable cm ☃3) {
        return a(☃2, ☃.J());
    }
}
