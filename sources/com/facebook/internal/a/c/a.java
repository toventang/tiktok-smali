package com.facebook.internal.a.c;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.d;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f48503a;

    /* renamed from: b  reason: collision with root package name */
    Long f48504b;

    /* renamed from: c  reason: collision with root package name */
    private String f48505c;

    static {
        Covode.recordClassIndex(29254);
    }

    public final boolean a() {
        if (this.f48505c == null || this.f48504b == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        JSONObject b2 = b();
        if (b2 == null) {
            return null;
        }
        return b2.toString();
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l2 = this.f48504b;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            jSONObject.put("error_message", this.f48505c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public a(File file) {
        String name = file.getName();
        this.f48503a = name;
        JSONObject a2 = d.a(name);
        if (a2 != null) {
            this.f48504b = Long.valueOf(a2.optLong("timestamp", 0));
            this.f48505c = a2.optString("error_message", null);
        }
    }

    public a(String str) {
        this.f48504b = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f48505c = str;
        this.f48503a = new StringBuffer("error_log_").append(this.f48504b).append(".json").toString();
    }
}
