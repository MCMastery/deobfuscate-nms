package com.dgrissom.deobfuscatenms.commands;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

// class av
public class PlaySoundCommand extends j {
    public PlaySoundCommand() {
    }

    public String getLabel() {
        return "playsound";
    }

    public int getPermissionLevel() {
        return 2;
    }

    public String getUsageMessage(n ☃) {
        return "commands.playsound.usage";
    }

    public void execute(MinecraftServer server, n sender, String[] args) throws cc {
        if (args.length < 2) {
            throw new ci(this.b(sender), new Object[0]);
        } else {
            byte ☃3 = 0;
            int var34 = ☃3 + 1;
            String ☃4 = args[☃3];
            String ☃5 = args[var34++];
            nk ☃6 = nk.a(☃5);
            if(☃6 == null) {
                throw new cc("commands.playsound.unknownSoundSource", new Object[]{☃5});
            } else {
                lu ☃7 = a(server, sender, args[var34++]);
                bcb ☃8 = sender.d();
                double ☃9 = ☃8.b;
                if (args.length > var34) {
                    ☃9 = b(☃9, args[var34++], true);
                }

                double ☃10 = ☃8.c;
                if (args.length > var34) {
                    ☃10 = b(☃10, args[var34++], 0, 0, false);
                }

                double ☃11 = ☃8.d;
                if(args.length > var34) {
                    ☃11 = b(☃11, args[var34++], true);
                }

                double ☃12 = 1.0D;
                if (args.length > var34) {
                    ☃12 = a(args[var34++], 0.0D, 3.4028234663852886E38D);
                }

                double ☃13 = 1.0D;
                if (args.length > var34) {
                    ☃13 = a(args[var34++], 0.0D, 2.0D);
                }

                double ☃14 = 0.0D;
                if (args.length > var34) {
                    ☃14 = a(args[var34], 0.0D, 1.0D);
                }

                double ☃15 = ☃12 > 1.0D?☃12 * 16.0D:16.0D;
                double ☃16 = ☃7.f(☃9, ☃10, ☃11);
                if(☃16 > ☃15) {
                    if(☃14 <= 0.0D) {
                        throw new cc("commands.playsound.playerTooFar", new Object[]{☃7.h_()});
                    }

                    double ☃17 = ☃9 - ☃7.p;
                    double ☃18 = ☃10 - ☃7.q;
                    double ☃19 = ☃11 - ☃7.r;
                    double ☃20 = Math.sqrt(☃17 * ☃17 + ☃18 * ☃18 + ☃19 * ☃19);
                    if(☃20 > 0.0D) {
                        ☃9 = ☃7.p + ☃17 / ☃20 * 2.0D;
                        ☃10 = ☃7.q + ☃18 / ☃20 * 2.0D;
                        ☃11 = ☃7.r + ☃19 / ☃20 * 2.0D;
                    }

                    ☃12 = ☃14;
                }

                ☃7.a.a(new gm(☃4, ☃6, ☃9, ☃10, ☃11, (float)☃12, (float)☃13));
                a(sender, this, "commands.playsound.success", new Object[]{☃4, ☃7.h_()});
            }
        }
    }

    public List<String> a(MinecraftServer ☃, n ☃1, String[] ☃2, @Nullable cm ☃3) {
        return ☃2.length == 1?a(☃2, ni.a.c()):(☃2.length == 2?a(☃2, nk.b()):(☃2.length == 3?a(☃2, ☃.J()):(☃2.length > 3 && ☃2.length <= 6?a(☃2, 3, ☃3):Collections.emptyList())));
    }

    public boolean b(String[] ☃, int ☃1) {
        return ☃1 == 2;
    }
}
