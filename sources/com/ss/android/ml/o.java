package com.ss.android.ml;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public boolean f59888a = t.f59923a;

    /* renamed from: b  reason: collision with root package name */
    public String f59889b;

    /* renamed from: c  reason: collision with root package name */
    public String f59890c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f59891d;

    /* renamed from: e  reason: collision with root package name */
    public a f59892e = new a();

    /* renamed from: f  reason: collision with root package name */
    public a f59893f = new a();

    /* renamed from: g  reason: collision with root package name */
    public a f59894g = new a();

    /* renamed from: h  reason: collision with root package name */
    public boolean f59895h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f59896i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f59897j = false;

    /* renamed from: k  reason: collision with root package name */
    public a f59898k = new a();

    /* renamed from: l  reason: collision with root package name */
    public a f59899l = new a();

    /* renamed from: m  reason: collision with root package name */
    public a f59900m = new a();
    public a n = new a();
    public boolean o = false;
    public String p = null;
    public Float q = null;

    static {
        Covode.recordClassIndex(37007);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f59901a = -1;

        /* renamed from: b  reason: collision with root package name */
        public long f59902b = -1;

        static {
            Covode.recordClassIndex(37008);
        }

        public final void b() {
            this.f59902b = -1;
            this.f59901a = -1;
        }

        public final float a() {
            long j2 = this.f59901a;
            if (j2 < 0) {
                return -1.0f;
            }
            long j3 = this.f59902b;
            if (j3 < 0 || j3 < j2 || j3 - j2 > 1000000000) {
                return -1.0f;
            }
            return ((float) (j3 - j2)) * 1.0f;
        }
    }

    public final void a() {
        g();
        h();
    }

    public final void b() {
        if (this.f59888a) {
            this.f59898k.f59901a = System.currentTimeMillis();
        }
    }

    public final void c() {
        if (this.f59888a) {
            this.f59900m.f59901a = System.currentTimeMillis();
        }
    }

    public final void d() {
        if (this.f59888a) {
            this.f59900m.f59902b = System.currentTimeMillis();
        }
    }

    public final void e() {
        if (this.f59888a) {
            this.n.f59901a = System.currentTimeMillis();
        }
    }

    public final void f() {
        if (this.f59888a) {
            this.n.f59902b = System.currentTimeMillis();
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        b(jSONObject);
        return jSONObject.toString();
    }

    private void g() {
        this.f59892e.b();
        this.f59893f.b();
        this.f59894g.b();
        this.f59895h = false;
        this.f59896i = false;
        this.f59897j = false;
    }

    private void h() {
        this.f59898k.b();
        this.f59899l.b();
        this.f59900m.b();
        this.n.b();
        this.o = false;
        this.p = null;
        this.q = null;
    }

    public final void a(boolean z) {
        if (this.f59888a && !this.f59891d) {
            this.f59892e.f59902b = System.currentTimeMillis();
            this.f59895h = z;
            this.f59891d = true;
        }
    }

    public final void b(boolean z) {
        if (this.f59888a && !this.f59891d) {
            this.f59894g.f59902b = System.currentTimeMillis();
            this.f59897j = z;
        }
    }

    public o(String str) {
        this.f59889b = str;
    }

    private JSONObject a(JSONObject jSONObject) {
        int i2;
        int i3;
        try {
            jSONObject.put("scene", this.f59889b);
            jSONObject.put("model_name", this.f59890c);
            jSONObject.put("sdk_duration", (double) this.f59892e.a());
            jSONObject.put("download_cost", (double) this.f59893f.a());
            jSONObject.put("model_cost", (double) this.f59894g.a());
            int i4 = 1;
            if (this.f59895h) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("sdk_success", i2);
            if (this.f59896i) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("download_suc", i3);
            if (!this.f59897j) {
                i4 = 0;
            }
            jSONObject.put("model_load_suc", i4);
        } catch (JSONException e2) {
            k.a("ml#evaluator", "getSdkInitMonitorData error!", e2);
        }
        g();
        return jSONObject;
    }

    private JSONObject b(JSONObject jSONObject) {
        int i2;
        try {
            jSONObject.put("scene", this.f59889b);
            jSONObject.put("model_name", this.f59890c);
            jSONObject.put("sdk_duration", (double) this.f59898k.a());
            jSONObject.put("pre_cost", (double) this.f59899l.a());
            jSONObject.put("infer_cost", (double) this.f59900m.a());
            jSONObject.put("post_cost", (double) this.n.a());
            if (this.o) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("sdk_success", i2);
            String str = this.p;
            if (str != null) {
                jSONObject.put("s_result", str);
            }
            Float f2 = this.q;
            if (f2 != null) {
                jSONObject.put("f_result", (double) f2.floatValue());
            }
        } catch (JSONException e2) {
            k.a("ml#evaluator", "getSdkRunMonitorData error!", e2);
        }
        h();
        return jSONObject;
    }

    public final void a(boolean z, float f2) {
        if (this.f59888a) {
            this.f59898k.f59902b = System.currentTimeMillis();
            this.o = z;
            this.q = Float.valueOf(f2);
        }
    }

    public final void a(boolean z, String str, float f2) {
        if (this.f59888a) {
            this.f59898k.f59902b = System.currentTimeMillis();
            this.o = z;
            this.p = str;
            this.q = Float.valueOf(f2);
        }
    }
}
