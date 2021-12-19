package com.bytedance.ies.xbridge.system.b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.system.a.a;
import h.f.b.l;

public final class a extends com.bytedance.ies.xbridge.system.a.a {
    static {
        Covode.recordClassIndex(21860);
    }

    @Override // com.bytedance.ies.xbridge.system.a.a
    public final void a(com.bytedance.ies.xbridge.system.c.a aVar, a.AbstractC0877a aVar2, e eVar) {
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(eVar, "");
        if (!aVar.f36489a) {
            Activity a2 = com.bytedance.ies.xbridge.o.a.a((Context) a(Context.class));
            if (a2 == null) {
                aVar2.a("context can not convert to activity");
                return;
            }
            a2.getWindow().addFlags(8192);
        }
        aVar2.a(new b(), "");
    }
}
