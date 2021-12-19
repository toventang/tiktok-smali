package com.ss.android.ugc.aweme.shortvideo.eventtrack;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class f {
    static {
        Covode.recordClassIndex(84239);
    }

    public static final void a(String str, int i2) {
        String str2;
        l.d(str, "");
        b a2 = new b().a("enter_from", "video_post_page").a("enter_method", str);
        if (i2 == 0) {
            str2 = "everyone";
        } else if (i2 == 2) {
            str2 = "friends";
        } else if (i2 == 1) {
            str2 = "private";
        } else {
            str2 = "empty";
        }
        r.a("show_audience_select_bottom_sheet", a2.a("default_choice", str2).f149193a);
    }
}
