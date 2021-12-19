package com.ss.android.ugc.aweme.discover.helper;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.a;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.ref.WeakReference;

public final class d implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f81103a = i.a((h.f.a.a) b.f81105a);

    /* renamed from: b  reason: collision with root package name */
    private a f81104b;

    public interface a {
        static {
            Covode.recordClassIndex(50407);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(50406);
    }

    private final a i() {
        return (a) this.f81103a.getValue();
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

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void g() {
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void h() {
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f81105a = new b();

        static {
            Covode.recordClassIndex(50408);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.a.b
    public final void a() {
        a aVar = this.f81104b;
        if (aVar == null) {
            l.a("refreshSuggestSearchWhenStart");
        }
        aVar.a();
    }

    public d(e eVar, a aVar) {
        l.d(aVar, "");
        if (eVar != null) {
            i().a(new WeakReference<>(eVar));
            i().a(this);
            this.f81104b = aVar;
        }
    }
}
