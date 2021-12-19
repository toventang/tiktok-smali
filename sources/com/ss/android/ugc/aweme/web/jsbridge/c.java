package com.ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.common.applog.q;
import com.ss.android.ugc.trill.d.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements d {
    static {
        Covode.recordClassIndex(94822);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        q.b(hashMap, false);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!m.a(str) && !m.a(str2)) {
                try {
                    jSONObject.put(str, str2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        try {
            String b2 = a.b();
            if (!TextUtils.isEmpty(b2)) {
                jSONObject.put("gaid", b2);
            }
            jSONObject.put("code", 1);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }
}
