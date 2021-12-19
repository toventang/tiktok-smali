package com.ss.android.ad.splash.core.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, int[][]> f58535a = new HashMap();

    static {
        Covode.recordClassIndex(36304);
    }

    private s() {
    }

    public static s a(String str) {
        JSONObject jSONObject;
        s sVar = new s();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            sVar.f58535a = a(jSONObject);
        }
        return sVar;
    }

    private static Map<String, int[][]> a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next) && (optJSONArray = jSONObject.optJSONArray(next)) != null) {
                hashMap.put(next, a(optJSONArray));
            }
        }
        return hashMap;
    }

    private static int[][] a(JSONArray jSONArray) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 0, 0);
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            int[] iArr2 = new int[2];
            iArr2[1] = 2;
            iArr2[0] = length;
            iArr = (int[][]) Array.newInstance(int.class, iArr2);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i2);
                if (optJSONArray != null && optJSONArray.length() >= 2) {
                    int i3 = 0;
                    do {
                        iArr[i2][i3] = optJSONArray.optInt(i3);
                        i3++;
                    } while (i3 < 2);
                }
            }
        }
        return iArr;
    }
}
