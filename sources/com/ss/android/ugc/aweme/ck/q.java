package com.ss.android.ugc.aweme.ck;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.t;
import h.f.b.l;

public final class q implements j {

    /* renamed from: a  reason: collision with root package name */
    private final t.b f71153a;

    static {
        Covode.recordClassIndex(43797);
    }

    public q(t.b bVar) {
        l.d(bVar, "");
        this.f71153a = bVar;
    }

    private final String a(String str) {
        if (str == null) {
            return null;
        }
        return this.f71153a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean c(String str) {
        String a2 = a(str);
        if (a2 == null || a2.length() == 0) {
            return false;
        }
        return t.a(t.a(), a2);
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean a(Activity activity, String str) {
        String a2 = a(str);
        if (a2 == null || a2.length() == 0) {
            return false;
        }
        return t.a(t.a(), activity, a2);
    }
}
