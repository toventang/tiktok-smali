package com.ss.android.ugc.aweme.common;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(47162);
    }

    public static final int a(Context context) {
        ContentResolver contentResolver;
        if (context != null) {
            try {
                contentResolver = context.getContentResolver();
            } catch (Exception unused) {
                return -1;
            }
        } else {
            contentResolver = null;
        }
        return Settings.System.getInt(contentResolver, "screen_brightness");
    }
}
