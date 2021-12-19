package com.ss.android.ugc.aweme.profile.ui.v2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f117303a = new y();

    private y() {
    }

    public static void a(String str, String str2, User user) {
        l.d(str, "");
        l.d(str2, "");
        if (user != null) {
            r.a("show_link", new d().a("enter_from", str).a("link_type", str2).a("link", a(user, str2)).a("scene_id", "1008").a("author_id", user.getUid()).f66730a);
        }
    }

    public static void a(String str, String str2, Integer num, Integer num2, String str3) {
        d a2 = new d().a("EVENT_ORIGIN_FEATURE", "TEMAI").a("page_name", "others_homepage");
        if (str == null || str.length() <= 0) {
            str = "unknown";
        }
        d a3 = a2.a("previous_page", str).a("author_id", str2).a("is_self", num).a("follow_status", num2);
        if (!TextUtils.isEmpty(str3)) {
            a3.a("show_window_source", str3);
        }
        r.a("tiktokec_showcase_entrance_show", a3.f66730a);
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("profile_set_user_data", new d().a("enter_from", str).a(StringSet.type, str3).a("to_user_id", str2).f66730a);
    }

    static {
        Covode.recordClassIndex(75806);
    }

    public static void a() {
        r.a("show_profile_bio_hint", new d().f66730a);
    }

    public static String a(User user) {
        l.d(user, "");
        if (in.g(user)) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public static void b(String str) {
        if (z.a(str)) {
            r.a("enter_personal_homepage", new d().a("tab_name", str).f66730a);
        }
    }

    public static void c(String str) {
        l.d(str, "");
        r.a("click_private_guide_pop_up", new d().a("enter_from", "personal_homepage").a("action_type", str).f66730a);
    }

    public static void a(String str) {
        l.d(str, "");
        r.a("click_live_event_icon", new d().a("enter_from", "personal_homepage").a("action_type", str).f66730a);
    }

    private static String a(User user, String str) {
        if (l.a((Object) str, (Object) "weblink")) {
            return user.getBioUrl();
        }
        return user.getBioEmail();
    }

    public static void a(String str, d dVar) {
        l.d(str, "");
        if (dVar != null) {
            r.a("profile_edit_status", dVar.a("event_type", str).f66730a);
        }
    }

    public static void a(String str, User user) {
        l.d(str, "");
        if (user != null) {
            r.a("click_link", new d().a("enter_from", a(user)).a("link_type", str).a("author_id", user.getUid()).a("link", a(user, str)).f66730a);
        }
    }

    public static void a(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("follow_request_pop_up_response", new d().a("to_user_id", str2).a("enter_from", str).a("action_type", i2).f66730a);
    }

    public static void a(String str, int i2, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        r.a("change_notification_preference", new d().a("enter_from", str).a("follow_status", i2).a("to_user_id", str2).a("previous_page", str3).a("to_status", str4).f66730a);
    }

    public static void a(String str, String str2, int i2, String str3, boolean z) {
        String str4;
        l.d(str2, "");
        l.d(str3, "");
        d a2 = new d().a("enter_from", str3).a("live_event_id", str).a("live_event_cnt", i2);
        if (z) {
            str4 = "0";
        } else {
            str4 = "1";
        }
        r.a("livesdk_live_event_card", a2.a("is_free_event", str4).a("action_type", str2).f66730a);
    }
}
