package com.ss.android.ugc.aweme.shortvideo.v;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d extends Throwable {
    static {
        Covode.recordClassIndex(86723);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_publisher_ChildrenModeException_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super("ChildrenModeNotAllowPublish");
        l.d(str, "");
        com_ss_android_ugc_aweme_shortvideo_publisher_ChildrenModeException_com_ss_android_ugc_aweme_lancet_LogLancet_d("aweme-publish", "block publish process in stage: " + str + ", reason: child mode publish not allowed.");
    }
}
