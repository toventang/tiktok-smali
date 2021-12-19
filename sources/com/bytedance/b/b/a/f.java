package com.bytedance.b.b.a;

import android.app.Application;
import android.content.Context;
import com.bytedance.b.k.a;
import com.bytedance.covode.number.Covode;
import java.util.Properties;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static Properties f25978a;

    static {
        Covode.recordClassIndex(15140);
    }

    static Object a(String str) {
        Application application = a.f26313g;
        if (f25978a == null) {
            Properties properties = new Properties();
            f25978a = properties;
            try {
                Context applicationContext = application.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                properties.load(applicationContext.getAssets().open("slardar.properties"));
            } catch (Throwable unused) {
            }
        }
        try {
            if (f25978a.containsKey(str)) {
                return f25978a.get(str);
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
