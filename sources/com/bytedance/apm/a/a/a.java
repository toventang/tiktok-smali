package com.bytedance.apm.a.a;

import com.bytedance.apm.q.q;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f24350a = "https://i.isnssdk.com/monitor/collect/c/logcollect";

    /* renamed from: com.bytedance.apm.a.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0522a {
        static {
            Covode.recordClassIndex(14302);
        }

        void a(boolean z, int i2, Exception exc, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(14301);
    }

    public static boolean a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject, AbstractC0522a aVar) {
        try {
            com.bytedance.apm.net.a aVar2 = new com.bytedance.apm.net.a(f24350a, "UTF-8");
            aVar2.a("aid", str);
            aVar2.a("verify_info", q.a());
            aVar2.a("device_id", str2);
            aVar2.a("os", "Android");
            aVar2.a("process_name", str3);
            for (String str5 : list) {
                File file = new File(str5);
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", str4);
                    hashMap.put("env", "params.txt");
                    aVar2.a(file.getName(), file, hashMap);
                }
            }
            aVar2.a(jSONObject);
            try {
                JSONObject jSONObject2 = new JSONObject(aVar2.a());
                if (jSONObject2.optInt("errno", -1) == 200) {
                    aVar.a(true, -1, null, jSONObject2);
                    return true;
                }
                aVar.a(false, 6, null, null);
                return false;
            } catch (JSONException e2) {
                aVar.a(false, 7, e2, null);
            }
        } catch (IOException e3) {
            aVar.a(false, 8, e3, null);
            return false;
        }
    }
}
