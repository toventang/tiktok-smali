package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.net.CommonApi;
import h.f.b.l;
import h.m.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public final class fd {

    /* renamed from: a  reason: collision with root package name */
    public static final fd f142903a = new fd();

    private fd() {
    }

    static {
        Covode.recordClassIndex(93511);
    }

    public static CommonApi a(String str) {
        if (m.a(str)) {
            return null;
        }
        return (CommonApi) a.a().a(str).a(CommonApi.class);
    }

    private final void a(Map<String, String> map, JSONObject jSONObject, String str) {
        String str2;
        String obj;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String str3 = "";
                if (TextUtils.isEmpty(str)) {
                    l.b(next, str3);
                    str2 = next;
                } else {
                    str2 = str + '[' + next + ']';
                }
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof JSONObject) {
                    a(map, (JSONObject) obj2, str2);
                } else if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj2;
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        a(map, jSONArray.getJSONObject(i2), str2);
                    }
                } else {
                    if (!(obj2 == null || (obj = obj2.toString()) == null)) {
                        str3 = obj;
                    }
                    map.put(str2, str3);
                }
            }
        }
    }

    public final String b(String str, JSONObject jSONObject, String str2, List<b> list) {
        l.d(str, "");
        u<String> c2 = c(str, jSONObject, str2, list);
        if (c2 == null) {
            l.b();
        }
        T t = c2.f42630b;
        if (t == null) {
            l.b();
        }
        return t;
    }

    public static u<String> a(String str, JSONObject jSONObject, String str2, List<b> list) {
        String jSONObject2;
        l.d(str, "");
        byte[] bArr = null;
        String str3 = (String) i.a(str, (Map<String, String>) null).first;
        l.b(str3, "");
        CommonApi a2 = a(str3);
        if (a2 != null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(new b("Content-Type", str2));
            }
            if (!(jSONObject == null || (jSONObject2 = jSONObject.toString()) == null)) {
                Charset forName = Charset.forName("UTF-8");
                l.b(forName, "");
                Objects.requireNonNull(jSONObject2, "null cannot be cast to non-null type java.lang.String");
                bArr = jSONObject2.getBytes(forName);
                l.b(bArr, "");
            }
            return a2.putBody(str, new TypedByteArray(str2, bArr, new String[0]), list).execute();
        }
        throw new RuntimeException("CommonApi is null,url=".concat(String.valueOf(str)));
    }

    public final u<String> c(String str, JSONObject jSONObject, String str2, List<b> list) {
        String jSONObject2;
        l.d(str, "");
        byte[] bArr = null;
        String str3 = (String) i.a(str, (Map<String, String>) null).first;
        l.b(str3, "");
        CommonApi a2 = a(str3);
        if (a2 != null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(new b("Content-Type", str2));
            }
            if (str2 == null || !p.b(str2, "application/json", false)) {
                HashMap hashMap = new HashMap();
                a(hashMap, jSONObject, "");
                return a2.doPost(str, hashMap, list).execute();
            }
            if (!(jSONObject == null || (jSONObject2 = jSONObject.toString()) == null)) {
                Charset forName = Charset.forName("UTF-8");
                l.b(forName, "");
                Objects.requireNonNull(jSONObject2, "null cannot be cast to non-null type java.lang.String");
                bArr = jSONObject2.getBytes(forName);
                l.b(bArr, "");
            }
            return a2.postBody(str, new TypedByteArray(str2, bArr, new String[0]), list).execute();
        }
        throw new RuntimeException("CommonApi is null,url=".concat(String.valueOf(str)));
    }
}
