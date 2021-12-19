package com.bytedance.apm.battery.d;

import com.bytedance.apm.battery.b.d;
import com.bytedance.apm.battery.c.b;
import com.bytedance.apm.battery.d.a.c;
import com.bytedance.apm.e.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends a<c> implements d {
    static {
        Covode.recordClassIndex(14450);
    }

    @Override // com.bytedance.apm.battery.b.d
    public final String a() {
        return "android.os.IPowerManager";
    }

    public f() {
        super("power");
    }

    @Override // com.bytedance.apm.battery.d.g
    public final void a(b bVar, a aVar) {
        if (!this.f24528a.equals(aVar.f24907d)) {
            return;
        }
        if (aVar.f24905b) {
            bVar.f24490e += aVar.f24910g;
            return;
        }
        bVar.f24495j += aVar.f24910g;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.apm.battery.d.a.b, long] */
    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.d.a
    public final /* synthetic */ void a(c cVar, long j2) {
        c cVar2 = cVar;
        if (j2 >= com.bytedance.apm.battery.a.a.f24436a) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "battery_trace");
                jSONObject.put("issue_type", 16).put("single_hold_time", j2).put("wake_lock_info", cVar2.toString());
                com.bytedance.apm.k.b.a(jSONObject, "battery_trace");
                com.bytedance.apm.c.a.a.b().a(new com.bytedance.apm.c.b.d("battery_trace", jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.d.a
    public final void a(double d2, double d3) {
        int i2;
        if (d2 >= ((double) com.bytedance.apm.battery.a.a.f24438c)) {
            i2 = 17;
        } else {
            i2 = 0;
        }
        if (d3 >= ((double) com.bytedance.apm.battery.a.a.f24437b)) {
            i2 |= 18;
        }
        if (i2 != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i2).put("total_hold_time", d2).put("total_acquire_count", d3);
                if (this.f24531d != null && this.f24531d.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (c cVar : this.f24531d.values()) {
                        jSONArray.put(cVar.a());
                    }
                    jSONObject.put("detail", jSONArray);
                }
                com.bytedance.apm.k.b.a(jSONObject, "battery_trace");
                com.bytedance.apm.c.a.a.b().a(new com.bytedance.apm.c.b.d("battery_trace", jSONObject));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @Override // com.bytedance.apm.battery.b.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.reflect.Method r6, java.lang.Object[] r7) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.d.f.a(java.lang.reflect.Method, java.lang.Object[]):void");
    }
}
