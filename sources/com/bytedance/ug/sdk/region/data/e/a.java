package com.bytedance.ug.sdk.region.data.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class a {
    static {
        Covode.recordClassIndex(27893);
    }

    public static String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return d.a(context, "bd_region_data_sdk", 0).getString(str, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        if (context == null) {
            return false;
        }
        try {
            d.a(context, "bd_region_data_sdk", 0).edit().putString(str, str2).apply();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
