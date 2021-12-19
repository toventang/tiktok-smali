package com.ss.android.ugc.aweme.notification.utils;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;

public final class k {
    static {
        Covode.recordClassIndex(73236);
    }

    public static void a(Context context) {
        SmartRouter.buildRoute(context, "aweme://check_profile").open();
    }

    public static void a(Context context, String str, String str2, String str3) {
        SmartRouter.buildRoute(context, "aweme://challenge/detail/").withParam("cid", str).withParam("enter_from", str2).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("process_id", str3).open();
    }

    public static void a(Context context, String str, String str2, String str3, int i2) {
        t.a(t.a(), (Activity) context, u.a("aweme://aweme/detail/".concat(String.valueOf(str))).a("profile_enterprise_type", i2).a("cid", str3).a("refer", str2).a("video_from", "from_launch_forward").f71178a.a());
    }
}
