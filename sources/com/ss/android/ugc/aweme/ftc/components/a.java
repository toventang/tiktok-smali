package com.ss.android.ugc.aweme.ftc.components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel;
import com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.c;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel;
import com.ss.android.ugc.aweme.ftc.g.a;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.c.b;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel;
import com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel;
import com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.gamora.editor.rootscene.d implements com.bytedance.jedi.arch.b, com.bytedance.o.a, com.ss.android.ugc.gamora.editor.ab, com.ss.android.ugc.gamora.editor.s {

    /* renamed from: f  reason: collision with root package name */
    public static final n f97537f = new n((byte) 0);
    private com.bytedance.f.a.a.j A;
    private com.ss.android.ugc.aweme.infoSticker.i B;
    private bq C;
    private com.ss.android.ugc.aweme.widgetcompat.a D;
    private boolean E;
    private final com.ss.android.ugc.aweme.ftc.f F = com.ss.android.ugc.aweme.ftc.f.f98455a;
    private final com.bytedance.o.f G;

    /* renamed from: b  reason: collision with root package name */
    final h.h f97538b = h.i.a(h.m.NONE, new C2349a(this));

    /* renamed from: c  reason: collision with root package name */
    public VideoPublishEditModel f97539c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f97540d = h.i.a(h.m.NONE, new i(this));

    /* renamed from: e  reason: collision with root package name */
    final h.h f97541e = h.i.a(h.m.NONE, new k(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f97542g = h.i.a((h.f.a.a) new ah(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f97543h = h.i.a((h.f.a.a) new ai(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f97544i = h.i.a(h.m.NONE, new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f97545j = h.i.a(h.m.NONE, new l(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f97546k = h.i.a(h.m.NONE, new m(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f97547l = h.i.a(h.m.NONE, new e(this));
    private final h.h t = h.i.a(h.m.NONE, new f(this));
    private final h.h v = h.i.a(h.m.NONE, new g(this));
    private final h.h w = h.i.a(h.m.NONE, new h(this));
    private final h.h x = h.i.a(h.m.NONE, new j(this));
    private final h.h y = h.i.a(h.m.NONE, new b(this));
    private final h.h z = h.i.a(h.m.NONE, new c(this));

    static {
        Covode.recordClassIndex(61971);
    }

    private final com.ss.android.ugc.aweme.ftc.components.corner.a ab() {
        return (com.ss.android.ugc.aweme.ftc.components.corner.a) this.y.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.w E() {
        return (com.ss.android.ugc.gamora.editor.w) this.f97542g.getValue();
    }

    /* renamed from: F */
    public final com.ss.android.ugc.aweme.ftc.components.sticker.core.c G() {
        return (com.ss.android.ugc.aweme.ftc.components.sticker.core.c) this.f97543h.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.ftc.components.toolbar.k H() {
        return (com.ss.android.ugc.aweme.ftc.components.toolbar.k) this.f97544i.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.ftc.components.audiorecord.c I() {
        return (com.ss.android.ugc.aweme.ftc.components.audiorecord.c) this.f97545j.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.ftc.components.audioeffect.e J() {
        return (com.ss.android.ugc.aweme.ftc.components.audioeffect.e) this.f97546k.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.ftc.components.effect.a K() {
        return (com.ss.android.ugc.aweme.ftc.components.effect.a) this.f97547l.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.filter.core.a L() {
        return (com.ss.android.ugc.gamora.editor.filter.core.a) this.t.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.ftc.components.sticker.core.a M() {
        return (com.ss.android.ugc.aweme.ftc.components.sticker.core.a) this.v.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.e.c N() {
        return (com.ss.android.ugc.gamora.editor.e.c) this.w.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.multiedit.a O() {
        return (com.ss.android.ugc.gamora.editor.multiedit.a) this.x.getValue();
    }

    public final com.ss.android.ugc.aweme.ftc.components.cutmusic.a P() {
        return (com.ss.android.ugc.aweme.ftc.components.cutmusic.a) this.z.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final boolean W() {
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editor.s
    public final void X() {
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(Effect effect, CustomStickerInfo customStickerInfo) {
        h.f.b.l.d(effect, "");
        h.f.b.l.d(customStickerInfo, "");
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class n {
        static {
            Covode.recordClassIndex(61994);
        }

        private n() {
        }

        public /* synthetic */ n(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        ab().a(z2);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(boolean z2, boolean z3, Runnable runnable) {
        h.f.b.l.d(runnable, "");
        VideoPublishEditModel videoPublishEditModel = this.f97539c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f97539c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            if (TextUtils.isEmpty(videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath)) {
                VideoPublishEditModel videoPublishEditModel3 = this.f97539c;
                if (videoPublishEditModel3 == null) {
                    h.f.b.l.a("mModel");
                }
                videoPublishEditModel3.mvCreateVideoData.videoCoverImgPath = com.ss.android.ugc.aweme.port.in.l.f115658a.d().a().a();
            }
            com.ss.android.ugc.asve.editor.g U = U();
            VideoPublishEditModel videoPublishEditModel4 = this.f97539c;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            String str = videoPublishEditModel4.mvCreateVideoData.videoCoverImgPath;
            VideoPublishEditModel videoPublishEditModel5 = this.f97539c;
            if (videoPublishEditModel5 == null) {
                h.f.b.l.a("mModel");
            }
            new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c(U, str, videoPublishEditModel5.mvCreateVideoData.videoCoverStartTime, z.f97604a, new aa(this, z2, z3, runnable));
        } else {
            a(false, z2, z3, runnable);
        }
        VideoPublishEditModel videoPublishEditModel6 = this.f97539c;
        if (videoPublishEditModel6 == null) {
            h.f.b.l.a("mModel");
        }
        h.f.b.l.d(videoPublishEditModel6, "");
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel6.creationId).a("shoot_way", videoPublishEditModel6.mShootWay).a("enter_from", "video_edit_page");
        if (videoPublishEditModel6.draftId != 0) {
            a2.a("draft_id", videoPublishEditModel6.draftId);
        }
        com.ss.android.ugc.aweme.common.r.a("next", a2.f149193a);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(boolean z2, boolean z3, boolean z4, Runnable runnable) {
        h.f.b.l.d(runnable, "");
        b(z2, z3, z4, runnable);
    }

    public final void a(boolean z2, boolean z3, Intent intent) {
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        com.ss.android.ugc.gamora.editor.c.c.a(new b.c(z2, z3, t2, intent));
    }

    @Override // com.ss.android.ugc.gamora.editor.s
    public final void a(String str, int i2, int i3, int i4, boolean z2) {
        h.f.b.l.d(str, "");
        ac();
        b.i.b(new ac(this, str, i2, i3, z2), b.i.f4824a).a(new ad(this, str, z2, i4, i2), b.i.f4826c, null);
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
    public final com.bytedance.jedi.arch.ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$a  reason: collision with other inner class name */
    public static final class C2349a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.indicator.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2349a(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.C2349a.invoke():com.bytedance.als.b");
        }
    }

    static final class aa implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f97556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f97557c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f97558d;

        static {
            Covode.recordClassIndex(61973);
        }

        aa(a aVar, boolean z, boolean z2, Runnable runnable) {
            this.f97555a = aVar;
            this.f97556b = z;
            this.f97557c = z2;
            this.f97558d = runnable;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a
        public final void a() {
            this.f97555a.a(false, this.f97556b, this.f97557c, this.f97558d);
        }
    }

    public static final class ae implements VEListener.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f97571b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f97572c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Intent f97573d;

        static {
            Covode.recordClassIndex(61977);
        }

        @Override // com.ss.android.vesdk.VEListener.p
        public final void a() {
            this.f97570a.a(this.f97571b, this.f97572c, this.f97573d);
        }

        @Override // com.ss.android.vesdk.VEListener.p
        public final void b() {
            this.f97570a.a(this.f97571b, this.f97572c, this.f97573d);
        }

        ae(a aVar, boolean z, boolean z2, Intent intent) {
            this.f97570a = aVar;
            this.f97571b = z;
            this.f97572c = z2;
            this.f97573d = intent;
        }
    }

    static final class ah extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.w> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(61980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.w invoke() {
            com.ss.android.ugc.gamora.editor.w wVar = new com.ss.android.ugc.gamora.editor.w();
            this.this$0.a(R.id.atb, wVar, "EditStickerDeleteScene");
            return wVar;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.corner.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.corner.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.corner.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.corner.a> r1 = com.ss.android.ugc.aweme.ftc.components.corner.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.b.invoke():com.bytedance.als.b");
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.cutmusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.cutmusic.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.cutmusic.a> r1 = com.ss.android.ugc.aweme.ftc.components.cutmusic.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.toolbar.k> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.toolbar.k] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.toolbar.k invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.toolbar.k> r1 = com.ss.android.ugc.aweme.ftc.components.toolbar.k.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.d.invoke():com.bytedance.als.b");
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.effect.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61985);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.effect.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.effect.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.effect.a> r1 = com.ss.android.ugc.aweme.ftc.components.effect.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.e.invoke():com.bytedance.als.b");
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.filter.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.core.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.core.a> r1 = com.ss.android.ugc.gamora.editor.filter.core.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.f.invoke():com.bytedance.als.b");
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.sticker.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ftc.components.sticker.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.sticker.core.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.sticker.core.a> r1 = com.ss.android.ugc.aweme.ftc.components.sticker.core.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.g.invoke():com.bytedance.als.b");
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.e.c> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.e.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.e.c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.e.c> r1 = com.ss.android.ugc.gamora.editor.e.c.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.h.invoke():com.bytedance.als.b");
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.gesture.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.gesture.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.gesture.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.gesture.a> r1 = com.ss.android.ugc.gamora.editor.gesture.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.i.invoke():com.bytedance.als.b");
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.multiedit.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.multiedit.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.multiedit.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.multiedit.a> r1 = com.ss.android.ugc.gamora.editor.multiedit.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.j.invoke():com.bytedance.als.b");
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.volume.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(61991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ftc.components.volume.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.volume.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.volume.a> r1 = com.ss.android.ugc.aweme.ftc.components.volume.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.k.invoke():com.bytedance.als.b");
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.audiorecord.c> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(61992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.audiorecord.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.audiorecord.c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.audiorecord.c> r1 = com.ss.android.ugc.aweme.ftc.components.audiorecord.c.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.l.invoke():com.bytedance.als.b");
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.audioeffect.e> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(61993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.audioeffect.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ftc.components.audioeffect.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.audioeffect.e> r1 = com.ss.android.ugc.aweme.ftc.components.audioeffect.e.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.m.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ab
    public final bq T() {
        bq bqVar = this.C;
        if (bqVar == null) {
            h.f.b.l.a("mVideoSizeProvider");
        }
        return bqVar;
    }

    public final com.ss.android.ugc.asve.editor.g U() {
        return N().C().getValue();
    }

    public final void V() {
        com.ss.android.ugc.aweme.widgetcompat.a aVar = this.D;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.D = null;
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
    public final void x() {
        super.x();
        ar.f132216a.b();
    }

    static final class ai extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.sticker.core.c> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(61981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ftc.components.sticker.core.c invoke() {
            com.bytedance.scene.j a2 = this.this$0.a("FTCEditStickerScene");
            if (a2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    private final void ae() {
        N().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
        ah();
        O().a();
    }

    /* access modifiers changed from: package-private */
    public final void Q() {
        VideoPublishEditModel videoPublishEditModel = this.f97539c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f97539c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel2.isRetakeVideo()) {
                ae();
            }
        }
    }

    public final void S() {
        N().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
        com.ss.android.ugc.aweme.ftc.components.audiorecord.c I = I();
        if (I != null) {
            I.a();
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        com.ss.android.ugc.tools.utils.q.a("VEVideoPublishEditActivity onResume EditRootScene");
        this.E = false;
        ar.f132216a.a(this.f42913m, (ViewGroup) this.n);
    }

    public static final class ac implements Callable<Pair<Integer, com.ss.android.ugc.aweme.shortvideo.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97560a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f97561b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f97562c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f97563d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f97564e;

        static {
            Covode.recordClassIndex(61975);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Pair<Integer, com.ss.android.ugc.aweme.shortvideo.d> call() {
            com.ss.android.ugc.asve.editor.g U = this.f97560a.U();
            if (U == null) {
                return null;
            }
            int a2 = U.a(this.f97561b, this.f97562c, this.f97563d);
            U.t();
            if (a2 < 0 || !this.f97564e) {
                return new Pair(Integer.valueOf(a2), null);
            }
            return new Pair(Integer.valueOf(a2), k.b.a(this.f97561b, true, null));
        }

        ac(a aVar, String str, int i2, int i3, boolean z) {
            this.f97560a = aVar;
            this.f97561b = str;
            this.f97562c = i2;
            this.f97563d = i3;
            this.f97564e = z;
        }
    }

    private final void ac() {
        if (this.D == null) {
            com.ss.android.ugc.aweme.widgetcompat.a a2 = com.ss.android.ugc.aweme.widgetcompat.a.a(this.f42913m, t().getResources().getString(R.string.ewe));
            if (a2 != null) {
                a2.setIndeterminate(true);
            } else {
                a2 = null;
            }
            this.D = a2;
        }
    }

    private final void ad() {
        VideoPublishEditModel videoPublishEditModel = this.f97539c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel.veAudioEffectParam = null;
        VideoPublishEditModel videoPublishEditModel2 = this.f97539c;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel2.veAudioRecorderParam = null;
        VideoPublishEditModel videoPublishEditModel3 = this.f97539c;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel3.mSelectedId = 0;
        VideoPublishEditModel videoPublishEditModel4 = this.f97539c;
        if (videoPublishEditModel4 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel4.mTimeEffect = null;
        VideoPublishEditModel videoPublishEditModel5 = this.f97539c;
        if (videoPublishEditModel5 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel5.mCurFilterIds = null;
        VideoPublishEditModel videoPublishEditModel6 = this.f97539c;
        if (videoPublishEditModel6 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel6.mSelectedFilterId = null;
    }

    private final void ah() {
        L().e();
        com.ss.android.ugc.aweme.ftc.components.audioeffect.e J = J();
        if (J != null) {
            VideoPublishEditModel videoPublishEditModel = this.f97539c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            J.a(videoPublishEditModel);
        }
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.lifecycle.ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(EditEffectVideoModel.class);
        h.f.b.l.b(a2, "");
        ((EditEffectVideoModel) a2).i().setValue(null);
        Y();
        ad();
        VideoPublishEditModel videoPublishEditModel2 = this.f97539c;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel2.commentVideoModel != null) {
            VideoPublishEditModel videoPublishEditModel3 = this.f97539c;
            if (videoPublishEditModel3 == null) {
                h.f.b.l.a("mModel");
            }
            CommentVideoModel commentVideoModel = videoPublishEditModel3.commentVideoModel;
            if (commentVideoModel != null) {
                commentVideoModel.setStartTime(0);
            }
            VideoPublishEditModel videoPublishEditModel4 = this.f97539c;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            CommentVideoModel commentVideoModel2 = videoPublishEditModel4.commentVideoModel;
            if (commentVideoModel2 != null) {
                commentVideoModel2.setEndTime(0);
            }
        }
    }

    public final void R() {
        String str;
        String str2;
        boolean aa2 = aa();
        if (aa2) {
            new a.C0731a(this.f42913m).b(R.string.bjw).b(R.string.bjx, (DialogInterface.OnClickListener) null, false).a(R.string.bjy, (DialogInterface.OnClickListener) new ag(new p(this, aa2)), false).a().b().show();
        } else {
            b(aa2);
        }
        boolean b2 = O().b();
        com.ss.android.ugc.tools.f.b c2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.c();
        if (aa2) {
            str = "1";
        } else {
            str = "0";
        }
        com.ss.android.ugc.tools.f.b a2 = c2.a("is_warn_shown", str);
        if (b2) {
            str2 = "single";
        } else {
            str2 = "multiple";
        }
        com.ss.android.ugc.aweme.common.r.a("click_video_trim", a2.a("segment_type", str2).f149193a);
    }

    public final void Z() {
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditInfoStickerViewModel.class);
        h.f.b.l.b(a2, "");
        EditInfoStickerViewModel editInfoStickerViewModel = (EditInfoStickerViewModel) a2;
        com.ss.android.ugc.asve.editor.g U = U();
        if (U == null) {
            h.f.b.l.b();
        }
        Integer valueOf = Integer.valueOf(U.G());
        com.ss.android.ugc.asve.editor.g U2 = U();
        if (U2 == null) {
            h.f.b.l.b();
        }
        editInfoStickerViewModel.a(new h.p<>(valueOf, Integer.valueOf(U2.j())));
    }

    public final boolean Y() {
        VideoPublishEditModel videoPublishEditModel = this.f97539c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel.mTimeEffect == null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f97539c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            if (com.bytedance.common.utility.h.a(videoPublishEditModel2.mEffectList)) {
                VideoPublishEditModel videoPublishEditModel3 = this.f97539c;
                if (videoPublishEditModel3 == null) {
                    h.f.b.l.a("mModel");
                }
                if (!videoPublishEditModel3.hasInfoStickers() && !G().N()) {
                    return false;
                }
            }
        }
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = G().f97946i;
        if (aVar != null) {
            aVar.j();
        }
        G().H().e();
        ArrayList<EffectPointModel> r2 = N().r();
        dmt.av.video.g<dmt.av.video.p> p2 = N().p();
        if (!com.bytedance.common.utility.h.a(r2)) {
            int size = r2.size();
            int[] iArr = new int[size];
            String[] strArr = new String[r2.size()];
            for (int i2 = 0; i2 < size; i2++) {
                EffectPointModel effectPointModel = r2.get(i2);
                h.f.b.l.b(effectPointModel, "");
                iArr[i2] = effectPointModel.getIndex();
                EffectPointModel effectPointModel2 = r2.get(i2);
                h.f.b.l.b(effectPointModel2, "");
                strArr[i2] = effectPointModel2.getUuid();
            }
            p2.setValue(dmt.av.video.p.b(iArr, strArr));
        }
        VideoPublishEditModel videoPublishEditModel4 = this.f97539c;
        if (videoPublishEditModel4 == null) {
            h.f.b.l.a("mModel");
        }
        if (com.bytedance.common.utility.h.a(videoPublishEditModel4.mEffectList)) {
            return true;
        }
        VideoPublishEditModel videoPublishEditModel5 = this.f97539c;
        if (videoPublishEditModel5 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel5.mEffectList.clear();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0.veAudioRecorderParam.getNeedOriginalSound() == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if ((!h.f.b.l.a((java.lang.Object) r0.getKey(), (java.lang.Object) "0")) != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0092  */
    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean aa() {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.aa():boolean");
    }

    public static final class o implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97588a;

        static {
            Covode.recordClassIndex(61995);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(a aVar) {
            this.f97588a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.v.a
        public final void a(String[] strArr, int[] iArr) {
            if (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0) {
                Activity activity = this.f97588a.f42913m;
                if (activity == null) {
                    h.f.b.l.b();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(R.string.axc).a();
            } else if (iArr[0] == 0) {
                this.f97588a.S();
            } else {
                Activity activity2 = this.f97588a.f42913m;
                if (activity2 == null) {
                    h.f.b.l.b();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(activity2).a(R.string.axc).a();
            }
        }
    }

    public static final class r extends com.bytedance.f.a.a.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97596a;

        static {
            Covode.recordClassIndex(61998);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(a aVar) {
            this.f97596a = aVar;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean c(MotionEvent motionEvent) {
            com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = this.f97596a.G().f97946i;
            if (aVar != null) {
                return aVar.k();
            }
            return false;
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class z implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static final z f97604a = new z();

        static {
            Covode.recordClassIndex(62006);
        }

        z() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.b
        public final void a(String str) {
            com.ss.android.ugc.aweme.port.in.g.a().I().a(str);
        }
    }

    public static final /* synthetic */ VideoPublishEditModel a(a aVar) {
        VideoPublishEditModel videoPublishEditModel = aVar.f97539c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        return videoPublishEditModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class v<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97600a;

        static {
            Covode.recordClassIndex(62002);
        }

        v(a aVar) {
            this.f97600a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f97600a;
            aVar.a(true);
            aVar.K().b();
            aVar.N().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            this.f97600a.Z();
        }
    }

    static final class w<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97601a;

        static {
            Covode.recordClassIndex(62003);
        }

        w(a aVar) {
            this.f97601a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f97601a;
            com.ss.android.ugc.aweme.ftc.components.audiorecord.c I = aVar.I();
            if (I != null) {
                I.b();
            }
            aVar.N().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        }
    }

    public static final class af implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f97575b;

        static {
            Covode.recordClassIndex(61978);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.c
        public final void a(Object obj) {
            this.f97574a.P().a(this.f97575b);
            int a2 = fa.a(a.a(this.f97574a).mMusicPath);
            com.ss.android.ugc.aweme.ftc.components.cutmusic.a P = this.f97574a.P();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean");
            P.a((com.ss.android.ugc.aweme.shortvideo.d) obj, a2);
        }

        af(a aVar, int i2) {
            this.f97574a = aVar;
            this.f97575b = i2;
        }
    }

    static final class s<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97597a;

        static {
            Covode.recordClassIndex(61999);
        }

        s(a aVar) {
            this.f97597a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            View c2 = this.f97597a.c(R.id.c9b);
            h.f.b.l.b(c2, "");
            FrameLayout frameLayout = (FrameLayout) c2;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            h.f.b.l.b(num, "");
            marginLayoutParams.topMargin = num.intValue();
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        Integer num;
        O().a(z2, true);
        VideoPublishEditModel videoPublishEditModel = this.f97539c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        if (curMultiEditVideoRecordData != null) {
            com.ss.android.ugc.asve.editor.g U = U();
            if (U != null) {
                num = Integer.valueOf(U.j());
            } else {
                num = null;
            }
            curMultiEditVideoRecordData.preVideoDuration = num.intValue();
        }
    }

    static final class q<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f97592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f97593c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f97594d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Runnable f97595e;

        static {
            Covode.recordClassIndex(61997);
        }

        q(a aVar, boolean z, boolean z2, boolean z3, Runnable runnable) {
            this.f97591a = aVar;
            this.f97592b = z;
            this.f97593c = z2;
            this.f97594d = z3;
            this.f97595e = runnable;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            this.f97591a.V();
            if (this.f97592b) {
                VideoPublishEditModel a2 = a.a(this.f97591a);
                new bn("VEVideoPublishEditActivity");
                com.ss.android.ugc.aweme.draft.model.c b2 = bn.b(a2);
                h.f.b.l.b(b2, "");
                b2.I = System.currentTimeMillis();
                com.ss.android.ugc.aweme.port.in.g.a().c().a(b2);
                com.ss.android.ugc.aweme.port.in.g.a().c().a(b2, false);
                if (!(this.f97591a.f42913m instanceof VEVideoPublishEditActivity)) {
                    return null;
                }
                Activity activity = this.f97591a.f42913m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
                ((VEVideoPublishEditActivity) activity).j();
                return null;
            }
            this.f97591a.b(this.f97593c, this.f97594d, this.f97595e);
            return null;
        }
    }

    static final class t<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97598a;

        static {
            Covode.recordClassIndex(62000);
        }

        t(a aVar) {
            this.f97598a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f97598a;
            com.ss.android.ugc.aweme.ftc.components.sticker.core.c F = aVar.G();
            ViewGroup.MarginLayoutParams a2 = aVar.N().a();
            int b2 = aVar.N().b();
            int c2 = aVar.N().c();
            h.f.b.l.d(a2, "");
            com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar2 = F.f97946i;
            if (aVar2 != null) {
                aVar2.h();
            }
            F.H().a(b2, c2, new int[]{a2.leftMargin, a2.topMargin, a2.rightMargin, a2.bottomMargin});
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(com.ss.android.ugc.aweme.infoSticker.i iVar) {
        h.f.b.l.d(iVar, "");
        this.B = iVar;
    }

    public final void b(boolean z2) {
        ae();
        c(z2);
        int b2 = N().b();
        int c2 = N().c();
        if (U() != null) {
            com.ss.android.ugc.asve.editor.g U = U();
            if (U == null) {
                h.f.b.l.b();
            }
            VESize a2 = U.a(b2, c2);
            if (a2.width > 0 && a2.height > 0) {
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.c.a(b2, c2, a2.width, a2.height);
            }
        }
    }

    static final class ab<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97559a;

        static {
            Covode.recordClassIndex(61974);
        }

        ab(a aVar) {
            this.f97559a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            LiveData<Boolean> c2;
            com.ss.android.ugc.tools.utils.q.a("receive FirstFrameVisible event in edit page");
            a aVar = this.f97559a;
            ((com.ss.android.ugc.gamora.editor.gesture.a) aVar.f97540d.getValue()).a();
            aVar.L().a();
            ((com.ss.android.ugc.gamora.editor.filter.indicator.a) aVar.f97538b.getValue()).a();
            aVar.e(aVar.E());
            aVar.Q();
            a aVar2 = this.f97559a;
            aVar2.aq().k();
            VideoPublishEditModel videoPublishEditModel = aVar2.f97539c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            if (bp.f(videoPublishEditModel)) {
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.a();
            }
            a aVar3 = this.f97559a;
            aVar3.N().Q().observe(aVar3, new s(aVar3));
            aVar3.N().X().observe(aVar3, new t(aVar3));
            aVar3.N().e().observe(aVar3, new u(aVar3));
            Activity activity = aVar3.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.lifecycle.ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(EditEffectVideoModel.class);
            h.f.b.l.b(a2, "");
            ((EditEffectVideoModel) a2).k().observe(aVar3, new v(aVar3));
            com.ss.android.ugc.aweme.ftc.components.audiorecord.c I = aVar3.I();
            if (!(I == null || (c2 = I.c()) == null)) {
                c2.observe(aVar3, new w(aVar3));
            }
            aVar3.O().c().observe(aVar3, new x(aVar3));
            aVar3.H().b().observe(aVar3, new y(aVar3));
        }
    }

    static final class u<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97599a;

        static {
            Covode.recordClassIndex(62001);
        }

        u(a aVar) {
            this.f97599a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.df.e.a("receive prepare done event in edit page");
            a aVar = this.f97599a;
            com.ss.android.ugc.tools.utils.q.a("VEVideoPublishEditActivity initAllStickerModules");
            aVar.G().I();
            com.ss.android.ugc.aweme.ftc.components.sticker.core.c F = aVar.G();
            if (!F.f97948k) {
                com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar2 = F.f97946i;
                if (aVar2 != null) {
                    aVar2.e();
                }
                F.J();
                com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar3 = F.f97946i;
                if (aVar3 != null) {
                    aVar3.a(new c.u(F));
                }
                com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar4 = F.f97946i;
                if (aVar4 != null) {
                    aVar4.a(new c.v(F));
                }
                com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar5 = F.f97946i;
                if (aVar5 != null) {
                    aVar5.a(new c.w(F));
                }
                com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar6 = F.f97946i;
                if (aVar6 != null) {
                    aVar6.a(new c.x());
                }
                com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar7 = F.f97946i;
                if (aVar7 != null) {
                    aVar7.a(new c.y(F));
                }
                F.f97948k = true;
            }
            aVar.H().a(4, true);
            aVar.H().a(3, true);
            VideoPublishEditModel videoPublishEditModel = aVar.f97539c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel.isMultiVideoEdit()) {
                VideoPublishEditModel videoPublishEditModel2 = aVar.f97539c;
                if (videoPublishEditModel2 == null) {
                    h.f.b.l.a("mModel");
                }
                if (videoPublishEditModel2.isRetakeVideo()) {
                    aVar.c(false);
                }
            }
        }
    }

    static final class x<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97602a;

        static {
            Covode.recordClassIndex(62004);
        }

        x(a aVar) {
            this.f97602a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
            if (r1 != r0.j()) goto L_0x0077;
         */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 205
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.x.onChanged(java.lang.Object):void");
        }
    }

    public a(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.G = fVar;
        com.ss.android.ugc.aweme.sticker.text.b.a();
        com.ss.android.ugc.aweme.sticker.text.c.a();
        com.ss.android.ugc.aweme.sticker.text.c.a(new com.ss.android.ugc.aweme.editSticker.a.f());
    }

    private final void a(com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar) {
        com.ss.android.ugc.aweme.editSticker.text.a.c a2;
        String str;
        String effectId;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<com.ss.android.ugc.aweme.editSticker.text.view.q> n2 = aVar.n();
            int size = n2.size();
            for (int i2 = 0; i2 < size; i2++) {
                TextStickerData data = n2.get(i2).getData();
                if (!(data == null || (a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(data.getFontType())) == null)) {
                    if (a2.f88294b == null) {
                        str = "";
                    } else {
                        str = a2.f88294b;
                    }
                    sb.append(str);
                    if (a2.f88301i == null) {
                        effectId = "";
                    } else {
                        effectId = a2.f88301i.getEffectId();
                    }
                    sb2.append(effectId);
                    if (i2 != n2.size() - 1) {
                        sb.append(",");
                        sb2.append(",");
                    }
                }
            }
            VideoPublishEditModel videoPublishEditModel = this.f97539c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel.textTypes = sb.toString();
            VideoPublishEditModel videoPublishEditModel2 = this.f97539c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel2.textEffectIds = sb2.toString();
            return;
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f97539c;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel3.textTypes = "";
        VideoPublishEditModel videoPublishEditModel4 = this.f97539c;
        if (videoPublishEditModel4 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel4.textEffectIds = "";
    }

    public static final class ad implements b.g<Pair<Integer, com.ss.android.ugc.aweme.shortvideo.d>, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f97566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f97567c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f97568d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f97569e;

        static {
            Covode.recordClassIndex(61976);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(b.i<Pair<Integer, com.ss.android.ugc.aweme.shortvideo.d>> iVar) {
            boolean z;
            com.ss.android.ugc.aweme.shortvideo.d dVar;
            this.f97565a.V();
            if (iVar == null) {
                return null;
            }
            Pair<Integer, com.ss.android.ugc.aweme.shortvideo.d> d2 = iVar.d();
            boolean z2 = false;
            if (iVar.c() || iVar.b()) {
                z = true;
            } else {
                z = false;
            }
            if (d2 == null || d2.first == null || ((Number) d2.first).intValue() < 0) {
                z2 = true;
            }
            if (z || z2) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f97565a.q()).a(this.f97565a.c_(R.string.dd_)).a();
                return null;
            }
            if (this.f97565a.Y()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f97565a.q()).a(this.f97565a.c_(R.string.dda)).a();
            }
            if (d2 != null) {
                dVar = (com.ss.android.ugc.aweme.shortvideo.d) d2.second;
            } else {
                dVar = null;
            }
            com.ss.android.ugc.asve.editor.g U = this.f97565a.U();
            if (U == null) {
                return null;
            }
            int j2 = U.j();
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null || cVar.getShootDuration() <= 0) {
                this.f97565a.P().a(j2);
            } else {
                int a2 = fa.a(this.f97566b);
                if (Math.abs(a2 - cVar.getShootDuration()) >= 1000) {
                    this.f97565a.P().a(Math.min(j2, cVar.getShootDuration()));
                } else {
                    this.f97565a.P().a(Math.min(j2, a2));
                }
            }
            if (this.f97567c) {
                this.f97565a.P().a(dVar, this.f97568d);
            }
            Activity activity = this.f97565a.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.lifecycle.ac a3 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(EditEffectVideoModel.class);
            h.f.b.l.b(a3, "");
            ((EditEffectVideoModel) a3).d().setValue(Integer.valueOf(j2));
            int G = U.G();
            Activity activity2 = this.f97565a.f42913m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a4 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity2).a(EditInfoStickerViewModel.class);
            h.f.b.l.b(a4, "");
            ((EditInfoStickerViewModel) a4).a(new h.p<>(Integer.valueOf(G), Integer.valueOf(j2)));
            androidx.lifecycle.i lifecycle = this.f97565a.getLifecycle();
            h.f.b.l.b(lifecycle, "");
            if (lifecycle.a() == i.b.RESUMED) {
                androidx.lifecycle.t<dmt.av.video.t> v = this.f97565a.N().v();
                v.setValue(dmt.av.video.t.b((long) this.f97569e));
                v.setValue(dmt.av.video.t.a());
            }
            if (!com.ss.android.ugc.gamora.editor.t.b(a.a(this.f97565a))) {
                this.f97565a.aq().a(bp.a(a.a(this.f97565a), this.f97566b));
            }
            return null;
        }

        ad(a aVar, String str, boolean z, int i2, int i3) {
            this.f97565a = aVar;
            this.f97566b = str;
            this.f97567c = z;
            this.f97568d = i2;
            this.f97569e = i3;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Object a2 = this.G.a((Type) VideoPublishEditModel.class, (String) null);
        h.f.b.l.b(a2, "");
        this.f97539c = (VideoPublishEditModel) a2;
        Object a3 = this.G.a((Type) bq.class, (String) null);
        h.f.b.l.b(a3, "");
        this.C = (bq) a3;
        com.bytedance.f.a.a.j jVar = this.A;
        if (jVar == null) {
            h.f.b.l.a("gestureService");
        }
        com.ss.android.ugc.gamora.editor.w E2 = E();
        VideoPublishEditModel videoPublishEditModel = this.f97539c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        com.ss.android.ugc.aweme.ftc.g.a aVar = new com.ss.android.ugc.aweme.ftc.g.a(jVar, E2, videoPublishEditModel);
        h.f.b.l.d(this, "");
        com.bytedance.als.dsl.g.a(this, new a.C2386a(aVar, this));
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.gamora.editor.gesture.b.class, (String) null, (com.bytedance.o.p) new a.f(dVar, aVar, this));
        alsLogicContainer.a(EditGestureViewModel.class, com.ss.android.ugc.gamora.editor.gesture.b.class);
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar.f6461a;
        alsLogicContainer2.f6437d.a(com.ss.android.ugc.aweme.ftc.components.corner.b.class, (String) null, (com.bytedance.o.p) new a.g(dVar2, aVar, this));
        alsLogicContainer2.a(FTCEditCornerViewModel.class, com.ss.android.ugc.aweme.ftc.components.corner.b.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar.f6461a;
        alsLogicContainer3.f6437d.a(com.ss.android.ugc.aweme.ftc.components.sticker.core.b.class, (String) null, (com.bytedance.o.p) new a.h(dVar3, aVar, this));
        alsLogicContainer3.a(FTCEditStickerViewModel.class, com.ss.android.ugc.aweme.ftc.components.sticker.core.b.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar.f6461a;
        alsLogicContainer4.f6437d.a(com.ss.android.ugc.gamora.editor.filter.core.c.class, (String) null, (com.bytedance.o.p) new a.i(dVar4, aVar, this));
        alsLogicContainer4.a(EditFilterViewModel.class, com.ss.android.ugc.gamora.editor.filter.core.c.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar.f6461a;
        alsLogicContainer5.f6437d.a(com.ss.android.ugc.gamora.editor.filter.indicator.b.class, (String) null, (com.bytedance.o.p) new a.j(dVar5, aVar, this));
        alsLogicContainer5.a(EditFilterIndicatorViewModel.class, com.ss.android.ugc.gamora.editor.filter.indicator.b.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar.f6461a;
        alsLogicContainer6.f6437d.a(com.ss.android.ugc.aweme.ftc.components.toolbar.r.class, (String) null, (com.bytedance.o.p) new a.k(dVar6, aVar, this));
        alsLogicContainer6.a(FTCEditToolbarViewModel.class, com.ss.android.ugc.aweme.ftc.components.toolbar.r.class);
        if (bp.i(aVar.f98481c)) {
            com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer7 = bVar.f6461a;
            alsLogicContainer7.f6437d.a(com.ss.android.ugc.aweme.ftc.components.audiorecord.d.class, (String) null, (com.bytedance.o.p) new a.l(dVar7, aVar, this));
            alsLogicContainer7.a(FTCEditAudioRecordViewModel.class, com.ss.android.ugc.aweme.ftc.components.audiorecord.d.class);
        }
        if (bp.f(aVar.f98481c)) {
            com.bytedance.als.dsl.d dVar8 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer8 = bVar.f6461a;
            alsLogicContainer8.f6437d.a(com.ss.android.ugc.aweme.ftc.components.audioeffect.f.class, (String) null, (com.bytedance.o.p) new a.m(dVar8, aVar, this));
            alsLogicContainer8.a(FTCEditAudioEffectViewModel.class, com.ss.android.ugc.aweme.ftc.components.audioeffect.f.class);
        }
        com.bytedance.als.dsl.d dVar9 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer9 = bVar.f6461a;
        alsLogicContainer9.f6437d.a(com.ss.android.ugc.aweme.ftc.components.effect.b.class, (String) null, (com.bytedance.o.p) new a.b(dVar9, aVar, this));
        alsLogicContainer9.a(FTCEditEffectViewModel.class, com.ss.android.ugc.aweme.ftc.components.effect.b.class);
        com.bytedance.als.dsl.d dVar10 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer10 = bVar.f6461a;
        alsLogicContainer10.f6437d.a(com.ss.android.ugc.aweme.ftc.components.cutmusic.b.class, (String) null, (com.bytedance.o.p) new a.c(dVar10, aVar, this));
        alsLogicContainer10.a(FTCEditMusicCutViewModel.class, com.ss.android.ugc.aweme.ftc.components.cutmusic.b.class);
        com.bytedance.als.dsl.d dVar11 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer11 = bVar.f6461a;
        alsLogicContainer11.f6437d.a(com.ss.android.ugc.aweme.ftc.components.a.a.class, (String) null, (com.bytedance.o.p) new a.d(dVar11, aVar, this));
        alsLogicContainer11.a(MultiEditViewModel.class, com.ss.android.ugc.aweme.ftc.components.a.a.class);
        com.bytedance.als.dsl.d dVar12 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer12 = bVar.f6461a;
        alsLogicContainer12.f6437d.a(com.ss.android.ugc.aweme.ftc.components.volume.b.class, (String) null, (com.bytedance.o.p) new a.e(dVar12, aVar, this));
        alsLogicContainer12.a(FTCEditVolumeViewModel.class, com.ss.android.ugc.aweme.ftc.components.volume.b.class);
        bVar.a();
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
        com.bytedance.o.f b2 = com.bytedance.als.dsl.c.b(this);
        if (b2 == null) {
            h.f.b.l.b();
        }
        a(new com.ss.android.ugc.gamora.editor.r(eVar, this, b2));
        M().a();
        ab().a();
        Q();
        N().f().observe(this, new ab(this));
    }

    static final class y<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97603a;

        static {
            Covode.recordClassIndex(62005);
        }

        y(a aVar) {
            this.f97603a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
            if (r0.veAudioRecorderParam.hasRecord() == false) goto L_0x00dd;
         */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 715
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.a.y.onChanged(java.lang.Object):void");
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ab
    public final void a(StickerItemModel stickerItemModel) {
        h.f.b.l.d(stickerItemModel, "");
        if (com.ss.android.ugc.aweme.video.e.b(stickerItemModel.path)) {
            VideoPublishEditModel videoPublishEditModel = this.f97539c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            if (!videoPublishEditModel.hasInfoStickers()) {
                VideoPublishEditModel videoPublishEditModel2 = this.f97539c;
                if (videoPublishEditModel2 == null) {
                    h.f.b.l.a("mModel");
                }
                VideoPublishEditModel videoPublishEditModel3 = this.f97539c;
                if (videoPublishEditModel3 == null) {
                    h.f.b.l.a("mModel");
                }
                videoPublishEditModel2.infoStickerModel = new InfoStickerModel(videoPublishEditModel3.draftDir());
            }
            int i2 = 1;
            VideoPublishEditModel videoPublishEditModel4 = this.f97539c;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel4.infoStickerModel.stickers.size() > 0) {
                VideoPublishEditModel videoPublishEditModel5 = this.f97539c;
                if (videoPublishEditModel5 == null) {
                    h.f.b.l.a("mModel");
                }
                for (StickerItemModel stickerItemModel2 : videoPublishEditModel5.infoStickerModel.stickers) {
                    h.f.b.l.b(stickerItemModel2, "");
                    if (com.ss.android.ugc.aweme.editSticker.model.c.a(stickerItemModel2) && stickerItemModel2.layerWeight > i2) {
                        i2 = stickerItemModel2.layerWeight;
                    }
                }
            }
            stickerItemModel.layerWeight += i2;
            VideoPublishEditModel videoPublishEditModel6 = this.f97539c;
            if (videoPublishEditModel6 == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel6.infoStickerModel.stickers.add(stickerItemModel);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ag implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DialogInterface.OnClickListener f97576a;

        static {
            Covode.recordClassIndex(61979);
        }

        ag(DialogInterface.OnClickListener onClickListener) {
            this.f97576a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            DialogInterface.OnClickListener onClickListener = this.f97576a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f97589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f97590b;

        static {
            Covode.recordClassIndex(61996);
        }

        p(a aVar, boolean z) {
            this.f97589a = aVar;
            this.f97590b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f97589a.b(this.f97590b);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        com.bytedance.f.a.a.j jVar = this.A;
        if (jVar == null) {
            h.f.b.l.a("gestureService");
        }
        jVar.a(new com.bytedance.f.a.a.f(0, new r(this)));
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.att, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        Context context = viewGroup.getContext();
        h.f.b.l.b(context, "");
        this.A = com.bytedance.f.a.a.a.a(context, (FrameLayout) viewGroup2.findViewById(R.id.asl));
        return viewGroup2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, com.bytedance.jedi.arch.ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void b(boolean z2, boolean z3, Runnable runnable) {
        AVChallenge aVChallenge;
        String str;
        if (this.E) {
            com.ss.android.ugc.aweme.port.in.g.a();
            com.ss.android.ugc.tools.utils.q.b("DoubleGoPublishActivity VEVideoPublishEditActivity");
            com.bytedance.services.apm.api.a.a("DoubleGoPublishActivity VEVideoPublishEditActivity");
            if (SettingsManager.a().a("is_block_error_go_publish", true)) {
                com.ss.android.ugc.tools.utils.q.b("BlockErrorGoPublish");
                return;
            }
        }
        this.E = true;
        Intent intent = new Intent();
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        Intent intent2 = t2.getIntent();
        h.f.b.l.b(intent2, "");
        Bundle a2 = a(intent2);
        if (a2 != null) {
            intent.putExtras(a2);
        }
        VideoPublishEditModel videoPublishEditModel = this.f97539c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        cr a3 = cr.a();
        h.f.b.l.b(a3, "");
        videoPublishEditModel.setMultiEditChallenges(a3.f125306m);
        VideoPublishEditModel videoPublishEditModel2 = this.f97539c;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel2.setMultiEditStickIds();
        VideoPublishEditModel videoPublishEditModel3 = this.f97539c;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel3.setMultiEditBeautyMetadatas();
        VideoPublishEditModel videoPublishEditModel4 = this.f97539c;
        if (videoPublishEditModel4 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel4.setMultiEditCameraLensInfo();
        ArrayList arrayList = new ArrayList();
        VideoPublishEditModel videoPublishEditModel5 = this.f97539c;
        if (videoPublishEditModel5 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel5.challenges == null) {
            com.ss.android.ugc.aweme.infoSticker.i iVar = this.B;
            if (iVar == null) {
                h.f.b.l.a("stickerChallengeManager");
            }
            if (!iVar.c().isEmpty()) {
                com.ss.android.ugc.aweme.infoSticker.i iVar2 = this.B;
                if (iVar2 == null) {
                    h.f.b.l.a("stickerChallengeManager");
                }
                arrayList.addAll(iVar2.c());
            }
        }
        VideoPublishEditModel videoPublishEditModel6 = this.f97539c;
        if (videoPublishEditModel6 == null) {
            h.f.b.l.a("mModel");
        }
        AudioEffectParam audioEffectParam = videoPublishEditModel6.veAudioEffectParam;
        if (audioEffectParam != null) {
            aVChallenge = audioEffectParam.getChallenge();
            if (aVChallenge != null) {
                VideoPublishEditModel videoPublishEditModel7 = this.f97539c;
                if (videoPublishEditModel7 == null) {
                    h.f.b.l.a("mModel");
                }
                if (bp.h(videoPublishEditModel7)) {
                    VideoPublishEditModel videoPublishEditModel8 = this.f97539c;
                    if (videoPublishEditModel8 == null) {
                        h.f.b.l.a("mModel");
                    }
                    if (videoPublishEditModel8.hasNotAudioRecord()) {
                        VideoPublishEditModel videoPublishEditModel9 = this.f97539c;
                        if (videoPublishEditModel9 == null) {
                            h.f.b.l.a("mModel");
                        }
                        com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.a(videoPublishEditModel9);
                    }
                }
                arrayList.add(aVChallenge);
            }
        } else {
            aVChallenge = null;
        }
        VideoPublishEditModel videoPublishEditModel10 = this.f97539c;
        if (videoPublishEditModel10 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel10.challenges != null) {
            VideoPublishEditModel videoPublishEditModel11 = this.f97539c;
            if (videoPublishEditModel11 == null) {
                h.f.b.l.a("mModel");
            }
            arrayList.addAll(videoPublishEditModel11.challenges);
            com.ss.android.ugc.aweme.infoSticker.i iVar3 = this.B;
            if (iVar3 == null) {
                h.f.b.l.a("stickerChallengeManager");
            }
            VideoPublishEditModel videoPublishEditModel12 = this.f97539c;
            if (videoPublishEditModel12 == null) {
                h.f.b.l.a("mModel");
            }
            List list = videoPublishEditModel12.challenges;
            h.f.b.l.b(list, "");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                String str2 = ((AVChallenge) obj).challengeName;
                if (aVChallenge == null || (str = aVChallenge.challengeName) == null) {
                    str = "";
                }
                if (!h.f.b.l.a((Object) str2, (Object) str)) {
                    arrayList2.add(obj);
                }
            }
            iVar3.a(arrayList2);
        }
        VideoPublishEditModel videoPublishEditModel13 = this.f97539c;
        if (videoPublishEditModel13 == null) {
            h.f.b.l.a("mModel");
        }
        com.ss.android.ugc.aweme.infoSticker.i iVar4 = this.B;
        if (iVar4 == null) {
            h.f.b.l.a("stickerChallengeManager");
        }
        videoPublishEditModel13.stickerChallenge = iVar4.a();
        if (cr.a().f125295a != null) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null) {
                h.f.b.l.b();
            }
            AVChallenge aVChallenge2 = cVar.challenge;
            if (aVChallenge2 != null && !arrayList.contains(aVChallenge2)) {
                arrayList.add(aVChallenge2);
            }
        }
        VideoPublishEditModel videoPublishEditModel14 = this.f97539c;
        if (videoPublishEditModel14 == null) {
            h.f.b.l.a("mModel");
        }
        VideoPublishEditModel makeCopy = VideoPublishEditModel.makeCopy(videoPublishEditModel14);
        com.ss.android.ugc.aweme.tools.b.g.a(com.ss.android.ugc.aweme.shortvideo.q.a(makeCopy), com.ss.android.ugc.aweme.shortvideo.q.b(makeCopy), com.ss.android.ugc.aweme.tools.b.e.EDIT, com.ss.android.ugc.aweme.tools.b.e.PUBLISH);
        Objects.requireNonNull(makeCopy, "null cannot be cast to non-null type java.io.Serializable");
        intent.putExtra("args", (Serializable) makeCopy);
        com.ss.android.ugc.aweme.df.e.a("GoPublishActivity from new edit page  newOne = ".concat(String.valueOf(makeCopy)));
        intent.putExtra("is_from_sys_share", z2);
        intent.putExtra("challenge", arrayList);
        intent.putExtra("enter_record_from_other_platform", z3);
        Activity activity = this.f42913m;
        if (activity == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity, "");
        boolean booleanExtra = activity.getIntent().getBooleanExtra("extra_enter_from_live", false);
        intent.putExtra("extra_enter_from_live", booleanExtra);
        Activity activity2 = this.f42913m;
        if (activity2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity2, "");
        intent.putExtra("edit_publish_session_end_together", activity2.getIntent().getBooleanExtra("edit_publish_session_end_together", false));
        int b2 = aq().b();
        if (b2 >= 0) {
            intent.putExtra("music_rec_type", b2);
        }
        runnable.run();
        if (!com.ss.android.ugc.aweme.setting.q.a() || U() == null) {
            a(z3, booleanExtra, intent);
            return;
        }
        com.ss.android.ugc.asve.editor.g U = U();
        if (U != null) {
            U.a(new ae(this, z3, booleanExtra, intent));
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, com.bytedance.jedi.arch.ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, com.bytedance.jedi.arch.ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void b(boolean z2, boolean z3, boolean z4, Runnable runnable) {
        com.ss.android.ugc.aweme.editSticker.interact.d dVar;
        h.f.b.l.d(runnable, "");
        com.ss.android.ugc.tools.utils.q.a("VEVideoPublishEditActivity compileStickers");
        com.ss.android.ugc.aweme.ftc.components.sticker.text.a aVar = G().f97946i;
        a(aVar);
        com.ss.android.ugc.asve.editor.g U = U();
        if (U == null) {
            h.f.b.l.b();
        }
        bq bqVar = this.C;
        if (bqVar == null) {
            h.f.b.l.a("mVideoSizeProvider");
        }
        com.ss.android.ugc.aweme.editSticker.interact.d[] dVarArr = new com.ss.android.ugc.aweme.editSticker.interact.d[2];
        dVarArr[0] = G().H().h();
        if (aVar != null) {
            dVar = aVar.m();
        } else {
            dVar = null;
        }
        dVarArr[1] = dVar;
        boolean a2 = com.ss.android.ugc.aweme.shortvideo.edit.y.a(U, bqVar, dVarArr);
        bq bqVar2 = this.C;
        if (bqVar2 == null) {
            h.f.b.l.a("mVideoSizeProvider");
        }
        bqVar2.a(a2, false);
        long currentTimeMillis = System.currentTimeMillis();
        com.ss.android.ugc.aweme.ftc.components.sticker.core.c F2 = G();
        com.ss.android.ugc.asve.editor.g U2 = U();
        if (U2 == null) {
            h.f.b.l.b();
        }
        b.i<Void> b2 = b.i.b((Collection<? extends b.i<?>>) h.a.n.a(F2.b(U2, this, (h.f.a.b<? super String, String>) null)));
        h.f.b.l.b(b2, "");
        if (!b2.a()) {
            ac();
            b.i<Void> a3 = b.i.a(Math.max(0L, 500 - (System.currentTimeMillis() - currentTimeMillis)));
            h.f.b.l.b(a3, "");
            b2 = b.i.b((Collection<? extends b.i<?>>) h.a.n.b(b2, a3));
        }
        b2.a(new q(this, z2, z3, z4, runnable), b.i.f4826c, null);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.jedi.arch.ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, com.bytedance.jedi.arch.ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.jedi.arch.ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.jedi.arch.ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
