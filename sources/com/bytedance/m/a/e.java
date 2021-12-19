package com.bytedance.m.a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.m.c;
import com.ss.android.ugc.aweme.bf.d;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f41325a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f41326b;

    static {
        Covode.recordClassIndex(25320);
    }

    private e() {
        SharedPreferences a2 = d.a(c.f41337b, "app_bundle_session_ids", 0);
        this.f41326b = a2;
        if (c.f41338c.b() != a2.getInt("app_version_code", -1)) {
            this.f41326b.edit().clear().apply();
        }
    }

    public static e a() {
        MethodCollector.i(8273);
        if (f41325a == null) {
            synchronized (e.class) {
                try {
                    if (f41325a == null) {
                        f41325a = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8273);
                    throw th;
                }
            }
        }
        e eVar = f41325a;
        MethodCollector.o(8273);
        return eVar;
    }

    public final int a(String str) {
        return this.f41326b.getInt(str, -1);
    }

    public final void a(String str, int i2) {
        this.f41326b.edit().putInt(str, i2).apply();
    }
}
