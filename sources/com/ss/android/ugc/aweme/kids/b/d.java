package com.ss.android.ugc.aweme.kids.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import java.io.File;

public class d {

    /* renamed from: d  reason: collision with root package name */
    public static int f105422d = 30000;

    /* renamed from: e  reason: collision with root package name */
    public static long f105423e = ((long) com.ss.android.ugc.aweme.kids.c.a.f105430a);

    /* renamed from: f  reason: collision with root package name */
    private static d f105424f;

    /* renamed from: a  reason: collision with root package name */
    public a f105425a;

    /* renamed from: b  reason: collision with root package name */
    public a f105426b;

    /* renamed from: c  reason: collision with root package name */
    public Context f105427c;

    public interface a {
        static {
            Covode.recordClassIndex(67567);
        }

        String a();
    }

    static {
        Covode.recordClassIndex(67566);
    }

    public final String b() {
        String a2 = this.f105425a.a();
        if (a2.endsWith("/")) {
            return a2;
        }
        return a2 + File.separator;
    }

    public static d a() {
        MethodCollector.i(9070);
        if (f105424f == null) {
            synchronized (d.class) {
                try {
                    if (f105424f == null) {
                        f105424f = new d();
                        ICacheService cacheConfig = AVExternalServiceImpl.a().configService().cacheConfig();
                        f105424f.f105427c = com.bytedance.ies.ugc.appcontext.d.a();
                        f105424f.f105426b = new e(cacheConfig);
                        f105424f.f105425a = new f(cacheConfig);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9070);
                    throw th;
                }
            }
        }
        d dVar = f105424f;
        MethodCollector.o(9070);
        return dVar;
    }
}
