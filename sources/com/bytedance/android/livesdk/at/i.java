package com.bytedance.android.livesdk.at;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f14151a = "low_age_storage";

    static {
        Covode.recordClassIndex(7841);
    }

    private static long a(Context context, String str) {
        return d.a(context, "low_age_storage", 0).getLong(str, 0);
    }

    public static boolean b(Context context, String str, long j2) {
        if (j2 == a(context, str)) {
            return true;
        }
        return false;
    }

    public static void a(Context context, String str, long j2) {
        SharedPreferences.Editor edit = d.a(context, "low_age_storage", 0).edit();
        edit.putLong(str, j2);
        edit.commit();
    }
}
