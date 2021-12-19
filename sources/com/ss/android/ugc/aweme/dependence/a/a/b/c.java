package com.ss.android.ugc.aweme.dependence.a.a.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class c<Param, Target> {

    /* renamed from: a  reason: collision with root package name */
    private final a f79575a;

    static {
        Covode.recordClassIndex(49425);
    }

    /* access modifiers changed from: protected */
    public abstract b<Param, Target> a(Param param, String str);

    public /* synthetic */ c() {
        this(new f());
    }

    public final b<Param, Target> a(Param param) {
        return a(param, this.f79575a.a());
    }

    private c(a aVar) {
        l.d(aVar, "");
        this.f79575a = aVar;
    }
}
