package com.dgrissom.deobfuscatenms.commands;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

// class l
public interface ICommand extends Comparable<l> {
    // c
    String getLabel();

    // b
    String getUsageMessage(n var1);

    List<String> b();

    // a
    void execute(MinecraftServer server, n sender, String[] args) throws cc;

    boolean a(MinecraftServer var1, n var2);

    List<String> a(MinecraftServer var1, n var2, String[] var3, @Nullable cm var4);

    boolean b(String[] var1, int var2);
}
