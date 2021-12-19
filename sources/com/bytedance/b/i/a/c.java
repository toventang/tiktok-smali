package com.bytedance.b.i.a;

import android.os.Debug;
import android.text.TextUtils;
import com.bytedance.apm.q.c;
import com.bytedance.b.j.d.a;
import com.bytedance.b.j.e.b;
import com.bytedance.b.k.f;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements b {

    /* renamed from: g  reason: collision with root package name */
    private static volatile c f26295g;

    /* renamed from: a  reason: collision with root package name */
    private CopyOnWriteArraySet<String> f26296a = new CopyOnWriteArraySet<>();

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<String, String> f26297b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private long f26298c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26299d;

    /* renamed from: e  reason: collision with root package name */
    private long f26300e;

    /* renamed from: f  reason: collision with root package name */
    private long f26301f;

    static {
        Covode.recordClassIndex(15264);
    }

    private c() {
    }

    public static c a() {
        if (f26295g == null) {
            synchronized (c.class) {
                if (f26295g == null) {
                    f26295g = new c();
                }
            }
        }
        return f26295g;
    }

    public final String b() {
        String a2 = f.a(this.f26296a.toArray(), "#");
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        a aVar = (a) com.bytedance.b.j.c.a(a.class);
        if (aVar != null) {
            return aVar.b();
        }
        return "";
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f26297b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final JSONObject d() {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            this.f26298c = Debug.getNativeHeapAllocatedSize() / 1048576;
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long freeMemory = runtime.freeMemory();
            long j2 = runtime.totalMemory();
            this.f26300e = maxMemory / 1048576;
            long j3 = j2 - freeMemory;
            this.f26301f = j3 / 1048576;
            if (((float) j3) > ((float) maxMemory) * 0.95f) {
                z = true;
            } else {
                z = false;
            }
            this.f26299d = z;
            jSONObject.put("apm_native_heap_size", this.f26298c);
            jSONObject.put("apm_java_heap_leak", this.f26299d);
            jSONObject.put("apm_java_heap_used", this.f26301f);
            jSONObject.put("apm_java_heap_max", this.f26300e);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONObject a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f26297b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (z) {
                c.a.f25246a.a(jSONObject, false);
                c.a.f25246a.b(jSONObject, false);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
