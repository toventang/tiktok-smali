package com.ss.android.ugc.aweme.setting;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public class TiktokSkinHelper {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f122007a;

    static {
        Covode.recordClassIndex(79980);
    }

    public static void a(Resources resources) {
        if (f122007a) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.uiMode & 48) != 16) {
                configuration.uiMode = (configuration.uiMode & -49) | 16;
                resources.updateConfiguration(configuration, null);
                b(resources);
            }
        }
    }

    private static void b(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 26) {
            try {
                Method declaredMethod = Class.forName("androidx.appcompat.app.ResourcesFlusher").getDeclaredMethod("flush", Resources.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, resources);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
