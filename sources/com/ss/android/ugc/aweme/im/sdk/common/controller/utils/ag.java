package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.j;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static final ag f102379a = new ag();

    private ag() {
    }

    static {
        Covode.recordClassIndex(65535);
    }

    public static void a(String str) {
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(d.a(), "aweme://user/profile/").withParam("uid", str).withParam("sec_user_id", j.a(str)).withParam("extra_previous_page_position", "card_head").withParam("previous_page", "message").withParam("enter_from", "chat").withParam("extra_from_pre_page", "message").open();
        }
    }

    public static void a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            a(str);
        } else {
            SmartRouter.buildRoute(d.a(), "aweme://user/profile/").withParam("uid", str).withParam("sec_user_id", str2).withParam("previous_page_position", "other_places").withParam("previous_page", "message").withParam("enter_from", "chat").open();
        }
    }

    public static void b(String str, String str2) {
        SmartRouter.buildRoute(d.a(), "aweme://user/profile/").withParam("uid", str).withParam("sec_user_id", j.a(str)).withParam("previous_page_position", "other_places").withParam("extra_from_pre_page", str2).withParam("enter_from", str2).open();
    }
}
