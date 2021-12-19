package com.bytedance.android.ecommerce.a.b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f6911a;

    /* renamed from: b  reason: collision with root package name */
    public String f6912b;

    /* renamed from: c  reason: collision with root package name */
    public String f6913c;

    /* renamed from: d  reason: collision with root package name */
    public String f6914d;

    /* renamed from: e  reason: collision with root package name */
    public String f6915e;

    static {
        Covode.recordClassIndex(3341);
    }

    public a() {
    }

    public String toString() {
        return "BaseResponse{mResponseJsonObject=" + this.f6911a + ", mSign='" + this.f6912b + '\'' + ", mResultCode='" + this.f6913c + '\'' + ", mErrorCode='" + this.f6914d + '\'' + ", mErrorMessage='" + this.f6915e + '\'' + '}';
    }

    public a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object obj = jSONObject.get("response");
            if (obj instanceof JSONObject) {
                this.f6911a = (JSONObject) obj;
            } else if (obj instanceof String) {
                this.f6911a = new JSONObject((String) obj);
            }
            this.f6914d = this.f6911a.optString("error_code");
            this.f6915e = this.f6911a.optString("error_message");
            this.f6913c = this.f6911a.optString("result_code");
            this.f6912b = jSONObject.optString("sign");
        } catch (Throwable unused) {
        }
    }
}
