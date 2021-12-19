package com.bytedance.android.monitorV2.webview;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private Map<Object, List<Object>> f24219a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, List<JSONObject>> f24220b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Map<String, JSONObject>> f24221c = new HashMap();

    static {
        Covode.recordClassIndex(14251);
    }

    public final List<JSONObject> a(String str) {
        List<JSONObject> remove;
        MethodCollector.i(4529);
        synchronized (this) {
            try {
                remove = this.f24220b.remove(str);
            } finally {
                MethodCollector.o(4529);
            }
        }
        return remove;
    }

    public final Map<String, JSONObject> b(String str) {
        Map<String, JSONObject> remove;
        MethodCollector.i(4534);
        synchronized (this) {
            try {
                remove = this.f24221c.remove(str);
            } finally {
                MethodCollector.o(4534);
            }
        }
        return remove;
    }

    public final void a(String str, JSONObject jSONObject) {
        MethodCollector.i(4528);
        if (jSONObject == null) {
            MethodCollector.o(4528);
            return;
        }
        List<JSONObject> list = this.f24220b.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        synchronized (list) {
            try {
                list.add(jSONObject);
            } catch (Throwable th) {
                MethodCollector.o(4528);
                throw th;
            }
        }
        this.f24220b.put(str, list);
        MethodCollector.o(4528);
    }

    public final void a(String str, String str2, JSONObject jSONObject) {
        MethodCollector.i(4532);
        if (jSONObject == null) {
            MethodCollector.o(4532);
            return;
        }
        Map<String, JSONObject> map = this.f24221c.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        synchronized (map) {
            try {
                map.put(str2, jSONObject);
            } catch (Throwable th) {
                MethodCollector.o(4532);
                throw th;
            }
        }
        this.f24221c.put(str, map);
        MethodCollector.o(4532);
    }
}
