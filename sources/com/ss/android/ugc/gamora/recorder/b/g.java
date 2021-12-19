package com.ss.android.ugc.gamora.recorder.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.m;
import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
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
import com.bytedance.jedi.arch.v;
import com.bytedance.o.f;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.shortvideo.widget.n;
import com.ss.android.ugc.aweme.utils.ig;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;
import java.util.Iterator;
import java.util.Objects;

public final class g extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f147395a = {new y(g.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final a f147396i = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h f147397b = h.i.a((h.f.a.a) new e(this));

    /* renamed from: c  reason: collision with root package name */
    public View f147398c;

    /* renamed from: d  reason: collision with root package name */
    int f147399d = -1;

    /* renamed from: e  reason: collision with root package name */
    public TabHost f147400e;

    /* renamed from: f  reason: collision with root package name */
    public int f147401f = en.a(40.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: g  reason: collision with root package name */
    public c f147402g;

    /* renamed from: h  reason: collision with root package name */
    public final e f147403h;

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f147404j = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    /* renamed from: k  reason: collision with root package name */
    private final f f147405k;

    /* renamed from: l  reason: collision with root package name */
    private final ShortVideoContext f147406l;
    private final l<Integer> t;
    private final com.bytedance.als.h<Boolean> u;
    private final k<Boolean> v;

    static {
        Covode.recordClassIndex(97125);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97126);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f147405k;
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

    static final class e extends h.f.b.m implements h.f.a.a<ScrollableLinearLayout> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(97131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ScrollableLinearLayout invoke() {
            return g.b(this.this$0).findViewById(R.id.ad7);
        }
    }

    static final class b implements TabHost.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147407a;

        static {
            Covode.recordClassIndex(97127);
        }

        b(g gVar) {
            this.f147407a = gVar;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextView f147408a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f147409b;

            static {
                Covode.recordClassIndex(97128);
            }

            a(TextView textView, b bVar) {
                this.f147408a = textView;
                this.f147409b = bVar;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = g.a(this.f147409b.f147407a).getLayoutParams();
                layoutParams.width = this.f147408a.getWidth();
                g.a(this.f147409b.f147407a).setLayoutParams(layoutParams);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.TabHost.a
        public final void a(Object obj, int i2, int i3, boolean z, boolean z2) {
            TextView textView;
            View childAt = ((ScrollableLinearLayout) this.f147407a.f147397b.getValue()).getChildAt(i2);
            if (!(childAt instanceof n)) {
                childAt = null;
            }
            n nVar = (n) childAt;
            if (nVar != null && (textView = nVar.getTextView()) != null) {
                textView.post(new a(textView, this));
            }
        }
    }

    public static final /* synthetic */ View a(g gVar) {
        View view = gVar.f147398c;
        if (view == null) {
            h.f.b.l.a("selectedBg");
        }
        return view;
    }

    public static final /* synthetic */ TabHost b(g gVar) {
        TabHost tabHost = gVar.f147400e;
        if (tabHost == null) {
            h.f.b.l.a("tabHost");
        }
        return tabHost;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public final int a(Object obj) {
        if (obj == null) {
            return -1;
        }
        TabHost tabHost = this.f147400e;
        if (tabHost == null) {
            h.f.b.l.a("tabHost");
        }
        int tabCount = tabHost.getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            TabHost tabHost2 = this.f147400e;
            if (tabHost2 == null) {
                h.f.b.l.a("tabHost");
            }
            if (h.f.b.l.a(obj, tabHost2.a(i2))) {
                return i2;
            }
        }
        return -1;
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147411a;

        static {
            Covode.recordClassIndex(97130);
        }

        d(g gVar) {
            this.f147411a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = en.a(33.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + this.f147411a.f147401f;
            } else {
                i2 = this.f147411a.f147401f;
            }
            ViewGroup.LayoutParams layoutParams = g.b(this.f147411a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2 + ((int) com.bytedance.common.utility.n.b(this.f147411a.f42913m, 100.0f)) + ((int) com.bytedance.common.utility.n.b(this.f147411a.f42913m, -12.5f));
            g.b(this.f147411a).setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.ack);
        h.f.b.l.b(c2, "");
        TabHost tabHost = (TabHost) c2;
        this.f147400e = tabHost;
        if (tabHost == null) {
            h.f.b.l.a("tabHost");
        }
        View findViewById = tabHost.findViewById(R.id.acj);
        h.f.b.l.b(findViewById, "");
        this.f147398c = findViewById;
        TabHost tabHost2 = this.f147400e;
        if (tabHost2 == null) {
            h.f.b.l.a("tabHost");
        }
        tabHost2.setVisibility(8);
        e eVar = this.f147403h;
        b bVar = new b(this);
        h.f.b.l.d(bVar, "");
        eVar.f147386e = bVar;
        e eVar2 = this.f147403h;
        ShortVideoContext shortVideoContext = this.f147406l;
        TabHost tabHost3 = this.f147400e;
        if (tabHost3 == null) {
            h.f.b.l.a("tabHost");
        }
        eVar2.a(shortVideoContext, tabHost3);
        this.t.a(this, new c(this));
        com.bytedance.als.h<Boolean> hVar = this.u;
        if (hVar != null) {
            hVar.a(this, new d(this));
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f147410a;

        static {
            Covode.recordClassIndex(97129);
        }

        c(g gVar) {
            this.f147410a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            T t;
            int a2;
            Integer num = (Integer) obj;
            TabHost b2 = g.b(this.f147410a);
            h.f.b.l.b(num, "");
            b2.setVisibility(num.intValue());
            g gVar = this.f147410a;
            boolean z = false;
            if (num.intValue() != 0) {
                if (gVar.f147399d >= 0) {
                    TabHost tabHost = gVar.f147400e;
                    if (tabHost == null) {
                        h.f.b.l.a("tabHost");
                    }
                    gVar.f147399d = tabHost.getCurrentIndex();
                }
                TabHost tabHost2 = gVar.f147400e;
                if (tabHost2 == null) {
                    h.f.b.l.a("tabHost");
                }
                tabHost2.a(-1, 0);
            } else if (gVar.f147399d < 0) {
                Iterator<T> it = gVar.f147403h.f147382a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (t.f147393b.f147379e) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null || (a2 = gVar.a(t2.f147393b.f147377c)) < 0) {
                    a2 = gVar.a(ig.a(R.string.f__));
                }
                gVar.f147399d = a2;
                TabHost tabHost3 = gVar.f147400e;
                if (tabHost3 == null) {
                    h.f.b.l.a("tabHost");
                }
                int i2 = gVar.f147399d;
                c cVar = gVar.f147402g;
                if (cVar != null) {
                    z = cVar.f147369a;
                }
                tabHost3.a(i2, true, z, true);
            } else {
                TabHost tabHost4 = gVar.f147400e;
                if (tabHost4 == null) {
                    h.f.b.l.a("tabHost");
                }
                tabHost4.a(gVar.f147399d, 0);
            }
            gVar.f147402g = null;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bir, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
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

    public g(f fVar, ShortVideoContext shortVideoContext, e eVar, l<Integer> lVar, com.bytedance.als.h<Boolean> hVar, k<Boolean> kVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(shortVideoContext, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(kVar, "");
        this.f147405k = fVar;
        this.f147406l = shortVideoContext;
        this.f147403h = eVar;
        this.t = lVar;
        this.u = hVar;
        this.v = kVar;
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
