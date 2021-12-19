package com.ss.android.common.applog;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;
import org.json.JSONObject;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f59192b;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<a> f59193a = new LinkedList<>();

    static {
        Covode.recordClassIndex(36600);
    }

    static b a() {
        MethodCollector.i(6673);
        if (f59192b == null) {
            synchronized (b.class) {
                try {
                    if (f59192b == null) {
                        f59192b = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6673);
                    throw th;
                }
            }
        }
        b bVar = f59192b;
        MethodCollector.o(6673);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        String f59195a;

        /* renamed from: b  reason: collision with root package name */
        String f59196b;

        /* renamed from: c  reason: collision with root package name */
        String f59197c;

        /* renamed from: d  reason: collision with root package name */
        long f59198d;

        /* renamed from: e  reason: collision with root package name */
        long f59199e;

        /* renamed from: f  reason: collision with root package name */
        boolean f59200f;

        /* renamed from: g  reason: collision with root package name */
        JSONObject f59201g;

        static {
            Covode.recordClassIndex(36602);
        }

        a(String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
            this.f59195a = str;
            this.f59196b = str2;
            this.f59197c = str3;
            this.f59198d = j2;
            this.f59199e = j3;
            this.f59200f = z;
            this.f59201g = jSONObject;
        }
    }
}
