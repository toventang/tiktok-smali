package com.bytedance.ies.xbridge.e.b;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e.a.c;
import com.bytedance.ies.xbridge.e.c.e;
import h.f.b.l;

public class c extends com.bytedance.ies.xbridge.e.a.c {
    static {
        Covode.recordClassIndex(21477);
    }

    @Override // com.bytedance.ies.xbridge.e.a.c
    public final void a(e eVar, c.a aVar, com.bytedance.ies.xbridge.e eVar2) {
        String str;
        WebView webView;
        a aVar2;
        l.c(eVar, "");
        l.c(aVar, "");
        l.c(eVar2, "");
        String str2 = eVar.f35938a;
        if (str2 == null) {
            l.a("eventName");
        }
        com.bytedance.ies.xbridge.b.a aVar3 = (com.bytedance.ies.xbridge.b.a) a(com.bytedance.ies.xbridge.b.a.class);
        if (aVar3 == null || (str = aVar3.a()) == null) {
            str = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        b.d dVar = (b.d) a(b.d.class);
        if (str.length() != 0 || (aVar2 = (a) a(a.class)) == null) {
            webView = null;
        } else {
            webView = aVar2.f35513d;
        }
        com.bytedance.ies.xbridge.e.b.b(new com.bytedance.ies.xbridge.e.e(str, currentTimeMillis, dVar, webView), str2);
        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
    }
}
