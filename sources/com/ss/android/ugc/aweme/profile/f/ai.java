package com.ss.android.ugc.aweme.profile.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import org.json.JSONObject;

public final class ai extends in {
    static {
        Covode.recordClassIndex(75149);
    }

    public static void a(JSONObject jSONObject) {
        long j2;
        String str;
        String str2;
        User curUser = b.g().getCurUser();
        boolean z = false;
        if (curUser == null || !b.g().isLogin()) {
            j2 = -1;
            str = "";
            str2 = str;
        } else {
            j2 = Long.parseLong(b.g().getCurUserId());
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                str = curUser.getShortId();
            } else {
                str = curUser.getUniqueId();
            }
            str2 = curUser.getBindPhone();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (!(avatarMedium == null || avatarMedium.getUrlList() == null || avatarMedium.getUrlList().isEmpty())) {
                jSONObject.put("avatar_url", avatarMedium.getUrlList().get(0));
            }
            z = true;
        }
        jSONObject.put("is_login", z);
        jSONObject.put("success", z);
        jSONObject.put("user_id", String.valueOf(j2));
        jSONObject.put("nickname", "");
        jSONObject.put("unique_id", str);
        jSONObject.put("bind_phone", str2);
        jSONObject.put("code", 1);
        Long b2 = n.a.b(curUser);
        if (b2 != null) {
            jSONObject.put("decoration_id", b2);
        }
    }
}
