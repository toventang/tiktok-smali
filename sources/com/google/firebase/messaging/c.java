package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.google.android.gms.c.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.k;
import com.google.firebase.messaging.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f54603a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f54604b;

    /* renamed from: c  reason: collision with root package name */
    private final o f54605c;

    static {
        Covode.recordClassIndex(33879);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        Uri defaultUri;
        Intent launchIntentForPackage;
        Uri parse;
        PendingIntent activity;
        PendingIntent a2;
        if (this.f54605c.b("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) a(this.f54604b, "keyguard")).inKeyguardRestrictedInputMode()) {
            if (!k.c()) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) a(this.f54604b, "activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        l a3 = l.a(this.f54605c.a("gcm.n.image"));
        if (a3 != null) {
            a3.f54620b = com.google.android.gms.c.k.a(this.f54603a, new m(a3));
        }
        Context context = this.f54604b;
        o oVar = this.f54605c;
        Bundle a4 = a.a(context.getPackageManager(), context.getPackageName());
        String packageName = context.getPackageName();
        String b2 = a.b(context, oVar.a("gcm.n.android_channel_id"), a4);
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        i.e eVar = new i.e(context, b2);
        String a5 = oVar.a(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(a5)) {
            eVar.a((CharSequence) a5);
        }
        String a6 = oVar.a(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(a6)) {
            eVar.b(a6);
            eVar.a(new i.c().c(a6));
        }
        eVar.a(a.a(packageManager, resources, packageName, oVar.a("gcm.n.icon"), a4));
        String a7 = oVar.a("gcm.n.sound2");
        if (TextUtils.isEmpty(a7)) {
            a7 = oVar.a("gcm.n.sound");
        }
        if (!TextUtils.isEmpty(a7)) {
            if ("default".equals(a7) || resources.getIdentifier(a7, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse(new StringBuilder(String.valueOf(packageName).length() + 24 + String.valueOf(a7).length()).append("android.resource://").append(packageName).append("/raw/").append(a7).toString());
            }
            if (defaultUri != null) {
                eVar.a(defaultUri);
            }
        }
        String a8 = oVar.a("gcm.n.click_action");
        if (!TextUtils.isEmpty(a8)) {
            launchIntentForPackage = new Intent(a8);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            String a9 = oVar.a("gcm.n.link_android");
            if (TextUtils.isEmpty(a9)) {
                a9 = oVar.a("gcm.n.link");
            }
            if (TextUtils.isEmpty(a9) || (parse = Uri.parse(a9)) == null) {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            } else {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(parse);
            }
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            launchIntentForPackage.putExtras(oVar.c());
            activity = PendingIntent.getActivity(context, a.f54598a.incrementAndGet(), launchIntentForPackage, 1073741824);
            if (oVar.b("google.c.a.e")) {
                activity = a.a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(oVar.d()).putExtra("pending_intent", activity));
            }
        }
        eVar.f2183f = activity;
        if (oVar.b("google.c.a.e") && (a2 = a.a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(oVar.d()))) != null) {
            eVar.b(a2);
        }
        Integer a10 = a.a(context, oVar.a("gcm.n.color"), a4);
        if (a10 != null) {
            eVar.D = a10.intValue();
        }
        eVar.b(!oVar.b("gcm.n.sticky"));
        eVar.y = oVar.b("gcm.n.local_only");
        String a11 = oVar.a("gcm.n.ticker");
        if (a11 != null) {
            eVar.d(a11);
        }
        Integer c2 = oVar.c("gcm.n.notification_priority");
        if (c2 != null) {
            if (c2.intValue() < -2 || c2.intValue() > 2) {
                String.valueOf(String.valueOf(c2)).length();
            } else {
                eVar.f2189l = c2.intValue();
            }
        }
        Integer c3 = oVar.c("gcm.n.visibility");
        if (c3 != null) {
            if (c3.intValue() < -1 || c3.intValue() > 1) {
                String.valueOf(String.valueOf(c3)).length();
            } else {
                eVar.E = c3.intValue();
            }
        }
        Integer c4 = oVar.c("gcm.n.notification_count");
        if (c4 != null) {
            if (c4.intValue() < 0) {
                String.valueOf(String.valueOf(c4)).length();
            } else {
                eVar.f2188k = c4.intValue();
            }
        }
        Long d2 = oVar.d("gcm.n.event_time");
        if (d2 != null) {
            eVar.f2190m = true;
            eVar.a(d2.longValue());
        }
        long[] a12 = oVar.a();
        if (a12 != null) {
            eVar.a(a12);
        }
        int[] b3 = oVar.b();
        if (b3 != null) {
            eVar.a(b3[0], b3[1], b3[2]);
        }
        boolean b4 = oVar.b("gcm.n.default_sound");
        if (oVar.b("gcm.n.default_vibrate_timings")) {
            b4 |= true;
        }
        if (oVar.b("gcm.n.default_light_settings")) {
            boolean z = b4 ? 1 : 0;
            char c5 = b4 ? 1 : 0;
            char c6 = b4 ? 1 : 0;
            b4 = z | true;
        }
        int i2 = b4 ? 1 : 0;
        int i3 = b4 ? 1 : 0;
        int i4 = b4 ? 1 : 0;
        int i5 = b4 ? 1 : 0;
        eVar.c(i2);
        String a13 = oVar.a("gcm.n.tag");
        if (TextUtils.isEmpty(a13)) {
            a13 = new StringBuilder(37).append("FCM-Notification:").append(SystemClock.uptimeMillis()).toString();
        }
        a.C1245a aVar = new a.C1245a(eVar, a13);
        i.e eVar2 = aVar.f54599a;
        if (a3 != null) {
            try {
                Bitmap bitmap = (Bitmap) com.google.android.gms.c.k.a((h) r.a(a3.f54620b), 5, TimeUnit.SECONDS);
                eVar2.a(bitmap);
                i.b bVar = new i.b();
                bVar.f2168a = bitmap;
                eVar2.a(bVar.a((Bitmap) null));
            } catch (ExecutionException e2) {
                String.valueOf(String.valueOf(e2.getCause())).length();
            } catch (InterruptedException unused) {
                a3.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                a3.close();
            }
        }
        ((NotificationManager) a(this.f54604b, "notification")).notify(aVar.f54600b, aVar.f54601c, aVar.f54599a.d());
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3770);
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
                    MethodCollector.o(3770);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public c(Context context, o oVar, Executor executor) {
        this.f54603a = executor;
        this.f54604b = context;
        this.f54605c = oVar;
    }
}
