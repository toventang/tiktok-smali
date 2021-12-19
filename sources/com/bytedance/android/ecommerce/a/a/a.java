package com.bytedance.android.ecommerce.a.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public String f6877a;

    /* renamed from: b  reason: collision with root package name */
    public String f6878b;

    /* renamed from: c  reason: collision with root package name */
    public String f6879c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f6880d;

    static {
        Covode.recordClassIndex(3336);
    }

    /* access modifiers changed from: package-private */
    public abstract JSONObject b();

    public String toString() {
        return "BaseRequest{, mMerchantId='" + this.f6877a + '\'' + ", mRequestTime='" + this.f6878b + '\'' + ", mSign='" + this.f6879c + '\'' + '}';
    }

    public final List<Pair<String, String>> a() {
        ArrayList arrayList = new ArrayList();
        String jSONObject = b().toString();
        int indexOf = jSONObject.indexOf("nonce");
        if (indexOf > 0) {
            String str = jSONObject.substring(0, indexOf) + "nonce\":\"";
            String substring = jSONObject.substring(indexOf + 8);
            int indexOf2 = substring.indexOf("\"");
            jSONObject = str + substring.substring(0, indexOf2).replace("\\/", "/") + substring.substring(indexOf2);
        }
        arrayList.add(new Pair("biz_content", jSONObject));
        String str2 = this.f6877a;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        arrayList.add(new Pair("merchant_id", str2));
        String str4 = this.f6878b;
        if (str4 == null) {
            str4 = str3;
        }
        arrayList.add(new Pair("request_time", str4));
        String str5 = this.f6879c;
        if (str5 != null) {
            str3 = str5;
        }
        arrayList.add(new Pair("sign", str3));
        return arrayList;
    }
}
