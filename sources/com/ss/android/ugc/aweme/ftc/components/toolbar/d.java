package com.ss.android.ugc.aweme.ftc.components.toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.k;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.utils.gr;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.y;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class d extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f98226a = {new y(d.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final c f98227h = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public ConstraintLayout f98228b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f98229c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f98230d;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f98231e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Integer, View> f98232f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public p f98233g;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f98234i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f98235j = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: k  reason: collision with root package name */
    private m f98236k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f98237l = h.i.a(h.m.NONE, new a(this));
    private final boolean t = av.a();
    private final com.bytedance.o.f u;

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, List<? extends com.ss.android.ugc.gamora.editor.y>, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        public static final class b implements l {
            static {
                Covode.recordClassIndex(62476);
            }

            b() {
            }
        }

        public static final class a extends com.ss.android.ugc.aweme.views.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.gamora.editor.y f98239a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f98240b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f98241c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Map f98242d;

            static {
                Covode.recordClassIndex(62475);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                this.f98240b.this$0.a().a(this.f98239a.f147356a);
            }

            a(com.ss.android.ugc.gamora.editor.y yVar, j jVar, List list, Map map) {
                this.f98239a = yVar;
                this.f98240b = jVar;
                this.f98241c = list;
                this.f98242d = map;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, List<? extends com.ss.android.ugc.gamora.editor.y> list) {
            MethodCollector.i(6688);
            List<? extends com.ss.android.ugc.gamora.editor.y> list2 = list;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(list2, "");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list2) {
                Activity activity = this.this$0.f42913m;
                if (activity == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity, "");
                com.ss.android.ugc.aweme.shortvideo.edit.k a2 = k.a.a(activity, t.f147358c, t.f147357b);
                arrayList.add(a2);
                linkedHashMap.put(Integer.valueOf(t.f147356a), a2);
                a2.setOnClickListener(new a(t, this, arrayList, linkedHashMap));
            }
            this.this$0.f98232f.clear();
            this.this$0.f98232f.putAll(linkedHashMap);
            d.b(this.this$0).removeAllViews();
            p pVar = this.this$0.f98233g;
            if (pVar != null) {
                pVar.d();
            }
            d dVar = this.this$0;
            ViewGroup b2 = d.b(this.this$0);
            Activity t2 = this.this$0.t();
            h.f.b.l.b(t2, "");
            p pVar2 = new p(b2, arrayList, t2);
            if (!pVar2.f98270d.isEmpty()) {
                pVar2.a();
            }
            if (pVar2.f98270d.size() > 4) {
                pVar2.b();
            }
            pVar2.f98267a = new b();
            dVar.f98233g = pVar2;
            this.this$0.C();
            z zVar = z.f158842a;
            MethodCollector.o(6688);
            return zVar;
        }
    }

    static {
        Covode.recordClassIndex(62464);
    }

    public final FTCEditToolbarViewModel a() {
        return (FTCEditToolbarViewModel) this.f98234i.getValue();
    }

    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.f98235j.a(this, f98226a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a d() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f98237l.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(62467);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
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

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(62465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.toolbar.d.a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        m mVar = this.f98236k;
        if (mVar != null) {
            mVar.a();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<FTCEditToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_toolbar_FTCEditTitlebarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_toolbar_FTCEditTitlebarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.toolbar.d.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ftc_components_toolbar_FTCEditTitlebarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final void C() {
        m mVar = this.f98236k;
        if (mVar != null) {
            mVar.a();
        }
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        VideoPublishEditModel b2 = b();
        FTCEditToolbarViewModel a2 = a();
        com.bytedance.scene.j jVar = this.o;
        Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        m mVar2 = new m((androidx.fragment.app.e) activity, b2, a2, (com.bytedance.scene.group.b) jVar);
        mVar2.a(this.f98232f);
        mVar2.b(this.f98232f);
        mVar2.c(this.f98232f);
        mVar2.d(this.f98232f);
        View view = this.f98232f.get(1);
        if (view != null) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.EditToolBarItem");
            mVar2.a(this, (com.ss.android.ugc.aweme.shortvideo.edit.k) view);
        }
        this.f98236k = mVar2;
    }

    public static final class l extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98244a;

        static {
            Covode.recordClassIndex(62478);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(d dVar) {
            this.f98244a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f98244a.d().J();
        }
    }

    public static final class m extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98245a;

        static {
            Covode.recordClassIndex(62479);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(d dVar) {
            this.f98245a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.b.l.d(view, "");
            gr.a("camera_start");
            this.f98245a.d().J();
        }
    }

    public static final /* synthetic */ TextView a(d dVar) {
        TextView textView = dVar.f98230d;
        if (textView == null) {
            h.f.b.l.a("mTvBackTip");
        }
        return textView;
    }

    public static final /* synthetic */ ViewGroup b(d dVar) {
        ViewGroup viewGroup = dVar.f98231e;
        if (viewGroup == null) {
            h.f.b.l.a("mToolbarContainer");
        }
        return viewGroup;
    }

    public static final /* synthetic */ ConstraintLayout c(d dVar) {
        ConstraintLayout constraintLayout = dVar.f98228b;
        if (constraintLayout == null) {
            h.f.b.l.a("titleLayout");
        }
        return constraintLayout;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98238a;

        static {
            Covode.recordClassIndex(62469);
        }

        e(d dVar) {
            this.f98238a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                ViewGroup b2 = d.b(this.f98238a);
                if (bool.booleanValue()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                b2.setVisibility(i2);
            }
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98243a;

        static {
            Covode.recordClassIndex(62477);
        }

        k(d dVar) {
            this.f98243a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            if (obj != null) {
                com.ss.android.ugc.asve.editor.g value = this.f98243a.d().C().getValue();
                if (value != null) {
                    i2 = value.j();
                } else {
                    i2 = 0;
                }
                if (i2 > this.f98243a.b().mCurMusicLength) {
                    this.f98243a.a().d(8, false);
                }
            }
        }
    }

    public d(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.u = fVar;
        h.k.c a2 = h.f.b.ab.a(FTCEditToolbarViewModel.class);
        this.f98234i = h.i.a((h.f.a.a) new b(this, a2, a2));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.d$d  reason: collision with other inner class name */
    static final class C2375d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2375d(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            p pVar = this.this$0.f98233g;
            if (pVar != null) {
                pVar.d();
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            TextView a2 = d.a(this.this$0);
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a2.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, String, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, String str) {
            String str2 = str;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(str2, "");
            d.a(this.this$0).setText(str2);
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            ViewGroup.LayoutParams layoutParams = d.c(this.this$0).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = intValue;
                d.c(this.this$0).setLayoutParams(marginLayoutParams);
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            ImageView imageView = this.this$0.f98229c;
            if (imageView == null) {
                h.f.b.l.a("mBackImageView");
            }
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atv, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a2;
        this.f98228b = constraintLayout;
        if (constraintLayout == null) {
            h.f.b.l.a("titleLayout");
        }
        return constraintLayout;
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        Serializable serializable;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList<String> arrayList;
        Intent intent;
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.q9);
        h.f.b.l.b(c2, "");
        ImageView imageView = (ImageView) c2;
        this.f98229c = imageView;
        if (imageView == null) {
            h.f.b.l.a("mBackImageView");
        }
        imageView.setImageResource(2131232195);
        ImageView imageView2 = this.f98229c;
        if (imageView2 == null) {
            h.f.b.l.a("mBackImageView");
        }
        imageView2.setOnClickListener(new l(this));
        View c3 = c(R.id.evz);
        h.f.b.l.b(c3, "");
        TextView textView = (TextView) c3;
        this.f98230d = textView;
        if (textView == null) {
            h.f.b.l.a("mTvBackTip");
        }
        textView.setOnClickListener(new m(this));
        View c4 = c(R.id.c95);
        h.f.b.l.b(c4, "");
        this.f98231e = (ViewGroup) c4;
        selectNonNullSubscribe(a(), e.f98246a, new ah(), new g(this));
        selectNonNullSubscribe(a(), g.f98248a, new ah(), new h(this));
        selectNonNullSubscribe(a(), h.f98249a, new ah(), new i(this));
        selectNonNullSubscribe(a(), i.f98250a, new ah(), new j(this));
        b.a.b(this, a(), j.f98251a, new C2375d(this));
        t<Boolean> l2 = a().l();
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        l2.observe((androidx.fragment.app.e) activity, new e(this));
        selectNonNullSubscribe(a(), f.f98247a, new ah(), new f(this));
        ArrayList arrayList2 = new ArrayList();
        Activity activity2 = this.f42913m;
        com.ss.android.ugc.aweme.mvtheme.d dVar = null;
        if (activity2 == null || (intent = activity2.getIntent()) == null) {
            serializable = null;
        } else {
            serializable = intent.getSerializableExtra("key_mv_theme_data");
        }
        if (serializable instanceof com.ss.android.ugc.aweme.mvtheme.d) {
            dVar = serializable;
        }
        com.ss.android.ugc.aweme.mvtheme.d dVar2 = dVar;
        boolean z2 = false;
        if (dVar2 == null || (arrayList = dVar2.selectMediaList) == null) {
            i2 = 0;
        } else {
            i2 = arrayList.size();
        }
        if (i2 > 1) {
            z = true;
        } else {
            z = false;
        }
        int i8 = 2131232558;
        if (!"slideshow".equals(es.c(b())) || !z) {
            if (!this.t) {
                i8 = 2131232557;
            }
            arrayList2.add(new com.ss.android.ugc.gamora.editor.y(5, i8, R.string.bww));
            if (bp.d(b())) {
                if (this.t) {
                    i7 = 2131232204;
                } else {
                    i7 = 2131232203;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(13, i7, R.string.bjp));
            }
            if (bp.f(b())) {
                if (this.t) {
                    i6 = 2131232596;
                } else {
                    i6 = 2131232595;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(6, i6, R.string.zf));
            }
            if (bp.i(b())) {
                if (this.t) {
                    i5 = 2131232570;
                } else {
                    i5 = 2131232569;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(10, i5, R.string.axl));
            }
            if (this.t) {
                i3 = 2131232552;
            } else {
                i3 = 2131232551;
            }
            arrayList2.add(new com.ss.android.ugc.gamora.editor.y(8, i3, R.string.b45));
            if (b().mMusicPath != null) {
                if (this.t) {
                    i4 = 2131232598;
                } else {
                    i4 = 2131232597;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(7, i4, R.string.g2a));
            }
        } else {
            if (!this.t) {
                i8 = 2131232557;
            }
            arrayList2.add(new com.ss.android.ugc.gamora.editor.y(5, i8, R.string.bww));
        }
        FTCEditToolbarViewModel a2 = a();
        h.f.b.l.d(arrayList2, "");
        a2.c(new FTCEditToolbarViewModel.j(arrayList2));
        if (b().mIsFromDraft) {
            if (b().isUploadVideo()) {
                a().a(false);
            } else {
                a().a(true);
            }
            if (b().isPhotoMvMode && b().getOriginal() == 1) {
                a().a(true);
                FTCEditToolbarViewModel a3 = a();
                Activity activity3 = this.f42913m;
                if (activity3 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(activity3, "");
                String string = activity3.getResources().getString(R.string.azh);
                h.f.b.l.b(string, "");
                h.f.b.l.d(string, "");
                a3.c(new FTCEditToolbarViewModel.c(string));
            }
        }
        if (bp.h(b())) {
            if (b().veAudioRecorderParam == null || !b().veAudioRecorderParam.hasRecord()) {
                a().d(6, false);
            } else {
                a().d(6, true);
            }
        }
        if (b().mMusicPath != null) {
            z2 = true;
        }
        a().b(8, z2);
        LiveData<com.ss.android.ugc.asve.editor.g> C = d().C();
        Activity t2 = t();
        Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C.observe((androidx.appcompat.app.d) t2, new k(this));
        if (!bp.f(b())) {
            w.a("voice", -1);
        } else {
            w.a("voice", w.f128056g);
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
