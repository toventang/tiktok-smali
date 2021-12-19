package com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f36939a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(22186);
    }

    public static a a(i iVar) {
        l.c(iVar, "");
        int i2 = c.f36941a[iVar.ordinal()];
        if (i2 == 1) {
            return new e();
        }
        if (i2 != 2) {
            return new d();
        }
        return new a();
    }
}
