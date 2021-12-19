package com.bytedance.sdk.a.b.c.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.b.d.b;
import com.bytedance.sdk.a.b.d.d;
import com.bytedance.sdk.a.b.d.e;
import com.bytedance.sdk.a.c.a.c;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(26447);
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        try {
            a(bVar, str);
            if (bVar.t) {
                if (bVar.w != null) {
                    bVar.f43115a = bVar.w.optString("code");
                    return bVar;
                }
                bVar.u = -1;
                return bVar;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return bVar;
    }

    public static String a(c.a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.f43139h);
        if (!TextUtils.isEmpty(aVar.f43140i)) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ',') {
                sb.append(",");
            }
            sb.append(aVar.f43140i);
        }
        if (!TextUtils.isEmpty(aVar.f43141j)) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ',') {
                sb.append(",");
            }
            sb.append(aVar.f43141j);
        }
        return sb.toString();
    }

    private static Integer[][] b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        int length = jSONArray.length();
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length;
        Integer[][] numArr = (Integer[][]) Array.newInstance(Integer.class, iArr);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONArray optJSONArray = jSONArray.optJSONArray(i2);
            if (optJSONArray != null && optJSONArray.length() == 2) {
                numArr[i2][0] = Integer.valueOf(optJSONArray.optInt(0));
                numArr[i2][1] = Integer.valueOf(optJSONArray.optInt(1));
            }
        }
        return numArr;
    }

    private static Map<String, Integer[][]> a(JSONArray jSONArray) {
        String str = null;
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Integer[][] numArr = null;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                str = optJSONObject.optString("style");
                numArr = b(optJSONObject.optJSONArray("range"));
            }
            if (!TextUtils.isEmpty(str) && numArr != null) {
                hashMap.put(str, numArr);
            }
        }
        return hashMap;
    }

    public static d b(String str) {
        if (str == null) {
            return null;
        }
        d dVar = new d();
        try {
            a(dVar, str);
            if (dVar.t) {
                if (dVar.w != null) {
                    dVar.f43116a = dVar.w.optString("client_name");
                    dVar.f43117b = dVar.w.optString("client_icon");
                    JSONArray optJSONArray = dVar.w.optJSONArray("scopes");
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            dVar.f43118c.add(optJSONArray.optString(i2));
                        }
                    }
                    JSONObject optJSONObject = dVar.w.optJSONObject("scope_dict");
                    if (optJSONObject != null) {
                        dVar.f43119d = optJSONObject;
                    }
                    JSONObject optJSONObject2 = dVar.w.optJSONObject("alert_scope");
                    if (optJSONObject2 != null) {
                        com.bytedance.sdk.a.b.d.a aVar = new com.bytedance.sdk.a.b.d.a();
                        aVar.f43110a = optJSONObject2.optString("scope_name");
                        aVar.f43111b = optJSONObject2.optString("title");
                        aVar.f43112c = optJSONObject2.optString("content");
                        aVar.f43113d = optJSONObject2.optString("negative_button");
                        aVar.f43114e = optJSONObject2.optString("positive_button");
                        dVar.f43120e = aVar;
                    }
                    JSONObject optJSONObject3 = dVar.w.optJSONObject("customized_scopes");
                    if (optJSONObject3 != null) {
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = optJSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Map<String, Integer[][]> a2 = a(optJSONObject3.optJSONArray(next));
                            if (!TextUtils.isEmpty(next) && a2 != null) {
                                hashMap.put(next, a2);
                            }
                        }
                        dVar.f43121f = hashMap;
                    }
                    JSONObject optJSONObject4 = dVar.w.optJSONObject("scope_description");
                    if (optJSONObject4 != null) {
                        dVar.f43119d = optJSONObject4;
                    }
                    JSONObject optJSONObject5 = dVar.w.optJSONObject("normal_scopes");
                    if (optJSONObject5 != null) {
                        dVar.r = new d.a(optJSONObject5);
                    }
                    JSONObject optJSONObject6 = dVar.w.optJSONObject("sensitive_scopes");
                    if (optJSONObject6 != null) {
                        dVar.s = new d.a(optJSONObject6);
                    }
                    dVar.f43122g = dVar.w.optBoolean("flipchat_conceal");
                    dVar.f43123h = dVar.w.optBoolean("has_mobile");
                    dVar.f43124i = dVar.w.optBoolean("login");
                    dVar.f43125j = dVar.w.optBoolean("need_bind_mobile");
                    dVar.f43126k = dVar.w.optBoolean("qq_conceal");
                    dVar.f43127l = dVar.w.optBoolean("toutiao_conceal");
                    dVar.f43128m = dVar.w.optBoolean("weibo_conceal");
                    dVar.n = dVar.w.optBoolean("wx_conceal");
                    dVar.o = dVar.w.optBoolean("contains_invalid_scope");
                    dVar.p = dVar.w.optString("tips");
                    dVar.q = dVar.w.optBoolean("can_skip_confirm");
                } else {
                    dVar.u = -1;
                }
                return dVar;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return dVar;
    }

    private static void a(e eVar, String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("message"))) {
                eVar.t = true;
                eVar.w = jSONObject.optJSONObject("data");
                return;
            }
            eVar.t = false;
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                eVar.u = optJSONObject.optInt("error_code");
                eVar.v = optJSONObject.optString("description");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("argument is null");
    }
}
