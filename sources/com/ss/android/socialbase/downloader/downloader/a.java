package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final String f60417a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    protected final SparseArray<List<DownloadTask>> f60418b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    protected volatile boolean f60419c = false;

    /* renamed from: d  reason: collision with root package name */
    protected volatile boolean f60420d;

    /* renamed from: e  reason: collision with root package name */
    protected volatile boolean f60421e = false;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Service> f60422f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f60423g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    private Runnable f60424h = new Runnable() {
        /* class com.ss.android.socialbase.downloader.downloader.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37337);
        }

        public final void run() {
            if (com.ss.android.socialbase.downloader.e.a.a()) {
                com.ss.android.socialbase.downloader.e.a.b(a.f60417a, "tryDownload: 2 try");
            }
            if (!a.this.f60419c) {
                if (com.ss.android.socialbase.downloader.e.a.a()) {
                    com.ss.android.socialbase.downloader.e.a.b(a.f60417a, "tryDownload: 2 error");
                }
                a.this.a(c.B(), (ServiceConnection) null);
            }
        }
    };

    /* access modifiers changed from: protected */
    public void a(Context context, ServiceConnection serviceConnection) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void a(p pVar) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void c() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void c(DownloadTask downloadTask) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void d() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public final void e() {
        this.f60419c = false;
    }

    static {
        Covode.recordClassIndex(37336);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public final boolean b() {
        com.ss.android.socialbase.downloader.e.a.c(f60417a, "isServiceForeground = " + this.f60420d);
        return this.f60420d;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void g() {
        if (!this.f60419c) {
            if (com.ss.android.socialbase.downloader.e.a.a()) {
                com.ss.android.socialbase.downloader.e.a.b(f60417a, "startService");
            }
            a(c.B(), (ServiceConnection) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void f() {
        SparseArray<List<DownloadTask>> clone;
        synchronized (this.f60418b) {
            com.ss.android.socialbase.downloader.e.a.b(f60417a, "resumePendingTask pendingTasks.size:" + this.f60418b.size());
            clone = this.f60418b.clone();
            this.f60418b.clear();
        }
        com.ss.android.socialbase.downloader.impls.a u = c.u();
        if (u != null) {
            for (int i2 = 0; i2 < clone.size(); i2++) {
                List<DownloadTask> list = clone.get(clone.keyAt(i2));
                if (list != null) {
                    for (DownloadTask downloadTask : list) {
                        com.ss.android.socialbase.downloader.e.a.b(f60417a, "resumePendingTask key:" + downloadTask.getDownloadId());
                        u.a(downloadTask);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public final boolean a() {
        return this.f60419c;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void a(int i2) {
        com.ss.android.socialbase.downloader.e.a.f60494a = i2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public IBinder a(Intent intent) {
        com.ss.android.socialbase.downloader.e.a.b(f60417a, "onBind Abs");
        return new Binder();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public final void a(WeakReference weakReference) {
        this.f60422f = weakReference;
    }

    public final void a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            int downloadId = downloadTask.getDownloadId();
            synchronized (this.f60418b) {
                String str = f60417a;
                com.ss.android.socialbase.downloader.e.a.b(str, "pendDownloadTask pendingTasks.size:" + this.f60418b.size() + " downloadId:" + downloadId);
                List<DownloadTask> list = this.f60418b.get(downloadId);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f60418b.put(downloadId, list);
                }
                com.ss.android.socialbase.downloader.e.a.b(str, "before pendDownloadTask taskArray.size:" + list.size());
                list.add(downloadTask);
                com.ss.android.socialbase.downloader.e.a.b(str, "after pendDownloadTask pendingTasks.size:" + this.f60418b.size());
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public void b(DownloadTask downloadTask) {
        if (downloadTask != null) {
            if (!this.f60419c) {
                if (com.ss.android.socialbase.downloader.e.a.a()) {
                    com.ss.android.socialbase.downloader.e.a.b(f60417a, "tryDownload but service is not alive");
                }
                if (com.ss.android.socialbase.downloader.k.a.a(262144)) {
                    a(downloadTask);
                    if (!this.f60421e) {
                        if (com.ss.android.socialbase.downloader.e.a.a()) {
                            com.ss.android.socialbase.downloader.e.a.b(f60417a, "tryDownload: 1");
                        }
                        a(c.B(), (ServiceConnection) null);
                        this.f60421e = true;
                        return;
                    }
                    this.f60423g.removeCallbacks(this.f60424h);
                    this.f60423g.postDelayed(this.f60424h, 10);
                    return;
                }
                a(downloadTask);
                a(c.B(), (ServiceConnection) null);
                return;
            }
            String str = f60417a;
            com.ss.android.socialbase.downloader.e.a.b(str, "tryDownload when isServiceAlive");
            f();
            com.ss.android.socialbase.downloader.impls.a u = c.u();
            if (u != null) {
                com.ss.android.socialbase.downloader.e.a.b(str, "tryDownload current task: " + downloadTask.getDownloadId());
                u.a(downloadTask);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public final void a(boolean z) {
        WeakReference<Service> weakReference = this.f60422f;
        if (weakReference != null && weakReference.get() != null) {
            com.ss.android.socialbase.downloader.e.a.c(f60417a, "stopForeground  service = " + this.f60422f.get() + ",  isServiceAlive = " + this.f60419c);
            try {
                this.f60420d = false;
                this.f60422f.get().stopForeground(z);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.q
    public final void a(int i2, Notification notification) {
        WeakReference<Service> weakReference = this.f60422f;
        if (weakReference == null || weakReference.get() == null) {
            com.ss.android.socialbase.downloader.e.a.d(f60417a, "startForeground: downloadService is null, do nothing!");
            return;
        }
        com.ss.android.socialbase.downloader.e.a.c(f60417a, "startForeground  id = " + i2 + ", service = " + this.f60422f.get() + ",  isServiceAlive = " + this.f60419c);
        try {
            this.f60422f.get().startForeground(i2, notification);
            this.f60420d = true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
