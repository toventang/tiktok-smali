package com.ss.android.ugc.aweme.views;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f144709a = new s();

    private s() {
    }

    static {
        Covode.recordClassIndex(94660);
    }

    public static boolean a() {
        if (c() != 0) {
            return true;
        }
        return false;
    }

    private static int c() {
        return b.a().a(true, "video_caption_line_height", 0);
    }

    public static int b() {
        int c2 = c();
        if (c2 == 1) {
            return 20;
        }
        if (c2 != 2) {
            return 18;
        }
        return 22;
    }
}
