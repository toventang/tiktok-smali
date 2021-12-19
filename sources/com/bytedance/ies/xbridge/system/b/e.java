package com.bytedance.ies.xbridge.system.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.system.a.e;
import com.bytedance.ies.xbridge.system.c.f;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;

public final class e extends com.bytedance.ies.xbridge.system.a.e {
    static {
        Covode.recordClassIndex(21877);
    }

    @Override // com.bytedance.ies.xbridge.system.a.e
    public final void a(f fVar, e.a aVar, com.bytedance.ies.xbridge.e eVar) {
        l.c(fVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a("Context not provided in host");
            return;
        }
        String str = fVar.f36499a;
        if (str == null) {
            l.a("phoneNumber");
        }
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("smsto", str, null));
        String str2 = fVar.f36500b;
        if (str2 == null) {
            l.a("content");
        }
        intent.putExtra("sms_body", str2);
        a.a(intent, context);
        context.startActivity(intent);
        aVar.a(new b(), "");
    }
}
