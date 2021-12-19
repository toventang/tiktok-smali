package com.bytedance.apm.trace;

import android.text.TextUtils;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.e.b;
import com.bytedance.apm.f.a;
import com.bytedance.apm.f.e;
import com.bytedance.apm.q.c;
import com.bytedance.apm.q.i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f25366a = true;

    /* renamed from: b  reason: collision with root package name */
    public long f25367b;

    /* renamed from: c  reason: collision with root package name */
    public long f25368c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentHashMap<String, b> f25369d = new ConcurrentHashMap<>(4);

    /* renamed from: e  reason: collision with root package name */
    private final String f25370e;

    /* renamed from: f  reason: collision with root package name */
    private final String f25371f;

    public interface a {
        static {
            Covode.recordClassIndex(14758);
        }

        void a(long j2);
    }

    static {
        Covode.recordClassIndex(14754);
    }

    public final boolean a() {
        return "start_trace".equals(this.f25370e);
    }

    public e(String str, String str2) {
        if ("start_trace".equals(str) || "page_load_trace".equals(str)) {
            this.f25370e = str;
            this.f25371f = str2;
            return;
        }
        throw new IllegalStateException("Please add TraceServiceName support on TraceState#reportAsync");
    }

    public final void a(int i2, String str, String str2, long j2, e.a aVar) {
        JSONObject a2;
        JSONArray jSONArray = new JSONArray();
        int i3 = 2;
        try {
            if (TextUtils.equals(str2, AutoLaunchTraceHelper.sLauncherActivityName)) {
                jSONArray = AutoLaunchTraceHelper.assemblySpan();
            }
            ConcurrentHashMap<String, b> concurrentHashMap = this.f25369d;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                for (Map.Entry<String, b> entry : this.f25369d.entrySet()) {
                    String key = entry.getKey();
                    b value = entry.getValue();
                    if (value.f24918b != 0) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = key.split("#");
                        if (split.length == i3) {
                            if ("page_load_trace".equals(this.f25370e)) {
                                jSONObject.put(StringSet.name, split[1]);
                            } else {
                                jSONObject.put("module_name", split[0]);
                                jSONObject.put("span_name", split[1]);
                            }
                        } else if (split.length == 1) {
                            jSONObject.put("span_name", split[0]);
                        }
                        jSONObject.put("start", value.f24917a);
                        jSONObject.put("end", value.f24918b);
                        jSONObject.put("thread", value.f24919c);
                        jSONArray.put(jSONObject);
                        i3 = 2;
                    }
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        ConcurrentHashMap<String, b> concurrentHashMap2 = this.f25369d;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(StringSet.name, this.f25371f);
            jSONObject2.put("page_type", this.f25371f);
            jSONObject2.put("start", this.f25367b);
            jSONObject2.put("end", j2);
            jSONObject2.put("spans", jSONArray);
            jSONObject2.put("collect_from", 2);
            jSONObject2.put("page_name", str2);
            if (i2 != -1) {
                jSONObject2.put("launch_mode", i2);
            }
            if (!str.isEmpty()) {
                jSONObject2.put("custom_launch_mode", str);
            }
        } catch (JSONException unused) {
        }
        if (a() && a.C0529a.f24928a.a().f24958d) {
            JSONObject jSONObject3 = new JSONObject();
            c.a.f25246a.a(jSONObject3, true);
            c.a.f25246a.b(jSONObject3, true);
            try {
                jSONObject2.put("device_info_data", jSONObject3);
            } catch (Throwable unused2) {
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("trace", jSONObject2);
            if (!(aVar == null || (a2 = com.bytedance.apm.f.b.a(aVar)) == null)) {
                jSONObject4.put("perf_data", a2);
            }
        } catch (JSONException unused3) {
        }
        f fVar = new f(this.f25370e, "", null, null, jSONObject4, (byte) 0);
        com.bytedance.b.i.a.b.a(fVar, false);
        if (com.bytedance.apm.c.e()) {
            i.a("AppStartStats", "reportAsync: ".concat(String.valueOf(jSONObject4)));
        }
        com.bytedance.apm.c.a.a.b().a(fVar);
    }
}
