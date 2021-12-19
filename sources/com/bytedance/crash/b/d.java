package com.bytedance.crash.b;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class d {
    private int A = -1;
    private final long B = 100;

    /* renamed from: a  reason: collision with root package name */
    float f27455a;

    /* renamed from: b  reason: collision with root package name */
    float f27456b;

    /* renamed from: c  reason: collision with root package name */
    float f27457c;

    /* renamed from: d  reason: collision with root package name */
    float f27458d;

    /* renamed from: e  reason: collision with root package name */
    float f27459e;

    /* renamed from: f  reason: collision with root package name */
    float f27460f;

    /* renamed from: g  reason: collision with root package name */
    String f27461g;

    /* renamed from: h  reason: collision with root package name */
    String f27462h;

    /* renamed from: i  reason: collision with root package name */
    int f27463i = -1;

    /* renamed from: j  reason: collision with root package name */
    JSONArray f27464j;

    /* renamed from: k  reason: collision with root package name */
    JSONObject f27465k;

    /* renamed from: l  reason: collision with root package name */
    JSONObject f27466l;

    /* renamed from: m  reason: collision with root package name */
    JSONObject f27467m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private JSONObject w;
    private JSONArray x;
    private float y;
    private final int z = 1000;

    static {
        Covode.recordClassIndex(16147);
    }

    public final String b() {
        String str = this.f27462h;
        if (str != null) {
            return str;
        }
        return "";
    }

    d() {
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("kswapd", (double) this.n);
            jSONObject2.put("mmcqd", (double) this.o);
            jSONObject2.put("kwork", (double) this.f27455a);
            jSONObject2.put("system_server", (double) this.p);
            jSONObject2.put("lmkd", (double) this.q);
            jSONObject2.put("user", (double) this.r);
            jSONObject2.put("sys", (double) this.s);
            jSONObject2.put("iowait", (double) this.t);
            jSONObject2.put("minor", (double) this.u);
            jSONObject2.put("major", (double) this.v);
            jSONObject2.put("user2", (double) this.f27456b);
            jSONObject2.put("sys2", (double) this.f27457c);
            jSONObject2.put("iowait2", (double) this.f27458d);
            jSONObject2.put("minor2", (double) this.f27459e);
            jSONObject2.put("major2", (double) this.f27460f);
            jSONObject2.put("process_name", this.f27461g);
            jSONObject2.put("top_cpu_process_name", this.f27462h);
            jSONObject2.put("top_cpu_process_is_anrapp", this.f27463i);
            jSONObject2.put("load", this.f27464j);
            jSONObject2.put("before_cpu_list", this.f27465k);
            jSONObject2.put("after_cpu_list", this.f27466l);
            jSONObject2.put("cpu_thread_list", this.w);
            jSONObject2.put("dex2oat", this.x);
            jSONObject2.put("main_thread_cpu", (double) this.y);
            jSONObject.put("cpu", jSONObject2);
        } catch (Throwable unused) {
        }
        this.f27455a = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.f27455a = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.f27463i = -1;
        this.f27462h = null;
        this.f27464j = null;
        this.f27465k = null;
        this.f27466l = null;
        this.w = null;
        this.x = null;
        this.y = 0.0f;
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final void c(Float f2) {
        this.n = f2.floatValue();
    }

    /* access modifiers changed from: package-private */
    public final void d(Float f2) {
        this.p = f2.floatValue();
    }

    /* access modifiers changed from: package-private */
    public final void e(Float f2) {
        this.q = f2.floatValue();
    }

    /* access modifiers changed from: package-private */
    public final void b(Float f2) {
        this.o = f2.floatValue();
    }

    /* access modifiers changed from: package-private */
    public final void a(Float f2) {
        this.f27455a += f2.floatValue();
    }

    /* access modifiers changed from: package-private */
    public final void f(Float f2) {
        if (this.x == null) {
            this.x = new JSONArray();
        }
        this.x.put(f2);
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3, float f4, float f5, float f6) {
        this.r = f2;
        this.s = f3;
        this.t = f4;
        this.u = f5;
        this.v = f6;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2, int i3, int i4, long j2, long j3, long j4) {
        if (this.w == null) {
            this.w = new JSONObject();
        }
        if ("main".equals(str)) {
            this.y = (float) i3;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("cpu", i3);
            jSONObject.put("nice", i4);
            jSONObject.put("runTime", j2);
            jSONObject.put("waitTime", j3);
            jSONObject.put("switchCount", j4);
            this.w.put(String.valueOf(i2), jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
