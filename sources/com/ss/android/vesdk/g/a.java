package com.ss.android.vesdk.g;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f151317a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f151318b = new StringBuilder();

    /* renamed from: c  reason: collision with root package name */
    private boolean f151319c = true;

    static {
        Covode.recordClassIndex(99513);
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.f151317a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final a a(String str, String str2) {
        this.f151317a.put(str, str2);
        b(str, str2);
        return this;
    }

    public final a a(String str, float f2) {
        this.f151317a.put(str, String.valueOf(f2));
        b(str, String.valueOf(f2));
        return this;
    }

    private void b(String str, String str2) {
        if (!this.f151319c) {
            this.f151318b.append(",");
        }
        this.f151318b.append("\"");
        this.f151318b.append(str);
        this.f151318b.append("\"");
        this.f151318b.append(":");
        this.f151318b.append("\"");
        this.f151318b.append(str2);
        this.f151318b.append("\"");
        if (this.f151319c) {
            this.f151319c = false;
        }
    }

    public final a a(String str, int i2) {
        this.f151317a.put(str, String.valueOf(i2));
        b(str, String.valueOf(i2));
        return this;
    }
}
