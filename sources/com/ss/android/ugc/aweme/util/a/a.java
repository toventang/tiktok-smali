package com.ss.android.ugc.aweme.util.a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class a {
    static {
        Covode.recordClassIndex(93187);
    }

    public static SharedPreferences a() {
        return d.a(com.bytedance.ies.ugc.appcontext.d.a(), "video_view_count_sp", 0);
    }

    public static SharedPreferences.Editor b() {
        return a().edit();
    }

    public static boolean c() {
        return a().getBoolean("has_reported_viewed_50_many_days", false);
    }

    public static void a(int i2) {
        b().putInt("one_day_viewed_count", i2).apply();
    }
}
