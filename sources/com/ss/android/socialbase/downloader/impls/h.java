package com.ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import com.ss.android.socialbase.downloader.downloader.a;
import com.ss.android.socialbase.downloader.downloader.c;
import java.util.concurrent.ExecutorService;

public class h extends a {

    /* renamed from: f  reason: collision with root package name */
    private static final String f60641f = h.class.getSimpleName();

    static {
        Covode.recordClassIndex(37443);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.q
    public final void c() {
        if (com.ss.android.socialbase.downloader.k.a.a(262144)) {
            this.f60419c = true;
            this.f60421e = false;
            if (com.ss.android.socialbase.downloader.e.a.a()) {
                com.ss.android.socialbase.downloader.e.a.b(f60641f, "onStartCommandOnMainThread");
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.q
    public final void d() {
        if (com.ss.android.socialbase.downloader.e.a.a()) {
            com.ss.android.socialbase.downloader.e.a.b(f60641f, "onStartCommand");
        }
        if (!com.ss.android.socialbase.downloader.k.a.a(262144)) {
            this.f60419c = true;
        }
        f();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a
    public final void a(Context context, ServiceConnection serviceConnection) {
        try {
            a(context, new Intent(context, DownloadService.class));
        } catch (Throwable unused) {
            c();
            ExecutorService g2 = c.g();
            if (g2 != null) {
                g2.execute(new Runnable() {
                    /* class com.ss.android.socialbase.downloader.impls.h.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37444);
                    }

                    public final void run() {
                        h.this.d();
                    }
                });
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.h.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
