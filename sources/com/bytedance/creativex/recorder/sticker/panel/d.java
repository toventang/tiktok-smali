package com.bytedance.creativex.recorder.sticker.panel;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ab;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.o.f;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.sticker.panel.i;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.l;
import h.h;
import h.k.k;
import h.z;
import java.util.Objects;

public final class d extends j implements b, q {

    /* renamed from: d  reason: collision with root package name */
    public static final b f28450d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f28451a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.tools.view.a.a f28452b;

    /* renamed from: c  reason: collision with root package name */
    public final f f28453c;

    /* renamed from: e  reason: collision with root package name */
    private final h f28454e;

    /* renamed from: f  reason: collision with root package name */
    private final h f28455f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f28456g;

    /* renamed from: h  reason: collision with root package name */
    private final r.b f28457h;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.ugc.tools.view.a.d f28458i;

    static {
        Covode.recordClassIndex(16721);
    }

    private final i C() {
        return (i) this.f28455f.getValue();
    }

    public final com.ss.android.ugc.tools.view.a.c d() {
        return (com.ss.android.ugc.tools.view.a.c) this.f28454e.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(16724);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.b
    public final j a() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.b
    public final void b() {
        C().f();
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.b
    public final void c() {
        C().g();
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.view.a.c> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(16725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.view.a.c invoke() {
            if (this.this$0.t() instanceof com.ss.android.ugc.tools.view.a.c) {
                Activity t = this.this$0.t();
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                return t;
            } else if (this.this$0.f28453c.b(com.ss.android.ugc.tools.view.a.c.class) instanceof com.ss.android.ugc.tools.view.a.c) {
                Object b2 = this.this$0.f28453c.b(com.ss.android.ugc.tools.view.a.c.class);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                return b2;
            } else {
                Object a2 = this.this$0.f28453c.a(ab.class);
                Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                return a2;
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<i> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.panel.b.c $stickerViewFactory;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(16727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, com.ss.android.ugc.aweme.sticker.panel.b.c cVar) {
            super(0);
            this.this$0 = dVar;
            this.$stickerViewFactory = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.this$0.f28453c.a(androidx.appcompat.app.d.class, (String) null);
            com.ss.android.ugc.aweme.sticker.panel.b.c cVar = this.$stickerViewFactory;
            View c2 = this.this$0.c(R.id.c8c);
            l.b(c2, "");
            androidx.fragment.app.i supportFragmentManager = dVar.getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            i a2 = cVar.a(dVar, (FrameLayout) c2, dVar, supportFragmentManager);
            a2.a(new a(this));
            return a2;
        }

        public static final class a implements com.ss.android.ugc.aweme.sticker.panel.l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f28461a;

            static {
                Covode.recordClassIndex(16728);
            }

            @Override // com.ss.android.ugc.aweme.sticker.panel.l
            public final void a(View view) {
                l.d(view, "");
            }

            @Override // com.ss.android.ugc.aweme.sticker.panel.l
            public final void cw_() {
            }

            a(e eVar) {
                this.f28461a = eVar;
            }

            @Override // com.ss.android.ugc.aweme.sticker.panel.l
            public final void a(l.a aVar) {
                h.f.b.l.d(aVar, "");
                if (aVar == l.a.BEFORE_ANIMATE) {
                    this.f28461a.this$0.f28453c.b(com.bytedance.creativex.recorder.b.a.q.class);
                    com.ss.android.ugc.tools.view.a.c d2 = this.f28461a.this$0.d();
                    if (d2 != null) {
                        d2.b(this.f28461a.this$0.f28452b);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.sticker.panel.l
            public final void b(l.a aVar) {
                h.f.b.l.d(aVar, "");
                if (aVar == l.a.AFTER_ANIMATE) {
                    this.f28461a.this$0.f28453c.b(com.bytedance.creativex.recorder.b.a.q.class);
                    com.ss.android.ugc.tools.view.a.c d2 = this.f28461a.this$0.d();
                    if (d2 != null) {
                        d2.c(this.f28461a.this$0.f28452b);
                    }
                }
            }
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<RecordStickerPanelViewModel> {
        final /* synthetic */ j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(16723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_bytedance_creativex_recorder_sticker_panel_RecordStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_bytedance_creativex_recorder_sticker_panel_RecordStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.creativex.recorder.sticker.panel.d.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_bytedance_creativex_recorder_sticker_panel_RecordStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.b
    public final void a(com.bytedance.creativex.recorder.sticker.a.a aVar) {
        h.f.b.l.d(aVar, "");
        if (!this.f28456g) {
            this.f28456g = true;
            aVar.a(C());
            r.b bVar = this.f28457h;
            View c2 = c(R.id.c8e);
            h.f.b.l.b(c2, "");
            aVar.a(bVar, (FrameLayout) c2);
        }
    }

    public /* synthetic */ d(f fVar, com.ss.android.ugc.aweme.sticker.panel.b.c cVar) {
        this(fVar, cVar, AnonymousClass1.f28459a, new com.ss.android.ugc.tools.view.a.e());
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bj2, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.d$d  reason: collision with other inner class name */
    static final class C0608d implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f28460a;

        static {
            Covode.recordClassIndex(16726);
        }

        C0608d(d dVar) {
            this.f28460a = dVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            h.f.a.a<Boolean> aVar;
            RecordStickerPanelViewModel recordStickerPanelViewModel = (RecordStickerPanelViewModel) this.f28460a.f28451a.getValue();
            if (i2 != 4 || (((aVar = recordStickerPanelViewModel.f28444c.f28471b) != null && aVar.invoke().booleanValue()) || !h.f.b.l.a((Object) recordStickerPanelViewModel.f28443b.d().a(), (Object) true))) {
                return false;
            }
            recordStickerPanelViewModel.a(false);
            com.bytedance.creativex.recorder.sticker.b.e.b(recordStickerPanelViewModel.f28443b);
            return true;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    public d(f fVar, com.ss.android.ugc.aweme.sticker.panel.b.c cVar, r.b bVar, com.ss.android.ugc.tools.view.a.d dVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(dVar, "");
        this.f28453c = fVar;
        this.f28457h = bVar;
        this.f28458i = dVar;
        this.f28454e = h.i.a((h.f.a.a) new c(this));
        h.k.c a2 = h.f.b.ab.a(RecordStickerPanelViewModel.class);
        this.f28451a = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.f28452b = new C0608d(this);
        this.f28455f = h.i.a((h.f.a.a) new e(this, cVar));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
