package com.ss.android.ugc.aweme.effect.c.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import dmt.av.video.r;
import dmt.av.video.w;
import h.f.a.a;
import h.f.b.l;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private final a<g> f88915a;

    /* renamed from: b  reason: collision with root package name */
    private final a<r> f88916b;

    static {
        Covode.recordClassIndex(55923);
    }

    @Override // com.ss.android.ugc.aweme.effect.c.a.a
    public final void a(w wVar) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.effect.c.a.a
    public final boolean a() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.effect.c.a.a
    public final void b(w wVar) {
        r invoke = this.f88916b.invoke();
        if (invoke != null) {
            g invoke2 = this.f88915a.invoke();
            if (invoke.f156938a >= 0) {
                invoke2.a(invoke.f156938a, invoke.f156939b, invoke.f156940c, invoke.f156944g);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.asve.editor.g> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(a<? extends g> aVar, a<r> aVar2) {
        super(aVar);
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f88915a = aVar;
        this.f88916b = aVar2;
    }
}
