package com.bytedance.bdlocation.traceroute.internet;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bdlocation.traceroute.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(15504);
    }

    public static void a(Context context) {
        SharedPreferences.Editor edit = com.bytedance.bdlocation.traceroute.a.a.a(context).f26356a.edit();
        edit.putLong("trace_router_interval", System.currentTimeMillis() / 1000);
        edit.apply();
        b.c();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("utf-8");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2++) {
                bytes[i2] = (byte) (bytes[i2] ^ -99);
            }
            return Base64.encodeToString(bytes, 10);
        } catch (Exception e2) {
            e2.getMessage();
            b.h();
            return null;
        }
    }

    public static String a(String str) {
        "uploadOuter".concat(String.valueOf(str));
        b.c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("traceroute_info", new JSONObject(str).optJSONArray("tracerouteInfo"));
            byte[] bytes = jSONObject.toString().getBytes();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdk_version", "1.5.6-alpha.2.4-bugfix");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Type", "application/json"));
            if (com.bytedance.bdlocation.traceroute.a.f26353e) {
                arrayList.add(new com.bytedance.retrofit2.client.b("x-use-boe", "1"));
            }
            return a("/location/region/", linkedHashMap, bytes, arrayList);
        } catch (Exception e2) {
            e2.getMessage();
            b.g();
            return "";
        }
    }

    public static String a(String str, Map<String, String> map, Map<String, String> map2) {
        try {
            b.c();
            String str2 = com.bytedance.bdlocation.traceroute.a.f26349a;
            com.bytedance.bdlocation.traceroute.b.a aVar = com.bytedance.bdlocation.traceroute.a.f26354f;
            if (aVar != null) {
                return aVar.a(str2, str, map2, map);
            }
            T t = ((INetworkApiCopy) RetrofitUtils.a(str2, INetworkApiCopy.class)).doPost(-1, str, map2, map, null, null, true).execute().f42630b;
            "innerSubmitResult:".concat(String.valueOf(t));
            b.c();
            return t;
        } catch (Exception e2) {
            "submitResult".concat(String.valueOf(e2));
            b.h();
            return "";
        }
    }

    private static String a(String str, Map<String, String> map, byte[] bArr, List<com.bytedance.retrofit2.client.b> list) {
        String str2 = com.bytedance.bdlocation.traceroute.a.f26349a + str;
        try {
            com.bytedance.bdlocation.traceroute.b.a aVar = com.bytedance.bdlocation.traceroute.a.f26354f;
            if (aVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("Content-Type", "application/json");
                if (com.bytedance.bdlocation.traceroute.a.f26353e) {
                    hashMap.put("x-use-boe", "1");
                }
                return aVar.a(str2, map, hashMap, bArr);
            }
            b.b();
            T t = ((INetworkApi) RetrofitUtils.a(str2, INetworkApi.class)).postBody(-1, str, map, new TypedByteArray("application/json", bArr, new String[0]), list).execute().f42630b;
            "outerSubmitResult:".concat(String.valueOf(t));
            b.b();
            return t;
        } catch (Exception e2) {
            e2.getMessage();
            b.g();
            return "";
        }
    }
}
