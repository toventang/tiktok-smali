package com.ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dependence.a.a.b.b;
import com.ss.android.ugc.aweme.dependence.a.a.b.c;
import com.ss.android.ugc.aweme.editSticker.b.a;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class h<T extends a> extends c<T, Void> {

    /* renamed from: a  reason: collision with root package name */
    private final m<T, d<? super z>, Object> f88490a;

    static {
        Covode.recordClassIndex(55709);
    }

    private /* synthetic */ h() {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.f.a.m<? super T extends com.ss.android.ugc.aweme.editSticker.b.a, ? super h.c.d<? super h.z>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(m<? super T, ? super d<? super z>, ? extends Object> mVar) {
        this.f88490a = mVar;
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.b.c
    public final /* synthetic */ b a(Object obj, String str) {
        a aVar = (a) obj;
        l.d(aVar, "");
        l.d(str, "");
        return new g(str, aVar, this.f88490a);
    }
}
