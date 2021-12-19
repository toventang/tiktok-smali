package com.ss.android.socialbase.downloader.impls;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.a.a;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public class r implements Handler.Callback, a.AbstractC1310a {

    /* renamed from: e  reason: collision with root package name */
    private static volatile r f60664e;

    /* renamed from: i  reason: collision with root package name */
    private static b f60665i;

    /* renamed from: a  reason: collision with root package name */
    public final Context f60666a = c.B();

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<a> f60667b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public int f60668c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ConnectivityManager f60669d;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f60670f = new Handler(Looper.getMainLooper(), this);

    /* renamed from: g  reason: collision with root package name */
    private final boolean f60671g;

    /* renamed from: h  reason: collision with root package name */
    private long f60672h;

    public interface b {
        static {
            Covode.recordClassIndex(37461);
        }
    }

    static {
        Covode.recordClassIndex(37455);
    }

    public final void a(DownloadInfo downloadInfo, boolean z, int i2) {
        MethodCollector.i(14027);
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException == null) {
            MethodCollector.o(14027);
            return;
        }
        a a2 = a(downloadInfo.getId());
        if (a2.f60688i.get() > a2.f60682c) {
            com.ss.android.socialbase.downloader.e.a.d("RetryScheduler", "tryStartScheduleRetry, id = " + a2.f60680a + ", mRetryCount = " + a2.f60688i + ", maxCount = " + a2.f60682c);
            MethodCollector.o(14027);
            return;
        }
        int errorCode = failedException.getErrorCode();
        if (!g.c(failedException) && !g.d(failedException) && (!downloadInfo.statusInPause() || !downloadInfo.isPauseReserveOnWifi())) {
            if (!a(a2, errorCode)) {
                MethodCollector.o(14027);
                return;
            }
            com.ss.android.socialbase.downloader.e.a.c("RetryScheduler", "allow error code, id = " + a2.f60680a + ", error code = " + errorCode);
        }
        a2.f60689j = z;
        synchronized (this.f60667b) {
            try {
                if (!a2.f60691l) {
                    a2.f60691l = true;
                    this.f60668c++;
                }
            } finally {
                MethodCollector.o(14027);
            }
        }
        int i3 = a2.f60687h.get();
        com.ss.android.socialbase.downloader.e.a.c("RetryScheduler", "tryStartScheduleRetry: id = " + a2.f60680a + ", delayTimeMills = " + i3 + ", mWaitingRetryTasks = " + this.f60668c);
        if (a2.f60685f) {
            if (i2 == 0) {
                a2.c();
            }
            if (this.f60671g) {
                a2.a(System.currentTimeMillis());
                a2.b();
                a2.a();
            }
        } else if (z) {
            MethodCollector.o(14027);
        } else {
            this.f60670f.removeMessages(downloadInfo.getId());
            this.f60670f.sendEmptyMessageDelayed(downloadInfo.getId(), (long) i3);
            MethodCollector.o(14027);
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final int f60680a;

        /* renamed from: b  reason: collision with root package name */
        final int f60681b;

        /* renamed from: c  reason: collision with root package name */
        final int f60682c;

        /* renamed from: d  reason: collision with root package name */
        final int f60683d;

        /* renamed from: e  reason: collision with root package name */
        final int f60684e;

        /* renamed from: f  reason: collision with root package name */
        final boolean f60685f;

        /* renamed from: g  reason: collision with root package name */
        final int[] f60686g;

        /* renamed from: h  reason: collision with root package name */
        AtomicInteger f60687h;

        /* renamed from: i  reason: collision with root package name */
        public AtomicInteger f60688i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f60689j;

        /* renamed from: k  reason: collision with root package name */
        AtomicLong f60690k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f60691l;

        static {
            Covode.recordClassIndex(37460);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f60687h.addAndGet(this.f60684e);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            this.f60688i.incrementAndGet();
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.f60687h.set(this.f60683d);
        }

        /* access modifiers changed from: package-private */
        public final void a(long j2) {
            this.f60690k.set(j2);
        }

        a(int i2, int i3, int i4, int i5, int i6, boolean z, int[] iArr) {
            i5 = i5 < 3000 ? 3000 : i5;
            i6 = i6 < 5000 ? 5000 : i6;
            this.f60680a = i2;
            this.f60681b = i3;
            this.f60682c = i4;
            this.f60683d = i5;
            this.f60684e = i6;
            this.f60685f = z;
            this.f60686g = iArr;
            this.f60687h = new AtomicInteger(i5);
            this.f60690k = new AtomicLong(0);
            this.f60688i = new AtomicInteger(0);
        }
    }

    @Override // com.ss.android.socialbase.downloader.a.a.AbstractC1310a
    public final void a() {
        a(4, false);
    }

    @Override // com.ss.android.socialbase.downloader.a.a.AbstractC1310a
    public final void b() {
        a(3, false);
    }

    public final void d() {
        a(2, true);
    }

    public static r c() {
        MethodCollector.i(14025);
        if (f60664e == null) {
            synchronized (r.class) {
                try {
                    if (f60664e == null) {
                        f60664e = new r();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14025);
                    throw th;
                }
            }
        }
        r rVar = f60664e;
        MethodCollector.o(14025);
        return rVar;
    }

    public final int e() {
        try {
            if (this.f60669d == null) {
                Context applicationContext = this.f60666a.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                this.f60669d = (ConnectivityManager) a(applicationContext, "connectivity");
            }
            NetworkInfo a2 = a(this.f60669d);
            if (a2 != null) {
                if (a2.isConnected()) {
                    if (a2.getType() == 1) {
                        return 2;
                    }
                    return 1;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    private r() {
        MethodCollector.i(14024);
        if (com.ss.android.socialbase.downloader.i.a.f60573a.a("use_network_callback", 0) == 1) {
            c.g().execute(new Runnable() {
                /* class com.ss.android.socialbase.downloader.impls.r.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37456);
                }

                public final void run() {
                    try {
                        if (r.this.f60666a != null && Build.VERSION.SDK_INT >= 21) {
                            r rVar = r.this;
                            Context applicationContext = rVar.f60666a.getApplicationContext();
                            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                                if (applicationContext == null) {
                                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                                }
                            }
                            rVar.f60669d = (ConnectivityManager) a(applicationContext, "connectivity");
                            r.this.f60669d.registerNetworkCallback(new NetworkRequest.Builder().build(), new ConnectivityManager.NetworkCallback() {
                                /* class com.ss.android.socialbase.downloader.impls.r.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(37457);
                                }

                                public final void onAvailable(Network network) {
                                    com.ss.android.socialbase.downloader.e.a.b("RetryScheduler", "network onAvailable: ");
                                    r.this.a(1, true);
                                }
                            });
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }

                private static Object a(Context context, String str) {
                    Object obj;
                    MethodCollector.i(13706);
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
                                MethodCollector.o(13706);
                            }
                        }
                    } else {
                        obj = context.getSystemService(str);
                    }
                    return obj;
                }
            });
        }
        this.f60671g = g.c();
        com.ss.android.socialbase.downloader.a.a aVar = a.b.f60273a;
        synchronized (aVar.f60266b) {
            try {
                if (!aVar.f60266b.contains(this)) {
                    aVar.f60266b.add(this);
                }
            } finally {
                MethodCollector.o(14024);
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

    private void b(int i2) {
        MethodCollector.i(14149);
        synchronized (this.f60667b) {
            try {
                this.f60667b.remove(i2);
            } finally {
                MethodCollector.o(14149);
            }
        }
    }

    private static int[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length <= 0) {
                return null;
            }
            int[] iArr = new int[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                iArr[i2] = Integer.parseInt(split[i2]);
            }
            return iArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean handleMessage(Message message) {
        final boolean z;
        if (message.what == 0) {
            final int i2 = message.arg1;
            if (message.arg2 == 1) {
                z = true;
            } else {
                z = false;
            }
            c.g().execute(new Runnable() {
                /* class com.ss.android.socialbase.downloader.impls.r.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(37458);
                }

                public final void run() {
                    MethodCollector.i(13703);
                    try {
                        if (r.this.f60668c <= 0) {
                            MethodCollector.o(13703);
                            return;
                        }
                        int e2 = r.this.e();
                        if (e2 == 0) {
                            MethodCollector.o(13703);
                            return;
                        }
                        com.ss.android.socialbase.downloader.e.a.c("RetryScheduler", "doScheduleAllTaskRetry: mWaitingRetryTasksCount = " + r.this.f60668c);
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList<a> arrayList = new ArrayList();
                        synchronized (r.this.f60667b) {
                            for (int i2 = 0; i2 < r.this.f60667b.size(); i2++) {
                                try {
                                    a valueAt = r.this.f60667b.valueAt(i2);
                                    if (valueAt != null) {
                                        int i3 = i2;
                                        boolean z = z;
                                        if (!valueAt.f60691l) {
                                            com.ss.android.socialbase.downloader.e.a.c("RetryScheduler", "canRetry: mIsWaitingRetry is false, return false!!!");
                                        } else if (valueAt.f60681b >= i3) {
                                            if (valueAt.f60688i.get() < valueAt.f60682c) {
                                                if (!valueAt.f60689j || e2 == 2) {
                                                    if (z || currentTimeMillis - valueAt.f60690k.get() >= ((long) valueAt.f60683d)) {
                                                        if (z) {
                                                            valueAt.c();
                                                        }
                                                        arrayList.add(valueAt);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    MethodCollector.o(13703);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            for (a aVar : arrayList) {
                                r.this.a(aVar.f60680a, e2, false);
                            }
                        }
                    } catch (Exception unused) {
                        MethodCollector.o(13703);
                    }
                }
            });
        } else {
            com.ss.android.socialbase.downloader.e.a.c("RetryScheduler", "handleMessage, doSchedulerRetry, id = " + message.what);
            final int i3 = message.what;
            c.g().execute(new Runnable() {
                /* class com.ss.android.socialbase.downloader.impls.r.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(37459);
                }

                public final void run() {
                    try {
                        r rVar = r.this;
                        rVar.a(i3, rVar.e(), true);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
        return true;
    }

    private a a(int i2) {
        int i3;
        int i4;
        MethodCollector.i(14148);
        a aVar = this.f60667b.get(i2);
        if (aVar == null) {
            synchronized (this.f60667b) {
                try {
                    aVar = this.f60667b.get(i2);
                    if (aVar == null) {
                        int[] iArr = null;
                        com.ss.android.socialbase.downloader.i.a a2 = com.ss.android.socialbase.downloader.i.a.a(i2, (DownloadInfo) null);
                        boolean z = false;
                        int a3 = a2.a("retry_schedule", 0);
                        JSONObject a4 = a2.a("retry_schedule_config");
                        int i5 = 60;
                        if (a4 != null) {
                            i3 = a4.optInt("max_count", 60);
                            int optInt = a4.optInt("interval_sec", 60);
                            i4 = a4.optInt("interval_sec_acceleration", 60);
                            if (Build.VERSION.SDK_INT >= 21 && f60665i != null && a4.optInt("use_job_scheduler", 0) == 1) {
                                z = true;
                            }
                            iArr = a(a4.optString("allow_error_code"));
                            i5 = optInt;
                        } else {
                            i4 = 60;
                            i3 = 60;
                            z = false;
                        }
                        aVar = new a(i2, a3, i3, i5 * 1000, i4 * 1000, z, iArr);
                    }
                    this.f60667b.put(i2, aVar);
                } finally {
                    MethodCollector.o(14148);
                }
            }
        }
        return aVar;
    }

    private static boolean a(a aVar, int i2) {
        int[] iArr = aVar.f60686g;
        if (!(iArr == null || iArr.length == 0)) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(14151);
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
                    MethodCollector.o(14151);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static boolean a(DownloadInfo downloadInfo, BaseException baseException) {
        long j2;
        long totalBytes;
        try {
            j2 = g.b(downloadInfo.getTempPath());
        } catch (BaseException e2) {
            e2.printStackTrace();
            j2 = 0;
        }
        if (baseException instanceof DownloadOutOfSpaceException) {
            totalBytes = ((DownloadOutOfSpaceException) baseException).getRequiredSpaceBytes();
        } else {
            totalBytes = downloadInfo.getTotalBytes() - downloadInfo.getCurBytes();
        }
        if (j2 < totalBytes) {
            com.ss.android.socialbase.downloader.i.a a2 = com.ss.android.socialbase.downloader.i.a.a(downloadInfo.getId(), (DownloadInfo) null);
            if (a2.a("space_fill_part_download", 0) == 1) {
                if (j2 > 0) {
                    int a3 = a2.a("space_fill_min_keep_mb", 100);
                    if (a3 > 0) {
                        long j3 = j2 - (((long) a3) * 1048576);
                        StringBuilder sb = new StringBuilder("retry schedule: available = ");
                        double d2 = (double) j2;
                        Double.isNaN(d2);
                        StringBuilder append = sb.append(d2 / 1048576.0d).append("MB, minKeep = ").append(a3).append("MB, canDownload = ");
                        double d3 = (double) j3;
                        Double.isNaN(d3);
                        com.ss.android.socialbase.downloader.e.a.c("RetryScheduler", append.append(d3 / 1048576.0d).append("MB").toString());
                        if (j3 <= 0) {
                            com.ss.android.socialbase.downloader.e.a.d("RetryScheduler", "doSchedulerRetryInSubThread: canDownload <= 0 , canRetry = false !!!!");
                            return false;
                        }
                    }
                } else if (a2.a("download_when_space_negative", 0) != 1) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        com.ss.android.socialbase.downloader.e.a.c("RetryScheduler", "scheduleAllTaskRetry, level = [" + r9 + "], force = [" + r10 + "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r10 == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r8.f60670f.removeMessages(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r3 = android.os.Message.obtain();
        r3.what = 0;
        r3.arg1 = r9;
        r3.arg2 = r10 ? 1 : 0;
        r8.f60670f.sendMessageDelayed(r3, com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14029);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.r.a(int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        com.ss.android.socialbase.downloader.e.a.c("RetryScheduler", "doSchedulerRetryInSubThread: downloadId = " + r10 + ", retryCount = " + r6.f60688i + ", mWaitingRetryTasksCount = " + r9.f60668c);
        r2 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r3).getDownloadInfo(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r2 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        b(r10);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14118);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        com.ss.android.socialbase.downloader.e.a.e("RetryScheduler", "doSchedulerRetryInSubThread，id:".concat(java.lang.String.valueOf(r10)));
        r5 = r2.getRealStatus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r5 == -3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r5 != -4) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        b(r10);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14118);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (r5 == -5) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r5 != -2) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r2.isPauseReserveOnWifi() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.B()).getReserveWifiStatusListener();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        if (com.ss.android.socialbase.downloader.downloader.c.p() == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        java.util.Collections.singletonList(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        b(r10);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14118);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        if (r5 == -1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14118);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if (r11 != 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        if (r6.f60685f == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c3, code lost:
        r1 = r2.getFailedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c7, code lost:
        if (r5 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cd, code lost:
        if (com.ss.android.socialbase.downloader.k.g.c(r1) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cf, code lost:
        r5 = a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d3, code lost:
        r6.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d6, code lost:
        if (r5 == false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        com.ss.android.socialbase.downloader.e.a.c("RetryScheduler", "doSchedulerRetry: restart task, ****** id = " + r6.f60680a);
        r6.a(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        if (r12 == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f7, code lost:
        r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fa, code lost:
        r2.setRetryScheduleCount(r6.f60688i.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0107, code lost:
        if (r2.getStatus() != -1) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0109, code lost:
        com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r3).restart(r2.getId());
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14118);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0117, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0118, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011a, code lost:
        if (r12 == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011c, code lost:
        r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0123, code lost:
        if (r2.isOnlyWifi() != false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0129, code lost:
        if (r2.isPauseReserveOnWifi() == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        a(r2, r7, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14118);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0131, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0132, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0134, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(14118);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0137, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10, int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.r.a(int, int, boolean):void");
    }
}
