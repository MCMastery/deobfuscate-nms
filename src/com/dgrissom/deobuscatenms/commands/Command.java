package com.dgrissom.deobfuscatenms.commands;

import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.exception.ExceptionUtils;

// class j
public abstract class Command implements Command {
    private static i a;

    public Command() {
    }

    protected static cf a(JsonParseException ☃) {
        Throwable ☃1 = ExceptionUtils.getRootCause(☃);
        String ☃2 = "";
        if(☃1 != null) {
            ☃2 = ☃1.getMessage();
            if(☃2.contains("setLenient")) {
                ☃2 = ☃2.substring(☃2.indexOf("to accept ") + 10);
            }
        }

        return new cf("commands.tellraw.jsonException", new Object[]{☃2});
    }

    protected static dr a(rw ☃) {
        dr ☃1 = ☃.e(new dr());
        if(☃ instanceof zs) {
            adz ☃2 = ((zs)☃).bt.h();
            if(☃2 != null && ☃2.b() != null) {
                ☃1.a("SelectedItem", ☃2.b(new dr()));
            }
        }

        return ☃1;
    }

    // a
    // required op-permission-level to run this command (set in server.properties), between 1-4
    public int getPermissionLevel() {
        return 4;
    }

    public List<String> b() {
        return Collections.emptyList();
    }

    public boolean a(MinecraftServer ☃, n ☃1) {
        return ☃1.a(this.a(), this.getLabel());
    }

    public List<String> a(MinecraftServer ☃, n ☃1, String[] ☃2, @Nullable cm ☃3) {
        return Collections.emptyList();
    }

    public static int a(String ☃) throws ce {
        try {
            return Integer.parseInt(☃);
        } catch (NumberFormatException var2) {
            throw new ce("commands.generic.num.invalid", new Object[]{☃});
        }
    }

    public static int a(String ☃, int ☃1) throws ce {
        return a(☃, ☃1, 2147483647);
    }

    public static int a(String ☃, int ☃1, int ☃2) throws ce {
        int ☃3 = a(☃);
        if(☃3 < ☃1) {
            throw new ce("commands.generic.num.tooSmall", new Object[]{Integer.valueOf(☃3), Integer.valueOf(☃1)});
        } else if(☃3 > ☃2) {
            throw new ce("commands.generic.num.tooBig", new Object[]{Integer.valueOf(☃3), Integer.valueOf(☃2)});
        } else {
            return ☃3;
        }
    }

    public static long b(String ☃) throws ce {
        try {
            return Long.parseLong(☃);
        } catch (NumberFormatException var2) {
            throw new ce("commands.generic.num.invalid", new Object[]{☃});
        }
    }

    public static long a(String ☃, long ☃1, long ☃2) throws ce {
        long ☃3 = b(☃);
        if(☃3 < ☃1) {
            throw new ce("commands.generic.num.tooSmall", new Object[]{Long.valueOf(☃3), Long.valueOf(☃1)});
        } else if(☃3 > ☃2) {
            throw new ce("commands.generic.num.tooBig", new Object[]{Long.valueOf(☃3), Long.valueOf(☃2)});
        } else {
            return ☃3;
        }
    }

    public static cm a(n ☃, String[] ☃1, int ☃2, boolean ☃3) throws ce {
        cm ☃4 = ☃.c();
        return new cm(b((double)☃4.p(), ☃1[☃2], -30000000, 30000000, ☃3), b((double)☃4.q(), ☃1[☃2 + 1], 0, 256, false), b((double)☃4.r(), ☃1[☃2 + 2], -30000000, 30000000, ☃3));
    }

    public static double c(String ☃) throws ce {
        try {
            double ☃1 = Double.parseDouble(☃);
            if(!Doubles.isFinite(☃1)) {
                throw new ce("commands.generic.num.invalid", new Object[]{☃});
            } else {
                return ☃1;
            }
        } catch (NumberFormatException var3) {
            throw new ce("commands.generic.num.invalid", new Object[]{☃});
        }
    }

    public static double a(String ☃, double ☃1) throws ce {
        return a(☃, ☃1, 1.7976931348623157E308D);
    }

