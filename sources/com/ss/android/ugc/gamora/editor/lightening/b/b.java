package com.ss.android.ugc.gamora.editor.lightening.b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
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
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.t;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.s;
import h.f.b.y;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class b extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146068a = {new y(b.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final c f146069j = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public ImageView f146070b;

    /* renamed from: c  reason: collision with root package name */
    public View f146071c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f146072d;

    /* renamed from: e  reason: collision with root package name */
    View f146073e;

    /* renamed from: f  reason: collision with root package name */
    View f146074f;

    /* renamed from: g  reason: collision with root package name */
    View f146075g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f146076h;

    /* renamed from: i  reason: collision with root package name */
    public final a f146077i;

    /* renamed from: k  reason: collision with root package name */
    private View f146078k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f146079l = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final h.h t;
    private final h.h u;
    private t v;
    private final Map<Integer, View> w;
    private final h.h x;
    private final com.bytedance.o.f y;

    static {
        Covode.recordClassIndex(95989);
    }

    private final EditToolbarViewModel d() {
        return (EditToolbarViewModel) this.t.getValue();
    }

    public final VideoPublishEditModel a() {
        return (VideoPublishEditModel) this.f146079l.a(this, f146068a[0]);
    }

    public final boolean b() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(95992);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.y;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.b$b  reason: collision with other inner class name */
    public static final class C3899b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.music.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(95991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3899b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.music.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.music.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.music.a> r1 = com.ss.android.ugc.gamora.editor.music.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.b.b.C3899b.invoke():com.bytedance.als.b");
        }
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146093a;

        static {
            Covode.recordClassIndex(96006);
        }

        p(b bVar) {
            this.f146093a = bVar;
        }

        public final void run() {
            b.a(this.f146093a).requestFocus();
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        t tVar = this.v;
        if (tVar != null) {
            tVar.a();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f146080a = new d();

        static {
            Covode.recordClassIndex(95993);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(95990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_lightening_music_LighteningChooseMusicScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_lightening_music_LighteningChooseMusicScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.b.b.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_lightening_music_LighteningChooseMusicScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146081a;

        static {
            Covode.recordClassIndex(95994);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(600);
            this.f146081a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            h.f.a.a<z> aVar = this.f146081a.f146077i.f146066h;
            if (aVar == null) {
                h.f.b.l.a("openMusicPanel");
            }
            aVar.invoke();
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146082a;

        static {
            Covode.recordClassIndex(95995);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(600);
            this.f146082a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            if (view != null) {
                new com.bytedance.tux.g.b(view).a(this.f146082a.t().getResources().getText(R.string.fhd)).a(3000L).b();
            }
        }
    }

    public static final class g extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146083a;

        static {
            Covode.recordClassIndex(95996);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(600);
            this.f146083a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            String str;
            if (this.f146083a.b()) {
                VideoPublishEditModel a2 = this.f146083a.a();
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (cVar == null || (str = cVar.getMusicId()) == null) {
                    str = "";
                }
                h.f.b.l.b(str, "");
                bl.a(a2, str, "");
            }
            h.f.a.a<z> aVar = this.f146083a.f146077i.f146067i;
            if (aVar == null) {
                h.f.b.l.a("clearMusic");
            }
            aVar.invoke();
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146084a;

        static {
            Covode.recordClassIndex(95998);
        }

        i(b bVar) {
            this.f146084a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            b.a(this.f146084a).setText((String) obj);
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146085a;

        static {
            Covode.recordClassIndex(95999);
        }

        j(b bVar) {
            this.f146085a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            final TextUtils.TruncateAt truncateAt = (TextUtils.TruncateAt) obj;
            com.bytedance.scene.ktx.c.a(this.f146085a, new Runnable(this) {
                /* class com.ss.android.ugc.gamora.editor.lightening.b.b.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f146086a;

                static {
                    Covode.recordClassIndex(96000);
                }

                {
                    this.f146086a = r1;
                }

                public final void run() {
                    b.a(this.f146086a.f146085a).clearFocus();
                    b.a(this.f146086a.f146085a).setEllipsize(truncateAt);
                }
            });
        }
    }

    public static final /* synthetic */ TextView a(b bVar) {
        TextView textView = bVar.f146072d;
        if (textView == null) {
            h.f.b.l.a("tvChooseMusic");
        }
        return textView;
    }

    public static final /* synthetic */ ImageView b(b bVar) {
        ImageView imageView = bVar.f146070b;
        if (imageView == null) {
            h.f.b.l.a("ivChooseMusic");
        }
        return imageView;
    }

    public static final /* synthetic */ View c(b bVar) {
        View view = bVar.f146071c;
        if (view == null) {
            h.f.b.l.a("ivLoadingMusic");
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146090a;

        static {
            Covode.recordClassIndex(96003);
        }

        m(b bVar) {
            this.f146090a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                b.a(this.f146090a).setVisibility(0);
            } else {
                b.a(this.f146090a).setVisibility(8);
            }
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146091a;

        static {
            Covode.recordClassIndex(96004);
        }

        n(b bVar) {
            this.f146091a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                b.c(this.f146091a).setVisibility(0);
                b.b(this.f146091a).setVisibility(8);
                return;
            }
            b.c(this.f146091a).clearAnimation();
            b.c(this.f146091a).setVisibility(8);
            b.b(this.f146091a).setVisibility(0);
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146089a;

        static {
            Covode.recordClassIndex(96002);
        }

        l(b bVar) {
            this.f146089a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (!bool.booleanValue() || this.f146089a.f146076h) {
                b.b(this.f146089a).setImageAlpha(127);
                b.a(this.f146089a).setAlpha(0.5f);
                return;
            }
            b.b(this.f146089a).setImageAlpha(255);
            b.a(this.f146089a).setAlpha(1.0f);
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146092a;

        static {
            Covode.recordClassIndex(96005);
        }

        o(b bVar) {
            this.f146092a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (!this.f146092a.b()) {
                h.f.b.l.b(bool, "");
                if (bool.booleanValue()) {
                    if (av.a()) {
                        b.b(this.f146092a).setImageResource(2131232541);
                    } else {
                        b.b(this.f146092a).setImageResource(2131232539);
                    }
                } else if (av.a()) {
                    b.b(this.f146092a).setImageResource(2131232541);
                } else {
                    b.b(this.f146092a).setImageResource(2131232355);
                }
            }
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146088a;

        static {
            Covode.recordClassIndex(96001);
        }

        k(b bVar) {
            this.f146088a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            int i3;
            float[] fArr;
            Boolean bool = (Boolean) obj;
            b bVar = this.f146088a;
            h.f.b.l.b(bool, "");
            boolean booleanValue = bool.booleanValue();
            View view = bVar.f146073e;
            if (view == null) {
                h.f.b.l.a("deleteMusicUiView");
            }
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            View view2 = bVar.f146074f;
            if (view2 == null) {
                h.f.b.l.a("deleteMusicClickLayerView");
            }
            if (booleanValue) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view2.setVisibility(i3);
            View view3 = bVar.f146075g;
            if (view3 == null) {
                h.f.b.l.a("selectMusicPressLayerView");
            }
            Context u = bVar.u();
            h.f.b.l.b(u, "");
            boolean z = !booleanValue;
            h.f.b.l.d(u, "");
            float a2 = r.a(u, 24.0f);
            if (z) {
                fArr = new float[8];
                int i4 = 0;
                do {
                    fArr[i4] = a2;
                    i4++;
                } while (i4 < 8);
            } else {
                fArr = new float[]{a2, a2, 0.0f, 0.0f, 0.0f, 0.0f, a2, a2};
            }
            int c2 = androidx.core.content.b.c(u, R.color.bl);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{c2, c2});
            gradientDrawable.setCornerRadii(fArr);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
            view3.setBackground(stateListDrawable);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        selectNonNullSubscribe(d(), c.f146094a, new ah(), new h(this));
        t tVar = this.v;
        if (tVar != null) {
            tVar.a();
        }
        Map<Integer, View> map = this.w;
        View view = this.f146078k;
        if (view == null) {
            h.f.b.l.a("chooseMusicContainer");
        }
        map.put(1, view);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        VideoPublishEditModel a2 = a();
        EditToolbarViewModel d2 = d();
        com.bytedance.scene.j jVar = this.o;
        Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        t tVar2 = new t((androidx.fragment.app.e) activity, a2, d2, (com.bytedance.scene.group.b) jVar, (com.ss.android.ugc.gamora.editor.music.a) this.u.getValue());
        tVar2.a(this.w);
        tVar2.b(this.w);
        tVar2.c(this.w);
        tVar2.a(this.w, 48);
        if (bp.l(a())) {
            d().f146975a.f145949c = com.ss.android.ugc.aweme.port.in.g.a().e().getCombinedShootModeTipShown(true);
            tVar2.a(this.w.get(1));
        }
        this.v = tVar2;
        com.bytedance.als.h<String> hVar = this.f146077i.f146059a;
        if (hVar == null) {
            h.f.b.l.a("titleText");
        }
        hVar.a(this, new i(this));
        com.bytedance.als.h<TextUtils.TruncateAt> hVar2 = this.f146077i.f146061c;
        if (hVar2 == null) {
            h.f.b.l.a("titleEllipsize");
        }
        hVar2.a(this, new j(this));
        com.bytedance.als.h<Boolean> hVar3 = this.f146077i.f146062d;
        if (hVar3 == null) {
            h.f.b.l.a("deleteVisible");
        }
        hVar3.a(this, new k(this));
        com.bytedance.als.h<Boolean> hVar4 = this.f146077i.f146063e;
        if (hVar4 == null) {
            h.f.b.l.a("titleEnabled");
        }
        hVar4.a(this, new l(this));
        com.bytedance.als.h<Boolean> hVar5 = this.f146077i.f146060b;
        if (hVar5 == null) {
            h.f.b.l.a("titleVisible");
        }
        hVar5.a(this, new m(this));
        com.bytedance.als.h<Boolean> hVar6 = this.f146077i.f146064f;
        if (hVar6 == null) {
            h.f.b.l.a("loadingVisible");
        }
        hVar6.a(this, new n(this));
        com.bytedance.als.h<Boolean> hVar7 = this.f146077i.f146065g;
        if (hVar7 == null) {
            h.f.b.l.a("musicIconState");
        }
        hVar7.a(this, new o(this));
        if (!this.f146076h) {
            View view2 = this.f146078k;
            if (view2 == null) {
                h.f.b.l.a("chooseMusicContainer");
            }
            view2.setOnClickListener(new e(this));
        } else {
            View view3 = this.f146078k;
            if (view3 == null) {
                h.f.b.l.a("chooseMusicContainer");
            }
            view3.setOnClickListener(new f(this));
        }
        View view4 = this.f146074f;
        if (view4 == null) {
            h.f.b.l.a("deleteMusicClickLayerView");
        }
        view4.setOnClickListener(new g(this));
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
        View a2 = com.a.a(layoutInflater, R.layout.yc, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(95997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            Integer num2 = num;
            h.f.b.l.d(bVar, "");
            if (num2 != null) {
                View view = this.this$0.n;
                h.f.b.l.b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = num2.intValue();
                    View view2 = this.this$0.n;
                    h.f.b.l.b(view2, "");
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
            return z.f158842a;
        }
    }

    public b(com.bytedance.o.f fVar, a aVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(aVar, "");
        this.y = fVar;
        this.f146077i = aVar;
        h.k.c a2 = h.f.b.ab.a(EditToolbarViewModel.class);
        this.t = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.u = h.i.a(h.m.NONE, new C3899b(this));
        this.w = new LinkedHashMap();
        this.x = h.i.a((h.f.a.a) d.f146080a);
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.dol);
        h.f.b.l.b(c2, "");
        this.f146078k = c2;
        View c3 = c(R.id.bv7);
        h.f.b.l.b(c3, "");
        this.f146070b = (ImageView) c3;
        View c4 = c(R.id.eww);
        h.f.b.l.b(c4, "");
        this.f146072d = (TextView) c4;
        if (av.a()) {
            ImageView imageView = this.f146070b;
            if (imageView == null) {
                h.f.b.l.a("ivChooseMusic");
            }
            imageView.setImageResource(2131232541);
        } else {
            ImageView imageView2 = this.f146070b;
            if (imageView2 == null) {
                h.f.b.l.a("ivChooseMusic");
            }
            imageView2.setImageResource(2131232355);
        }
        HashMap<String, Integer> extraShareOptions = a().creativeFlowData.getExtraShareOptions();
        if (extraShareOptions != null && extraShareOptions.containsKey("tiktok_videokit_disable_music_selection")) {
            HashMap<String, Integer> extraShareOptions2 = a().creativeFlowData.getExtraShareOptions();
            if (extraShareOptions2 == null) {
                h.f.b.l.b();
            }
            Integer num = extraShareOptions2.get("tiktok_videokit_disable_music_selection");
            if (num != null && num.intValue() == 1) {
                this.f146076h = true;
            }
        }
        View c5 = c(R.id.fe9);
        h.f.b.l.b(c5, "");
        this.f146073e = c5;
        View c6 = c(R.id.fe_);
        h.f.b.l.b(c6, "");
        this.f146074f = c6;
        View c7 = c(R.id.fei);
        h.f.b.l.b(c7, "");
        this.f146075g = c7;
        View c8 = c(R.id.asp);
        h.f.b.l.b(c8, "");
        this.f146071c = c8;
        Typeface a2 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
        if (a2 != null) {
            TextView textView = this.f146072d;
            if (textView == null) {
                h.f.b.l.a("tvChooseMusic");
            }
            textView.setTypeface(a2);
        }
        com.bytedance.scene.ktx.c.a(this, new p(this));
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
