package com.ss.android.agilelogger.c;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<a, com.ss.android.agilelogger.a.b> f59108a;

    public enum a {
        MSG,
        JSON,
        BUNDLE,
        INTENT,
        THROWABLE,
        BORDER,
        STACKTRACE,
        THREAD,
        STACKTRACE_STR;

        static {
            Covode.recordClassIndex(36552);
        }
    }

    static {
        Covode.recordClassIndex(36551);
        ConcurrentHashMap<a, com.ss.android.agilelogger.a.b> concurrentHashMap = new ConcurrentHashMap<>();
        f59108a = concurrentHashMap;
        concurrentHashMap.put(a.MSG, new com.ss.android.agilelogger.a.b.a());
        f59108a.put(a.JSON, new com.ss.android.agilelogger.a.b.a.a());
        f59108a.put(a.BUNDLE, new com.ss.android.agilelogger.a.b.b.a());
        f59108a.put(a.INTENT, new com.ss.android.agilelogger.a.b.b.b());
        f59108a.put(a.BORDER, new com.ss.android.agilelogger.a.a.b());
        f59108a.put(a.STACKTRACE, new com.ss.android.agilelogger.a.c.a());
        f59108a.put(a.THREAD, new com.ss.android.agilelogger.a.d.a());
        f59108a.put(a.THROWABLE, new com.ss.android.agilelogger.a.b.c.a());
    }

    public static String a(a aVar, Intent intent) {
        f59108a.get(aVar);
        return com.ss.android.agilelogger.a.b.b.b.a(intent);
    }

    public static String a(a aVar, Bundle bundle) {
        f59108a.get(aVar);
        return c.a(bundle);
    }

    public static String a(a aVar, String str) {
        com.ss.android.agilelogger.a.b bVar = f59108a.get(aVar);
        if (bVar == null) {
            return str;
        }
        if (aVar != a.BORDER) {
            return bVar.a(str);
        }
        return bVar.a(new String[]{str});
    }

    public static String a(a aVar, Thread thread) {
        return f59108a.get(aVar).a(thread);
    }

    public static String a(a aVar, Throwable th) {
        return f59108a.get(aVar).a(th);
    }

    public static String a(a aVar, StackTraceElement[] stackTraceElementArr) {
        return f59108a.get(aVar).a(stackTraceElementArr);
    }
}
