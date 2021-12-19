package com.bytedance.android.live.liveinteract.linkroom.a.c;

import com.bytedance.android.live.liveinteract.cohost.a.b.j;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f10518a;

    static {
        Covode.recordClassIndex(5602);
    }

    l(b bVar) {
        this.f10518a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f10518a;
        int intValue = ((Long) obj).intValue();
        bVar.f10496a.N = intValue - 1;
        if (bVar.w != null) {
            bVar.w.b(j.class, Integer.valueOf(intValue));
        }
    }
}
