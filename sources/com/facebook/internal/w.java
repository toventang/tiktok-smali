package com.facebook.internal;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.m;
import com.facebook.u;
import java.util.HashMap;
import java.util.Map;

public final class w {

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, String> f48685b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f48686a = 3;

    /* renamed from: c  reason: collision with root package name */
    private final u f48687c;

    /* renamed from: d  reason: collision with root package name */
    private final String f48688d;

    /* renamed from: e  reason: collision with root package name */
    private StringBuilder f48689e;

    static {
        Covode.recordClassIndex(29356);
    }

    public final void a() {
        d(this.f48689e.toString());
        this.f48689e = new StringBuilder();
    }

    private void d(String str) {
        a(this.f48687c, this.f48688d, str);
    }

    public final void b(String str) {
        if (m.a(this.f48687c)) {
            this.f48689e.append(str);
        }
    }

    public static synchronized void a(String str) {
        synchronized (w.class) {
            MethodCollector.i(1143);
            if (!m.a(u.INCLUDE_ACCESS_TOKENS)) {
                a(str, "ACCESS_TOKEN_REMOVED");
            }
            MethodCollector.o(1143);
        }
    }

    private static synchronized String c(String str) {
        synchronized (w.class) {
            MethodCollector.i(83);
            for (Map.Entry<String, String> entry : f48685b.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
            MethodCollector.o(83);
        }
        return str;
    }

    public w(u uVar, String str) {
        ae.a(str, "tag");
        this.f48687c = uVar;
        this.f48688d = "FacebookSDK.".concat(String.valueOf(str));
        this.f48689e = new StringBuilder();
    }

    private static synchronized void a(String str, String str2) {
        synchronized (w.class) {
            MethodCollector.i(1137);
            f48685b.put(str, str2);
            MethodCollector.o(1137);
        }
    }

    private void a(String str, Object... objArr) {
        if (m.a(this.f48687c)) {
            this.f48689e.append(a.a(str, objArr));
        }
    }

    public final void a(String str, Object obj) {
        a("  %s:\t%s\n", str, obj);
    }

    public static void a(u uVar, String str, String str2) {
        if (m.a(uVar)) {
            c(str2);
            str.startsWith("FacebookSDK.");
            if (uVar == u.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    public static void a(u uVar, String str, String str2, Object... objArr) {
        if (m.a(uVar)) {
            a(uVar, str, a.a(str2, objArr));
        }
    }
}