    public static double a(String ☃, double ☃1, double ☃2) throws ce {
        double ☃3 = c(☃);
        if(☃3 < ☃1) {
            throw new ce("commands.generic.double.tooSmall", new Object[]{Double.valueOf(☃3), Double.valueOf(☃1)});
        } else if(☃3 > ☃2) {
            throw new ce("commands.generic.double.tooBig", new Object[]{Double.valueOf(☃3), Double.valueOf(☃2)});
        } else {
            return ☃3;
        }
    }

    public static boolean d(String ☃) throws cc {
        if(!"true".equals(☃) && !"1".equals(☃)) {
            if(!"false".equals(☃) && !"0".equals(☃)) {
                throw new cc("commands.generic.boolean.invalid", new Object[]{☃});
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public static lu a(n ☃) throws cg {
        if(☃ instanceof lu) {
            return (lu)☃;
        } else {
            throw new cg("You must specify which player you wish to perform this action on.", new Object[0]);
        }
    }

    public static lu a(MinecraftServer ☃, n ☃1, String ☃2) throws cg {
        lu ☃3 = p.a(☃1, ☃2);
        if(☃3 == null) {
            try {
                ☃3 = ☃.al().a(UUID.fromString(☃2));
            } catch (IllegalArgumentException var5) {
                ;
            }
        }

        if(☃3 == null) {
            ☃3 = ☃.al().a(☃2);
        }

        if(☃3 == null) {
            throw new cg();
        } else {
            return ☃3;
        }
    }

    public static rw b(MinecraftServer ☃, n ☃1, String ☃2) throws cd {
        return a(☃, ☃1, ☃2, rw.class);
    }

    public static <T extends rw> T a(MinecraftServer ☃, n ☃1, String ☃2, Class<? extends T> ☃3) throws cd {
        Object ☃4 = p.a(☃1, ☃2, ☃3);
        if(☃4 == null) {
            ☃4 = ☃.al().a(☃2);
        }

        if(☃4 == null) {
            try {
                UUID ☃5 = UUID.fromString(☃2);
                ☃4 = ☃.a(☃5);
                if(☃4 == null) {
                    ☃4 = ☃.al().a(☃5);
                }
            } catch (IllegalArgumentException var6) {
                throw new cd("commands.generic.entity.invalidUuid", new Object[0]);
            }
        }

        if(☃4 != null && ☃3.isAssignableFrom(☃4.getClass())) {
            return (rw)☃4;
        } else {
            throw new cd();
        }
    }

    public static List<rw> c(MinecraftServer ☃, n ☃1, String ☃2) throws cd {
        return (List)(p.b(☃2)?p.b(☃1, ☃2, rw.class):Lists.newArrayList(new rw[]{b(☃, ☃1, ☃2)}));
    }

    public static String d(MinecraftServer ☃, n ☃1, String ☃2) throws cg {
        try {
            return a(☃, ☃1, ☃2).h_();
        } catch (cg var4) {
            if(☃2 != null && !☃2.startsWith("@")) {
                return ☃2;
            } else {
                throw var4;
            }
        }
    }

    public static String e(MinecraftServer ☃, n ☃1, String ☃2) throws cd {
        try {
            return a(☃, ☃1, ☃2).h_();
        } catch (cg var6) {
            try {
                return b(☃, ☃1, ☃2).bf();
            } catch (cd var5) {
                if(☃2 != null && !☃2.startsWith("@")) {
                    return ☃2;
                } else {
                    throw var5;
                }
            }
        }
    }

    public static ey a(n ☃, String[] ☃1, int ☃2) throws cg {
        return b(☃, ☃1, ☃2, false);
    }

    public static ey b(n ☃, String[] ☃1, int ☃2, boolean ☃3) throws cg {
        fe ☃4 = new fe("");

        for(int ☃5 = ☃2; ☃5 < ☃1.length; ++☃5) {
            if(☃5 > ☃2) {
                ☃4.a(" ");
            }

            Object ☃6 = new fe(☃1[☃5]);
            if(☃3) {
                ey ☃7 = p.b(☃, ☃1[☃5]);
                if(☃7 == null) {
                    if(p.b(☃1[☃5])) {
                        throw new cg();
                    }
                } else {
                    ☃6 = ☃7;
                }
            }

            ☃4.a((ey)☃6);
        }

        return ☃4;
    }

    public static String a(String[] ☃, int ☃1) {
        StringBuilder ☃2 = new StringBuilder();

        for(int ☃3 = ☃1; ☃3 < ☃.length; ++☃3) {
            if(☃3 > ☃1) {
                ☃2.append(" ");
            }

            String ☃4 = ☃[☃3];
            ☃2.append(☃4);
        }

        return ☃2.toString();
    }

    public static Command.a a(double ☃, String ☃1, boolean ☃2) throws ce {
        return a(☃, ☃1, -30000000, 30000000, ☃2);
    }

    public static Command.a a(double ☃, String ☃1, int ☃2, int ☃3, boolean ☃4) throws ce {
        boolean ☃5 = ☃1.startsWith("~");
        if(☃5 && Double.isNaN(☃)) {
            throw new ce("commands.generic.num.invalid", new Object[]{Double.valueOf(☃)});
        } else {
            double ☃6 = 0.0D;
            if(!☃5 || ☃1.length() > 1) {
                boolean ☃7 = ☃1.contains(".");
                if(☃5) {
                    ☃1 = ☃1.substring(1);
                }

                ☃6 += c(☃1);
                if(!☃7 && !☃5 && ☃4) {
                    ☃6 += 0.5D;
                }
            }

            double ☃8 = ☃6 + (☃5?☃:0.0D);
            if(☃2 != 0 || ☃3 != 0) {
                if(☃8 < (double)☃2) {
                    throw new ce("commands.generic.double.tooSmall", new Object[]{Double.valueOf(☃8), Integer.valueOf(☃2)});
                }

                if(☃8 > (double)☃3) {
                    throw new ce("commands.generic.double.tooBig", new Object[]{Double.valueOf(☃8), Integer.valueOf(☃3)});
                }
            }

            return new Command.a(☃8, ☃6, ☃5);
        }
    }

    public static double b(double ☃, String ☃1, boolean ☃2) throws ce {
        return b(☃, ☃1, -30000000, 30000000, ☃2);
    }

    public static double b(double ☃, String ☃1, int ☃2, int ☃3, boolean ☃4) throws ce {
        boolean ☃5 = ☃1.startsWith("~");
        if(☃5 && Double.isNaN(☃)) {
            throw new ce("commands.generic.num.invalid", new Object[]{Double.valueOf(☃)});
        } else {
            double ☃6 = ☃5?☃:0.0D;
            if(!☃5 || ☃1.length() > 1) {
                boolean ☃7 = ☃1.contains(".");
                if(☃5) {
                    ☃1 = ☃1.substring(1);
                }

                ☃6 += c(☃1);
                if(!☃7 && !☃5 && ☃4) {
                    ☃6 += 0.5D;
                }
            }

            if(☃2 != 0 || ☃3 != 0) {
                if(☃6 < (double)☃2) {
                    throw new ce("commands.generic.double.tooSmall", new Object[]{Double.valueOf(☃6), Integer.valueOf(☃2)});
                }

                if(☃6 > (double)☃3) {
                    throw new ce("commands.generic.double.tooBig", new Object[]{Double.valueOf(☃6), Integer.valueOf(☃3)});
                }
            }

            return ☃6;
        }
    }

    public static adx a(n ☃, String ☃1) throws ce {
        kn ☃2 = new kn(☃1);
        adx ☃3 = (adx)adx.g.c(☃2);
        if(☃3 == null) {
            throw new ce("commands.give.item.notFound", new Object[]{☃2});
        } else {
            return ☃3;
        }
    }

    public static akf b(n ☃, String ☃1) throws ce {
        kn ☃2 = new kn(☃1);
        if(!akf.h.d(☃2)) {
            throw new ce("commands.give.block.notFound", new Object[]{☃2});
        } else {
            akf ☃3 = (akf)akf.h.c(☃2);
            if(☃3 == null) {
                throw new ce("commands.give.block.notFound", new Object[]{☃2});
            } else {
                return ☃3;
            }
        }
    }

    public static String a(Object[] ☃) {
        StringBuilder ☃1 = new StringBuilder();

        for(int ☃2 = 0; ☃2 < ☃.length; ++☃2) {
            String ☃3 = ☃[☃2].toString();
            if(☃2 > 0) {
                if(☃2 == ☃.length - 1) {
                    ☃1.append(" and ");
                } else {
                    ☃1.append(", ");
                }
            }

            ☃1.append(☃3);
        }

        return ☃1.toString();
    }

    public static ey a(List<ey> ☃) {
        fe ☃1 = new fe("");

        for(int ☃2 = 0; ☃2 < ☃.size(); ++☃2) {
            if(☃2 > 0) {
                if(☃2 == ☃.size() - 1) {
                    ☃1.a(" and ");
                } else if(☃2 > 0) {
                    ☃1.a(", ");
                }
            }

            ☃1.a((ey)☃.get(☃2));
        }

        return ☃1;
    }

    public static String a(Collection<String> ☃) {
        return a(☃.toArray(new String[☃.size()]));
    }

    public static List<String> a(String[] ☃, int ☃1, @Nullable cm ☃2) {
        if(☃2 == null) {
            return Lists.newArrayList(new String[]{"~"});
        } else {
            int ☃4 = ☃.length - 1;
            String ☃3;
            if(☃4 == ☃1) {
                ☃3 = Integer.toString(☃2.p());
            } else if(☃4 == ☃1 + 1) {
                ☃3 = Integer.toString(☃2.q());
            } else {
                if(☃4 != ☃1 + 2) {
                    return Collections.emptyList();
                }

                ☃3 = Integer.toString(☃2.r());
            }

            return Lists.newArrayList(new String[]{☃3});
        }
    }

    @Nullable
    public static List<String> b(String[] ☃, int ☃1, @Nullable cm ☃2) {
        if(☃2 == null) {
            return Lists.newArrayList(new String[]{"~"});
        } else {
            int ☃4 = ☃.length - 1;
            String ☃3;
            if(☃4 == ☃1) {
                ☃3 = Integer.toString(☃2.p());
            } else {
                if(☃4 != ☃1 + 1) {
                    return null;
                }

                ☃3 = Integer.toString(☃2.r());
            }

            return Lists.newArrayList(new String[]{☃3});
        }
    }

    public static boolean a(String ☃, String ☃1) {
        return ☃1.regionMatches(true, 0, ☃, 0, ☃.length());
    }

    public static List<String> a(String[] ☃, String... ☃1) {
        return a((String[])☃, (Collection)Arrays.asList(☃1));
    }

    public static List<String> a(String[] ☃, Collection<?> ☃1) {
        String ☃2 = ☃[☃.length - 1];
        ArrayList ☃3 = Lists.newArrayList();
        if(!☃1.isEmpty()) {
            Iterator ☃4 = Iterables.transform(☃1, Functions.toStringFunction()).iterator();

            while(☃4.hasNext()) {
                String ☃5 = (String)☃4.next();
                if(a(☃2, ☃5)) {
                    ☃3.add(☃5);
                }
            }

            if(☃3.isEmpty()) {
                ☃4 = ☃1.iterator();

                while(☃4.hasNext()) {
                    Object ☃6 = ☃4.next();
                    if(☃6 instanceof kn && a(☃2, ((kn)☃6).a())) {
                        ☃3.add(String.valueOf(☃6));
                    }
                }
            }
        }

        return ☃3;
    }

    public boolean b(String[] ☃, int ☃1) {
        return false;
    }

    public static void a(n ☃, l ☃1, String ☃2, Object... ☃3) {
        a(☃, ☃1, 0, ☃2, ☃3);
    }

    public static void a(n ☃, l ☃1, int ☃2, String ☃3, Object... ☃4) {
        if(a != null) {
            a.a(☃, ☃1, ☃2, ☃3, ☃4);
        }

    }

    public static void a(i ☃) {
        a = ☃;
    }

    public int a(l ☃) {
        return this.getLabel().compareTo(☃.getLabel());
    }

    public static class a {
        private final double a;
        private final double b;
        private final boolean c;

        protected a(double ☃, double ☃1, boolean ☃2) {
            this.a = ☃;
            this.b = ☃1;
            this.c = ☃2;
        }

        public double a() {
            return this.a;
        }

        public double b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }
}
