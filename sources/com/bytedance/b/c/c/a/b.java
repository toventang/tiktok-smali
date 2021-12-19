package com.bytedance.b.c.c.a;

import com.bytedance.apm.c;
import com.bytedance.apm.k.i;
import com.bytedance.b.c.c.i;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b implements com.bytedance.b.h.b {

    /* renamed from: a  reason: collision with root package name */
    private double f26056a;

    /* renamed from: b  reason: collision with root package name */
    private double f26057b;

    /* renamed from: c  reason: collision with root package name */
    private String f26058c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26059d;

    /* renamed from: e  reason: collision with root package name */
    private List<i> f26060e;

    static {
        Covode.recordClassIndex(15170);
    }

    @Override // com.bytedance.b.h.b
    public final String a() {
        return "cpu_exception_trace";
    }

    @Override // com.bytedance.b.h.b
    public final boolean b() {
        List<i> list = this.f26060e;
        if (list == null || list.isEmpty() || this.f26056a <= 0.0d || this.f26057b <= 0.0d) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.b.h.b
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_type", "cpu_exception_trace");
            jSONObject.put("log_type", "cpu_exception_trace");
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("crash_time", System.currentTimeMillis());
            jSONObject.put("is_main_process", c.b());
            jSONObject.put("process_name", c.a());
            if (this.f26059d) {
                jSONObject.put("data_type", "back");
            } else {
                jSONObject.put("data_type", "front");
            }
            jSONObject.put("scene", this.f26058c);
            jSONObject.put("report_scene", this.f26058c);
            if (c.f24695k > c.d() || c.f24695k == 0) {
                jSONObject.put("app_launch_start_time", c.d());
            } else {
                jSONObject.put("app_launch_start_time", c.f24695k);
            }
            jSONObject.put("process_speed_avg", this.f26056a);
            jSONObject.put("process_speed_max", this.f26057b);
            jSONObject.put("battery_temperature", (double) i.a.f25156a.f25150a);
            jSONObject.put("battery_recharge_state", i.a.f25156a.f25151b);
            JSONArray jSONArray = new JSONArray();
            for (com.bytedance.b.c.c.i iVar : this.f26060e) {
                if (iVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("nice", iVar.f26110h);
                    jSONObject2.put("weight", Double.valueOf(iVar.f26107e));
                    jSONObject2.put("cpu_usage", iVar.f26106d);
                    jSONObject2.put("thread_name", iVar.f26104b);
                    jSONObject2.put("thread_back_trace", iVar.f26108f);
                    jSONObject2.put("thread_id", iVar.f26103a);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("threads_info", jSONArray);
        } catch (Throwable th) {
            com.bytedance.b.k.b.b.a("APM-CPU", "cpu_exception_data_assemble", th);
        }
        return jSONObject;
    }

    public b(double d2, double d3, List<com.bytedance.b.c.c.i> list, String str, boolean z) {
        this.f26056a = d2;
        this.f26057b = d3;
        this.f26058c = str;
        this.f26059d = z;
        this.f26060e = new ArrayList(list);
    }
}
