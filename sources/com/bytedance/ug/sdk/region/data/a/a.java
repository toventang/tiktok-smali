package com.bytedance.ug.sdk.region.data.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f45756a;

    /* renamed from: b  reason: collision with root package name */
    public long f45757b;

    /* renamed from: c  reason: collision with root package name */
    public String f45758c;

    /* renamed from: d  reason: collision with root package name */
    public String f45759d;

    /* renamed from: e  reason: collision with root package name */
    public long f45760e;

    /* renamed from: f  reason: collision with root package name */
    public int f45761f;

    /* renamed from: g  reason: collision with root package name */
    public String f45762g;

    static {
        Covode.recordClassIndex(27881);
    }

    private a() {
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Code", this.f45756a);
            jSONObject.put("GeoNameID", this.f45757b);
            jSONObject.put("ASCIName", this.f45758c);
            jSONObject.put("Name", this.f45759d);
            jSONObject.put("expire_time", this.f45760e);
            jSONObject.put("source", this.f45761f);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.f45762g) && !TextUtils.isEmpty(this.f45756a) && this.f45760e > 0 && System.currentTimeMillis() <= this.f45760e) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "RegionBean{code='" + this.f45756a + '\'' + ", geoNameID=" + this.f45757b + ", asciName='" + this.f45758c + '\'' + ", name='" + this.f45759d + '\'' + ", source=" + this.f45761f + ", expireTime=" + this.f45760e + '}';
    }

    public static a b(String str) {
        a aVar = new a();
        aVar.f45762g = str;
        return aVar;
    }

    public static a a(String str) {
        a aVar = new a();
        aVar.f45761f = 2;
        aVar.f45756a = str;
        aVar.f45760e = System.currentTimeMillis() + 21600000;
        return aVar;
    }

    public static a a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a();
            aVar.f45756a = com.bytedance.ug.sdk.region.data.h.a.b(jSONObject, "Code", null);
            aVar.f45757b = com.bytedance.ug.sdk.region.data.h.a.a(jSONObject, "GeoNameID", 0);
            aVar.f45758c = com.bytedance.ug.sdk.region.data.h.a.b(jSONObject, "ASCIName", null);
            aVar.f45759d = com.bytedance.ug.sdk.region.data.h.a.b(jSONObject, "Name", null);
            aVar.f45760e = com.bytedance.ug.sdk.region.data.h.a.a(jSONObject, "expire_time", System.currentTimeMillis() + 21600000);
            aVar.f45761f = i2;
            return aVar;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
