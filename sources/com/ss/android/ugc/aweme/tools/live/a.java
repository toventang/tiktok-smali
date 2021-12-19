package com.ss.android.ugc.aweme.tools.live;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.port.in.am;
import com.ss.android.ugc.aweme.port.internal.g;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.gamora.recorder.b.k;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.u;
import h.z;
import java.util.List;
import java.util.Objects;

public final class a extends k implements com.bytedance.jedi.arch.b {

    /* renamed from: b  reason: collision with root package name */
    public static final C3698a f140220b = new C3698a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RecordLiveViewModel f140221a;

    /* renamed from: c  reason: collision with root package name */
    private final h f140222c = i.a((h.f.a.a) b.f140233a);

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f140223d;

    /* renamed from: e  reason: collision with root package name */
    private am.a f140224e;

    static {
        Covode.recordClassIndex(91613);
    }

    private final com.ss.android.ugc.aweme.port.internal.g I() {
        return (com.ss.android.ugc.aweme.port.internal.g) this.f140222c.getValue();
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final boolean C() {
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final String a() {
        return "RecordLiveScene";
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$a  reason: collision with other inner class name */
    public static final class C3698a {
        static {
            Covode.recordClassIndex(91614);
        }

        private C3698a() {
        }

        public /* synthetic */ C3698a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.port.internal.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f140233a = new b();

        static {
            Covode.recordClassIndex(91615);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.port.internal.g invoke() {
            return com.ss.android.ugc.aweme.port.in.c.s.d();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final boolean E() {
        D();
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final boolean F() {
        D();
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final boolean G() {
        D();
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final boolean H() {
        D();
        return false;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final void d() {
        com.ss.android.ugc.aweme.port.internal.g D = D();
        View view = this.n;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        D.a((ViewGroup) view);
        am amVar = com.ss.android.ugc.aweme.port.in.c.s;
        am.a aVar = this.f140224e;
        if (aVar == null) {
            l.a("mLiveStartListener");
        }
        amVar.b(aVar);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        am amVar = com.ss.android.ugc.aweme.port.in.c.s;
        am.a aVar = this.f140224e;
        if (aVar == null) {
            l.a("mLiveStartListener");
        }
        amVar.b(aVar);
        super.n_();
    }

    public static final class d implements g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.port.internal.g f140236b;

        static {
            Covode.recordClassIndex(91617);
        }

        private boolean c() {
            if (a.a(this.f140235a).f140219d == null) {
                return false;
            }
            ShortVideoContext shortVideoContext = a.a(this.f140235a).f140219d;
            if (shortVideoContext == null) {
                l.b();
            }
            if (!shortVideoContext.f124757b.b()) {
                ShortVideoContext shortVideoContext2 = a.a(this.f140235a).f140219d;
                if (shortVideoContext2 == null) {
                    l.b();
                }
                if (!shortVideoContext2.f124757b.c()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.port.internal.g.a
        public final void a() {
            if (c() && this.f140236b.a() != null) {
                View a2 = this.f140236b.a();
                if (a2 == null) {
                    l.b();
                }
                l.b(a2, "");
                a2.setVisibility(8);
            }
        }

        @Override // com.ss.android.ugc.aweme.port.internal.g.a
        public final void b() {
            if (c() && this.f140236b.a() != null) {
                View a2 = this.f140236b.a();
                if (a2 == null) {
                    l.b();
                }
                l.b(a2, "");
                a2.setVisibility(0);
            }
        }

        d(a aVar, com.ss.android.ugc.aweme.port.internal.g gVar) {
            this.f140235a = aVar;
            this.f140236b = gVar;
        }
    }

    static final class g implements am.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140239a;

        static {
            Covode.recordClassIndex(91620);
        }

        g(a aVar) {
            this.f140239a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.am.a
        public final void a() {
            q.a("OnLiveStartListener#onStartLive");
            RecordLiveViewModel a2 = a.a(this.f140239a);
            com.ss.android.ugc.asve.recorder.c.a aVar = a2.f140218c;
            if (aVar == null) {
                l.a("mediaController");
            }
            aVar.a((PrivacyCert) null);
            a2.a().c(false, null);
        }
    }

    public final com.ss.android.ugc.aweme.port.internal.g D() {
        com.ss.android.ugc.aweme.shortvideo.x.i filterModule;
        if (!this.f140223d) {
            boolean z = true;
            this.f140223d = true;
            com.ss.android.ugc.aweme.port.internal.g I = I();
            Activity activity = this.f42913m;
            RecordLiveViewModel recordLiveViewModel = this.f140221a;
            if (recordLiveViewModel == null) {
                l.a("recordLiveViewModel");
            }
            I.a(activity, recordLiveViewModel.f140216a);
            RecordLiveViewModel recordLiveViewModel2 = this.f140221a;
            if (recordLiveViewModel2 == null) {
                l.a("recordLiveViewModel");
            }
            IRecordingOperationPanel iRecordingOperationPanel = recordLiveViewModel2.f140216a;
            if (!(iRecordingOperationPanel == null || (filterModule = iRecordingOperationPanel.filterModule()) == null)) {
                filterModule.a(new c(this));
            }
            I.a(new View[0]);
            I.a(new d(this, I));
            RecordLiveViewModel recordLiveViewModel3 = this.f140221a;
            if (recordLiveViewModel3 == null) {
                l.a("recordLiveViewModel");
            }
            com.bytedance.creativex.recorder.b.a.d a2 = recordLiveViewModel3.a();
            am amVar = com.ss.android.ugc.aweme.port.in.c.s;
            if (a2.N() != 1) {
                z = false;
            }
            amVar.b(z);
        }
        return I();
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final void b() {
        String str;
        String str2;
        D();
        Bundle bundle = new Bundle();
        RecordLiveViewModel recordLiveViewModel = this.f140221a;
        if (recordLiveViewModel == null) {
            l.a("recordLiveViewModel");
        }
        ShortVideoContext shortVideoContext = recordLiveViewModel.f140219d;
        String str3 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.r;
        } else {
            str = null;
        }
        bundle.putString("shoot_way", str);
        RecordLiveViewModel recordLiveViewModel2 = this.f140221a;
        if (recordLiveViewModel2 == null) {
            l.a("recordLiveViewModel");
        }
        ShortVideoContext shortVideoContext2 = recordLiveViewModel2.f140219d;
        if (shortVideoContext2 != null) {
            str2 = shortVideoContext2.x;
        } else {
            str2 = null;
        }
        bundle.putString("enter_from", str2);
        bundle.putString("video_id", dv.a());
        RecordLiveViewModel recordLiveViewModel3 = this.f140221a;
        if (recordLiveViewModel3 == null) {
            l.a("recordLiveViewModel");
        }
        ShortVideoContext shortVideoContext3 = recordLiveViewModel3.f140219d;
        if (shortVideoContext3 != null) {
            str3 = shortVideoContext3.o;
        }
        bundle.putString("sourceParams", str3);
        bundle.putString("enter_from_type", String.valueOf(com.ss.android.ugc.aweme.tools.live.sticker.a.f140240a));
        cr a2 = cr.a();
        l.b(a2, "");
        List<AVChallenge> list = a2.f125298d;
        l.b(list, "");
        if (!list.isEmpty()) {
            cr a3 = cr.a();
            l.b(a3, "");
            String b2 = com.ss.android.ugc.aweme.port.in.g.a().G().b(a3.f125298d.get(0));
            l.b(b2, "");
            bundle.putString("challenge", b2);
        }
        com.ss.android.ugc.aweme.port.internal.g D = D();
        View view = this.n;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        D.a((ViewGroup) view, bundle);
        RecordLiveViewModel recordLiveViewModel4 = this.f140221a;
        if (recordLiveViewModel4 == null) {
            l.a("recordLiveViewModel");
        }
        ShortVideoContext shortVideoContext4 = recordLiveViewModel4.f140219d;
        if (shortVideoContext4 != null && shortVideoContext4.f124757b.f124711f.isEmpty()) {
            am amVar = com.ss.android.ugc.aweme.port.in.c.s;
            am.a aVar = this.f140224e;
            if (aVar == null) {
                l.a("mLiveStartListener");
            }
            amVar.a(aVar);
        }
        if (this.f140221a == null) {
            l.a("recordLiveViewModel");
        }
        D();
    }

    public static final /* synthetic */ RecordLiveViewModel a(a aVar) {
        RecordLiveViewModel recordLiveViewModel = aVar.f140221a;
        if (recordLiveViewModel == null) {
            l.a("recordLiveViewModel");
        }
        return recordLiveViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140237a;

        static {
            Covode.recordClassIndex(91618);
        }

        e(a aVar) {
            this.f140237a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            u uVar = (u) obj;
            ((Number) uVar.component1()).intValue();
            ((Number) uVar.component2()).intValue();
            uVar.component3();
            this.f140237a.D();
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140238a;

        static {
            Covode.recordClassIndex(91619);
        }

        f(a aVar) {
            this.f140238a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            p pVar = (p) obj;
            pVar.component1();
            ((Number) pVar.component2()).intValue();
            this.f140238a.D();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<F, T> implements com.google.c.a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140234a;

        static {
            Covode.recordClassIndex(91616);
        }

        c(a aVar) {
            this.f140234a = aVar;
        }

        @Override // com.google.c.a.f
        public final /* synthetic */ Object a(Object obj) {
            FilterBean filterBean = (FilterBean) obj;
            if (filterBean != null) {
                this.f140234a.D();
                com.ss.android.ugc.asve.recorder.effect.a z = a.a(this.f140234a).a().z();
                l.b(filterBean, "");
                String filterFolder = filterBean.getFilterFolder();
                l.b(filterFolder, "");
                Float valueOf = Float.valueOf(z.b(filterFolder));
                if (valueOf != null) {
                    return valueOf;
                }
            }
            return Float.valueOf(0.0f);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        ((com.ss.android.ugc.aweme.shortvideo.h.a) ApiCenter.a.a(com.bytedance.scene.ktx.c.b(this)).a(com.ss.android.ugc.aweme.shortvideo.h.a.class)).e().a(this, new e(this));
        ((com.ss.android.ugc.aweme.shortvideo.n.a) ApiCenter.a.a(com.bytedance.scene.ktx.c.b(this)).a(com.ss.android.ugc.aweme.shortvideo.n.a.class)).a().a(this, new f(this));
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(RecordLiveViewModel.class);
        l.b(a2, "");
        this.f140221a = (RecordLiveViewModel) a2;
        this.f140224e = new g(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.biw, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<com.bytedance.jedi.arch.am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
