package com.bytedance.ies.xbridge.platform.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.b.c;
import com.bytedance.ies.xbridge.platform.a.a.b;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36368a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(21789);
    }

    public static /* synthetic */ List a(c cVar, b bVar, List list) {
        l.c(cVar, "");
        l.c(bVar, "");
        l.c(list, "");
        l.c("DEFAULT", "");
        Map<String, Class<? extends com.bytedance.ies.xbridge.b>> a2 = com.bytedance.ies.xbridge.a.a(e.ALL, "DEFAULT");
        if (a2 == null) {
            return z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(a2.size());
        for (Map.Entry<String, Class<? extends com.bytedance.ies.xbridge.b>> entry : a2.entrySet()) {
            com.bytedance.ies.xbridge.b bVar2 = (com.bytedance.ies.xbridge.b) entry.getValue().newInstance();
            l.a((Object) bVar2, "");
            l.c(bVar2, "");
            l.c(cVar, "");
            l.c(bVar, "");
            l.c(list, "");
            arrayList.add(new b.a(cVar, list, bVar2, bVar, bVar));
        }
        return arrayList;
    }
}
