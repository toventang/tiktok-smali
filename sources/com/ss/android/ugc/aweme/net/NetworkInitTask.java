package com.ss.android.ugc.aweme.net;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.experiment.ai;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import okhttp3.Interceptor;
import org.json.JSONException;
import org.json.JSONObject;

public final class NetworkInitTask implements w {
    static {
        Covode.recordClassIndex(72119);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f112209a = new b();

        static {
            Covode.recordClassIndex(72121);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return a();
        }

        private static String a() {
            try {
                String h2 = SettingServiceImpl.v().h();
                Locale locale = Locale.getDefault();
                l.b(locale, "");
                if (h2 != null) {
                    String lowerCase = h2.toLowerCase(locale);
                    l.b(lowerCase, "");
                    return lowerCase;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Exception unused) {
                return "en";
            }
        }
    }

    public static final class a implements com.ss.android.ugc.aweme.secapi.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f112208a;

        static {
            Covode.recordClassIndex(72120);
        }

        @Override // com.ss.android.ugc.aweme.secapi.b
        public final String a() {
            try {
                return com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.c();
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // com.ss.android.ugc.aweme.secapi.b
        public final String b() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            return g2.getCurUserId();
        }

        @Override // com.ss.android.ugc.aweme.secapi.b
        public final String c() {
            return (String) this.f112208a.invoke();
        }

        a(h.f.a.a aVar) {
            this.f112208a = aVar;
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.network.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NetworkInitTask f112210a;

        static {
            Covode.recordClassIndex(72122);
        }

        @Override // com.ss.android.ugc.aweme.network.c
        public final void a() {
            a.b.f109011a.a("feed_network_init_to_init_ttnet", false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(NetworkInitTask networkInitTask) {
            this.f112210a = networkInitTask;
        }

        @Override // com.ss.android.ugc.aweme.network.c
        public final void a(com.ss.android.ugc.aweme.network.a aVar) {
            l.d(aVar, "");
            a.b.f109011a.b("feed_network_init_to_init_ttnet", false);
            a.b.f109011a.a("feed_network_init_ttnet_duration", false);
            a.b.f109011a.b("feed_boot_to_init_ttnet", false);
        }

        @Override // com.ss.android.ugc.aweme.network.c
        public final void b(com.ss.android.ugc.aweme.network.a aVar) {
            l.d(aVar, "");
            a.b.f109011a.b("feed_network_init_ttnet_duration", false);
            a.b.f109011a.b("feed_boot_to_init_ttnet_end", false);
            a.b.f109011a.a("feed_init_ttnet_end_to_network", false);
            a.b.f109011a.a("feed_network_init_sec_duration", false);
            Context a2 = d.a();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            b bVar = b.f112209a;
            if (f.a(a2)) {
                String str = aVar.f112517e;
                if (str == null) {
                    str = "";
                }
                String str2 = aVar.f112518f;
                if (str2 == null) {
                    str2 = "";
                }
                SecApiImpl.a().initSec(a2, (String) bVar.invoke(), aVar.f112516d, str, str2, true, new a(bVar));
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sec_init_time", elapsedRealtime2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            o.b("sec_init_time", "", jSONObject);
            a.b.f109011a.b("feed_network_init_sec_duration", false);
            InterceptorHolder.e().d();
        }

        @Override // com.ss.android.ugc.aweme.network.c
        public final void c(com.ss.android.ugc.aweme.network.a aVar) {
            l.d(aVar, "");
            com.bytedance.ttnet.a.a a2 = com.bytedance.ttnet.a.a.a(d.a());
            String[] strArr = com.ss.android.ugc.aweme.net.b.a.f112235d;
            int i2 = com.ss.android.ugc.aweme.net.b.a.f112233b;
            if (i2 == 1180) {
                strArr = com.ss.android.ugc.aweme.net.b.a.f112236e;
            } else if (i2 == 1233 || i2 == 1340) {
                strArr = com.ss.android.ugc.aweme.net.b.a.f112235d;
            }
            a2.a(new ArrayList<>(Arrays.asList(strArr)));
            InterceptorProvider e2 = InterceptorHolder.e();
            l.b(e2, "");
            List<Interceptor> c2 = e2.c();
            if (!com.bytedance.common.utility.collection.b.a((Collection) c2)) {
                for (Interceptor interceptor : c2) {
                    l lVar = l.f112434a;
                    if (lVar.f112435b == null) {
                        lVar.a();
                    }
                    lVar.f112435b = lVar.f112435b.newBuilder().addNetworkInterceptor(interceptor).build();
                }
            }
            if (!com.bytedance.frameworks.baselib.network.http.g.f.b(d.a())) {
                e.f29335g = aVar.f112523k;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        ExecutorService a2;
        INetwork a3 = j.a();
        c cVar = new c(this);
        if (!com.ss.android.ugc.aweme.feed.cache.e.n() || !((Boolean) ai.f89536b.getValue()).booleanValue()) {
            a2 = g.a();
        } else {
            a2 = g.b();
        }
        l.b(a2, "");
        a3.a(cVar, a2);
    }
}
