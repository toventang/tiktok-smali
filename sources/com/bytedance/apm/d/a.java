package com.bytedance.apm.d;

import android.text.TextUtils;
import com.bytedance.apm.d.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f24891a = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(14554);
    }

    public static void a(byte[] bArr) {
        List<JSONObject> d2 = d(bArr);
        if (d2 != null) {
            for (JSONObject jSONObject : d2) {
                a(jSONObject, "DATA_SEND_BEGIN");
            }
        }
    }

    public static void c(byte[] bArr) {
        for (JSONObject jSONObject : d(bArr)) {
            a(jSONObject, "DATA_SEND_FAIL");
            a(jSONObject, "DATA_SEND_END");
        }
    }

    public static void b(byte[] bArr) {
        for (JSONObject jSONObject : d(bArr)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("DATA_DOCTOR");
                if (jSONObject2 != null) {
                    jSONObject2.put("DATA_SEND_RESULT", 200);
                }
            } catch (Exception unused) {
            }
            a(jSONObject, "DATA_SEND_SUCCESS");
            a(jSONObject, "DATA_SEND_END");
        }
    }

    private static List<JSONObject> d(byte[] bArr) {
        JSONArray optJSONArray;
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("list")) {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("list");
                if (optJSONArray2 == null) {
                    return null;
                }
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                    if (!(jSONObject2 == null || (optJSONArray = jSONObject2.optJSONArray("data")) == null)) {
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            arrayList.add(optJSONArray.getJSONObject(i3));
                        }
                    }
                }
            } else {
                JSONArray optJSONArray3 = jSONObject.optJSONArray("data");
                for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                    arrayList.add(optJSONArray3.getJSONObject(i4));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private static void a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                b.a.f24903a.a(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("DATA_ID", f24891a.incrementAndGet());
            jSONObject2.put("DATA_PROCESS", f.b(com.bytedance.b.k.a.f26313g));
            jSONObject2.put("DATA_TYPE", str);
            jSONObject2.put("DATA_SAMPLE", z);
            jSONObject2.put("DATA_SAVE_DB_IMMEDIATE", false);
            jSONObject2.put("DATA_UPLOAD_IMMEDIATE", false);
            jSONObject.put("DATA_DOCTOR", jSONObject2);
            JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
            b.a.f24903a.a("DATA_RECEIVE", jSONObject3);
            b.a.f24903a.a("DATA_CACHE", jSONObject3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
