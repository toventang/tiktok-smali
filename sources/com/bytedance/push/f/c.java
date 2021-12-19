package com.bytedance.push.f;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f42128a;

    /* renamed from: b  reason: collision with root package name */
    public String f42129b;

    /* renamed from: c  reason: collision with root package name */
    public String f42130c;

    /* renamed from: d  reason: collision with root package name */
    public String f42131d;

    /* renamed from: e  reason: collision with root package name */
    public int f42132e;

    static {
        Covode.recordClassIndex(25746);
    }

    public final JSONObject a() {
        if (this.f42132e <= 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StringSet.type, this.f42132e);
            jSONObject.put("token", this.f42131d);
            jSONObject.put("did", this.f42129b);
            jSONObject.put("vc", this.f42130c);
            jSONObject.put("t", this.f42128a);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final String toString() {
        return "{updateTime=" + this.f42128a + ", deviceId='" + this.f42129b + '\'' + ", versionCode='" + this.f42130c + '\'' + ", token='" + this.f42131d + '\'' + ", type=" + this.f42132e + '}';
    }

    public c(int i2, String str, String str2, String str3, long j2) {
        this.f42132e = i2;
        this.f42131d = str;
        this.f42129b = str2;
        this.f42130c = str3;
        this.f42128a = j2;
    }
}
