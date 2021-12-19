package com.ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class b {
    static {
        Covode.recordClassIndex(69810);
    }

    static void a() {
        Bundle bundle = new Bundle();
        bundle.putInt("user_mode", 0);
        bundle.putInt("user_period", 0);
        AppLog.setCustomerHeader(bundle);
        b();
    }

    static void b() {
        try {
            Field declaredField = q.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            ((ConcurrentHashMap) declaredField.get(null)).remove("account_region");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
