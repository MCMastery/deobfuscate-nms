package com.dgrissom.deobfuscatenms.commands;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import o.a;

// class ak
public class GiveCommand extends Command {
    public GiveCommand() {
    }

    public String getLabel() {
        return "give";
    }

    public int getPermissionLevel() {
        return 2;
    }

    public String getUsageMessage(n ☃) {
        return "commands.give.usage";
    }

    public void execute(MinecraftServer server, n sender, String[] args) throws cc {
        if (args.length < 2) {
            throw new ci("commands.give.usage", new Object[0]);
        } else {
            lu ☃3 = a(server, sender, args[0]);
            adx ☃4 = a(sender, args[1]);
            int ☃5 = args.length >= 3 ? a(args[2], 1, 64) : 1;
            int ☃6 = args.length >= 4 ? a(args[3]) : 0;
            adz ☃7 = new adz(☃4, ☃5, ☃6);
            if (args.length >= 5) {
                String ☃8 = a(sender, args, 4).c();

                try {
                    ☃7.d(eh.a(☃8));
                } catch (eg var11) {
                    throw new cc("commands.give.tagError", new Object[]{var11.getMessage()});
                }
            }

            boolean ☃10 = ☃3.bt.c(☃7);
            if(☃10) {
                ☃3.l.a((zs)null, ☃3.p, ☃3.q, ☃3.r, nj.da, nk.h, 0.2F, ((☃3.bI().nextFloat() - ☃3.bI().nextFloat()) * 0.7F + 1.0F) * 2.0F);
                ☃3.bu.b();
            }

            yk ☃9;
            if(☃10 && ☃7.b <= 0) {
                ☃7.b = 1;
                sender.a(a.d, ☃5);
                ☃9 = ☃3.a(☃7, false);
                if(☃9 != null) {
                    ☃9.w();
                }
            } else {
                sender.a(a.d, ☃5 - ☃7.b);
                ☃9 = ☃3.a(☃7, false);
                if(☃9 != null) {
                    ☃9.r();
                    ☃9.d(☃3.h_());
                }
            }

            a(sender, this, "commands.give.success", new Object[]{☃7.B(), Integer.valueOf(☃5), ☃3.h_()});
        }
    }

    public List<String> a(MinecraftServer ☃, n ☃1, String[] ☃2, @Nullable cm ☃3) {
        return ☃2.length == 1?a(☃2, ☃.J()):(☃2.length == 2?a(☃2, adx.g.c()):Collections.emptyList());
    }

    public boolean b(String[] ☃, int ☃1) {
        return ☃1 == 0;
    }
}
