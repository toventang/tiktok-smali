package com.bytedance.apm.c.b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.c.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f24719a;

    /* renamed from: b  reason: collision with root package name */
    public long f24720b;

    /* renamed from: c  reason: collision with root package name */
    public long f24721c;

    /* renamed from: d  reason: collision with root package name */
    public String f24722d;

    /* renamed from: e  reason: collision with root package name */
    public String f24723e;

    /* renamed from: f  reason: collision with root package name */
    public String f24724f;

    /* renamed from: g  reason: collision with root package name */
    public int f24725g;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f24726h;

    static {
        Covode.recordClassIndex(14517);
    }

    @Override // com.bytedance.apm.c.b
    public final boolean a(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.apm.c.b
    public final String b() {
        return null;
    }

    @Override // com.bytedance.apm.c.b
    public final String c() {
        return null;
    }

    @Override // com.bytedance.apm.c.b
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.apm.c.b
    public final JSONObject a() {
        if (TextUtils.isEmpty(this.f24719a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.f24719a);
            jSONObject.put("duration", this.f24720b);
            jSONObject.put("uri", Uri.parse(this.f24722d));
            long j2 = this.f24721c;
            if (j2 > 0) {
                jSONObject.put("timestamp", j2);
            }
            jSONObject.put("status", this.f24725g);
            if (!TextUtils.isEmpty(this.f24723e)) {
                jSONObject.put("ip", this.f24723e);
            }
            if (!TextUtils.isEmpty(this.f24724f)) {
                jSONObject.put("trace_code", this.f24724f);
            } else {
                jSONObject.put("trace_code", "");
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public a(String str, long j2, long j3, String str2, String str3, String str4, int i2, JSONObject jSONObject) {
        this.f24719a = str;
        this.f24720b = j2;
        this.f24721c = j3;
        this.f24722d = str2;
        this.f24723e = str3;
        this.f24724f = str4;
        this.f24725g = i2;
        if (jSONObject == null) {
            this.f24726h = new JSONObject();
        } else {
            this.f24726h = jSONObject;
        }
    }
}
