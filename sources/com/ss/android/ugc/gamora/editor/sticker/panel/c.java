package com.ss.android.ugc.gamora.editor.sticker.panel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.effect.CallbackAPI;
import com.ss.android.ugc.aweme.effect.v;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerExtra;
import com.ss.android.ugc.aweme.infoSticker.e;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.property.dt;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel;
import com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel;
import com.ss.android.ugc.gamora.editor.x;
import com.ss.android.ugc.tools.infosticker.view.internal.f;
import com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.f.b.z;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class c extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146711b = {new y(c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final int f146712j = dt.a();

    /* renamed from: k  reason: collision with root package name */
    public static final e f146713k = new e((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final h.h f146714a;

    /* renamed from: c  reason: collision with root package name */
    public String f146715c = "click_button";

    /* renamed from: d  reason: collision with root package name */
    public boolean f146716d;

    /* renamed from: e  reason: collision with root package name */
    public long f146717e;

    /* renamed from: f  reason: collision with root package name */
    final h.h f146718f;

    /* renamed from: g  reason: collision with root package name */
    final Set<String> f146719g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.infoSticker.g f146720h;

    /* renamed from: i  reason: collision with root package name */
    public final f.a.b.a f146721i;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f146722l;
    private final h.h t;
    private final h.h u;
    private final h.h.d v;
    private final h.h w;
    private final com.bytedance.o.f x;

    public final EditPageQaStickerViewModel C() {
        return (EditPageQaStickerViewModel) this.u.getValue();
    }

    public final VideoPublishEditModel D() {
        return (VideoPublishEditModel) this.v.a(this, f146711b[0]);
    }

    public final com.ss.android.ugc.tools.infosticker.view.a.f E() {
        return (com.ss.android.ugc.tools.infosticker.view.a.f) this.w.getValue();
    }

    public final EditStickerPanelViewModel a() {
        return (EditStickerPanelViewModel) this.f146714a.getValue();
    }

    /* access modifiers changed from: protected */
    public boolean a(Effect effect) {
        h.f.b.l.d(effect, "");
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(EffectCategoryResponse effectCategoryResponse) {
        h.f.b.l.d(effectCategoryResponse, "");
        return false;
    }

    public final CommentAndQuestionAndQuestionStickerPanelViewModel b() {
        return (CommentAndQuestionAndQuestionStickerPanelViewModel) this.f146722l.getValue();
    }

    public final EditCommentStickerViewModel d() {
        return (EditCommentStickerViewModel) this.t.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class e {
        static {
            Covode.recordClassIndex(96599);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.x;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        if (!this.f146721i.isDisposed()) {
            this.f146721i.dispose();
        }
    }

    static {
        Covode.recordClassIndex(96594);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<EditStickerPanelViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.panel.c.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<CommentAndQuestionAndQuestionStickerPanelViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.panel.c.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$c  reason: collision with other inner class name */
    public static final class C3932c extends h.f.b.m implements h.f.a.a<EditCommentStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3932c(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.panel.c.C3932c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<EditPageQaStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$4_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$4_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.panel.c.d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_gamora_editor_sticker_panel_EditStickerPanelScene$$special$$inlined$hostViewModel$4_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.infosticker.view.a.f> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.infosticker.view.a.f invoke() {
            boolean z;
            View view = this.this$0.n;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) view;
            c cVar = this.this$0;
            com.ss.android.ugc.tools.infosticker.view.internal.l lVar = (com.ss.android.ugc.tools.infosticker.view.internal.l) cVar.f146718f.getValue();
            if (!com.bytedance.ies.abmock.b.a().a(true, "enable_search_gif", false) || com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                z = false;
            } else {
                z = true;
            }
            boolean a2 = com.ss.android.ugc.aweme.setting.i.b.a();
            boolean a3 = com.ss.android.ugc.aweme.setting.i.b.a();
            h.f.b.l.d(frameLayout, "");
            h.f.b.l.d(cVar, "");
            h.f.b.l.d(lVar, "");
            return new x.a(frameLayout, cVar, lVar, z, a2, a3, frameLayout, cVar, lVar, new x.b(z, a2, a3));
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<InfoStickerViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x019e, code lost:
            if (com.ss.android.ugc.tools.utils.r.b(r3, (float) com.ss.android.ugc.aweme.shortvideo.dh.e(r18.this$0.f42913m)) <= com.ss.android.ugc.gamora.editor.sticker.panel.c.f146712j) goto L_0x01a0;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 636
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.panel.c.s.invoke():java.lang.Object");
        }

        static final class a extends h.f.b.m implements h.f.a.b<EffectCategoryResponse, Boolean> {
            final /* synthetic */ s this$0;

            static {
                Covode.recordClassIndex(96625);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(s sVar) {
                super(1);
                this.this$0 = sVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(EffectCategoryResponse effectCategoryResponse) {
                EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
                h.f.b.l.d(effectCategoryResponse2, "");
                return Boolean.valueOf(!this.this$0.this$0.a(effectCategoryResponse2));
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<Effect, Boolean> {
            final /* synthetic */ z.a $allowCommentPanelSticker;
            final /* synthetic */ boolean $allowDonation;
            final /* synthetic */ boolean $allowDuetSticker;
            final /* synthetic */ boolean $allowLiveCD;
            final /* synthetic */ boolean $allowLyricSticker;
            final /* synthetic */ boolean $allowMentionHashTag;
            final /* synthetic */ boolean $allowPollSticker;
            final /* synthetic */ boolean $allowQaSticker;
            final /* synthetic */ s this$0;

            static {
                Covode.recordClassIndex(96626);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(s sVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, z.a aVar, boolean z7) {
                super(1);
                this.this$0 = sVar;
                this.$allowLyricSticker = z;
                this.$allowDonation = z2;
                this.$allowLiveCD = z3;
                this.$allowPollSticker = z4;
                this.$allowMentionHashTag = z5;
                this.$allowDuetSticker = z6;
                this.$allowCommentPanelSticker = aVar;
                this.$allowQaSticker = z7;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
                if (com.ss.android.ugc.aweme.port.in.g.a().A().a() != false) goto L_0x0013;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
                if (com.ss.android.ugc.aweme.infoSticker.h.e(r5) != false) goto L_0x0013;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
                if (r4.$allowDuetSticker == false) goto L_0x0092;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
                if (com.ss.android.ugc.aweme.infoSticker.h.i(r5) != false) goto L_0x0013;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
                if (r4.$allowCommentPanelSticker.element != false) goto L_0x00a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
                if (com.ss.android.ugc.aweme.infoSticker.h.c(r5) == false) goto L_0x00a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
                if (r4.$allowQaSticker != false) goto L_0x0014;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b0, code lost:
                if (com.ss.android.ugc.aweme.infoSticker.h.b(r5) == false) goto L_0x0014;
             */
            @Override // h.f.a.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Boolean invoke(com.ss.android.ugc.effectmanager.effect.model.Effect r5) {
                /*
                // Method dump skipped, instructions count: 180
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.panel.c.s.b.invoke(java.lang.Object):java.lang.Object");
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.infoSticker.g gVar) {
        h.f.b.l.d(gVar, "");
        this.f146720h = gVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.k, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.k kVar) {
            boolean z;
            T t;
            com.bytedance.jedi.arch.k kVar2 = kVar;
            c cVar = this.this$0;
            if (kVar2 == null || (t = kVar2.f39404b) == null) {
                z = false;
            } else {
                z = t.booleanValue();
            }
            cVar.f146716d = z;
            return h.z.f158842a;
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146730a;

        static {
            Covode.recordClassIndex(96614);
        }

        k(c cVar) {
            this.f146730a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.p pVar = (h.p) obj;
            if (((Boolean) pVar.getSecond()).booleanValue()) {
                EditStickerPanelViewModel a2 = this.f146730a.a();
                ProviderEffect providerEffect = (ProviderEffect) pVar.getFirst();
                h.f.b.l.d(providerEffect, "");
                Effect a3 = com.ss.android.ugc.aweme.infoSticker.f.a(providerEffect);
                h.f.b.l.b(a3, "");
                a2.a(a3, (String) null);
                return;
            }
            j.a.a(this.f146730a.r(), (int) R.string.bpc, 0).a();
        }
    }

    public final void d(int i2) {
        if (this.f146717e > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f146717e;
            this.f146717e = -1;
            if (currentTimeMillis > 0) {
                com.ss.android.ugc.aweme.utils.d.a("tool_performance_enter_sticker_tab", bl.l(D()).a("duration", currentTimeMillis).a("status", String.valueOf(i2)).f149193a);
            }
        }
    }

    static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146735a;

        static {
            Covode.recordClassIndex(96617);
        }

        n(c cVar) {
            this.f146735a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c cVar = this.f146735a;
            com.ss.android.ugc.tools.f.b a2 = bl.l(cVar.D()).a("scene_id", 1002).a("creation_id", cVar.D().creationId).a("shoot_way", cVar.D().mShootWay).a("tab_name", ((f.a) ((h.p) obj).component1()).f149606b).a("enter_from", "video_edit_page");
            if (cVar.D().draftId != 0) {
                a2.a("draft_id", cVar.D().draftId);
            }
            String str = cVar.D().newDraftId;
            h.f.b.l.b(str, "");
            if (str.length() > 0) {
                a2.a("new_draft_id", cVar.D().newDraftId);
            }
            com.ss.android.ugc.aweme.utils.d.a("click_prop_tab", a2.f149193a);
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146723a;

        static {
            Covode.recordClassIndex(96600);
        }

        f(c cVar) {
            this.f146723a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String valueOf;
            h.p pVar = (h.p) obj;
            if (((Boolean) pVar.getSecond()).booleanValue()) {
                EditStickerPanelViewModel a2 = this.f146723a.a();
                Effect effect = (Effect) pVar.getFirst();
                h.f.b.l.d(effect, "");
                if (effect.getTags().contains("weather")) {
                    return;
                }
                if (com.ss.android.ugc.aweme.infoSticker.h.g(effect)) {
                    a2.c(new EditStickerPanelViewModel.a(effect));
                    return;
                }
                if (!effect.getTags().contains("weather")) {
                    if (effect.getTags().contains("time") || effect.getTags().contains("date")) {
                        valueOf = String.valueOf(System.currentTimeMillis() / 1000);
                        a2.a(effect, valueOf);
                        return;
                    } else if (com.ss.android.ugc.aweme.infoSticker.h.g(effect)) {
                    }
                }
                valueOf = null;
                a2.a(effect, valueOf);
                return;
            }
            j.a.a(this.f146723a.r(), (int) R.string.bpc, 0).a();
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.view.a.c f146732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.view.a.a f146733c;

        static {
            Covode.recordClassIndex(96615);
        }

        l(c cVar, com.ss.android.ugc.tools.view.a.c cVar2, com.ss.android.ugc.tools.view.a.a aVar) {
            this.f146731a = cVar;
            this.f146732b = cVar2;
            this.f146733c = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                c cVar = this.f146731a;
                com.ss.android.ugc.tools.f.b a2 = bl.l(cVar.D()).a("scene_id", 1002).a("creation_id", cVar.D().creationId).a("shoot_way", cVar.D().mShootWay).a("enter_from", "video_edit_page").a("content_type", cVar.D().getAvetParameter().getContentType()).a("content_source", cVar.D().getAvetParameter().getContentSource()).a("is_multi_content", bl.k(cVar.D())).a("enter_method", cVar.f146715c).a("from_group_id", dv.a());
                if (cVar.D().draftId != 0) {
                    a2.a("draft_id", cVar.D().draftId);
                }
                if (!TextUtils.isEmpty(cVar.D().newDraftId)) {
                    a2.a("new_draft_id", cVar.D().newDraftId);
                }
                com.ss.android.ugc.aweme.utils.d.a("click_prop_entrance", a2.f149193a);
            }
            if (bool.booleanValue()) {
                com.ss.android.ugc.tools.view.a.c cVar2 = this.f146732b;
                if (cVar2 != null) {
                    cVar2.b(this.f146733c);
                }
                com.ss.android.ugc.aweme.infoSticker.g gVar = this.f146731a.f146720h;
                if (gVar != null) {
                    gVar.L();
                    return;
                }
                return;
            }
            com.ss.android.ugc.tools.view.a.c cVar3 = this.f146732b;
            if (cVar3 != null) {
                cVar3.c(this.f146733c);
            }
            com.ss.android.ugc.aweme.infoSticker.g gVar2 = this.f146731a.f146720h;
            if (gVar2 != null) {
                gVar2.M();
            }
        }
    }

    static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146734a;

        static {
            Covode.recordClassIndex(96616);
        }

        m(c cVar) {
            this.f146734a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            h.p pVar = (h.p) obj;
            if (((Boolean) pVar.getFirst()).booleanValue()) {
                c cVar = this.f146734a;
                String str = (String) pVar.getSecond();
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = null;
                if (z) {
                    Context r = cVar.r();
                    if (r != null) {
                        str2 = r.getString(R.string.fii);
                    }
                } else {
                    Context r2 = cVar.r();
                    if (r2 != null) {
                        str2 = r2.getString(R.string.fih);
                    }
                }
                com.ss.android.ugc.aweme.port.in.g.a().I().a("sticker_search_keyword", bl.l(cVar.D()).a("creation_id", cVar.D().creationId).a("shoot_way", cVar.D().mShootWay).a("content_source", cVar.D().getAvetParameter().getContentSource()).a("content_type", cVar.D().getAvetParameter().getContentType()).a("enter_from", "video_edit_page").a("tab_name", str2).f149193a);
            }
        }
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.x = fVar;
        h.k.c a2 = h.f.b.ab.a(EditStickerPanelViewModel.class);
        this.f146714a = h.i.a((h.f.a.a) new a(this, a2, a2));
        h.k.c a3 = h.f.b.ab.a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
        this.f146722l = h.i.a((h.f.a.a) new b(this, a3, a3));
        h.k.c a4 = h.f.b.ab.a(EditCommentStickerViewModel.class);
        this.t = h.i.a((h.f.a.a) new C3932c(this, a4, a4));
        h.k.c a5 = h.f.b.ab.a(EditPageQaStickerViewModel.class);
        this.u = h.i.a((h.f.a.a) new d(this, a5, a5));
        this.f146717e = -1;
        this.v = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
        this.f146718f = h.i.a((h.f.a.a) new s(this));
        this.w = h.i.a((h.f.a.a) new r(this));
        this.f146719g = new LinkedHashSet();
        this.f146721i = new f.a.b.a();
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        if (!(activity instanceof com.ss.android.ugc.tools.view.a.c)) {
            activity = null;
        }
        q qVar = new q(this);
        this.f146721i.a(E().e().a(new f(this), com.ss.android.ugc.tools.utils.p.f150012a));
        this.f146721i.a(E().f().a(new k(this), com.ss.android.ugc.tools.utils.p.f150012a));
        this.f146721i.a(E().c().a(new l(this, (com.ss.android.ugc.tools.view.a.c) activity, qVar), com.ss.android.ugc.tools.utils.p.f150012a));
        this.f146721i.a(E().g().a(new m(this), com.ss.android.ugc.tools.utils.p.f150012a));
        this.f146721i.a(E().d().a(new n(this), com.ss.android.ugc.tools.utils.p.f150012a));
        this.f146721i.a(E().h().a(new o(this), com.ss.android.ugc.tools.utils.p.f150012a));
        EditCommentStickerViewModel d2 = d();
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        f.a.b.b unused = d2.b((androidx.fragment.app.e) activity2, h.f146746a, new ah(), new p(this));
        b.a.b(this, a(), i.f146747a, new g(this));
        b.a.b(this, a(), e.f146743a, new h(this));
        b.a.b(this, a(), f.f146744a, new i(this));
        b.a.b(this, a(), g.f146745a, new j(this));
    }

    static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146736a;

        static {
            Covode.recordClassIndex(96618);
        }

        o(c cVar) {
            this.f146736a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Effect effect;
            int i2;
            Effect effect2;
            int i3;
            List<ProviderEffect> list;
            ProviderEffect providerEffect;
            int i4;
            com.ss.android.ugc.tools.infosticker.view.a.i iVar;
            com.ss.android.ugc.tools.infosticker.view.a.g gVar = (com.ss.android.ugc.tools.infosticker.view.a.g) obj;
            int i5 = d.f146742b[gVar.f149516a.ordinal()];
            if (i5 == 1) {
                com.ss.android.ugc.tools.infosticker.view.a.j jVar = gVar.f149517b;
                if (jVar != null && jVar == com.ss.android.ugc.tools.infosticker.view.a.j.MAIN) {
                    c cVar = this.f146736a;
                    List<Effect> list2 = gVar.f149518c;
                    if (!(list2 == null || list2.isEmpty())) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : list2) {
                            if (!cVar.f146719g.contains(t.getEffectId())) {
                                arrayList.add(t);
                            }
                        }
                        int i6 = 0;
                        for (T t2 : arrayList) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                h.a.n.a();
                            }
                            T t3 = t2;
                            String effectId = t3.getEffectId();
                            com.ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse = (com.ss.ugc.effectplatform.model.EffectCategoryResponse) com.ss.android.ugc.tools.infosticker.a.b.n.b().a((Effect) t3);
                            if (effectCategoryResponse == null || (str = effectCategoryResponse.getId()) == null) {
                                str = "";
                            }
                            com.ss.android.ugc.tools.f.b a2 = bl.l(cVar.D()).a("scene_id", 1002).a("prop_id", effectId).a("prop_index", t3.getGradeKey()).a("enter_method", "click_main_panel").a("creation_id", cVar.D().creationId).a("shoot_way", cVar.D().mShootWay).a("enter_from", "video_edit_page").a("category_name", "sticker").a("tab_id", str).a("is_giphy", 0).a("impr_position", i6);
                            if (cVar.D().draftId != 0) {
                                a2.a("draft_id", cVar.D().draftId);
                            }
                            String str2 = cVar.D().newDraftId;
                            h.f.b.l.b(str2, "");
                            if (str2.length() > 0) {
                                a2.a("new_draft_id", cVar.D().newDraftId);
                            }
                            com.ss.android.ugc.aweme.utils.d.a("prop_show", a2.f149193a);
                            cVar.f146719g.add(effectId);
                            i6 = i7;
                        }
                    }
                }
            } else if (i5 == 2) {
                EffectCategoryResponse effectCategoryResponse2 = gVar.f149522g;
                if (effectCategoryResponse2 != null) {
                    VideoPublishEditModel D = this.f146736a.D();
                    String id = effectCategoryResponse2.getId();
                    h.f.b.l.d(D, "");
                    h.f.b.l.d("sticker", "");
                    h.f.b.l.d(id, "");
                    com.ss.android.ugc.aweme.utils.d.a("click_infosticker_tab", new com.ss.android.ugc.tools.f.b().a("shoot_way", D.mShootWay).a("creation_id", D.creationId).a("content_type", es.c(D)).a("content_source", es.a(D)).a("enter_from", "video_edit_page").a("category_name", "sticker").a("tab_id", id).f149193a);
                }
            } else if (i5 == 3) {
                com.ss.android.ugc.tools.infosticker.view.a.j jVar2 = gVar.f149517b;
                if (jVar2 != null) {
                    int i8 = d.f146741a[jVar2.ordinal()];
                    if (i8 == 1) {
                        List<Effect> list3 = gVar.f149518c;
                        if (!(list3 == null || (effect = (Effect) h.a.n.h((List) list3)) == null)) {
                            c cVar2 = this.f146736a;
                            Integer num = gVar.f149523h;
                            if (num != null) {
                                i2 = num.intValue();
                            } else {
                                i2 = 0;
                            }
                            cVar2.a(effect, "sticker", i2);
                        }
                    } else if (i8 == 2) {
                        List<Effect> list4 = gVar.f149518c;
                        if (!(list4 == null || (effect2 = (Effect) h.a.n.h((List) list4)) == null)) {
                            c cVar3 = this.f146736a;
                            Integer num2 = gVar.f149523h;
                            if (num2 != null) {
                                i3 = num2.intValue();
                            } else {
                                i3 = 0;
                            }
                            cVar3.a(effect2, "emoji", i3);
                        }
                    } else if (i8 == 3 && (list = gVar.f149519d) != null && (providerEffect = (ProviderEffect) h.a.n.h((List) list)) != null) {
                        c cVar4 = this.f146736a;
                        String str3 = gVar.f149525j;
                        Integer num3 = gVar.f149523h;
                        if (num3 != null) {
                            i4 = num3.intValue();
                        } else {
                            i4 = 0;
                        }
                        cVar4.a(providerEffect, str3, i4);
                        this.f146736a.a();
                        h.f.b.l.d(providerEffect, "");
                        h.f.b.l.d(providerEffect, "");
                        String clickUrl = providerEffect.getClickUrl();
                        if (clickUrl == null) {
                            return;
                        }
                        if (com.ss.android.ugc.aweme.effect.x.a()) {
                            ((CallbackAPI) com.ss.android.ugc.aweme.port.in.g.a().C().retrofitCreate(clickUrl, CallbackAPI.class)).sendCallback(clickUrl).b(f.a.h.a.b(f.a.k.a.f158006c)).a(v.a.f88983a, v.b.f88984a, v.c.f88985a);
                            return;
                        }
                        Request.Builder builder = new Request.Builder();
                        builder.get().url(clickUrl);
                        new OkHttpClient().newBuilder().build().newCall(builder.build()).enqueue(new v.d());
                    }
                }
            } else if (i5 == 4 && (iVar = gVar.n) != null && gVar.f149517b == com.ss.android.ugc.tools.infosticker.view.a.j.MAIN) {
                this.f146736a.d(iVar.ordinal());
            }
        }
    }

    static final class q implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146737a;

        static {
            Covode.recordClassIndex(96620);
        }

        q(c cVar) {
            this.f146737a = cVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            this.f146737a.a().a((a) false, (boolean) "click_button");
            return true;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            j.a.a(this.this$0.r(), (int) R.string.z7, 0).a();
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.at2, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            com.bytedance.jedi.arch.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar2, "");
            bVar2.withState(this.this$0.a(), new h.f.a.b<EditStickerPanelState, h.z>(this) {
                /* class com.ss.android.ugc.gamora.editor.sticker.panel.c.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(96602);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(EditStickerPanelState editStickerPanelState) {
                    EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
                    h.f.b.l.d(editStickerPanelState2, "");
                    String enterMethod = editStickerPanelState2.getEnterMethod();
                    if (enterMethod == null) {
                        return null;
                    }
                    this.this$0.this$0.f146715c = enterMethod;
                    return h.z.f158842a;
                }
            });
            if (booleanValue) {
                this.this$0.E().a();
                this.this$0.f146717e = System.currentTimeMillis();
            } else {
                this.this$0.E().b();
            }
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends Effect, ? extends String>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.p<? extends Effect, ? extends String> pVar) {
            InteractStickerStruct c2;
            QaStruct qaStruct;
            final h.p<? extends Effect, ? extends String> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            final Effect effect = (Effect) pVar2.getFirst();
            AVServiceImpl.a().setLastStickerId(this.this$0.f42913m, effect.getEffectId(), 5);
            if (com.ss.android.ugc.aweme.infoSticker.h.d(effect)) {
                com.ss.android.ugc.aweme.common.r.a("click_video_at", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "video_edit_page").a("enter_method", "sticker").f66730a);
            }
            if (com.ss.android.ugc.aweme.infoSticker.h.b(effect) && this.this$0.f146716d) {
                this.this$0.b().a(1);
                Context r = this.this$0.r();
                if (r == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(r, "");
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a.C1094a.a(r).a(R.string.f6q).b(R.string.f6l), new h.f.a.b<com.bytedance.tux.dialog.b.b, h.z>(this) {
                    /* class com.ss.android.ugc.gamora.editor.sticker.panel.c.h.AnonymousClass1 */
                    final /* synthetic */ int $commentToQa = 1;
                    final /* synthetic */ h this$0;

                    static {
                        Covode.recordClassIndex(96604);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
                        com.bytedance.tux.dialog.b.b bVar2 = bVar;
                        h.f.b.l.d(bVar2, "");
                        bVar2.a(R.string.f6o, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                            /* class com.ss.android.ugc.gamora.editor.sticker.panel.c.h.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f146724a;

                            static {
                                Covode.recordClassIndex(96605);
                            }

                            /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$h$1$1$a */
                            static final class a implements Runnable {

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ AnonymousClass1 f146725a;

                                static {
                                    Covode.recordClassIndex(96606);
                                }

                                a(AnonymousClass1 r1) {
                                    this.f146725a = r1;
                                }

                                public final void run() {
                                    this.f146725a.f146724a.this$0.this$0.E().b();
                                    this.f146725a.f146724a.this$0.this$0.d().g();
                                    this.f146725a.f146724a.this$0.this$0.b().a("replace", this.f146725a.f146724a.$commentToQa);
                                    com.ss.android.ugc.aweme.infoSticker.g gVar = this.f146725a.f146724a.this$0.this$0.f146720h;
                                    if (gVar != null) {
                                        gVar.a(effect, (String) pVar2.getSecond());
                                    }
                                }
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f146724a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                h.f.b.l.d(aVar, "");
                                com.bytedance.scene.ktx.c.a(this.f146724a.this$0.this$0, new a(this), 200);
                                return h.z.f158842a;
                            }
                        });
                        bVar2.b(R.string.a9e, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                            /* class com.ss.android.ugc.gamora.editor.sticker.panel.c.h.AnonymousClass1.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f146726a;

                            static {
                                Covode.recordClassIndex(96607);
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f146726a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                h.f.b.l.d(aVar, "");
                                this.f146726a.this$0.this$0.b().a("cancel", this.f146726a.$commentToQa);
                                return h.z.f158842a;
                            }
                        });
                        return h.z.f158842a;
                    }
                }).a().b().show();
            } else if (com.ss.android.ugc.aweme.infoSticker.h.b(effect) && (c2 = this.this$0.C().k().d().c()) != null && (qaStruct = c2.getQaStruct()) != null && qaStruct.getQuestionId() != 0) {
                this.this$0.b().a(3);
                Context r2 = this.this$0.r();
                if (r2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(r2, "");
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a.C1094a.a(r2).a(R.string.f6q).b(R.string.f6l), new h.f.a.b<com.bytedance.tux.dialog.b.b, h.z>(this) {
                    /* class com.ss.android.ugc.gamora.editor.sticker.panel.c.h.AnonymousClass2 */
                    final /* synthetic */ int $qaToQa = 3;
                    final /* synthetic */ h this$0;

                    static {
                        Covode.recordClassIndex(96608);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
                        com.bytedance.tux.dialog.b.b bVar2 = bVar;
                        h.f.b.l.d(bVar2, "");
                        bVar2.a(R.string.f6o, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                            /* class com.ss.android.ugc.gamora.editor.sticker.panel.c.h.AnonymousClass2.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass2 f146727a;

                            static {
                                Covode.recordClassIndex(96609);
                            }

                            /* renamed from: com.ss.android.ugc.gamora.editor.sticker.panel.c$h$2$1$a */
                            static final class a implements Runnable {

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ AnonymousClass1 f146728a;

                                static {
                                    Covode.recordClassIndex(96610);
                                }

                                a(AnonymousClass1 r1) {
                                    this.f146728a = r1;
                                }

                                public final void run() {
                                    this.f146728a.f146727a.this$0.this$0.E().b();
                                    this.f146728a.f146727a.this$0.this$0.C().k().d().d();
                                    this.f146728a.f146727a.this$0.this$0.b().a("replace", this.f146728a.f146727a.$qaToQa);
                                    com.ss.android.ugc.aweme.infoSticker.g gVar = this.f146728a.f146727a.this$0.this$0.f146720h;
                                    if (gVar != null) {
                                        gVar.a(effect, (String) pVar2.getSecond());
                                    }
                                }
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f146727a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                h.f.b.l.d(aVar, "");
                                com.bytedance.scene.ktx.c.a(this.f146727a.this$0.this$0, new a(this), 200);
                                return h.z.f158842a;
                            }
                        });
                        bVar2.b(R.string.a9e, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                            /* class com.ss.android.ugc.gamora.editor.sticker.panel.c.h.AnonymousClass2.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass2 f146729a;

                            static {
                                Covode.recordClassIndex(96611);
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f146729a = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                h.f.b.l.d(aVar, "");
                                this.f146729a.this$0.this$0.b().a("cancel", this.f146729a.$qaToQa);
                                return h.z.f158842a;
                            }
                        });
                        return h.z.f158842a;
                    }
                }).a().b().show();
            } else if (com.ss.android.ugc.aweme.infoSticker.h.f(effect)) {
                com.ss.android.ugc.aweme.infoSticker.g gVar = this.this$0.f146720h;
                if (gVar != null) {
                    gVar.a(effect, (String) pVar2.getSecond());
                }
            } else {
                this.this$0.E().b();
                com.ss.android.ugc.aweme.infoSticker.g gVar2 = this.this$0.f146720h;
                if (gVar2 != null) {
                    gVar2.a(effect, (String) pVar2.getSecond());
                }
            }
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends Effect, ? extends String>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.p<? extends Effect, ? extends String> pVar) {
            h.p<? extends Effect, ? extends String> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            String str = this.this$0.D().mShootWay;
            String a2 = es.a(this.this$0.D());
            String c2 = es.c(this.this$0.D());
            com.ss.android.ugc.aweme.common.r.a("click_diy_prop_entrance", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("shoot_way", str).a("content_source", a2).a("content_type", c2).a("creation_id", this.this$0.D().creationId).f149193a);
            Activity activity = this.this$0.f42913m;
            Effect effect = (Effect) pVar2.getFirst();
            ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(this.this$0.D().mShootWay, es.a(this.this$0.D()), es.c(this.this$0.D()), this.this$0.D().creationId);
            h.f.b.l.d(effect, "");
            com.facebook.imagepipeline.e.h e2 = com.facebook.imagepipeline.e.k.a().e();
            h.f.b.l.b(e2, "");
            e2.f47836a.a(e.a.f104678a);
            if (activity != null) {
                h.f.b.l.d(effect, "");
                CustomStickerExtra customStickerExtra = (CustomStickerExtra) com.ss.android.ugc.aweme.port.in.g.a().G().a(effect.getExtra(), CustomStickerExtra.class);
                Bundle bundle = new Bundle();
                bundle.putInt("key_choose_scene", 10);
                bundle.putParcelable("key_custom_effect_sticker", effect);
                bundle.putInt("key_photo_select_min_count", 1);
                bundle.putInt("key_photo_select_max_count", 1);
                bundle.putInt("key_video_select_min_count", 0);
                bundle.putInt("key_max_gif_size", customStickerExtra.getGifSizeLimit());
                bundle.putInt("key_max_compress_width", customStickerExtra.getUploadWidthLimit());
                bundle.putInt("key_max_compress_height", customStickerExtra.getUploadHeightLimit());
                bundle.putInt("key_support_flag", 1);
                bundle.putString("shoot_way", shortVideoCommonParams.shootWay);
                bundle.putString("content_source", shortVideoCommonParams.contentSource);
                bundle.putString("content_type", shortVideoCommonParams.contentType);
                bundle.putString("creation_id", shortVideoCommonParams.creationId);
                com.ss.android.ugc.aweme.shortvideo.r.a.a().a(activity, bundle, 10004, 10004);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void a(Effect effect, String str, int i2) {
        String str2;
        String effectId = effect.getEffectId();
        com.ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse = (com.ss.ugc.effectplatform.model.EffectCategoryResponse) com.ss.android.ugc.tools.infosticker.a.b.n.b().a(effectId);
        if (effectCategoryResponse == null || (str2 = effectCategoryResponse.getId()) == null) {
            str2 = "";
        }
        com.ss.android.ugc.tools.f.b a2 = bl.l(D()).a("scene_id", 1002).a("tab_name", (String) null).a("prop_id", effectId).a("prop_index", effect.getGradeKey()).a("enter_method", "click_main_panel").a("creation_id", D().creationId).a("shoot_way", D().mShootWay).a("enter_from", "video_edit_page").a("category_name", str).a("tab_id", str2).a("is_giphy", 0).a("impr_position", i2);
        if (D().draftId != 0) {
            a2.a("draft_id", D().draftId);
        }
        String str3 = D().newDraftId;
        h.f.b.l.b(str3, "");
        if (str3.length() > 0) {
            a2.a("new_draft_id", D().newDraftId);
        }
        com.ss.android.ugc.aweme.utils.d.a("prop_click", a2.f149193a);
    }

    public final void a(ProviderEffect providerEffect, String str, int i2) {
        boolean z;
        String str2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        String str3 = null;
        if (z2) {
            Context r2 = r();
            if (r2 != null) {
                str3 = r2.getString(R.string.fih);
            }
        } else {
            Context r3 = r();
            if (r3 != null) {
                str3 = r3.getString(R.string.fii);
            }
        }
        com.ss.android.ugc.tools.f.b a2 = bl.l(D()).a("scene_id", 1002).a("tab_name", str3).a("prop_id", providerEffect.getId()).a("enter_method", "click_main_panel").a("creation_id", D().creationId).a("shoot_way", D().mShootWay).a("enter_from", "video_edit_page").a("impr_position", i2);
        if (z2) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        com.ss.android.ugc.tools.f.b a3 = a2.a("after_search", str2).a("category_name", "sticker").a("tab_id", "giphy").a("is_giphy", 1);
        if (D().draftId != 0) {
            a3.a("draft_id", D().draftId);
        }
        String str4 = D().newDraftId;
        h.f.b.l.b(str4, "");
        if (str4.length() > 0) {
            a3.a("new_draft_id", D().newDraftId);
        }
        com.ss.android.ugc.aweme.utils.d.a("prop_click", a3.f149193a);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
