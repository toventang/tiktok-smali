package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.e;
import com.bytedance.crash.m;
import com.bytedance.crash.n;
import com.bytedance.crash.runtime.b.a;
import com.bytedance.crash.runtime.b.c;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.v;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<a> f27881a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f27882b;

    public interface a {
        static {
            Covode.recordClassIndex(16322);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(16321);
    }

    public static boolean b() {
        if (!n.f27737a || a() == null) {
            return false;
        }
        return true;
    }

    public static int d() {
        return a(1, "custom_event_settings", "npth_simple_setting", "gwp_asan_hook_type");
    }

    public static int f() {
        return a(0, "custom_event_settings", "npth_simple_setting", "gwp_asan_alloc_size");
    }

    public static int h() {
        return a(0, "custom_event_settings", "npth_simple_setting", "gwp_asan_debug");
    }

    public static boolean c() {
        if (a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1) {
            return true;
        }
        return false;
    }

    public static int e() {
        return a(128, "custom_event_settings", "npth_simple_setting", "gwp_asan_max_simultaneous_alloc");
    }

    public static int g() {
        return a(2500, "custom_event_settings", "npth_simple_setting", "gwp_asan_sample_rate");
    }

    public static boolean i() {
        if (a("custom_event_settings", "npth_simple_setting", "enable_native_heap_track") == 1) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (a("custom_event_settings", "npth_simple_setting", "disable_kill_history") == 1) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        if (a("custom_event_settings", "npth_simple_setting", "enable_kill_history_err") == 1) {
            return true;
        }
        return false;
    }

    public static JSONObject a() {
        return a.b(d.a(m.a()));
    }

    private static void l() {
        String b2 = com.bytedance.crash.util.n.b(a(), "custom_event_settings", "npth_simple_setting", "crash_upload_domain");
        JSONArray a2 = com.bytedance.crash.util.n.a(a(), "custom_event_settings", "npth_simple_setting", "crash_upload_domain_list");
        if (!TextUtils.isEmpty(b2) && a2 != null && a2.length() != 0) {
            if (!b2.equals(a.f27841a)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= a2.length()) {
                        v.a("setDomainName: check valid fail");
                        break;
                    } else if (b2.equals(a2.optString(0))) {
                        v.a("setDomainName:".concat(String.valueOf(b2)));
                        a.f27841a = b2;
                        break;
                    } else {
                        i2++;
                    }
                }
            } else {
                v.a("setDomainName: same domain");
            }
        } else {
            v.a("setDomainName: invalid param");
        }
        Iterator<a> it = f27881a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!f27882b) {
                next.a();
            }
            next.b();
        }
        f27882b = true;
    }

    public static int a(int i2) {
        return a(i2, "custom_event_settings", "npth_simple_setting", "gwp_asan_init_wait_seconds");
    }

    public static int a(String... strArr) {
        return com.bytedance.crash.util.n.a(a(), -1, strArr);
    }

    public static void a(a aVar) {
        f27881a.add(aVar);
        if (f27882b) {
            aVar.a();
            aVar.b();
        }
    }

    public static int a(int i2, String... strArr) {
        return com.bytedance.crash.util.n.a(a(), i2, strArr);
    }

    public static boolean b(Object obj, String str) {
        a a2 = a.a(obj);
        if (!(a2 == null || a2.f27884b == null)) {
            if (a2.f27886d == null) {
                a2.f27886d = com.bytedance.crash.util.n.c(a2.f27884b, "custom_event_settings", "allow_service_name", "test");
                if (a2.f27886d == null) {
                    a2.f27886d = new JSONObject();
                }
            }
            if (a2.f27886d.optInt(str) == 1) {
                return true;
            }
        }
        return false;
    }

    private static JSONObject a(JSONArray jSONArray, String str) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2).optJSONObject(str);
                if (optJSONObject != null) {
                    return optJSONObject;
                }
            }
        }
        return null;
    }

    public static void a(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            v.a("apmconfig", "fromnet " + z + " : " + jSONArray);
            String a2 = d.a(m.a());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    String next = optJSONObject.keys().next();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                    v.a("update config " + next + " : " + optJSONObject2);
                    a.a(next, optJSONObject2);
                    if (TextUtils.equals(a2, next)) {
                        l();
                    }
                    if (com.bytedance.crash.j.m.f27711b == null) {
                        com.bytedance.crash.j.m.f27711b = new HashMap();
                    }
                    if (z || !com.bytedance.crash.j.m.f27711b.containsKey(next)) {
                        com.bytedance.crash.j.m.f27711b.put(next, String.valueOf(System.currentTimeMillis()));
                        v.a("udpate config time for aid ".concat(String.valueOf(next)));
                    }
                } catch (Throwable unused) {
                }
            }
            c.a(a(jSONArray, String.valueOf(d.a(m.a()))));
            if (z || com.bytedance.crash.j.m.f27711b == null || com.bytedance.crash.j.m.f27711b.isEmpty() || com.bytedance.crash.j.m.f27711b.size() < com.bytedance.crash.entity.c.f27559a.size()) {
                try {
                    j.a(new File(r.j(m.f27724a), "npth/configCrash/configFile"), a.b());
                    j.a(com.bytedance.crash.j.m.b(), com.bytedance.crash.j.m.f27711b);
                } catch (Throwable unused2) {
                }
                v.a("success saveApmConfig");
            }
        }
    }

    public static boolean a(Object obj, String str) {
        a a2 = a.a(obj);
        if (a2 == null) {
            return false;
        }
        if (e.f27562a) {
            return true;
        }
        if (a2.f27884b != null) {
            if (TextUtils.equals(str, "block_monitor")) {
                str = "caton_monitor";
            }
            if (TextUtils.equals(str, "core_exception_monitor")) {
                return a2.f27887e;
            }
            if (a2.f27885c == null) {
                a2.f27885c = com.bytedance.crash.util.n.c(a2.f27884b, "custom_event_settings", "allow_log_type", "test");
                if (a2.f27885c == null) {
                    a2.f27885c = new JSONObject();
                }
            }
            if (a2.f27885c.optInt(str) == 1) {
                return true;
            }
        }
        return false;
    }
}
