package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

public final class ad {
    static {
        Covode.recordClassIndex(75144);
    }

    public static void a(String str) {
        r.a(str, new d().a("enter_from", "others_homepage").f66730a);
    }

    public static void b(String str) {
        r.a("block_confirm", new d().a("enter_from", "others_homepage").a("target", str).f66730a);
    }

    public static void a(String str, int i2, boolean z) {
        r.a("show_message_button", new d().a("enter_from", "others_homepage").a("user_id", str).a("follow_status", i2).a("enter_method", "button").a("is_enterprise", z ? 1 : 0).f66730a);
    }

    public static void a(String str, String str2, Boolean bool) {
        String str3;
        d a2 = new d().a("from_user_id", str).a("rec_type", str2);
        if (bool.booleanValue()) {
            str3 = "follow";
        } else {
            str3 = "click";
        }
        r.a("spread_follow_card", a2.a("enter_method", str3).f66730a);
    }
}
