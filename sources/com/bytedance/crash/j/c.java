package com.bytedance.crash.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.a;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.util.n;
import com.bytedance.crash.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(16222);
    }

    public static boolean a(JSONObject jSONObject, JSONArray jSONArray, a.AbstractC0587a aVar) {
        JSONObject optJSONObject;
        if (n.a(jSONArray)) {
            v.a("uploadFromFile with empty aid Data ");
            return aVar.a(jSONObject);
        }
        int i2 = 0;
        boolean z = true;
        while (i2 < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i2)) != null) {
            JSONObject jSONObject2 = new JSONObject();
            b.b(jSONObject2, jSONObject);
            b.b(jSONObject2, optJSONObject);
            v.a("uploadFromFile with aidData ".concat(String.valueOf(optJSONObject)));
            z &= aVar.a(jSONObject2);
            i2++;
        }
        return z;
    }
}
