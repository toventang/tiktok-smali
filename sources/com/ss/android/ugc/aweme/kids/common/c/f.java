package com.ss.android.ugc.aweme.kids.common.c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.c.a;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f105896a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static ExecutorService f105897b;

    private f() {
    }

    static {
        Covode.recordClassIndex(67766);
    }

    public static ExecutorService a() {
        MethodCollector.i(4976);
        if (f105897b == null) {
            synchronized (f.class) {
                try {
                    if (f105897b == null) {
                        l.a a2 = l.a(o.SERIAL);
                        a2.f79173b = "EventUpload";
                        f105897b = g.a(a2.a());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4976);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f105897b;
        MethodCollector.o(4976);
        return executorService;
    }

    public static void a(String str, Bundle bundle) {
        h.f.b.l.d(str, "");
        try {
            a.a(str, bundle);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        h.f.b.l.d(str, "");
        try {
            a.a(str, jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
