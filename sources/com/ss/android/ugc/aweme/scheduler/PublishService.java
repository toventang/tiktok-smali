package com.ss.android.ugc.aweme.scheduler;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.app.i;
import androidx.core.app.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.scheduler.h;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class PublishService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Integer> f120842a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final a f120843b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(78733);
        }

        private a() {
        }

        public static void a() {
            a("clear");
            Context a2 = com.ss.android.ugc.aweme.df.b.a();
            a(a2);
            l.a(a2).a((String) null, 1);
            if (m.a()) {
                Iterator<T> it = PublishService.f120842a.iterator();
                while (it.hasNext()) {
                    l.a(a2).a((String) null, it.next().intValue());
                }
                PublishService.f120842a.clear();
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str) {
            h.d("PublishService ".concat(String.valueOf(str)));
        }

        public static void b(String str) {
            h.c("PublishService ".concat(String.valueOf(str)));
        }

        public static void a(Context context) {
            if (Build.VERSION.SDK_INT >= 26) {
                Object a2 = a(context, "notification");
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) a2).createNotificationChannel(new NotificationChannel("com.ss.android.ugc.trill.publish", context.getString(R.string.h7e), 2));
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.scheduler.PublishService.a.a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(11838);
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
                        MethodCollector.o(11838);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    static {
        Covode.recordClassIndex(78732);
    }

    public final void onCreate() {
        super.onCreate();
        a.a("onCreate");
        a.a(this);
        startForeground(1, a(this, 0.0f, (Bitmap) null));
        a.a("onCreate startForeground done");
    }

    public final IBinder onBind(Intent intent) {
        h.f.b.l.d(intent, "");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(Notification notification, int i2) {
        l.a(this).a(i2, notification);
    }

    public static final class b extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PublishService f120844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bitmap f120845b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f120846c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f120847d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f120848e;

        static {
            Covode.recordClassIndex(78734);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onProgress(int i2, Object obj) {
            try {
                PublishService publishService = this.f120844a;
                publishService.a(publishService.a(publishService, ((float) i2) / 100.0f, this.f120845b), 1);
            } catch (Exception e2) {
                q.a("PublishService", e2);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            h.f.b.l.d(dVar, "");
            a.a("onFinish result:".concat(String.valueOf(dVar)));
            this.f120844a.stopSelf(this.f120846c);
            String str = this.f120847d;
            h.f.b.l.d(this, "");
            bj.d("PublishScheduler | removeCallback call ".concat(String.valueOf(str)));
            if (m.a()) {
                h.f120863b.execute(new h.j(str, this));
            } else {
                h.f120863b.execute(new h.k(str, this));
            }
            if (dVar instanceof d.c) {
                if (m.a()) {
                    int hashCode = this.f120848e.hashCode();
                    PublishService publishService = this.f120844a;
                    publishService.a(publishService.a(publishService, this.f120845b), hashCode);
                    PublishService.f120842a.add(Integer.valueOf(hashCode));
                    return;
                }
                PublishService publishService2 = this.f120844a;
                publishService2.a(publishService2.a(publishService2, this.f120845b), 1);
            } else if (!(dVar instanceof d.b)) {
            } else {
                if (com.ss.android.ugc.aweme.compliance.api.a.c().a(1)) {
                    l.a(this.f120844a).a((String) null, 1);
                } else if (m.a()) {
                    int hashCode2 = this.f120848e.hashCode();
                    PublishService publishService3 = this.f120844a;
                    publishService3.a(publishService3.a(publishService3, this.f120848e, this.f120845b), hashCode2);
                    PublishService.f120842a.add(Integer.valueOf(hashCode2));
                } else {
                    PublishService publishService4 = this.f120844a;
                    publishService4.a(publishService4.a(publishService4, this.f120848e, this.f120845b), 1);
                }
            }
        }

        b(PublishService publishService, Bitmap bitmap, int i2, String str, String str2) {
            this.f120844a = publishService;
            this.f120845b = bitmap;
            this.f120846c = i2;
            this.f120847d = str;
            this.f120848e = str2;
        }
    }

    public final Notification a(Context context, Bitmap bitmap) {
        String string = context.getString(R.string.h7c);
        h.f.b.l.b(string, "");
        String string2 = context.getString(R.string.h7b);
        h.f.b.l.b(string2, "");
        Notification d2 = a(this, context, string, string2, bitmap).b(true).d();
        h.f.b.l.b(d2, "");
        return d2;
    }

    public final Notification a(Context context, float f2, Bitmap bitmap) {
        int i2 = (int) (f2 * 100.0f);
        String string = context.getString(R.string.h7e);
        h.f.b.l.b(string, "");
        Notification d2 = a(this, context, string, new StringBuilder().append(i2).append('%').toString(), bitmap).b(Math.min(100, i2)).d();
        h.f.b.l.b(d2, "");
        return d2;
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        String str;
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        super.onStartCommand(intent, i2, i3);
        if (intent != null) {
            str = a(intent, "PUBLISH_ID");
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.shortvideo.publish.q a2 = h.a(str);
        if (a2 == null) {
            a.b("PublishService onStartCommand findPublishModel null");
            return 2;
        }
        String str2 = a2.f129873b;
        a.a("onStartCommand findCreationId:".concat(String.valueOf(str2)));
        Bitmap b2 = h.b(a2);
        if (b2 == null) {
            a.b("null cover creationId:" + a2.f129873b);
        }
        h.a(new b(this, b2, i3, str, str2), str);
        return 2;
    }

    public final Notification a(Context context, String str, Bitmap bitmap) {
        Intent intent = new Intent(this, PublishBroadcastReceiver.class);
        intent.putExtra("creation_id", str);
        a.a("putExtra creationId:".concat(String.valueOf(str)));
        new Intent(this, PublishBroadcastReceiver.class).putExtra("DEBUG_MSG", "MSG_SUCCESS");
        String string = context.getString(R.string.h7f);
        h.f.b.l.b(string, "");
        String string2 = context.getString(R.string.h7g);
        h.f.b.l.b(string2, "");
        i.e a2 = a(this, context, string, string2, bitmap);
        a2.f2183f = PendingIntent.getBroadcast(this, 6, intent, 0);
        g.a();
        Notification d2 = a2.b(true).d();
        h.f.b.l.b(d2, "");
        return d2;
    }

    private static /* synthetic */ i.e a(PublishService publishService, Context context, String str, String str2, Bitmap bitmap) {
        i.e a2 = new i.e(context, "com.ss.android.ugc.trill.publish").a((CharSequence) str).b(str2).a(System.currentTimeMillis());
        a2.f2183f = PendingIntent.getActivity(publishService, 5, context.getPackageManager().getLaunchIntentForPackage(publishService.getPackageName()), 0);
        i.e a3 = a2.a(2131232369).a(bitmap);
        h.f.b.l.b(a3, "");
        return a3;
    }
}
