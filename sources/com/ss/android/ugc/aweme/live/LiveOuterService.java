package com.ss.android.ugc.aweme.live;

import com.bytedance.android.livesdk.u;
import com.bytedance.android.livesdkapi.depend.model.a.h;
import com.bytedance.android.livesdkapi.host.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.l.b.a;
import com.ss.android.ugc.aweme.experiment.by;
import com.ss.android.ugc.aweme.live.aa;
import com.ss.android.ugc.aweme.live.ad;
import com.ss.android.ugc.aweme.live.af;
import com.ss.android.ugc.aweme.live.ao;
import com.ss.android.ugc.aweme.live.ap;
import com.ss.android.ugc.aweme.live.c.b;
import com.ss.android.ugc.aweme.live.e.d;
import com.ss.android.ugc.aweme.live.x;
import com.ss.android.ugc.aweme.port.internal.g;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.story.live.e;
import com.ss.android.ugc.aweme.story.live.j;

public class LiveOuterService implements ILiveOuterService {

    /* renamed from: a  reason: collision with root package name */
    private c f108072a;

    /* renamed from: b  reason: collision with root package name */
    private i f108073b = new aj();

    /* renamed from: c  reason: collision with root package name */
    private boolean f108074c = false;

    static {
        Covode.recordClassIndex(69296);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final j m() {
        return a.C0976a.f39760a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final d o() {
        return x.a.f108630a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final n c() {
        t();
        return e.f137976a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final c d() {
        t();
        return ad.a.f108097a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final com.ss.android.ugc.aweme.r.a i() {
        t();
        return j.c.f137992a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final com.ss.android.ugc.aweme.live.c.a j() {
        t();
        return b.a();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final i k() {
        t();
        return this.f108073b;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final f l() {
        t();
        return af.a.f108099a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final o n() {
        t();
        return ap.a.f108329a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final l p() {
        t();
        return ao.b.f108327a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final q q() {
        t();
        return aq.f108330a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final com.ss.android.ugc.aweme.live.feedpage.b r() {
        return new com.ss.android.ugc.aweme.live.feedpage.a();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final com.ss.android.ugc.aweme.live.feedpage.c b() {
        t();
        return com.ss.android.ugc.aweme.live.feedpage.e.f108381i.b();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final e e() {
        if (by.a()) {
            Live.initSPI();
        } else {
            t();
        }
        return aa.a.f108093a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final com.ss.android.ugc.aweme.story.live.b f() {
        if (this.f108072a == null) {
            this.f108072a = new c();
        }
        return this.f108072a;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final g g() {
        t();
        return new ai();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final h h() {
        t();
        return Live.getService().i();
    }

    private void t() {
        if (!com.ss.android.ugc.aweme.lego.b.c() || !this.f108074c) {
            LiveHostOuterService.q().i();
            if (Live.getService() != null) {
                this.f108074c = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void a() {
        AnonymousClass1 r1 = new l() {
            /* class com.ss.android.ugc.aweme.live.LiveOuterService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69297);
            }

            @Override // com.bytedance.android.livesdkapi.host.l
            public final boolean a() {
                return af.a.f108099a.b();
            }
        };
        h.f.b.l.d(r1, "");
        u.f21748a = r1;
    }

    public static ILiveOuterService s() {
        MethodCollector.i(11452);
        Object a2 = com.ss.android.ugc.b.a(ILiveOuterService.class, false);
        if (a2 != null) {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) a2;
            MethodCollector.o(11452);
            return iLiveOuterService;
        }
        if (com.ss.android.ugc.b.ct == null) {
            synchronized (ILiveOuterService.class) {
                try {
                    if (com.ss.android.ugc.b.ct == null) {
                        com.ss.android.ugc.b.ct = new LiveOuterService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11452);
                    throw th;
                }
            }
        }
        LiveOuterService liveOuterService = (LiveOuterService) com.ss.android.ugc.b.ct;
        MethodCollector.o(11452);
        return liveOuterService;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final com.ss.android.ugc.aweme.live.e.c a(Runnable runnable, com.ss.android.ugc.aweme.live.e.b bVar) {
        t();
        return new d(runnable, bVar);
    }
}
