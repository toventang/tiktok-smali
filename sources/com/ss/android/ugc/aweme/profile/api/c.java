package com.ss.android.ugc.aweme.profile.api;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.c.b;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.utils.em;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f116006a = (b.f59141e + "/aweme/v1/user/");

    /* renamed from: b  reason: collision with root package name */
    private static boolean f116007b = true;

    public static String a(boolean z) {
        return z ? "/aweme/v1/user/profile/self/" : "/aweme/v1/user/profile/other/";
    }

    static {
        Covode.recordClassIndex(74809);
    }

    private static boolean a() {
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (!ae.f115954a.needShowCompleteProfileGuideBar() || repo.getBoolean(h.a("profile_page_complete_profile_guide_bar_has_click_close"), false) || repo.getInt(h.a("profile_page_complete_profile_guide_bar_show_times"), 0) >= 3 || System.currentTimeMillis() - repo.getLong(h.a("profile_page_complete_profile_guide_bar_last_show_time"), 0) <= 2592000000L) {
            return false;
        }
        return true;
    }

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static UserResponse a(String str, String str2) {
        return (UserResponse) com.ss.android.ugc.aweme.profile.service.h.f116622a.apiExecuteGetJSONObject(str, UserResponse.class, "", true, str2);
    }

    public static String b(String str, String str2) {
        return a(str, str2, null, 0, true);
    }

    public static User a(String str, boolean z, String str2) {
        String str3;
        g gVar = new g(str);
        if (f116007b) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        gVar.a("is_cold_start", str3);
        f116007b = false;
        return (User) com.ss.android.ugc.aweme.profile.service.h.f116622a.apiExecuteGetJSONObject(gVar.toString(), User.class, "user", z, str2);
    }

    public static String a(String str, String str2, int i2, Boolean bool) {
        return a(str, str2, null, i2, bool);
    }

    public static String a(String str, String str2, String str3, int i2, Boolean bool) {
        int i3;
        Uri.Builder buildUpon = Uri.parse(b.f59141e).buildUpon();
        String curUserId = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
        String curSecUserId = com.ss.android.ugc.aweme.account.b.g().getCurSecUserId();
        String uniqueId = com.ss.android.ugc.aweme.account.b.g().getCurUser().getUniqueId();
        if ((!TextUtils.isEmpty(str2) && TextUtils.equals(curUserId, str2)) || ((!TextUtils.isEmpty(str) && TextUtils.equals(curSecUserId, str)) || (!TextUtils.isEmpty(str3) && TextUtils.equals(uniqueId, str3)))) {
            buildUpon.path(a(true));
            if (a()) {
                buildUpon.appendQueryParameter("need_pv", "true");
            }
        } else if (!TextUtils.isEmpty(str)) {
            buildUpon.path(a(false)).appendQueryParameter("sec_user_id", str);
        } else if (!TextUtils.isEmpty(str2)) {
            buildUpon.path(a(false)).appendQueryParameter("user_id", str2);
        } else if (!TextUtils.isEmpty(str3)) {
            buildUpon.path(a(false)).appendQueryParameter("unique_id", str3);
        } else if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            buildUpon.path(a(true));
            if (a()) {
                buildUpon.appendQueryParameter("need_pv", "true");
            }
        } else {
            buildUpon.path(a(false));
        }
        if (bool.booleanValue() && e.b()) {
            buildUpon.appendQueryParameter("with_mutual", "true");
        }
        if (com.ss.android.ugc.aweme.account.b.g().isUidContactPermisioned()) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        buildUpon.appendQueryParameter("address_book_access", String.valueOf(i3));
        buildUpon.appendQueryParameter("from", String.valueOf(i2));
        if (buildUpon.toString().contains("/aweme/v1/user/profile/other/")) {
            int[] a2 = em.a(102);
            String str4 = a2[0] + "_" + a2[1];
            int[] a3 = em.a(700);
            buildUpon.appendQueryParameter("user_avatar_shrink", str4);
            buildUpon.appendQueryParameter("user_cover_shrink", a3[0] + "_" + a3[1]);
        }
        return buildUpon.toString();
    }
}
