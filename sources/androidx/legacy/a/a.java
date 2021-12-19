package androidx.legacy.a;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public abstract class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f3467a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static int f3468b = 1;

    static {
        Covode.recordClassIndex(1270);
    }

    public static boolean a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f3467a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock == null) {
                return true;
            }
            wakeLock.release();
            sparseArray.remove(intExtra);
            return true;
        }
    }

    public static ComponentName a(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f3467a;
        synchronized (sparseArray) {
            int i2 = f3468b;
            int i3 = i2 + 1;
            f3468b = i3;
            if (i3 <= 0) {
                f3468b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i2);
            ComponentName b2 = b(context, intent);
            if (b2 == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) a(context, "power")).newWakeLock(1, "androidx.core:wake:" + b2.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            sparseArray.put(i2, newWakeLock);
            return b2;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName b(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.legacy.a.a.b(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
