package com.ss.android.ugc.aweme.setting.unit.privacy;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ufr.g;
import h.f.b.l;

public final class FindCtxViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public boolean f122960a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f122961b;

    /* renamed from: c  reason: collision with root package name */
    final t<c> f122962c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    final t<c> f122963d = new t<>();

    static {
        Covode.recordClassIndex(80744);
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        if (cVar.f122966a.f141689a == g.SYNC_STATUS) {
            if (l.a((Object) cVar.f122967b, (Object) "contact")) {
                this.f122962c.postValue(cVar);
            }
            if (l.a((Object) cVar.f122967b, (Object) "facebook")) {
                this.f122963d.postValue(cVar);
            }
        }
    }
}
