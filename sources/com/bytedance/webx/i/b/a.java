package com.bytedance.webx.i.b;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.i.d.b;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f46052a;

    /* renamed from: c  reason: collision with root package name */
    private static a f46053c;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f46054b;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, C1145a> f46055d = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(28157);
    }

    private a() {
        SharedPreferences a2 = d.a(com.bytedance.webx.i.a.f46035a, "sec_config", 0);
        this.f46054b = a2;
        f46052a = a2.getLong("valid_time", 900000);
    }

    public static a a() {
        MethodCollector.i(11732);
        if (f46053c == null) {
            synchronized (a.class) {
                try {
                    if (f46053c == null) {
                        f46053c = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11732);
                    throw th;
                }
            }
        }
        a aVar = f46053c;
        MethodCollector.o(11732);
        return aVar;
    }

    /* renamed from: com.bytedance.webx.i.b.a$a  reason: collision with other inner class name */
    public static class C1145a {

        /* renamed from: a  reason: collision with root package name */
        public long f46056a = System.currentTimeMillis();

        /* renamed from: b  reason: collision with root package name */
        public b f46057b;

        static {
            Covode.recordClassIndex(28158);
        }

        C1145a(b bVar) {
            this.f46057b = bVar;
        }
    }

    private void c(String str) {
        this.f46055d.remove(str);
        this.f46055d.remove(str + "/");
    }

    private boolean d(String str) {
        C1145a aVar = this.f46055d.get(str);
        if (aVar == null) {
            return false;
        }
        if (System.currentTimeMillis() - aVar.f46056a <= f46052a) {
            return true;
        }
        com.bytedance.webx.i.e.a.b("UrlSecLinkCache");
        c(str);
        return false;
    }

    public final boolean a(String str) {
        boolean z;
        boolean d2 = d(str);
        if (str.length() > 0) {
            z = d(str.substring(0, str.length() - 1));
        } else {
            z = false;
        }
        boolean d3 = d(str + "/");
        if (d2 || z || d3) {
            return true;
        }
        return false;
    }

    public final b b(String str) {
        C1145a aVar;
        C1145a aVar2;
        if (!a(str)) {
            return null;
        }
        C1145a aVar3 = this.f46055d.get(str);
        if (aVar3 != null) {
            return aVar3.f46057b;
        }
        if (str.length() > 0 && (aVar2 = this.f46055d.get(str.substring(0, str.length() - 1))) != null) {
            return aVar2.f46057b;
        }
        if (str.length() <= 0 || (aVar = this.f46055d.get(str + "/")) == null) {
            return null;
        }
        return aVar.f46057b;
    }

    public final void a(String str, b bVar) {
        this.f46055d.put(str, new C1145a(bVar));
    }
}
