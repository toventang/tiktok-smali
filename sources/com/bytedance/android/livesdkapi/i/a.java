package com.bytedance.android.livesdkapi.i;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23248a = true;

    static {
        Covode.recordClassIndex(13821);
    }

    public static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context) {
        Method method;
        a(context, "live-app-core-sdk", 0);
        a(context, "ttlive_live_user", 0);
        a(context, "live_fans_comment_guide", 0);
        a(context, "live_fans_club_tips", 0);
        a(context, "extra_group", 0);
        a(context, "pay_controll", 4);
        a(context, "ttlive_sdk_shared_pref_cache", 4);
        Class<?> a2 = a("com.bytedance.android.livesdk.i18n.I18nDbManager");
        if (a2 != null) {
            if (context != null) {
                try {
                    method = a2.getDeclaredMethod("prepareInit", Context.class);
                    method.setAccessible(true);
                    method.invoke(null, context);
                } catch (Exception unused) {
                    return;
                }
            } else {
                method = a2.getDeclaredMethod("prepareInit", new Class[0]);
                method.setAccessible(true);
                method.invoke(null, new Object[0]);
            }
            method.setAccessible(false);
        }
    }

    private static void a(Context context, String str, int i2) {
        if (context != null && str.length() > 0) {
            d.a(context, str, i2);
        }
    }
}
