package com.ss.android.ugc.gamora.editor;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.gamora.editor.toolbar.s;
import com.ss.android.ugc.tools.utils.q;
import dmt.av.video.VEPreviewMusicParams;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m;

public final class f extends r {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f145836a = {new y(f.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new y(f.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0), new y(f.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0)};

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.c f145837i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f145838j;

    /* renamed from: k  reason: collision with root package name */
    private String f145839k = c().musicId;

    /* renamed from: l  reason: collision with root package name */
    private String f145840l = c().mMusicOrigin;

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f145841m = new b(this, this);
    private final h.h.d n = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.a.d.class);
    private final h.h.d o = com.bytedance.o.b.a.b(getDiContainer(), s.class);
    private final h p = h.i.a(m.NONE, new a(this));
    private final h q = h.i.a((h.f.a.a) c.f145845a);

    static {
        Covode.recordClassIndex(95831);
    }

    private final com.ss.android.ugc.gamora.editor.music.a l() {
        return (com.ss.android.ugc.gamora.editor.music.a) this.f145841m.a(this, f145836a[0]);
    }

    private final s m() {
        return (s) this.o.a(this, f145836a[2]);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.lightening.b.d> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.lightening.b.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.lightening.b.d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.lightening.b.d> r1 = com.ss.android.ugc.gamora.editor.lightening.b.d.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.f.a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ac, com.ss.android.ugc.gamora.editor.r
    public final void a() {
        super.a();
        n();
        this.f145839k = "";
        this.f145840l = "";
        this.f145838j = false;
    }

    static final class c extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f145845a = new c();

        static {
            Covode.recordClassIndex(95834);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ac, com.ss.android.ugc.gamora.editor.r
    public final int b() {
        Integer b2;
        if (!this.f145838j || (b2 = l.f115658a.b().k().a().b()) == null) {
            return -1;
        }
        return b2.intValue();
    }

    private final void n() {
        String a2 = com.ss.android.ugc.aweme.ba.c.a(cr.a().f125295a);
        h.f.b.l.b(a2, "");
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f156736a = null;
        vEPreviewMusicParams.f156737b = 0;
        vEPreviewMusicParams.f156741f = a2;
        vEPreviewMusicParams.f156738c = 0;
        vEPreviewMusicParams.f156739d = 0;
        if (cr.a().f125295a != null) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(cVar, "");
            vEPreviewMusicParams.f156742g = cVar.getPreviewStartTime();
        }
        vEPreviewMusicParams.n = 0;
        vEPreviewMusicParams.o = 0.0d;
        vEPreviewMusicParams.p = 0.0d;
        vEPreviewMusicParams.q = 0.0d;
        f().a(vEPreviewMusicParams);
        this.f146364d = c().mMusicPath;
        c().mMusicPath = null;
        c().musicId = a2;
        c().mMusicStart = 0;
        c().isSoundLoop = false;
        q.a("SoundLoop, AiMusic PreviewMusicRemove isSoundLoop = " + c().isSoundLoop + ' ');
        a(bp.a(c(), c().mMusicPath));
        c(false);
        this.f145837i = null;
    }

    public static final class d implements k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f145846a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f145847b;

        static {
            Covode.recordClassIndex(95835);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a
        public final void a(com.ss.android.ugc.aweme.shortvideo.d dVar) {
            if (dVar != null) {
                this.f145847b.setMusicWaveData(dVar.getMusicWavePointArray());
            }
            this.f145846a.d().a(dVar, this.f145847b.duration, 0);
        }

        d(f fVar, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            this.f145846a = fVar;
            this.f145847b = cVar;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ac, com.ss.android.ugc.gamora.editor.r
    public final void a(boolean z) {
        com.ss.android.ugc.gamora.editor.music.a l2 = l();
        if (l2 != null) {
            l2.a(z);
        }
    }

    public static final class b implements h.h.d<Object, com.ss.android.ugc.gamora.editor.music.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.a f145843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f145844b;

        static {
            Covode.recordClassIndex(95833);
        }

        public b(com.bytedance.o.a aVar, f fVar) {
            this.f145843a = aVar;
            this.f145844b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.h.d
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.music.a a(Object obj, i iVar) {
            h.f.b.l.d(obj, "");
            h.f.b.l.d(iVar, "");
            Object b2 = this.f145843a.getDiContainer().b(com.ss.android.ugc.gamora.editor.music.a.class, null);
            if (bp.l(this.f145844b.c())) {
                return b2;
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.r
    public final void a(String str, String str2) {
        super.a(str, str2);
        this.f145839k = com.ss.android.ugc.aweme.ba.c.a(cr.a().f125295a);
        this.f145840l = str2;
        this.f145838j = false;
        this.f145837i = cr.a().f125295a;
    }

    @Override // com.ss.android.ugc.gamora.editor.r
    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z, String str) {
        com.ss.android.ugc.gamora.editor.music.a l2;
        super.a(cVar, z, str);
        if (z && (l2 = l()) != null) {
            if (cVar == null) {
                h.f.b.l.b();
            }
            l2.b(cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(e eVar, s sVar, com.bytedance.o.f fVar) {
        super(eVar, sVar, fVar);
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(sVar, "");
        h.f.b.l.d(fVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02dc  */
    @Override // com.ss.android.ugc.gamora.editor.ac, com.ss.android.ugc.gamora.editor.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r14, com.ss.android.ugc.aweme.shortvideo.c r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 803
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.f.a(java.lang.String, com.ss.android.ugc.aweme.shortvideo.c, boolean):void");
    }
}
