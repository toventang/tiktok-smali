package com.bytedance.android.live.liveinteract.platform.common.h;

import android.util.Base64;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.live.network.h;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.model.message.d.c.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f12046a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(6565);
    }

    public static final d a(aj ajVar) {
        l.d(ajVar, "");
        if (ajVar.w != null) {
            return ajVar.w;
        }
        if (ajVar.t == null) {
            return null;
        }
        try {
            com.bytedance.android.e.a.a.b a2 = h.a().a(d.class);
            byte[] decode = Base64.decode(ajVar.t, 0);
            l.b(decode, "");
            if (a2 == null) {
                l.b();
            }
            ajVar.w = (d) a2.a(new f().a(com.bytedance.android.e.a.a.d.a(decode)));
            return ajVar.w;
        } catch (Exception unused) {
            return null;
        }
    }
}
