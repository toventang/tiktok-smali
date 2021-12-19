package com.bytedance.ies.xbridge.m.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m.a.d;
import com.bytedance.ies.xbridge.m.c.e;
import com.bytedance.ies.xbridge.m.d.a;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.l;

public final class d extends com.bytedance.ies.xbridge.m.a.d {
    static {
        Covode.recordClassIndex(21692);
    }

    @Override // com.bytedance.ies.xbridge.m.a.d
    public final void a(e eVar, d.a aVar, com.bytedance.ies.xbridge.e eVar2) {
        boolean z;
        l.c(eVar, "");
        l.c(aVar, "");
        l.c(eVar2, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a(0, "Context not provided in host");
            return;
        }
        String str = eVar.f36276a;
        if (str == null) {
            l.a("key");
        }
        k kVar = eVar.f36277b;
        if (kVar == null) {
            l.a("data");
        }
        switch (e.f36266a[kVar.a().ordinal()]) {
            case 1:
                z = a.a(context).a(str, Boolean.valueOf(kVar.b()));
                break;
            case 2:
                z = a.a(context).a(str, Integer.valueOf(kVar.d()));
                break;
            case 3:
                z = a.a(context).a(str, kVar.e());
                break;
            case 4:
                z = a.a(context).a(str, Double.valueOf(kVar.c()));
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                z = a.a(context).a(str, kVar.f());
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                z = a.a(context).a(str, kVar.g());
                break;
            default:
                aVar.a(-3, "Illegal value type");
        }
        if (z) {
            aVar.a(new b(), "");
            return;
        }
        aVar.a(-3, "Illegal value type");
    }
}
