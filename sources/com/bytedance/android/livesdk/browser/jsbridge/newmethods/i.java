package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import org.json.JSONObject;

public final class i extends f<Object, JSONObject> {
    static {
        Covode.recordClassIndex(8153);
    }

    private static void a(User user, JSONObject jSONObject) {
        jSONObject.put("user_id", String.valueOf(user.getId()));
        jSONObject.put("sec_user_id", user.getSecUid());
        if (user.getAvatarThumb() != null) {
            jSONObject.put("avatar", user.getAvatarThumb().getUrls().get(0));
        }
        jSONObject.put("nickname", user.getNickName());
        if (user.getAnchorInfo() != null) {
            jSONObject.put("anchor_level", user.getAnchorInfo().f19049a);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012f  */
    @Override // com.bytedance.ies.web.jsbridge2.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ org.json.JSONObject invoke(java.lang.Object r11, com.bytedance.ies.web.jsbridge2.g r12) {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.i.invoke(java.lang.Object, com.bytedance.ies.web.jsbridge2.g):java.lang.Object");
    }
}
