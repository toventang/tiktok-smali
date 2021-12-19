package com.ss.android.ugc.aweme.friends.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.ez;
import com.ss.android.ugc.aweme.experiment.fj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.c.a;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.eu;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f96834a = new a();

    private a() {
    }

    public static void a(String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        String b2 = b(str);
        r.a("find_friends", new d().a("enter_from", "find_friends_page").a("platform", str).a("previous_page", str2).a("is_auth", z ? 1 : 0).a("did_status", b2).a("uid_status", c(str)).f66730a);
    }

    public static /* synthetic */ void a(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, Map map, int i2) {
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        if ((i2 & 256) != 0) {
            map = null;
        }
        a(str, str2, str3, z, z2, str4, str5, str6, map);
    }

    public static void a(String str, boolean z) {
        l.d(str, "");
        r.a("authorize_contact_response", new d().a("is_allow", Boolean.valueOf(z)).a("enter_from", str).a("pop_up_type", "guide").f66730a);
    }

    public static void a(String str, boolean z, boolean z2) {
        String str2;
        l.d(str, "");
        d dVar = new d();
        if (z) {
            str2 = "guide";
        } else {
            str2 = "authorize";
        }
        r.a("show_authorize_reminder", dVar.a("pop_up_type", str2).a("enter_from", str).a("is_allow", Boolean.valueOf(z2)).f66730a);
    }

    public static void a(String str, boolean z, boolean z2, boolean z3) {
        String str2;
        l.d(str, "");
        d dVar = new d();
        if (z) {
            str2 = "guide";
        } else {
            str2 = "authorize";
        }
        r.a("authorize_contact_response", dVar.a("pop_up_type", str2).a("enter_from", str).a("deny_type", !z3 ? 1 : 0).a("is_allow", Boolean.valueOf(z2)).f66730a);
    }

    public static void b(String str, boolean z, boolean z2) {
        String str2;
        l.d(str, "");
        d dVar = new d();
        if (z) {
            str2 = "guide";
        } else {
            str2 = "authorize";
        }
        r.a("authorize_contact_response", dVar.a("pop_up_type", str2).a("enter_from", str).a("is_allow", Boolean.valueOf(z2)).f66730a);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        d a2 = new d().a("enter_from", str).a("pop_up_type", str2).a("platform", str3).a("did_status", str5).a("uid_status", str6).a("enter_method", str4);
        if (map != null) {
            a2.a(map);
        }
        fj a3 = ez.a();
        if (a3 == null || a3.f90050d != 0) {
            l.b(a2, "");
            a(a2, str);
        }
        r.a("show_authorize_pop_up", a2.f66730a);
    }

    public static void a(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, Map<String, String> map) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        d a2 = new d().a("enter_from", str).a("pop_up_type", str2).a("is_allow", Boolean.valueOf(z)).a("platform", str3).a("did_status", str5).a("uid_status", str6).a("enter_method", str4);
        if (!z && l.a((Object) str2, (Object) "system")) {
            a2.a("deny_type", !z2 ? 1 : 0);
        }
        if (map != null) {
            a2.a(map);
        }
        fj a3 = ez.a();
        if (a3 == null || a3.f90050d != 0) {
            l.b(a2, "");
            a(a2, str);
        }
        r.a("click_authorize_pop_up", a2.f66730a);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, int i2, Integer num, Integer num2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        d a2 = new d().a("enter_from", str).a("pop_up_type", str2).a("platform", str3).a("auth_type", str4).a("enter_method", str5).a("sync_type", str6).a("has_uid_errorcode", 1).a("retry", i2);
        if (num != null) {
            a2.a("has_token", num.intValue());
        }
        if (num2 != null) {
            a2.a("has_fbsdk_errorcode", num2.intValue());
        }
        fj a3 = ez.a();
        if (a3 == null || a3.f90050d != 0) {
            l.b(a2, "");
            a(a2, str);
        }
        r.a("authorize_fail_after_allow", a2.f66730a);
    }

    static {
        Covode.recordClassIndex(61444);
    }

    public static String a() {
        if (c.b.f141662a.a()) {
            return "on";
        }
        return "off";
    }

    public static String b() {
        if (c.a.f141661a.a()) {
            return "on";
        }
        return "off";
    }

    public static void c() {
        r.a("invite_card_show", new d().a("enter_from", "find_friends_page").f66730a);
    }

    public static void d() {
        r.a("friend_list_notify_show", new d().a("enter_from", "find_friends_page").f66730a);
    }

    public static void a(String str) {
        l.d(str, "");
        r.a("invite_friends", new d().a("enter_from", str).f66730a);
    }

    private static String c(String str) {
        boolean a2;
        if (str.hashCode() == 497130182 && str.equals("facebook")) {
            a2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.g().a();
        } else {
            a2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.d().a();
        }
        if (a2) {
            return "on";
        }
        return "off";
    }

    private static String b(String str) {
        if (str.hashCode() == 497130182 && str.equals("facebook")) {
            com.ss.android.ugc.aweme.friends.d g2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.g();
            IAccountUserService g3 = b.g();
            l.b(g3, "");
            User curUser = g3.getCurUser();
            l.b(curUser, "");
            if (g2.a(curUser.getUid()).length() > 0) {
                return "on";
            }
            return "off";
        }
        boolean b2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.d().b();
        boolean a2 = com.bytedance.ies.powerpermissions.b.a.a("android.permission.READ_CONTACTS");
        if (b2) {
            return "on";
        }
        if (a2) {
            return "off";
        }
        return "unknown";
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        r.a("invite_share_panel_show", linkedHashMap);
    }

    public static String b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (l.a((Object) str, (Object) "on")) {
            return "uid";
        }
        if (l.a((Object) str2, (Object) "off")) {
            return "both";
        }
        return "did";
    }

    public static void d(String str, boolean z) {
        String str2;
        l.d(str, "");
        d a2 = new d().a("enter_from", "find_friends_page");
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        r.a("click_auth_card", a2.a("is_auth", str2).a("platform", str).f66730a);
    }

    private static void a(d dVar, String str) {
        int currentTimeMillis;
        String str2;
        int i2 = a.C3111a.a().f120367a.getInt("contact_pop_up_count", 0);
        long j2 = a.C3111a.a().f120367a.getLong("last_show_contact_time", 0);
        if (j2 == 0) {
            currentTimeMillis = 0;
        } else {
            currentTimeMillis = (int) ((System.currentTimeMillis() - j2) / 86400000);
        }
        dVar.a("show_index", i2).a("time_int", currentTimeMillis);
        if (l.a((Object) str, (Object) "following_list") || l.a((Object) str, (Object) "follower_list")) {
            if (a.C3111a.a().f120367a.getBoolean("is_my_self", false)) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            dVar.a("previous_page", str2);
        }
    }

    public static void c(String str, boolean z) {
        String str2;
        l.d(str, "");
        d dVar = new d();
        if (z) {
            str2 = "guide";
        } else {
            str2 = "authorize";
        }
        r.a("show_authorize_contact_pop_up", dVar.a("pop_up_type", str2).a("enter_from", str).f66730a);
    }

    public static void b(String str, boolean z) {
        l.d(str, "");
        r.a("authorize_user_contact", new d().a("is_allow", Boolean.valueOf(z)).a("enter_from", str).f66730a);
    }

    public static void b(String str, String str2, boolean z) {
        String str3;
        l.d(str, "");
        l.d(str2, "");
        String b2 = b(str);
        String c2 = c(str);
        d a2 = new d().a("enter_from", "find_friends_page").a("platform", str);
        if (z) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        r.a("authorize_card_show", a2.a("is_auth", str3).a("previous_page", str2).a("did_status", b2).a("uid_status", c2).f66730a);
    }

    public static void c(User user, int i2, String str, String str2) {
        String str3;
        l.d(str, "");
        l.d(str2, "");
        if (user != null) {
            if (user.getFollowerStatus() == 0) {
                str3 = "null";
            } else {
                str3 = "single";
            }
            r.a("follow_cancel", new d().a("enter_from", "find_friends_page").a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("relation_type", user.getFriendTypeStr()).a("tab_name", str2).a("follow_type", str3).a("enter_method", "follow_button").a("to_user_id", user.getUid()).a("req_id", user.getRequestId()).a("impr_order", i2).a("section", str).f66730a);
        }
    }

    public static void d(User user, int i2, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (user != null) {
            d a2 = new d().a("enter_from", "find_friends_page").a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("to_user_id", user.getUid()).a("impr_order", i2).a("tab_name", str2).a("req_id", user.getRequestId()).a("section", str);
            l.b(a2, "");
            r.a("enter_personal_detail", eu.a(a2, user).f66730a);
        }
    }

    public static void a(User user, int i2, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (user != null) {
            r.a("show_recommend_user_cell", new d().a("enter_from", "find_friends_page").a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("impr_order", i2).a("req_id", user.getRequestId()).a("relation_type", user.getFriendTypeStr()).a("tab_name", str2).a("section", str).f66730a);
        }
    }

    public static void b(User user, int i2, String str, String str2) {
        String str3;
        l.d(str, "");
        l.d(str2, "");
        if (user != null) {
            if (user.getFollowerStatus() == 0) {
                str3 = "single";
            } else {
                str3 = "mutual";
            }
            r.a("follow", new d().a("enter_from", "find_friends_page").a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("follow_type", str3).a("enter_method", "follow_button").a("to_user_id", user.getUid()).a("tab_name", str2).a("impr_order", i2).a("req_id", user.getRequestId()).a("section", str).f66730a);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        User curUser;
        String uid;
        String str5 = "";
        l.d(str, str5);
        l.d(str2, str5);
        d dVar = new d();
        IAccountUserService g2 = b.g();
        if (!(g2 == null || (curUser = g2.getCurUser()) == null || (uid = curUser.getUid()) == null)) {
            str5 = uid;
        }
        Map<String, String> map = dVar.a("from_user_id", str5).a("platform", str2).a("enter_from", str).f66730a;
        if (str3 != null) {
            map.put("enter_method", str3);
        }
        if (str4 != null) {
            map.put("url", str4);
        }
        r.a("invite_via", map);
    }

    public static void b(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        d a2 = new d().a("enter_from", str).a("pop_up_type", str2).a("platform", str3).a("auth_type", str5).a("sync_type", str6).a("enter_method", str4);
        if (map != null) {
            a2.a(map);
        }
        fj a3 = ez.a();
        if (a3 == null || a3.f90050d != 0) {
            l.b(a2, "");
            a(a2, str);
        }
        r.a("authorize_finish", a2.f66730a);
    }
}
