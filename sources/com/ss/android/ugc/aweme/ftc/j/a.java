package com.ss.android.ugc.aweme.ftc.j;

import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.j;
import com.bytedance.bpea.store.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ae;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.gamora.recorder.b.k;
import com.ss.android.ugc.gamora.recorder.b.l;
import h.f.b.l;

public final class a implements com.ss.android.ugc.gamora.recorder.b.a {

    /* renamed from: a  reason: collision with root package name */
    public d f98640a;

    /* renamed from: b  reason: collision with root package name */
    private final String f98641b;

    /* renamed from: c  reason: collision with root package name */
    private final String f98642c;

    /* renamed from: d  reason: collision with root package name */
    private final String f98643d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f98644e;

    static {
        Covode.recordClassIndex(62720);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final k provideScene() {
        return null;
    }

    public static final /* synthetic */ d a(a aVar) {
        d dVar = aVar.f98640a;
        if (dVar == null) {
            l.a("cameraApiComponent");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final void initialize(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        this.f98640a = aVar.d();
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final com.ss.android.ugc.gamora.recorder.b.d createBottomTabItem(com.ss.android.ugc.gamora.a.a aVar) {
        l.d(aVar, "");
        return new com.ss.android.ugc.gamora.recorder.b.d(this.f98641b, this.f98642c, this.f98643d, this.f98644e, new C2393a(this, aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.j.a$a  reason: collision with other inner class name */
    public static final class C2393a implements com.ss.android.ugc.gamora.recorder.b.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f98645a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.a.a f98646b;

        static {
            Covode.recordClassIndex(62721);
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabUnselected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            return false;
        }

        C2393a(a aVar, com.ss.android.ugc.gamora.a.a aVar2) {
            this.f98645a = aVar;
            this.f98646b = aVar2;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabSelected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            int i2;
            com.ss.android.ugc.aweme.z.a aVar2;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            this.f98646b.g().a("record");
            String str = dVar.f147377c;
            h.f.b.l.d(str, "");
            if (h.f.b.l.a((Object) str, (Object) ae.f124883a)) {
                i2 = 10;
            } else if (h.f.b.l.a((Object) str, (Object) ae.a())) {
                i2 = 11;
            } else {
                i2 = 8;
            }
            this.f98646b.b().Z = i2;
            ApiCenter a2 = ApiCenter.a.a(this.f98646b.a());
            if (!a.a(this.f98645a).b()) {
                a.a(this.f98645a).a(false, new PrivacyCert(new j("1017"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{b.a()}));
            }
            ((com.ss.android.ugc.aweme.shortvideo.h.a) a2.a(com.ss.android.ugc.aweme.shortvideo.h.a.class)).b(true);
            com.ss.android.ugc.aweme.ftc.h.a aVar3 = (com.ss.android.ugc.aweme.ftc.h.a) a2.a(com.ss.android.ugc.aweme.ftc.h.a.class);
            aVar3.c();
            aVar3.a();
            a.a(this.f98645a).a(0);
            ((com.ss.android.ugc.aweme.ftc.h.a) a2.a(com.ss.android.ugc.aweme.ftc.h.a.class)).a(true);
            if (g.a().e().getSpeedPanelOpen(false)) {
                ((com.ss.android.ugc.aweme.ftc.k.d) a2.a(com.ss.android.ugc.aweme.ftc.k.d.class)).a(true);
            }
            com.ss.android.ugc.gamora.a.a aVar4 = this.f98646b;
            String str2 = dVar.f147377c;
            this.f98646b.b();
            boolean z = aVar.f147485f;
            if (h.f.b.l.a((Object) ae.a(), (Object) str2) || h.f.b.l.a((Object) ae.f124883a, (Object) str2)) {
                com.ss.android.ugc.aweme.tools.l lVar = new com.ss.android.ugc.aweme.tools.l(!h.f.b.l.a((Object) ae.a(), (Object) str2), true);
                lVar.f140207e = z;
                lVar.f140206d = 2;
                ((com.ss.android.ugc.aweme.ftc.a.a) ApiCenter.a.a(aVar4.a()).a(com.ss.android.ugc.aweme.ftc.a.a.class)).a(lVar);
            }
            com.ss.android.ugc.gamora.a.a aVar5 = this.f98646b;
            String str3 = dVar.f147377c;
            ShortVideoContext b2 = this.f98646b.b();
            if ((h.f.b.l.a((Object) ae.a(), (Object) str3) || h.f.b.l.a((Object) ae.f124883a, (Object) str3)) && b2.f124757b.a()) {
                if (b2.d()) {
                    b2.d(com.ss.android.ugc.aweme.shortvideo.record.b.a.a(b2.F.f124773a));
                } else if (!b2.O || b2.f124757b.d().isEmpty()) {
                    b2.d(0);
                }
                com.ss.android.ugc.aweme.shortvideo.f.a.a(b2.f124757b.y, cr.a().f125295a, b2.f124757b.q);
                aVar5.c().a(b2.f124757b.y, (long) b2.f124757b.q, b2.f124757b.f124712g, false);
            }
            com.ss.android.ugc.aweme.shortvideo.f.a.b(i2);
            if (this.f98646b.b().f124757b.f124711f.isEmpty() && (aVar2 = (com.ss.android.ugc.aweme.z.a) a2.b(com.ss.android.ugc.aweme.z.a.class)) != null) {
                aVar2.a(true);
            }
            return true;
        }
    }

    public a(String str, String str2, String str3, boolean z) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        this.f98641b = str;
        this.f98642c = str2;
        this.f98643d = str3;
        this.f98644e = z;
    }
}
