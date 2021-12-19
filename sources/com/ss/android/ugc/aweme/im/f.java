package com.ss.android.ugc.aweme.im;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    static {
        Covode.recordClassIndex(63784);
    }

    public static void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        r.a("inner_push_setting", hashMap);
    }

    public static void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        r.a("live_inner_push_setting", hashMap);
    }

    public static void a(String str, String str2) {
        r.onEvent(MobClick.obtain().setEventName("unblock").setLabelName(str).setValue(str2));
    }

    public static void a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str3);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            jSONObject = null;
        }
        r.onEvent(MobClick.obtain().setEventName("block").setLabelName(str).setValue(str2).setJsonObject(jSONObject));
    }
}
