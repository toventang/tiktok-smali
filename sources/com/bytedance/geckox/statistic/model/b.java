package com.bytedance.geckox.statistic.model;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public long f30086a;

    /* renamed from: b  reason: collision with root package name */
    public int f30087b;

    /* renamed from: c  reason: collision with root package name */
    public String f30088c;

    /* renamed from: d  reason: collision with root package name */
    public String f30089d;

    /* renamed from: e  reason: collision with root package name */
    public int f30090e;

    /* renamed from: f  reason: collision with root package name */
    public int f30091f;

    /* renamed from: g  reason: collision with root package name */
    public long f30092g;

    /* renamed from: h  reason: collision with root package name */
    public int f30093h;

    /* renamed from: i  reason: collision with root package name */
    public int f30094i;

    static {
        Covode.recordClassIndex(17477);
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.put("access_key", this.f30089d);
        jSONObject.put("channel", this.f30088c);
        jSONObject.put("stats_type", this.f30087b);
        jSONObject.put("clean_duration", this.f30092g);
        long j2 = this.f30086a;
        if (j2 != 0) {
            jSONObject.put("id", j2);
        }
        int i2 = this.f30093h;
        if (i2 != 0) {
            jSONObject.put("req_type", i2);
        }
        int i3 = this.f30090e;
        if (i3 != 0) {
            jSONObject.put("clean_type", i3);
        }
        int i4 = this.f30091f;
        if (i4 != 0) {
            jSONObject.put("clean_strategy", i4);
        }
        int i5 = this.f30094i;
        if (i5 != 0) {
            jSONObject.put("expire_age", i5);
        }
    }

    public b(String str, long j2, int i2, int i3, int i4) {
        this.f30089d = null;
        this.f30088c = str;
        this.f30092g = j2;
        this.f30087b = i2;
        this.f30094i = i3;
        this.f30090e = i4;
    }

    public b(String str, String str2, int i2, int i3, long j2, long j3, int i4) {
        this.f30088c = str2;
        this.f30089d = str;
        this.f30090e = i2;
        this.f30091f = 1;
        this.f30092g = j3;
        this.f30087b = i3;
        this.f30086a = j2;
        this.f30093h = i4;
    }
}
