package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.ao;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.w;
import h.a.n;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class au extends com.ss.android.ugc.gamora.b.a implements com.bytedance.jedi.arch.b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f125633j = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public VECutVideoPresenter f125634f;

    /* renamed from: g  reason: collision with root package name */
    public bs f125635g;

    /* renamed from: h  reason: collision with root package name */
    CutVideoViewModel f125636h;

    /* renamed from: i  reason: collision with root package name */
    public CutMultiVideoViewModel f125637i;

    /* renamed from: k  reason: collision with root package name */
    private VideoEditViewModel f125638k;

    /* renamed from: l  reason: collision with root package name */
    private CutVideoPreviewViewModel f125639l;
    private final h.h t = h.i.a((h.f.a.a) new b(this));
    private final h.h u = h.i.a((h.f.a.a) new j(this));
    private final h.h v = h.i.a((h.f.a.a) new c(this));

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f125645a = new g();

        static {
            Covode.recordClassIndex(82519);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class h implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f125646a = new h();

        static {
            Covode.recordClassIndex(82520);
        }

        h() {
        }

        @Override // f.a.d.a
        public final void a() {
        }
    }

    static {
        Covode.recordClassIndex(82511);
    }

    public final e F() {
        return (e) this.t.getValue();
    }

    public final n G() {
        return (n) this.u.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82512);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
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

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.corner.c> {
        final /* synthetic */ au this$0;

        static {
            Covode.recordClassIndex(82514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(au auVar) {
            super(0);
            this.this$0 = auVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.corner.c invoke() {
            com.ss.android.ugc.gamora.editor.corner.c cVar = new com.ss.android.ugc.gamora.editor.corner.c();
            this.this$0.a(R.id.e4f, cVar, "EditCornerScene");
            return cVar;
        }
    }

    public final VECutVideoPresenter E() {
        VECutVideoPresenter vECutVideoPresenter = this.f125634f;
        if (vECutVideoPresenter == null) {
            l.a("presenter");
        }
        return vECutVideoPresenter;
    }

    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h H() {
        return G().b();
    }

    static final class j extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ au this$0;

        static {
            Covode.recordClassIndex(82522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(au auVar) {
            super(0);
            this.this$0 = auVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            n nVar = new n(false, true, 1);
            nVar.a(this.this$0.E());
            this.this$0.a(R.id.e4f, nVar, "CutVideoEditScene");
            return nVar;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ au this$0;

        static {
            Covode.recordClassIndex(82513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(au auVar) {
            super(0);
            this.this$0 = auVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            e eVar = new e();
            eVar.a(this.this$0.E());
            bs bsVar = this.this$0.f125635g;
            if (bsVar == null) {
                l.a("previewEditCallback");
            }
            eVar.a(bsVar);
            this.this$0.a(R.id.e4f, eVar, "CutVideoBottomBarScene");
            return eVar;
        }
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ au f125647a;

        static {
            Covode.recordClassIndex(82521);
        }

        i(au auVar) {
            this.f125647a = auVar;
        }

        public final void run() {
            Activity t = this.f125647a.t();
            l.b(t, "");
            View startSlide = this.f125647a.G().b().getStartSlide();
            l.b(startSlide, "");
            ao.a(t, startSlide, false);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ au f125640a;

        static {
            Covode.recordClassIndex(82515);
        }

        d(au auVar) {
            this.f125640a = auVar;
        }

        public final void run() {
            au auVar = this.f125640a;
            if (com.ss.android.ugc.aweme.shortvideo.edit.c.b.a() && auVar.H().getMaxCutDuration() >= 60000) {
                CutVideoViewModel cutVideoViewModel = auVar.f125636h;
                if (cutVideoViewModel == null) {
                    l.a("cutVideoViewModel");
                }
                String str = cutVideoViewModel.b().f125553b;
                if (str == null || str.length() <= 0) {
                    CutVideoViewModel cutVideoViewModel2 = auVar.f125636h;
                    if (cutVideoViewModel2 == null) {
                        l.a("cutVideoViewModel");
                    }
                    ArrayList<MediaModel> arrayList = cutVideoViewModel2.b().f125552a;
                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(it.next().f109396h));
                    }
                    if (n.v(arrayList2) > 60000 && ao.a(false)) {
                        auVar.G().b().post(new i(auVar));
                    }
                } else {
                    t.a(new e(auVar, str)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(auVar), g.f125645a, h.f125646a);
                }
            }
            bj.a("get edit view duration");
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ au f125641a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f125642b;

        static {
            Covode.recordClassIndex(82516);
        }

        e(au auVar, String str) {
            this.f125641a = auVar;
            this.f125642b = str;
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<MediaModel> vVar) {
            l.d(vVar, "");
            String str = this.f125642b;
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f125641a.f125637i;
            if (cutMultiVideoViewModel == null) {
                l.a("cutMultiVideoViewModel");
            }
            MediaModel a2 = com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.d.a(str, cutMultiVideoViewModel);
            if (a2 != null) {
                vVar.a(a2);
            }
            vVar.a();
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ au f125643a;

        static {
            Covode.recordClassIndex(82517);
        }

        f(au auVar) {
            this.f125643a = auVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            MediaModel mediaModel = (MediaModel) obj;
            l.b(mediaModel, "");
            if (mediaModel.f109396h > 60000 && ao.a(false)) {
                this.f125643a.G().b().post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.cut.scene.au.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f125644a;

                    static {
                        Covode.recordClassIndex(82518);
                    }

                    {
                        this.f125644a = r1;
                    }

                    public final void run() {
                        Activity t = this.f125644a.f125643a.t();
                        l.b(t, "");
                        View startSlide = this.f125644a.f125643a.G().b().getStartSlide();
                        l.b(startSlide, "");
                        ao.a(t, startSlide, false);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.f
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(CutVideoViewModel.class);
        l.b(a2, "");
        this.f125636h = (CutVideoViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a3 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity2, (ad.b) null).a(VideoEditViewModel.class);
        l.b(a3, "");
        this.f125638k = (VideoEditViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity3).a(CutVideoPreviewViewModel.class);
        l.b(a4, "");
        this.f125639l = (CutVideoPreviewViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a5 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity4, (ad.b) null).a(CutMultiVideoViewModel.class);
        l.b(a5, "");
        this.f125637i = (CutMultiVideoViewModel) a5;
        View view = F().n;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        View view2 = F().n;
        l.b(view2, "");
        view2.setLayoutParams(layoutParams2);
        View view3 = G().n;
        l.b(view3, "");
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.gravity = 80;
        View view4 = G().n;
        l.b(view4, "");
        view4.setLayoutParams(layoutParams4);
        G().n.post(new d(this));
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.asp, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        e(F());
        e(G());
        e((com.ss.android.ugc.gamora.editor.corner.c) this.v.getValue());
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
