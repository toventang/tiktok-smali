package com.ss.android.ugc.aweme.app.launch;

import android.content.Context;
import android.os.AsyncTask;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.lego.d;
import f.a.d.f;
import f.a.d.k;
import h.f.b.l;
import java.util.Map;

public final class c {
    static {
        Covode.recordClassIndex(41156);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.c$c  reason: collision with other inner class name */
    public static final class AsyncTaskC1503c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f66838a;

        static {
            Covode.recordClassIndex(41159);
        }

        AsyncTaskC1503c(Context context) {
            this.f66838a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            l.d(voidArr, "");
            Context context = this.f66838a;
            Map<String, String> b2 = com.bytedance.ies.ugc.statisticlogger.a.b();
            if (context == null) {
                return null;
            }
            Logger.debug();
            try {
                com.bytedance.ttnet.utils.b.a(context, 1, m.a(b2));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class a<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66836a = new a();

        static {
            Covode.recordClassIndex(41157);
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
        com.bytedance.ies.ugc.statisticlogger.config.b.f35336a.a(a.f66836a).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new b(context));
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f66837a;

        static {
            Covode.recordClassIndex(41158);
        }

        b(Context context) {
            this.f66837a = context;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.bytedance.common.utility.b.a$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Context context = this.f66837a;
            if (!d.e() && com.bytedance.ies.ugc.appcontext.f.j() == null) {
                System.currentTimeMillis();
            }
            if (!m.a(AppLog.getClientId()) && !m.a(com.bytedance.ies.ugc.statisticlogger.a.a())) {
                com.bytedance.common.utility.b.a.f26887a.a(new AsyncTaskC1503c(context), new Void[0]);
            }
        }
    }
}
