package com.bytedance.ies.im.core.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.d;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.aj;
import com.bytedance.im.core.internal.utils.m;
import com.bytedance.im.core.internal.utils.q;
import h.f.b.l;
import h.h;
import h.i;
import java.util.List;

public final class c extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f33927b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f33928c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33929d = 7;

    /* renamed from: e  reason: collision with root package name */
    private final h f33930e = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(20166);
    }

    private final aj d() {
        return (aj) this.f33930e.getValue();
    }

    @Override // com.bytedance.ies.im.core.api.b.d
    public final void b() {
        d().a();
    }

    @Override // com.bytedance.ies.im.core.api.b.d
    public final List<ai> c() {
        m mVar = d().f37706d;
        l.b(mVar, "");
        return mVar;
    }

    static final class a extends h.f.b.m implements h.f.a.a<aj> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(20167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aj invoke() {
            return new aj(this.this$0.f33927b, this.this$0.f33928c, this.this$0.f33929d);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.d
    public final void a() {
        aj d2 = d();
        d2.f37707e = null;
        d2.f37706d.clear();
        q.a().b(d2.f37703a, d2);
    }

    @Override // com.bytedance.ies.im.core.api.b.d
    public final void a(com.bytedance.ies.im.core.api.b.a.d dVar) {
        l.d(dVar, "");
        aj d2 = d();
        d2.f37707e = dVar;
        q.a().a(d2.f37703a, d2);
    }

    public c(String str, int[] iArr, int i2) {
        l.d(str, "");
        this.f33927b = str;
        this.f33928c = iArr;
    }
}
