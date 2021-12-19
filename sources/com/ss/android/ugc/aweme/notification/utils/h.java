package com.ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.profile.model.User;

public final class h {

    /* renamed from: a */
    public static final h f113880a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(73232);
    }

    private static boolean a(Context context, User user, String str, String str2, String str3, boolean z) {
        if (user == null || !z || user.getFollowStatus() != 2) {
            return false;
        }
        if (str == null) {
            str = "notification_page";
        }
        if (str2 == null) {
            str2 = "button";
        }
        IMUser fromUser = IMUser.fromUser(user);
        if (fromUser == null) {
            return true;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        a.C2643a c2 = a.b.a(context, fromUser).c(str);
        c2.f103883a.setEnterFromSubPage(str3);
        createIIMServicebyMonsterPlugin.startChat(c2.d(i.a(context, user)).b(str2).f103883a);
        return true;
    }

    public static /* synthetic */ boolean a(Context context, User user, String str, String str2, String str3, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            str = "notification_page";
        }
        if ((i2 & 8) != 0) {
            str2 = "button";
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        return a(context, user, str, str2, str3, z);
    }
}
