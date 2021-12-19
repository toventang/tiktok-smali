package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;

public interface q<T extends DownloadService> {
    static {
        Covode.recordClassIndex(37365);
    }

    IBinder a(Intent intent);

    void a(int i2);

    void a(int i2, Notification notification);

    void a(p pVar);

    void a(WeakReference<T> weakReference);

    void a(boolean z);

    boolean a();

    void b(DownloadTask downloadTask);

    boolean b();

    void c();

    void c(DownloadTask downloadTask);

    void d();

    void e();

    void g();
}
