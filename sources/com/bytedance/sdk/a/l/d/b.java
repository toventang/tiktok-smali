package com.bytedance.sdk.a.l.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(26603);
    }

    public static a a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            a aVar = new a();
            if (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    if (next.hashCode() == 1481071862) {
                        if (next.equals("country_code")) {
                            aVar.f43417a = Integer.valueOf(jSONObject.optInt(next));
                        }
                    }
                }
            }
            return aVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
