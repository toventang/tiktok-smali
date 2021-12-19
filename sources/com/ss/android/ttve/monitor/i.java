package com.ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Map<Integer, a> f61223a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<Integer, a> f61224b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public int f61225c = -1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f61226a;

        /* renamed from: b  reason: collision with root package name */
        public int f61227b;

        /* renamed from: c  reason: collision with root package name */
        public int f61228c;

        static {
            Covode.recordClassIndex(37691);
        }
    }

    static {
        Covode.recordClassIndex(37690);
    }

    public final synchronized void a() {
        MethodCollector.i(2631);
        this.f61223a.clear();
        this.f61224b.clear();
        this.f61225c = -1;
        MethodCollector.o(2631);
    }

    public final synchronized boolean b() {
        boolean isEmpty;
        MethodCollector.i(2632);
        isEmpty = this.f61223a.isEmpty();
        MethodCollector.o(2632);
        return isEmpty;
    }

    public final synchronized boolean c() {
        boolean isEmpty;
        MethodCollector.i(2633);
        isEmpty = this.f61224b.isEmpty();
        MethodCollector.o(2633);
        return isEmpty;
    }

    public final synchronized String a(int i2) {
        Iterator<Map.Entry<Integer, a>> it;
        MethodCollector.i(2630);
        JSONArray jSONArray = new JSONArray();
        if (i2 == 0) {
            it = this.f61223a.entrySet().iterator();
        } else if (i2 == 1) {
            it = this.f61224b.entrySet().iterator();
        } else {
            it = null;
        }
        if (it == null) {
            MethodCollector.o(2630);
            return null;
        }
        while (it.hasNext()) {
            a value = it.next().getValue();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", value.f61226a);
                jSONObject.put("start", value.f61227b);
                jSONObject.put("duration", value.f61228c);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        String jSONArray2 = jSONArray.toString();
        MethodCollector.o(2630);
        return jSONArray2;
    }

    public final synchronized void a(int i2, int i3) {
        MethodCollector.i(2636);
        if (i2 != 0) {
            if (i2 == 1) {
                this.f61224b.remove(Integer.valueOf(i3));
            }
            MethodCollector.o(2636);
            return;
        }
        this.f61223a.remove(Integer.valueOf(i3));
        MethodCollector.o(2636);
    }

    public final synchronized void a(int i2, int i3, a aVar) {
        MethodCollector.i(2634);
        if (i2 != 0) {
            if (i2 == 1) {
                this.f61224b.put(Integer.valueOf(i3), aVar);
            }
            MethodCollector.o(2634);
            return;
        }
        this.f61223a.put(Integer.valueOf(i3), aVar);
        MethodCollector.o(2634);
    }
}
