package com.bytedance.apm.f;

import com.bytedance.apm.f.e;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24954a;

    static {
        Covode.recordClassIndex(14576);
    }

    public static JSONObject a(e.a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (aVar.f24977a != -1) {
                jSONObject2.put("launch_perf_gc_count", aVar.f24977a);
            }
            if (aVar.f24978b != -1) {
                jSONObject2.put("launch_perf_gc_time", aVar.f24978b);
            }
            if (aVar.f24979c != -1) {
                jSONObject2.put("launch_perf_block_gc_count", aVar.f24979c);
            }
            if (aVar.f24980d != -1) {
                jSONObject2.put("launch_perf_block_gc_time", aVar.f24980d);
            }
            if (aVar.f24984h != -1.0d) {
                jSONObject2.put("launch_perf_iowait_time", aVar.f24984h);
            }
            if (aVar.f24985i != -1.0d) {
                jSONObject2.put("launch_perf_runnable_time", aVar.f24985i);
            }
            if (aVar.f24986j != -1.0d) {
                jSONObject2.put("launch_perf_sleep_time", aVar.f24986j);
            }
            if (aVar.f24989m != -1) {
                jSONObject2.put("launch_perf_minfor_fault", aVar.f24989m);
            }
            if (aVar.n != -1) {
                jSONObject2.put("launch_perf_major_fault", aVar.n);
            }
            if (aVar.f24981e != -1.0d) {
                jSONObject2.put("launch_perf_cpu_time", aVar.f24981e);
            }
            if (aVar.f24982f != -1) {
                jSONObject2.put("launch_perf_voluntary_switches", aVar.f24982f);
            }
            if (aVar.f24983g != -1) {
                jSONObject2.put("launch_perf_involuntary_switches", aVar.f24983g);
            }
            if (aVar.o != -1) {
                jSONObject2.put("launch_perf_all_thread_count", aVar.o);
            }
            if (aVar.f24987k != -1) {
                jSONObject2.put("launch_perf_lock_time", aVar.f24987k);
            }
            if (aVar.f24988l != -1) {
                jSONObject2.put("launch_perf_binder_time", aVar.f24988l);
            }
            jSONObject.put("list_data", jSONObject2);
            List<String> list = aVar.p;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str : list) {
                    jSONArray.put(str);
                }
                jSONObject.put("current_thread_list", jSONArray);
            }
            return jSONObject;
        } catch (Throwable th) {
            th.getLocalizedMessage();
            return null;
        }
    }
}
