package com.bytedance.sdk.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.b.a.b;
import com.bytedance.sdk.b.a.c;
import com.bytedance.sdk.b.a.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile d f43481a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f43482b;

    /* renamed from: com.bytedance.sdk.b.a$a  reason: collision with other inner class name */
    public interface AbstractC1049a {
        static {
            Covode.recordClassIndex(26630);
        }
    }

    static {
        Covode.recordClassIndex(26628);
    }

    private a() {
    }

    public static c b() {
        j();
        return f43481a.f43486c;
    }

    public static Context c() {
        j();
        return f43481a.f43484a;
    }

    public static b f() {
        j();
        return f43481a.f43487d;
    }

    public static com.bytedance.sdk.b.a.a g() {
        j();
        return f43481a.f43488e;
    }

    public static String h() {
        j();
        return f43481a.f43490g;
    }

    public static com.bytedance.sdk.b.b.d i() {
        j();
        return f43481a.f43493j;
    }

    public static b d() {
        j();
        a();
        return f43482b;
    }

    public static boolean e() {
        j();
        if (f43481a.f43485b) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (f43481a == null) {
            throw new IllegalStateException("MobileDataSDK:sdk init fail, init config is null");
        } else if (f43481a.f43484a != null) {
            return true;
        } else {
            throw new IllegalStateException("MobileDataSDK:context == null");
        }
    }

    public static void a() {
        MethodCollector.i(3621);
        if (f43482b == null) {
            synchronized (a.class) {
                try {
                    if (f43482b == null) {
                        f43482b = new c();
                    }
                } finally {
                    MethodCollector.o(3621);
                }
            }
            return;
        }
        MethodCollector.o(3621);
    }
}
