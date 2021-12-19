package com.bytedance.apm.q;

import android.content.Context;
import com.bytedance.apm.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.Properties;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static Properties f25280a;

    static {
        Covode.recordClassIndex(14717);
    }

    public static String a() {
        return String.valueOf(a("release_build"));
    }

    private static Object a(String str) {
        Context context = c.f24685a;
        if (f25280a == null) {
            Properties properties = new Properties();
            f25280a = properties;
            try {
                Context applicationContext = context.getApplicationContext();
                if (a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = a.f107166a;
                    }
                }
                properties.load(applicationContext.getAssets().open("slardar.properties"));
            } catch (Throwable unused) {
            }
        }
        try {
            if (f25280a.containsKey(str)) {
                return f25280a.get(str);
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
