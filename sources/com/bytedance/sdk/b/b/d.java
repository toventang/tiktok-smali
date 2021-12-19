package com.bytedance.sdk.b.b;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, List<String>> f43516a;

    static {
        Covode.recordClassIndex(26643);
    }

    public static d a(String str) {
        d dVar = new d();
        JSONArray jSONArray = new JSONArray(str);
        try {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString(StringSet.name);
                JSONArray jSONArray2 = jSONObject.getJSONArray("mccmnc");
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    arrayList.add(jSONArray2.getString(i3));
                }
                hashMap.put(string, arrayList);
            }
            dVar.f43516a = hashMap;
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return dVar;
    }
}
