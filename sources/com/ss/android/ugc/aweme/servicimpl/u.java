package com.ss.android.ugc.aweme.servicimpl;

import androidx.fragment.app.e;
import androidx.lifecycle.i;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.da;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.aweme.shortvideo.w.n;
import com.ss.android.ugc.gamora.recorder.b.k;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public final class u implements com.bytedance.o.a, com.ss.android.ugc.gamora.recorder.b.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f121930a = {new y(u.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(u.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(u.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new y(u.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(u.class, "commentStickerComponent", "getCommentStickerComponent()Lcom/ss/android/ugc/aweme/comment_sticker/CommentStickerComponent;", 0), new y(u.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f121931f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final d f121932b;

    /* renamed from: c  reason: collision with root package name */
    final d f121933c;

    /* renamed from: d  reason: collision with root package name */
    final d f121934d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f121935e;

    /* renamed from: g  reason: collision with root package name */
    private final d f121936g;

    /* renamed from: h  reason: collision with root package name */
    private final d f121937h;

    /* renamed from: i  reason: collision with root package name */
    private final d f121938i;

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.choosemusic.a.a f121939j;

    /* renamed from: k  reason: collision with root package name */
    private final j f121940k;

    /* renamed from: l  reason: collision with root package name */
    private final String f121941l;

    /* renamed from: m  reason: collision with root package name */
    private final String f121942m;
    private final String n;
    private final boolean o = true;
    private final f p;

    static {
        Covode.recordClassIndex(79941);
    }

    public final m a() {
        return (m) this.f121936g.a(this, f121930a[0]);
    }

    public final com.ss.android.ugc.gamora.recorder.k.d b() {
        return (com.ss.android.ugc.gamora.recorder.k.d) this.f121937h.a(this, f121930a[2]);
    }

    public final com.bytedance.creativex.recorder.b.a.d c() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f121938i.a(this, f121930a[3]);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final k provideScene() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79942);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.p;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final com.ss.android.ugc.gamora.recorder.b.d createBottomTabItem(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        return new com.ss.android.ugc.gamora.recorder.b.d(this.f121941l, this.f121942m, this.n, this.o, new b(this, aVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final void initialize(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        a().a(da.class, new j((e) getDiContainer().a(e.class), (z) getDiContainer().a(z.class), (g) getDiContainer().a(n.class), aVar.b(), (c) getDiContainer().a(c.class), (j) getDiContainer().a(j.class), aVar));
    }

    public static final class b implements com.ss.android.ugc.gamora.recorder.b.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f121943a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.a.a f121944b;

        static {
            Covode.recordClassIndex(79943);
        }

        b(u uVar, com.ss.android.ugc.gamora.a.a aVar) {
            this.f121943a = uVar;
            this.f121944b = aVar;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabUnselected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            this.f121943a.b().d(false);
            return false;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabSelected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            if (!this.f121943a.c().b() && this.f121943a.f121935e) {
                androidx.lifecycle.i lifecycle = this.f121944b.a().getLifecycle();
                h.f.b.l.b(lifecycle, "");
                if (lifecycle.a().isAtLeast(i.b.STARTED)) {
                    this.f121943a.c().a(false, PrivacyCert.Builder.Companion.with("bpea-286").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                }
            }
            this.f121944b.g().a("record");
            this.f121943a.a().a(da.class);
            this.f121944b.b().Z = 15;
            u uVar = this.f121943a;
            ((com.ss.android.ugc.aweme.shortvideo.h.a) uVar.f121932b.a(uVar, u.f121930a[1])).b(true);
            com.ss.android.ugc.gamora.recorder.k.d b2 = this.f121943a.b();
            b2.b();
            b2.a(3, false);
            b2.b(true);
            b2.d(true);
            this.f121943a.c().a(0);
            u uVar2 = this.f121943a;
            ShortVideoContext b3 = this.f121944b.b();
            boolean z = aVar.f147485f;
            if (!b3.f124757b.b() && !b3.f124757b.c()) {
                com.ss.android.ugc.aweme.tools.l lVar = new com.ss.android.ugc.aweme.tools.l(true, true);
                lVar.f140207e = z;
                lVar.f140206d = 2;
                lVar.f140208f = false;
                ((com.ss.android.ugc.gamora.recorder.b.b) uVar2.f121934d.a(uVar2, u.f121930a[5])).configSwitchDuration(lVar);
            }
            com.ss.android.ugc.aweme.shortvideo.f.a.b(15);
            u uVar3 = this.f121943a;
            com.ss.android.ugc.aweme.z.a aVar2 = (com.ss.android.ugc.aweme.z.a) uVar3.f121933c.a(uVar3, u.f121930a[4]);
            if (aVar2 != null) {
                aVar2.a(true);
            }
            return true;
        }
    }

    public u(String str, String str2, String str3, boolean z, f fVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(fVar, "");
        this.f121941l = str;
        this.f121942m = str2;
        this.n = str3;
        this.f121935e = z;
        this.p = fVar;
        this.f121936g = com.bytedance.o.b.a.a(getDiContainer(), m.class);
        this.f121932b = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);
        this.f121937h = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.k.d.class);
        this.f121938i = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.f121933c = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.aweme.z.a.class);
        this.f121934d = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);
        this.f121939j = (com.ss.android.ugc.gamora.recorder.choosemusic.a.a) getDiContainer().b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null);
        this.f121940k = (j) getDiContainer().b(j.class, null);
    }
}
