package com.ss.android.ugc.aweme.shortvideo.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f128626a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(84324);
    }

    public static final boolean b() {
        if (d() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        if (d() == 3) {
            return true;
        }
        return false;
    }

    private static int d() {
        return b.a().a(true, "expand_the_character_limit_of_video_caption_from_150_to_500", 0);
    }

    private static boolean e() {
        if (d() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean a() {
        if (e() || b() || c()) {
            return false;
        }
        return true;
    }
}
