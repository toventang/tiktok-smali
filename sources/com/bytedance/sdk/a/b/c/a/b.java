package com.bytedance.sdk.a.b.c.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.b.b.a;
import com.bytedance.sdk.a.b.d.d;
import com.bytedance.sdk.a.c.a.c;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements a.AbstractC1045a {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.sdk.a.b.a.a f43108a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f43109b;

    static {
        Covode.recordClassIndex(26448);
    }

    private static JSONObject a(c.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (aVar != null) {
                jSONObject.put("client_key", aVar.f43134c);
            }
            jSONObject.put("sdk_version", 7);
            jSONObject.put("params_for_special", "uc_login");
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public b(Context context, com.bytedance.sdk.a.b.a.a aVar) {
        this.f43108a = aVar;
        this.f43109b = context;
    }

    private void a(String str, JSONObject jSONObject) {
        try {
            if (this.f43108a != null && !TextUtils.isEmpty(str)) {
                this.f43108a.a(str, jSONObject);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.a.b.a.b
    public final com.bytedance.sdk.a.b.d.b a(c.a aVar, String str, String str2) {
        com.bytedance.sdk.a.b.d.b bVar;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(null)) {
            str4 = aVar.f43139h;
        }
        List<String> a2 = com.bytedance.sdk.a.c.b.b.a(this.f43109b, aVar.getCallerPackage());
        HashMap hashMap = new HashMap();
        hashMap.put("client_key", aVar.f43134c);
        hashMap.put("response_type", "code");
        hashMap.put("source", "native");
        hashMap.put("scope", str4);
        if (!TextUtils.isEmpty(aVar.f43137f)) {
            hashMap.put("from", aVar.f43137f);
        }
        if (TextUtils.equals("wap_to_native", aVar.f43137f) && !TextUtils.isEmpty(aVar.f43133b)) {
            hashMap.put("redirect_uri", aVar.f43133b);
        }
        if (!TextUtils.isEmpty(aVar.f43132a)) {
            hashMap.put("state", aVar.f43132a);
        }
        if (!TextUtils.isEmpty(aVar.getCallerPackage())) {
            hashMap.put("app_identity", com.bytedance.sdk.a.c.b.a.a(aVar.getCallerPackage()));
        }
        String a3 = com.bytedance.sdk.a.c.b.b.a(a2);
        if (!TextUtils.isEmpty(a3)) {
            hashMap.put("signature", a3);
            hashMap.put("sign", a3);
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f43108a.b();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "/passport/open/auth/";
        }
        try {
            bVar = a.a(this.f43108a.a(new Uri.Builder().scheme("https").authority(str).path(str2).build().toString(), hashMap));
        } catch (Throwable th) {
            bVar = new com.bytedance.sdk.a.b.d.b();
            bVar.u = com.bytedance.sdk.a.b.e.a.a(this.f43108a, th);
        }
        int i2 = 0;
        String str5 = "fail";
        if (bVar == null) {
            i2 = -1;
            str3 = this.f43109b.getString(R.string.a40);
        } else if (!bVar.t) {
            i2 = bVar.u;
            str3 = bVar.v;
        } else {
            str3 = "";
            str5 = "success";
        }
        a("platform_auth_code", a(aVar, str5, i2, str3));
        return bVar;
    }

    private static JSONObject a(c.a aVar, String str, int i2, String str2) {
        try {
            JSONObject a2 = a(aVar);
            if (a2 == null) {
                a2 = new JSONObject();
            }
            a2.put("result", str);
            a2.put("errCode", i2);
            a2.put("errDesc", str2);
            return a2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.sdk.a.b.a.b
    public final d a(c.a aVar, String str, String str2, String str3) {
        d dVar;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str = a.a(aVar);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f43108a.b();
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "/passport/open/auth_info/v2/";
        }
        try {
            dVar = a.b(this.f43108a.a(new Uri.Builder().scheme("https").authority(str2).path(str3).appendQueryParameter("client_key", aVar.f43134c).appendQueryParameter("scope", str).build().toString()));
        } catch (Throwable th) {
            dVar = new d();
            dVar.u = com.bytedance.sdk.a.b.e.a.a(this.f43108a, th);
        }
        int i2 = 0;
        String str5 = "fail";
        if (dVar == null) {
            i2 = -1;
            str4 = this.f43109b.getString(R.string.a40);
        } else if (!dVar.t) {
            i2 = dVar.u;
            str4 = dVar.v;
        } else {
            str4 = "";
            str5 = "success";
        }
        a("platform_auth_info", a(aVar, str5, i2, str4));
        return dVar;
    }
}
