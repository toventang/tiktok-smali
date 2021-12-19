package com.bytedance.android.a.a.f;

import android.text.TextUtils;
import com.bytedance.android.a.a.h.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class b {

    /* renamed from: i  reason: collision with root package name */
    public boolean f6670i = true;

    static {
        Covode.recordClassIndex(3199);
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f6670i = a(jSONObject, "is_enable", true);
            } catch (Throwable th) {
                a.a(th.getMessage());
            }
        }
    }

    protected static boolean a(JSONObject jSONObject, String str) {
        return a(jSONObject, str, false);
    }

    protected static boolean a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str) || !jSONObject.has(str)) {
            return z;
        }
        if (jSONObject.optBoolean(str, z)) {
            a.a("please replace True/False with 1/0 for setting :".concat(String.valueOf(str)));
            return true;
        } else if (jSONObject.optInt(str, z ? 1 : 0) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
