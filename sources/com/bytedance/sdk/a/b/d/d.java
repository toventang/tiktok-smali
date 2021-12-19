package com.bytedance.sdk.a.b.d;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends c {

    /* renamed from: g  reason: collision with root package name */
    public boolean f43122g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f43123h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f43124i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f43125j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f43126k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f43127l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f43128m;
    public boolean n;
    public boolean o;
    public String p;
    public boolean q;
    public a r;
    public a s;

    static {
        Covode.recordClassIndex(26452);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f43129a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f43130b;

        /* renamed from: c  reason: collision with root package name */
        public Set<String> f43131c;

        static {
            Covode.recordClassIndex(26453);
        }

        public a(JSONObject jSONObject) {
            int length;
            if (jSONObject != null) {
                this.f43129a = jSONObject;
                this.f43130b = jSONObject.optBoolean("can_skip_confirm");
                JSONArray optJSONArray = jSONObject.optJSONArray("content");
                if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                    this.f43131c = new HashSet();
                    int i2 = 0;
                    do {
                        this.f43131c.add(optJSONArray.optString(i2));
                        i2++;
                    } while (i2 < length);
                }
            }
        }
    }
}
