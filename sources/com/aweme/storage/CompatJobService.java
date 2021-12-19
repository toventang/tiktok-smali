package com.aweme.storage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;

public class CompatJobService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f5917a;

    static {
        Covode.recordClassIndex(2785);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return 2;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        i.b(new Callable<String>() {
            /* class com.aweme.storage.CompatJobService.AnonymousClass3 */

            static {
                Covode.recordClassIndex(2788);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ String call() {
                c.c(CompatJobService.this);
                return null;
            }
        }, g.a()).c(new b.g<String, String>() {
            /* class com.aweme.storage.CompatJobService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(2787);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ String then(i<String> iVar) {
                c.d(CompatJobService.this);
                return null;
            }
        }, i.f4826c).b((b.g) new b.g<String, i<String>>() {
            /* class com.aweme.storage.CompatJobService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2786);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ i<String> then(i<String> iVar) {
                CompatJobService.this.jobFinished(jobParameters, false);
                CompatJobService.f5917a = false;
                return null;
            }
        });
        return true;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11003);
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
                    MethodCollector.o(11003);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
