package com.ss.android.ugc.aweme.setting.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f123042a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(80799);
    }

    public static int a() {
        return (b.a().a(true, "push_sound_type", 0) + 2) / 3;
    }

    public static boolean b() {
        int a2 = b.a().a(true, "push_sound_type", 0);
        if (a2 == 0 || a2 == 1 || a2 == 4 || a2 == 7) {
            return false;
        }
        return true;
    }

    public static String[] c() {
        int a2 = b.a().a(true, "push_sound_type", 0);
        if (a2 == 0) {
            return new String[0];
        }
        int i2 = a2 % 3;
        if (i2 == 2) {
            return new String[]{"comment_push", "follow_push", "digg_push", "im_push"};
        }
        if (i2 == 0) {
            return new String[]{"recommend_video_push", "follow_new_video_push", "live_push"};
        }
        return new String[0];
    }
}
