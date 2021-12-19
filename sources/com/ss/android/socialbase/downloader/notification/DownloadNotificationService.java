package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.socialbase.downloader.b.e;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.i.a;
import com.ss.android.socialbase.downloader.j.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class DownloadNotificationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f60868a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f60869b;

    /* renamed from: c  reason: collision with root package name */
    public static long f60870c = 900;

    /* renamed from: f  reason: collision with root package name */
    private static final String f60871f = DownloadNotificationService.class.getSimpleName();

    /* renamed from: g  reason: collision with root package name */
    private static int f60872g = -1;

    /* renamed from: h  reason: collision with root package name */
    private static int f60873h = -1;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f60874i = true;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f60875j = false;

    /* renamed from: k  reason: collision with root package name */
    private static volatile long f60876k;

    /* renamed from: d  reason: collision with root package name */
    public g f60877d;

    /* renamed from: e  reason: collision with root package name */
    final SparseArray<Notification> f60878e = new SparseArray<>(2);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        g gVar = this.f60877d;
        if (gVar != null) {
            try {
                gVar.f60730c.quit();
            } catch (Throwable unused) {
            }
            this.f60877d = null;
        }
    }

    static {
        Covode.recordClassIndex(37547);
    }

    public void onCreate() {
        super.onCreate();
        if (this.f60877d == null) {
            g gVar = new g("DownloaderNotifyThread");
            this.f60877d = gVar;
            gVar.f60730c.start();
        }
        c.a(this);
        a aVar = a.f60573a;
        int a2 = aVar.a("download_service_foreground", 0);
        if ((a2 == 1 || a2 == 3) && f60872g == -1) {
            f60872g = 0;
        }
        if ((a2 == 2 || a2 == 3) && f60873h == -1) {
            f60873h = 0;
        }
        f60875j = aVar.a("non_going_notification_foreground", false);
        f60869b = aVar.a("notify_too_fast", false);
        long a3 = aVar.a("notification_time_window", 900L);
        f60870c = a3;
        if (a3 < 0 || a3 > 1200) {
            f60870c = 900;
        }
    }

    private static boolean a(int i2, Notification notification) {
        int i3;
        int i4;
        if (!f60874i || (i3 = f60872g) == i2 || (i4 = f60873h) == i2) {
            return false;
        }
        if (i3 != 0 && i4 != 0) {
            return false;
        }
        if (f60875j && (notification.flags & 2) == 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26 || !TextUtils.isEmpty(notification.getChannelId())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.app.NotificationManager r8, int r9) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.a(android.app.NotificationManager, int):void");
    }

    public int onStartCommand(final Intent intent, int i2, int i3) {
        g gVar;
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        if (intent == null) {
            return 2;
        }
        final String action = intent.getAction();
        if (TextUtils.isEmpty(action) || (gVar = this.f60877d) == null) {
            return 2;
        }
        gVar.a(new Runnable() {
            /* class com.ss.android.socialbase.downloader.notification.DownloadNotificationService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37548);
            }

            public final void run() {
                ConnectivityManager connectivityManager;
                NetworkInfo a2;
                long j2;
                final NotificationManager notificationManager = (NotificationManager) a(DownloadNotificationService.this, "notification");
                final int intExtra = intent.getIntExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", 0);
                if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY")) {
                    final Notification notification = (Notification) intent.getParcelableExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA");
                    int intExtra2 = intent.getIntExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", 0);
                    if (intExtra != 0 && notification != null && notificationManager != null) {
                        if (intExtra2 == 4) {
                            if (Downloader.getInstance(c.B()).isDownloading(intExtra)) {
                                DownloadInfo downloadInfo = Downloader.getInstance(c.B()).getDownloadInfo(intExtra);
                                if (DownloadNotificationService.f60869b) {
                                    if (downloadInfo != null && downloadInfo.canNotifyProgress() && System.currentTimeMillis() - DownloadNotificationService.f60868a > DownloadNotificationService.f60870c) {
                                        DownloadNotificationService.this.b(notificationManager, intExtra, notification);
                                        downloadInfo.setLastNotifyProgressTime();
                                    }
                                } else if (downloadInfo != null && downloadInfo.canNotifyProgress()) {
                                    DownloadNotificationService.this.b(notificationManager, intExtra, notification);
                                    downloadInfo.setLastNotifyProgressTime();
                                }
                            }
                        } else if (intExtra2 == -2 || intExtra2 == -3) {
                            if (DownloadNotificationService.f60869b) {
                                DownloadNotificationService.this.a(notificationManager, intExtra, notification);
                            } else if (DownloadNotificationService.this.f60877d != null) {
                                g gVar = DownloadNotificationService.this.f60877d;
                                AnonymousClass1 r2 = new Runnable() {
                                    /* class com.ss.android.socialbase.downloader.notification.DownloadNotificationService.AnonymousClass1.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(37549);
                                    }

                                    public final void run() {
                                        DownloadNotificationService.this.b(notificationManager, intExtra, notification);
                                    }
                                };
                                if (intExtra2 == -2) {
                                    j2 = 50;
                                } else {
                                    j2 = 200;
                                }
                                gVar.a(r2, j2);
                            }
                        } else if (DownloadNotificationService.f60869b) {
                            DownloadNotificationService.this.a(notificationManager, intExtra, notification);
                        } else {
                            DownloadNotificationService.this.b(notificationManager, intExtra, notification);
                        }
                    }
                } else if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL")) {
                    if (intExtra != 0) {
                        DownloadNotificationService.this.a(notificationManager, intExtra);
                    }
                } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    try {
                        if (com.ss.android.socialbase.downloader.k.g.a(DownloadNotificationService.this, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) a(DownloadNotificationService.this, "connectivity")) != null && (a2 = a(connectivityManager)) != null) {
                            if (a2.isConnected()) {
                                ArrayList arrayList = new ArrayList();
                                if (!TextUtils.isEmpty(e.f60283a)) {
                                    arrayList.add(e.f60283a);
                                }
                                arrayList.add("mime_type_plg");
                                Context applicationContext = DownloadNotificationService.this.getApplicationContext();
                                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                                    if (applicationContext != null) {
                                        Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                        Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                                    }
                                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                                }
                                if (applicationContext == null) {
                                    return;
                                }
                                Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    try {
                        Downloader.getInstance(DownloadNotificationService.this).pauseAll();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }

            private static NetworkInfo a(ConnectivityManager connectivityManager) {
                try {
                    return connectivityManager.getActiveNetworkInfo();
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                    return com.ss.android.ugc.aweme.net.e.a.a();
                }
            }

            private static Object a(DownloadNotificationService downloadNotificationService, String str) {
                Object obj;
                MethodCollector.i(13253);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!i.f107220b && "connectivity".equals(str)) {
                        try {
                            new b().a();
                            i.f107220b = true;
                            obj = downloadNotificationService.getSystemService(str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = downloadNotificationService.getSystemService(str);
                } else if (i.f107219a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = downloadNotificationService.getSystemService(str);
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
                            MethodCollector.o(13253);
                        }
                    }
                } else {
                    obj = downloadNotificationService.getSystemService(str);
                }
                return obj;
            }
        }, 0);
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f60870c - (java.lang.System.currentTimeMillis() - com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f60876k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r2 = java.lang.System.currentTimeMillis() + r0;
        com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f60868a = r2;
        com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f60876k = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r0 > 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        b(r9, r10, r11);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13632);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0 <= 20000) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = 20000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r8.f60877d == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r3 = r8.f60878e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r8.f60878e.put(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13632);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        r8.f60877d.a(new com.ss.android.socialbase.downloader.notification.DownloadNotificationService.AnonymousClass2(r8), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final android.app.NotificationManager r9, final int r10, android.app.Notification r11) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.a(android.app.NotificationManager, int, android.app.Notification):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(5:2|3|(2:14|(1:16))(1:7)|9|(1:21)(3:13|(1:18)(1:19)|20))(2:22|(1:30))|31|32|(1:34)|35|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (com.ss.android.socialbase.downloader.notification.DownloadNotificationService.f60873h == 0) goto L_0x001d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0086 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[Catch:{ all -> 0x0095 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.b(android.app.NotificationManager, int, android.app.Notification):void");
    }
}
