package com.ss.android.ugc.aweme.effect;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.io.File;
import java.lang.reflect.Field;

public class EffectCompatJobService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f88742a = 190806;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f88743b;

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return 2;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    static {
        Covode.recordClassIndex(55828);
    }

    static final /* synthetic */ Object a() {
        try {
            AVExternalServiceImpl.a().configService().cacheConfig().clearDraftEffectCache();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String effectCacheDir = AVExternalServiceImpl.a().configService().cacheConfig().effectCacheDir();
        if (TextUtils.isEmpty(effectCacheDir) || new File(effectCacheDir).list() == null || new File(effectCacheDir).list().length == 0) {
            return false;
        }
        i.b(e.f88942a, g.a()).c(new f(this, jobParameters), i.f4826c);
        return true;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3156);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(3156);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
