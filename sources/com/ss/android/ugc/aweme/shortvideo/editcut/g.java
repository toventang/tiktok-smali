package com.ss.android.ugc.aweme.shortvideo.editcut;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import com.bytedance.als.dsl.OCAdapterViewModel;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.b;
import com.bytedance.o.n;
import com.ss.android.ugc.aweme.cz.a.d;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.i;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.o;
import com.ss.android.ugc.aweme.shortvideo.editcut.p;
import com.ss.android.ugc.aweme.shortvideo.editcut.r;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.utils.db;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.gamora.editor.c.b;
import com.ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import h.f.b.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class g extends com.bytedance.als.e<f> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, f, q {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f128287c = {new h.f.b.y(g.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new h.f.b.y(g.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};
    public static final p x = new p((byte) 0);
    private final h.h.d A;
    private final h.h.d B;
    private final h.h C;
    private final h.h D;
    private final h.h E;
    private final h.h F;
    private final h.h G;
    private final h.h H;
    private final h.h I;
    private final h.h J;
    private final h.h K;
    private final h.h L;
    private final h.h M;
    private final h.h N;
    private final h.h O;
    private final h.h P;
    private final h.h Q;
    private final h.h R;
    private final h.h S;
    private final h.h T;

    /* renamed from: d  reason: collision with root package name */
    public final f f128288d = this;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f128289e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f128290f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f128291g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f128292h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f128293i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.asve.editor.g f128294j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f128295k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f128296l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f128297m;
    public boolean n;
    public com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h o;
    public boolean p;
    h.p<Long, Long> q;
    public com.ss.android.ugc.aweme.shortvideo.c r;
    final h.h s;
    final h.h t;
    public final af u;
    public final com.bytedance.scene.group.b v;
    public final int w = R.id.c9b;
    private final h.h y = h.i.a((h.f.a.a) new u(this));
    private int z = -1;

    static {
        Covode.recordClassIndex(84104);
    }

    private final com.ss.android.ugc.gamora.editor.cutmusic.a C() {
        return (com.ss.android.ugc.gamora.editor.cutmusic.a) this.E.getValue();
    }

    private final com.ss.android.ugc.gamora.editor.toolbar.s D() {
        return (com.ss.android.ugc.gamora.editor.toolbar.s) this.F.getValue();
    }

    private final CutVideoSpeedViewModel E() {
        return (CutVideoSpeedViewModel) this.L.getValue();
    }

    private final com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d F() {
        return (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d) this.R.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.q, com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final List<VideoSegment> b() {
        return (List) this.y.getValue();
    }

    public final VideoPublishEditModel d() {
        return (VideoPublishEditModel) this.A.a(this, f128287c[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a e() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.B.a(this, f128287c[1]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.effect.a f() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.effect.a) this.C.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.sticker.core.a g() {
        return (com.ss.android.ugc.gamora.editor.sticker.core.a) this.D.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final com.ss.android.ugc.aweme.shortvideo.editcut.a.a h() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.a.a) this.H.getValue();
    }

    public final CutMultiVideoViewModel i() {
        return (CutMultiVideoViewModel) this.I.getValue();
    }

    /* access modifiers changed from: package-private */
    public final VideoEditViewModel j() {
        return (VideoEditViewModel) this.J.getValue();
    }

    public final EditAdjustClipsBottomViewModel k() {
        return (EditAdjustClipsBottomViewModel) this.K.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.ac l() {
        return (com.ss.android.ugc.gamora.editor.ac) this.M.getValue();
    }

    public final p m() {
        return (p) this.N.getValue();
    }

    public final r n() {
        return (r) this.O.getValue();
    }

    public final db o() {
        return (db) this.P.getValue();
    }

    /* access modifiers changed from: package-private */
    public final EditMusicViewModel p() {
        return (EditMusicViewModel) this.Q.getValue();
    }

    public final o q() {
        return (o) this.S.getValue();
    }

    public final k r() {
        return (k) this.T.getValue();
    }

    public static final class p {
        static {
            Covode.recordClassIndex(84157);
        }

        private p() {
        }

        /* access modifiers changed from: package-private */
        public static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ VideoPublishEditModel f128318a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h.f.a.b f128319b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f128320c;

            static {
                Covode.recordClassIndex(84158);
            }

            a(VideoPublishEditModel videoPublishEditModel, h.f.a.b bVar, String str) {
                this.f128318a = videoPublishEditModel;
                this.f128319b = bVar;
                this.f128320c = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f128318a.creationId).a("shoot_way", this.f128318a.mShootWay).a("enter_from", "video_edit_page").a("content_source", es.a(this.f128318a)).a("content_type", es.c(this.f128318a));
                h.f.a.b bVar = this.f128319b;
                if (bVar != null) {
                    h.f.b.l.b(a2, "");
                    bVar.invoke(a2);
                }
                com.ss.android.ugc.aweme.common.r.a(this.f128320c, a2.f149193a);
                return h.z.f158842a;
            }
        }

        public /* synthetic */ p(byte b2) {
            this();
        }

        public static void a(String str, VideoPublishEditModel videoPublishEditModel, h.f.a.b<? super com.ss.android.ugc.tools.f.b, h.z> bVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(videoPublishEditModel, "");
            b.i.b(new a(videoPublishEditModel, bVar, str), com.ss.android.ugc.aweme.cw.g.a());
        }
    }

    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this.f128288d;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if ((!h.f.b.l.a(r4.r, r3)) == false) goto L_0x003b;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.shortvideo.editcut.g$w r5 = new com.ss.android.ugc.aweme.shortvideo.editcut.g$w
            r5.<init>(r8, r9)
            boolean r1 = r8.f128291g
            boolean r0 = r8.p
            r7 = 0
            r6 = 1
            if (r1 != r0) goto L_0x003a
            com.ss.android.ugc.aweme.shortvideo.editcut.o r4 = r8.q()
            h.p r3 = r8.c()
            java.lang.String r0 = ""
            h.f.b.l.d(r3, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r2 = r4.d()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r4.f128366i
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = "restoreRecordData"
            h.f.b.l.a(r0)
        L_0x0027:
            boolean r0 = r2.isEqualWithDeleteStatus(r1)
            if (r0 == 0) goto L_0x003a
            h.p<java.lang.Long, java.lang.Long> r0 = r4.r
            if (r0 == 0) goto L_0x003b
            h.p<java.lang.Long, java.lang.Long> r0 = r4.r
            boolean r0 = h.f.b.l.a(r0, r3)
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x003b
        L_0x003a:
            r7 = 1
        L_0x003b:
            if (r9 != 0) goto L_0x004c
            if (r7 == 0) goto L_0x004c
            android.app.Activity r1 = com.bytedance.als.dsl.g.b(r8)
            com.ss.android.ugc.aweme.shortvideo.editcut.g$aq r0 = new com.ss.android.ugc.aweme.shortvideo.editcut.g$aq
            r0.<init>(r5)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a.b(r1, r0)
            return
        L_0x004c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r5.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.a(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void a(boolean z2, boolean z3) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        h.p<Integer, Integer> pVar;
        Integer first;
        int intValue;
        if (z2 && !z3) {
            int currentEditOriginIndex = k().a().getCurrentEditOriginIndex();
            VideoSegment videoSegment = b().get(currentEditOriginIndex);
            EditAdjustClipsBottomViewModel k2 = k();
            h.f.b.l.d(videoSegment, "");
            k2.d(new EditAdjustClipsBottomViewModel.g(currentEditOriginIndex, videoSegment));
        }
        h.p<Long, Long> c2 = c();
        EditAdjustClipsBottomViewModel k3 = k();
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = this.o;
        k3.a(hVar != null ? hVar.getSelectedTime() : 0.0f);
        o q2 = q();
        h.f.b.l.d(c2, "");
        if (q2.f128359b) {
            q2.f128359b = false;
            if (!z2 && !z3) {
                q2.a(true, false);
                q2.i().a((t) null);
                r.a.a(q2.j(), -1, null, false, 6);
            }
        }
        if (z3 && (arrayList = q2.o) != null && (pVar = q2.f128365h) != null && (first = pVar.getFirst()) != null && (intValue = first.intValue()) >= 0 && intValue < arrayList.size()) {
            arrayList.remove(intValue);
        }
        com.ss.android.ugc.aweme.shortvideo.cut.i iVar = q2.f128364g;
        if (iVar != null) {
            iVar.a(z2, z3, q2.c());
        }
        if (q2.f128362e) {
            q2.h().a(q2.c());
            p g2 = q2.g();
            g2.c().a(z2, z3, q2.e().mMusicStart, new p.i(g2));
        } else {
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar2 = q2.f128364g;
            if (iVar2 != null) {
                iVar2.c((int) c2.getFirst().longValue(), (int) c2.getSecond().longValue());
            }
            r.a.a(q2.j(), c2.getFirst().longValue(), null, false, 6);
        }
        h.p<Integer, Integer> pVar2 = q2.f128365h;
        if (pVar2 != null) {
            int intValue2 = pVar2.getSecond().intValue();
            if (!z2) {
                q2.a(intValue2, q2.q);
            }
        }
        q2.f128365h = null;
        a(false, -1);
        if (z2 || z3) {
            o.a(q(), 0, 3);
            if (z3) {
                i().a();
                return;
            }
            return;
        }
        q().b(c2);
    }

    static final class as extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h.f.a.a $onRetake;

        static {
            Covode.recordClassIndex(84135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        as(h.f.a.a aVar) {
            super(0);
            this.$onRetake = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.z invoke() {
            this.$onRetake.invoke();
            return h.z.f158842a;
        }
    }

    static final class ax extends h.f.b.m implements h.f.a.a<db> {

        /* renamed from: a  reason: collision with root package name */
        public static final ax f128317a = new ax();

        static {
            Covode.recordClassIndex(84142);
        }

        ax() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ db invoke() {
            return new db(10);
        }
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

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.q
    public final void w() {
        F().a();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.effect.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(84105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.effect.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.edit.effect.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.effect.a> r1 = com.ss.android.ugc.aweme.shortvideo.edit.effect.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.a.invoke():com.bytedance.als.b");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aq extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ boolean $changed = true;
        final /* synthetic */ h.f.a.b $onQuit;

        static {
            Covode.recordClassIndex(84123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aq(h.f.a.b bVar) {
            super(0);
            this.$onQuit = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$onQuit.invoke(Boolean.valueOf(this.$changed));
            return h.z.f158842a;
        }
    }

    static final class au extends h.f.b.m implements h.f.a.a<k> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        au(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            return new k(this.this$0.getDiContainer());
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(84143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.core.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r1 = com.ss.android.ugc.gamora.editor.sticker.core.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.b.invoke():com.bytedance.als.b");
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.cutmusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(84144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.cutmusic.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.ss.android.ugc.gamora.editor.cutmusic.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(84145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.d.invoke():com.bytedance.als.b");
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.editcut.a.a> {
        final /* synthetic */ com.bytedance.o.a $this_lazyInject;

        static {
            Covode.recordClassIndex(84147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(com.bytedance.o.a aVar) {
            super(0);
            this.$this_lazyInject = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.shortvideo.editcut.a.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.editcut.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_lazyInject
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.a.a> r1 = com.ss.android.ugc.aweme.shortvideo.editcut.a.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.f.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.g$g  reason: collision with other inner class name */
    public static final class C3350g extends h.f.b.m implements h.f.a.a<CutMultiVideoViewModel> {
        final /* synthetic */ com.bytedance.o.a $this_lazyInject;

        static {
            Covode.recordClassIndex(84148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3350g(com.bytedance.o.a aVar) {
            super(0);
            this.$this_lazyInject = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_lazyInject
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.C3350g.invoke():java.lang.Object");
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<VideoEditViewModel> {
        final /* synthetic */ com.bytedance.o.a $this_lazyInject;

        static {
            Covode.recordClassIndex(84149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(com.bytedance.o.a aVar) {
            super(0);
            this.$this_lazyInject = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_lazyInject
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.h.invoke():java.lang.Object");
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<EditAdjustClipsBottomViewModel> {
        final /* synthetic */ com.bytedance.o.a $this_lazyInject;

        static {
            Covode.recordClassIndex(84150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(com.bytedance.o.a aVar) {
            super(0);
            this.$this_lazyInject = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_lazyInject
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.i.invoke():java.lang.Object");
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<CutVideoSpeedViewModel> {
        final /* synthetic */ com.bytedance.o.a $this_lazyInject;

        static {
            Covode.recordClassIndex(84151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(com.bytedance.o.a aVar) {
            super(0);
            this.$this_lazyInject = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_lazyInject
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.j.invoke():java.lang.Object");
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.ac> {
        final /* synthetic */ com.bytedance.o.a $this_lazyInject;

        static {
            Covode.recordClassIndex(84152);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(com.bytedance.o.a aVar) {
            super(0);
            this.$this_lazyInject = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.gamora.editor.ac, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.ac invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_lazyInject
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.ac> r1 = com.ss.android.ugc.gamora.editor.ac.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.k.invoke():java.lang.Object");
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<p> {
        final /* synthetic */ com.bytedance.o.a $this_lazyInject;

        static {
            Covode.recordClassIndex(84153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(com.bytedance.o.a aVar) {
            super(0);
            this.$this_lazyInject = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.editcut.p, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.editcut.p invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_lazyInject
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.p> r1 = com.ss.android.ugc.aweme.shortvideo.editcut.p.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.l.invoke():java.lang.Object");
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.a<r> {
        final /* synthetic */ com.bytedance.o.a $this_lazyInject;

        static {
            Covode.recordClassIndex(84154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(com.bytedance.o.a aVar) {
            super(0);
            this.$this_lazyInject = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.shortvideo.editcut.r] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.editcut.r invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_lazyInject
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.r> r1 = com.ss.android.ugc.aweme.shortvideo.editcut.r.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.m.invoke():java.lang.Object");
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(84155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c> r1 = com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.n.invoke():com.bytedance.als.b");
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.toolbar.s> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(84156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.toolbar.s] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.toolbar.s invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.toolbar.s> r1 = com.ss.android.ugc.gamora.editor.toolbar.s.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.o.invoke():com.bytedance.als.b");
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d invoke() {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d dVar = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d();
            dVar.a(com.bytedance.als.dsl.g.b(this.this$0));
            return dVar;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<o> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return new o(this.this$0.getDiContainer());
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<List<? extends VideoSegment>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends VideoSegment> invoke() {
            return this.this$0.q().c();
        }
    }

    public static final class v implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128327a;

        static {
            Covode.recordClassIndex(84164);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void b() {
            this.f128327a.k().a(-1);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void c() {
            this.f128327a.k().a(-1);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        v(g gVar) {
            this.f128327a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void a(Exception exc) {
            this.f128327a.k().a(-1);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void b(Exception exc) {
            this.f128327a.k().a(-1);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.c> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "request music list success when force apply music sync"
                com.ss.android.ugc.tools.utils.q.a(r0)
                r2 = 0
                if (r4 == 0) goto L_0x000e
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L_0x000f
            L_0x000e:
                return
            L_0x000f:
                com.ss.android.ugc.aweme.shortvideo.editcut.g r0 = r3.f128327a
                com.ss.android.ugc.aweme.shortvideo.editcut.a.a r0 = r0.h()
                com.ss.android.ugc.aweme.edit.Cut2EditTransferModel r0 = r0.f128083e
                if (r0 == 0) goto L_0x0029
                java.util.List r1 = r0.getMusicList()
                if (r1 == 0) goto L_0x0029
                r1.clear()
                java.lang.Object r0 = r4.get(r2)
                r1.add(r0)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.v.a(java.util.List):void");
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            String c2;
            com.ss.android.ugc.tools.utils.q.a("request music model success when force apply music sync");
            if (cVar == null) {
                this.f128327a.k().a(-1);
                return;
            }
            this.f128327a.k().a(1);
            if (this.f128327a.k().a().getCurrentTabIndex() == 0 && (c2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.c(cVar)) != null) {
                this.f128327a.a(c2, cVar);
                p.a(this.f128327a.m(), cVar, 0, false, 6);
            }
        }
    }

    public final void B() {
        if (this.n) {
            q().k();
            this.n = false;
        }
    }

    static final class ah extends h.f.b.m implements h.f.a.a<EditMusicViewModel> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditMusicViewModel invoke() {
            Activity b2 = com.bytedance.als.dsl.g.b(this.this$0);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) b2).a(EditMusicViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.text.als.a> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.editSticker.text.als.a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.editcut.g r0 = r2.this$0
                android.app.Activity r1 = com.bytedance.als.dsl.g.b(r0)
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.a.a(r1)
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r0 = com.ss.android.ugc.aweme.editSticker.text.als.a.class
                com.bytedance.als.b r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.e.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.f
    public final void a() {
        k().c(EditAdjustClipsBottomViewModel.j.f128071a);
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        h.f.b.l.d(this, "");
        com.bytedance.o.f fVar = com.bytedance.als.dsl.c.a(this).f6438e;
        if (fVar == null) {
            h.f.b.l.b();
        }
        return fVar;
    }

    @Override // com.bytedance.als.j, com.bytedance.als.e
    public final void onDestroy() {
        super.onDestroy();
        db o2 = o();
        o2.f142808a.evictAll();
        o2.f142809b.clear();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void u() {
        p m2 = m();
        m2.d().a(m2.e());
        p.a("apply_smart_sync", d(), q.f128321a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void v() {
        if (!com.ss.android.ugc.aweme.shortvideo.editcut.a.b.a(h())) {
            e().P();
        } else {
            com.bytedance.als.dsl.g.b(this).finish();
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ MultiEditVideoStatusRecordData $recordData;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(g gVar, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
            super(0);
            this.this$0 = gVar;
            this.$recordData = multiEditVideoStatusRecordData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            if (this.this$0.f128293i) {
                this.this$0.f128293i = false;
                this.this$0.i().a(this.$recordData.currentEditIndex, this.$recordData.currentEditIndex);
                this.this$0.q().f128359b = true;
            }
            return h.z.f158842a;
        }
    }

    public final h.p<Long, Long> c() {
        androidx.core.g.e<Long, Long> playBoundary;
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = this.o;
        long j2 = 0L;
        if (hVar == null || (playBoundary = hVar.getPlayBoundary()) == null) {
            return h.v.a(0L, Long.valueOf(q().a()));
        }
        F f2 = playBoundary.f2397a;
        if (f2 != null) {
            j2 = f2;
        }
        Object obj = playBoundary.f2398b;
        if (obj == null) {
            obj = Long.valueOf(q().a());
        }
        return h.v.a(j2, obj);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void s() {
        EditAdjustClipsBottomViewState a2 = k().a();
        at atVar = new at(this, a2);
        if (bp.q(d()) || g().f()) {
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a.b(com.bytedance.als.dsl.g.b(this), new as(atVar));
        } else {
            atVar.invoke();
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.a(a2.getCurrentEditIndex());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void t() {
        int currentEditOriginIndex = k().a().getCurrentEditOriginIndex();
        VideoSegment videoSegment = j().k().get(currentEditOriginIndex);
        i().a(videoSegment);
        EditAdjustClipsBottomViewModel k2 = k();
        h.f.b.l.b(videoSegment, "");
        h.f.b.l.d(videoSegment, "");
        k2.d(new EditAdjustClipsBottomViewModel.c(currentEditOriginIndex, videoSegment));
    }

    public final void y() {
        int i2;
        String str;
        d().copyMultiEditMusicInfo();
        MultiEditVideoRecordData multiEditVideoRecordData = d().multiEditVideoRecordData.curMultiEditVideoRecordData;
        if (this.f128291g && multiEditVideoRecordData.musicPath == null) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = m().f128392b;
            if (cVar != null) {
                str = cVar.path;
            } else {
                str = null;
            }
            multiEditVideoRecordData.musicPath = str;
        }
        if (this.f128291g) {
            i2 = this.z;
        } else {
            i2 = e().d().f156782i;
        }
        multiEditVideoRecordData.musicIndex = i2;
        multiEditVideoRecordData.musicDuration = fa.a(multiEditVideoRecordData.musicPath);
    }

    /* access modifiers changed from: package-private */
    public final void z() {
        q().a(true, (h.p<Long, Long>) null);
        float f2 = 0.0f;
        if (!this.f128291g) {
            this.f128291g = true;
            d().editMusicSyncMode = true;
            k().a(true);
            d().voiceVolume = 0.0f;
            p().c(false);
        }
        k().b();
        EditAdjustClipsBottomViewModel k2 = k();
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = this.o;
        if (hVar != null) {
            f2 = hVar.getSelectedTime();
        }
        k2.a(f2);
    }

    /* access modifiers changed from: package-private */
    public static final class av extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h.f.a.a $onAnimateFinish;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        av(g gVar, h.f.a.a aVar) {
            super(0);
            this.this$0 = gVar;
            this.$onAnimateFinish = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.ss.android.vesdk.runtime.b a2;
            String[] strArr;
            boolean z;
            this.this$0.e().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
            com.ss.android.ugc.asve.editor.g gVar = this.this$0.f128294j;
            if (gVar != null) {
                gVar.f(false);
            }
            g gVar2 = this.this$0;
            com.ss.android.ugc.asve.editor.g gVar3 = gVar2.f128294j;
            if (!(gVar3 == null || (a2 = gVar3.a()) == null || (strArr = a2.f151430e) == null)) {
                String str = (String) h.a.i.d(strArr);
                if (str == null || !com.ss.android.ugc.tools.utils.i.a(str) || TextUtils.isEmpty(str) || com.ss.android.ugc.tools.utils.h.i(str) <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                com.ss.android.ugc.tools.utils.q.a("resetResIfNeeded:".concat(String.valueOf(z)));
                if (z) {
                    com.ss.android.ugc.aweme.shortvideo.cut.i iVar = gVar2.q().f128364g;
                    if (!(iVar instanceof d)) {
                        iVar = null;
                    }
                    d dVar = (d) iVar;
                    if (dVar != null) {
                        i.a.a(dVar, true, null, 2);
                    }
                }
            }
            this.this$0.g().a(false);
            if (!this.this$0.v.f(this.this$0.r())) {
                this.this$0.v.a(this.this$0.w, this.this$0.r(), "EditAdjustClipsRootScene");
            }
            this.this$0.r().a(true, (h.f.a.a<h.z>) new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.editcut.g.av.AnonymousClass1 */
                final /* synthetic */ av this$0;

                static {
                    Covode.recordClassIndex(84139);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    float f2;
                    this.this$0.this$0.f128292h = true;
                    g gVar = this.this$0.this$0;
                    if (!gVar.f128289e) {
                        gVar.f128289e = true;
                        if (!gVar.f128293i) {
                            gVar.j().a(gVar.h().f128080b ? 1 : 0);
                        }
                        gVar.j().n.observe(gVar.r(), new aj(gVar));
                        gVar.j().f126129b.observe(gVar.r(), new ak(gVar));
                        gVar.j().f126137j.observe(gVar, new al(gVar));
                        gVar.j().f126135h.observe(gVar, new am(gVar));
                        gVar.j().f126138k.observe(gVar, new an(gVar));
                        gVar.j().f126140m.observe(gVar, new ao(gVar));
                        f.a.b.b unused = gVar.k().a(gVar, j.f128333a, new com.bytedance.jedi.arch.ah(), new ap(gVar));
                    }
                    this.this$0.this$0.y();
                    this.this$0.this$0.q().l();
                    this.this$0.this$0.n = true;
                    this.this$0.this$0.l().b(false);
                    this.this$0.this$0.p = this.this$0.this$0.f128291g;
                    VEEditorAutoStartStopArbiter value = this.this$0.this$0.e().D().getValue();
                    if (value != null) {
                        value.f156721a = false;
                    }
                    this.this$0.this$0.q().a(true, (h.f.a.a<h.p<Long, Long>>) new h.f.a.a<h.p<? extends Long, ? extends Long>>(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.editcut.g.av.AnonymousClass1.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(84140);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ h.p<? extends Long, ? extends Long> invoke() {
                            return this.this$0.this$0.this$0.c();
                        }
                    });
                    EditAdjustClipsBottomViewModel k2 = this.this$0.this$0.k();
                    com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = this.this$0.this$0.o;
                    if (hVar != null) {
                        f2 = hVar.getSelectedTime();
                    } else {
                        f2 = 0.0f;
                    }
                    k2.a(f2);
                    h.f.a.a aVar = this.this$0.$onAnimateFinish;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    Activity b2 = com.bytedance.als.dsl.g.b(this.this$0.this$0);
                    if (!(b2 instanceof com.ss.android.ugc.tools.view.a.c)) {
                        b2 = null;
                    }
                    com.ss.android.ugc.tools.view.a.c cVar = (com.ss.android.ugc.tools.view.a.c) b2;
                    if (cVar != null) {
                        cVar.b(this.this$0.this$0.u);
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    public final void A() {
        long j2;
        int i2;
        o q2 = q();
        h.p<Long, Long> c2 = c();
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = this.o;
        long j3 = 0;
        if (hVar != null) {
            j2 = hVar.getLeftSeekingValue();
        } else {
            j2 = 0;
        }
        Long valueOf = Long.valueOf(j2);
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar2 = this.o;
        if (hVar2 != null) {
            j3 = hVar2.getRightSeekingValue();
        }
        q2.a(c2, h.v.a(valueOf, Long.valueOf(j3)));
        B();
        o q3 = q();
        com.ss.android.ugc.asve.editor.g gVar = this.f128294j;
        if (gVar != null) {
            i2 = gVar.j();
        } else {
            i2 = -1;
        }
        o.a(q3, i2, 1);
        com.ss.android.ugc.asve.editor.g gVar2 = this.f128294j;
        if (gVar2 != null) {
            int j4 = gVar2.j();
            d().setVideoLength(j4);
            C().a(j4);
            f().a(j4);
            f().b(j4);
            g().a(h.v.a(Integer.valueOf(gVar2.G()), Integer.valueOf(j4)));
            g().a(j4);
        }
        com.ss.android.ugc.gamora.editor.toolbar.s D2 = D();
        if (D2 != null) {
            D2.a();
        }
        f().e();
        g().j();
        r.a.a(n(), -1, null, false, 6);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void x() {
        Cut2EditTransferModel cut2EditTransferModel;
        List<com.ss.android.ugc.aweme.shortvideo.c> musicList;
        if (k().a().getStickPointStatus() != 0) {
            int i2 = 0;
            k().a(0);
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null && ((cut2EditTransferModel = h().f128083e) == null || (musicList = cut2EditTransferModel.getMusicList()) == null || (cVar = (com.ss.android.ugc.aweme.shortvideo.c) h.a.n.b((List) musicList, 0)) == null)) {
                k().a(0);
                int size = q().c().size();
                StringBuilder sb = new StringBuilder();
                for (T t2 : q().c()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        h.a.n.a();
                    }
                    sb.append(t2.f125478b);
                    if (i2 < size - 1) {
                        sb.append(",");
                    }
                    i2 = i3;
                }
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.j.a().a(a(com.bytedance.als.dsl.g.b(this)), size, sb.toString(), new v(this));
                return;
            }
            com.ss.android.ugc.tools.utils.q.a("force apply music sync with valid music");
            k().a(1);
            p.a(m(), cVar, d().mMusicStart, false, 4);
        }
    }

    static final class at extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ EditAdjustClipsBottomViewState $editState;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        at(g gVar, EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            super(0);
            this.this$0 = gVar;
            this.$editState = editAdjustClipsBottomViewState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            VEVideoPublishEditActivity vEVideoPublishEditActivity;
            Intent a2;
            o q = this.this$0.q();
            int currentEditIndex = this.$editState.getCurrentEditIndex();
            RetakeVideoContext retakeVideoContext = new RetakeVideoContext();
            retakeVideoContext.f124750d = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(q.d());
            retakeVideoContext.f124749c = currentEditIndex;
            long j2 = 0;
            for (int i2 = 0; i2 < currentEditIndex; i2++) {
                if (q.d().segmentDataList.get(i2).enable) {
                    j2 += q.d().segmentDataList.get(i2).videoLength;
                }
            }
            retakeVideoContext.f124748b = j2 / 1000;
            List<MultiEditVideoSegmentRecordData> list = q.d().segmentDataList;
            h.f.b.l.b(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.enable) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (currentEditIndex < arrayList2.size()) {
                retakeVideoContext.f124747a = ((MultiEditVideoSegmentRecordData) arrayList2.get(currentEditIndex)).videoLength / 1000;
                retakeVideoContext.a(q.d().curRecordingDir + File.separator + "new");
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
                q.d().hasRetake = true;
                multiEditVideoStatusRecordData.currentEditIndex = currentEditIndex;
                multiEditVideoStatusRecordData.originalSegments = q.f().f128082d.originalSegments;
                multiEditVideoStatusRecordData.restoreSegments = q.f128370m;
                multiEditVideoStatusRecordData.editSegments = q.o;
                multiEditVideoStatusRecordData.singleRestoreSegments = q.n;
                multiEditVideoStatusRecordData.curMultiEditVideoRecordData = q.d();
                MultiEditVideoRecordData multiEditVideoRecordData = q.f128367j;
                if (multiEditVideoRecordData == null) {
                    h.f.b.l.a("originRecordData");
                }
                multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordData;
                MultiEditVideoRecordData multiEditVideoRecordData2 = q.f128366i;
                if (multiEditVideoRecordData2 == null) {
                    h.f.b.l.a("restoreRecordData");
                }
                multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData = multiEditVideoRecordData2;
                multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(q.d(), (MultiEditVideoRecordData) null);
                multiEditVideoStatusRecordData.recordMusic = q.f().f128082d.recordMusic;
                multiEditVideoStatusRecordData.originalMusicStart = q.f().f128082d.originalMusicStart;
                retakeVideoContext.f124751e = multiEditVideoStatusRecordData;
                Activity b2 = com.bytedance.als.dsl.g.b(this.this$0);
                if (!this.this$0.d().mIsFromDraft) {
                    com.ss.android.ugc.gamora.editor.c.c.a(new b.d(com.bytedance.als.dsl.g.b(this.this$0), retakeVideoContext));
                } else if ((b2 instanceof VEVideoPublishEditActivity) && (a2 = (vEVideoPublishEditActivity = (VEVideoPublishEditActivity) b2).a(this.this$0.d())) != null) {
                    a2.putExtra("retake_video", retakeVideoContext);
                    a2.putExtra("retake_shoot_mode", 1);
                    vEVideoPublishEditActivity.a(a2, this.this$0.d());
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        EditAdjustClipsState editAdjustClipsState;
        super.onCreate();
        ar arVar = new ar(this);
        h.f.b.l.d(this, "");
        h.f.b.l.d(arVar, "");
        OCAdapterViewModel a2 = com.bytedance.als.dsl.g.a((com.bytedance.als.e<?>) this);
        com.bytedance.o.n nVar = a2.f6457a;
        h.f.b.l.a((Object) nVar.a(com.bytedance.als.e.class, (String) null, this), "");
        arVar.invoke(nVar);
        a2.a();
        a2.b();
        new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this)).a();
        e().C().observe(this, new x(this));
        e().f().observe(this, new y(this));
        e().K().observe(this, new z(this));
        f.a.b.b unused = k().a(this, h.f128331a, new com.bytedance.jedi.arch.ah(), new aa(this));
        if (com.ss.android.ugc.aweme.shortvideo.editcut.a.b.b(h())) {
            selectNonNullSubscribe(k(), i.f128332a, new com.bytedance.jedi.arch.ah(), new ab(this));
            e().y().observe(this, new ac(this));
            l().g().b(this, new ad(this));
        }
        o q2 = q();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = q2.e().multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null && !com.ss.android.ugc.tools.utils.k.a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
            q2.t = multiEditVideoStatusRecordData.isMultiEditRetake;
            ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.originalSegments;
            if (arrayList != null) {
                q2.f128369l = arrayList;
                ArrayList<TimeSpeedModelExtension> arrayList2 = multiEditVideoStatusRecordData.editSegments;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(arrayList);
                }
                q2.o = arrayList2;
                ArrayList<TimeSpeedModelExtension> arrayList3 = multiEditVideoStatusRecordData.restoreSegments;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>(q2.o);
                }
                q2.f128370m = arrayList3;
                ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoStatusRecordData.singleRestoreSegments;
                if (arrayList4 == null) {
                    ArrayList<TimeSpeedModelExtension> arrayList5 = q2.f128370m;
                    if (arrayList5 == null) {
                        h.f.b.l.b();
                    }
                    arrayList4 = new ArrayList<>(arrayList5);
                }
                q2.n = arrayList4;
                if (multiEditVideoStatusRecordData.segmentSizeChange) {
                    q2.n = q2.o;
                }
            }
            if (multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData == null) {
                q2.f128366i = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
            } else {
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
                h.f.b.l.b(multiEditVideoRecordData, "");
                q2.f128366i = multiEditVideoRecordData;
            }
            if (multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData == null) {
                q2.f128368k = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
            } else {
                q2.f128368k = multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData;
            }
            q2.f128367j = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(q2.d(), (MultiEditVideoRecordData) null);
            if (q2.e().mIsFromDraft && (editAdjustClipsState = q2.e().multiEditVideoRecordData.adjustClipsState) != null) {
                h.p<Long, Long> lastEditBoundary = editAdjustClipsState.getLastEditBoundary();
                if (lastEditBoundary != null) {
                    Long component1 = lastEditBoundary.component1();
                    Long component2 = lastEditBoundary.component2();
                    if (!(component1 == null || component2 == null)) {
                        q2.r = h.v.a(component1, component2);
                    }
                }
                h.p<Long, Long> viewBoundary = editAdjustClipsState.getViewBoundary();
                if (viewBoundary != null) {
                    Long component12 = viewBoundary.component1();
                    Long component22 = viewBoundary.component2();
                    if (component12 != null && component22 != null) {
                        q2.s = h.v.a(component12, component22);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.q
    public final void a(int i2) {
        this.z = i2;
    }

    static final class ar extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ar(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        public static final class a extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.editcut.a.a> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f128308a;

            static {
                Covode.recordClassIndex(84125);
            }

            public a(ar arVar) {
                this.f128308a = arVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.shortvideo.editcut.a.a get(com.bytedance.o.f fVar) {
                boolean z;
                MultiEditVideoRecordData multiEditVideoRecordData;
                List<MultiEditVideoSegmentRecordData> list;
                h.f.b.l.d(fVar, "");
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f128308a.this$0.d().multiEditVideoRecordData;
                if (multiEditVideoStatusRecordData == null || !multiEditVideoStatusRecordData.isMultiEditRetake) {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = this.f128308a.this$0.d().multiEditVideoRecordData;
                    if (!(multiEditVideoStatusRecordData2 == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) == null)) {
                        list = multiEditVideoRecordData.segmentDataList;
                    }
                    z = false;
                    int original = this.f128308a.this$0.d().getOriginal();
                    VideoPublishEditModel d2 = this.f128308a.this$0.d();
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = this.f128308a.this$0.d().multiEditVideoRecordData;
                    h.f.b.l.b(multiEditVideoStatusRecordData3, "");
                    return new com.ss.android.ugc.aweme.shortvideo.editcut.a.a(original, z, d2, multiEditVideoStatusRecordData3, this.f128308a.this$0.d().cut2EditTransferModel);
                }
                MultiEditVideoRecordData multiEditVideoRecordData2 = this.f128308a.this$0.d().multiEditVideoRecordData.restoreMultiEditVideoRecordData;
                if (multiEditVideoRecordData2 != null) {
                    list = multiEditVideoRecordData2.segmentDataList;
                }
                z = false;
                int original2 = this.f128308a.this$0.d().getOriginal();
                VideoPublishEditModel d22 = this.f128308a.this$0.d();
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData32 = this.f128308a.this$0.d().multiEditVideoRecordData;
                h.f.b.l.b(multiEditVideoStatusRecordData32, "");
                return new com.ss.android.ugc.aweme.shortvideo.editcut.a.a(original2, z, d22, multiEditVideoStatusRecordData32, this.f128308a.this$0.d().cut2EditTransferModel);
                if (list != null && list.size() > 1) {
                    z = true;
                    int original22 = this.f128308a.this$0.d().getOriginal();
                    VideoPublishEditModel d222 = this.f128308a.this$0.d();
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData322 = this.f128308a.this$0.d().multiEditVideoRecordData;
                    h.f.b.l.b(multiEditVideoStatusRecordData322, "");
                    return new com.ss.android.ugc.aweme.shortvideo.editcut.a.a(original22, z, d222, multiEditVideoStatusRecordData322, this.f128308a.this$0.d().cut2EditTransferModel);
                }
                z = false;
                int original222 = this.f128308a.this$0.d().getOriginal();
                VideoPublishEditModel d2222 = this.f128308a.this$0.d();
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3222 = this.f128308a.this$0.d().multiEditVideoRecordData;
                h.f.b.l.b(multiEditVideoStatusRecordData3222, "");
                return new com.ss.android.ugc.aweme.shortvideo.editcut.a.a(original222, z, d2222, multiEditVideoStatusRecordData3222, this.f128308a.this$0.d().cut2EditTransferModel);
            }
        }

        public static final class b extends com.bytedance.o.p<CutVideoSpeedViewModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f128309a;

            static {
                Covode.recordClassIndex(84126);
            }

            public b(ar arVar) {
                this.f128309a = arVar;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.o.p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel get(com.bytedance.o.f r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = ""
                    h.f.b.l.d(r3, r0)
                    com.ss.android.ugc.aweme.shortvideo.editcut.g$ar r0 = r2.f128309a
                    com.ss.android.ugc.aweme.shortvideo.editcut.g r0 = r0.this$0
                    android.app.Activity r1 = com.bytedance.als.dsl.g.b(r0)
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                    com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.t.a(r1)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel> r0 = com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel.class
                    com.bytedance.jedi.arch.JediViewModel r0 = r1.a(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.ar.b.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        public static final class c extends com.bytedance.o.p<p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f128310a;

            static {
                Covode.recordClassIndex(84127);
            }

            public c(ar arVar) {
                this.f128310a = arVar;
            }

            @Override // com.bytedance.o.p
            public final p get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                Activity b2 = com.bytedance.als.dsl.g.b(this.f128310a.this$0);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                return new p((androidx.fragment.app.e) b2, this.f128310a.this$0);
            }
        }

        public static final class e extends com.bytedance.o.p<db> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f128311a;

            static {
                Covode.recordClassIndex(84129);
            }

            public e(ar arVar) {
                this.f128311a = arVar;
            }

            @Override // com.bytedance.o.p
            public final db get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f128311a.this$0.o();
            }
        }

        public static final class f extends com.bytedance.o.p<CutMultiVideoViewModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f128312a;

            static {
                Covode.recordClassIndex(84130);
            }

            public f(ar arVar) {
                this.f128312a = arVar;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel] */
            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel] */
            /* JADX WARNING: Unknown variable types count: 2 */
            @Override // com.bytedance.o.p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel get(com.bytedance.o.f r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = ""
                    h.f.b.l.d(r5, r0)
                    com.ss.android.ugc.aweme.shortvideo.editcut.g$ar r0 = r4.f128312a
                    com.ss.android.ugc.aweme.shortvideo.editcut.g r0 = r0.this$0
                    android.app.Activity r1 = com.bytedance.als.dsl.g.b(r0)
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                    r0 = 0
                    androidx.lifecycle.ad r3 = androidx.lifecycle.ae.a(r1, r0)
                    java.lang.String r2 = "key_multi_video_edit_model"
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel.class
                    java.lang.Class<com.bytedance.provider.vm.ScopeViewModel> r0 = com.bytedance.provider.vm.ScopeViewModel.class
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L_0x002a
                    androidx.lifecycle.ac r0 = r3.a(r2, r1)
                L_0x0029:
                    return r0
                L_0x002a:
                    androidx.lifecycle.ac r0 = r3.a(r2, r1)
                    androidx.lifecycle.ab.a(r0, r3)
                    goto L_0x0029
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.ar.f.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.g$ar$g  reason: collision with other inner class name */
        public static final class C3349g extends com.bytedance.o.p<b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f128313a;

            static {
                Covode.recordClassIndex(84131);
            }

            public C3349g(ar arVar) {
                this.f128313a = arVar;
            }

            @Override // com.bytedance.o.p
            public final b get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new b(this.f128313a.this$0, fVar);
            }
        }

        public static final class h extends com.bytedance.o.p<VideoEditViewModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f128314a;

            static {
                Covode.recordClassIndex(84132);
            }

            public h(ar arVar) {
                this.f128314a = arVar;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel] */
            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel] */
            /* JADX WARNING: Unknown variable types count: 2 */
            @Override // com.bytedance.o.p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel get(com.bytedance.o.f r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = ""
                    h.f.b.l.d(r5, r0)
                    com.ss.android.ugc.aweme.shortvideo.editcut.g$ar r0 = r4.f128314a
                    com.ss.android.ugc.aweme.shortvideo.editcut.g r0 = r0.this$0
                    android.app.Activity r1 = com.bytedance.als.dsl.g.b(r0)
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                    r0 = 0
                    androidx.lifecycle.ad r3 = androidx.lifecycle.ae.a(r1, r0)
                    java.lang.String r2 = "key_video_edit_view_model"
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.class
                    java.lang.Class<com.bytedance.provider.vm.ScopeViewModel> r0 = com.bytedance.provider.vm.ScopeViewModel.class
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L_0x002a
                    androidx.lifecycle.ac r0 = r3.a(r2, r1)
                L_0x0029:
                    return r0
                L_0x002a:
                    androidx.lifecycle.ac r0 = r3.a(r2, r1)
                    androidx.lifecycle.ab.a(r0, r3)
                    goto L_0x0029
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.ar.h.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        public static final class i extends com.bytedance.o.p<VEVideoCutterViewModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f128315a;

            static {
                Covode.recordClassIndex(84133);
            }

            public i(ar arVar) {
                this.f128315a = arVar;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel] */
            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel] */
            /* JADX WARNING: Unknown variable types count: 2 */
            @Override // com.bytedance.o.p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel get(com.bytedance.o.f r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = ""
                    h.f.b.l.d(r5, r0)
                    com.ss.android.ugc.aweme.shortvideo.editcut.g$ar r0 = r4.f128315a
                    com.ss.android.ugc.aweme.shortvideo.editcut.g r0 = r0.this$0
                    android.app.Activity r1 = com.bytedance.als.dsl.g.b(r0)
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                    r0 = 0
                    androidx.lifecycle.ad r3 = androidx.lifecycle.ae.a(r1, r0)
                    java.lang.String r2 = "key_cutter_view_model"
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel> r1 = com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel.class
                    java.lang.Class<com.bytedance.provider.vm.ScopeViewModel> r0 = com.bytedance.provider.vm.ScopeViewModel.class
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L_0x002a
                    androidx.lifecycle.ac r0 = r3.a(r2, r1)
                L_0x0029:
                    return r0
                L_0x002a:
                    androidx.lifecycle.ac r0 = r3.a(r2, r1)
                    androidx.lifecycle.ab.a(r0, r3)
                    goto L_0x0029
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.ar.i.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        public static final class j extends com.bytedance.o.p<EditAdjustClipsBottomViewModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f128316a;

            static {
                Covode.recordClassIndex(84134);
            }

            public j(ar arVar) {
                this.f128316a = arVar;
            }

            @Override // com.bytedance.o.p
            public final EditAdjustClipsBottomViewModel get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                Activity b2 = com.bytedance.als.dsl.g.b(this.f128316a.this$0);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModel = (EditAdjustClipsBottomViewModel) com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) b2).a(EditAdjustClipsBottomViewModel.class);
                androidx.lifecycle.i lifecycle = this.f128316a.this$0.getLifecycle();
                h.f.b.l.d(lifecycle, "");
                editAdjustClipsBottomViewModel.f128067a = new EditAdjustClipsBottomViewModel.a(lifecycle);
                return editAdjustClipsBottomViewModel;
            }
        }

        public static final class d extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g> {
            static {
                Covode.recordClassIndex(84128);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.shortvideo.editcut.a.a.class, (String) null, (com.bytedance.o.p) new a(this)), "");
            h.f.b.l.b(nVar2.a(p.class, (String) null, (com.bytedance.o.p) new c(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g.class, (String) null, (com.bytedance.o.p) new d()), "");
            h.f.b.l.b(nVar2.a(db.class, (String) null, (com.bytedance.o.p) new e(this)), "");
            h.f.b.l.b(nVar2.a(CutMultiVideoViewModel.class, (String) null, (com.bytedance.o.p) new f(this)), "");
            n.a a2 = nVar2.a(b.class, (String) null, (com.bytedance.o.p) new C3349g(this));
            h.f.b.l.b(a2, "");
            a2.a(r.class);
            h.f.b.l.b(nVar2.a(VideoEditViewModel.class, (String) null, (com.bytedance.o.p) new h(this)), "");
            h.f.b.l.b(nVar2.a(VEVideoCutterViewModel.class, (String) null, (com.bytedance.o.p) new i(this)), "");
            h.f.b.l.b(nVar2.a(EditAdjustClipsBottomViewModel.class, (String) null, (com.bytedance.o.p) new j(this)), "");
            h.f.b.l.b(nVar2.a(CutVideoSpeedViewModel.class, (String) null, (com.bytedance.o.p) new b(this)), "");
            return h.z.f158842a;
        }
    }

    public static final class af implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128301a;

        static {
            Covode.recordClassIndex(84112);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        af(g gVar) {
            this.f128301a = gVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            Integer editState = this.f128301a.k().a().getEditState();
            if (editState != null && editState.intValue() == 2) {
                this.f128301a.i().c();
                return true;
            }
            this.f128301a.a(false);
            return true;
        }
    }

    static final class al<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128304a;

        static {
            Covode.recordClassIndex(84118);
        }

        al(g gVar) {
            this.f128304a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f128304a.f128297m = true;
        }
    }

    static final class am<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128305a;

        static {
            Covode.recordClassIndex(84119);
        }

        am(g gVar) {
            this.f128305a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f128305a.f128297m = true;
        }
    }

    static final class an<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128306a;

        static {
            Covode.recordClassIndex(84120);
        }

        an(g gVar) {
            this.f128306a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f128306a.f128297m = true;
        }
    }

    static final class ao<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128307a;

        static {
            Covode.recordClassIndex(84121);
        }

        ao(g gVar) {
            this.f128307a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f128307a.f128297m = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void a(com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar) {
        h.f.b.l.d(hVar, "");
        this.o = hVar;
    }

    private static Context a(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class aa extends h.f.b.m implements h.f.a.b<Float, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Float f2) {
            this.this$0.q().f128360c = f2.floatValue();
            return h.z.f158842a;
        }
    }

    static final class ai extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.tools.f.b, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.tools.f.b bVar) {
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a("content_duration_ms", this.this$0.q().b());
            return h.z.f158842a;
        }
    }

    static final class ak<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128303a;

        static {
            Covode.recordClassIndex(84117);
        }

        ak(g gVar) {
            this.f128303a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            EditAdjustClipsBottomViewModel k2 = this.f128303a.k();
            h.f.b.l.b(num, "");
            k2.c(new EditAdjustClipsBottomViewModel.n(num.intValue()));
        }
    }

    static final class ap extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ap(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(pVar, "");
            this.this$0.q().b(this.this$0.c());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aw extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.tools.f.b, h.z> {
        final /* synthetic */ boolean $musicSyncMode;

        static {
            Covode.recordClassIndex(84141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aw(boolean z) {
            super(1);
            this.$musicSyncMode = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.tools.f.b bVar) {
            String str;
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            if (this.$musicSyncMode) {
                str = "sync_on";
            } else {
                str = "sync_off";
            }
            bVar2.a("to_status", str);
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.tools.f.b, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f128321a = new q();

        static {
            Covode.recordClassIndex(84159);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.tools.f.b bVar) {
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a("to_status", "on");
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ boolean $confirmEdit;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(g gVar, boolean z) {
            super(1);
            this.this$0 = gVar;
            this.$confirmEdit = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            final boolean booleanValue = bool.booleanValue();
            this.this$0.r().a(false, (h.f.a.a<h.z>) new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.editcut.g.w.AnonymousClass1 */
                final /* synthetic */ w this$0;

                static {
                    Covode.recordClassIndex(84166);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    long a2;
                    String str;
                    Activity b2 = com.bytedance.als.dsl.g.b(this.this$0.this$0);
                    if (!(b2 instanceof com.ss.android.ugc.tools.view.a.c)) {
                        b2 = null;
                    }
                    com.ss.android.ugc.tools.view.a.c cVar = (com.ss.android.ugc.tools.view.a.c) b2;
                    if (cVar != null) {
                        cVar.c(this.this$0.this$0.u);
                    }
                    this.this$0.this$0.f128292h = false;
                    this.this$0.this$0.r = null;
                    this.this$0.this$0.l().b(true);
                    this.this$0.this$0.q().a(false, (h.f.a.a<h.p<Long, Long>>) null);
                    com.ss.android.ugc.asve.editor.g gVar = this.this$0.this$0.f128294j;
                    if (gVar != null) {
                        gVar.f(true);
                    }
                    this.this$0.this$0.g().a(true);
                    ((com.ss.android.ugc.gamora.editor.filter.core.a) this.this$0.this$0.s.getValue()).f();
                    int i2 = -1;
                    if (!booleanValue) {
                        this.this$0.this$0.q().a(null);
                        this.this$0.this$0.B();
                        o q = this.this$0.this$0.q();
                        com.ss.android.ugc.asve.editor.g gVar2 = this.this$0.this$0.f128294j;
                        if (gVar2 != null) {
                            i2 = gVar2.j();
                        }
                        o.a(q, i2, 1);
                        r.a.a(this.this$0.this$0.n(), -1, null, false, 6);
                    } else if (this.this$0.$confirmEdit) {
                        this.this$0.this$0.A();
                    } else {
                        g gVar3 = this.this$0.this$0;
                        gVar3.q().a(false, true);
                        if (gVar3.f128291g != gVar3.p) {
                            gVar3.c(gVar3.p);
                        } else if (gVar3.f128291g) {
                            gVar3.m().c().a((com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f) null, false);
                        }
                        gVar3.B();
                        o q2 = gVar3.q();
                        com.ss.android.ugc.asve.editor.g gVar4 = gVar3.f128294j;
                        if (gVar4 != null) {
                            i2 = gVar4.j();
                        }
                        o.a(q2, i2, 1);
                        r.a.a(gVar3.n(), -1, null, false, 6);
                    }
                    g gVar5 = this.this$0.this$0;
                    boolean z = this.this$0.$confirmEdit;
                    boolean z2 = booleanValue;
                    com.ss.android.ugc.asve.editor.g gVar6 = this.this$0.this$0.f128294j;
                    if (gVar6 != null) {
                        a2 = (long) gVar6.j();
                    } else {
                        a2 = this.this$0.this$0.q().a();
                    }
                    if (z) {
                        str = "click_trim_complete";
                    } else {
                        str = "click_trim_cancel";
                    }
                    p.a(str, gVar5.d(), new ag(gVar5, z2, a2));
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.q
    public final void c(List<? extends VideoSegment> list) {
        h.f.b.l.d(list, "");
        z();
        y();
        if (!this.f128292h) {
            A();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.q
    public final void d(boolean z2) {
        F().b();
        r.a.a(n(), -1, null, false, 6);
        if (!z2) {
            k().a(-1);
        }
    }

    static final class ac<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128298a;

        static {
            Covode.recordClassIndex(84108);
        }

        ac(g gVar) {
            this.f128298a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            dmt.av.video.s value;
            Boolean bool = (Boolean) obj;
            if (this.f128298a.f128291g) {
                h.f.b.l.b(bool, "");
                if (bool.booleanValue() && (value = this.f128298a.e().x().getValue()) != null) {
                    this.f128298a.y();
                    this.f128298a.m().a(value.f156950a, value.f156950a + value.f156951b);
                }
            }
        }
    }

    static final class y<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128329a;

        static {
            Covode.recordClassIndex(84168);
        }

        y(g gVar) {
            this.f128329a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            g gVar = this.f128329a;
            if (gVar.d().isMultiVideoEdit() && gVar.d().isRetakeVideo() && gVar.d().multiEditVideoRecordData != null) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = gVar.d().multiEditVideoRecordData;
                if (multiEditVideoStatusRecordData.segmentSizeChange || multiEditVideoStatusRecordData.currentEditIndex < 0) {
                    z = false;
                } else {
                    z = true;
                }
                gVar.f128293i = z;
                gVar.a(new ae(gVar, multiEditVideoStatusRecordData));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void b(boolean z2) {
        float f2;
        if (z2) {
            CutVideoSpeedViewModel E2 = E();
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = this.o;
            if (hVar != null) {
                f2 = hVar.getCurrentSpeed();
            } else {
                f2 = 1.0f;
            }
            com.ss.android.ugc.aweme.tools.i fromValue = com.ss.android.ugc.aweme.tools.i.fromValue(f2);
            h.f.b.l.b(fromValue, "");
            E2.a(fromValue);
        }
        E().b(z2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.q
    public final void a(List<? extends VideoSegment> list) {
        h.f.b.l.d(list, "");
        p.a("smart_sync_cancel", d(), new ai(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void c(boolean z2) {
        String c2;
        Cut2EditTransferModel cut2EditTransferModel;
        List<com.ss.android.ugc.aweme.shortvideo.c> musicList;
        if (this.f128291g != z2) {
            if (z2) {
                this.q = c();
                if (cr.a().f125295a == null) {
                    com.ss.android.ugc.aweme.shortvideo.c cVar = this.r;
                    if ((cVar == null && ((cut2EditTransferModel = h().f128083e) == null || (musicList = cut2EditTransferModel.getMusicList()) == null || (cVar = (com.ss.android.ugc.aweme.shortvideo.c) h.a.n.b((List) musicList, 0)) == null)) || (c2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.c(cVar)) == null) {
                        x();
                    } else {
                        a(c2, cVar);
                        p.a(m(), cVar, 0, false, 6);
                    }
                } else {
                    p.a(m(), cr.a().f125295a, d().mMusicStart, false, 4);
                }
            } else {
                this.r = cr.a().f125295a;
                a((String) null, (com.ss.android.ugc.aweme.shortvideo.c) null);
            }
            p.a("change_sync_mode", d(), new aw(z2));
        }
    }

    static final class ad<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128299a;

        static {
            Covode.recordClassIndex(84109);
        }

        ad(g gVar) {
            this.f128299a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            final T t;
            float f2;
            com.bytedance.jedi.arch.d dVar = (com.bytedance.jedi.arch.d) obj;
            if (dVar != null) {
                t = dVar.f39404b;
            } else {
                t = null;
            }
            if (t == null) {
                if (this.f128299a.f128291g) {
                    p.a(this.f128299a.m(), null, 0, false, 6);
                    g gVar = this.f128299a;
                    gVar.q().a(false, gVar.q);
                    if (gVar.f128291g) {
                        gVar.f128291g = false;
                        gVar.d().editMusicSyncMode = false;
                        gVar.k().a(false);
                        gVar.d().voiceVolume = 1.0f;
                        gVar.p().c(true);
                    }
                    gVar.k().b();
                    EditAdjustClipsBottomViewModel k2 = gVar.k();
                    com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = gVar.o;
                    if (hVar != null) {
                        f2 = hVar.getSelectedTime();
                    } else {
                        f2 = 0.0f;
                    }
                    k2.a(f2);
                    if (!this.f128299a.f128292h) {
                        this.f128299a.A();
                    }
                    this.f128299a.y();
                }
            } else if (this.f128299a.f128291g) {
                if (!this.f128299a.f128292h) {
                    this.f128299a.q().l();
                    this.f128299a.n = true;
                }
                this.f128299a.y();
                this.f128299a.m().a(t, this.f128299a.d().mMusicStart, false);
            } else {
                b.i.b(new Callable() {
                    /* class com.ss.android.ugc.aweme.shortvideo.editcut.g.ad.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(84110);
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.a(t);
                        return h.z.f158842a;
                    }
                }, com.ss.android.ugc.aweme.cw.g.a());
            }
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.tools.f.b, h.z> {
        final /* synthetic */ boolean $changed;
        final /* synthetic */ long $editDuration;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(g gVar, boolean z, long j2) {
            super(1);
            this.this$0 = gVar;
            this.$changed = z;
            this.$editDuration = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.tools.f.b bVar) {
            String str;
            String str2;
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a("is_edit", this.$changed ? 1 : 0);
            bVar2.a("is_multi_content", bl.k(this.this$0.d()));
            bVar2.a("video_cnt", this.this$0.d().videoCount);
            bVar2.a("pic_cnt", this.this$0.d().photoCount);
            bVar2.a("edit_duration", this.$editDuration);
            bVar2.a("mix_type", bl.c(this.this$0.d()));
            bVar2.a("content_duration_ms", this.this$0.q().b());
            bVar2.a("music_id", this.this$0.d().musicId);
            if (this.this$0.d().editMusicSyncMode) {
                str = "sync_on";
            } else {
                str = "sync_off";
            }
            bVar2.a("sync_mode", str);
            if (!es.k(this.this$0.d()) || !this.this$0.m().f128391a) {
                str2 = "off";
            } else {
                str2 = "on";
            }
            bVar2.a("smart_sync", str2);
            bVar2.a("music_selected_from", this.this$0.d().getMusicOrigin());
            bVar2.a("is_rotated", this.this$0.f128295k ? 1 : 0);
            bVar2.a("is_edit_speed", this.this$0.f128296l ? 1 : 0);
            bVar2.a("is_adjusted", this.this$0.f128297m ? 1 : 0);
            return h.z.f158842a;
        }
    }

    static final class aj<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128302a;

        static {
            Covode.recordClassIndex(84116);
        }

        aj(g gVar) {
            this.f128302a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            long j2;
            float f2;
            Float f3 = (Float) obj;
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = this.f128302a.o;
            if (hVar != null) {
                Integer editState = this.f128302a.k().a().getEditState();
                if (editState != null && editState.intValue() == 1) {
                    j2 = hVar.getMultiSeekTime();
                } else {
                    j2 = hVar.getSingleSeekTime();
                }
            } else {
                j2 = 0;
            }
            o q = this.f128302a.q();
            int currentEditOriginIndex = this.f128302a.k().a().getCurrentEditOriginIndex();
            h.f.b.l.b(f3, "");
            float floatValue = f3.floatValue();
            h.p<Long, Long> c2 = this.f128302a.c();
            h.f.b.l.d(c2, "");
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar = q.f128364g;
            if (iVar != null) {
                iVar.b(currentEditOriginIndex, floatValue);
            }
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar2 = q.f128364g;
            if (iVar2 != null) {
                iVar2.c((int) c2.getFirst().longValue(), (int) c2.getSecond().longValue());
            }
            r.a.a(q.j(), j2, null, false, 6);
            this.f128302a.k().g();
            EditAdjustClipsBottomViewModel k2 = this.f128302a.k();
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar2 = this.f128302a.o;
            if (hVar2 != null) {
                f2 = hVar2.getSelectedTime();
            } else {
                f2 = 0.0f;
            }
            k2.a(f2);
            this.f128302a.f128296l = true;
        }
    }

    static final class x<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128328a;

        static {
            Covode.recordClassIndex(84167);
        }

        x(g gVar) {
            this.f128328a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.shortvideo.c cVar;
            List<com.ss.android.ugc.aweme.shortvideo.c> musicList;
            int j2;
            Pair<Integer, Integer> playInOutTime;
            this.f128328a.f128294j = (com.ss.android.ugc.asve.editor.g) obj;
            o q = this.f128328a.q();
            com.ss.android.ugc.asve.editor.g gVar = this.f128328a.f128294j;
            q.f128363f = gVar;
            int i2 = 0;
            if (gVar != null) {
                q.f128364g = new d(gVar, q.f(), (byte) 0);
            }
            q.h().f129508a = gVar;
            g gVar2 = this.f128328a;
            com.ss.android.ugc.asve.editor.g gVar3 = gVar2.f128294j;
            if (!gVar2.f128290f && com.ss.android.ugc.aweme.shortvideo.editcut.a.b.b(gVar2.h())) {
                gVar2.f128290f = true;
                boolean k2 = es.k(gVar2.d());
                p m2 = gVar2.m();
                m2.f128393c = k2;
                m2.c().f125973a = gVar3;
                m2.c().a(m2);
                m2.d().a(m2.f128395e);
                m2.d().a(new p.d(m2));
                m2.d().f125925a = gVar3;
                m2.d();
                m2.e();
                if (!k2) {
                    gVar2.k().a(false);
                    return;
                }
                String str = null;
                if (gVar2.d().mIsFromDraft) {
                    com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
                    if (cVar2 != null) {
                        gVar2.m().c().f125974b = 0;
                        gVar2.m().a(cVar2);
                        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.a(cVar2);
                        MultiEditVideoRecordData curMultiEditVideoRecordData = gVar2.d().getCurMultiEditVideoRecordData();
                        if (curMultiEditVideoRecordData == null || (playInOutTime = curMultiEditVideoRecordData.getPlayInOutTime()) == null) {
                            if (gVar3 != null) {
                                j2 = gVar3.j();
                            }
                            gVar2.m().a(gVar2.d().mMusicStart, Math.min(cVar2.duration, gVar2.d().mMusicStart + i2));
                            gVar2.z();
                            return;
                        }
                        int intValue = ((Number) playInOutTime.second).intValue();
                        Object obj2 = playInOutTime.first;
                        h.f.b.l.b(obj2, "");
                        j2 = intValue - ((Number) obj2).intValue();
                        Integer valueOf = Integer.valueOf(j2);
                        if (valueOf != null) {
                            i2 = valueOf.intValue();
                        }
                        gVar2.m().a(gVar2.d().mMusicStart, Math.min(cVar2.duration, gVar2.d().mMusicStart + i2));
                        gVar2.z();
                        return;
                    }
                    return;
                }
                Cut2EditTransferModel cut2EditTransferModel = gVar2.h().f128083e;
                if (cut2EditTransferModel == null || (musicList = cut2EditTransferModel.getMusicList()) == null) {
                    cVar = null;
                } else {
                    cVar = (com.ss.android.ugc.aweme.shortvideo.c) h.a.n.b((List) musicList, 0);
                    if (cVar != null) {
                        str = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.c(cVar);
                    }
                }
                gVar2.a(str, cVar);
                p.a(gVar2.m(), cVar, gVar2.d().mMusicStart, false, 4);
            }
        }
    }

    static final class z<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128330a;

        static {
            Covode.recordClassIndex(84169);
        }

        z(g gVar) {
            this.f128330a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            T t;
            if (this.f128330a.d().isUploadVideo()) {
                g gVar = this.f128330a;
                List<VideoSegment> c2 = gVar.q().c();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = c2.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (true ^ next.f125485i) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = arrayList;
                com.ss.android.ugc.aweme.shortvideo.cut.r.a(gVar.e().C().getValue(), arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterable iterable = gVar.d().importInfoList;
                if (iterable == null) {
                    iterable = h.a.z.INSTANCE;
                }
                for (T t2 : arrayList2) {
                    Iterator<T> it2 = iterable.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        if (TextUtils.equals(t.getRealImportPath(), t2.a(false))) {
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        arrayList3.add(new ImportVideoInfo(t2.f125482f, t2.f125483g, t3.getBitRate(), t3.getEncodeId(), t2.a(z).toString(), t2.f125478b, t2.e() - t2.d(), t2.v, t2.w, t3.getOriginFps(), t2.f(), t2.a(false).toString()));
                    } else {
                        arrayList3.add(new ImportVideoInfo(t2.f125482f, t2.f125483g, t2.c(), t2.b(), t2.a(true).toString(), t2.f125478b, t2.e() - t2.d(), t2.v, t2.w, t2.a(), t2.f(), t2.a(false).toString()));
                    }
                    z = true;
                }
                if (gVar.d().importInfoList == null) {
                    gVar.d().importInfoList = new ArrayList<>();
                } else {
                    gVar.d().importInfoList.clear();
                }
                if (!arrayList3.isEmpty()) {
                    gVar.d().importInfoList.addAll(arrayList3);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void b(List<? extends VideoSegment> list) {
        h.f.b.l.d(list, "");
        int size = h().f128082d.curMultiEditVideoRecordData.segmentDataList.size();
        int i2 = 0;
        for (T t2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.n.a();
            }
            t2.f125477a = i2 + size;
            i2 = i3;
        }
        o q2 = q();
        h.f.b.l.d(list, "");
        com.ss.android.ugc.aweme.shortvideo.cut.i iVar = q2.f128364g;
        if (iVar != null) {
            iVar.a(list);
        }
        if (q2.f128362e) {
            p g2 = q2.g();
            g2.c().a(list, q2.d().segmentDataList.size(), new p.a(g2));
        } else {
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar2 = q2.f128364g;
            if (iVar2 != null) {
                iVar2.a(list, q2.d().segmentDataList.size(), 0, -1);
            }
        }
        EditAdjustClipsBottomViewModel k2 = k();
        h.f.b.l.d(list, "");
        k2.d(new EditAdjustClipsBottomViewModel.b(list));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(h.f.a.a<h.z> r19) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.g.a(h.f.a.a):void");
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class ab extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(84107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            if (this.this$0.f128291g && cr.a().f125295a != null) {
                p.a(this.this$0.m(), cr.a().f125295a, this.this$0.d().mMusicStart, false, 4);
            }
            return h.z.f158842a;
        }
    }

    public final void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar) {
        com.ss.android.ugc.aweme.cz.a.d dVar;
        cr.a().a(cVar);
        if (bp.l(d())) {
            l().a(str, cVar, true);
            return;
        }
        if (str == null || str.length() == 0) {
            dVar = d.a.a(true, null, null, null);
        } else {
            dVar = d.a.a(false, "edit_page_list", cVar, str);
        }
        l().a(dVar);
    }

    /* access modifiers changed from: package-private */
    public static final class r implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f128322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f128323b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f128324c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f128325d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f128326e;

        static {
            Covode.recordClassIndex(84160);
        }

        r(g gVar, boolean z, boolean z2, boolean z3, h.f.a.a aVar) {
            this.f128322a = gVar;
            this.f128323b = z;
            this.f128324c = z2;
            this.f128325d = z3;
            this.f128326e = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c cVar;
            if (this.f128323b) {
                this.f128322a.f().c();
                this.f128322a.d().mTimeEffect = null;
            }
            if (this.f128324c) {
                this.f128322a.g().k();
            }
            if (this.f128322a.d().isDisableOriginalSound()) {
                this.f128322a.d().resetVolume();
            }
            if (this.f128325d && (cVar = (com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c) this.f128322a.t.getValue()) != null) {
                cVar.c();
            }
            this.f128326e.invoke();
        }
    }

    private final void a(boolean z2, int i2) {
        float f2;
        if (com.ss.android.ugc.aweme.shortvideo.editcut.a.b.a(h())) {
            if (!this.f128291g) {
                com.ss.android.ugc.aweme.shortvideo.preview.a e2 = e();
                if (z2) {
                    f2 = 0.0f;
                } else {
                    f2 = d().musicVolume;
                }
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f2);
                h.f.b.l.b(ofMusic, "");
                e2.a(ofMusic);
            }
        } else if (z2) {
            long j2 = 0;
            int i3 = 0;
            for (T t2 : b()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h.a.n.a();
                }
                T t3 = t2;
                if (!t3.f125485i && i3 < i2) {
                    j2 += t3.e() - t3.d();
                }
                i3 = i4;
            }
            VideoSegment videoSegment = b().get(i2);
            q().a((int) j2, 0, (int) (videoSegment.e() - videoSegment.d()));
        } else {
            o.a(q(), 0, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void b(int i2, int i3) {
        float f2;
        float f3;
        float f4;
        CutVideoSpeedViewModel E2 = E();
        com.ss.android.ugc.aweme.tools.i fromValue = com.ss.android.ugc.aweme.tools.i.fromValue(b().get(i3).f());
        h.f.b.l.b(fromValue, "");
        E2.a(fromValue);
        k().d(new EditAdjustClipsBottomViewModel.k(i2, i3));
        EditAdjustClipsBottomViewModel k2 = k();
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h hVar = this.o;
        if (hVar != null) {
            f2 = hVar.getSelectedTime();
        } else {
            f2 = 0.0f;
        }
        k2.a(f2);
        o q2 = q();
        List<MultiEditVideoSegmentRecordData> list = q2.d().segmentDataList;
        h.f.b.l.b(list, "");
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) h.a.n.b((List) list, i3);
        if (multiEditVideoSegmentRecordData != null) {
            f3 = multiEditVideoSegmentRecordData.scale;
        } else {
            f3 = 0.0f;
        }
        q2.q = f3;
        q2.f128365h = h.v.a(Integer.valueOf(i2), Integer.valueOf(i3));
        VideoSegment videoSegment = q2.c().get(i3);
        com.ss.android.ugc.aweme.shortvideo.cut.i iVar = q2.f128364g;
        if (iVar != null) {
            iVar.a(i3, videoSegment);
        }
        if (q2.f128362e) {
            q2.h().a(videoSegment);
            p g2 = q2.g();
            h.f.b.l.d(videoSegment, "");
            g2.c().f125977e = i3;
            g2.c().d();
        }
        if (videoSegment.f() == 0.0f) {
            f4 = 1.0f;
        } else {
            f4 = videoSegment.f();
        }
        r.a.a(q2.j(), (long) (((float) videoSegment.d()) / f4), null, false, 6);
        a(true, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar);
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.v = bVar;
        this.A = com.bytedance.o.b.a.a(fVar, VideoPublishEditModel.class);
        this.B = com.bytedance.o.b.a.a(fVar, com.ss.android.ugc.aweme.shortvideo.preview.a.class);
        this.C = h.i.a(h.m.NONE, new a(this));
        this.D = h.i.a(h.m.NONE, new b(this));
        this.E = h.i.a(h.m.NONE, new c(this));
        this.s = h.i.a(h.m.NONE, new d(this));
        this.t = h.i.a(h.m.NONE, new n(this));
        this.F = h.i.a(h.m.NONE, new o(this));
        this.G = h.i.a(h.m.NONE, new e(this));
        this.H = h.i.a(h.m.NONE, new f(this));
        this.I = h.i.a(h.m.NONE, new C3350g(this));
        this.J = h.i.a(h.m.NONE, new h(this));
        this.K = h.i.a(h.m.NONE, new i(this));
        this.L = h.i.a(h.m.NONE, new j(this));
        this.M = h.i.a(h.m.NONE, new k(this));
        this.N = h.i.a(h.m.NONE, new l(this));
        this.O = h.i.a(h.m.NONE, new m(this));
        this.P = h.i.a((h.f.a.a) ax.f128317a);
        this.Q = h.i.a((h.f.a.a) new ah(this));
        this.R = h.i.a((h.f.a.a) new s(this));
        this.S = h.i.a((h.f.a.a) new t(this));
        this.T = h.i.a((h.f.a.a) new au(this));
        this.u = new af(this);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void a(int i2, int i3) {
        float f2;
        float f3;
        int i4;
        this.f128295k = true;
        o q2 = q();
        h.p<Long, Long> c2 = c();
        h.f.b.l.d(c2, "");
        VideoSegment videoSegment = q2.c().get(i2);
        List<MultiEditVideoSegmentRecordData> list = q2.d().segmentDataList;
        h.f.b.l.b(list, "");
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) h.a.n.b((List) list, i2);
        if (multiEditVideoSegmentRecordData != null) {
            if (multiEditVideoSegmentRecordData.scale == 0.0f) {
                multiEditVideoSegmentRecordData.scale = q2.f128360c;
            }
            f2 = multiEditVideoSegmentRecordData.scale;
        } else {
            f2 = q2.f128360c;
        }
        int i5 = videoSegment.f125482f;
        int i6 = videoSegment.f125483g;
        z.b bVar = new z.b();
        bVar.element = f2;
        if (i3 % LiveFeedRefreshTimeSetting.DEFAULT == 0) {
            f3 = (bVar.element * ((float) i5)) / ((float) i6);
        } else {
            bVar.element = (((float) i5) * f2) / ((float) i6);
            f3 = f2;
        }
        q2.f128361d = f3;
        float f4 = f3 - bVar.element;
        com.ss.android.ugc.asve.editor.g gVar = q2.f128363f;
        if (gVar != null) {
            i4 = ((gVar.b().height / 2) - (com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127975d / 2)) - com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127973b;
        } else {
            i4 = 0;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new o.b(q2, bVar, f4, i4, i2, f2, i3, c2));
        ofFloat.addListener(new o.c(q2, bVar, f4, i4, i2, f2, i3, c2));
        ofFloat.start();
        p.a("spin_canvas", d(), null);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.n
    public final void a(h.p<Integer, Integer> pVar, h.p<Integer, Integer> pVar2) {
        h.f.b.l.d(pVar, "");
        h.f.b.l.d(pVar2, "");
        o q2 = q();
        h.p<Long, Long> c2 = c();
        h.f.b.l.d(pVar, "");
        h.f.b.l.d(pVar2, "");
        h.f.b.l.d(c2, "");
        int intValue = pVar.component1().intValue();
        int intValue2 = pVar.component2().intValue();
        int intValue3 = pVar2.component1().intValue();
        int intValue4 = pVar2.component2().intValue();
        ArrayList<TimeSpeedModelExtension> arrayList = q2.o;
        if (arrayList != null) {
            m.a(arrayList, intValue3, intValue4);
        }
        List<MultiEditVideoSegmentRecordData> list = q2.d().segmentDataList;
        if (list != null) {
            m.a(list, intValue, intValue2);
            int i2 = 0;
            for (T t2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                t2.videoKey = i2;
                i2 = i3;
            }
        }
        if (q2.f128362e) {
            q2.g().c().a(intValue, intValue2, (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f) null);
        } else {
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar = q2.f128364g;
            if (iVar != null) {
                iVar.a(intValue, intValue2, q2.c());
            }
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar2 = q2.f128364g;
            if (iVar2 != null) {
                iVar2.c((int) c2.getFirst().longValue(), (int) c2.getSecond().longValue());
            }
        }
        r.a.a(q2.j(), 0, null, false, 6);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, com.bytedance.jedi.arch.ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
