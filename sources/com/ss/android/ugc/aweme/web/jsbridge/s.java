package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.HybridRegistryProvider;
import com.ss.android.ugc.aweme.web.i;
import h.f.b.l;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f145050a = new s();

    private s() {
    }

    static {
        Covode.recordClassIndex(94841);
    }

    public static i a(Context context) {
        IHybridRegistryProvider a2 = HybridRegistryProvider.a();
        if (context == null) {
            l.b();
        }
        i a3 = a2.a(context);
        l.b(a3, "");
        return a3;
    }
}
