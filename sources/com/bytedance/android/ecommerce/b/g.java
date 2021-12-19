package com.bytedance.android.ecommerce.b;

import com.bytedance.android.ecommerce.e.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n;
import java.util.HashMap;

public class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7023a = "OpenWebViewMethod";

    /* renamed from: b  reason: collision with root package name */
    private final String f7024b = "url";

    static {
        Covode.recordClassIndex(3364);
    }

    @Override // com.bytedance.android.ecommerce.b.a
    public final String a() {
        return "pipo.openWebView";
    }

    @Override // com.bytedance.ies.xbridge.b, com.bytedance.android.ecommerce.b.a
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        String str;
        super.a(nVar, bVar, eVar);
        if (nVar.a("url")) {
            str = nVar.f("url");
        } else {
            str = "";
        }
        bVar.a(new HashMap());
        c.f7063a.j().a(str);
        bVar.a(null);
    }
}
