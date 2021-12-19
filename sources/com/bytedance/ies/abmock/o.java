package com.bytedance.ies.abmock;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.c.c;

public final class o {
    static {
        Covode.recordClassIndex(18635);
    }

    private static void a() {
        try {
            b.a().f31794a.b("abmock_saved2", true);
        } catch (Throwable th) {
            b.a(th);
        }
    }

    public static boolean a(com.google.gson.o oVar) {
        c.a(oVar);
        a();
        return true;
    }
}
