package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.socialbase.downloader.e.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public class DownloadService extends Service {

    /* renamed from: b  reason: collision with root package name */
    private static final String f60410b = DownloadService.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    protected q f60411a;

    static {
        Covode.recordClassIndex(37331);
    }

    public void onCreate() {
        super.onCreate();
        c.a(this);
        q r = c.r();
        this.f60411a = r;
        r.a(new WeakReference(this));
    }

    public void onDestroy() {
        if (a.a()) {
            a.b(f60410b, "Service onDestroy");
        }
        q qVar = this.f60411a;
        if (qVar != null) {
            qVar.e();
            this.f60411a = null;
        }
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        boolean z;
        String str = f60410b;
        StringBuilder sb = new StringBuilder("onBind downloadServiceHandler != null:");
        if (this.f60411a != null) {
            z = true;
        } else {
            z = false;
        }
        a.b(str, sb.append(z).toString());
        q qVar = this.f60411a;
        if (qVar != null) {
            return qVar.a(intent);
        }
        return null;
    }

    public int onStartCommand(final Intent intent, final int i2, final int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        if (a.a()) {
            a.b(f60410b, "DownloadService onStartCommand");
        }
        this.f60411a.c();
        ExecutorService g2 = c.g();
        if (g2 != null) {
            g2.execute(new Runnable() {
                /* class com.ss.android.socialbase.downloader.downloader.DownloadService.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37332);
                }

                public final void run() {
                    if (DownloadService.this.f60411a != null) {
                        DownloadService.this.f60411a.d();
                    }
                }
            });
        }
        if (c.e()) {
            return 2;
        }
        return 3;
    }
}
