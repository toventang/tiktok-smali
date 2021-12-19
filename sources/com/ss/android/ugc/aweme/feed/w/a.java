package com.ss.android.ugc.aweme.feed.w;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.fy;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;

public final class a {
    static {
        Covode.recordClassIndex(60311);
    }

    private static String a(String str) {
        if (fy.b()) {
            return "super_account";
        }
        return str;
    }

    public static void a(User user) {
        r.a("follow", new d().a("to_user_id", user.getUid()).a("enter_from", "homepage_follow").a("enter_type", "card").a("trigger_reason", "cold_launch").a("rec_reason", a(user.getRecommendReason())).f66730a);
    }

    public static void b(User user) {
        r.a("follow_cancel", new d().a("to_user_id", user.getUid()).a("enter_from", "homepage_follow").a("enter_type", "card").a("trigger_reason", "cold_launch").a("rec_reason", a(user.getRecommendReason())).f66730a);
    }

    public static void a(String str, User user) {
        r.a("enter_personal_detail", ac.a(new d().a("to_user_id", user.getUid()).a("relation_tag", user.getFollowStatus()).a("enter_from", "homepage_follow").a("enter_type", "card").a("trigger_reason", "cold_launch").a("rec_reason", a(user.getRecommendReason())).a("log_pb", ac.a.f91473a.a(str)).f66730a));
    }

    public static void a(User user, String str, int i2, String str2, String str3) {
        r.a("follow_card", new d().a("rec_uid", user.getUid()).a("enter_from", "homepage_follow").a("event_type", str).a("impr_order", i2).a("req_id", str2).a("trigger_reason", str3).a("rec_reason", a(user.getRecommendReason())).f66730a);
    }
}
