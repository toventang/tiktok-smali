package com.bytedance.push.frontier.setting;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.f;
import com.bytedance.push.frontier.c;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import com.ss.android.message.a.a;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class d {
    static {
        Covode.recordClassIndex(25764);
    }

    d() {
    }

    public final synchronized void a(Context context, com.bytedance.push.frontier.a.d dVar) {
        boolean z;
        MethodCollector.i(14141);
        FrontierLocalSetting frontierLocalSetting = (FrontierLocalSetting) h.a(context, FrontierLocalSetting.class);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - frontierLocalSetting.a()) / 60000 < ((PushOnlineSettings) h.a(context, PushOnlineSettings.class)).l()) {
            z = true;
        } else {
            z = false;
        }
        a b2 = frontierLocalSetting.b();
        if (b2 == null || !b2.b() || !z) {
            try {
                String a2 = j.f26946a.a(a.a(com.ss.android.pushmanager.a.a("/cloudpush/update_frontier_setting/"), f.f42099a.e()), new ArrayList(), (Map<String, String>) null);
                if (TextUtils.isEmpty(a2)) {
                    a(304, a2, currentTimeMillis);
                } else {
                    JSONObject jSONObject = new JSONObject(a2);
                    if (!TextUtils.equals("success", jSONObject.optString("message"))) {
                        a(302, a2, currentTimeMillis);
                    } else {
                        a a3 = a.a(jSONObject.optJSONObject("frontier_setting"));
                        if (a3 == null || !a3.b()) {
                            a(303, a2, currentTimeMillis);
                        } else {
                            frontierLocalSetting.a(System.currentTimeMillis());
                            frontierLocalSetting.a(a3);
                            c.a().c().a(System.currentTimeMillis() - currentTimeMillis);
                            dVar.a(a3);
                            MethodCollector.o(14141);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                a(301, th.getLocalizedMessage(), currentTimeMillis);
            }
        }
        dVar.a(b2);
        MethodCollector.o(14141);
    }

    private static void a(int i2, String str, long j2) {
        c.a().c().a(i2, str, System.currentTimeMillis() - j2);
    }
}
