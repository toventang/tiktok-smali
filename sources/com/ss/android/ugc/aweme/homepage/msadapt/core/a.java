package com.ss.android.ugc.aweme.homepage.msadapt.core;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.microsoft.device.display.DisplayMask;
import com.ss.android.ugc.aweme.lancet.i;
import h.a.n;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f99205a;

    /* renamed from: b  reason: collision with root package name */
    public static final C2425a f99206b = new C2425a((byte) 0);

    static {
        Covode.recordClassIndex(63203);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.core.a$a  reason: collision with other inner class name */
    public static final class C2425a {
        static {
            Covode.recordClassIndex(63204);
        }

        private C2425a() {
        }

        public /* synthetic */ C2425a(byte b2) {
            this();
        }

        private static Rect f(Context context) {
            l.d(context, "");
            Rect rect = new Rect();
            Object a2 = a(context, "window");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) a2).getDefaultDisplay().getRectSize(rect);
            return rect;
        }

        public static Rect a(Context context) {
            DisplayMask fromResourcesRectApproximation;
            l.d(context, "");
            if (!b(context) || (fromResourcesRectApproximation = DisplayMask.fromResourcesRectApproximation(context)) == null) {
                return null;
            }
            List<Rect> boundingRectsForRotation = fromResourcesRectApproximation.getBoundingRectsForRotation(e(context));
            if (boundingRectsForRotation.size() == 0) {
                return new Rect(0, 0, 0, 0);
            }
            return boundingRectsForRotation.get(0);
        }

        public static boolean b(Context context) {
            boolean z;
            boolean z2;
            l.d(context, "");
            if (a.f99205a == null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        z2 = packageManager.hasSystemFeature("com.microsoft.device.display.displaymask");
                    } else {
                        z2 = false;
                    }
                    z = Boolean.valueOf(z2);
                } catch (Exception unused) {
                    z = false;
                }
                a.f99205a = z;
            }
            Boolean bool = a.f99205a;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public static boolean d(Context context) {
            l.d(context, "");
            Rect a2 = a(context);
            Rect f2 = f(context);
            if (a2 == null || f2.width() <= 0 || f2.height() <= 0) {
                return false;
            }
            return a2.intersect(f2);
        }

        public static int e(Context context) {
            l.d(context, "");
            try {
                Object a2 = a(context, "window");
                if (a2 != null) {
                    Display defaultDisplay = ((WindowManager) a2).getDefaultDisplay();
                    l.b(defaultDisplay, "");
                    return defaultDisplay.getRotation();
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            } catch (IllegalStateException unused) {
                return 0;
            }
        }

        public static List<Rect> c(Context context) {
            l.d(context, "");
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect a2 = a(context);
            Rect f2 = f(context);
            if (a2 != null) {
                if (a2.left > 0) {
                    rect.left = 0;
                    rect.right = a2.left;
                    rect.top = 0;
                    rect.bottom = f2.bottom;
                    rect2.left = a2.right;
                    rect2.right = f2.right;
                    rect2.top = 0;
                    rect2.bottom = f2.bottom;
                } else {
                    rect.left = 0;
                    rect.right = f2.right;
                    rect.top = 0;
                    rect.bottom = a2.top;
                    rect2.left = 0;
                    rect2.right = f2.right;
                    rect2.top = a2.bottom;
                    rect2.bottom = f2.bottom;
                }
            }
            if (rect.isEmpty() || rect2.isEmpty()) {
                return null;
            }
            return n.b(rect, rect2);
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(6686);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new b().a();
                        i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (i.f107219a) {
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
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(6686);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }
}
