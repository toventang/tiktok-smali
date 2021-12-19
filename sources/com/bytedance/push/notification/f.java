package com.bytedance.push.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.c;
import com.bytedance.push.c.k;
import com.bytedance.push.f.a;
import com.ss.android.pushmanager.setting.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

public final class f implements com.bytedance.push.c.f {

    /* renamed from: a  reason: collision with root package name */
    final k f42257a;

    static {
        Covode.recordClassIndex(25819);
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public f(k kVar) {
        this.f42257a = kVar;
    }

    @Override // com.bytedance.push.c.f
    public final void a(final Context context) {
        b.b();
        e.a(new Runnable() {
            /* class com.bytedance.push.notification.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25820);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
                if (com.bytedance.push.notification.e.f42254a.a(r2, ((com.bytedance.push.settings.LocalFrequencySettings) com.bytedance.push.settings.h.a(r2, com.bytedance.push.settings.LocalFrequencySettings.class)).h()) != false) goto L_0x0032;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 195
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.f.AnonymousClass1.run():void");
            }
        });
    }

    static boolean a(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return true;
            }
            NotificationManager notificationManager = (NotificationManager) b(context, "notification");
            if (notificationManager != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(7137);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                    MethodCollector.o(7137);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.push.c.f
    public final void a(final Context context, final c.b bVar) {
        if (context != null && Build.VERSION.SDK_INT >= 26) {
            e.a(new Runnable() {
                /* class com.bytedance.push.notification.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(25821);
                }

                public final void run() {
                    c.b bVar = bVar;
                    String string = context.getString(R.string.f23);
                    if (bVar == null) {
                        bVar = new c.b("push", string);
                    } else if (TextUtils.isEmpty(bVar.f42084b) || TextUtils.isEmpty(bVar.f42083a)) {
                        if (TextUtils.isEmpty(bVar.f42084b)) {
                            bVar.f42084b = "push";
                        }
                        if (TextUtils.isEmpty(bVar.f42083a)) {
                            bVar.f42083a = string;
                        }
                    }
                    String str = bVar.f42084b;
                    String str2 = bVar.f42083a;
                    NotificationManager notificationManager = (NotificationManager) a(context, "notification");
                    if (notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
                        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
                        notificationChannel.setShowBadge(true);
                        notificationChannel.enableVibration(true);
                        notificationChannel.enableLights(true);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }

                private static Object a(Context context, String str) {
                    Object obj;
                    MethodCollector.i(7021);
                    if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                        if (!i.f107220b && "connectivity".equals(str)) {
                            try {
                                new com.bytedance.platform.godzilla.b.b.b().a();
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
                                MethodCollector.o(7021);
                            }
                        }
                    } else {
                        obj = context.getSystemService(str);
                    }
                    return obj;
                }
            });
        }
    }

    @Override // com.bytedance.push.c.f
    public final void a(Context context, List<a> list) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            for (a aVar : list) {
                if (aVar != null) {
                    try {
                        if (aVar.f42110b) {
                            e.f42254a.a(context, aVar);
                        } else if (!TextUtils.equals(aVar.f42111c, "push")) {
                            e.f42254a.b(context, aVar);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }
}
