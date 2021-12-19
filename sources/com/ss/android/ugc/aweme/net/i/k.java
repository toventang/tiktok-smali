package com.ss.android.ugc.aweme.net.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.a;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.ies.ugc.network.partner.b.e;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.ss.android.ugc.aweme.utils.gw;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.b.l;
import h.m.p;

public final class k implements b.e {
    static {
        Covode.recordClassIndex(72219);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.e
    public final void a(f fVar, a aVar) {
        String str;
        String c2;
        l.d(fVar, "");
        l.d(aVar, "");
        gw a2 = gw.a();
        if (gw.b()) {
            str = fVar.f35269b.f35297e.a();
            try {
                gw.a(str, false);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            str = null;
        }
        e eVar = fVar.f35269b.f35298f;
        String[] strArr = gw.f143036b;
        for (String str2 : strArr) {
            l.b(str2, "");
            String a3 = eVar.a(str2);
            if (a3 != null && !p.a((CharSequence) a3) && !hk.a(eVar.a("sec_".concat(String.valueOf(str2)))) && (c2 = a2.c(a3)) != null && !p.a((CharSequence) c2)) {
                if (str == null) {
                    str = fVar.f35269b.f35297e.a();
                }
                if (gw.a().b(str)) {
                    eVar.b(str2);
                }
                eVar.a("sec_".concat(String.valueOf(str2)), c2);
            }
        }
    }
}
