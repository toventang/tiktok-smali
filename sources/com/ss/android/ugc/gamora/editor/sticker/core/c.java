package com.ss.android.ugc.gamora.editor.sticker.core;

import android.app.Activity;
import android.content.ClipboardManager;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.h;
import com.bytedance.keva.Keva;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.view.i;
import com.ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.property.cv;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.view.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.duet.EditDuetStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.livecd.EditLiveCDStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.poll.EditPollStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextApi;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public class c extends com.bytedance.scene.group.b implements com.bytedance.jedi.arch.b, com.bytedance.o.a, com.ss.android.ugc.aweme.infoSticker.g, com.ss.android.ugc.gamora.editor.sticker.a {
    public static final l P = new l((byte) 0);
    public FrameLayout A;
    public FrameLayout B;
    public FrameLayout C;
    public FrameLayout D;
    public FrameLayout E;
    public FrameLayout F;
    public dmt.av.video.y G;
    public InfoStickerViewModel H;
    public ReadTextViewModel I;
    public boolean J;
    public com.ss.android.ugc.gamora.editor.ab K;
    public com.ss.android.ugc.aweme.view.b L;
    public com.ss.android.ugc.aweme.editSticker.text.als.a M;
    public com.ss.android.ugc.aweme.editSticker.text.view.q N;
    public final com.bytedance.o.f O;
    private final h.h Q;
    private final h.h R;
    private final h.h S;
    private final h.h T;
    private final h.h U;
    private final h.h V;
    private List<InteractStickerStruct> W;
    private final h.h X;
    private boolean Y;
    private final SafeHandler Z;
    private final h.h aa;
    private final h.h ab;
    private boolean ac;
    private boolean ad;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f146423b = h.i.a(h.m.NONE, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.h f146424c = h.i.a((h.f.a.a) new bp(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f146425d = h.i.a((h.f.a.a) new bz(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f146426e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f146427f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.f.a.a.j f146428g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.interact.e f146429h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.gamora.editor.sticker.donation.h f146430i;

    /* renamed from: j  reason: collision with root package name */
    final h.h f146431j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.gamora.editor.aa f146432k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.interact.hit.b f146433l;
    public com.ss.android.ugc.gamora.editor.o t;
    public com.ss.android.ugc.gamora.editor.l u;
    public com.ss.android.ugc.gamora.editor.subtitle.b v;
    public EditDonationStickerViewModel w;
    public EditTextStickerViewModel x;
    public EditToolbarViewModel y;
    public FrameLayout z;

    static {
        Covode.recordClassIndex(96288);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a H() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146423b.getValue();
    }

    /* access modifiers changed from: package-private */
    public final VideoPublishEditModel I() {
        return (VideoPublishEditModel) this.f146424c.getValue();
    }

    public final CommentAndQuestionAndQuestionStickerPanelViewModel J() {
        return (CommentAndQuestionAndQuestionStickerPanelViewModel) this.f146426e.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.multiedit.a P() {
        return (com.ss.android.ugc.gamora.editor.multiedit.a) this.f146427f.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.poll.a Q() {
        return (com.ss.android.ugc.gamora.editor.sticker.poll.a) this.Q.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.livecd.a R() {
        return (com.ss.android.ugc.gamora.editor.sticker.livecd.a) this.R.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.duet.a S() {
        return (com.ss.android.ugc.gamora.editor.sticker.duet.a) this.S.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.read.a.b T() {
        return (com.ss.android.ugc.gamora.editor.sticker.read.a.b) this.T.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.qa.a U() {
        return (com.ss.android.ugc.gamora.editor.sticker.qa.a) this.U.getValue();
    }

    /* access modifiers changed from: package-private */
    public final EditStickerViewModel V() {
        return (EditStickerViewModel) this.V.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.read.d X() {
        return (com.ss.android.ugc.gamora.editor.sticker.read.d) this.X.getValue();
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.gamora.editor.sticker.info.a Z() {
        return (com.ss.android.ugc.gamora.editor.sticker.info.a) this.aa.getValue();
    }

    public final com.ss.android.ugc.aweme.editSticker.text.view.i aa() {
        return (com.ss.android.ugc.aweme.editSticker.text.view.i) this.ab.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class bm implements com.ss.android.ugc.aweme.editSticker.text.c.d {
        static {
            Covode.recordClassIndex(96330);
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

        bm() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final PointF a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, float f2, float f3) {
            h.f.b.l.d(qVar, "");
            return new PointF();
        }
    }

    public static final class l {
        static {
            Covode.recordClassIndex(96359);
        }

        private l() {
        }

        public /* synthetic */ l(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final n f146468a = new n();

        static {
            Covode.recordClassIndex(96361);
        }

        n() {
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Object call() {
            return h.a.z.INSTANCE;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public final void a(com.ss.android.ugc.gamora.editor.ab abVar) {
        h.f.b.l.d(abVar, "");
        this.K = abVar;
    }

    public final void a(boolean z2) {
        com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
        if (aaVar != null) {
            aaVar.b(z2);
        }
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
        if (hVar != null) {
            hVar.b(z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.app.Activity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.aweme.infoSticker.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.effectmanager.effect.model.Effect r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 793
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String):void");
    }

    public static final class bh implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146444a;

        static {
            Covode.recordClassIndex(96324);
        }

        static final class a extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ bh this$0;

            static {
                Covode.recordClassIndex(96325);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(bh bhVar) {
                super(0);
                this.this$0 = bhVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                a();
                return h.z.f158842a;
            }

            public final void a() {
                View currentFocus;
                Object obj;
                c.b(this.this$0.f146444a).f88315a = true;
                Activity activity = this.this$0.f146444a.f42913m;
                if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
                    Activity t = this.this$0.f146444a.t();
                    Boolean bool = null;
                    if (t != null) {
                        obj = a(t, "input_method");
                    } else {
                        obj = null;
                    }
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager = (InputMethodManager) obj;
                    if (inputMethodManager != null) {
                        h.f.b.l.b(currentFocus, "");
                        bool = Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2));
                    }
                    bool.booleanValue();
                }
                com.ss.android.ugc.gamora.editor.sticker.read.j.a(new ShortVideoCommonParams(this.this$0.f146444a.I().mShootWay, es.a(this.this$0.f146444a.I()), es.c(this.this$0.f146444a.I()), this.this$0.f146444a.I().creationId), "manual", "text_edit_panel");
            }

            private static Object a(Activity activity, String str) {
                Object obj;
                MethodCollector.i(3043);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                        try {
                            new com.bytedance.platform.godzilla.b.b.b().a();
                            com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                            obj = activity.getSystemService(str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = activity.getSystemService(str);
                } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = activity.getSystemService(str);
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                try {
                                    Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                    declaredField.setAccessible(true);
                                    declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                } catch (Exception e2) {
                                    com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                                }
                            }
                            com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                        } finally {
                            MethodCollector.o(3043);
                        }
                    }
                } else {
                    obj = activity.getSystemService(str);
                }
                return obj;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bh(c cVar) {
            this.f146444a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.view.i.a
        public final void a(String str, com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            TextStickerData textStickerData;
            h.f.b.l.d(str, "");
            a aVar = new a(this);
            new com.ss.android.ugc.aweme.editSticker.interact.g().a(true);
            if (((qVar != null && (textStickerData = qVar.getData()) != null) || (textStickerData = c.b(this.f146444a).f88317c) != null) && textStickerData.getHasReadTextAudio()) {
                aVar.a();
            } else if (qVar == null) {
                if (!com.ss.android.ugc.gamora.editor.sticker.read.k.b() || this.f146444a.T().b()) {
                    aVar.a();
                } else if (!com.ss.android.ugc.gamora.editor.sticker.read.i.a(str)) {
                    Activity activity = this.f146444a.f42913m;
                    if (activity != null) {
                        h.f.b.l.b(activity, "");
                        new com.bytedance.tux.g.b(activity).e(R.string.ayi).b();
                    }
                } else {
                    com.ss.android.ugc.gamora.editor.sticker.read.j.a(new ShortVideoCommonParams(this.f146444a.I().mShootWay, es.a(this.f146444a.I()), es.c(this.f146444a.I()), this.f146444a.I().creationId), "auto", "text_edit_panel");
                    com.ss.android.ugc.aweme.editSticker.text.als.a aVar2 = this.f146444a.M;
                    if (aVar2 != null) {
                        aVar2.f();
                    }
                    com.ss.android.ugc.aweme.editSticker.text.als.a aVar3 = this.f146444a.M;
                    if (aVar3 != null) {
                        aVar3.h();
                    }
                }
            } else if (!com.ss.android.ugc.gamora.editor.sticker.read.k.b()) {
                aVar.a();
            } else if (qVar.getData() == null) {
            } else {
                if (!com.ss.android.ugc.gamora.editor.sticker.read.i.a(str)) {
                    Activity activity2 = this.f146444a.f42913m;
                    if (activity2 != null) {
                        h.f.b.l.b(activity2, "");
                        new com.bytedance.tux.g.b(activity2).e(R.string.ayi).b();
                        return;
                    }
                    return;
                }
                EditTextStickerViewModel b2 = c.b(this.f146444a);
                TextStickerData data = qVar.getData();
                if (data == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(data, "");
                b2.a(data, str);
            }
        }
    }

    public final void ah() {
        Z().e();
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public com.bytedance.jedi.arch.ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96289);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.poll.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.poll.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.poll.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.poll.a> r1 = com.ss.android.ugc.gamora.editor.sticker.poll.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.b.invoke():com.bytedance.als.b");
        }
    }

    public static final class bn implements com.ss.android.ugc.aweme.editSticker.d.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146446a;

        static {
            Covode.recordClassIndex(96331);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void a() {
            com.ss.android.ugc.aweme.shortvideo.edit.bl.a(this.f146446a.I(), "click_text");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void b() {
            VideoPublishEditModel I = this.f146446a.I();
            h.f.b.l.d(I, "");
            com.ss.android.ugc.aweme.common.r.a("text_time_set", com.ss.android.ugc.aweme.shortvideo.edit.bl.a(I, false, false, 6).f149193a);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void c() {
            VideoPublishEditModel I = this.f146446a.I();
            h.f.b.l.d(I, "");
            com.ss.android.ugc.aweme.common.r.a("text_more_click", com.ss.android.ugc.aweme.shortvideo.edit.bl.a(I, false, false, 6).f149193a);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void d() {
            VideoPublishEditModel I = this.f146446a.I();
            h.f.b.l.d(I, "");
            com.ss.android.ugc.aweme.common.r.a("long_video_edit_text_guide_show", new com.ss.android.ugc.tools.f.b().a("creation_id", I.creationId).a("creation_duration", I.getPreviewInfo().getPreviewVideoLength()).f149193a);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void e() {
            VideoPublishEditModel I = this.f146446a.I();
            h.f.b.l.d(I, "");
            com.ss.android.ugc.aweme.common.r.a("text_to_question_sticker", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("creation_id", I.creationId).a("enter_method", "click_text").a("shoot_way", I.mShootWay).a("shoot_entrance", I.mShootWay).f149193a);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void f() {
            VideoPublishEditModel I = this.f146446a.I();
            h.f.b.l.d(I, "");
            com.ss.android.ugc.aweme.common.r.a("question_prompt_show", new com.ss.android.ugc.tools.f.b().a("creation_id", I.creationId).a("shoot_way", I.mShootWay).a("user_id", com.ss.android.ugc.aweme.port.in.g.a().A().c()).f149193a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bn(c cVar) {
            this.f146446a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.d.e
        public final void a(int i2, String str) {
            h.f.b.l.d(str, "");
            com.ss.android.ugc.aweme.shortvideo.edit.bl.a(this.f146446a.I(), "move_to_top", 0, i2, str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.c$c  reason: collision with other inner class name */
    public static final class C3919c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.livecd.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3919c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.livecd.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.livecd.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.livecd.a> r1 = com.ss.android.ugc.gamora.editor.sticker.livecd.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.C3919c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.duet.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.duet.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.duet.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.duet.a> r1 = com.ss.android.ugc.gamora.editor.sticker.duet.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.d.invoke():com.bytedance.als.b");
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.read.a.b> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.read.a.b, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.read.a.b invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.read.a.b> r1 = com.ss.android.ugc.gamora.editor.sticker.read.a.b.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.e.invoke():com.bytedance.als.b");
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.qa.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96353);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.qa.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.qa.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.qa.a> r1 = com.ss.android.ugc.gamora.editor.sticker.qa.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.f.invoke():com.bytedance.als.b");
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.info.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.info.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.info.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.info.a> r1 = com.ss.android.ugc.gamora.editor.sticker.info.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.g.invoke():com.bytedance.als.b");
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.multiedit.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.multiedit.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.multiedit.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.multiedit.a> r1 = com.ss.android.ugc.gamora.editor.multiedit.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.j.invoke():com.bytedance.als.b");
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progressbar.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progressbar.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.ss.android.ugc.gamora.editor.progressbar.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.k.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.aweme.infoSticker.g
    public final void L() {
        H().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
    }

    public final FrameLayout W() {
        FrameLayout frameLayout = this.A;
        if (frameLayout == null) {
            h.f.b.l.a("pollLayout");
        }
        return frameLayout;
    }

    public final com.ss.android.ugc.gamora.editor.ab Y() {
        com.ss.android.ugc.gamora.editor.ab abVar = this.K;
        if (abVar == null) {
            h.f.b.l.a("compileCallback");
        }
        return abVar;
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        com.bytedance.o.f b2 = com.bytedance.als.dsl.c.b(this);
        if (b2 == null) {
            h.f.b.l.b();
        }
        return b2;
    }

    static final class ca extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.text.view.i> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ca(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public static final class b implements com.ss.android.ugc.aweme.editSticker.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ca f146466a;

            static {
                Covode.recordClassIndex(96350);
            }

            @Override // com.ss.android.ugc.aweme.editSticker.d.f
            public final Map<String, String> b() {
                Map<String, String> map = com.ss.android.ugc.aweme.story.h.b.a(this.f146466a.this$0.I().getAvetParameter()).f149193a;
                h.f.b.l.b(map, "");
                return map;
            }

            @Override // com.ss.android.ugc.aweme.editSticker.d.f
            public final void a() {
                String str;
                String str2;
                String str3;
                String str4;
                AVETParameter avetParameter = this.f146466a.this$0.I().getAvetParameter();
                com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
                if (avetParameter == null || (str = avetParameter.getCreationId()) == null) {
                    str = "";
                }
                com.ss.android.ugc.tools.f.b a2 = bVar.a("creation_id", str);
                if (avetParameter == null || (str2 = avetParameter.getShootWay()) == null) {
                    str2 = "";
                }
                com.ss.android.ugc.tools.f.b a3 = a2.a("shoot_way", str2);
                if (avetParameter == null || (str3 = avetParameter.getContentSource()) == null) {
                    str3 = "";
                }
                com.ss.android.ugc.tools.f.b a4 = a3.a("content_source", str3);
                if (avetParameter == null || (str4 = avetParameter.getContentType()) == null) {
                    str4 = "";
                }
                com.ss.android.ugc.tools.f.b a5 = a4.a("content_type", str4).a("enter_from", "video_edit_page");
                h.f.b.l.b(a5, "");
                com.ss.android.ugc.aweme.utils.d.a("click_wiki_entrance", a5.f149193a);
            }

            b(ca caVar) {
                this.f146466a = caVar;
            }
        }

        public static final class a implements com.ss.android.ugc.aweme.editSticker.text.c.h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ca f146465a;

            static {
                Covode.recordClassIndex(96349);
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a() {
                com.ss.android.ugc.gamora.editor.sticker.read.j.a(new ShortVideoCommonParams(this.f146465a.this$0.I().mShootWay, es.a(this.f146465a.this$0.I()), es.c(this.f146465a.this$0.I()), this.f146465a.this$0.I().creationId));
            }

            a(ca caVar) {
                this.f146465a = caVar;
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a(String str) {
                h.f.b.l.d(str, "");
                com.ss.android.ugc.aweme.common.r.a("select_text_paragraph", this.f146465a.this$0.ab().a("paragraph_style", str).f149193a);
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void b(int i2) {
                com.ss.android.ugc.aweme.common.r.a("select_text_style", this.f146465a.this$0.ab().a("text_style", String.valueOf(i2)).a("is_subtitle", 0).f149193a);
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a(int i2) {
                com.ss.android.ugc.aweme.common.r.a("select_text_color", this.f146465a.this$0.ab().a(com.bytedance.ies.xelement.pickview.b.b.f37372a, Integer.toHexString(i2)).a("is_subtitle", 0).f149193a);
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a(com.ss.android.ugc.aweme.editSticker.text.a.c cVar) {
                h.f.b.l.d(cVar, "");
                com.ss.android.ugc.aweme.common.r.a("select_text_font", this.f146465a.this$0.ab().a("font", cVar.f88294b).a("is_subtitle", 0).f149193a);
            }

            @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
            public final void a(List<TextStickerTextWrap> list) {
                h.f.b.l.d(list, "");
                boolean h2 = com.ss.android.ugc.aweme.editSticker.text.bean.t.h(list);
                boolean g2 = com.ss.android.ugc.aweme.editSticker.text.bean.t.g(list);
                com.ss.android.ugc.tools.f.b ab = this.f146465a.this$0.ab();
                if (h2) {
                    ab.a("text_added", "1");
                    if (g2) {
                        ab.a("anchor_added", "1");
                        ab.a("anchor_type", "wiki");
                    }
                }
                com.ss.android.ugc.aweme.common.r.a("text_complete", ab.f149193a);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.i invoke() {
            MethodCollector.i(3345);
            View inflate = ((ViewStub) this.this$0.c(R.id.fk1)).inflate();
            if (inflate != null) {
                com.ss.android.ugc.aweme.editSticker.text.view.i iVar = (com.ss.android.ugc.aweme.editSticker.text.view.i) inflate;
                if (com.ss.android.ugc.gamora.editor.sticker.read.h.b()) {
                    iVar.setOnReadTextClickListener(new bh(this.this$0));
                }
                iVar.a(this.this$0.I().mShootWay, this.this$0.I().creationId, com.ss.android.ugc.aweme.shortvideo.edit.bp.a(this.this$0.I()));
                iVar.setTextStickerInputMobListener(new a(this));
                iVar.setWikiTextStickerMob(new b(this));
                MethodCollector.o(3345);
                return iVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.view.TextStickerInputLayout");
            MethodCollector.o(3345);
            throw nullPointerException;
        }
    }

    static final class bp extends h.f.b.m implements h.f.a.a<VideoPublishEditModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bp(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a2 = this.this$0.O.a((Type) VideoPublishEditModel.class, (String) null);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class bz extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.infoSticker.i> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bz(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.infoSticker.i invoke() {
            Object a2 = this.this$0.O.a((Type) com.ss.android.ugc.aweme.infoSticker.i.class, (String) null);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    public static final class o implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146469a;

        static {
            Covode.recordClassIndex(96362);
        }

        @Override // com.ss.android.ugc.aweme.view.b.c
        public final void a() {
            ReadTextViewModel readTextViewModel = this.f146469a.I;
            if (readTextViewModel == null) {
                h.f.b.l.a("readTextViewModel");
            }
            readTextViewModel.f146818b.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(c cVar) {
            this.f146469a = cVar;
        }
    }

    private final void al() {
        if (I().qaStruct != null) {
            U();
            com.ss.android.ugc.gamora.editor.sticker.qa.a U2 = U();
            QaStruct qaStruct = I().qaStruct;
            h.f.b.l.b(qaStruct, "");
            U2.a(qaStruct);
        }
    }

    public final void ad() {
        if (!this.ac) {
            this.ac = true;
            Z().a();
            H().E().observe(this, new r(this));
        }
    }

    public final void aj() {
        this.Z.removeCallbacksAndMessages(null);
        this.Z.postDelayed(new m(this), 100);
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        E();
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
        if (aVar != null) {
            aVar.j();
        }
        this.J = false;
    }

    public static final class bi implements com.ss.android.ugc.aweme.editSticker.text.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146445a;

        static {
            Covode.recordClassIndex(96326);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void c(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void a() {
            com.ss.android.ugc.gamora.editor.sticker.read.j.a(new ShortVideoCommonParams(this.f146445a.I().mShootWay, es.a(this.f146445a.I()), es.c(this.f146445a.I()), this.f146445a.I().creationId));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bi(c cVar) {
            this.f146445a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void b(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            h.f.b.l.d(qVar, "");
            this.f146445a.N = qVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            String speakerID;
            com.ss.android.ugc.gamora.editor.sticker.read.d X;
            h.f.b.l.d(qVar, "");
            TextStickerData data = qVar.getData();
            if (data != null && (speakerID = data.getSpeakerID()) != null && (X = this.f146445a.X()) != null) {
                X.e(speakerID);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.e
        public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, com.ss.android.ugc.aweme.editSticker.text.c.i iVar) {
            h.f.b.l.d(qVar, "");
            h.f.b.l.d(iVar, "");
            if (iVar.f88461c) {
                if (!iVar.f88463e) {
                    this.f146445a.H().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, true, true);
                }
                this.f146445a.J = false;
                return;
            }
            if (!this.f146445a.J) {
                this.f146445a.H().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, true, false);
                this.f146445a.Z().i();
                com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.f146445a.M;
                if (aVar != null) {
                    aVar.n();
                }
                this.f146445a.ad();
                com.ss.android.ugc.gamora.editor.sticker.info.a Z = this.f146445a.Z();
                if (Z.c() != null) {
                    Z.b();
                }
            }
            this.f146445a.J = true;
        }
    }

    static final class bo extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.read.d> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bo(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.read.d invoke() {
            if (!com.ss.android.ugc.gamora.editor.sticker.read.h.a()) {
                return null;
            }
            com.ss.android.ugc.gamora.editor.sticker.read.d dVar = new com.ss.android.ugc.gamora.editor.sticker.read.d(this.this$0.O, this.this$0.T());
            if (this.this$0.a("ReadTextEffectScene") == null) {
                com.bytedance.scene.ktx.a.a(this.this$0, R.id.dhu, dVar, "ReadTextEffectScene");
            }
            return dVar;
        }
    }

    private final void F() {
        E();
        Q().f();
        S().f();
        R().a();
        com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
        if (aaVar != null) {
            aaVar.F();
        }
        U().f();
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
        if (hVar != null) {
            hVar.G();
        }
        com.ss.android.ugc.gamora.editor.o oVar = this.t;
        if (oVar != null) {
            oVar.G();
        }
        com.ss.android.ugc.gamora.editor.l lVar = this.u;
        if (lVar != null) {
            lVar.G();
        }
    }

    @Override // com.ss.android.ugc.aweme.infoSticker.g
    public final void M() {
        if (!Q().h() && !this.Y) {
            H().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        }
        if (!R().k() && !this.Y) {
            H().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        }
    }

    public final void ac() {
        if (!com.ss.android.ugc.aweme.port.in.g.a().w().m()) {
            com.ss.android.ugc.asve.editor.g value = H().C().getValue();
            if (value != null) {
                value.a(true);
            }
            com.ss.android.ugc.asve.editor.g value2 = H().C().getValue();
            if (value2 != null) {
                value2.t();
            }
        }
    }

    public final void af() {
        if (cv.a()) {
            Keva repo = Keva.getRepo("text_max_size_repo", 0);
            if (repo.getFloat("max_size_key", -1.0f) == -1.0f) {
                repo.storeFloat("max_size_key", com.ss.android.ugc.aweme.editSticker.text.ab.a());
            }
        }
        if (!this.ad) {
            com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
            if (aVar != null) {
                aVar.g();
            }
            ak();
            G();
            this.ad = true;
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<CommentAndQuestionAndQuestionStickerPanelViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_core_EditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_core_EditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.h.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_gamora_editor_sticker_core_EditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<EditStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(96356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_core_EditStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
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
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_sticker_core_EditStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.i.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_gamora_editor_sticker_core_EditStickerScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146467a;

        static {
            Covode.recordClassIndex(96360);
        }

        m(c cVar) {
            this.f146467a = cVar;
        }

        public final void run() {
            Boolean bool;
            LiveData<Boolean> e2;
            c cVar = this.f146467a;
            if (cVar.I().commentVideoModel != null) {
                com.ss.android.ugc.gamora.editor.multiedit.a P = cVar.P();
                if (P == null || (e2 = P.e()) == null) {
                    bool = null;
                } else {
                    bool = e2.getValue();
                }
                if (!h.f.b.l.a((Object) bool, (Object) true)) {
                    com.ss.android.ugc.gamora.editor.aa aaVar = cVar.f146432k;
                    if (aaVar != null) {
                        aaVar.N();
                    }
                    com.ss.android.ugc.gamora.editor.aa aaVar2 = cVar.f146432k;
                    if (aaVar2 != null) {
                        CommentVideoModel commentVideoModel = cVar.I().commentVideoModel;
                        h.f.b.l.b(commentVideoModel, "");
                        aaVar2.a(commentVideoModel, false, false);
                    }
                }
            }
        }
    }

    private final void E() {
        List<StickerItemModel> list;
        com.ss.android.ugc.gamora.editor.l lVar;
        InfoStickerModel infoStickerModel = I().infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                int i2 = next.type;
                if (i2 == 4) {
                    com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
                    if (aaVar != null) {
                        String str = next.path;
                        h.f.b.l.b(str, "");
                        aaVar.a(str);
                        String str2 = next.stickerId;
                        h.f.b.l.b(str2, "");
                        aaVar.b(str2);
                        it.remove();
                    }
                } else if (i2 == 19) {
                    U();
                    it.remove();
                } else if (i2 == 8) {
                    com.ss.android.ugc.gamora.editor.o oVar = this.t;
                    if (oVar != null) {
                        String str3 = next.path;
                        h.f.b.l.b(str3, "");
                        oVar.a(str3);
                        String str4 = next.stickerId;
                        h.f.b.l.b(str4, "");
                        oVar.b(str4);
                        it.remove();
                    }
                } else if (i2 == 9 && (lVar = this.u) != null) {
                    String str5 = next.path;
                    h.f.b.l.b(str5, "");
                    lVar.a(str5);
                    String str6 = next.stickerId;
                    h.f.b.l.b(str6, "");
                    lVar.b(str6);
                    it.remove();
                }
            }
        }
    }

    private final void G() {
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
        if (aVar != null) {
            aVar.a(new bi(this));
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar2 = this.M;
        if (aVar2 != null) {
            aVar2.a(new bj(this));
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar3 = this.M;
        if (aVar3 != null) {
            aVar3.a(new bk(this));
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar4 = this.M;
        if (aVar4 != null) {
            aVar4.b(new bl(this));
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar5 = this.M;
        if (aVar5 != null) {
            aVar5.a(new bm());
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar6 = this.M;
        if (aVar6 != null) {
            aVar6.a(new bn(this));
        }
    }

    private final void ak() {
        h.p<Integer, Integer> pVar;
        com.ss.android.ugc.aweme.editSticker.interact.hit.b bVar;
        VESize b2;
        com.ss.android.ugc.asve.editor.g value = H().C().getValue();
        if (value == null || (b2 = value.b()) == null) {
            pVar = null;
        } else {
            pVar = new h.p<>(Integer.valueOf(b2.width), Integer.valueOf(b2.height));
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
        if (aVar != null) {
            aVar.a(pVar);
        }
        if (AVUIUXBugsExperimentServiceDiff.b().a() && (bVar = this.f146433l) != null) {
            bVar.a(pVar);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.a
    public final void K() {
        Q().b();
        S().b();
        com.ss.android.ugc.gamora.editor.subtitle.b bVar = this.v;
        if (bVar != null) {
            bVar.C().n();
        }
        R().h();
        U().b();
        com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
        if (aaVar != null) {
            aaVar.J();
        }
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
        if (hVar != null) {
            hVar.J();
        }
        com.ss.android.ugc.gamora.editor.o oVar = this.t;
        if (oVar != null) {
            ((com.ss.android.ugc.gamora.editor.a) oVar).f145663b.n();
        }
        com.ss.android.ugc.gamora.editor.l lVar = this.u;
        if (lVar != null) {
            ((com.ss.android.ugc.gamora.editor.a) lVar).f145663b.n();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.a
    public final boolean N() {
        com.ss.android.ugc.gamora.editor.aa aaVar;
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar;
        com.ss.android.ugc.gamora.editor.o oVar;
        com.ss.android.ugc.gamora.editor.l lVar;
        com.ss.android.ugc.gamora.editor.subtitle.b bVar;
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
        if ((aVar == null || !aVar.o()) && !Q().k() && !R().i() && (((aaVar = this.f146432k) == null || !aaVar.K()) && !U().i() && (((hVar = this.f146430i) == null || !hVar.F()) && (((oVar = this.t) == null || !((com.ss.android.ugc.gamora.editor.a) oVar).f145663b.b()) && (((lVar = this.u) == null || !((com.ss.android.ugc.gamora.editor.a) lVar).f145663b.b()) && ((bVar = this.v) == null || !bVar.C().b())))))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.a
    public final void O() {
        Q().e();
        S().e();
        R().e();
        U().e();
        com.ss.android.ugc.gamora.editor.subtitle.b bVar = this.v;
        if (bVar != null) {
            bVar.C().d();
            I().captionStruct = null;
        }
        com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
        if (aaVar != null) {
            aaVar.G();
            CommentVideoModel commentVideoModel = I().commentVideoModel;
            if (commentVideoModel != null) {
                commentVideoModel.setStartTime(0);
            }
            CommentVideoModel commentVideoModel2 = I().commentVideoModel;
            if (commentVideoModel2 != null) {
                commentVideoModel2.setEndTime(0);
            }
        }
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
        if (hVar != null) {
            hVar.H();
        }
        com.ss.android.ugc.gamora.editor.o oVar = this.t;
        if (oVar != null) {
            ((com.ss.android.ugc.gamora.editor.a) oVar).f145663b.r();
        }
        com.ss.android.ugc.gamora.editor.l lVar = this.u;
        if (lVar != null) {
            ((com.ss.android.ugc.gamora.editor.a) lVar).f145663b.r();
        }
        ai();
    }

    public final com.ss.android.ugc.tools.f.b ab() {
        com.ss.android.ugc.tools.f.b a2 = com.ss.android.ugc.aweme.shortvideo.edit.bl.l(I()).a("creation_id", I().creationId).a("shoot_way", I().mShootWay).a("content_type", com.ss.android.ugc.aweme.shortvideo.edit.bl.a(I())).a("content_source", com.ss.android.ugc.aweme.shortvideo.edit.bl.b(I())).a("enter_from", "video_edit_page");
        h.f.b.l.b(a2, "");
        return a2;
    }

    public final void ag() {
        if (com.ss.android.ugc.aweme.property.c.a()) {
            EditTextStickerViewModel editTextStickerViewModel = this.x;
            if (editTextStickerViewModel == null) {
                h.f.b.l.a("textStickerViewModel");
            }
            if (editTextStickerViewModel.y() != null) {
                EditTextStickerViewModel editTextStickerViewModel2 = this.x;
                if (editTextStickerViewModel2 == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                EditTextStickerViewModel editTextStickerViewModel3 = this.x;
                if (editTextStickerViewModel3 == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                editTextStickerViewModel2.c(editTextStickerViewModel3.y());
                return;
            }
        }
        ak();
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
        if (aVar != null) {
            aVar.l();
        }
        EditToolbarViewModel editToolbarViewModel = this.y;
        if (editToolbarViewModel == null) {
            h.f.b.l.a("editToolbarViewModel");
        }
        editToolbarViewModel.c(2, false);
        aa().setReadTextIcon(false);
        aa().d();
    }

    public final void ae() {
        com.ss.android.ugc.gamora.editor.subtitle.b bVar;
        Q().a();
        S().a();
        R().b();
        if (this.f146430i == null) {
            com.ss.android.ugc.gamora.editor.sticker.donation.c cVar = new com.ss.android.ugc.gamora.editor.sticker.donation.c(getDiContainer());
            this.f146430i = cVar;
            com.bytedance.f.a.a.j jVar = this.f146428g;
            if (jVar == null) {
                h.f.b.l.a("gestureService");
            }
            cVar.a(jVar);
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
            if (hVar != null) {
                com.ss.android.ugc.aweme.editSticker.interact.e eVar = this.f146429h;
                if (eVar == null) {
                    h.f.b.l.a("deleteComponent");
                }
                hVar.a(eVar);
            }
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar2 = this.f146430i;
            if (hVar2 != null) {
                com.ss.android.ugc.gamora.editor.ab abVar = this.K;
                if (abVar == null) {
                    h.f.b.l.a("compileCallback");
                }
                hVar2.a(abVar);
            }
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar3 = this.f146430i;
            if (!(hVar3 instanceof com.bytedance.scene.j)) {
                hVar3 = null;
            }
            com.bytedance.scene.j jVar2 = (com.bytedance.scene.j) hVar3;
            if (jVar2 != null) {
                a(R.id.ek1, jVar2, "EditDonationStickerScene");
            }
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar4 = this.f146430i;
            if (hVar4 != null) {
                hVar4.a(new s(this));
            }
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar5 = this.f146430i;
            if (hVar5 != null) {
                hVar5.a(new t(this));
            }
        }
        if (this.v == null) {
            com.ss.android.ugc.gamora.editor.subtitle.b bVar2 = new com.ss.android.ugc.gamora.editor.subtitle.b(getDiContainer());
            this.v = bVar2;
            com.bytedance.f.a.a.j jVar3 = this.f146428g;
            if (jVar3 == null) {
                h.f.b.l.a("gestureService");
            }
            bVar2.a(jVar3);
            com.ss.android.ugc.gamora.editor.subtitle.b bVar3 = this.v;
            if (bVar3 == null) {
                h.f.b.l.b();
            }
            a(R.id.b4o, bVar3, "CaptionStickerScene");
        }
        if (this.f146432k == null) {
            com.ss.android.ugc.gamora.editor.h hVar6 = new com.ss.android.ugc.gamora.editor.h(getDiContainer());
            this.f146432k = hVar6;
            com.bytedance.f.a.a.j jVar4 = this.f146428g;
            if (jVar4 == null) {
                h.f.b.l.a("gestureService");
            }
            hVar6.a(jVar4);
            com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
            if (aaVar != null) {
                com.ss.android.ugc.aweme.editSticker.interact.e eVar2 = this.f146429h;
                if (eVar2 == null) {
                    h.f.b.l.a("deleteComponent");
                }
                aaVar.a(eVar2);
            }
            com.ss.android.ugc.gamora.editor.aa aaVar2 = this.f146432k;
            if (aaVar2 instanceof com.bytedance.scene.j) {
                Objects.requireNonNull(aaVar2, "null cannot be cast to non-null type com.bytedance.scene.Scene");
                a(R.id.ek1, (com.bytedance.scene.j) aaVar2, "EditCommentStickerScene");
            }
            com.ss.android.ugc.gamora.editor.aa aaVar3 = this.f146432k;
            if (aaVar3 != null) {
                aaVar3.a(new u(this));
            }
            com.ss.android.ugc.gamora.editor.aa aaVar4 = this.f146432k;
            if (aaVar4 != null) {
                aaVar4.a(new v(this));
            }
        }
        U().a();
        if (this.t == null) {
            com.ss.android.ugc.gamora.editor.o oVar = new com.ss.android.ugc.gamora.editor.o(getDiContainer());
            this.t = oVar;
            com.bytedance.f.a.a.j jVar5 = this.f146428g;
            if (jVar5 == null) {
                h.f.b.l.a("gestureService");
            }
            oVar.a(jVar5);
            com.ss.android.ugc.gamora.editor.o oVar2 = this.t;
            if (oVar2 != null) {
                com.ss.android.ugc.aweme.editSticker.interact.e eVar3 = this.f146429h;
                if (eVar3 == null) {
                    h.f.b.l.a("deleteComponent");
                }
                oVar2.a(eVar3);
            }
            com.ss.android.ugc.gamora.editor.o oVar3 = this.t;
            Objects.requireNonNull(oVar3, "null cannot be cast to non-null type com.bytedance.scene.Scene");
            a(R.id.ek3, oVar3, "EditMentionStickerScene");
        }
        if (this.u == null) {
            com.ss.android.ugc.gamora.editor.l lVar = new com.ss.android.ugc.gamora.editor.l(getDiContainer());
            this.u = lVar;
            com.bytedance.f.a.a.j jVar6 = this.f146428g;
            if (jVar6 == null) {
                h.f.b.l.a("gestureService");
            }
            lVar.a(jVar6);
            com.ss.android.ugc.gamora.editor.l lVar2 = this.u;
            if (lVar2 != null) {
                com.ss.android.ugc.aweme.editSticker.interact.e eVar4 = this.f146429h;
                if (eVar4 == null) {
                    h.f.b.l.a("deleteComponent");
                }
                lVar2.a(eVar4);
            }
            com.ss.android.ugc.gamora.editor.l lVar3 = this.u;
            Objects.requireNonNull(lVar3, "null cannot be cast to non-null type com.bytedance.scene.Scene");
            a(R.id.ek3, lVar3, "EditHashTagStickerScene");
        }
        F();
        if (!(I().captionStruct == null || (bVar = this.v) == null)) {
            bVar.a(I().captionStruct);
        }
        if (!I().mIsFromDraft) {
            aj();
            al();
        }
    }

    public final void ai() {
        List<String> list;
        List<String> list2;
        List<InteractStickerStruct> list3;
        List<StickerItemModel> list4;
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar;
        InteractStickerStruct E2;
        List<InteractStickerStruct> H2;
        InteractStickerStruct H3;
        InteractStickerStruct D2;
        this.W.clear();
        com.ss.android.ugc.asve.editor.g value = H().C().getValue();
        if (value != null) {
            Q().a(value.b());
            S().a(value.b());
            R().a(value.b());
            com.ss.android.ugc.gamora.editor.subtitle.b bVar = this.v;
            if (bVar != null) {
                bVar.a(value.b());
            }
            com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
            if (aaVar != null) {
                aaVar.a(value.b());
            }
            U().a(value.b());
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
            if (hVar != null) {
                hVar.a(value.b());
            }
            com.ss.android.ugc.gamora.editor.o oVar = this.t;
            if (oVar != null) {
                oVar.a(value.b());
            }
            com.ss.android.ugc.gamora.editor.l lVar = this.u;
            if (lVar != null) {
                lVar.a(value.b());
            }
        }
        InteractStickerStruct g2 = Q().g();
        if (g2 != null) {
            this.W.add(g2);
        }
        InteractStickerStruct g3 = S().g();
        if (g3 != null) {
            this.W.add(g3);
        }
        InteractStickerStruct f2 = R().f();
        if (f2 != null) {
            this.W.add(f2);
        }
        com.ss.android.ugc.gamora.editor.subtitle.b bVar2 = this.v;
        if (!(bVar2 == null || (D2 = bVar2.D()) == null)) {
            this.W.add(D2);
        }
        com.ss.android.ugc.gamora.editor.aa aaVar2 = this.f146432k;
        List<InteractStickerStruct> list5 = null;
        if (!(aaVar2 == null || (H3 = aaVar2.H()) == null)) {
            this.W.add(H3);
        }
        InteractStickerStruct h2 = U().h();
        if (h2 != null) {
            this.W.add(h2);
        }
        com.ss.android.ugc.gamora.editor.o oVar2 = this.t;
        if (oVar2 != null) {
            list5 = oVar2.H();
        }
        if (list5 != null && !list5.isEmpty()) {
            this.W.addAll(list5);
        }
        com.ss.android.ugc.gamora.editor.l lVar2 = this.u;
        if (!(lVar2 == null || (H2 = lVar2.H()) == null || H2.isEmpty())) {
            this.W.addAll(H2);
        }
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar2 = this.f146430i;
        if (!(hVar2 == null || (E2 = hVar2.E()) == null)) {
            this.W.add(E2);
        }
        InfoStickerModel infoStickerModel = I().infoStickerModel;
        if (!((infoStickerModel == null || (list4 = infoStickerModel.stickers) == null || list4.isEmpty() || (aVar = this.M) == null || (list3 = aVar.a(r(), list4, com.ss.android.ugc.aweme.port.in.g.a().G())) == null) && (list3 = h.a.z.INSTANCE) == null) && !list3.isEmpty()) {
            this.W.addAll(list3);
        }
        I().setMainBusinessData(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(I().getMainBusinessContext(), this.W, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT));
        VideoPublishEditModel I2 = I();
        com.ss.android.ugc.gamora.editor.o oVar3 = this.t;
        if (oVar3 == null || (list = oVar3.I()) == null) {
            list = h.a.z.INSTANCE;
        }
        I2.mentionTextList = list;
        VideoPublishEditModel I3 = I();
        com.ss.android.ugc.gamora.editor.l lVar3 = this.u;
        if (lVar3 == null || (list2 = lVar3.I()) == null) {
            list2 = h.a.z.INSTANCE;
        }
        I3.hashTagTextList = list2;
    }

    /* access modifiers changed from: package-private */
    public static final class p<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        public static final p f146470a = new p();

        static {
            Covode.recordClassIndex(96363);
        }

        p() {
        }

        @Override // b.g
        public final /* bridge */ /* synthetic */ Object then(b.i iVar) {
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class by extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        by(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        public static final class a extends com.bytedance.o.p<com.ss.android.ugc.aweme.editSticker.text.view.i> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ by f146463a;

            static {
                Covode.recordClassIndex(96344);
            }

            public a(by byVar) {
                this.f146463a = byVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.editSticker.text.view.i get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f146463a.this$0.aa();
            }
        }

        public static final class b extends com.bytedance.o.p<VideoPublishEditModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ by f146464a;

            static {
                Covode.recordClassIndex(96345);
            }

            public b(by byVar) {
                this.f146464a = byVar;
            }

            @Override // com.bytedance.o.p
            public final VideoPublishEditModel get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f146464a.this$0.I();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.editSticker.text.view.i.class, (String) null, (com.bytedance.o.p) new a(this)), "");
            h.f.b.l.b(nVar2.a(VideoPublishEditModel.class, (String) null, (com.bytedance.o.p) new b(this)), "");
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ad<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146434a;

        static {
            Covode.recordClassIndex(96293);
        }

        ad(c cVar) {
            this.f146434a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f146434a.b(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ae<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146435a;

        static {
            Covode.recordClassIndex(96294);
        }

        ae(c cVar) {
            this.f146435a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f146435a.c(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class af<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146436a;

        static {
            Covode.recordClassIndex(96295);
        }

        af(c cVar) {
            this.f146436a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f146436a.d(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class au<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146437a;

        static {
            Covode.recordClassIndex(96310);
        }

        au(c cVar) {
            this.f146437a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                this.f146437a.Z().i();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bf<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146443a;

        static {
            Covode.recordClassIndex(96322);
        }

        bf(c cVar) {
            this.f146443a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.editor.sticker.read.d X = this.f146443a.X();
            if (X != null) {
                X.getDiContainer();
            }
        }
    }

    public static final class bw extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.read.a.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f146460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f146461b;

        static {
            Covode.recordClassIndex(96341);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.read.a.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.sticker.read.a.c(fVar, this.f146461b);
        }

        public bw(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f146460a = dVar;
            this.f146461b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bx extends h.f.b.m implements h.f.a.b<com.bytedance.als.dsl.e, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final bx f146462a = new bx();

        static {
            Covode.recordClassIndex(96342);
        }

        bx() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.als.dsl.e eVar) {
            com.bytedance.als.dsl.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            eVar2.f6462a = com.ss.android.ugc.aweme.setting.i.f.a();
            return h.z.f158842a;
        }
    }

    public static final /* synthetic */ FrameLayout a(c cVar) {
        FrameLayout frameLayout = cVar.z;
        if (frameLayout == null) {
            h.f.b.l.a("textPStickerLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ EditTextStickerViewModel b(c cVar) {
        EditTextStickerViewModel editTextStickerViewModel = cVar.x;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    public static final class av<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146438a;

        static {
            Covode.recordClassIndex(96311);
        }

        av(c cVar) {
            this.f146438a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.f146438a.M;
                if (aVar != null) {
                    aVar.b(booleanValue);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ax<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146440a;

        static {
            Covode.recordClassIndex(96313);
        }

        ax(c cVar) {
            this.f146440a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f146440a.H().d(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bj extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bj(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar2 = qVar;
            h.f.b.l.d(qVar2, "");
            this.this$0.ad();
            this.this$0.Z().a(qVar2);
            return h.z.f158842a;
        }
    }

    public static final class bq extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.info.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f146447a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f146448b;

        static {
            Covode.recordClassIndex(96334);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.info.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            c cVar = this.f146448b;
            return new com.ss.android.ugc.gamora.editor.sticker.info.b(fVar, cVar, c.a(cVar));
        }

        public bq(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f146447a = dVar;
            this.f146448b = cVar;
        }
    }

    public static final class bs extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.poll.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f146452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f146453b;

        static {
            Covode.recordClassIndex(96337);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.poll.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            c cVar = this.f146453b;
            View c2 = cVar.c(R.id.c75);
            h.f.b.l.b(c2, "");
            return new com.ss.android.ugc.gamora.editor.sticker.poll.b(fVar, cVar, (PollingStickerLayout) c2);
        }

        public bs(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f146452a = dVar;
            this.f146453b = cVar;
        }
    }

    public static final class bt extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.qa.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f146454a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f146455b;

        static {
            Covode.recordClassIndex(96338);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.qa.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            c cVar = this.f146455b;
            View c2 = cVar.c(R.id.c79);
            h.f.b.l.b(c2, "");
            return new com.ss.android.ugc.gamora.editor.sticker.qa.b(fVar, cVar, (QaStickerEditLayout) c2, this.f146455b.I());
        }

        public bt(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f146454a = dVar;
            this.f146455b = cVar;
        }
    }

    public static final class bu extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.livecd.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f146456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f146457b;

        static {
            Covode.recordClassIndex(96339);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.livecd.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            c cVar = this.f146457b;
            View c2 = cVar.c(R.id.c6e);
            h.f.b.l.b(c2, "");
            return new com.ss.android.ugc.gamora.editor.sticker.livecd.b(fVar, cVar, (LiveCDEditStickerLayout) c2);
        }

        public bu(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f146456a = dVar;
            this.f146457b = cVar;
        }
    }

    public static final class bv extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.duet.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f146458a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f146459b;

        static {
            Covode.recordClassIndex(96340);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.duet.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            c cVar = this.f146459b;
            View c2 = cVar.c(R.id.c5i);
            h.f.b.l.b(c2, "");
            return new com.ss.android.ugc.gamora.editor.sticker.duet.b(fVar, cVar, (DuetEditStickerLayout) c2);
        }

        public bv(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f146458a = dVar;
            this.f146459b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146473a;

        static {
            Covode.recordClassIndex(96365);
        }

        r(c cVar) {
            this.f146473a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            dmt.av.video.u uVar = (dmt.av.video.u) obj;
            if (uVar == null) {
                return;
            }
            if (uVar.f156965j == 1) {
                this.f146473a.H().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
            } else {
                this.f146473a.H().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<T> implements com.ss.android.ugc.aweme.tools.e.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146476a;

        static {
            Covode.recordClassIndex(96368);
        }

        u(c cVar) {
            this.f146476a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.e.c
        public final /* synthetic */ void a(Object obj) {
            View view = (View) obj;
            this.f146476a.ad();
            if (view instanceof CommentStickerView) {
                this.f146476a.Z().a((com.ss.android.ugc.aweme.editSticker.interact.h) view);
            }
        }
    }

    public final void a(com.bytedance.f.a.a.j jVar) {
        h.f.b.l.d(jVar, "");
        this.f146428g = jVar;
    }

    /* access modifiers changed from: package-private */
    public static final class aw<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146439a;

        static {
            Covode.recordClassIndex(96312);
        }

        aw(c cVar) {
            this.f146439a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.editSticker.text.als.a aVar;
            boolean booleanValue;
            h.p pVar = (h.p) obj;
            if (pVar != null && (aVar = this.f146439a.M) != null && !aVar.e()) {
                this.f146439a.H().a((com.ss.android.ugc.aweme.shortvideo.preview.a) ((Boolean) pVar.getFirst()).booleanValue(), ((Boolean) pVar.getSecond()).booleanValue(), booleanValue);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s<T> implements com.ss.android.ugc.aweme.tools.e.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146474a;

        static {
            Covode.recordClassIndex(96366);
        }

        s(c cVar) {
            this.f146474a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.e.c
        public final /* synthetic */ void a(Object obj) {
            View view = (View) obj;
            this.f146474a.ad();
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146474a.f146430i;
            if (hVar != null) {
                h.f.b.l.b(view, "");
                if (hVar.a(view)) {
                    this.f146474a.Z().a((com.ss.android.ugc.aweme.editSticker.interact.h) view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t<T, U> implements com.ss.android.ugc.aweme.tools.e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146475a;

        static {
            Covode.recordClassIndex(96367);
        }

        t(c cVar) {
            this.f146475a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.e.a
        public final /* synthetic */ void a(Object obj) {
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar;
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = (com.ss.android.ugc.aweme.editSticker.interact.view.g) obj;
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar2 = this.f146475a.f146430i;
            if (hVar2 != null && hVar2.L() && (hVar = this.f146475a.f146430i) != null) {
                h.f.b.l.b(gVar, "");
                if (hVar.b(gVar)) {
                    com.ss.android.ugc.gamora.editor.sticker.info.a Z = this.f146475a.Z();
                    View drawView = gVar.getDrawView();
                    Objects.requireNonNull(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.interact.TimeEditable<*>");
                    Z.b((com.ss.android.ugc.aweme.editSticker.interact.h) drawView);
                    this.f146475a.Z().b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<T, U> implements com.ss.android.ugc.aweme.tools.e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146477a;

        static {
            Covode.recordClassIndex(96369);
        }

        v(c cVar) {
            this.f146477a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.e.a
        public final /* synthetic */ void a(Object obj) {
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = (com.ss.android.ugc.aweme.editSticker.interact.view.g) obj;
            com.ss.android.ugc.gamora.editor.aa aaVar = this.f146477a.f146432k;
            if (aaVar != null && aaVar.M() && (gVar instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d)) {
                com.ss.android.ugc.gamora.editor.sticker.info.a Z = this.f146477a.Z();
                View drawView = gVar.getDrawView();
                Objects.requireNonNull(drawView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView");
                Z.b((CommentStickerView) drawView);
                this.f146477a.Z().b();
            }
        }
    }

    public final void b(boolean z2) {
        com.ss.android.ugc.gamora.editor.sticker.info.a Z2 = Z();
        if (!Z2.f()) {
            Z2.a(z2);
        }
        Q().a(z2);
        S().a(z2);
        R().a(z2);
        U().a(z2);
        com.ss.android.ugc.gamora.editor.subtitle.b bVar = this.v;
        if (bVar != null) {
            bVar.a(z2);
        }
        com.ss.android.ugc.gamora.editor.l lVar = this.u;
        if (lVar != null) {
            lVar.a(z2);
        }
        com.ss.android.ugc.gamora.editor.o oVar = this.t;
        if (oVar != null) {
            oVar.a(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bd<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146441a;

        static {
            Covode.recordClassIndex(96320);
        }

        bd(c cVar) {
            this.f146441a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            dmt.av.video.u uVar = (dmt.av.video.u) obj;
            if (uVar != null) {
                c cVar = this.f146441a;
                if (uVar.f156965j == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (uVar.f156962g) {
                    cVar.V().m().setValue(Boolean.valueOf(z));
                } else {
                    cVar.V().l().setValue(Boolean.valueOf(z));
                }
                if (z) {
                    cVar.V().n().setValue(false);
                    cVar.V().o().setValue(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class be<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146442a;

        static {
            Covode.recordClassIndex(96321);
        }

        be(c cVar) {
            this.f146442a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            LiveData<Boolean> e2;
            Boolean bool2 = (Boolean) obj;
            h.f.b.l.b(bool2, "");
            if (bool2.booleanValue()) {
                this.f146442a.J().b();
                com.ss.android.ugc.gamora.editor.aa aaVar = this.f146442a.f146432k;
                if (aaVar != null) {
                    CommentVideoModel commentVideoModel = this.f146442a.I().commentVideoModel;
                    aaVar.G();
                    this.f146442a.I().commentVideoModel = commentVideoModel;
                    aaVar.N();
                    if (this.f146442a.I().commentVideoModel != null) {
                        com.ss.android.ugc.gamora.editor.multiedit.a P = this.f146442a.P();
                        if (P == null || (e2 = P.e()) == null) {
                            bool = null;
                        } else {
                            bool = e2.getValue();
                        }
                        if (!h.f.b.l.a((Object) bool, (Object) true)) {
                            CommentVideoModel commentVideoModel2 = this.f146442a.I().commentVideoModel;
                            h.f.b.l.b(commentVideoModel2, "");
                            aaVar.a(commentVideoModel2, true, true);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.g f146471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.editor.ab f146472b;

        static {
            Covode.recordClassIndex(96364);
        }

        q(com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.gamora.editor.ab abVar) {
            this.f146471a = gVar;
            this.f146472b = abVar;
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
                    j2 = this.f146471a.j();
                }
                StickerItemModel stickerItemModel = new StickerItemModel("text_sticker_" + textStickerCompileResult.index, textStickerCompileResult.stickerPath, b2, textStickerCompileResult.index, false, i2, j2, 2);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = textStickerCompileResult.viewHash;
                this.f146472b.a(stickerItemModel);
            }
            return h.z.f158842a;
        }
    }

    public final void c(boolean z2) {
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
        if (aVar != null) {
            aVar.c(z2);
        }
        com.ss.android.ugc.gamora.editor.sticker.info.a Z2 = Z();
        if (!Z2.g()) {
            Z2.a(z2);
        }
        Q().a(z2);
        S().a(z2);
        R().a(z2);
        U().a(z2);
        com.ss.android.ugc.gamora.editor.subtitle.b bVar = this.v;
        if (bVar != null) {
            bVar.a(z2);
        }
        com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
        if (aaVar != null) {
            aaVar.a(z2);
        }
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
        if (hVar != null) {
            hVar.a(z2);
        }
        com.ss.android.ugc.gamora.editor.o oVar = this.t;
        if (oVar != null) {
            oVar.a(z2);
        }
        com.ss.android.ugc.gamora.editor.l lVar = this.u;
        if (lVar != null) {
            lVar.a(z2);
        }
    }

    public final void d(boolean z2) {
        Q().a(z2);
        S().a(z2);
        com.ss.android.ugc.gamora.editor.subtitle.b bVar = this.v;
        if (bVar != null) {
            bVar.a(z2);
        }
        R().a(z2);
        U().a(z2);
        com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
        if (aaVar != null) {
            aaVar.a(z2);
        }
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
        if (hVar != null) {
            hVar.a(z2);
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
        if (aVar != null) {
            aVar.c(z2);
        }
        Z().a(z2);
        com.ss.android.ugc.gamora.editor.l lVar = this.u;
        if (lVar != null) {
            lVar.a(z2);
        }
        com.ss.android.ugc.gamora.editor.o oVar = this.t;
        if (oVar != null) {
            oVar.a(z2);
        }
    }

    public static final class br extends com.bytedance.o.p<com.ss.android.ugc.aweme.editSticker.text.als.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f146449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f146450b;

        static {
            Covode.recordClassIndex(96335);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.als.b get(com.bytedance.o.f fVar) {
            Integer num;
            Integer num2;
            boolean z;
            h.f.b.l.d(fVar, "");
            Integer a2 = com.ss.android.ugc.aweme.port.in.l.f115658a.s().f().a();
            if (a2 != null && a2.intValue() == 0) {
                num = 30;
            } else {
                num = com.ss.android.ugc.aweme.port.in.l.f115658a.s().f().a();
            }
            c cVar = this.f146450b;
            AnonymousClass1 r6 = new com.ss.android.ugc.aweme.editSticker.text.als.d(this) {
                /* class com.ss.android.ugc.gamora.editor.sticker.core.c.br.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ br f146451a;

                static {
                    Covode.recordClassIndex(96336);
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.als.d
                public final InfoStickerModel a() {
                    return this.f146451a.f146450b.I().infoStickerModel;
                }

                {
                    this.f146451a = r1;
                }
            };
            boolean a3 = com.ss.android.ugc.aweme.shortvideo.edit.p.a();
            h.f.b.l.b(num, "");
            int intValue = num.intValue();
            boolean isReverse = this.f146450b.I().isReverse();
            c cVar2 = this.f146450b;
            VideoPublishEditModel I = cVar2.I();
            com.ss.android.ugc.asve.editor.g value = cVar2.H().C().getValue();
            if (value != null) {
                num2 = Integer.valueOf(value.j());
            } else {
                num2 = null;
            }
            if (!com.ss.android.ugc.aweme.property.c.a() || I.isCommentReply() || I.mIsFromDraft || I.isRetakeVideo() || num2 == null || num2.intValue() < 60000) {
                z = false;
            } else {
                z = true;
            }
            return new com.ss.android.ugc.aweme.editSticker.text.als.b(fVar, cVar, r6, a3, intValue, isReverse, z);
        }

        public br(com.bytedance.als.dsl.d dVar, c cVar) {
            this.f146449a = dVar;
            this.f146450b = cVar;
        }
    }

    public c(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.O = fVar;
        h.k.c a2 = h.f.b.ab.a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
        this.f146426e = h.i.a((h.f.a.a) new h(this, a2, a2));
        this.f146427f = h.i.a(h.m.NONE, new j(this));
        this.Q = h.i.a(h.m.NONE, new b(this));
        this.R = h.i.a(h.m.NONE, new C3919c(this));
        this.S = h.i.a(h.m.NONE, new d(this));
        this.f146431j = h.i.a(h.m.NONE, new k(this));
        this.T = h.i.a(h.m.NONE, new e(this));
        this.U = h.i.a(h.m.NONE, new f(this));
        h.k.c a3 = h.f.b.ab.a(EditStickerViewModel.class);
        this.V = h.i.a((h.f.a.a) new i(this, a3, a3));
        this.W = new ArrayList();
        this.X = h.i.a((h.f.a.a) new bo(this));
        this.Z = new SafeHandler(getLifecycleOwner());
        this.aa = h.i.a(h.m.NONE, new g(this));
        this.ab = h.i.a((h.f.a.a) new ca(this));
    }

    public final void a(com.ss.android.ugc.aweme.editSticker.interact.e eVar) {
        h.f.b.l.d(eVar, "");
        this.f146429h = eVar;
    }

    /* access modifiers changed from: package-private */
    public static final class bl extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bl(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            String audioText;
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar2 = qVar;
            h.f.b.l.d(qVar2, "");
            TextStickerData data = qVar2.getData();
            if (data != null) {
                c cVar = this.this$0;
                h.f.b.l.b(data, "");
                com.ss.android.ugc.gamora.editor.progressbar.a aVar = (com.ss.android.ugc.gamora.editor.progressbar.a) cVar.f146431j.getValue();
                if (aVar != null) {
                    aVar.a(1, -1);
                }
                if (com.ss.android.ugc.gamora.editor.sticker.read.h.a()) {
                    if (cVar.X() != null) {
                        if (!com.ss.android.ugc.gamora.editor.sticker.read.k.b() || data.getHasReadTextAudio()) {
                            if (data.getHasReadTextAudio()) {
                                new com.ss.android.ugc.aweme.editSticker.interact.g().b(true);
                            }
                            ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(cVar.I().mShootWay, es.a(cVar.I()), es.c(cVar.I()), cVar.I().creationId);
                            h.f.b.l.d(shortVideoCommonParams, "");
                            com.ss.android.ugc.aweme.common.r.a("click_change_voice", new com.ss.android.ugc.tools.f.b().a("shoot_way", shortVideoCommonParams.shootWay).a("content_source", shortVideoCommonParams.contentSource).a("content_type", shortVideoCommonParams.contentType).a("creation_id", shortVideoCommonParams.creationId).f149193a);
                            com.ss.android.ugc.gamora.editor.sticker.read.d X = cVar.X();
                            if (X == null) {
                                h.f.b.l.b();
                            }
                            X.a(true, false, qVar2);
                        } else {
                            com.ss.android.ugc.gamora.editor.sticker.read.j.a(new ShortVideoCommonParams(cVar.I().mShootWay, es.a(cVar.I()), es.c(cVar.I()), cVar.I().creationId), "auto", "bubble");
                            com.ss.android.ugc.gamora.editor.sticker.read.d X2 = cVar.X();
                            if (X2 == null) {
                                h.f.b.l.b();
                            }
                            X2.a(com.ss.android.ugc.aweme.editSticker.text.bean.t.i(data.getTextWrapList()), com.ss.android.ugc.gamora.editor.sticker.read.k.c(), data);
                        }
                    }
                } else if (!com.ss.android.ugc.aweme.shortvideo.s.c.a(cVar.s())) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(cVar.f42913m).a(cVar.c_(R.string.aye)).a();
                } else if (data.getHasReadTextAudio()) {
                    com.ss.android.ugc.gamora.editor.sticker.read.j.b(new ShortVideoCommonParams(cVar.I().mShootWay, es.a(cVar.I()), es.c(cVar.I()), cVar.I().creationId));
                    if (data.getAudioTrackIndex() >= 0) {
                        com.ss.android.ugc.asve.editor.g value = cVar.H().C().getValue();
                        if (value != null) {
                            value.e(data.getAudioTrackIndex());
                            value.a(data.getStartTime(), x.f.EDITOR_SEEK_FLAG_LastSeek);
                        }
                        data.setHasReadTextAudio(false);
                        data.setAudioTrackIndex(-1);
                    }
                    com.ss.android.ugc.asve.editor.g value2 = cVar.H().C().getValue();
                    if (value2 != null) {
                        value2.t();
                    }
                } else {
                    com.ss.android.ugc.gamora.editor.sticker.read.j.a(new ShortVideoCommonParams(cVar.I().mShootWay, es.a(cVar.I()), es.c(cVar.I()), cVar.I().creationId), "", "");
                    String audioTrackFilePath = data.getAudioTrackFilePath();
                    if (audioTrackFilePath != null && audioTrackFilePath.length() > 0 && new File(data.getAudioTrackFilePath()).exists() && (audioText = data.getAudioText()) != null && audioText.length() > 0 && (!data.getTextWrapList().isEmpty()) && h.f.b.l.a((Object) data.getAudioText(), (Object) com.ss.android.ugc.aweme.editSticker.text.bean.t.i(data.getTextWrapList()))) {
                        cVar.a(data);
                        cVar.ac();
                    } else if (com.ss.android.ugc.gamora.editor.sticker.read.i.a(qVar2.getText())) {
                        cVar.H().c(true);
                        com.ss.android.ugc.aweme.view.b bVar = cVar.L;
                        if (bVar != null) {
                            bVar.cancel();
                        }
                        Activity t = cVar.t();
                        h.f.b.l.b(t, "");
                        cVar.L = b.C3836b.a(t, b.a.VISIBLE, new o(cVar));
                        com.ss.android.ugc.aweme.view.b bVar2 = cVar.L;
                        if (bVar2 == null) {
                            h.f.b.l.b();
                        }
                        bVar2.setMessage(cVar.t().getString(R.string.g4k));
                        com.ss.android.ugc.aweme.view.b bVar3 = cVar.L;
                        if (bVar3 == null) {
                            h.f.b.l.b();
                        }
                        bVar3.show();
                        com.ss.android.ugc.asve.editor.g value3 = cVar.H().C().getValue();
                        if (value3 != null) {
                            value3.u();
                        }
                        ReadTextViewModel readTextViewModel = cVar.I;
                        if (readTextViewModel == null) {
                            h.f.b.l.a("readTextViewModel");
                        }
                        String text = qVar2.getText();
                        h.f.b.l.b(text, "");
                        String c_ = cVar.c_(R.string.ayk);
                        h.f.b.l.b(c_, "");
                        h.f.b.l.d(data, "");
                        h.f.b.l.d(text, "");
                        h.f.b.l.d(c_, "");
                        if (com.ss.android.ugc.aweme.port.in.g.a().A().b() && !com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                            readTextViewModel.f146819c = System.currentTimeMillis();
                            readTextViewModel.f146818b.a();
                            com.bytedance.ttnet.d.d dVar = new com.bytedance.ttnet.d.d();
                            dVar.f28943d = 30000;
                            dVar.f28942c = 30000;
                            dVar.f28944e = 30000;
                            readTextViewModel.f146818b.a(((ReadTextApi.Api) ((ReadTextApi) readTextViewModel.f146817a.getValue()).f146814a.getValue()).submitText(text, dVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ReadTextViewModel.d(readTextViewModel, data, text, c_), new ReadTextViewModel.e(readTextViewModel, c_)));
                        }
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(cVar.f42913m).a(cVar.c_(R.string.ayi)).a();
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public void a(Bundle bundle) {
        com.bytedance.als.k<Boolean> c2;
        com.bytedance.als.k<h.p<Boolean, Boolean>> b2;
        com.bytedance.als.k<h.z> a2;
        super.a(bundle);
        com.ss.android.ugc.tools.utils.q.a("EditStickerScene onActivityCreated");
        com.bytedance.als.dsl.f.a(this, bx.f146462a);
        com.bytedance.als.dsl.g.a(this, new by(this));
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.gamora.editor.sticker.info.b.class, (String) null, (com.bytedance.o.p) new bq(dVar, this));
        alsLogicContainer.a(EditInfoStickerViewModel.class, com.ss.android.ugc.gamora.editor.sticker.info.b.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.aweme.editSticker.text.als.b.class, (String) null, (com.bytedance.o.p) new br(dVar2, this));
        alsLogicContainer2.a(EditTextStickerViewModel.class, com.ss.android.ugc.aweme.editSticker.text.als.b.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar.f6461a;
        alsLogicContainer3.f6437d.a(com.ss.android.ugc.gamora.editor.sticker.poll.b.class, (String) null, (com.bytedance.o.p) new bs(dVar3, this));
        alsLogicContainer3.a(EditPollStickerViewModel.class, com.ss.android.ugc.gamora.editor.sticker.poll.b.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar.f6461a;
        alsLogicContainer4.f6437d.a(com.ss.android.ugc.gamora.editor.sticker.qa.b.class, (String) null, (com.bytedance.o.p) new bt(dVar4, this));
        alsLogicContainer4.a(EditPageQaStickerViewModel.class, com.ss.android.ugc.gamora.editor.sticker.qa.b.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar.f6461a;
        alsLogicContainer5.f6437d.a(com.ss.android.ugc.gamora.editor.sticker.livecd.b.class, (String) null, (com.bytedance.o.p) new bu(dVar5, this));
        alsLogicContainer5.a(EditLiveCDStickerViewModel.class, com.ss.android.ugc.gamora.editor.sticker.livecd.b.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar.f6461a;
        alsLogicContainer6.f6437d.a(com.ss.android.ugc.gamora.editor.sticker.duet.b.class, (String) null, (com.bytedance.o.p) new bv(dVar6, this));
        alsLogicContainer6.a(EditDuetStickerViewModel.class, com.ss.android.ugc.gamora.editor.sticker.duet.b.class);
        com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer7 = bVar.f6461a;
        alsLogicContainer7.f6437d.a(com.ss.android.ugc.gamora.editor.sticker.read.a.c.class, (String) null, (com.bytedance.o.p) new bw(dVar7, this));
        alsLogicContainer7.a(com.ss.android.ugc.gamora.editor.sticker.read.a.b.class, com.ss.android.ugc.gamora.editor.sticker.read.a.c.class);
        bVar.a();
        this.M = (com.ss.android.ugc.aweme.editSticker.text.als.a) getDiContainer().a(com.ss.android.ugc.aweme.editSticker.text.als.a.class, (String) null);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditDonationStickerViewModel.class);
        h.f.b.l.b(a3, "");
        this.w = (EditDonationStickerViewModel) a3;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity2).a(EditToolbarViewModel.class);
        h.f.b.l.b(a4, "");
        this.y = (EditToolbarViewModel) a4;
        this.G = new com.ss.android.ugc.aweme.shortvideo.edit.g();
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.lifecycle.ac a5 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity3, (ad.b) null).a(InfoStickerViewModel.class);
        h.f.b.l.b(a5, "");
        this.H = (InfoStickerViewModel) a5;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity4).a(ReadTextViewModel.class);
        h.f.b.l.b(a6, "");
        this.I = (ReadTextViewModel) a6;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity5).a(EditTextStickerViewModel.class);
        h.f.b.l.b(a7, "");
        EditTextStickerViewModel editTextStickerViewModel = (EditTextStickerViewModel) a7;
        this.x = editTextStickerViewModel;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel, d.f146478a, new com.bytedance.jedi.arch.ah(), new ab(this));
        EditTextStickerViewModel editTextStickerViewModel2 = this.x;
        if (editTextStickerViewModel2 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel2, m.f146487a, new com.bytedance.jedi.arch.ah(), new ao(this));
        EditTextStickerViewModel editTextStickerViewModel3 = this.x;
        if (editTextStickerViewModel3 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel3, x.f146498a, new com.bytedance.jedi.arch.ah(), new bb(this));
        EditTextStickerViewModel editTextStickerViewModel4 = this.x;
        if (editTextStickerViewModel4 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel4, ab.f146414a, new com.bytedance.jedi.arch.ah(), new bg(this));
        EditTextStickerViewModel editTextStickerViewModel5 = this.x;
        if (editTextStickerViewModel5 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel5, ac.f146415a, new com.bytedance.jedi.arch.ah(), new w(this));
        EditTextStickerViewModel editTextStickerViewModel6 = this.x;
        if (editTextStickerViewModel6 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel6, e.f146479a, new com.bytedance.jedi.arch.ah(), new x(this));
        selectNonNullSubscribe(V(), f.f146480a, new com.bytedance.jedi.arch.ah(), new y(this));
        selectNonNullSubscribe(V(), g.f146481a, new com.bytedance.jedi.arch.ah(), new z(this));
        selectNonNullSubscribe(V(), h.f146482a, new com.bytedance.jedi.arch.ah(), new aa(this));
        selectNonNullSubscribe(V(), i.f146483a, new com.bytedance.jedi.arch.ah(), new ac(this));
        V().l().observe(this, new ad<>(this));
        V().m().observe(this, new ae<>(this));
        V().g().observe(this, new af<>(this));
        f.a.b.b unused = selectSubscribe(V(), j.f146484a, new com.bytedance.jedi.arch.ah(), new ag(this));
        b.a.b(this, V(), k.f146485a, new ah(this));
        b.a.b(this, V(), l.f146486a, new ai(this));
        b.a.b(this, V(), n.f146488a, new aj(this));
        b.a.b(this, V(), o.f146489a, new ak(this));
        b.a.b(this, V(), p.f146490a, new al(this));
        selectNonNullSubscribe(V(), q.f146491a, new com.bytedance.jedi.arch.ah(), new am(this));
        selectNonNullSubscribe(V(), r.f146492a, new com.bytedance.jedi.arch.ah(), new an(this));
        selectNonNullSubscribe(V(), s.f146493a, new com.bytedance.jedi.arch.ah(), new ap(this));
        selectNonNullSubscribe(V(), t.f146494a, new com.bytedance.jedi.arch.ah(), new aq(this));
        selectNonNullSubscribe(V(), u.f146495a, new com.bytedance.jedi.arch.ah(), new ar(this));
        selectNonNullSubscribe(V(), v.f146496a, new com.bytedance.jedi.arch.ah(), new as(this));
        selectNonNullSubscribe(V(), w.f146497a, new com.bytedance.jedi.arch.ah(), new at(this));
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
        if (!(aVar == null || (a2 = aVar.a()) == null)) {
            a2.a(getLifecycleOwner(), new au(this));
        }
        V().n().observe(this, new av<>(this));
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar2 = this.M;
        if (aVar2 != null) {
            aVar2.a(V().n());
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar3 = this.M;
        if (!(aVar3 == null || (b2 = aVar3.b()) == null)) {
            b2.a(this, new aw(this));
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar4 = this.M;
        if (!(aVar4 == null || (c2 = aVar4.c()) == null)) {
            c2.a(this, new ax(this));
        }
        ReadTextViewModel readTextViewModel = this.I;
        if (readTextViewModel == null) {
            h.f.b.l.a("readTextViewModel");
        }
        h.a.a(this, readTextViewModel, y.f146499a, (com.bytedance.jedi.arch.ah) null, new ay(this), (h.f.a.b) null, new az(this), 10);
        ReadTextViewModel readTextViewModel2 = this.I;
        if (readTextViewModel2 == null) {
            h.f.b.l.a("readTextViewModel");
        }
        b.a.b(this, readTextViewModel2, z.f146500a, new ba(this));
        ReadTextViewModel readTextViewModel3 = this.I;
        if (readTextViewModel3 == null) {
            h.f.b.l.a("readTextViewModel");
        }
        selectNonNullSubscribe(readTextViewModel3, aa.f146413a, new com.bytedance.jedi.arch.ah(), new bc(this));
        H().E().observe(this, new bd<>(this));
        J().f73097l.observe(this, new be(this));
        H().f().observe(this, new bf<>(this));
        if (this.f146433l == null) {
            com.ss.android.ugc.aweme.editSticker.interact.hit.b bVar2 = new com.ss.android.ugc.aweme.editSticker.interact.hit.b();
            this.f146433l = bVar2;
            a(R.id.f81, bVar2, "StickerHintTextScene");
        }
    }

    public final void a(TextStickerData textStickerData) {
        com.ss.android.ugc.asve.editor.g value;
        String audioTrackFilePath = textStickerData.getAudioTrackFilePath();
        if (audioTrackFilePath != null && (value = H().C().getValue()) != null && audioTrackFilePath.length() > 0) {
            value.a(textStickerData.getStartTime(), x.f.EDITOR_SEEK_FLAG_LastSeek);
            int a2 = value.a(audioTrackFilePath, 0, textStickerData.getAudioTrackDuration(), textStickerData.getStartTime(), textStickerData.getStartTime() + textStickerData.getAudioTrackDuration(), false);
            if (a2 >= 0) {
                textStickerData.setAudioTrackIndex(a2);
                textStickerData.setHasReadTextAudio(true);
                value.a(a2, 1, 1.0f);
            }
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    /* access modifiers changed from: package-private */
    public static final class aa extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            this.this$0.L();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ac extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            this.this$0.M();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            this.this$0.ag();
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    public static final class ab extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar) {
            com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar2 = dVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(dVar2, "");
            T t = dVar2.f39404b;
            com.ss.android.ugc.gamora.editor.sticker.read.d X = this.this$0.X();
            if (X != null) {
                X.a(true, true, (com.ss.android.ugc.aweme.editSticker.text.view.q) t);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ap extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.n<Integer, Integer>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ap(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.n<Integer, Integer> nVar) {
            com.bytedance.jedi.arch.n<Integer, Integer> nVar2 = nVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(nVar2, "");
            this.this$0.Z().a((h.p<Integer, Integer>) nVar2.f39404b);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aq extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aq(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            this.this$0.Z().j();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class as extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        as(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.this$0.M;
            if (aVar != null) {
                aVar.t();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bb extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bb(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
            com.bytedance.jedi.arch.k kVar2 = kVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(kVar2, "");
            this.this$0.aa().J = kVar2.f39404b.booleanValue();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
            com.bytedance.jedi.arch.k kVar2 = kVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(kVar2, "");
            this.this$0.aa().setReadTextIcon(kVar2.f39404b.booleanValue());
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atd, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) a2;
    }

    /* access modifiers changed from: package-private */
    public static final class ag extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(c cVar) {
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

    /* access modifiers changed from: package-private */
    public static final class ak extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.u<? extends Float, ? extends Float, ? extends Float>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ak(c cVar) {
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
            FrameLayout frameLayout = this.this$0.B;
            if (frameLayout == null) {
                h.f.b.l.a("commentLayout");
            }
            com.ss.android.ugc.gamora.editor.u.a(frameLayout, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class al extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.u<? extends Float, ? extends Float, ? extends Float>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        al(c cVar) {
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
            FrameLayout frameLayout = this.this$0.F;
            if (frameLayout == null) {
                h.f.b.l.a("captionLayout");
            }
            com.ss.android.ugc.gamora.editor.u.a(frameLayout, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class an extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        an(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
            boolean z;
            com.bytedance.jedi.arch.k kVar2 = kVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(kVar2, "");
            Boolean bool = (Boolean) kVar2.a();
            int i2 = 0;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            View view = this.this$0.n;
            h.f.b.l.b(view, "");
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ao extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ao(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            com.ss.android.ugc.aweme.view.b bVar2;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            com.ss.android.ugc.gamora.editor.sticker.read.d X = this.this$0.X();
            if (!(X == null || (bVar2 = X.B) == null || !bVar2.isShowing())) {
                com.ss.android.ugc.aweme.view.b bVar3 = X.B;
                if (bVar3 != null) {
                    bVar3.dismiss();
                }
                X.a().c(false);
                X.A = true;
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ar extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.n<Integer, Boolean>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ar(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.n<Integer, Boolean> nVar) {
            com.bytedance.jedi.arch.n<Integer, Boolean> nVar2 = nVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(nVar2, "");
            T t = nVar2.f39404b;
            int intValue = ((Number) t.component1()).intValue();
            this.this$0.Z().a(intValue, ((Boolean) t.component2()).booleanValue());
            com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.this$0.M;
            if (aVar != null) {
                aVar.a(intValue);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class at extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.m, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        at(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.m mVar) {
            com.bytedance.jedi.arch.m mVar2 = mVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(mVar2, "");
            Integer num = (Integer) mVar2.a();
            if (num != null && num.intValue() == 8) {
                this.this$0.S().e();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ay extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ay(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            this.this$0.H().c(false);
            com.ss.android.ugc.aweme.view.b bVar = this.this$0.L;
            if (bVar != null) {
                bVar.cancel();
            }
            this.this$0.ac();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class az extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, TextStickerData, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        az(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, TextStickerData textStickerData) {
            TextStickerData textStickerData2 = textStickerData;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(textStickerData2, "");
            this.this$0.H().c(false);
            com.ss.android.ugc.aweme.view.b bVar = this.this$0.L;
            if (bVar != null) {
                bVar.cancel();
            }
            this.this$0.a(textStickerData2);
            this.this$0.ac();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bg extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.d<? extends String>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bg(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.d<? extends String> dVar) {
            com.bytedance.jedi.arch.d<? extends String> dVar2 = dVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(dVar2, "");
            T t = dVar2.f39404b;
            com.ss.android.ugc.gamora.editor.sticker.read.d X = this.this$0.X();
            if (X != null) {
                X.a(t, com.ss.android.ugc.gamora.editor.sticker.read.k.e(), (TextStickerData) null);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bk extends h.f.b.m implements h.f.a.m<com.ss.android.ugc.aweme.editSticker.text.view.q, com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bk(c cVar) {
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
            com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.this$0.M;
            if (aVar != null && aVar.i()) {
                this.this$0.Z().b(qVar3);
                this.this$0.Z().b();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.n<Effect, String>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.n<Effect, String> nVar) {
            com.bytedance.jedi.arch.n<Effect, String> nVar2 = nVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(nVar2, "");
            T t = nVar2.f39404b;
            this.this$0.a((Effect) t.getFirst(), (String) t.getSecond());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ah extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends Float, ? extends Long>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(c cVar) {
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
            com.ss.android.ugc.gamora.editor.u.a(this.this$0.W(), ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            com.ss.android.ugc.gamora.editor.u.a(c.a(this.this$0), ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ai extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.u<? extends Float, ? extends Float, ? extends Float>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(c cVar) {
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
            com.ss.android.ugc.gamora.editor.u.a(this.this$0.W(), ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            com.ss.android.ugc.gamora.editor.u.a(c.a(this.this$0), ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ba extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.p<? extends String, ? extends Integer>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ba(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.p<? extends String, ? extends Integer> pVar) {
            h.p<? extends String, ? extends Integer> pVar2 = pVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar2, "");
            this.this$0.H().c(false);
            com.ss.android.ugc.aweme.view.b bVar2 = this.this$0.L;
            if (bVar2 != null) {
                bVar2.cancel();
            }
            this.this$0.ac();
            if (com.ss.android.ugc.aweme.shortvideo.s.c.a(this.this$0.s())) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f42913m).a((CharSequence) pVar2.getFirst()).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f42913m).a(this.this$0.c_(R.string.aye)).a();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class bc extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.d<? extends TextStickerData>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bc(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.d<? extends TextStickerData> dVar) {
            com.bytedance.jedi.arch.d<? extends TextStickerData> dVar2 = dVar;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(dVar2, "");
            T t = dVar2.f39404b;
            if (t.getAudioTrackIndex() >= 0) {
                com.ss.android.ugc.asve.editor.g value = this.this$0.H().C().getValue();
                if (value != null) {
                    value.e(t.getAudioTrackIndex());
                }
                t.setHasReadTextAudio(false);
                t.setAudioTrackIndex(-1);
            }
            this.this$0.a((TextStickerData) t);
            this.this$0.ac();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.d<? extends h.p<? extends TextStickerData, ? extends String>>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.d<? extends h.p<? extends TextStickerData, ? extends String>> dVar) {
            TextStickerData textStickerData;
            String str;
            com.bytedance.jedi.arch.d<? extends h.p<? extends TextStickerData, ? extends String>> dVar2 = dVar;
            String str2 = "";
            h.f.b.l.d(bVar, str2);
            h.f.b.l.d(dVar2, str2);
            T t = dVar2.f39404b;
            if (!(t == null || (textStickerData = (TextStickerData) t.getFirst()) == null)) {
                if (t == null || (str = (String) t.getSecond()) == null) {
                    str = com.ss.android.ugc.aweme.editSticker.text.bean.t.i(textStickerData.getTextWrapList());
                }
                com.ss.android.ugc.gamora.editor.sticker.read.d X = this.this$0.X();
                if (X != null) {
                    String speakerID = textStickerData.getSpeakerID();
                    if (speakerID != null) {
                        str2 = speakerID;
                    }
                    X.a(str, str2, textStickerData);
                }
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
        this.z = (FrameLayout) c2;
        View c3 = c(R.id.ek5);
        h.f.b.l.b(c3, "");
        this.A = (FrameLayout) c3;
        View c4 = c(R.id.ek1);
        h.f.b.l.b(c4, "");
        this.B = (FrameLayout) c4;
        View c5 = c(R.id.ek4);
        h.f.b.l.b(c5, "");
        this.C = (FrameLayout) c5;
        View c6 = c(R.id.deg);
        h.f.b.l.b(c6, "");
        this.D = (FrameLayout) c6;
        View c7 = c(R.id.aqu);
        h.f.b.l.b(c7, "");
        this.E = (FrameLayout) c7;
        View c8 = c(R.id.b4o);
        h.f.b.l.b(c8, "");
        this.F = (FrameLayout) c8;
    }

    /* access modifiers changed from: package-private */
    public static final class aj extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.u<? extends Float, ? extends Float, ? extends Float>, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(c cVar) {
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
            FrameLayout frameLayout = this.this$0.C;
            if (frameLayout == null) {
                h.f.b.l.a("liveCDLayout");
            }
            com.ss.android.ugc.gamora.editor.u.a(frameLayout, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            FrameLayout frameLayout2 = this.this$0.D;
            if (frameLayout2 == null) {
                h.f.b.l.a("qaLayout");
            }
            com.ss.android.ugc.gamora.editor.u.a(frameLayout2, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            FrameLayout frameLayout3 = this.this$0.E;
            if (frameLayout3 == null) {
                h.f.b.l.a("duetLayout");
            }
            com.ss.android.ugc.gamora.editor.u.a(frameLayout3, ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class am extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.m, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        am(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
            r0.n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
            if (r2 != null) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
            r3.this$0.R().h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
            if (r2 != null) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
            r1 = r3.this$0.w;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            if (r1 != null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
            h.f.b.l.a("donationStickerViewModel");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
            r1.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
            if (r2 != null) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
            r0 = r3.this$0.t;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
            if (r0 == null) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
            ((com.ss.android.ugc.gamora.editor.a) r0).f145663b.n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
            if (r2 != null) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            r0 = r3.this$0.u;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
            if (r0 == null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
            ((com.ss.android.ugc.gamora.editor.a) r0).f145663b.n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
            return h.z.f158842a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
            if (r2.intValue() != 8) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
            if (r2.intValue() == 1) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
            if (r2.intValue() == 2) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0099, code lost:
            if (r2.intValue() == 3) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
            if (r2.intValue() == 4) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
            if (r2 == null) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
            if (r2.intValue() == 6) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
            if (r2.intValue() == 7) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
            r3.this$0.S().b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
            if (r2 != null) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
            r3.this$0.Z().i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
            if (r2 != null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
            r0 = r3.this$0.M;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (r0 == null) goto L_0x003c;
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b r4, com.bytedance.jedi.arch.m r5) {
            /*
            // Method dump skipped, instructions count: 180
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.am.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, com.bytedance.jedi.arch.ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void a(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        h.f.b.l.d(marginLayoutParams, "");
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = this.M;
        if (aVar != null) {
            aVar.k();
        }
        com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
        if (aaVar != null) {
            aaVar.I();
        }
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
        if (hVar != null) {
            hVar.I();
        }
        Z().a(i2, i3, new int[]{marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin});
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.a
    public final b.i<h.z> a(com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.gamora.editor.ab abVar, h.f.a.b<? super String, String> bVar) {
        b.i<h.z> iVar;
        b.i<h.z> iVar2;
        b.i<h.z> iVar3;
        b.i<h.z> iVar4;
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(abVar, "");
        b.i[] iVarArr = new b.i[5];
        com.ss.android.ugc.gamora.editor.aa aaVar = this.f146432k;
        if (aaVar == null || (iVar = aaVar.a(gVar, abVar, bVar)) == null) {
            iVar = b.i.a(h.z.f158842a);
            h.f.b.l.b(iVar, "");
        }
        iVarArr[0] = iVar;
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = this.f146430i;
        if (hVar == null || (iVar2 = hVar.a(gVar, abVar, bVar)) == null) {
            iVar2 = b.i.a(h.z.f158842a);
            h.f.b.l.b(iVar2, "");
        }
        iVarArr[1] = iVar2;
        com.ss.android.ugc.gamora.editor.o oVar = this.t;
        if (oVar == null || (iVar3 = oVar.a(gVar, abVar, bVar)) == null) {
            iVar3 = b.i.a(h.z.f158842a);
            h.f.b.l.b(iVar3, "");
        }
        iVarArr[2] = iVar3;
        com.ss.android.ugc.gamora.editor.l lVar = this.u;
        if (lVar == null || (iVar4 = lVar.a(gVar, abVar, bVar)) == null) {
            iVar4 = b.i.a(h.z.f158842a);
            h.f.b.l.b(iVar4, "");
        }
        iVarArr[3] = iVar4;
        iVarArr[4] = U().a(gVar, abVar, bVar);
        b.i<Void> b2 = b.i.b((Collection<? extends b.i<?>>) h.a.n.b(iVarArr));
        h.f.b.l.b(b2, "");
        if (b2.a()) {
            b.i<h.z> a2 = b.i.a(h.z.f158842a);
            h.f.b.l.b(a2, "");
            return a2;
        }
        b.i<TContinuationResult> a3 = b2.a(p.f146470a);
        h.f.b.l.b(a3, "");
        return a3;
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.core.c.b(com.ss.android.ugc.asve.editor.g, com.ss.android.ugc.gamora.editor.ab, h.f.a.b):b.i");
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends com.bytedance.jedi.arch.af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends com.bytedance.jedi.arch.af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends com.bytedance.jedi.arch.af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
