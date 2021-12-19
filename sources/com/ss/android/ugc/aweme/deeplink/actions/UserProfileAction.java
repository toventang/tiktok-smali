package com.ss.android.ugc.aweme.deeplink.actions;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.actions.a.b;
import com.ss.android.ugc.aweme.deeplink.q;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import h.z;
import java.util.HashMap;

public final class UserProfileAction extends b<z> {
    static {
        Covode.recordClassIndex(49341);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.actions.a.b
    public final p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        String str2;
        String str3 = "";
        l.d(str, str3);
        l.d(hashMap, str3);
        Uri parse = Uri.parse(str);
        Object obj = hashMap.get("id");
        if (obj == null && (obj = hashMap.get("uid")) == null) {
            obj = hashMap.get("user_id");
        }
        Object obj2 = hashMap.get("unique_id");
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = null;
        }
        String a2 = q.a.a(str2, parse);
        Object obj3 = hashMap.get("invitation_id");
        p[] pVarArr = new p[4];
        String str4 = obj;
        if (obj == null) {
            str4 = str3;
        }
        pVarArr[0] = v.a("uid", str4);
        if (a2 == null) {
            a2 = str3;
        }
        pVarArr[1] = v.a("sec_user_id", a2);
        if (obj2 == null) {
            obj2 = str3;
        }
        pVarArr[2] = v.a("unique_id", obj2);
        String str5 = str3;
        if (obj3 != null) {
            str5 = obj3;
        }
        pVarArr[3] = v.a("invitation_id", str5);
        return new p<>("//user/profile", ag.c(pVarArr));
    }
}
