package com.bytedance.ies.xbridge.m.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.m.a.c;
import com.bytedance.ies.xbridge.m.c.d;
import com.bytedance.ies.xbridge.m.d.a;
import com.bytedance.ies.xbridge.model.c.b;
import h.f.b.l;

public final class c extends com.bytedance.ies.xbridge.m.a.c {
    static {
        Covode.recordClassIndex(21691);
    }

    @Override // com.bytedance.ies.xbridge.m.a.c
    public final void a(d dVar, c.a aVar, e eVar) {
        l.c(dVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a("Context not provided in host");
            return;
        }
        String str = dVar.f36274a;
        if (str == null) {
            l.a("key");
        }
        a.a(context).b(str);
        aVar.a(new b(), "");
    }
}
