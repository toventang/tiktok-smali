package com.bytedance.ies.xbridge.system.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.system.a.c;
import com.bytedance.ies.xbridge.system.c.d;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;

public final class c extends com.bytedance.ies.xbridge.system.a.c {
    static {
        Covode.recordClassIndex(21871);
    }

    @Override // com.bytedance.ies.xbridge.system.a.c
    public final void a(d dVar, c.a aVar, e eVar) {
        l.c(dVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        String str = dVar.f36495a;
        if (str == null) {
            l.a("phoneNumber");
        }
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null));
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a("Context not provided in host");
            return;
        }
        a.a(intent, context);
        context.startActivity(intent);
        aVar.a(new b(), "");
    }
}
