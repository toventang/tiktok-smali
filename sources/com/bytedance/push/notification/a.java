package com.bytedance.push.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.push.PushBody;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public abstract class a {

    /* renamed from: com.bytedance.push.notification.a$a  reason: collision with other inner class name */
    public interface AbstractC1034a {
        static {
            Covode.recordClassIndex(25809);
        }

        void a();

        void a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(25807);
    }

    public abstract void a(String str, AbstractC1034a aVar);

    public abstract Intent b(Context context, int i2, PushBody pushBody);

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
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

    /* access modifiers changed from: package-private */
    public void a(final Context context, final int i2, final PushBody pushBody) {
        if (pushBody != null) {
            if (pushBody.n == 0 || TextUtils.isEmpty(pushBody.f42036m)) {
                a(context, i2, pushBody, (Bitmap) null);
            } else {
                a(pushBody.f42036m, new AbstractC1034a() {
                    /* class com.bytedance.push.notification.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(25808);
                    }

                    @Override // com.bytedance.push.notification.a.AbstractC1034a
                    public final void a() {
                        a.this.a(context, i2, pushBody, (Bitmap) null);
                    }

                    @Override // com.bytedance.push.notification.a.AbstractC1034a
                    public final void a(Bitmap bitmap) {
                        a.this.a(context, i2, pushBody, bitmap);
                    }
                });
            }
        }
    }

    public final void a(Context context, int i2, PushBody pushBody, Bitmap bitmap) {
        try {
            NotificationManager notificationManager = (NotificationManager) a(context, "notification");
            Intent b2 = b(context, i2, pushBody);
            if (pushBody.f42032i) {
                Notification b3 = b(context, i2, pushBody, bitmap);
                if (b3 != null) {
                    int i3 = (int) (pushBody.f42024a % 2147483647L);
                    b3.contentIntent = PendingIntent.getActivity(context, i3, b2, 134217728);
                    notificationManager.notify("app_notify", i3, b3);
                    return;
                }
                return;
            }
            a(context, b2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static Notification a(Notification.Builder builder, Context context, String str, String str2) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeResource(context.getResources(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon);
        } catch (Exception unused) {
            bitmap = null;
        }
        Notification.Builder contentText = builder.setContentTitle(str).setContentText(str2);
        int i2 = Build.VERSION.SDK_INT;
        contentText.setStyle(new Notification.BigTextStyle().bigText(str2));
        if (bitmap != null && !bitmap.isRecycled()) {
            contentText = contentText.setLargeIcon(bitmap);
        }
        return contentText.build();
    }

    /* access modifiers changed from: protected */
    public Notification b(Context context, int i2, PushBody pushBody, Bitmap bitmap) {
        Notification.Builder builder;
        Notification notification;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (m.a(pushBody.f42035l)) {
                pushBody.f42035l = context.getString(packageInfo.applicationInfo.labelRes);
            }
            String str = pushBody.f42031h;
            if (!f.a(context, str)) {
                str = "push";
            }
            if (Build.VERSION.SDK_INT >= 26) {
                builder = new Notification.Builder(context, str);
            } else {
                builder = new Notification.Builder(context);
            }
            long currentTimeMillis = System.currentTimeMillis();
            builder.setTicker(pushBody.f42035l).setAutoCancel(true);
            builder.setWhen(currentTimeMillis);
            builder.setShowWhen(pushBody.f42027d);
            if (Build.VERSION.SDK_INT > 20) {
                builder.setSmallIcon(2131233879);
            } else {
                builder.setSmallIcon(R.drawable.status_icon);
            }
            if (pushBody.p) {
                builder.setLights(-16711936, 1000, 2500);
            }
            if (Build.VERSION.SDK_INT > 20) {
                builder.setPriority(1);
                builder.setVibrate(new long[0]);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                pushBody.n = 0;
            }
            int i3 = pushBody.n;
            if (i3 == 0) {
                notification = a(builder, context, pushBody.f42035l, pushBody.f42034k);
            } else if (i3 == 1) {
                notification = a(builder, context, pushBody.f42035l, pushBody.f42034k, bitmap);
            } else if (i3 != 2) {
                notification = a(builder, context, pushBody.f42035l, pushBody.f42034k);
            } else {
                builder.setContentTitle(pushBody.f42035l).setContentText(pushBody.f42034k).setLargeIcon(bitmap);
                notification = builder.build();
            }
            if (pushBody.q) {
                notification.defaults |= 1;
            }
            if (pushBody.r) {
                try {
                    int ringerMode = ((AudioManager) a(context, DataType.AUDIO)).getRingerMode();
                    if (ringerMode == 1 || ringerMode == 2) {
                        notification.defaults |= 2;
                    }
                } catch (Throwable unused) {
                }
            }
            return notification;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static Notification a(Notification.Builder builder, Context context, String str, String str2, Bitmap bitmap) {
        Bitmap bitmap2;
        try {
            bitmap2 = BitmapFactory.decodeResource(context.getResources(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon);
        } catch (Exception unused) {
            bitmap2 = null;
        }
        Notification.Builder contentText = builder.setContentTitle(str).setContentText(str2);
        int i2 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle().bigPicture(bitmap).setSummaryText(str2).setBigContentTitle(str);
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            bigContentTitle = bigContentTitle.bigLargeIcon(bitmap2);
        }
        contentText.setStyle(bigContentTitle).setLargeIcon(bitmap);
        return contentText.build();
    }
}
