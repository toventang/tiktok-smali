package com.ss.android.ugc.aweme.aabplugin.core.base.a;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;
import org.json.JSONObject;

public final class c {
    public static int a(int i2) {
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            return 3;
        }
        if (i2 != 5) {
            return i2 != 8 ? 4 : 2;
        }
        return 1;
    }

    static {
        Covode.recordClassIndex(38441);
        com.ss.android.ugc.aweme.plugin.aab.c.c();
    }

    public static JSONObject a(n nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : nVar.c().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static void a(n nVar, int i2) {
        if (nVar != null) {
            try {
                JSONObject a2 = a(nVar);
                a2.put("status", i2);
                a2.put("is_silent_install", nVar.f62507a);
                a2.put("is_regain_install", nVar.n);
                r.b("df_install", a2);
                b.a("df_install", a(i2), a2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(n nVar, int i2, String str) {
        if (nVar != null) {
            try {
                JSONObject a2 = a(nVar);
                a2.put("operation", i2);
                a2.put("is_silent_install", nVar.f62507a);
                a2.put("extra_info", str);
                r.b("df_downloader_op", a2);
                b.a("df_downloader_op", i2, a2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
