package com.ss.android.ugc.aweme.lancet.c;

import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f107192a;

    static {
        Covode.recordClassIndex(68570);
    }

    public static String a() {
        if (TextUtils.isEmpty(f107192a)) {
            try {
                Object obj = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread").call("getProcessName").get();
                if (obj != null && (obj instanceof String)) {
                    String str = (String) obj;
                    f107192a = str;
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        return f107192a;
    }
}
