package com.ss.android.ad.splash.core.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public List<a> f58518a;

    static {
        Covode.recordClassIndex(36299);
    }

    private o(List<a> list) {
        this.f58518a = list;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f58519a;

        /* renamed from: b  reason: collision with root package name */
        public String f58520b;

        /* renamed from: c  reason: collision with root package name */
        public String f58521c;

        static {
            Covode.recordClassIndex(36300);
        }

        public static a a(JSONObject jSONObject) {
            String optString = jSONObject.optString("vendorKey");
            String optString2 = jSONObject.optString("javaScriptResourceUrl");
            String optString3 = jSONObject.optString("verificationParameters");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                return null;
            }
            return new a(optString, optString2, optString3);
        }

        private a(String str, String str2, String str3) {
            this.f58519a = str;
            this.f58520b = str2;
            this.f58521c = str3;
        }
    }

    public static o a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        a a2;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("vast")) == null || (optJSONArray = optJSONObject.optJSONArray("adVerifications")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
            if (!(optJSONObject2 == null || (a2 = a.a(optJSONObject2)) == null)) {
                arrayList.add(a2);
            }
        }
        return new o(arrayList);
    }
}
