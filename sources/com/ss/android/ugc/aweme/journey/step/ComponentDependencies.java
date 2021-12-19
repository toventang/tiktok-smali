package com.ss.android.ugc.aweme.journey.step;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.journey.aa;
import com.ss.android.ugc.aweme.journey.ae;
import com.ss.android.ugc.aweme.journey.ai;
import com.ss.android.ugc.aweme.journey.k;
import com.ss.android.ugc.aweme.journey.n;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.r;
import com.ss.android.ugc.aweme.journey.step.a.b;
import com.ss.android.ugc.aweme.journey.step.b.d;
import com.ss.android.ugc.aweme.journey.step.c.c;
import com.ss.android.ugc.aweme.journey.step.c.e;
import com.ss.android.ugc.aweme.journey.w;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;

public final class ComponentDependencies extends ac implements b, d, c, com.ss.android.ugc.aweme.journey.step.d.c, com.ss.android.ugc.aweme.journey.step.e.d, com.ss.android.ugc.aweme.journey.step.f.c, com.ss.android.ugc.aweme.journey.step.g.d, com.ss.android.ugc.aweme.journey.step.h.b, com.ss.android.ugc.aweme.journey.step.h.d, com.ss.android.ugc.aweme.journey.step.interestselector.c, com.ss.android.ugc.aweme.journey.step.swipeup.d {
    private h.f.a.a<z> A;
    private h.f.a.b<? super Fragment, z> B;

    /* renamed from: a  reason: collision with root package name */
    public boolean f104911a = true;

    /* renamed from: b  reason: collision with root package name */
    public final t<List<w>> f104912b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<List<ai>> f104913c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.language.b f104914d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f104915e;

    /* renamed from: f  reason: collision with root package name */
    public e f104916f;

    /* renamed from: g  reason: collision with root package name */
    public ae f104917g;

    /* renamed from: h  reason: collision with root package name */
    public n f104918h;

    /* renamed from: i  reason: collision with root package name */
    public int f104919i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f104920j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f104921k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f104922l;

    /* renamed from: m  reason: collision with root package name */
    private LiveData<aa> f104923m;
    private p n;
    private h.f.a.b<? super Fragment, z> o;
    private h.f.a.b<? super Fragment, z> p;
    private List<Integer> q = h.a.z.INSTANCE;
    private final t<r> r = new t<>();
    private final t<Boolean> s = new t<>();
    private final t<com.ss.android.ugc.aweme.journey.step.d.b> t = new t<>();
    private h.f.a.a<? extends WeakReference<Context>> u = a.f104924a;
    private final t<n> v = new t<>();
    private h.f.a.a<z> w;
    private com.ss.android.ugc.aweme.language.b x;
    private h.f.a.a<z> y;
    private h.f.a.a<? extends WeakReference<androidx.fragment.app.e>> z;

