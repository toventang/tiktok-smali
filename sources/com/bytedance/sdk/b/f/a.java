package com.bytedance.sdk.b.f;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.b.b.d;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(26694);
    }

    public static JSONObject c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errDesc", str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static String a(InputStream inputStream) {
        MethodCollector.i(3459);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = inputStreamReader.read(cArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            return sb.toString();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            inputStreamReader.close();
            MethodCollector.o(3459);
        }
    }

    public static String b(String str) {
        Map<String, List<String>> map;
        d i2 = com.bytedance.sdk.b.a.i();
        if (!(i2 == null || (map = i2.f43516a) == null)) {
            for (String str2 : map.keySet()) {
                if (map.get(str2).contains(str)) {
                    return str2;
                }
            }
        }
        return "unknown";
    }

    public static String a(String str) {
        String h2 = com.bytedance.sdk.b.a.h();
        if (!TextUtils.isEmpty(h2)) {
            return "https://" + h2 + str;
        }
        com.bytedance.sdk.b.c.a.d("host is null, please check host config");
        return null;
    }

    public static String a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return sb.toString();
    }

    public static boolean a(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            if (context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            com.bytedance.sdk.b.c.a.d(e2.getMessage());
            return false;
        }
    }

    public static JSONObject a(int i2, String str, String str2, String str3, String str4, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i2);
            jSONObject.put("platform", str);
            jSONObject.put("host", str2);
            jSONObject.put("path", str3);
            jSONObject.put("url", str4);
            jSONObject.put("errCode", i3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
