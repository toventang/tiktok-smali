package com.bytedance.apm.battery.c;

import com.bytedance.apm.c;
import com.bytedance.apm.c.a.a;
import com.bytedance.apm.c.b.f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b {
    long A;

    /* renamed from: a  reason: collision with root package name */
    long f24486a;

    /* renamed from: b  reason: collision with root package name */
    long f24487b;

    /* renamed from: c  reason: collision with root package name */
    public long f24488c;

    /* renamed from: d  reason: collision with root package name */
    long f24489d;

    /* renamed from: e  reason: collision with root package name */
    public long f24490e;

    /* renamed from: f  reason: collision with root package name */
    public long f24491f;

    /* renamed from: g  reason: collision with root package name */
    long f24492g;

    /* renamed from: h  reason: collision with root package name */
    public long f24493h;

    /* renamed from: i  reason: collision with root package name */
    long f24494i;

    /* renamed from: j  reason: collision with root package name */
    public long f24495j;

    /* renamed from: k  reason: collision with root package name */
    public long f24496k;

    /* renamed from: l  reason: collision with root package name */
    long f24497l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f24498m = true;
    public String n;
    public String o;
    long p;
    long q;
    int r;
    int s;
    int t;
    int u;
    long v;
    int w;
    int x;
    int y;
    int z;

    static {
        Covode.recordClassIndex(14436);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f24486a > 60000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (this.f24487b > 5000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f24486a = 0;
        this.f24487b = 0;
        this.f24488c = 0;
        this.f24489d = 0;
        this.f24490e = 0;
        this.f24491f = 0;
        this.f24492g = 0;
        this.f24493h = 0;
        this.f24494i = 0;
        this.f24495j = 0;
        this.f24496k = 0;
        this.f24497l = 0;
        this.f24498m = true;
        this.n = "";
        this.o = "";
    }

    private boolean b(boolean z2) {
        JSONObject c2 = c(z2);
        if (c2 == null || c2.length() <= 0) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_main_process", this.f24498m);
        jSONObject.put("process_name", this.n);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("sid", this.o);
        a.b().a(new f("battery", "", c2, jSONObject, jSONObject2, (byte) 0));
        if (c.e()) {
            String[] strArr = new String[1];
            String str = "stats report, processName: " + this.n;
        }
        return true;
    }

    public final boolean a(boolean z2) {
        boolean b2 = b(z2);
        if (!b2 && c.e()) {
            String[] strArr = new String[1];
            String str = "stats report failed, processName: " + this.n;
        }
        a();
        return b2;
    }

    private JSONObject c(boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (b()) {
            jSONObject.put("front_alarm", this.f24491f);
            jSONObject.put("front_loc_p_time", this.f24489d / 1000);
            jSONObject.put("front_power_p_time", this.f24490e / 1000);
            long j2 = this.f24488c;
            if (j2 < 0) {
                if (c.e()) {
                    String[] strArr = new String[1];
                    String str = " report data invalid, frontCpuMs < 0 : " + this.f24488c;
                }
                return null;
            }
            jSONObject.put("front_cpu_active_time_p_time", j2 / 1000);
            long j3 = this.f24492g;
            if (j3 < 0) {
                if (c.e()) {
                    String[] strArr2 = new String[1];
                    String str2 = " report data invalid, mFrontTrafficBytes < 0 : " + this.f24492g;
                }
                return null;
            }
            if (!z2) {
                jSONObject.put("front_traffic_p_capacity", j3 / 1024);
            }
            double d2 = (double) this.f24491f;
            Double.isNaN(d2);
            double d3 = (double) this.f24488c;
            Double.isNaN(d3);
            double d4 = (d2 * 0.002083333383779973d) + (d3 * 6.944444612599909E-5d);
            double d5 = (double) this.f24489d;
            Double.isNaN(d5);
            double d6 = d4 + (d5 * 7.499999810534064E-6d);
            double d7 = (double) this.f24490e;
            Double.isNaN(d7);
            double d8 = d6 + (d7 * 6.944444521650439E-6d);
            if (!z2) {
                double d9 = (double) this.f24492g;
                Double.isNaN(d9);
                d8 += d9 * 5.464481073431671E-4d;
            }
            if (d8 < 0.0d) {
                if (c.e()) {
                    String[] strArr3 = new String[1];
                    " report data invalid, frontScore < 0 : ".concat(String.valueOf(d8));
                }
                return null;
            }
            jSONObject.put("front_score", d8);
            jSONObject.put("front_p_time", this.f24486a / 1000);
            float f2 = 60000.0f / ((float) this.f24486a);
            jSONObject.put("front_alarm_per_min", (double) (((float) this.f24491f) * f2));
            jSONObject.put("front_loc_per_min_p_time", (double) ((((float) this.f24489d) / 1000.0f) * f2));
            jSONObject.put("front_power_per_min_p_time", (double) ((((float) this.f24490e) / 1000.0f) * f2));
            jSONObject.put("front_cpu_active_time_per_min_p_time", (double) ((((float) this.f24488c) / 1000.0f) * f2));
            if (!z2) {
                jSONObject.put("front_traffic_per_min_p_capacity", (double) ((((float) this.f24492g) / 1024.0f) * f2));
            }
            double d10 = (double) f2;
            Double.isNaN(d10);
            jSONObject.put("front_score_per_min", d8 * d10);
            if (z2) {
                this.r = (int) (((long) this.r) + this.f24491f);
                this.u = (int) (((long) this.u) + this.f24488c);
                this.s = (int) (((long) this.s) + this.f24489d);
                this.t = (int) (((long) this.t) + this.f24490e);
                if (this.f24498m) {
                    this.v = this.f24492g;
                    this.p = this.f24486a;
                }
            }
        }
        if (c()) {
            jSONObject.put("back_alarm", this.f24496k);
            jSONObject.put("back_loc_p_time", this.f24494i / 1000);
            jSONObject.put("back_power_p_time", this.f24495j / 1000);
            long j4 = this.f24493h;
            if (j4 < 0) {
                if (c.e()) {
                    String[] strArr4 = new String[1];
                    String str3 = " report data invalid, mBackCpuMs < 0 : " + this.f24493h;
                }
                return null;
            }
            jSONObject.put("back_cpu_active_time_p_time", j4 / 1000);
            long j5 = this.f24497l;
            if (j5 < 0) {
                if (c.e()) {
                    String[] strArr5 = new String[1];
                    String str4 = " report data invalid, mBackTrafficBytes < 0 : " + this.f24497l;
                }
                return null;
            }
            if (!z2) {
                jSONObject.put("back_traffic_p_capacity", j5 / 1024);
            }
            double d11 = (double) this.f24496k;
            Double.isNaN(d11);
            double d12 = (double) this.f24493h;
            Double.isNaN(d12);
            double d13 = (d11 * 0.002083333383779973d) + (d12 * 6.944444612599909E-5d);
            double d14 = (double) this.f24494i;
            Double.isNaN(d14);
            double d15 = d13 + (d14 * 7.499999810534064E-6d);
            double d16 = (double) this.f24495j;
            Double.isNaN(d16);
            double d17 = d15 + (d16 * 6.944444521650439E-6d);
            if (!z2) {
                double d18 = (double) this.f24497l;
                Double.isNaN(d18);
                d17 += d18 * 5.464481073431671E-4d;
            }
            jSONObject.put("back_score", d17);
            jSONObject.put("back_p_time", this.f24487b / 1000);
            float f3 = 60000.0f / ((float) this.f24487b);
            jSONObject.put("back_alarm_per_min", (double) (((float) this.f24496k) * f3));
            jSONObject.put("back_loc_per_min_p_time", (double) ((((float) this.f24494i) / 1000.0f) * f3));
            jSONObject.put("back_power_per_min_p_time", (double) ((((float) this.f24495j) / 1000.0f) * f3));
            jSONObject.put("back_cpu_active_time_per_min_p_time", (double) ((((float) this.f24493h) / 1000.0f) * f3));
            if (!z2) {
                jSONObject.put("back_traffic_per_min_p_capacity", (double) ((((float) this.f24497l) / 1024.0f) * f3));
            }
            double d19 = (double) f3;
            Double.isNaN(d19);
            jSONObject.put("back_score_per_min", d17 * d19);
            if (z2) {
                this.w = (int) (((long) this.w) + this.f24496k);
                this.z = (int) (((long) this.z) + this.f24493h);
                this.x = (int) (((long) this.x) + this.f24494i);
                this.y = (int) (((long) this.y) + this.f24495j);
                if (this.f24498m) {
                    this.A = this.f24497l;
                }
                long j6 = this.f24487b;
                if (j6 > this.q) {
                    this.q = j6;
                }
            }
        }
        return jSONObject;
    }
}
