package com.bytedance.b.d;

import com.bytedance.b.i.a.a.a;
import com.bytedance.b.i.a.c;
import com.bytedance.b.k.e;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private long f26134a;

    /* renamed from: b  reason: collision with root package name */
    private long f26135b;

    /* renamed from: c  reason: collision with root package name */
    private long f26136c;

    /* renamed from: d  reason: collision with root package name */
    private long f26137d;

    /* renamed from: e  reason: collision with root package name */
    private long f26138e;

    /* renamed from: f  reason: collision with root package name */
    private long f26139f;

    /* renamed from: g  reason: collision with root package name */
    private long f26140g;

    /* renamed from: h  reason: collision with root package name */
    private double f26141h;

    /* renamed from: i  reason: collision with root package name */
    private JSONArray f26142i;

    /* renamed from: j  reason: collision with root package name */
    private JSONArray f26143j;

    /* renamed from: k  reason: collision with root package name */
    private JSONArray f26144k;

    /* renamed from: l  reason: collision with root package name */
    private JSONArray f26145l;

    static {
        Covode.recordClassIndex(15195);
    }

    @Override // com.bytedance.b.h.b
    public final boolean b() {
        return true;
    }

    @Override // com.bytedance.b.i.a.a.a
    public final String d() {
        return "disk";
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject g() {
        JSONObject c2 = c.a().c();
        try {
            e.a(c2, c.a().d());
        } catch (Exception unused) {
        }
        return c2;
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", c.a().b());
            jSONObject.put("process_name", com.bytedance.b.e.a.a.d());
            jSONObject.put("is_front", false);
            jSONObject.put("is_main_process", com.bytedance.b.e.a.a.c());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f26145l;
            if (jSONArray != null) {
                jSONObject.put("disk_info", jSONArray);
            }
            JSONArray jSONArray2 = this.f26142i;
            if (jSONArray2 != null) {
                jSONObject.put("top_usage", jSONArray2);
            }
            JSONArray jSONArray3 = this.f26143j;
            if (jSONArray3 != null) {
                jSONObject.put("exception_folders", jSONArray3);
            }
            JSONArray jSONArray4 = this.f26144k;
            if (jSONArray4 != null) {
                jSONObject.put("outdated_files", jSONArray4);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.b.i.a.a.a
    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            long j2 = this.f26134a;
            if (j2 > 0) {
                jSONObject.put("data", j2);
            }
            long j3 = this.f26135b;
            if (j3 > 0) {
                jSONObject.put("cache", j3);
            }
            long j4 = this.f26136c;
            if (j4 > 0) {
                jSONObject.put("total", j4);
            }
            long j5 = this.f26137d;
            if (j5 > 0) {
                jSONObject.put("rom_free", j5);
            }
            long j6 = this.f26138e;
            if (j6 > 0) {
                jSONObject.put("app_usage", j6);
            }
            long j7 = this.f26139f;
            if (j7 > 0) {
                jSONObject.put("total_capacity", j7);
            }
            long j8 = this.f26140g;
            if (j8 > 0) {
                jSONObject.put("free_capacity", j8);
            }
            double d2 = this.f26141h;
            if (d2 > 0.0d) {
                jSONObject.put("app_occupied_rate", d2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public b(long j2, long j3, long j4, long j5, long j6, long j7, long j8, double d2, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4) {
        this.f26134a = j2;
        this.f26135b = j3;
        this.f26136c = j4;
        this.f26137d = j5;
        this.f26138e = j6;
        this.f26139f = j7;
        this.f26140g = j8;
        this.f26141h = d2;
        this.f26142i = jSONArray;
        this.f26143j = jSONArray2;
        this.f26144k = jSONArray3;
        this.f26145l = jSONArray4;
    }
}
