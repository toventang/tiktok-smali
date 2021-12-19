package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class ht {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f143075a;

    static {
        Covode.recordClassIndex(93646);
        Field field = null;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                field = Class.forName("android.text.TextLine").getDeclaredField("sCached");
                field.setAccessible(true);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        f143075a = field;
    }
}
