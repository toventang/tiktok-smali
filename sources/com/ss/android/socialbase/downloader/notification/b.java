package com.ss.android.socialbase.downloader.notification;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.e.a;
import java.util.HashSet;
import java.util.Set;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f60891c;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f60892e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final long f60893a = 1000;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Long> f60894b = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f60895d = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<a> f60896f = new SparseArray<>();

    static {
        Covode.recordClassIndex(37552);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(13327);
        if (f60891c == null) {
            synchronized (b.class) {
                try {
                    if (f60891c == null) {
                        f60891c = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13327);
                    throw th;
                }
            }
        }
        b bVar = f60891c;
        MethodCollector.o(13327);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public final SparseArray<a> b() {
        SparseArray<a> sparseArray;
        MethodCollector.i(13491);
        synchronized (this.f60896f) {
            try {
                sparseArray = this.f60896f;
            } finally {
                MethodCollector.o(13491);
            }
        }
        return sparseArray;
    }

    public final void a(int i2) {
        c(i2);
        if (i2 != 0) {
            a();
            b(i2);
        }
    }

    private static void b(int i2) {
        Context B = c.B();
        if (B != null && i2 != 0) {
            try {
                Intent intent = new Intent(B, DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i2);
                a(B, intent);
            } catch (Throwable unused) {
            }
        }
    }

    private a c(int i2) {
        a aVar;
        MethodCollector.i(13402);
        if (i2 == 0) {
            MethodCollector.o(13402);
            return null;
        }
        synchronized (this.f60896f) {
            try {
                aVar = this.f60896f.get(i2);
                if (aVar != null) {
                    this.f60896f.remove(i2);
                    a.b("DownloaderLogger", "removeNotificationId ".concat(String.valueOf(i2)));
                }
            } finally {
                MethodCollector.o(13402);
            }
        }
        return aVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.b.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
