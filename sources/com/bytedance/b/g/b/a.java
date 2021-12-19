package com.bytedance.b.g.b;

import com.bytedance.b.i.a.c;
import com.bytedance.b.k.e;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends com.bytedance.b.i.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    public long f26272a;

    /* renamed from: b  reason: collision with root package name */
    public long f26273b;

    /* renamed from: c  reason: collision with root package name */
    public long f26274c;

    /* renamed from: d  reason: collision with root package name */
    public long f26275d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26276e;

    /* renamed from: f  reason: collision with root package name */
    public long f26277f;

    /* renamed from: g  reason: collision with root package name */
    public long f26278g;

    /* renamed from: h  reason: collision with root package name */
    public long f26279h;

    /* renamed from: i  reason: collision with root package name */
    public long f26280i;

    /* renamed from: j  reason: collision with root package name */
    public long f26281j;

    /* renamed from: k  reason: collision with root package name */
    public long f26282k;

    /* renamed from: l  reason: collision with root package name */
    public double f26283l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f26284m;
    public Map<Object, Object> n;
    private boolean u;

    static {
        Covode.recordClassIndex(15253);
    }

    @Override // com.bytedance.b.h.b
    public final boolean b() {
        return true;
    }

    @Override // com.bytedance.b.i.a.a.a
    public final String d() {
        return "memory";
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject f() {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", c.a().b());
            jSONObject.put("process_name", com.bytedance.b.e.a.a.d());
            if (!this.f26276e) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("is_front", z);
            jSONObject.put("is_main_process", com.bytedance.b.e.a.a.c());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject g() {
        JSONObject c2 = c.a().c();
        if (this.u) {
            try {
                e.a(c2, c.a().d());
            } catch (Exception unused) {
            }
        }
        com.bytedance.b.j.a.a aVar = (com.bytedance.b.j.a.a) com.bytedance.b.j.c.a(com.bytedance.b.j.a.a.class);
        if (aVar != null) {
            try {
                e.a(c2, aVar.a());
            } catch (Exception unused2) {
            }
        }
        return c2;
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gc_count", this.f26272a);
            jSONObject.put("gc_time", this.f26273b);
            jSONObject.put("block_gc_count", this.f26274c);
            jSONObject.put("block_gc_time", this.f26275d);
            if (this.f26276e) {
                jSONObject.put("dalvik_pss_background", this.f26280i);
                jSONObject.put("native_pss_background", this.f26277f);
                jSONObject.put("total_pss_background", this.f26278g);
                jSONObject.put("java_heap_background", this.f26279h);
                jSONObject.put("java_heap_background_used_rate", this.f26283l);
                jSONObject.put("vm_size_background", this.f26282k);
                jSONObject.put("graphics_background", this.f26281j);
            } else {
                jSONObject.put("dalvik_pss_foreground", this.f26280i);
                jSONObject.put("native_pss_foreground", this.f26277f);
                jSONObject.put("total_pss_foreground", this.f26278g);
                jSONObject.put("java_heap_foreground", this.f26279h);
                jSONObject.put("java_heap_foreground_used_rate", this.f26283l);
                jSONObject.put("vm_size_foreground", this.f26282k);
                jSONObject.put("graphics_foreground", this.f26281j);
            }
            if (this.f26284m) {
                jSONObject.put("reach_top_java", 1);
            }
            a(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final String toString() {
        return "MemoryPerfMonitorable{gcCount=" + this.f26272a + ", gcTime=" + this.f26273b + ", blockingGcCount=" + this.f26274c + ", blockingGcTime=" + this.f26275d + ", background=" + this.f26276e + ", nativePss=" + this.f26277f + ", totalPss=" + this.f26278g + ", javaUsedMemory=" + this.f26279h + ", dalvikUsedSize=" + this.f26280i + ", graphics=" + this.f26281j + ", vmSize=" + this.f26282k + ", javaUsedMemoryRate=" + this.f26283l + ", isMemoryReachTop=" + this.f26284m + '}';
    }

    private void a(JSONObject jSONObject) {
        try {
            Map<Object, Object> map = this.n;
            if (map != null) {
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), Long.parseLong((String) entry.getValue()));
                }
            }
        } catch (Exception unused) {
        }
    }

    public a(long j2, long j3, long j4, long j5, boolean z, long j6, long j7, long j8, long j9, long j10, long j11, double d2, boolean z2, boolean z3) {
        this.f26272a = j2;
        this.f26273b = j3;
        this.f26274c = j4;
        this.f26275d = j5;
        this.f26276e = z;
        this.f26277f = j6;
        this.f26278g = j7;
        this.f26279h = j8;
        this.f26280i = j9;
        this.f26281j = j10;
        this.f26282k = j11;
        this.f26283l = d2;
        this.f26284m = z2;
        this.u = z3;
    }
}
