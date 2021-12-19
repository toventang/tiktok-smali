package com.ss.android.ugc.aweme.notification.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.e;
import com.ss.android.ugc.aweme.notification.view.template.c;
import com.ss.android.ugc.aweme.notification.view.template.d;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class a implements c {
    static {
        Covode.recordClassIndex(72860);
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    public final void a(d dVar) {
        String str;
        String optString;
        String str2;
        String str3;
        l.d(dVar, "");
        e eVar = dVar.f114024a.templateNotice;
        if (eVar != null && (str = eVar.f112851i) != null && str.length() != 0 && (optString = new JSONObject(str).optString("ad_extra_data")) != null && optString.length() != 0) {
            JSONObject jSONObject = new JSONObject(optString);
            String optString2 = jSONObject.optString("creative_id");
            if (optString2 == null) {
                optString2 = "0";
            }
            int optInt = jSONObject.optInt("cost_type");
            if (optInt != 1 || !dVar.f114029f) {
                str2 = "othershow";
                if (optInt == 3) {
                    str2 = "ad_message_show";
                }
            } else {
                str2 = "show";
            }
            String optString3 = jSONObject.optString("log_extra");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            l.b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                l.b(next, "");
                Object obj = jSONObject.get(next);
                l.b(obj, "");
                hashMap.put(next, obj);
            }
            hashMap.put("show_message_order", Integer.valueOf(dVar.f114025b));
            if (dVar.f114029f) {
                str3 = "secondpage_message";
            } else {
                str3 = "preview_message";
            }
            com.bytedance.ies.ugc.aweme.rich.a.d.a("message_ad", str2, optString2, optString3, null).a("refer", str3).a(hashMap).b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        if (r12 == 3) goto L_0x00be;
     */
    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.notification.view.template.f r17) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.c.a.a(com.ss.android.ugc.aweme.notification.view.template.f):boolean");
    }
}
