package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f102448a = new w();

    private w() {
    }

    static {
        Covode.recordClassIndex(65586);
    }

    public static void a(JSONObject jSONObject, ai aiVar, BaseContent baseContent) {
        String str;
        String str2;
        l.d(jSONObject, "");
        l.d(aiVar, "");
        boolean z = false;
        try {
            if (aiVar.getLocalExt() != null && aiVar.getLocalExt().containsKey("key_resend")) {
                z = true;
            }
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put("is_resend", str);
            if (!t.a(aiVar, baseContent).equals("ttFarm")) {
                jSONObject.put("enter_from", b.a("enter_from", b.a("enter_from", aiVar.getLocalExt().get("enter_from"))));
            }
            jSONObject.put("enter_method", b.a("enter_method", b.a("enter_method", aiVar.getLocalExt().get("enter_from"))));
            IMUser b2 = g.b(String.valueOf(b.a.c(aiVar.getConversationId())), c.a(aiVar.getConversationId()));
            if (b2 == null || b2.getFriendRecType() != 1) {
                str2 = "";
            } else {
                str2 = "share_link_match";
            }
            jSONObject.put("rec_reason", str2);
        } catch (JSONException e2) {
            a.a("", e2);
        }
    }
}
