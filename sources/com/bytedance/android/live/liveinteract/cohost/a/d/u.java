package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.liveinteract.cohost.a.d.d;
import com.bytedance.android.live.liveinteract.platform.common.g.p;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f10151a;

    static {
        Covode.recordClassIndex(5331);
    }

    u(d dVar) {
        this.f10151a = dVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = this.f10151a;
        Throwable th = (Throwable) obj;
        p.a(p.f11999b, th);
        dVar.a(th);
        ((d.a) dVar.y).a(206);
    }
}
