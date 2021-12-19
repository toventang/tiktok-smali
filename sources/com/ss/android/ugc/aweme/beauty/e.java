package com.ss.android.ugc.aweme.beauty;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.tools.beauty.e.a;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f68629a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final SharedPreferences f68630b;

    private e() {
    }

    static {
        SharedPreferences sharedPreferences;
        Covode.recordClassIndex(42232);
        Context context = a.f138912b;
        if (context != null) {
            sharedPreferences = d.a(context, "beauty_params", 0);
        } else {
            sharedPreferences = null;
        }
        f68630b = sharedPreferences;
    }

    private static String b(int i2, String str) {
        return "beauty_params_max" + i2 + str;
    }

    public static final float a(int i2, String str) {
        l.d(str, "");
        SharedPreferences sharedPreferences = f68630b;
        float f2 = -1.0f;
        if (sharedPreferences != null) {
            float f3 = sharedPreferences.getFloat(b(i2, str), -1.0f);
            if (f3 != -1.0f) {
                return f3;
            }
        }
        if (!l.a((Object) str, (Object) "0")) {
            if (sharedPreferences != null) {
                f2 = sharedPreferences.getFloat(b(i2, "0"), -1.0f);
            }
        } else if (sharedPreferences != null) {
            f2 = sharedPreferences.getFloat(b(i2, "2"), -1.0f);
        }
        return f2;
    }
}
