package com.ss.android.ugc.aweme.benchmark;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.benchmark.IBTCHConfiguration;
import com.benchmark.a;
import com.benchmark.a.c;
import com.benchmark.tools.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.property.bd;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.tools.AVApi;
import h.f.b.l;
import java.io.File;
import org.json.JSONObject;

public final class BTCHConfigurationImpl implements IBTCHConfiguration {
    static {
        Covode.recordClassIndex(42238);
    }

    public static IBTCHConfiguration b() {
        MethodCollector.i(9288);
        Object a2 = com.ss.android.ugc.b.a(IBTCHConfiguration.class, false);
        if (a2 != null) {
            IBTCHConfiguration iBTCHConfiguration = (IBTCHConfiguration) a2;
            MethodCollector.o(9288);
            return iBTCHConfiguration;
        }
        if (com.ss.android.ugc.b.T == null) {
            synchronized (IBTCHConfiguration.class) {
                try {
                    if (com.ss.android.ugc.b.T == null) {
                        com.ss.android.ugc.b.T = new BTCHConfigurationImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9288);
                    throw th;
                }
            }
        }
        BTCHConfigurationImpl bTCHConfigurationImpl = (BTCHConfigurationImpl) com.ss.android.ugc.b.T;
        MethodCollector.o(9288);
        return bTCHConfigurationImpl;
    }

    @Override // com.benchmark.IBTCHConfiguration
    public final com.benchmark.a a() {
        String serverDeviceId;
        File file;
        com.benchmark.a.a.a(a.f68638a);
        c.a(b.f68639a);
        a.C0079a aVar = new a.C0079a();
        aVar.f6012a = d.a();
        AVApi b2 = AVApiImpl.b();
        l.b(b2, "");
        aVar.f6014c = b2.a();
        aVar.f6015d = Build.MODEL;
        aVar.f6017f = d.n;
        aVar.f6018g = d.b();
        aVar.f6019h = d.i();
        aVar.f6020i = d.h();
        aVar.f6022k = String.valueOf(com.bytedance.b.e.a.a.p());
        if (AppLog.getServerDeviceId() == null) {
            serverDeviceId = "0";
        } else {
            serverDeviceId = AppLog.getServerDeviceId();
        }
        aVar.f6021j = serverDeviceId;
        aVar.f6024m = com.bytedance.ies.abmock.b.a().a(true, "enable_benchmark_open_runtime_decision", true);
        String str = null;
        if (bd.a()) {
            Context a2 = d.a();
            if (!TextUtils.isEmpty(null)) {
                file = a2.getExternalFilesDir(null);
            } else {
                if (com.ss.android.ugc.aweme.lancet.d.f107196d == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                    com.ss.android.ugc.aweme.lancet.d.f107196d = a2.getExternalFilesDir(null);
                }
                file = com.ss.android.ugc.aweme.lancet.d.f107196d;
            }
            if (file != null) {
                str = file.getPath();
            }
        } else {
            str = dj.f126461d;
        }
        String absolutePath = new File(str, "bytebench").getAbsolutePath();
        l.b(absolutePath, "");
        aVar.f6013b = absolutePath;
        com.benchmark.a aVar2 = new com.benchmark.a(aVar);
        l.b(aVar2, "");
        return aVar2;
    }

    static final class b implements e.c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f68639a = new b();

        static {
            Covode.recordClassIndex(42240);
        }

        b() {
        }

        @Override // com.benchmark.tools.e.c
        public final void a(Throwable th) {
            l.d(th, "");
            com.bytedance.services.apm.api.a.a(th, "benchmark test");
        }
    }

    static final class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f68638a = new a();

        static {
            Covode.recordClassIndex(42239);
        }

        a() {
        }

        @Override // com.benchmark.tools.e.a
        public final void a(String str, JSONObject jSONObject) {
            l.d(str, "");
            l.d(jSONObject, "");
            r.a(str, jSONObject);
        }
    }
}
