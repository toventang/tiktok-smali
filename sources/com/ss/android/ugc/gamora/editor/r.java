package com.ss.android.ugc.gamora.editor;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.i;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.property.av;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.aa;
import com.ss.android.ugc.gamora.editor.toolbar.s;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.t;
import h.a.n;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.List;

public class r implements com.bytedance.o.a, ac {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f146361b = {new y(r.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(r.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new y(r.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0), new y(r.class, "replaceMusicToolbarApi", "getReplaceMusicToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0), new y(r.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new y(r.class, "lighteningBottomComponent", "getLighteningBottomComponent()Lcom/ss/android/ugc/gamora/editor/lightening/bottom/LighteningBottomComponent;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final h.h.d f146362a = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.edit.g f146363c = new com.ss.android.ugc.aweme.shortvideo.edit.g();

    /* renamed from: d  reason: collision with root package name */
    public String f146364d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f146365e;

    /* renamed from: f  reason: collision with root package name */
    public final l<com.bytedance.jedi.arch.d<com.ss.android.ugc.aweme.shortvideo.c>> f146366f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.fragment.app.e f146367g;

    /* renamed from: h  reason: collision with root package name */
    public final s f146368h;

    /* renamed from: i  reason: collision with root package name */
    private final EditToolbarViewModel f146369i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f146370j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f146371k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f146372l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f146373m;
    private final h.h n;
    private final h.h o;
    private final h.h.d p;
    private final h.h.d q;
    private final com.bytedance.als.h<com.bytedance.jedi.arch.d<com.ss.android.ugc.aweme.shortvideo.c>> r;
    private boolean s;
    private final h.h.d t;
    private final com.bytedance.o.f u;

    static {
        Covode.recordClassIndex(96214);
    }

    private final s l() {
        return (s) this.f146370j.a(this, f146361b[1]);
    }

    private final com.ss.android.ugc.gamora.editor.a.d m() {
        return (com.ss.android.ugc.gamora.editor.a.d) this.f146371k.a(this, f146361b[2]);
    }

    private final com.ss.android.ugc.aweme.ftc.components.cutmusic.a n() {
        return (com.ss.android.ugc.aweme.ftc.components.cutmusic.a) this.n.getValue();
    }

    private final com.ss.android.ugc.gamora.editor.music.a o() {
        return (com.ss.android.ugc.gamora.editor.music.a) this.q.a(this, f146361b[4]);
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public int b() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public final VideoPublishEditModel c() {
        return (VideoPublishEditModel) this.f146362a.a(this, f146361b[0]);
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.gamora.editor.cutmusic.a d() {
        return (com.ss.android.ugc.gamora.editor.cutmusic.a) this.f146372l.getValue();
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.gamora.editor.volume.a e() {
        return (com.ss.android.ugc.gamora.editor.volume.a) this.f146373m.getValue();
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.shortvideo.preview.a f() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.o.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public final com.bytedance.als.h<com.bytedance.jedi.arch.d<com.ss.android.ugc.aweme.shortvideo.c>> g() {
        return this.r;
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.u;
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public final String j() {
        return this.f146364d;
    }

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.gamora.editor.cutmusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.r.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.ftc.components.cutmusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.r.b.invoke():com.bytedance.als.b");
        }
    }

    public static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.o.a aVar) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.r.c.invoke():com.bytedance.als.b");
        }
    }

    public static final class d extends m implements h.f.a.a<com.ss.android.ugc.gamora.editor.volume.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.volume.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.volume.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.volume.a> r1 = com.ss.android.ugc.gamora.editor.volume.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.r.d.invoke():com.bytedance.als.b");
        }
    }

    public final void i() {
        f().v().setValue(t.a());
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(96222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.i();
            if (bp.l(this.this$0.c())) {
                this.this$0.f146368h.X();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public final void k() {
        if (!bz.a(c()) && c().isMvThemeVideoType() && !k.a(c().mvCreateVideoData.musicIds)) {
            com.ss.android.ugc.aweme.port.in.l.f115658a.b().a((com.ss.android.ugc.aweme.cz.a.f) cr.a()).a(new f(this)).a(c().mvCreateVideoData.musicIds);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public void a() {
        com.ss.android.ugc.gamora.editor.a.d m2;
        f().a(new VEPreviewMusicParams());
        this.f146364d = c().mMusicPath;
        c().mMusicPath = null;
        c().musicId = "";
        c().previewStartTime = 0.0f;
        c().isOriginalSound = false;
        c().isCommerceMusic = false;
        c().mMusicStart = 0;
        c().mMusicOrigin = "";
        c().isSoundLoop = false;
        q.a("SoundLoop, NormalMusic clearMusic isSoundLoop = " + c().isSoundLoop);
        a(false);
        c(true);
        d(false);
        if (c().isAudioEnhance && (m2 = m()) != null) {
            m2.c();
        }
        this.f146366f.b(new com.bytedance.jedi.arch.d<>(null));
        com.ss.android.ugc.gamora.editor.music.a o2 = o();
        if (o2 != null) {
            o2.a((com.ss.android.ugc.aweme.shortvideo.c) null);
        }
        com.ss.android.ugc.gamora.editor.lightening.a.a aVar = (com.ss.android.ugc.gamora.editor.lightening.a.a) this.t.a(this, f146361b[5]);
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public final void h() {
        String str;
        String str2;
        boolean z;
        String missionId;
        String musicId;
        AVChallenge aVChallenge;
        List<String> b2;
        String str3 = c().mStickerID;
        if (str3 == null || (b2 = p.b(str3, new String[]{","})) == null) {
            str = null;
        } else {
            str = (String) n.b((List) b2, 0);
        }
        ArrayList<TimeSpeedModelExtension> a2 = CameraComponentModel.a(c().mVideoSegmentsDesc);
        List list = c().challenges;
        if (list == null || (aVChallenge = (AVChallenge) n.b(list, 0)) == null) {
            str2 = null;
        } else {
            str2 = aVChallenge.cid;
        }
        String str4 = c().mFirstStickerMusicIdsJson;
        boolean isAllowClearMusic = c().isAllowClearMusic();
        boolean z2 = c().isPhotoMvMode;
        boolean z3 = this.f146365e;
        String str5 = c().mShootWay;
        String str6 = c().creationId;
        boolean a3 = com.ss.android.ugc.aweme.shortvideo.edit.videolength.a.a(c());
        h.f.b.l.b(a2, "");
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) n.h((List) a2);
        if (timeSpeedModelExtension != null) {
            z = timeSpeedModelExtension.isBusiSticker();
        } else {
            z = false;
        }
        boolean useMusicBeatSticker = c().useMusicBeatSticker();
        long j2 = c().maxDuration;
        long videoLength = (long) c().getVideoLength();
        Mission mission = PublishExtensionModel.fromString(c().commerceData).mission;
        if (mission == null) {
            missionId = null;
        } else {
            missionId = mission.getMissionId();
        }
        Mission mission2 = PublishExtensionModel.fromString(c().commerceData).mission;
        if (mission2 != null && !mission2.isMusicToasted()) {
            musicId = mission2.getMusicId();
        } else {
            musicId = null;
        }
        com.ss.android.ugc.aweme.shortvideo.edit.e eVar = new com.ss.android.ugc.aweme.shortvideo.edit.e(str4, str, str2, isAllowClearMusic, z2, z3, str5, str6, a3, z, useMusicBeatSticker, j2, videoLength, missionId, musicId);
        androidx.fragment.app.e eVar2 = this.f146367g;
        g gVar = new g(this);
        h hVar = new h(this);
        Bundle bundle = new Bundle();
        if (cr.a().f125298d.size() > 0) {
            bundle.putString("challenge", cr.a().f125298d.get(0).cid);
        } else if (eVar.f127021c != null) {
            bundle.putString("challenge", eVar.f127021c);
        }
        if (!TextUtils.isEmpty(eVar.f127019a)) {
            bundle.putString("first_sticker_music_ids", eVar.f127019a);
        }
        if (!TextUtils.isEmpty(eVar.f127020b)) {
            bundle.putString("first_sticker_id", eVar.f127020b);
        }
        bundle.putBoolean("is_busi_sticker", eVar.f127028j);
        if (eVar.f127029k) {
            bundle.putBoolean("hide_cancel_music_ui", true);
        }
        if (eVar.f127030l != 0) {
            bundle.putLong("max_video_duration", eVar.f127030l);
        }
        if (eVar.f127030l != 0) {
            bundle.putLong("shoot_video_length", eVar.f127031m);
        }
        if (!TextUtils.isEmpty(eVar.o)) {
            bundle.putString("mission_music_id", eVar.o);
        }
        if (!TextUtils.isEmpty(eVar.n)) {
            bundle.putString("mission_id", eVar.n);
        }
        com.ss.android.ugc.aweme.port.in.l.f115658a.b().a(eVar2, 110, new com.ss.android.ugc.aweme.cz.a.c(eVar2.getString(R.string.ab8), 0, eVar.f127022d, eVar.f127023e, bundle, eVar.f127025g, eVar.f127026h, false, false, eVar.f127024f, eVar.f127027i), gVar, hVar);
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public final void b(boolean z) {
        this.s = z;
    }

    /* access modifiers changed from: protected */
    public final void c(boolean z) {
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (z) {
            cVar = null;
        }
        a(cVar);
    }

    static final class g extends m implements h.f.a.b<com.ss.android.ugc.aweme.cz.a.d, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(96221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(r rVar) {
            super(1);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.cz.a.d dVar) {
            com.ss.android.ugc.aweme.cz.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            this.this$0.a(dVar2);
            if (bp.l(this.this$0.c())) {
                this.this$0.f146368h.X();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public void a(boolean z) {
        if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            ((FTCEditToolbarViewModel) com.bytedance.jedi.arch.t.a(this.f146367g).a(FTCEditToolbarViewModel.class)).b(8, z);
        } else {
            this.f146369i.b(8, z);
        }
    }

    /* access modifiers changed from: protected */
    public final void d(boolean z) {
        if (this.s) {
            if (z) {
                androidx.lifecycle.i lifecycle = this.f146367g.getLifecycle();
                h.f.b.l.b(lifecycle, "");
                if (lifecycle.a() != i.b.RESUMED) {
                    return;
                }
            }
            androidx.lifecycle.t<t> v = f().v();
            v.setValue(t.b());
            v.setValue(t.b(0));
            v.setValue(t.a());
        }
    }

    private final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        if (av.a()) {
            EditToolbarViewModel editToolbarViewModel = this.f146369i;
            Drawable a2 = androidx.core.content.b.a(this.f146367g, 2131232540);
            if (a2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a2, "");
            editToolbarViewModel.a(a2);
        } else if (cVar == null) {
            EditToolbarViewModel editToolbarViewModel2 = this.f146369i;
            Drawable a3 = androidx.core.content.b.a(this.f146367g, 2131232355);
            if (a3 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a3, "");
            editToolbarViewModel2.a(a3);
        } else {
            EditToolbarViewModel editToolbarViewModel3 = this.f146369i;
            Drawable a4 = androidx.core.content.b.a(this.f146367g, 2131232539);
            if (a4 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a4, "");
            editToolbarViewModel3.a(a4);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ac
    public final void a(com.ss.android.ugc.aweme.cz.a.d dVar) {
        h.f.b.l.d(dVar, "");
        if (dVar.f79323a) {
            a();
            s l2 = l();
            if (l2 != null) {
                l2.b(0);
            }
        } else if (com.ss.android.ugc.aweme.shortvideo.edit.videolength.a.a(c()) && com.ss.android.ugc.aweme.shortvideo.edit.videolength.a.a(dVar.f79325c)) {
            f().v().setValue(t.a());
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f146367g).a(R.string.d13).a();
        } else if (!TextUtils.isEmpty(dVar.f79326d)) {
            a(dVar.f79326d, dVar.f79324b);
            s l3 = l();
            if (l3 != null) {
                l3.b(1);
            }
            if (dVar.f79325c != null) {
                com.ss.android.ugc.aweme.shortvideo.d a2 = com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a(dVar.f79325c);
                if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                    com.ss.android.ugc.aweme.ftc.components.cutmusic.a n2 = n();
                    com.ss.android.ugc.aweme.shortvideo.c cVar = dVar.f79325c;
                    if (cVar == null) {
                        h.f.b.l.b();
                    }
                    n2.a(a2, cVar.getDuration());
                } else {
                    com.ss.android.ugc.gamora.editor.cutmusic.a d2 = d();
                    com.ss.android.ugc.aweme.shortvideo.c cVar2 = dVar.f79325c;
                    if (cVar2 == null) {
                        h.f.b.l.b();
                    }
                    d2.a(a2, cVar2.getDuration(), 0);
                }
            }
        }
        aa aaVar = (aa) this.p.a(this, f146361b[3]);
        if (aaVar != null) {
            aaVar.a();
        }
    }

    public static final class e implements h.h.d<Object, com.ss.android.ugc.gamora.editor.music.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.a f146374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f146375b;

        static {
            Covode.recordClassIndex(96219);
        }

        public e(com.bytedance.o.a aVar, r rVar) {
            this.f146374a = aVar;
            this.f146375b = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.h.d
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.music.a a(Object obj, h.k.i iVar) {
            h.f.b.l.d(obj, "");
            h.f.b.l.d(iVar, "");
            Object b2 = this.f146374a.getDiContainer().b(com.ss.android.ugc.gamora.editor.music.a.class, null);
            if (bp.l(this.f146375b.c())) {
                return b2;
            }
            return null;
        }
    }

    static final class f implements com.ss.android.ugc.aweme.cz.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f146376a;

        static {
            Covode.recordClassIndex(96220);
        }

        f(r rVar) {
            this.f146376a = rVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.b
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
            r rVar = this.f146376a;
            h.f.b.l.b(cVar, "");
            rVar.f146365e = cVar.isMvThemeMusic();
            this.f146376a.a(cVar, z, "mv_default");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x026c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 634
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.r.a(java.lang.String, java.lang.String):void");
    }

    public r(androidx.fragment.app.e eVar, s sVar, com.bytedance.o.f fVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(sVar, "");
        h.f.b.l.d(fVar, "");
        this.f146367g = eVar;
        this.f146368h = sVar;
        this.u = fVar;
        JediViewModel a2 = com.bytedance.jedi.arch.t.a(eVar).a(EditToolbarViewModel.class);
        h.f.b.l.b(a2, "");
        this.f146369i = (EditToolbarViewModel) a2;
        this.f146370j = com.bytedance.o.b.a.b(getDiContainer(), s.class);
        this.f146371k = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.a.d.class);
        this.f146372l = h.i.a(h.m.NONE, new a(this));
        this.f146373m = h.i.a(h.m.NONE, new d(this));
        this.n = h.i.a(h.m.NONE, new b(this));
        this.o = h.i.a(h.m.NONE, new c(this));
        this.p = com.bytedance.o.b.a.b(getDiContainer(), aa.class);
        this.q = new e(this, this);
        l<com.bytedance.jedi.arch.d<com.ss.android.ugc.aweme.shortvideo.c>> lVar = new l<>(null);
        this.f146366f = lVar;
        this.r = lVar;
        this.s = true;
        this.t = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.lightening.a.a.class);
    }

    public void a(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z, String str) {
        VEMVAudioInfo e2;
        if (cVar != null && z) {
            this.f146366f.b(new com.bytedance.jedi.arch.d<>(cVar));
            com.ss.android.ugc.gamora.editor.music.a o2 = o();
            if (o2 != null) {
                o2.a(cVar);
            }
            c().musicId = cVar.getMusicId();
            c().previewStartTime = cVar.getPreviewStartTime();
            c().isCommerceMusic = cVar.isCommerceMusic();
            c().isOriginalSound = cVar.isOriginalSound();
            com.ss.android.ugc.asve.editor.g value = f().C().getValue();
            if (value == null || (e2 = value.e()) == null) {
                c().mMusicStart = 0;
                c().mMusicEnd = Math.min(cVar.getPresenterDuration(), 60000);
            } else {
                c().mMusicStart = e2.trimIn;
                c().mMusicEnd = e2.trimOut;
            }
            c().mMusicOrigin = str;
        }
    }
}
