package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtFollowButtonStyleSetting;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(12925);
    }

    public static String a() {
        if (LiveMtFollowButtonStyleSetting.INSTANCE.getValue() != 1) {
            return "ttlive_user_info_follow_complete.webp";
        }
        if (y.g()) {
            return "ttlive_lottie_anim_follow_tick_rtl.webp";
        }
        return "ttlive_lottie_anim_follow_tick.webp";
    }
}
