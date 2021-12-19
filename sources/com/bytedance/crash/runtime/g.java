package com.bytedance.crash.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.entity.e;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.b;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.n;
import com.bytedance.crash.util.r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g {

    /* renamed from: h  reason: collision with root package name */
    private static g f27908h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f27909i;

    /* renamed from: j  reason: collision with root package name */
    private static a f27910j = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f27911a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, Long> f27912b;

    /* renamed from: c  reason: collision with root package name */
    private int f27913c = 50;

    /* renamed from: d  reason: collision with root package name */
    private int f27914d = 100;

    /* renamed from: e  reason: collision with root package name */
    private int f27915e = 100;

    /* renamed from: f  reason: collision with root package name */
    private int f27916f = 2;

    /* renamed from: g  reason: collision with root package name */
    private int f27917g = 5;

    public static class a {
        static {
            Covode.recordClassIndex(16336);
        }
    }

    static {
        Covode.recordClassIndex(16334);
    }

    public static g a() {
        if (f27908h == null) {
            f27908h = new g(m.f27724a);
        }
        return f27908h;
    }

    public final boolean d() {
        if (e.f27562a || a(a("exception", false, (long) this.f27915e))) {
            return true;
        }
        return false;
    }

    private HashMap<String, Long> e() {
        MethodCollector.i(9739);
        File i2 = r.i(this.f27911a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray a2 = j.a(i2.getAbsolutePath());
            if (n.a(a2)) {
                MethodCollector.o(9739);
                return hashMap;
            }
            Long decode = Long.decode(a2.optString(0, null));
            if (System.currentTimeMillis() - decode.longValue() > 86400000) {
                File file = new File(r.j(this.f27911a), "issueCrashTimes");
                i2.renameTo(new File(file, String.valueOf(System.currentTimeMillis())));
                String[] list = file.list();
                if (list != null && list.length > 5) {
                    Arrays.sort(list);
                    c(new File(file, list[0]));
                }
                MethodCollector.o(9739);
                return hashMap;
            }
            hashMap.put("time", decode);
            for (int i3 = 1; i3 < a2.length(); i3++) {
                String[] split = a2.optString(i3, "").split(" ");
                if (split.length == 2) {
                    hashMap.put(split[0], Long.decode(split[1]));
                }
            }
            MethodCollector.o(9739);
            return hashMap;
        } catch (IOException unused) {
        } catch (Throwable unused2) {
            j.a(i2);
        }
    }

    public final void b() {
        this.f27913c = b.a(this.f27913c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f27914d = b.a(this.f27914d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
        this.f27915e = b.a(this.f27915e, "custom_event_settings", "npth_simple_setting", "crash_limit_exception");
        this.f27917g = b.a(this.f27917g, "custom_event_settings", "npth_simple_setting", "crash_limit_exception_md5");
        this.f27916f = b.a(this.f27916f, "custom_event_settings", "npth_simple_setting", "crash_limit_exception_stack");
    }

    public final void c() {
        HashMap<String, Long> hashMap = this.f27912b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            d.a("NPTH_CATCH", new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder append = new StringBuilder().append(remove).append('\n');
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            append.append(entry.getKey()).append(' ').append(entry.getValue()).append('\n');
        }
        try {
            j.a(r.i(this.f27911a), append.toString(), false);
        } catch (IOException unused) {
        }
        hashMap.put("time", remove);
    }

    public static boolean a(File file) {
        if (file.getName().contains("deleted") || new File(file, "deleted").exists()) {
            return true;
        }
        return false;
    }

    private g(Context context) {
        this.f27911a = context;
        this.f27912b = e();
        b();
        b.a(new b.a() {
            /* class com.bytedance.crash.runtime.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16335);
            }

            @Override // com.bytedance.crash.runtime.b.a
            public final void a() {
                g.this.b();
            }

            @Override // com.bytedance.crash.runtime.b.a
            public final void b() {
                g.this.b();
            }
        });
    }

    private static boolean a(boolean z) {
        if (!z && !f27909i) {
            f27909i = true;
            m.a("crash_limit_exceed", n.a(new JSONObject(), "crash_type", "exception"), null);
        }
        return z;
    }

    public static void b(File file) {
        MethodCollector.i(10234);
        try {
            if (!file.getName().contains("deleted")) {
                file.renameTo(new File(file.getParent(), file.getName() + "deleted"));
            }
            if (!new File(file, "deleted").exists()) {
                new File(file, "deleted").createNewFile();
            }
            MethodCollector.o(10234);
        } catch (Throwable unused) {
            MethodCollector.o(10234);
        }
    }

    private static boolean c(File file) {
        MethodCollector.i(10068);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(10068);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10068);
        return delete;
    }

    public final boolean a(String str) {
        if (!a(str, true, (long) this.f27913c) || !a("all", true, (long) this.f27913c)) {
            return false;
        }
        return true;
    }

    public final boolean a(String str, String str2) {
        if (com.bytedance.crash.entity.e.f27562a) {
            return true;
        }
        if (!a(a(str, false, (long) this.f27916f)) || (str2 != null && !a(a(str2, false, (long) this.f27917g)))) {
            return false;
        }
        return true;
    }

    public final boolean b(String str, String str2) {
        if (!com.bytedance.crash.entity.e.f27562a && (!a(a(str, false, (long) this.f27916f)) || ((str2 != null && !a(a(str2, false, (long) this.f27917g))) || !a(a("exception", false, (long) this.f27915e))))) {
            return false;
        }
        a(a(str, true, (long) this.f27916f));
        if (str2 != null) {
            a(a(str2, true, (long) this.f27917g));
        }
        a(a("exception", true, (long) this.f27915e));
        return true;
    }

    private synchronized boolean a(String str, boolean z, long j2) {
        long j3;
        MethodCollector.i(9897);
        if (str == null) {
            str = "default";
        }
        HashMap<String, Long> hashMap = this.f27912b;
        if (z) {
            j3 = 1;
        } else {
            j3 = 0;
        }
        Long valueOf = Long.valueOf(j3);
        if (hashMap == null) {
            valueOf = -1L;
        } else {
            Long l2 = hashMap.get(str);
            if (l2 != null) {
                valueOf = Long.valueOf(l2.longValue() + valueOf.longValue());
            }
            hashMap.put(str, valueOf);
        }
        if (valueOf.longValue() < j2) {
            MethodCollector.o(9897);
            return true;
        }
        MethodCollector.o(9897);
        return false;
    }
}
