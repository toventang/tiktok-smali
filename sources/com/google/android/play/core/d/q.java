package com.google.android.play.core.d;

import android.content.Context;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static ThreadPoolExecutor f53217a;

    static {
        Covode.recordClassIndex(32891);
    }

    public static Context a(Context context) {
        Context b2 = b(context);
        return b2 != null ? b2 : context;
    }

    public static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static Executor a() {
        MethodCollector.i(10164);
        if (f53217a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c());
            f53217a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        ThreadPoolExecutor threadPoolExecutor2 = f53217a;
        MethodCollector.o(10164);
        return threadPoolExecutor2;
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }
}
