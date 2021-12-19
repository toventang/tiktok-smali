package com.bytedance.apm.q;

import android.text.TextUtils;
import com.bytedance.apm.net.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.c;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    static {
        Covode.recordClassIndex(14700);
    }

    public static c a(String str, List<File> list, Map<String, String> map) {
        try {
            a aVar = new a(str, "UTF-8");
            if (list != null && !list.isEmpty()) {
                for (File file : list) {
                    if (file.exists()) {
                        aVar.a(file.getName(), file, new HashMap());
                    }
                }
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
            }
            String a2 = aVar.a();
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(a2);
                return new c(jSONObject.optInt("error_code", 0), jSONObject.optString("message", "").getBytes());
            } catch (JSONException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
