package com.bytedance.android.livesdk.ah;

import android.content.Context;
import android.os.Build;
import androidx.c.g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final g<String, Integer> f13720a;

    static {
        Covode.recordClassIndex(7623);
        g<String, Integer> gVar = new g<>(8);
        f13720a = gVar;
        gVar.put("android.permission.READ_EXTERNAL_STORAGE", 16);
    }

    private static boolean a(Context context, String str) {
        try {
            if (androidx.core.content.c.a(context, str) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
        }
    }

    public static boolean a(Context context, String... strArr) {
        for (String str : strArr) {
            Integer num = f13720a.get(str);
            if ((num == null || Build.VERSION.SDK_INT >= num.intValue()) && !a(context, str)) {
                return false;
            }
        }
        return true;
    }
}
