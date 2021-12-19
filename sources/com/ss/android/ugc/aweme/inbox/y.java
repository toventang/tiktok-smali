package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.service.a;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class y {
    static {
        Covode.recordClassIndex(66915);
    }

    public static final void a(String str, r rVar) {
        String str2;
        String str3;
        l.d(str, "");
        l.d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("is_auth", "0");
        linkedHashMap.put("platform", "contact");
        String str4 = "on";
        if (a.f97047a.d().b()) {
            str2 = str4;
        } else {
            str2 = "unknown";
        }
        linkedHashMap.put("did_status", str2);
        if (!a.f97047a.d().a()) {
            str4 = "off";
        }
        linkedHashMap.put("uid_status", str4);
        if (rVar == r.TOP) {
            str3 = "top";
        } else {
            str3 = "bottom";
        }
        linkedHashMap.put("position", str3);
        r.a(str, linkedHashMap);
    }
}
