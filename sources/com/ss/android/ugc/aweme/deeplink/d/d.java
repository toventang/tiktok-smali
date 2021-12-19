package com.ss.android.ugc.aweme.deeplink.d;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.d.b;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class d {
    static {
        Covode.recordClassIndex(49376);
    }

    static void a(boolean z, String str, String str2, JSONObject jSONObject, Intent intent) {
        String str3;
        if (z) {
            try {
                int a2 = b.a(intent, "msg_from");
                MobClick eventName = MobClick.obtain().setEventName("detail");
                if (a2 == 1) {
                    str3 = "click_news_notify";
                } else {
                    str3 = "click_news_alert";
                }
                MobClick labelName = eventName.setLabelName(str3);
                if (str == null) {
                    str = "";
                }
                r.onEvent(labelName.setValue(str).setExtValueString(str2).setJsonObject(jSONObject));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
