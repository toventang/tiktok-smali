package com.ss.android.ugc.trill.abtest.impl;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.trill.abtest.a;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class b extends a<Boolean> {
    static {
        Covode.recordClassIndex(98953);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.trill.abtest.a
    public final /* synthetic */ Boolean a() {
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.trill.abtest.a
    public final /* synthetic */ boolean a(Boolean bool) {
        Boolean bool2 = bool;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) a(d.a(), "notification");
            if (notificationManager.getNotificationChannel("AttractUserWithoutLoginHome") != null) {
                notificationManager.deleteNotificationChannel("AttractUserWithoutLoginHome");
            }
        }
        if (com.ss.android.ugc.aweme.account.b.g().isLogin() || s.a.f66880a.m().c().booleanValue() || !bool2.booleanValue()) {
            return false;
        }
        NotificationManager notificationManager2 = (NotificationManager) a(d.a(), "notification");
        Intent intent = new Intent(d.a(), NotificationBroadcastReceiver.class);
        intent.setAction("notification_clicked");
        intent.putExtra(StringSet.type, 1);
        PendingIntent broadcast = PendingIntent.getBroadcast(d.a(), 0, intent, 1073741824);
        if (Build.VERSION.SDK_INT >= 26) {
            String string = d.a().getString(R.string.frm);
            if (Build.VERSION.SDK_INT >= 26 && notificationManager2 != null && notificationManager2.getNotificationChannel("other_channel") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("other_channel", string, 4);
                notificationChannel.enableLights(true);
                notificationChannel.enableVibration(true);
                notificationChannel.setLockscreenVisibility(1);
                notificationChannel.setShowBadge(true);
                notificationChannel.setLightColor(-16711936);
                notificationManager2.createNotificationChannel(notificationChannel);
            }
        }
        i.e eVar = new i.e(d.a(), "other_channel");
        if (Build.VERSION.SDK_INT > 20) {
            eVar.a(2131233879);
        } else {
            eVar.a(R.drawable.status_icon);
        }
        Drawable drawable = d.a().getResources().getDrawable(R.drawable.bm5);
        Bitmap bitmap = null;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        }
        eVar.a(bitmap).a((CharSequence) d.a().getString(R.string.uk)).b(d.a().getString(R.string.vs));
        eVar.f2183f = broadcast;
        if (notificationManager2 != null) {
            notificationManager2.notify(1, eVar.d());
        }
        s.a.f66880a.m().b(true);
        r.onEvent(MobClick.obtain().setLabelName("show").setEventName("recall_push"));
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6280);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(6280);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
