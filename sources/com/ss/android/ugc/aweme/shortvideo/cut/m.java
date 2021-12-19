package com.ss.android.ugc.aweme.shortvideo.cut;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.tools.a;
import com.ss.android.ugc.tools.c;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static int f125468a = ((int) n.b(c.a(), 60.0f));

    /* renamed from: b  reason: collision with root package name */
    public static int f125469b = ((int) n.b(c.a(), 30.0f));

    /* renamed from: c  reason: collision with root package name */
    public static int f125470c = ((int) n.b(c.a(), 64.0f));

    /* renamed from: d  reason: collision with root package name */
    public static int f125471d = ((int) n.b(c.a(), 12.0f));

    /* renamed from: e  reason: collision with root package name */
    public static int f125472e = ((int) n.b(c.a(), 4.0f));

    /* renamed from: f  reason: collision with root package name */
    public static int f125473f = ((int) n.b(c.a(), 5.0f));

    /* renamed from: g  reason: collision with root package name */
    public static int f125474g = c.a().getResources().getDimensionPixelSize(R.dimen.a0v);

    /* renamed from: h  reason: collision with root package name */
    public static int f125475h = ((int) n.b(c.a(), 20.0f));

    static {
        Covode.recordClassIndex(82353);
    }

    public static void a(Context context) {
        Vibrator vibrator = (Vibrator) a(context, "vibrator");
        if (vibrator != null) {
            vibrator.vibrate(10);
        }
    }

    public static long a(long j2) {
        if (a.f149054l.f149066k.invoke().booleanValue()) {
            if (j2 > 300000) {
                return 300000;
            }
            return j2;
        } else if (a.f149054l.f149064i.invoke().booleanValue() || a.f149054l.f149066k.invoke().booleanValue()) {
            return Math.min(j2, a.f149054l.f149065j.invoke().longValue());
        } else {
            if (j2 > 15000) {
                return 15000;
            }
            return j2;
        }
    }

    public static i a(float f2) {
        if (f2 == i.EPIC.value()) {
            return i.EPIC;
        }
        if (f2 == i.SLOW.value()) {
            return i.SLOW;
        }
        if (f2 == i.NORMAL.value()) {
            return i.NORMAL;
        }
        if (f2 == i.FAST.value()) {
            return i.FAST;
        }
        if (f2 == i.LAPSE.value()) {
            return i.LAPSE;
        }
        return null;
    }

    public static void a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new ViewOutlineProvider() {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(82354);
                }

                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) ((int) n.b(c.a(), 2.0f)));
                }
            });
            view.setClipToOutline(true);
        }
    }

    public static float b(Context context, int i2) {
        return (float) ((dh.b(context) - (i2 * 2)) - (f125471d * 2));
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6832);
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
                    MethodCollector.o(6832);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(Context context, int i2) {
        Vibrator vibrator = (Vibrator) a(context, "vibrator");
        if (vibrator != null) {
            vibrator.vibrate((long) i2);
        }
    }

    public static float a(com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar, VideoSegment videoSegment, int i2, int i3) {
        return (((((float) videoSegment.d()) * 1.0f) / (videoSegment.f() * bVar.f125494e)) + ((float) i3)) - ((float) i2);
    }

    public static float a(Context context, com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar, float f2, VideoSegment videoSegment, int i2) {
        if (videoSegment.e() - videoSegment.d() == videoSegment.f125478b) {
            return (float) ((dh.b(context) - i2) - f125471d);
        }
        return f2 + ((float) f125471d) + (((float) (videoSegment.e() - videoSegment.d())) / (videoSegment.f() * bVar.f125494e));
    }
}
