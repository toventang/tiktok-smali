package com.ss.android.ugc.aweme.ftc.components.sticker.core;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.als.AlsLogicContainer;
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
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class c extends com.bytedance.scene.group.b implements com.bytedance.jedi.arch.b, com.bytedance.o.a, com.ss.android.ugc.aweme.infoSticker.g, com.ss.android.ugc.gamora.editor.sticker.a {
    public static final f t = new f((byte) 0);
    private boolean A;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.f.a.a.j f97939b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.interact.e f97940c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f97941d;

    /* renamed from: e  reason: collision with root package name */
    public final h.h f97942e;

    /* renamed from: f  reason: collision with root package name */
    public FrameLayout f97943f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f97944g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.gamora.editor.ab f97945h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ftc.components.sticker.text.a f97946i;

    /* renamed from: j  reason: collision with root package name */
    final h.h f97947j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f97948k;

    /* renamed from: l  reason: collision with root package name */
    public final com.bytedance.o.f f97949l;
    private final h.h u = h.i.a(h.m.NONE, new a(this));
    private com.ss.android.ugc.aweme.ftc.components.sticker.hint.b v;
    private final h.h w = h.i.a((h.f.a.a) new z(this));
    private final h.h x;
    private dmt.av.video.y y;
    private final h.h z;

    static {
        Covode.recordClassIndex(62244);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a E() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.u.getValue();
    }

    public final VideoPublishEditModel F() {
        return (VideoPublishEditModel) this.w.getValue();
    }

    /* access modifiers changed from: package-private */
    public final FTCEditStickerViewModel G() {
        return (FTCEditStickerViewModel) this.x.getValue();
    }

    public final com.ss.android.ugc.aweme.ftc.components.sticker.info.a H() {
        return (com.ss.android.ugc.aweme.ftc.components.sticker.info.a) this.z.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.a
    public final void K() {
    }

    @Override // com.ss.android.ugc.aweme.infoSticker.g
    public final void M() {
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.a
    public final void O() {
    }

    @Override // com.ss.android.ugc.aweme.infoSticker.g
    public final void a(Effect effect, String str) {
        h.f.b.l.d(effect, "");
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class f {
        static {
            Covode.recordClassIndex(62258);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
            this();
        }
    }

    static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final g f97958a = new g();

        static {
            Covode.recordClassIndex(62259);
        }

        g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Object call() {
            return h.a.z.INSTANCE;
        }
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
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(62245);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.core.c.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.sticker.info.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(62254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.sticker.info.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.sticker.info.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.sticker.info.a> r1 = com.ss.android.ugc.aweme.ftc.components.sticker.info.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.core.c.b.invoke():com.bytedance.als.b");
        }
    }

    public static final class y implements com.ss.android.ugc.aweme.editSticker.d.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97971a;

        static {
            Covode.recordClassIndex(62277);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void d() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void e() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void f() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void a() {
            com.ss.android.ugc.aweme.ftc.f.a(this.f97971a.F());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public y(c cVar) {
            this.f97971a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void a(int i2, String str) {
            h.f.b.l.d(str, "");
            bl.a(this.f97971a.F(), "move_to_top", 0, i2, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.infoSticker.g
    public final void L() {
        E().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.a
    public final boolean N() {
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = this.f97946i;
        if (aVar == null || !aVar.l()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        com.bytedance.o.f b2 = com.bytedance.als.dsl.c.b(this);
        if (b2 == null) {
            h.f.b.l.b();
        }
        return b2;
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = this.f97946i;
        if (aVar != null) {
            aVar.g();
        }
        this.f97944g = false;
    }

    static final class ad extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.text.view.i> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public static final class b implements com.ss.android.ugc.aweme.editSticker.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ad f97957a;

            static {
                Covode.recordClassIndex(62253);
            }

            @Override // com.ss.android.ugc.aweme.editSticker.d.f
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.editSticker.d.f
            public final Map<String, String> b() {
                Map<String, String> map = com.ss.android.ugc.aweme.story.h.b.a(this.f97957a.this$0.F().getAvetParameter()).f149193a;
                h.f.b.l.b(map, "");
                return map;
            }

            b(ad adVar) {
                this.f97957a = adVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.i invoke() {
            MethodCollector.i(6420);
            View inflate = ((ViewStub) this.this$0.c(R.id.fk1)).inflate();
            if (inflate != null) {
                com.ss.android.ugc.aweme.editSticker.text.view.i iVar = (com.ss.android.ugc.aweme.editSticker.text.view.i) inflate;
                iVar.a(this.this$0.F().mShootWay, this.this$0.F().creationId, bp.a(this.this$0.F()));
                iVar.setTextStickerInputMobListener(new a(this));
                iVar.setWikiTextStickerMob(new b(this));
                MethodCollector.o(6420);
                return iVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.view.TextStickerInputLayout");
            MethodCollector.o(6420);
            throw nullPointerException;
        }

        public static final class a implements com.ss.android.ugc.aweme.editSticker.text.c.h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ad f97956a;

            static {
                Covode.recordClassIndex(62252);
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a(int i2) {
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a(com.ss.android.ugc.aweme.editSticker.text.a.c cVar) {
                h.f.b.l.d(cVar, "");
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a(String str) {
                h.f.b.l.d(str, "");
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void b(int i2) {
            }

            a(ad adVar) {
                this.f97956a = adVar;
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a(List<TextStickerTextWrap> list) {
                h.f.b.l.d(list, "");
                VideoPublishEditModel F = this.f97956a.this$0.F();
                h.f.b.l.d(F, "");
                com.ss.android.ugc.aweme.common.r.a("text_complete", new com.ss.android.ugc.tools.f.b().a("creation_id", F.creationId).a("shoot_way", F.mShootWay).a("enter_from", F.enterFrom).a("content_source", es.a(F)).f149193a);
            }
        }
    }

    static final class z extends h.f.b.m implements h.f.a.a<VideoPublishEditModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a2 = this.this$0.f97949l.a((Type) VideoPublishEditModel.class, (String) null);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    public final void I() {
        if (!this.A) {
            this.A = true;
            H().a();
            E().E().observe(this, new i(this));
        }
    }

    public final void J() {
        h.p<Integer, Integer> pVar;
        VESize b2;
        com.ss.android.ugc.asve.editor.g value = E().C().getValue();
        if (value == null || (b2 = value.b()) == null) {
            pVar = null;
        } else {
            pVar = new h.p<>(Integer.valueOf(b2.width), Integer.valueOf(b2.height));
        }
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = this.f97946i;
        if (aVar != null) {
            aVar.a(pVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.core.c$c  reason: collision with other inner class name */
    public static final class C2368c extends h.f.b.m implements h.f.a.a<FTCEditTextStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2368c(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.core.c.C2368c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<FTCEditToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.core.c.d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<FTCEditStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.core.c.e.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_ftc_components_sticker_core_FTCEditStickerScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        public static final class a extends com.bytedance.o.p<com.ss.android.ugc.aweme.editSticker.text.view.i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ac f97955a;

            static {
                Covode.recordClassIndex(62250);
            }

            public a(ac acVar) {
                this.f97955a = acVar;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.editSticker.text.view.i] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.o.p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.editSticker.text.view.i get(com.bytedance.o.f r2) {
                /*
                    r1 = this;
                    java.lang.String r0 = ""
                    h.f.b.l.d(r2, r0)
                    com.ss.android.ugc.aweme.ftc.components.sticker.core.c$ac r0 = r1.f97955a
                    com.ss.android.ugc.aweme.ftc.components.sticker.core.c r0 = r0.this$0
                    h.h r0 = r0.f97947j
                    java.lang.Object r0 = r0.getValue()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.core.c.ac.a.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.editSticker.text.view.i.class, (String) null, (com.bytedance.o.p) new a(this)), "");
            return h.z.f158842a;
        }
    }

    public static final class u implements com.ss.android.ugc.aweme.editSticker.text.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97970a;

        static {
            Covode.recordClassIndex(62273);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void b(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void c(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public u(c cVar) {
            this.f97970a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, com.ss.android.ugc.aweme.editSticker.text.c.i iVar) {
            h.f.b.l.d(qVar, "");
            h.f.b.l.d(iVar, "");
            if (iVar.f88461c) {
                if (!iVar.f88463e) {
                    this.f97970a.E().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
                }
                this.f97970a.f97944g = false;
                return;
            }
            if (!this.f97970a.f97944g) {
                this.f97970a.E().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
                this.f97970a.H().i();
                ((FTCEditTextStickerViewModel) this.f97970a.f97941d.getValue()).k();
                this.f97970a.I();
                com.ss.android.ugc.aweme.ftc.components.sticker.info.a H = this.f97970a.H();
                if (H.c() != null) {
                    H.b();
                }
            }
            this.f97970a.f97944g = true;
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97963a;

        static {
            Covode.recordClassIndex(62263);
        }

        k(c cVar) {
            this.f97963a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                this.f97963a.H().i();
            }
        }
    }

    public static final /* synthetic */ FrameLayout a(c cVar) {
        FrameLayout frameLayout = cVar.f97943f;
        if (frameLayout == null) {
            h.f.b.l.a("textLayout");
        }
        return frameLayout;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public static final class aa extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.components.sticker.info.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f97951b;

        static {
            Covode.recordClassIndex(62246);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.components.sticker.info.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            c cVar = this.f97951b;
            return new com.ss.android.ugc.aweme.ftc.components.sticker.info.b(fVar, cVar, c.a(cVar));
        }

        public aa(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f97950a = dVar;
            this.f97951b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97961a;

        static {
            Covode.recordClassIndex(62261);
        }

        i(c cVar) {
            this.f97961a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            dmt.av.video.u uVar = (dmt.av.video.u) obj;
            if (uVar == null) {
                return;
            }
            if (uVar.f156965j == 1) {
                this.f97961a.E().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
            } else {
                this.f97961a.E().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            }
        }
    }

    static final class j<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97962a;

        static {
            Covode.recordClassIndex(62262);
        }

        j(c cVar) {
            this.f97962a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                com.ss.android.ugc.aweme.ftc.components.sticker.info.a H = this.f97962a.H();
                if (!H.f()) {
                    H.a(booleanValue);
                }
            }
        }
    }

    static final class l<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97964a;

        static {
            Covode.recordClassIndex(62264);
        }

        l(c cVar) {
            this.f97964a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = this.f97964a.f97946i;
                if (aVar != null) {
                    aVar.a(booleanValue);
                }
            }
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97966a;

        static {
            Covode.recordClassIndex(62266);
        }

        n(c cVar) {
            this.f97966a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f97966a.E().d(bool.booleanValue());
            }
        }
    }

    static final class p<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97968a;

        static {
            Covode.recordClassIndex(62268);
        }

        p(c cVar) {
            this.f97968a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                c cVar = this.f97968a;
                com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = cVar.f97946i;
                if (aVar != null) {
                    aVar.b(booleanValue);
                }
                com.ss.android.ugc.aweme.ftc.components.sticker.info.a H = cVar.H();
                if (!H.g()) {
                    H.a(booleanValue);
                }
            }
        }
    }

    static final class q<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97969a;

        static {
            Covode.recordClassIndex(62269);
        }

        q(c cVar) {
            this.f97969a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                c cVar = this.f97969a;
                com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = cVar.f97946i;
                if (aVar != null) {
                    aVar.b(booleanValue);
                }
                cVar.H().a(booleanValue);
            }
        }
    }

    public static final class v extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar2 = qVar;
            h.f.b.l.d(qVar2, "");
            this.this$0.I();
            this.this$0.H().a(qVar2);
            return h.z.f158842a;
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97965a;

        static {
            Covode.recordClassIndex(62265);
        }

        m(c cVar) {
            this.f97965a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean booleanValue;
            h.p pVar = (h.p) obj;
            if (pVar != null) {
                this.f97965a.E().a((com.ss.android.ugc.aweme.shortvideo.preview.a) ((Boolean) pVar.getFirst()).booleanValue(), ((Boolean) pVar.getSecond()).booleanValue(), booleanValue);
            }
        }
    }

    public static final class ab extends com.bytedance.o.p<com.ss.android.ugc.aweme.ftc.components.sticker.text.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f97952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f97953b;

        static {
            Covode.recordClassIndex(62247);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.components.sticker.text.b get(com.bytedance.o.f fVar) {
            Integer num;
            h.f.b.l.d(fVar, "");
            Integer a2 = com.ss.android.ugc.aweme.port.in.l.f115658a.s().f().a();
            if (a2 != null && a2.intValue() == 0) {
                num = 30;
            } else {
                num = com.ss.android.ugc.aweme.port.in.l.f115658a.s().f().a();
            }
            c cVar = this.f97953b;
            AnonymousClass1 r1 = new com.ss.android.ugc.aweme.ftc.components.sticker.text.s(this) {
                /* class com.ss.android.ugc.aweme.ftc.components.sticker.core.c.ab.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ab f97954a;

                static {
                    Covode.recordClassIndex(62248);
                }

                @Override // com.ss.android.ugc.aweme.ftc.components.sticker.text.s
                public final InfoStickerModel a() {
                    return this.f97954a.f97953b.F().infoStickerModel;
                }

                {
                    this.f97954a = r1;
                }
            };
            h.f.b.l.b(num, "");
            return new com.ss.android.ugc.aweme.ftc.components.sticker.text.b(fVar, cVar, r1, num.intValue());
        }

        public ab(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f97952a = dVar;
            this.f97953b = cVar;
        }
    }

    static final class h<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.g f97959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.editor.ab f97960b;

        static {
            Covode.recordClassIndex(62260);
        }

        h(com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.gamora.editor.ab abVar) {
            this.f97959a = gVar;
            this.f97960b = abVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            int i2;
            int j2;
            h.f.b.l.b(iVar, "");
            for (TextStickerCompileResult textStickerCompileResult : (List) iVar.d()) {
                TextStickerData textStickerData = textStickerCompileResult.textStickerData;
                String b2 = com.ss.android.ugc.aweme.port.in.g.a().G().b(textStickerData);
                if (textStickerData.hasTimeData()) {
                    i2 = textStickerData.getStartTime();
                } else {
                    i2 = 0;
                }
                if (textStickerData.hasTimeData()) {
                    j2 = textStickerData.getEndTime();
                } else {
                    j2 = this.f97959a.j();
                }
                StickerItemModel stickerItemModel = new StickerItemModel("text_sticker_" + textStickerCompileResult.index, textStickerCompileResult.stickerPath, b2, textStickerCompileResult.index, false, i2, j2, 2);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = textStickerCompileResult.viewHash;
                this.f97960b.a(stickerItemModel);
            }
            return h.z.f158842a;
        }
    }

    static final class o<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f97967a;

        static {
            Covode.recordClassIndex(62267);
        }

        o(c cVar) {
            this.f97967a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            dmt.av.video.u uVar = (dmt.av.video.u) obj;
            if (uVar != null) {
                c cVar = this.f97967a;
                if (uVar.f156965j == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (uVar.f156962g) {
                    cVar.G().h().setValue(Boolean.valueOf(z));
                } else {
                    cVar.G().g().setValue(Boolean.valueOf(z));
                }
                if (z) {
                    cVar.G().i().setValue(false);
                    cVar.G().j().setValue(false);
                }
            }
        }
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.f97949l = fVar;
        h.k.c a2 = h.f.b.ab.a(FTCEditTextStickerViewModel.class);
        this.f97941d = h.i.a((h.f.a.a) new C2368c(this, a2, a2));
        h.k.c a3 = h.f.b.ab.a(FTCEditToolbarViewModel.class);
        this.f97942e = h.i.a((h.f.a.a) new d(this, a3, a3));
        h.k.c a4 = h.f.b.ab.a(FTCEditStickerViewModel.class);
        this.x = h.i.a((h.f.a.a) new e(this, a4, a4));
        this.z = h.i.a(h.m.NONE, new b(this));
        this.f97947j = h.i.a((h.f.a.a) new ad(this));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        com.bytedance.als.k<Boolean> c2;
        com.bytedance.als.k<h.p<Boolean, Boolean>> b2;
        com.bytedance.als.k<h.z> a2;
        super.a(bundle);
        com.bytedance.als.dsl.g.a(this, new ac(this));
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.ftc.components.sticker.info.b.class, (String) null, (com.bytedance.o.p) new aa(dVar, this));
        alsLogicContainer.a(FTCEditInfoStickerViewModel.class, com.ss.android.ugc.aweme.ftc.components.sticker.info.b.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.aweme.ftc.components.sticker.text.b.class, (String) null, (com.bytedance.o.p) new ab(dVar2, this));
        alsLogicContainer2.a(FTCEditTextStickerViewModel.class, com.ss.android.ugc.aweme.ftc.components.sticker.text.b.class);
        bVar.a();
        this.f97946i = (com.ss.android.ugc.aweme.ftc.components.sticker.text.a) getDiContainer().a(com.ss.android.ugc.aweme.ftc.components.sticker.text.a.class, (String) null);
        this.y = new com.ss.android.ugc.aweme.ftc.e();
        G().g().observe(this, new j<>(this));
        G().h().observe(this, new p<>(this));
        G().b().observe(this, new q<>(this));
        b.a.b(this, G(), d.f97972a, new r(this));
        b.a.b(this, G(), e.f97973a, new s(this));
        f.a.b.b unused = selectSubscribe(G(), f.f97974a, new ah(), new t(this));
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = this.f97946i;
        if (!(aVar == null || (a2 = aVar.a()) == null)) {
            a2.a(getLifecycleOwner(), new k(this));
        }
        G().i().observe(this, new l<>(this));
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar2 = this.f97946i;
        if (aVar2 != null) {
            aVar2.a(G().i());
        }
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar3 = this.f97946i;
        if (!(aVar3 == null || (b2 = aVar3.b()) == null)) {
            b2.a(this, new m(this));
        }
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar4 = this.f97946i;
        if (!(aVar4 == null || (c2 = aVar4.c()) == null)) {
            c2.a(this, new n(this));
        }
        E().E().observe(this, new o<>(this));
        if (this.v == null) {
            com.ss.android.ugc.aweme.ftc.components.sticker.hint.b bVar2 = new com.ss.android.ugc.aweme.ftc.components.sticker.hint.b();
            this.v = bVar2;
            a(R.id.f81, bVar2, "StickerHintTextScene");
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atu, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) a2;
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends Float, ? extends Long>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.p<? extends Float, ? extends Long> pVar) {
            h.p<? extends Float, ? extends Long> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            com.ss.android.ugc.gamora.editor.u.a(c.a(this.this$0), ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.u<? extends Float, ? extends Float, ? extends Float>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.u<? extends Float, ? extends Float, ? extends Float> uVar) {
            h.u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(uVar2, "");
            com.ss.android.ugc.gamora.editor.u.a(c.a(this.this$0), ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            Integer num2 = num;
            h.f.b.l.d(iVar, "");
            if (num2 != null) {
                int intValue = num2.intValue();
                View b2 = this.this$0.b(R.id.f1n);
                if (b2 != null) {
                    ViewGroup.LayoutParams layoutParams = b2.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = intValue;
                    b2.setLayoutParams(marginLayoutParams);
                }
            }
            return h.z.f158842a;
        }
    }

    public static final class w extends h.f.b.m implements h.f.a.m<com.ss.android.ugc.aweme.editSticker.text.view.q, com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, com.ss.android.ugc.aweme.editSticker.text.view.q qVar2) {
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar3 = qVar2;
            h.f.b.l.d(qVar, "");
            h.f.b.l.d(qVar3, "");
            com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = this.this$0.f97946i;
            if (aVar != null && aVar.f()) {
                this.this$0.H().b(qVar3);
                this.this$0.H().b();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.ek3);
        h.f.b.l.b(c2, "");
        this.f97943f = (FrameLayout) c2;
    }

    public static final class x implements com.ss.android.ugc.aweme.editSticker.text.c.d {
        static {
            Covode.recordClassIndex(62276);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final float a(float f2) {
            return 0.0f;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final int a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, boolean z, boolean z2) {
            h.f.b.l.d(qVar, "");
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, RectF rectF, com.ss.android.ugc.aweme.editSticker.text.c.i iVar) {
            h.f.b.l.d(qVar, "");
            h.f.b.l.d(rectF, "");
            h.f.b.l.d(iVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, boolean z) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void b(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void c(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void d(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void e(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final PointF a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, float f2, float f3) {
            h.f.b.l.d(qVar, "");
            return new PointF();
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.a
    public final b.i<h.z> a(com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.gamora.editor.ab abVar, h.f.a.b<? super String, String> bVar) {
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(abVar, "");
        b.i<h.z> a2 = b.i.a(h.z.f158842a);
        h.f.b.l.b(a2, "");
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009f, code lost:
        if (r3 == null) goto L_0x00a1;
     */
    @Override // com.ss.android.ugc.gamora.editor.sticker.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.i<h.z> b(com.ss.android.ugc.asve.editor.g r11, com.ss.android.ugc.gamora.editor.ab r12, h.f.a.b<? super java.lang.String, java.lang.String> r13) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.core.c.b(com.ss.android.ugc.asve.editor.g, com.ss.android.ugc.gamora.editor.ab, h.f.a.b):b.i");
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
