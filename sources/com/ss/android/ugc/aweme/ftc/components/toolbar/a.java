package com.ss.android.ugc.aweme.ftc.components.toolbar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.common.utility.n;
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
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.property.cn;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.k;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.m;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a extends j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f98208a = {new y(a.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final c f98209g = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public RelativeLayout f98210b;

    /* renamed from: c  reason: collision with root package name */
    public View f98211c;

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f98212d;

    /* renamed from: e  reason: collision with root package name */
    final Map<Integer, View> f98213e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    m f98214f;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f98215h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f98216i = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f98217j = h.i.a(m.NONE, new C2374a(this));

    /* renamed from: k  reason: collision with root package name */
    private final boolean f98218k = av.a();

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.o.f f98219l;

    static {
        Covode.recordClassIndex(62453);
    }

    public final FTCEditToolbarViewModel a() {
        return (FTCEditToolbarViewModel) this.f98215h.getValue();
    }

    /* access modifiers changed from: package-private */
    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.f98216i.a(this, f98208a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a d() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f98217j.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(62456);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f98219l;
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.a$a  reason: collision with other inner class name */
    public static final class C2374a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(62454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2374a(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.toolbar.a.C2374a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        m mVar = this.f98214f;
        if (mVar != null) {
            mVar.a();
        }
    }

    private final boolean C() {
        String str = b().mMusicPath;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final class b extends h.f.b.m implements h.f.a.a<FTCEditToolbarViewModel> {
        final /* synthetic */ j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, h.k.c cVar, h.k.c cVar2) {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_toolbar_FTCEditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_toolbar_FTCEditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.toolbar.a.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ftc_components_toolbar_FTCEditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class h extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f98223a;

        static {
            Covode.recordClassIndex(62461);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(600);
            this.f98223a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            bj.a("VEVideoPublishEditActivity nextStep OnClick");
            this.f98223a.d().N();
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.editor.y f98220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f98221b;

        static {
            Covode.recordClassIndex(62457);
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f98221b.a().a(this.f98220a.f147356a);
        }

        d(com.ss.android.ugc.gamora.editor.y yVar, a aVar) {
            this.f98220a = yVar;
            this.f98221b = aVar;
        }
    }

    public static final /* synthetic */ RelativeLayout a(a aVar) {
        RelativeLayout relativeLayout = aVar.f98210b;
        if (relativeLayout == null) {
            l.a("bottomLayout");
        }
        return relativeLayout;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f98222a;

        static {
            Covode.recordClassIndex(62459);
        }

        f(a aVar) {
            this.f98222a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                View view = this.f98222a.f98211c;
                if (view == null) {
                    l.a("nextStep");
                }
                if (bool.booleanValue()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }

    public a(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f98219l = fVar;
        h.k.c a2 = h.f.b.ab.a(FTCEditToolbarViewModel.class);
        this.f98215h = h.i.a((h.f.a.a) new b(this, a2, a2));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        Serializable serializable;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList<String> arrayList;
        Intent intent;
        super.a(bundle);
        selectNonNullSubscribe(a(), b.f98224a, new ah(), new e(this));
        t<Boolean> g2 = a().g();
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        g2.observe((androidx.fragment.app.e) activity, new f(this));
        selectNonNullSubscribe(a(), c.f98225a, new ah(), new g(this));
        VideoLengthChecker.a().a(d(), this, a());
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
        int i7 = 2131232556;
        int i8 = 2131232588;
        int i9 = 2131232355;
        if (!"slideshow".equals(es.c(b())) || !z) {
            if (C()) {
                if (this.f98218k) {
                    i4 = 2131232540;
                } else {
                    i4 = 2131232355;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(1, i4, R.string.dcm));
            } else {
                if (this.f98218k) {
                    i3 = 2131232598;
                } else {
                    i3 = 2131232597;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(7, i3, R.string.g2a));
            }
            if (!this.f98218k) {
                i7 = 2131232555;
            }
            arrayList2.add(new com.ss.android.ugc.gamora.editor.y(2, i7, R.string.blj));
            if (!this.f98218k) {
                i8 = 2131232587;
            }
            arrayList2.add(new com.ss.android.ugc.gamora.editor.y(3, i8, R.string.hfg));
            a().a(arrayList2);
        } else {
            if (C()) {
                if (this.f98218k) {
                    i6 = 2131232540;
                } else {
                    i6 = 2131232355;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(1, i6, R.string.dcm));
            }
            if (!cn.a()) {
                if (!this.f98218k) {
                    i7 = 2131232555;
                }
                arrayList2.add(new com.ss.android.ugc.gamora.editor.y(2, i7, R.string.blj));
            }
            if (!this.f98218k) {
                i8 = 2131232587;
            }
            arrayList2.add(new com.ss.android.ugc.gamora.editor.y(3, i8, R.string.hfg));
            a().a(arrayList2);
        }
        FTCEditToolbarViewModel a2 = a();
        String string = t().getString(R.string.dcm);
        l.b(string, "");
        l.d(string, "");
        a2.c(new FTCEditToolbarViewModel.i(string));
        if (cr.a().f125295a != null) {
            Activity t = t();
            if (this.f98218k) {
                i5 = 2131232540;
            } else {
                i5 = 2131232539;
            }
            Drawable a3 = androidx.core.content.b.a(t, i5);
            if (a3 != null) {
                FTCEditToolbarViewModel a4 = a();
                l.b(a3, "");
                a4.a(a3);
            }
        } else {
            Activity t2 = t();
            if (this.f98218k) {
                i9 = 2131232540;
            }
            Drawable a5 = androidx.core.content.b.a(t2, i9);
            if (a5 != null) {
                FTCEditToolbarViewModel a6 = a();
                l.b(a5, "");
                a6.a(a5);
            }
        }
        w.a("music", -1);
        w.a("effect", w.f128055f);
        if (w.a("text")) {
            w.a("text", -1);
        } else {
            w.a("text", w.f128053d);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(62460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            l.d(bVar, "");
            ViewGroup.LayoutParams layoutParams = a.a(this.this$0).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = intValue;
                a.a(this.this$0).setLayoutParams(marginLayoutParams);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        if (this.f42913m != null) {
            Activity activity = this.f42913m;
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            if (com.ss.android.ugc.gamora.editor.d.a.a(activity)) {
                View a2 = com.a.a(layoutInflater, R.layout.atn, viewGroup, false);
                l.b(a2, "");
                return a2;
            }
        }
        View a3 = com.a.a(layoutInflater, R.layout.atm, viewGroup, false);
        l.b(a3, "");
        return a3;
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, List<? extends com.ss.android.ugc.gamora.editor.y>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(62458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, List<? extends com.ss.android.ugc.gamora.editor.y> list) {
            MethodCollector.i(5037);
            List<? extends com.ss.android.ugc.gamora.editor.y> list2 = list;
            l.d(bVar, "");
            l.d(list2, "");
            a aVar = this.this$0;
            LinearLayout linearLayout = aVar.f98212d;
            if (linearLayout == null) {
                l.a("bottomBarContainer");
            }
            linearLayout.removeAllViews();
            aVar.f98213e.clear();
            for (T t : list2) {
                Activity activity = aVar.f42913m;
                if (activity == null) {
                    l.b();
                }
                l.b(activity, "");
                k a2 = k.a.a(activity, t.f147358c, t.f147357b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) n.b(aVar.q(), 4.0f);
                LinearLayout linearLayout2 = aVar.f98212d;
                if (linearLayout2 == null) {
                    l.a("bottomBarContainer");
                }
                linearLayout2.addView(a2, layoutParams);
                aVar.f98213e.put(Integer.valueOf(t.f147356a), a2);
                a2.setOnClickListener(new d(t, aVar));
            }
            m mVar = aVar.f98214f;
            if (mVar != null) {
                mVar.a();
            }
            Activity activity2 = aVar.f42913m;
            if (activity2 != null) {
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity2;
                VideoPublishEditModel b2 = aVar.b();
                FTCEditToolbarViewModel a3 = aVar.a();
                j jVar = aVar.o;
                if (jVar != null) {
                    m mVar2 = new m(eVar, b2, a3, (com.bytedance.scene.group.b) jVar);
                    mVar2.a(aVar.f98213e);
                    mVar2.b(aVar.f98213e);
                    mVar2.c(aVar.f98213e);
                    mVar2.d(aVar.f98213e);
                    View view = aVar.f98213e.get(1);
                    if (view != null) {
                        mVar2.a(aVar, (k) view);
                    }
                    aVar.f98214f = mVar2;
                    z zVar = z.f158842a;
                    MethodCollector.o(5037);
                    return zVar;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                MethodCollector.o(5037);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.o(5037);
            throw nullPointerException2;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        Typeface a2;
        l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.c51);
        l.b(c2, "");
        this.f98210b = (RelativeLayout) c2;
        View c3 = c(R.id.v_);
        l.b(c3, "");
        this.f98212d = (LinearLayout) c3;
        View c4 = c(R.id.cv4);
        l.b(c4, "");
        this.f98211c = c4;
        if (c4 == null) {
            l.a("nextStep");
        }
        c4.setOnClickListener(new h(this));
        View view2 = this.f98211c;
        if (view2 == null) {
            l.a("nextStep");
        }
        if (!(view2 instanceof TextView)) {
            view2 = null;
        }
        TextView textView = (TextView) view2;
        if (!(textView == null || (a2 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g)) == null)) {
            textView.setTypeface(a2);
        }
        Activity activity = this.f42913m;
        if (activity != null) {
            l.b(activity, "");
            if (!com.ss.android.ugc.gamora.editor.d.a.a(activity)) {
                return;
            }
            if (com.ss.android.ugc.aweme.tools.c.a(activity)) {
                View view3 = this.f98211c;
                if (view3 == null) {
                    l.a("nextStep");
                }
                view3.setBackground(androidx.core.content.b.a(activity, (int) R.drawable.e3));
                return;
            }
            View view4 = this.f98211c;
            if (view4 == null) {
                l.a("nextStep");
            }
            view4.setBackground(androidx.core.content.b.a(activity, (int) R.drawable.e2));
        }
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
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
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
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
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
