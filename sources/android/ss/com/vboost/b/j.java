package android.ss.com.vboost.b;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Timer;
import java.util.TimerTask;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static Vibrator f449a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f450b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final String f451c = j.class.getSimpleName();

    public static void a() {
        Vibrator vibrator = f449a;
        if (vibrator != null) {
            f450b = true;
            vibrator.cancel();
        }
    }

    static {
        Covode.recordClassIndex(24);
    }

    public static String a(String str) {
        try {
            File file = new File(str);
            FileReader fileReader = new FileReader(file);
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "utf-8");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int read = inputStreamReader.read();
                if (read != -1) {
                    stringBuffer.append((char) read);
                } else {
                    fileReader.close();
                    inputStreamReader.close();
                    return stringBuffer.toString();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void a(float f2) {
        if (f449a != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                int i2 = (int) (255.0f * f2);
                long j2 = (long) (f2 * 300.0f);
                if (i2 > 0) {
                    if (i2 > 255) {
                        i2 = 255;
                    }
                    f449a.vibrate(VibrationEffect.createOneShot(j2, i2));
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                long j3 = (long) (f2 * 90.0f);
                f449a.vibrate(new long[]{5, j3, 5, j3}, 2);
                new Timer().schedule(new TimerTask() {
                    /* class android.ss.com.vboost.b.j.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(25);
                    }

                    public final void run() {
                        j.f449a.cancel();
                    }
                }, 300);
            }
        }
    }

    public static Object a(Context context, String str) {
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

    public static void a(float f2, float f3) {
        if (f449a != null) {
            int i2 = (int) f3;
            if (Build.VERSION.SDK_INT >= 26) {
                int i3 = (int) (f2 * 255.0f);
                if (i3 > 0) {
                    if (i3 > 255) {
                        i3 = 255;
                    }
                    f449a.vibrate(VibrationEffect.createOneShot((long) i2, i3));
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                long j2 = (long) (f2 * 90.0f);
                f449a.vibrate(new long[]{5, j2, 5, j2}, 2);
                new Timer().schedule(new TimerTask() {
                    /* class android.ss.com.vboost.b.j.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(26);
                    }

                    public final void run() {
                        j.f449a.cancel();
                    }
                }, (long) i2);
            }
        }
    }
}
