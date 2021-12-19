package com.bytedance.ies.xbridge.m.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.m.a.b;
import com.bytedance.ies.xbridge.m.c.c;
import com.bytedance.ies.xbridge.m.d.a;
import h.f.b.l;

public final class b extends com.bytedance.ies.xbridge.m.a.b {
    static {
        Covode.recordClassIndex(21690);
    }

    @Override // com.bytedance.ies.xbridge.m.a.b
    public final void a(com.bytedance.ies.xbridge.m.c.b bVar, b.a aVar, e eVar) {
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a("Context not provided in host");
            return;
        }
        String str = bVar.f36270a;
        if (str == null) {
            l.a("key");
        }
        Object a2 = a.a(context).a(str);
        c cVar = new c();
        cVar.f36272a = a2;
        aVar.a(cVar, "");
    }
}
