package com.ss.android.ugc.aweme.discover.ui;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.j;
import com.ss.android.ugc.aweme.discover.helper.a;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.ref.WeakReference;

public final class o implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final e f82625a;

    /* renamed from: b  reason: collision with root package name */
    public final j f82626b;

    /* renamed from: c  reason: collision with root package name */
    private final h f82627c = i.a((h.f.a.a) a.f82628a);

    static {
        Covode.recordClassIndex(51456);
    }

    private final com.ss.android.ugc.aweme.discover.helper.a i() {
        return (com.ss.android.ugc.aweme.discover.helper.a) this.f82627c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void e() {
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void f() {
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.helper.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f82628a = new a();

        static {
            Covode.recordClassIndex(51457);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.helper.a invoke() {
            return new com.ss.android.ugc.aweme.discover.helper.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void g() {
        j jVar = this.f82626b;
        if (jVar != null) {
            jVar.b(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void h() {
        j jVar = this.f82626b;
        if (jVar != null) {
            jVar.b(false);
        }
    }

    public o(e eVar, j jVar) {
        this.f82625a = eVar;
        this.f82626b = jVar;
        if (eVar != null) {
            i().a(new WeakReference<>(eVar));
            i().a(this);
        }
    }
}
