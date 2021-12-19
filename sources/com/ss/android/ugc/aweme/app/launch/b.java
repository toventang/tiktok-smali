package com.ss.android.ugc.aweme.app.launch;

import android.content.Context;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.statisticlogger.e;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask;
import com.ss.android.ugc.aweme.legoImp.task.RedBadgeUpdateTask;
import f.a.d.f;
import f.a.d.k;
import f.a.t;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(41152);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.b$b  reason: collision with other inner class name */
    public static final class C1502b implements f<com.bytedance.ies.ugc.statisticlogger.config.c> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f66834a;

        static {
            Covode.recordClassIndex(41154);
        }

        C1502b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.ies.ugc.statisticlogger.config.c cVar) {
            if (!this.f66834a) {
                new f.c().b((w) new MonitorInitTask()).a();
                this.f66834a = true;
            }
            if (!m.a(AppLog.getClientId()) && !m.a(com.bytedance.ies.ugc.statisticlogger.a.a())) {
                new f.c().b((w) new RedBadgeUpdateTask()).a();
            }
        }
    }

    static final class a<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66833a = new a();

        static {
            Covode.recordClassIndex(41153);
        }

        a() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            l.d(obj, "");
            if (obj == com.bytedance.ies.ugc.statisticlogger.config.c.Local) {
                return true;
            }
            return false;
        }
    }

    public static final void a(Context context) {
        l.d(context, "");
        com.bytedance.ies.ugc.statisticlogger.config.b.f35336a.a(a.f66833a).d(new C1502b());
        t<com.bytedance.ies.ugc.statisticlogger.c> i2 = e.f35344a.e().i();
        l.b(i2, "");
        i2.d(c.f66835a);
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f66835a = new c();

        static {
            Covode.recordClassIndex(41155);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.ies.ugc.statisticlogger.c cVar = (com.bytedance.ies.ugc.statisticlogger.c) obj;
            l.b(cVar, "");
            l.d(cVar, "");
            int i2 = com.ss.android.ugc.aweme.k.b.f105225a[cVar.f35329a.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    com.ss.android.ugc.aweme.metrics.b.a.a("monitor", "launch", cVar.f35331c);
                    MultiAccountService.c().a();
                } else if (i2 == 3) {
                    com.ss.android.common.c.c.a(d.a(), "monitor", "terminate");
                    com.ss.android.ugc.aweme.metrics.b.a.a("monitor", "terminate", cVar.f35331c);
                    com.ss.android.ugc.aweme.k.a.f105223a = false;
                    CommonFeedLaunchServiceImpl.b().a();
                }
            } else if (!com.ss.android.ugc.aweme.k.a.f105223a) {
                com.ss.android.ugc.aweme.k.a.f105223a = true;
                com.ss.android.common.c.c.a(d.a(), "monitor", "launch");
            }
        }
    }
}
