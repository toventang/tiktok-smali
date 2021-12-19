package com.bytedance.push.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.f.c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j {
    static {
        Covode.recordClassIndex(25853);
    }

    public static List<c> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                c cVar = null;
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt(StringSet.type);
                    String optString = optJSONObject.optString("token");
                    String optString2 = optJSONObject.optString("did");
                    String optString3 = optJSONObject.optString("vc");
                    long optLong = optJSONObject.optLong("t");
                    if (optInt > 0) {
                        cVar = new c(optInt, optString, optString2, optString3, optLong);
                    }
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }
}
