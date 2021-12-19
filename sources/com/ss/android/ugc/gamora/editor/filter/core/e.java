package com.ss.android.ugc.gamora.editor.filter.core;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
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
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.view.internal.main.l;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editor.filter.core.a.a;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.c.a;
import com.zhiliaoapp.musically.R;
import f.a.e.b.a;
import f.a.t;
import h.f.a.q;
import h.f.a.s;
import h.f.b.y;
import h.z;
import java.util.List;
import java.util.Map;

public final class e extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f145904a = {new y(e.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final d f145905h = new d((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final d f145906b;

    /* renamed from: c  reason: collision with root package name */
    final h.h f145907c;

    /* renamed from: d  reason: collision with root package name */
    final f.a.b.a f145908d;

    /* renamed from: e  reason: collision with root package name */
    public FilterBean f145909e;

    /* renamed from: f  reason: collision with root package name */
    final com.ss.android.ugc.aweme.filter.repository.a.o f145910f;

    /* renamed from: g  reason: collision with root package name */
    final com.ss.android.ugc.tools.b.a.d f145911g;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f145912i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f145913j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f145914k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f145915l;
    private final h.h t;
    private final com.bytedance.o.f u;

    static {
        Covode.recordClassIndex(95865);
    }

    public final com.ss.android.ugc.gamora.editor.filter.core.a.a C() {
        return (com.ss.android.ugc.gamora.editor.filter.core.a.a) this.f145915l.getValue();
    }

    public final com.ss.android.ugc.aweme.filter.view.a.j D() {
        return (com.ss.android.ugc.aweme.filter.view.a.j) this.t.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.f.a.a.j a() {
        return (com.bytedance.f.a.a.j) this.f145912i.a(this, f145904a[0]);
    }

    public final EditFilterViewModel b() {
        return (EditFilterViewModel) this.f145913j.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a d() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f145914k.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(95869);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.u;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
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

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.indicator.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.filter.indicator.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.indicator.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.indicator.a> r1 = com.ss.android.ugc.gamora.editor.filter.indicator.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.filter.core.e.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.filter.core.e.b.invoke():com.bytedance.als.b");
        }
    }

    public final void E() {
        D().c();
        b().a(false, this.f145909e);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        if (!this.f145908d.isDisposed()) {
            this.f145908d.dispose();
        }
        C().f145870b = null;
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.core.a.a> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(95875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.filter.core.a.a invoke() {
            e eVar = this.this$0;
            l lVar = new l(eVar);
            com.ss.android.ugc.gamora.editor.filter.core.a.a aVar = new com.ss.android.ugc.gamora.editor.filter.core.a.a(eVar, eVar.a(), (com.ss.android.ugc.gamora.editor.filter.indicator.a) eVar.f145907c.getValue(), eVar.f145910f, eVar.d().j(), new k(eVar));
            aVar.f145870b = lVar;
            return aVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<EditFilterViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(95868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_filter_core_EditFilterScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_filter_core_EditFilterScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.filter.core.e.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_filter_core_EditFilterScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.filter.view.internal.main.l> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(95876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.view.internal.main.l invoke() {
            e eVar = this.this$0;
            com.ss.android.ugc.aweme.filter.repository.a.n value = eVar.d().k().getValue();
            if (value == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(value, "");
            com.ss.android.ugc.aweme.filter.repository.a.n nVar = value;
            com.ss.android.ugc.aweme.filter.repository.a.o oVar = eVar.f145910f;
            com.ss.android.ugc.aweme.filter.repository.a.k value2 = eVar.d().l().getValue();
            if (value2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(value2, "");
            View findViewById = eVar.n.findViewById(R.id.ask);
            h.f.b.l.b(findViewById, "");
            com.ss.android.ugc.aweme.filter.view.internal.main.l lVar = new com.ss.android.ugc.aweme.filter.view.internal.main.l((ViewGroup) findViewById, eVar, oVar, com.ss.android.ugc.aweme.filter.repository.internal.main.m.a(nVar, value2), new com.ss.android.ugc.aweme.filter.view.internal.main.b(eVar.f145911g, oVar), new h(eVar));
            f.a.b.a aVar = eVar.f145908d;
            t<com.bytedance.jedi.a.c.f<FilterBean>> f2 = lVar.f();
            f.a.d.g<Object, Object> gVar = f.a.e.b.a.f157188a;
            a.l lVar2 = a.l.INSTANCE;
            f.a.e.b.b.a((Object) gVar, "keySelector is null");
            f.a.e.b.b.a((Object) lVar2, "collectionSupplier is null");
            aVar.a(f.a.h.a.a(new f.a.e.e.e.m(f2, gVar, lVar2)).a(new C3890e(eVar), com.ss.android.ugc.tools.utils.p.f150012a));
            eVar.f145908d.a(lVar.e().a(new f(eVar), com.ss.android.ugc.tools.utils.p.f150012a));
            eVar.f145908d.a(lVar.h().a(new g(eVar), com.ss.android.ugc.tools.utils.p.f150012a));
            return lVar;
        }
    }

    public static final class l implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f145919a;

        static {
            Covode.recordClassIndex(95878);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(e eVar) {
            this.f145919a = eVar;
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.a.a.b
        public final void a(FilterBean filterBean) {
            this.f145919a.b().b(filterBean, true, this.f145919a.f42913m);
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.a.a.b
        public final void a(FilterBean filterBean, FilterBean filterBean2, float f2) {
            this.f145919a.d().a(filterBean, filterBean2, f2);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<FilterBean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(95877);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FilterBean filterBean) {
            this.this$0.b().b(filterBean, false, null);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class f<T> implements f.a.d.f<am<com.ss.android.ugc.aweme.filter.view.a.e, Integer, FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f145917a;

        static {
            Covode.recordClassIndex(95871);
        }

        f(e eVar) {
            this.f145917a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(am<com.ss.android.ugc.aweme.filter.view.a.e, Integer, FilterBean> amVar) {
            am<com.ss.android.ugc.aweme.filter.view.a.e, Integer, FilterBean> amVar2 = amVar;
            this.f145917a.b().a(amVar2.f39389c, amVar2.f39388b.intValue());
        }
    }

    static final class m<T> implements u<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f145920a;

        static {
            Covode.recordClassIndex(95879);
        }

        m(e eVar) {
            this.f145920a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            com.ss.android.ugc.gamora.editor.filter.core.a.a C = this.f145920a.C();
            h.f.b.l.b(bool2, "");
            C.f145873e = bool2.booleanValue();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.e$e  reason: collision with other inner class name */
    static final class C3890e<T> implements f.a.d.f<com.bytedance.jedi.a.c.f<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f145916a;

        static {
            Covode.recordClassIndex(95870);
        }

        C3890e(e eVar) {
            this.f145916a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.jedi.a.c.f<? extends FilterBean> fVar) {
            FilterBean filterBean = (FilterBean) fVar.a();
            if (!com.ss.android.ugc.aweme.filter.repository.a.a.a.a(this.f145916a.f145909e, filterBean)) {
                this.f145916a.C().a(filterBean);
                this.f145916a.b().b(filterBean, false, this.f145916a.f42913m);
                this.f145916a.f145909e = filterBean;
            }
        }
    }

    static final class g<T> implements f.a.d.f<com.ss.android.ugc.aweme.filter.view.a.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f145918a;

        static {
            Covode.recordClassIndex(95872);
        }

        g(e eVar) {
            this.f145918a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.filter.view.a.c cVar) {
            String str;
            com.ss.android.ugc.aweme.filter.view.a.c cVar2 = cVar;
            int i2 = f.f145921a[cVar2.f95756a.ordinal()];
            if (i2 == 1) {
                this.f145918a.E();
            } else if (i2 == 2) {
                EditFilterViewModel b2 = this.f145918a.b();
                EffectCategoryResponse effectCategoryResponse = cVar2.f95757b;
                if (effectCategoryResponse == null || (str = effectCategoryResponse.getName()) == null) {
                    str = "";
                }
                b2.a(str);
            } else if (i2 == 3) {
                this.f145918a.b().e();
            }
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<l.c, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(95873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l.c cVar) {
            l.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            cVar2.f95941a = this.this$0.f145906b.f145901b;
            cVar2.f95942b = this.this$0.f145906b.f145902c;
            cVar2.f95943c = this.this$0.f145906b.f145903d;
            cVar2.a(new com.ss.android.ugc.aweme.filter.view.internal.main.e(false, null, new com.ss.android.ugc.aweme.filter.view.internal.main.g(0, false, new h.f.a.b<a.C4052a, z>(this) {
                /* class com.ss.android.ugc.gamora.editor.filter.core.e.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(95874);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(a.C4052a aVar) {
                    a.C4052a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    j jVar = this.this$0.this$0.f145906b.f145900a;
                    if (jVar == j.Rect) {
                        aVar2.f150394d = false;
                        Context s = this.this$0.this$0.s();
                        h.f.b.l.b(s, "");
                        aVar2.f150395e = (int) r.a(s, 4.0f);
                    } else if (jVar == j.Circle) {
                        aVar2.f150394d = true;
                    }
                    return z.f158842a;
                }
            }, 3), 31));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        int a2;
        super.a(bundle);
        b().f145857b.observe(this, new m(this));
        b.a.b(this, b(), g.f145922a, new n(this));
        f.a.b.b unused = selectSubscribe(b(), h.f145923a, new ah(), new o(this));
        f.a.b.b unused2 = selectSubscribe(b(), i.f145924a, new ah(), new p(this));
        FrameLayout a3 = a().a();
        if (a3 instanceof com.bytedance.f.a.a.h) {
            com.bytedance.f.a.a.h hVar = (com.bytedance.f.a.a.h) a3;
            ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
            Activity activity = this.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            int b2 = com.ss.android.ugc.asve.f.d.b(activity);
            Activity activity2 = this.f42913m;
            if (activity2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity2, "");
            if (com.ss.android.ugc.asve.f.d.a(activity2)) {
                a2 = 0;
            } else {
                Activity activity3 = this.f42913m;
                if (activity3 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity3, "");
                a2 = (int) r.a(activity3, 50.0f);
            }
            int i2 = b2 + a2;
            Activity activity4 = this.f42913m;
            if (activity4 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity4, "");
            int c2 = com.ss.android.ugc.asve.f.d.c(activity4);
            Activity activity5 = this.f42913m;
            if (activity5 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity5, "");
            int a4 = c2 + ((int) r.a(activity5, 50.0f));
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(i2, a4);
            } else {
                layoutParams.width = i2;
                layoutParams.height = a4;
            }
            hVar.setLayoutParams(layoutParams);
            Context s = s();
            h.f.b.l.b(s, "");
            hVar.setSloppyExtra((int) r.a(s, 150.0f));
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(95882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
            Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map2 = map;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(map2, "");
            this.this$0.D().a(map2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.at0, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(95880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            if (booleanValue) {
                e eVar = this.this$0;
                eVar.D().b();
                eVar.b().a(true, (FilterBean) null);
            } else {
                this.this$0.E();
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends FilterBean>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(95881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends FilterBean> dVar) {
            com.bytedance.jedi.arch.d<? extends FilterBean> dVar2 = dVar;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(dVar2, "");
            this.this$0.f145909e = dVar2.f39404b;
            this.this$0.D().a((FilterBean) dVar2.f39404b);
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

    public e(com.bytedance.o.f fVar, com.ss.android.ugc.aweme.filter.repository.a.o oVar, com.ss.android.ugc.tools.b.a.d dVar, h.f.a.b<? super d, z> bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(dVar, "");
        this.u = fVar;
        this.f145910f = oVar;
        this.f145911g = dVar;
        d dVar2 = new d();
        this.f145906b = dVar2;
        if (bVar != null) {
            bVar.invoke(dVar2);
        }
        this.f145912i = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.f.a.a.j.class);
        h.k.c a2 = h.f.b.ab.a(EditFilterViewModel.class);
        this.f145913j = h.i.a((h.f.a.a) new c(this, a2, a2));
        this.f145907c = h.i.a(h.m.NONE, new a(this));
        this.f145914k = h.i.a(h.m.NONE, new b(this));
        this.f145915l = h.i.a((h.f.a.a) new i(this));
        this.t = h.i.a((h.f.a.a) new j(this));
        this.f145908d = new f.a.b.a();
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
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
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
