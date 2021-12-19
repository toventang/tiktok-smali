package com.bytedance.ies.xbridge.e.b;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.b.a;
import com.bytedance.ies.xbridge.e.a.b;
import com.bytedance.ies.xbridge.e.c.c;
import com.bytedance.ies.xbridge.e.e;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b extends com.bytedance.ies.xbridge.e.a.b {
    static {
        Covode.recordClassIndex(21476);
    }

    private final String a() {
        String a2;
        a aVar = (a) a(a.class);
        if (aVar == null || (a2 = aVar.a()) == null) {
            return "";
        }
        return a2;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final void f() {
        super.f();
        String a2 = a();
        l.c(a2, "");
        for (Map.Entry<String, CopyOnWriteArrayList<e>> entry : com.bytedance.ies.xbridge.e.b.a().entrySet()) {
            for (T t : entry.getValue()) {
                if (l.a((Object) t.f35939a, (Object) a2)) {
                    entry.getValue().remove(t);
                }
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.e.a.b
    public final void a(c cVar, b.a aVar, com.bytedance.ies.xbridge.e eVar) {
        WebView webView;
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        String a2 = a();
        String str = cVar.f35934a;
        if (str == null) {
            l.a("eventName");
        }
        long j2 = cVar.f35935b;
        b.d dVar = (b.d) a(b.d.class);
        com.bytedance.ies.web.a.a aVar2 = (com.bytedance.ies.web.a.a) a(com.bytedance.ies.web.a.a.class);
        if (aVar2 != null) {
            webView = aVar2.f35513d;
        } else {
            webView = null;
        }
        com.bytedance.ies.xbridge.e.b.a(new e(a2, j2, dVar, webView), str);
        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
    }
}
