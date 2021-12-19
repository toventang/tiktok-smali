package com.ss.android.ugc.aweme.bf;

import android.content.Context;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.j.h;
import com.bytedance.keva.KevaMonitor;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.application.o;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import org.json.JSONObject;

public final class b extends KevaMonitor {
    static {
        Covode.recordClassIndex(42248);
    }

    private static void a(String str) {
        if (o.f66957b.get(str) == null) {
            Librarian.a(str, false, (Context) null);
        }
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void loadLibrary(String str) {
        a("c++_shared");
        a(str);
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void onLoadRepo(String str, int i2) {
        super.onLoadRepo(str, i2);
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void reportThrowable(int i2, String str, String str2, Object obj, Throwable th) {
        if (ApmDelegate.a.f25042a.a("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", a.f68642a);
                jSONObject.put("kv_perf_report_type", 0);
                jSONObject.put("kv_perf_value_type", String.valueOf(i2));
                jSONObject.put("kv_perf_name", str);
                jSONObject.put("kv_perf_key", str2);
                jSONObject.put("kv_perf_value", obj);
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                jSONObject.put("kv_perf_msg", stringWriter.getBuffer().toString());
            } catch (Throwable unused) {
            }
            com.bytedance.apm.b.a("aweme_keva_monitor_report", jSONObject);
        }
    }

    @Override // com.bytedance.keva.KevaMonitor
    public final void reportWarning(int i2, String str, String str2, Object obj, String str3) {
        if (ApmDelegate.a.f25042a.a("aweme_keva_monitor_report")) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("kv_global_id", a.f68642a);
                hashMap.put("kv_report_type", "1");
                hashMap.put("kv_type", String.valueOf(i2));
                hashMap.put("kv_name", str);
                if (str2 != null) {
                    hashMap.put("kv_key", str2);
                }
                if (obj != null) {
                    hashMap.put("kv_value", obj.toString());
                }
                hashMap.put("kv_msg", str3);
                Exception exc = new Exception("keva exception");
                if (d.a(exc)) {
                    h.a(exc, str, true, hashMap, "core_exception_monitor");
                }
            } catch (Throwable unused) {
            }
        }
    }
}
