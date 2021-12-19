package com.ss.android.ugc.aweme.servicimpl;

import androidx.lifecycle.i;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ae;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.gamora.recorder.b.b;
import com.ss.android.ugc.gamora.recorder.b.k;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.gamora.recorder.l.f;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;

public final class d implements com.bytedance.o.a, com.ss.android.ugc.gamora.recorder.b.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f121858a = {new y(d.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(d.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new y(d.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0), new y(d.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new y(d.class, "commentStickerComponent", "getCommentStickerComponent()Lcom/ss/android/ugc/aweme/comment_sticker/CommentStickerComponent;", 0), new y(d.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.creativex.recorder.b.a.d f121859b;

    /* renamed from: c  reason: collision with root package name */
    final h.h.d f121860c = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);

    /* renamed from: d  reason: collision with root package name */
    final h.h.d f121861d = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.choosemusic.a.class);

    /* renamed from: e  reason: collision with root package name */
    final h.h.d f121862e = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.z.a.class);

    /* renamed from: f  reason: collision with root package name */
    final h.h.d f121863f = com.bytedance.o.b.a.a(getDiContainer(), b.class);

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.choosemusic.a.a f121864g = ((com.ss.android.ugc.gamora.recorder.choosemusic.a.a) getDiContainer().b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null));

    /* renamed from: h  reason: collision with root package name */
    public final j f121865h = ((j) getDiContainer().b(j.class, null));

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f121866i = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.k.a.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f121867j = com.bytedance.o.b.a.a(getDiContainer(), f.class);

    /* renamed from: k  reason: collision with root package name */
    private final String f121868k;

    /* renamed from: l  reason: collision with root package name */
    private final String f121869l;

    /* renamed from: m  reason: collision with root package name */
    private final String f121870m;
    private final boolean n;
    private final com.bytedance.o.f o;

    static {
        Covode.recordClassIndex(79912);
    }

    public final com.ss.android.ugc.gamora.recorder.k.a a() {
        return (com.ss.android.ugc.gamora.recorder.k.a) this.f121866i.a(this, f121858a[1]);
    }

    public final f b() {
        return (f) this.f121867j.a(this, f121858a[2]);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final k provideScene() {
        return null;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.o;
    }

    public static final /* synthetic */ com.bytedance.creativex.recorder.b.a.d a(d dVar) {
        com.bytedance.creativex.recorder.b.a.d dVar2 = dVar.f121859b;
        if (dVar2 == null) {
            l.a("cameraApiComponent");
        }
        return dVar2;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final void initialize(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        this.f121859b = aVar.d();
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final com.ss.android.ugc.gamora.recorder.b.d createBottomTabItem(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        return new com.ss.android.ugc.gamora.recorder.b.d(this.f121868k, this.f121869l, this.f121870m, this.n, new a(this, aVar));
    }

    public static final class a implements com.ss.android.ugc.gamora.recorder.b.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f121871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.a.a f121872b;

        static {
            Covode.recordClassIndex(79913);
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabUnselected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            return false;
        }

        a(d dVar, com.ss.android.ugc.gamora.a.a aVar) {
            this.f121871a = dVar;
            this.f121872b = aVar;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabSelected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            this.f121872b.g().a("record");
            int a2 = ae.a(dVar.f147377c);
            this.f121872b.b().Z = a2;
            if (!d.a(this.f121871a).b()) {
                androidx.lifecycle.i lifecycle = this.f121872b.a().getLifecycle();
                h.f.b.l.b(lifecycle, "");
                if (lifecycle.a().isAtLeast(i.b.STARTED)) {
                    d.a(this.f121871a).a(false, new PrivacyCert(new com.bytedance.bpea.basics.j("1016"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.a()}));
                }
            }
            d dVar2 = this.f121871a;
            ((com.ss.android.ugc.aweme.shortvideo.h.a) dVar2.f121860c.a(dVar2, d.f121858a[0])).b(aVar.f147483d);
            com.ss.android.ugc.gamora.recorder.k.a a3 = this.f121871a.a();
            a3.b();
            a3.a(3, false);
            d.a(this.f121871a).a(0);
            this.f121871a.a().b(true);
            if (this.f121871a.b().d()) {
                this.f121871a.b().b(true);
            }
            if (g.a().l().shouldDropCurrentMusicFor3min(dVar.f147377c, this.f121872b.b())) {
                d dVar3 = this.f121871a;
                ((com.ss.android.ugc.gamora.recorder.choosemusic.a) dVar3.f121861d.a(dVar3, d.f121858a[3])).clearMusic();
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f121872b.a()).a(R.string.d0y).a();
            }
            String str = dVar.f147377c;
            ShortVideoContext b2 = this.f121872b.b();
            boolean z = aVar.f147485f;
            if ((h.f.b.l.a((Object) ae.a(), (Object) str) || h.f.b.l.a((Object) ae.f124883a, (Object) str) || (com.ss.android.ugc.gamora.recorder.m.d.c() && h.f.b.l.a((Object) ae.f124884b, (Object) str))) && !b2.f124757b.b() && !b2.f124757b.c()) {
                com.ss.android.ugc.aweme.tools.l lVar = new com.ss.android.ugc.aweme.tools.l(h.f.b.l.a((Object) ae.f124883a, (Object) str), true);
                lVar.f140205c = h.f.b.l.a((Object) str, (Object) ae.f124885c);
                lVar.f140207e = z;
                lVar.f140206d = 2;
                d dVar4 = this.f121871a;
                ((b) dVar4.f121863f.a(dVar4, d.f121858a[5])).configSwitchDuration(lVar);
            }
            com.ss.android.ugc.gamora.a.a aVar2 = this.f121872b;
            String str2 = dVar.f147377c;
            ShortVideoContext b3 = this.f121872b.b();
            if ((h.f.b.l.a((Object) ae.a(), (Object) str2) || h.f.b.l.a((Object) ae.f124883a, (Object) str2)) && b3.f124757b.a()) {
                if (b3.d()) {
                    b3.d(com.ss.android.ugc.aweme.shortvideo.record.b.a.a(b3.F.f124773a));
                } else if (!b3.O || (b3.f124757b.d().isEmpty() && !b3.f124757b.f124714i)) {
                    b3.d(0);
                }
                com.ss.android.ugc.aweme.shortvideo.f.a.a(b3.f124757b.y, cr.a().f125295a, b3.f124757b.q);
                aVar2.c().a(b3.f124757b.y, (long) b3.f124757b.q, b3.f124757b.f124712g, false);
            }
            com.ss.android.ugc.aweme.shortvideo.f.a.b(a2);
            if (this.f121872b.b().f124757b.f124711f.isEmpty()) {
                d dVar5 = this.f121871a;
                ((com.ss.android.ugc.aweme.z.a) dVar5.f121862e.a(dVar5, d.f121858a[4])).a(true);
            }
            return true;
        }
    }

    public d(String str, String str2, String str3, boolean z, com.bytedance.o.f fVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(fVar, "");
        this.f121868k = str;
        this.f121869l = str2;
        this.f121870m = str3;
        this.n = z;
        this.o = fVar;
    }
}
