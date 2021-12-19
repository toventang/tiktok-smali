package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final g f20929a;

    static {
        Covode.recordClassIndex(12387);
    }

    k(g gVar) {
        this.f20929a = gVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f20929a.a(-1, (String) null, (String) null, "score_display_config_failed");
        i.b();
        a.a(5, "ttlive_exception", ((Throwable) obj).getStackTrace());
    }
}
