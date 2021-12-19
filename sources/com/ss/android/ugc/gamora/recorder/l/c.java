package com.ss.android.ugc.gamora.recorder.l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m;
import com.bytedance.als.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import java.util.Objects;

public final class c extends j implements com.bytedance.jedi.arch.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f148022b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final e f148023a;

    /* renamed from: c  reason: collision with root package name */
    private DMTBgAnimRadioGroup f148024c;

    /* renamed from: d  reason: collision with root package name */
    private final int f148025d = 28;

    /* renamed from: e  reason: collision with root package name */
    private final h<Boolean> f148026e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.als.d<Integer> f148027f;

    static {
        Covode.recordClassIndex(97578);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97579);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ i getReceiver() {
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
    public final ae<i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public static final class b implements DMTBgAnimRadioGroup.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f148028a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f148029b;

        static {
            Covode.recordClassIndex(97580);
        }

        @Override // com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup.b
        public final boolean b(int i2) {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup.b
        public final void a(int i2) {
            this.f148029b.a(c.d(i2));
            this.f148028a.f148023a.a(c.d(i2));
        }

        b(c cVar, z zVar) {
            this.f148028a = cVar;
            this.f148029b = zVar;
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f148031a;

        static {
            Covode.recordClassIndex(97582);
        }

        d(c cVar) {
            this.f148031a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            c cVar = this.f148031a;
            l.b(num, "");
            int intValue = num.intValue();
            View view = cVar.n;
            if (view != null) {
                view.setTranslationY((float) intValue);
            }
        }
    }

    public static com.ss.android.ugc.aweme.tools.i d(int i2) {
        if (i2 == 0) {
            return com.ss.android.ugc.aweme.tools.i.EPIC;
        }
        if (i2 == 1) {
            return com.ss.android.ugc.aweme.tools.i.SLOW;
        }
        if (i2 == 2) {
            return com.ss.android.ugc.aweme.tools.i.NORMAL;
        }
        if (i2 == 3) {
            return com.ss.android.ugc.aweme.tools.i.FAST;
        }
        if (i2 != 4) {
            return com.ss.android.ugc.aweme.tools.i.NORMAL;
        }
        return com.ss.android.ugc.aweme.tools.i.LAPSE;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.c$c  reason: collision with other inner class name */
    static final class C3989c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f148030a;

        static {
            Covode.recordClassIndex(97581);
        }

        C3989c(c cVar) {
            this.f148030a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Context r;
            float f2;
            Boolean bool = (Boolean) obj;
            View view = this.f148030a.n;
            l.b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            l.b(bool, "");
            if (bool.booleanValue()) {
                r = this.f148030a.r();
                f2 = 199.0f;
            } else {
                r = this.f148030a.r();
                f2 = 166.0f;
            }
            marginLayoutParams.bottomMargin = (int) n.b(r, f2);
            View view2 = this.f148030a.n;
            l.b(view2, "");
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        if (com.ss.android.ugc.aweme.port.in.g.a().A().a() == false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010b  */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.l.c.a(android.os.Bundle):void");
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
        View a2 = com.a.a(layoutInflater, R.layout.bj1, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public c(h<Boolean> hVar, com.bytedance.als.d<Integer> dVar, e eVar) {
        l.d(hVar, "");
        l.d(dVar, "");
        l.d(eVar, "");
        this.f148026e = hVar;
        this.f148027f = dVar;
        this.f148023a = eVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super i, ? super A, ? super B, h.z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, h.z> mVar, h.f.a.b<? super i, h.z> bVar, h.f.a.m<? super i, ? super T, h.z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, h.z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
