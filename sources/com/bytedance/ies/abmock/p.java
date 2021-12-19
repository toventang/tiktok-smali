package com.bytedance.ies.abmock;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.c.c;
import com.google.gson.o;

public final class p {
    static {
        Covode.recordClassIndex(18636);
    }

    public static boolean a(o oVar) {
        c.a(oVar);
        try {
            SettingsManager.a().getSettingsValueProvider().a("abmock_saved3", true);
        } catch (Throwable th) {
            b.a(th);
        }
        return true;
    }
}
