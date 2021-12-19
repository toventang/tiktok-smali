package com.bytedance.lynx.hybrid.resource.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.config.c;
import h.f.b.l;
import h.m.p;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f41067a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(25172);
    }

    public static boolean a(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public static GeckoConfig a(c cVar, String str) {
        l.c(cVar, "");
        l.c(str, "");
        GeckoConfig geckoConfig = cVar.f41099k.get(str);
        if (geckoConfig == null) {
            return cVar.f41098j;
        }
        return geckoConfig;
    }

    public static String a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        if (str2.length() == 0) {
            return str;
        }
        return str + '/' + p.a(str2, (CharSequence) "/");
    }
}
