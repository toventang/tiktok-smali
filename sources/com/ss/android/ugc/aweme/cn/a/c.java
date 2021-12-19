package com.ss.android.ugc.aweme.cn.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cn.i;
import h.f.b.l;

public abstract class c {

    /* renamed from: b  reason: collision with root package name */
    public final f.a.l.c<i> f71200b;

    static {
        Covode.recordClassIndex(43822);
    }

    public c() {
        f.a.l.c<i> cVar = new f.a.l.c<>();
        l.b(cVar, "");
        this.f71200b = cVar;
    }

    public final void a(i iVar) {
        l.d(iVar, "");
        this.f71200b.onNext(iVar);
    }
}
