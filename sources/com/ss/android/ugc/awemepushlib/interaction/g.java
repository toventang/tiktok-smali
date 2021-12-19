package com.ss.android.ugc.awemepushlib.interaction;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.awemepushlib.f.d;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static int f145442a = 3;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, Integer> f145443b = new HashMap<String, Integer>() {
        /* class com.ss.android.ugc.awemepushlib.interaction.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(95101);
        }

        {
            put("digg_push", Integer.valueOf((int) R.string.frf));
            put("comment_push", Integer.valueOf((int) R.string.frb));
            put("follow_push", Integer.valueOf((int) R.string.frd));
            put("mention_push", Integer.valueOf((int) R.string.fri));
            put("im_push", Integer.valueOf((int) R.string.frc));
            put("follow_new_video_push", Integer.valueOf((int) R.string.frt));
            put("recommend_video_push", Integer.valueOf((int) R.string.fru));
            put("live_push", Integer.valueOf((int) R.string.frg));
            put("other_channel", Integer.valueOf((int) R.string.frm));
        }
    };

    static {
        Covode.recordClassIndex(95100);
    }

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && context != null) {
            b(context);
        }
    }

    public static void b(Context context) {
        NotificationManager notificationManager = (NotificationManager) a(context, "notification");
        a(context, notificationManager, f145443b);
        a(notificationManager, "com.ss.android.ugc.aweme.server");
        a(notificationManager, "com.ss.android.ugc.aweme.server.important.low");
    }

    private static boolean a(String str) {
        if (!d.b()) {
            return true;
        }
        String[] c2 = d.c();
        Arrays.toString(c2);
        if (c2.length != 0) {
            return a(c2, str);
        }
        return true;
    }

    private static void a(NotificationManager notificationManager, String str) {
        if (Build.VERSION.SDK_INT >= 26 && notificationManager != null && notificationManager.getNotificationChannel(str) != null) {
            notificationManager.deleteNotificationChannel(str);
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8294);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8294);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String a(String str, int i2) {
        a(str);
        if (i2 == 0) {
            int a2 = d.a();
            if (a2 != 0 && a(str)) {
                return str + "_associated_" + a2;
            }
            return str;
        } else if (a(str)) {
            return str + "_associated_" + i2;
        } else {
            return str;
        }
    }

    private static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static void a(Context context, NotificationManager notificationManager, Map<String, Integer> map) {
        if (Build.VERSION.SDK_INT >= 26 && notificationManager != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                NotificationChannel a2 = a(entry.getKey(), context, context.getString(entry.getValue().intValue()), notificationManager);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            notificationManager.createNotificationChannels(arrayList);
        }
    }

    private static NotificationChannel a(String str, Context context, String str2, NotificationManager notificationManager) {
        String str3;
        Uri a2;
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null) {
            return null;
        }
        int a3 = d.a();
        if (a3 == 0 || !a(str)) {
            a3 = 0;
            str3 = str;
        } else {
            str3 = str + "_associated_" + a3;
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str3);
        if (notificationChannel == null) {
            notificationChannel = new NotificationChannel(str3, str2, 4);
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLightColor(-16711936);
            if (!(Build.VERSION.SDK_INT < 26 || a3 == 0 || (a2 = d.a(context, a3)) == null)) {
                notificationChannel.setSound(a2, null);
            }
        }
        for (int i2 = 0; i2 <= f145442a; i2++) {
            if (i2 != a3) {
                String str4 = i2 != 0 ? str + "_associated_" + i2 : str;
                if (notificationManager.getNotificationChannel(str4) != null) {
                    notificationManager.deleteNotificationChannel(str4);
                }
            }
        }
        return notificationChannel;
    }
}
