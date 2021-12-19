package com.bytedance.platform.godzilla.b.c;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.c.e;
import java.util.Locale;

public final class b extends e {
    static {
        Covode.recordClassIndex(25650);
    }

    @Override // com.bytedance.platform.godzilla.c.a
    public final String b() {
        return "OppoMessageNPEPlugin";
    }

    @Override // com.bytedance.platform.godzilla.c.e
    public final boolean c() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 22 || i2 == 21) {
            try {
                String str = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).contains("oppo")) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.platform.godzilla.a.h
    public final boolean a(Thread thread, Throwable th) {
        if (th instanceof NullPointerException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("android.os.Message".equals(stackTraceElement.getClassName()) && "toString".equals(stackTraceElement.getMethodName())) {
                    g.a(g.a.ERROR);
                    return true;
                }
            }
        }
        return false;
    }
}
