package com.ss.android.socialbase.downloader.g.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.g.a.a;
import com.ss.android.socialbase.downloader.i.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final HandlerThread f60501a;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f60502b;

    /* renamed from: c  reason: collision with root package name */
    static long f60503c = a.f60573a.a("preconnect_connection_outdate_time", 300000L);

    /* renamed from: d  reason: collision with root package name */
    static long f60504d = a.f60573a.a("preconnect_head_info_outdate_time", 300000L);

    static {
        Covode.recordClassIndex(37393);
        HandlerThread handlerThread = new HandlerThread("Downloader-preconnecter");
        f60501a = handlerThread;
        a.C1331a.f60500a.f60497a = com.ss.android.socialbase.downloader.i.a.f60573a.a("preconnect_max_cache_size", 3);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        f60502b = handler;
        handler.post(new Runnable() {
            /* class com.ss.android.socialbase.downloader.g.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37394);
            }

            public final void run() {
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
