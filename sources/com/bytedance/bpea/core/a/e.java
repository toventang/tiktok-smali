package com.bytedance.bpea.core.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f26620a;

    /* renamed from: b  reason: collision with root package name */
    public String f26621b;

    /* renamed from: c  reason: collision with root package name */
    JSONObject f26622c;

    /* renamed from: d  reason: collision with root package name */
    JSONObject f26623d;

    /* renamed from: e  reason: collision with root package name */
    JSONObject f26624e;

    static {
        Covode.recordClassIndex(15678);
    }

    public final String a(String str) {
        l.c(str, "");
        JSONObject jSONObject = this.f26622c;
        if (jSONObject != null) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public final JSONArray b(String str) {
        l.c(str, "");
        JSONObject jSONObject = this.f26623d;
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public final JSONObject c(String str) {
        l.c(str, "");
        JSONObject jSONObject = this.f26624e;
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }
}