    static {
        Covode.recordClassIndex(67265);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.b.d
    public final boolean a() {
        return this.f104911a;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.g.d, com.ss.android.ugc.aweme.journey.step.h.b, com.ss.android.ugc.aweme.journey.step.d.c, com.ss.android.ugc.aweme.journey.step.b.d, com.ss.android.ugc.aweme.journey.step.c.c, com.ss.android.ugc.aweme.journey.step.e.d, com.ss.android.ugc.aweme.journey.step.f.c, com.ss.android.ugc.aweme.journey.step.a.b, com.ss.android.ugc.aweme.journey.step.interestselector.c, com.ss.android.ugc.aweme.journey.step.swipeup.d
    public final List<Integer> c() {
        return this.q;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.e.d
    public final n e() {
        return this.f104918h;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.a<? extends java.lang.ref.WeakReference<android.content.Context>>, h.f.a.a<java.lang.ref.WeakReference<android.content.Context>> */
    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.d
    public final h.f.a.a<WeakReference<Context>> l() {
        return this.u;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.f.c, com.ss.android.ugc.aweme.journey.step.swipeup.d
    public final boolean m() {
        return this.f104915e;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.f.c, com.ss.android.ugc.aweme.journey.step.swipeup.d
    public final com.ss.android.ugc.aweme.language.b n() {
        return this.f104914d;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.c.c
    public final e q() {
        return this.f104916f;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.a.b
    public final ae r() {
        return this.f104917g;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.g.d
    public final int s() {
        return this.f104919i;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.g.d
    public final boolean t() {
        return this.f104920j;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.g.d
    public final boolean u() {
        return this.f104921k;
    }

    public final void a(List<Integer> list) {
        l.d(list, "");
        this.q = list;
    }

    static final class a extends m implements h.f.a.a<WeakReference<Context>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104924a = new a();

        static {
            Covode.recordClassIndex(67266);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakReference<Context> invoke() {
            return new WeakReference(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.g.d, com.ss.android.ugc.aweme.journey.step.h.b, com.ss.android.ugc.aweme.journey.step.a.b, com.ss.android.ugc.aweme.journey.step.interestselector.c, com.ss.android.ugc.aweme.journey.step.swipeup.d
    public final p b() {
        p pVar = this.n;
        if (pVar == null) {
            l.a("journeyStrategy");
        }
        return pVar;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.e.d
    public final int d() {
        return p.a.a().c();
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: h.f.a.b<? super androidx.fragment.app.Fragment, h.z>, h.f.a.b<androidx.fragment.app.Fragment, h.z> */
    @Override // com.ss.android.ugc.aweme.journey.step.d.c, com.ss.android.ugc.aweme.journey.step.b.d, com.ss.android.ugc.aweme.journey.step.c.c, com.ss.android.ugc.aweme.journey.step.e.d, com.ss.android.ugc.aweme.journey.step.f.c, com.ss.android.ugc.aweme.journey.step.a.b, com.ss.android.ugc.aweme.journey.step.interestselector.c, com.ss.android.ugc.aweme.journey.step.swipeup.d
    public final h.f.a.b<Fragment, z> f() {
        h.f.a.b bVar = this.o;
        if (bVar == null) {
            l.a("transactionRunnable");
        }
        return bVar;
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: h.f.a.b<? super androidx.fragment.app.Fragment, h.z>, h.f.a.b<androidx.fragment.app.Fragment, h.z> */
    @Override // com.ss.android.ugc.aweme.journey.step.g.d
    public final h.f.a.b<Fragment, z> g() {
        h.f.a.b bVar = this.p;
        if (bVar == null) {
            l.a("noAnimationTransactionRunnable");
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.d.c
    public final boolean h() {
        com.ss.android.ugc.aweme.journey.step.d.b value = this.t.getValue();
        if (value != null) {
            return value.f104977a;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.d.c
    public final Intent i() {
        com.ss.android.ugc.aweme.journey.step.d.b value = this.t.getValue();
        if (value != null) {
            return value.f104978b;
        }
        return null;
    }

    public final void j() {
        this.s.postValue(false);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.f.c, com.ss.android.ugc.aweme.journey.step.swipeup.d
    public final com.ss.android.ugc.aweme.language.b o() {
        com.ss.android.ugc.aweme.language.b bVar = this.x;
        if (bVar == null) {
            l.a("curI18nItem");
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.f.c, com.ss.android.ugc.aweme.journey.step.swipeup.d
    public final h.f.a.a<z> p() {
        h.f.a.a<z> aVar = this.w;
        if (aVar == null) {
            l.a("refreshFeedHandler");
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.h.b
    public final h.f.a.a<z> v() {
        h.f.a.a<z> aVar = this.y;
        if (aVar == null) {
            l.a("skipToFinishBlock");
        }
        return aVar;
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: h.f.a.a<? extends java.lang.ref.WeakReference<androidx.fragment.app.e>>, h.f.a.a<java.lang.ref.WeakReference<androidx.fragment.app.e>> */
    @Override // com.ss.android.ugc.aweme.journey.step.h.b
    public final h.f.a.a<WeakReference<androidx.fragment.app.e>> w() {
        h.f.a.a aVar = this.z;
        if (aVar == null) {
            l.a("fragmentActivityProvider");
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.h.b
    public final h.f.a.a<z> x() {
        h.f.a.a<z> aVar = this.A;
        if (aVar == null) {
            l.a("nextStepRunnable");
        }
        return aVar;
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: h.f.a.b<? super androidx.fragment.app.Fragment, h.z>, h.f.a.b<androidx.fragment.app.Fragment, h.z> */
    @Override // com.ss.android.ugc.aweme.journey.step.h.b
    public final h.f.a.b<Fragment, z> y() {
        h.f.a.b bVar = this.B;
        if (bVar == null) {
            l.a("replaceFragmentRunnable");
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.c
    public final boolean k() {
        Boolean value = this.s.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return true;
    }

    public final void a(LiveData<aa> liveData) {
        l.d(liveData, "");
        this.f104923m = liveData;
    }

    public final void b(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.w = aVar;
    }

    public final void c(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.y = aVar;
    }

    public final void d(h.f.a.a<? extends WeakReference<androidx.fragment.app.e>> aVar) {
        l.d(aVar, "");
        this.z = aVar;
    }

    public final void e(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.A = aVar;
    }

    public final void a(ae aeVar) {
        l.d(aeVar, "");
        this.f104917g = aeVar;
    }

    public final void c(h.f.a.b<? super Fragment, z> bVar) {
        l.d(bVar, "");
        this.B = bVar;
    }

    public final r a(Context context) {
        l.d(context, "");
        r value = this.r.getValue();
        if (value == null) {
            return p.a.a().a(context, (Boolean) false);
        }
        return value;
    }

    public final void b(h.f.a.b<? super Fragment, z> bVar) {
        l.d(bVar, "");
        this.o = bVar;
    }

    public final void c(List<ai> list) {
        l.d(list, "");
        this.f104913c.postValue(list);
    }

    public final void a(k kVar) {
        l.d(kVar, "");
        this.f104916f = e.a.a(kVar);
    }

    public final void b(List<w> list) {
        l.d(list, "");
        this.f104912b.postValue(list);
    }

    public final void a(n nVar) {
        l.d(nVar, "");
        this.f104918h = nVar;
    }

    public final void a(p pVar) {
        l.d(pVar, "");
        this.n = pVar;
    }

    public final void a(com.ss.android.ugc.aweme.journey.step.d.b bVar) {
        l.d(bVar, "");
        this.t.postValue(bVar);
    }

    public final void a(com.ss.android.ugc.aweme.language.b bVar) {
        l.d(bVar, "");
        this.x = bVar;
    }

    public final void a(h.f.a.a<? extends WeakReference<Context>> aVar) {
        l.d(aVar, "");
        this.u = aVar;
    }

    public final void a(h.f.a.b<? super Fragment, z> bVar) {
        l.d(bVar, "");
        this.p = bVar;
    }
}
