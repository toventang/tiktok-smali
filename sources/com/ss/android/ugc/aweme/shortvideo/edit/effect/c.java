package com.ss.android.ugc.aweme.shortvideo.edit.effect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
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
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.ac;
import com.ss.android.ugc.aweme.shortvideo.util.aj;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.zhiliaoapp.musically.R;
import dmt.av.video.p;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.ab;
import h.m;
import h.z;
import java.util.Iterator;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b {

    /* renamed from: a  reason: collision with root package name */
    public static final C3301c f127042a = new C3301c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f127043b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f127044c = h.i.a(m.NONE, new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f127045d = h.i.a((h.f.a.a) d.f127046a);

    static {
        Covode.recordClassIndex(83353);
    }

    private final EditEffectViewModel d() {
        return (EditEffectViewModel) this.f127043b.getValue();
    }

    public final com.ss.android.ugc.aweme.editSticker.text.als.a a() {
        return (com.ss.android.ugc.aweme.editSticker.text.als.a) this.f127044c.getValue();
    }

    public final ac b() {
        return (ac) this.f127045d.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.c$c  reason: collision with other inner class name */
    public static final class C3301c {
        static {
            Covode.recordClassIndex(83356);
        }

        private C3301c() {
        }

        public /* synthetic */ C3301c(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class d extends h.f.b.m implements h.f.a.a<ac> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f127046a = new d();

        static {
            Covode.recordClassIndex(83357);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ac invoke() {
            return new ac();
        }
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

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
        b().f88785h.removeCallbacksAndMessages(null);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.text.als.a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(83354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.editSticker.text.als.a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.effect.c r0 = r2.this$0
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.c.b(r0)
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.a.a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r0 = com.ss.android.ugc.aweme.editSticker.text.als.a.class
                com.bytedance.als.b r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.effect.c.a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.scene.j
    public final void v() {
        super.v();
        ac b2 = b();
        if (b2.G != null) {
            b2.f88785h.post(b2.G);
        }
        if (b2.H != null) {
            b2.f88785h.post(b2.H);
        }
    }

    public c() {
        h.k.c a2 = ab.a(EditEffectViewModel.class);
        this.f127043b = h.i.a((h.f.a.a) new b(this, a2, a2));
    }

    public static final class b extends h.f.b.m implements h.f.a.a<EditEffectViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(83355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.shortvideo.edit.effect.EditEffectViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.shortvideo.edit.effect.EditEffectViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.edit.effect.EditEffectViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_shortvideo_edit_effect_EditEffectScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_shortvideo_edit_effect_EditEffectScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.effect.c.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_shortvideo_edit_effect_EditEffectScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.scene.j
    public final void o() {
        ChooseVideoCoverView.a aVar;
        super.o();
        ac b2 = b();
        if (!(b2.A == null || b2.D == null)) {
            b2.A.d(b2.D);
        }
        if ((b2.w.getAdapter() instanceof ChooseVideoCoverView.a) && (aVar = (ChooseVideoCoverView.a) b2.w.getAdapter()) != null) {
            aVar.b();
        }
        if (b2.Y != null) {
            b2.Y.a();
        }
        if (b2.J != null) {
            b2.J.f88959b.c();
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127047a;

        static {
            Covode.recordClassIndex(83358);
        }

        e(c cVar) {
            this.f127047a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                num.intValue();
                this.f127047a.b().e();
            }
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127048a;

        static {
            Covode.recordClassIndex(83360);
        }

        g(c cVar) {
            this.f127048a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.editSticker.text.als.a a2 = this.f127048a.a();
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            a2.a(z);
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127050a;

        static {
            Covode.recordClassIndex(83362);
        }

        i(c cVar) {
            this.f127050a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ac b2 = this.f127050a.b();
            b2.a(0, true, true);
            b2.f88779b.mTimeEffect = null;
            b2.u.setCurrentItem(0);
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127049a;

        static {
            Covode.recordClassIndex(83361);
        }

        h(c cVar) {
            this.f127049a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ac b2 = this.f127049a.b();
            b2.a(0, true, false);
            b2.f88779b.mTimeEffect = null;
            p pVar = new p();
            pVar.f156931g = 9;
            b2.f88781d.setValue(pVar);
            b2.x.a(false, false, (androidx.core.g.a<Void>) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x03b0, code lost:
        if (r1.equals("1") == false) goto L_0x02c8;
     */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 1166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.effect.c.a(android.os.Bundle):void");
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(83364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            ac b2 = this.this$0.b();
            b2.a(0, true, true);
            b2.f88787j.a(true, b2.F);
            b2.n();
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(83365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            this.this$0.b().ad = true;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.asz, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(83363);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            this.this$0.b().W.d().setValue(Integer.valueOf(intValue));
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.m, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(83359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.m mVar) {
            com.bytedance.jedi.arch.m mVar2 = mVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(mVar2, "");
            ac b2 = this.this$0.b();
            int intValue = mVar2.f39404b.intValue();
            if (!com.bytedance.common.utility.h.a(b2.f88779b.mEffectList)) {
                Iterator<EffectPointModel> it = b2.f88779b.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    h.p<Integer, Integer> a2 = aj.a(next.getUiStartPoint(), next.getUiEndPoint(), intValue);
                    next.setUiStartPoint(a2.getFirst().intValue());
                    next.setUiEndPoint(a2.getSecond().intValue());
                    if (b2.A != null) {
                        next.setStartPoint(b2.A.s(a2.getFirst().intValue()));
                        next.setEndPoint(b2.A.s(a2.getSecond().intValue()));
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
