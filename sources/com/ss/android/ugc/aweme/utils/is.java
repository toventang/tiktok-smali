package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.creatortools.videogift.a;
import com.ss.android.ugc.aweme.creatortools.videogift.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class is {

    /* renamed from: a  reason: collision with root package name */
    public static final String f143111a = "IS_PRIVACY_PROMOTION_SHOWN";

    /* renamed from: b  reason: collision with root package name */
    public static final is f143112b = new is();

    private is() {
    }

    static {
        Covode.recordClassIndex(93681);
        c();
    }

    public static final boolean a() {
        boolean z = Keva.getRepo("video_gift_settings_keva_repo").getBoolean(a("vgc_visiting_first_time"), true);
        a a2 = c.a();
        if (a2 == null || !a2.f78474a || !z) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(a("vgv_is_new_user_account"), true);
    }

    public static final void c() {
        boolean z;
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        if (curUser != null) {
            curUser.getRegisterTime();
            if ((System.currentTimeMillis() / 1000) - curUser.getRegisterTime() < 2592000) {
                z = true;
            } else {
                z = false;
            }
            Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(a("vgv_is_new_user_account"), z);
        }
    }

    public static final void a(boolean z) {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(a("vgc_accept_gifting"), z);
    }

    public static String a(String str) {
        String str2;
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        if (curUser == null) {
            return str;
        }
        String uniqueId = curUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            str2 = curUser.getShortId();
        } else {
            str2 = curUser.getUniqueId();
        }
        return str + "_" + str2;
    }
}
