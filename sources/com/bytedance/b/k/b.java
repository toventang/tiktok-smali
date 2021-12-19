package com.bytedance.b.k;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(15281);
    }

    public static List<Object> a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONObject.optInt("wrapper_type_description", -1) != 1) {
            arrayList.add(jSONObject);
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("wrapper_array_data");
        if (optJSONArray == null) {
            return null;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            try {
                arrayList.add(optJSONArray.get(i2));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static JSONObject a(String str, JSONArray jSONArray) {
        try {
            JSONObject put = new JSONObject().put("wrapper_array_data", jSONArray);
            put.put("log_type", str);
            put.put("wrapper_type_description", 1);
            return put;
        } catch (Exception unused) {
            return null;
        }
    }
}
