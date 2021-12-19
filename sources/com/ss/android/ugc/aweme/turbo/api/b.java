package com.ss.android.ugc.aweme.turbo.api;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.turbo.vi.TurboViImpl;
import h.f.b.l;
import h.m.p;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f141467a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ITurboApi f141468b;

    private b() {
    }

    static {
        Covode.recordClassIndex(92393);
    }

    private static boolean b() {
        return p.a("vivo", Build.BRAND, true);
    }

    public static ITurboApi a() {
        ITurboApi iTurboApi;
        if (f141468b == null) {
            if (b()) {
                iTurboApi = TurboViImpl.a();
            } else {
                iTurboApi = a.f141466a;
            }
            f141468b = iTurboApi;
        }
        ITurboApi iTurboApi2 = f141468b;
        if (iTurboApi2 == null) {
            l.b();
        }
        return iTurboApi2;
    }
}
