package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.app.Activity;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
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
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.i;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.gamora.editor.u;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.y;
import h.p;
import h.z;
import java.util.List;
import java.util.Objects;

public final class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f98035a = {new y(c.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(c.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final e f98036e = new e((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.f.a.a.j f98037b;

    /* renamed from: c  reason: collision with root package name */
    final h.h.d f98038c = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.infoSticker.i.class);

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f98039d;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f98040f = h.i.a(h.m.NONE, new a(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f98041g = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f98042h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f98043i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f98044j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f98045k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.o.f f98046l;

    static {
        Covode.recordClassIndex(62316);
    }

    private final FTCEditInfoStickerViewModel D() {
        return (FTCEditInfoStickerViewModel) this.f98042h.getValue();
    }

    public static float a(boolean z) {
        return z ? 1.0f : 0.3137255f;
    }

    public final i C() {
        return (i) this.f98045k.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a a() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f98040f.getValue();
    }

    public final FTCEditTextStickerViewModel b() {
        return (FTCEditTextStickerViewModel) this.f98043i.getValue();
    }

    public final FTCEditStickerViewModel d() {
        return (FTCEditStickerViewModel) this.f98044j.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class e {
        static {
            Covode.recordClassIndex(62321);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f98046l;
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
            Covode.recordClassIndex(62317);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.info.c.a.invoke():com.bytedance.als.b");
        }
    }

    static final class i implements com.ss.android.ugc.aweme.editSticker.interact.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98050a;

        static {
            Covode.recordClassIndex(62325);
        }

        i(c cVar) {
            this.f98050a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.interact.a.b
        public final void a() {
            this.f98050a.b().k();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<i> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return new i(this.this$0.a());
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        i C = C();
        if (C.y != null) {
            C.y.b();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<FTCEditInfoStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.info.c.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.c$c  reason: collision with other inner class name */
    public static final class C2371c extends h.f.b.m implements h.f.a.a<FTCEditTextStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2371c(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.info.c.C2371c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<FTCEditStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(62320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.info.c.d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ftc_components_sticker_info_FTCEditInfoStickerScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98047a;

        static {
            Covode.recordClassIndex(62322);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(c cVar) {
            this.f98047a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a
        public final void b(StickerItemModel stickerItemModel) {
            h.f.b.l.d(stickerItemModel, "");
            this.f98047a.C().t.infoStickerModel.removeSticker(stickerItemModel);
            c cVar = this.f98047a;
            ((com.ss.android.ugc.aweme.infoSticker.i) cVar.f98038c.a(cVar, c.f98035a[1])).a(stickerItemModel.stickerId);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a
        public final void a(StickerItemModel stickerItemModel) {
            h.f.b.l.d(stickerItemModel, "");
            if (this.f98047a.C().t.infoStickerModel == null) {
                this.f98047a.C().t.infoStickerModel = new InfoStickerModel(this.f98047a.C().t.draftDir());
            }
            q.d("add infoSticker " + stickerItemModel.getId());
            this.f98047a.C().t.infoStickerModel.addSticker(stickerItemModel);
        }
    }

    public static final class g implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98048a;

        static {
            Covode.recordClassIndex(62323);
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.i.b
        public final int a(com.ss.android.ugc.aweme.ftc.components.sticker.a aVar, boolean z, boolean z2) {
            h.f.b.l.d(aVar, "");
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(c cVar) {
            this.f98048a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.i.b
        public final Float a(float f2) {
            return Float.valueOf(f2);
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.i.b
        public final PointF a(com.ss.android.ugc.aweme.ftc.components.sticker.a aVar, float f2, float f3) {
            h.f.b.l.d(aVar, "");
            return new PointF();
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.i.b
        public final void a(com.ss.android.ugc.aweme.ftc.components.sticker.a aVar, int i2, int i3, boolean z, boolean z2) {
            h.f.b.l.d(aVar, "");
            if (h.f.b.l.a((Object) this.f98048a.d().i().getValue(), (Object) true) || h.f.b.l.a((Object) this.f98048a.d().j().getValue(), (Object) true)) {
                if (this.f98048a.C().J != null) {
                    this.f98048a.C().f();
                }
            } else if (z) {
                this.f98048a.a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
            } else {
                this.f98048a.a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
                this.f98048a.C().h();
                this.f98048a.b().k();
            }
        }
    }

    public static final class h implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98049a;

        static {
            Covode.recordClassIndex(62324);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(c cVar) {
            this.f98049a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.i.a
        public final void b(boolean z) {
            this.f98049a.b().a(c.a(z));
            if (!z) {
                com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.f98049a.C().J;
                if (!(cVar instanceof com.ss.android.ugc.aweme.editSticker.text.view.q)) {
                    cVar = null;
                }
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar = (com.ss.android.ugc.aweme.editSticker.text.view.q) cVar;
                if (qVar != null) {
                    qVar.a(c.a(true), false);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.ftc.components.sticker.info.i.a
        public final void a(boolean z) {
            this.f98049a.b().a(c.a(!z));
            if (z) {
                com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.f98049a.C().J;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e eVar = null;
                if (!(cVar instanceof com.ss.android.ugc.aweme.editSticker.text.view.q)) {
                    cVar = null;
                }
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar = (com.ss.android.ugc.aweme.editSticker.text.view.q) cVar;
                if (qVar != null) {
                    qVar.a(c.a(true), false);
                }
                com.ss.android.ugc.aweme.editSticker.interact.c cVar2 = this.f98049a.C().J;
                if (!(cVar2 instanceof CommentStickerView)) {
                    cVar2 = null;
                }
                CommentStickerView commentStickerView = (CommentStickerView) cVar2;
                if (commentStickerView != null) {
                    commentStickerView.setAlpha(c.a(true));
                }
                com.ss.android.ugc.aweme.editSticker.interact.c cVar3 = this.f98049a.C().J;
                if (cVar3 instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e) {
                    eVar = cVar3;
                }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.a(c.a(true));
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.f98046l = fVar;
        h.k.c a2 = h.f.b.ab.a(FTCEditInfoStickerViewModel.class);
        this.f98042h = h.i.a((h.f.a.a) new b(this, a2, a2));
        h.k.c a3 = h.f.b.ab.a(FTCEditTextStickerViewModel.class);
        this.f98043i = h.i.a((h.f.a.a) new C2371c(this, a3, a3));
        h.k.c a4 = h.f.b.ab.a(FTCEditStickerViewModel.class);
        this.f98044j = h.i.a((h.f.a.a) new d(this, a4, a4));
        this.f98045k = h.i.a((h.f.a.a) new n(this));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Objects.requireNonNull(this.f42913m, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        i C = C();
        com.ss.android.ugc.asve.editor.g value = a().C().getValue();
        if (value == null) {
            h.f.b.l.b();
        }
        int i2 = 0;
        C.r = value;
        C.t = (VideoPublishEditModel) this.f98041g.a(this, f98035a[0]);
        i C2 = C();
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
        View view = this.n;
        VideoPublishEditModel videoPublishEditModel = C().t;
        h.f.b.l.b(videoPublishEditModel, "");
        List<MediaModel> mediaModelList = videoPublishEditModel.getMediaModelList();
        C2.f98068c = eVar;
        C2.w = mediaModelList;
        C2.f98067b = false;
        C2.x = new SafeHandler(eVar);
        C2.s = (FTCInfoStickerViewModel) androidx.lifecycle.ae.a(eVar, (ad.b) null).a(FTCInfoStickerViewModel.class);
        C2.u = view;
        C2.z = (FrameLayout) C2.u.findViewById(R.id.dqn);
        C2.f98069d = (FTCInfoStickerEditView) C2.u.findViewById(R.id.bp2);
        C2.f98070e = C2.u.findViewById(R.id.bzv);
        C2.f98071f = C2.u.findViewById(R.id.ae6);
        C2.f98072g = (AVDmtTextView) C2.u.findViewById(R.id.ejz);
        C2.f98073h = (VideoEditView) C2.u.findViewById(R.id.fg1);
        C2.f98074i = (ImageView) C2.u.findViewById(R.id.a1p);
        C2.f98075j = (ImageView) C2.u.findViewById(R.id.ds0);
        C2.f98076k = (ImageView) C2.u.findViewById(R.id.zc);
        C2.f98078m = C2.u.findViewById(R.id.d4s);
        C2.n = (TextView) C2.u.findViewById(R.id.d4r);
        C2.o = (TextView) C2.u.findViewById(R.id.d4v);
        C2.p = (SeekBar) C2.u.findViewById(R.id.d4t);
        C2.q = (ViewGroup) C2.u.findViewById(R.id.d4u);
        C2.P = (FTCEditCornerViewModel) t.a(C2.f98068c).a(FTCEditCornerViewModel.class);
        C2.N = new com.ss.android.ugc.aweme.ftc.components.sticker.a.a(C2.r, C2.f98068c, C2.Q);
        C2.N.f97909e = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0140: IPUT  
              (wrap: com.ss.android.ugc.aweme.ftc.components.sticker.info.i$4 : 0x013d: CONSTRUCTOR  (r0v59 com.ss.android.ugc.aweme.ftc.components.sticker.info.i$4) = (r2v2 'C2' com.ss.android.ugc.aweme.ftc.components.sticker.info.i) call: com.ss.android.ugc.aweme.ftc.components.sticker.info.i.4.<init>(com.ss.android.ugc.aweme.ftc.components.sticker.info.i):void type: CONSTRUCTOR)
              (wrap: com.ss.android.ugc.aweme.ftc.components.sticker.a.a : 0x0139: IGET  (r1v20 com.ss.android.ugc.aweme.ftc.components.sticker.a.a) = (r2v2 'C2' com.ss.android.ugc.aweme.ftc.components.sticker.info.i) com.ss.android.ugc.aweme.ftc.components.sticker.info.i.N com.ss.android.ugc.aweme.ftc.components.sticker.a.a)
             com.ss.android.ugc.aweme.ftc.components.sticker.a.a.e com.ss.android.ugc.aweme.ftc.components.sticker.a.a$a in method: com.ss.android.ugc.aweme.ftc.components.sticker.info.c.a(android.os.Bundle):void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x013d: CONSTRUCTOR  (r0v59 com.ss.android.ugc.aweme.ftc.components.sticker.info.i$4) = (r2v2 'C2' com.ss.android.ugc.aweme.ftc.components.sticker.info.i) call: com.ss.android.ugc.aweme.ftc.components.sticker.info.i.4.<init>(com.ss.android.ugc.aweme.ftc.components.sticker.info.i):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.ftc.components.sticker.info.c.a(android.os.Bundle):void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.ftc.components.sticker.info.i, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
        // Method dump skipped, instructions count: 835
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.info.c.a(android.os.Bundle):void");
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            this.this$0.C().h();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a32, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, p<? extends Float, ? extends Long>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, p<? extends Float, ? extends Long> pVar) {
            p<? extends Float, ? extends Long> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            FTCInfoStickerEditView fTCInfoStickerEditView = this.this$0.C().f98069d;
            h.f.b.l.b(fTCInfoStickerEditView, "");
            u.a(fTCInfoStickerEditView, ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.u<? extends Float, ? extends Float, ? extends Float>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, h.u<? extends Float, ? extends Float, ? extends Float> uVar) {
            h.u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(uVar2, "");
            FTCInfoStickerEditView fTCInfoStickerEditView = this.this$0.C().f98069d;
            h.f.b.l.b(fTCInfoStickerEditView, "");
            u.a(fTCInfoStickerEditView, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, p<? extends Integer, ? extends Integer>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, p<? extends Integer, ? extends Integer> pVar) {
            p<? extends Integer, ? extends Integer> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            i C = this.this$0.C();
            Integer num = (Integer) pVar2.getFirst();
            Integer num2 = (Integer) pVar2.getSecond();
            if (C.f98069d != null) {
                C.f98069d.f98000g.f98057c = num2.intValue();
            }
            if (C.v) {
                if (C.f98077l != null) {
                    C.f98077l.f125337l = num.intValue();
                }
                C.f98073h.a(num.intValue());
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
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
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
