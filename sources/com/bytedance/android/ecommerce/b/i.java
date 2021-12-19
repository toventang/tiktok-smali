package com.bytedance.android.ecommerce.b;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.e.c;
import com.bytedance.android.ecommerce.h.a;
import com.bytedance.android.ecommerce.j.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n;
import java.util.Map;

public class i extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7025a = "StarlingMethod";

    static {
        Covode.recordClassIndex(3366);
    }

    @Override // com.bytedance.android.ecommerce.b.a
    public final String a() {
        return "pipo.getStarlingData";
    }

    @Override // com.bytedance.ies.xbridge.b, com.bytedance.android.ecommerce.b.a
    public final void a(n nVar, final b.AbstractC0814b bVar, e eVar) {
        super.a(nVar, bVar, eVar);
        String f2 = nVar.f("language");
        String f3 = nVar.f("url");
        if (TextUtils.isEmpty(f2)) {
            a.a("language is null!", bVar);
        } else if (TextUtils.isEmpty(f3)) {
            a.a("url is null!", bVar);
        } else {
            c.f7063a.h().a(f3, new j.a() {
                /* class com.bytedance.android.ecommerce.b.i.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3367);
                }

                @Override // com.bytedance.android.ecommerce.j.j.a
                public final void a(Map<String, String> map) {
                    a.a(map, bVar);
                }
            }, f2);
        }
    }
}
