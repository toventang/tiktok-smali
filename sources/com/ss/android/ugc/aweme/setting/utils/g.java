package com.ss.android.ugc.aweme.setting.utils;

import android.content.Context;
import com.bytedance.android.ecommerce.e.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.profile.model.User;

public final class g {
    static {
        Covode.recordClassIndex(80796);
    }

    public static boolean a() {
        User curUser = b.g().getCurUser();
        if (curUser == null || curUser.getCommerceUserInfo() == null) {
            return false;
        }
        return curUser.getCommerceUserInfo().hasPromote;
    }

    public static void a(Context context) {
        a.C0095a aVar = new a.C0095a(com.bytedance.ies.ugc.appcontext.g.a());
        aVar.f7053l = h.f123040a;
        aVar.q = new i(context);
        aVar.f7043b = "https://fp22-normal-useast1a.tiktokv.com";
        com.bytedance.android.ecommerce.a.f6869a.a(aVar.a());
    }
}
