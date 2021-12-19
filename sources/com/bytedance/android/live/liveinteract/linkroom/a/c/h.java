package com.bytedance.android.live.liveinteract.linkroom.a.c;

import com.bytedance.android.live.liveinteract.linkroom.a.c.b;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f10514a;

    static {
        Covode.recordClassIndex(5598);
    }

    h(b bVar) {
        this.f10514a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ((b.a) this.f10514a.y).b(false);
        v.a("multi-guest", (Throwable) obj);
    }
}
