package com.ss.android.socialbase.downloader.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.c.b;
import com.ss.android.socialbase.downloader.c.c;
import com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.v;
import com.ss.android.socialbase.downloader.e.a;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.segment.i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class f implements ServiceConnection, v {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f60340b;

    /* renamed from: c  reason: collision with root package name */
    static int f60341c;

    /* renamed from: d  reason: collision with root package name */
    static long f60342d;

    /* renamed from: a  reason: collision with root package name */
    public c f60343a;

    /* renamed from: e  reason: collision with root package name */
    public Handler f60344e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public b f60345f = null;

    /* renamed from: g  reason: collision with root package name */
    public c.a.AbstractC1328a f60346g;

    /* renamed from: h  reason: collision with root package name */
    public Runnable f60347h = new Runnable() {
        /* class com.ss.android.socialbase.downloader.c.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37251);
        }

        public final void run() {
            if (!f.f60340b && f.this.f60346g != null) {
                f.this.f60346g.a();
            }
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public Future<?> f60348i;

    /* renamed from: j  reason: collision with root package name */
    public CountDownLatch f60349j = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(37250);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean a(int i2, Map<Long, i> map) {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final Map<Long, i> k(int i2) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void l(int i2) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final /* bridge */ /* synthetic */ List m(int i2) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.v
    public final void a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<DownloadChunk>> sparseArray2, final d dVar) {
        c.g().submit(new Runnable() {
            /* class com.ss.android.socialbase.downloader.c.f.AnonymousClass4 */

            static {
                Covode.recordClassIndex(37255);
            }

            public final void run() {
                boolean z;
                d dVar;
                Future<?> future;
                f.this.a(new b.a() {
                    /* class com.ss.android.socialbase.downloader.c.f.AnonymousClass4.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37256);
                    }

                    @Override // com.ss.android.socialbase.downloader.c.b
                    public final void a(Map map, Map map2) {
                        g.a(sparseArray, map);
                        g.a(sparseArray2, map2);
                        dVar.a();
                        f.this.a((b) null);
                    }
                });
                try {
                    z = !f.this.f60349j.await(5000, TimeUnit.MILLISECONDS);
                    if (z && (future = f.this.f60348i) != null) {
                        future.cancel(true);
                    }
                } catch (Throwable unused) {
                    z = false;
                }
                f fVar = f.this;
                try {
                    if (fVar.f60343a != null) {
                        fVar.f60343a.a();
                    }
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
                if (z && (dVar = dVar) != null) {
                    dVar.a();
                }
            }
        });
    }

    public final void a(b bVar) {
        MethodCollector.i(14058);
        synchronized (this) {
            try {
                c cVar = this.f60343a;
                if (cVar != null) {
                    try {
                        cVar.a(bVar);
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                } else {
                    this.f60345f = bVar;
                }
            } finally {
                MethodCollector.o(14058);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(DownloadChunk downloadChunk) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.a(downloadChunk);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean a(DownloadInfo downloadInfo) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.a(downloadInfo);
            }
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean e() {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.e();
            }
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public f() {
        SqlDownloadCacheService.a(c.B(), this);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> b() {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.b();
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void c() {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.c();
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean d() {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.d();
            }
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f60343a = null;
        f60340b = false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo b(int i2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.b(i2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean f(int i2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.f(i2);
            }
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo g(int i2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.g(i2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo h(int i2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.h(i2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo i(int i2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.i(i2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo j(int i2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.j(i2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadChunk> c(int i2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.c(i2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> d(String str) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.d(str);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean e(int i2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.e(i2);
            }
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> c(String str) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.c(str);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void d(int i2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.d(i2);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> a(String str) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.a(str);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> b(String str) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.b(str);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void b(DownloadChunk downloadChunk) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.b(downloadChunk);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void b(DownloadInfo downloadInfo) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.b(downloadInfo);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo a(int i2, int i3) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.a(i2, i3);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo c(int i2, long j2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.c(i2, j2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo d(int i2, long j2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.d(i2, j2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo a(int i2, long j2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.a(i2, j2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo b(int i2, long j2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.b(i2, j2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        c cVar;
        f60340b = true;
        this.f60344e.removeCallbacks(this.f60347h);
        if (iBinder == null) {
            cVar = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof c)) {
                    cVar = new c.a.C1312a(iBinder);
                } else {
                    cVar = (c) queryLocalInterface;
                }
            } catch (Throwable unused) {
            }
        }
        this.f60343a = cVar;
        this.f60348i = com.ss.android.socialbase.downloader.downloader.c.g().submit(new Runnable() {
            /* class com.ss.android.socialbase.downloader.c.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(37252);
            }

            /* JADX INFO: finally extract failed */
            public final void run() {
                IBinder iBinder;
                AnonymousClass1 r0;
                MethodCollector.i(13796);
                synchronized (this) {
                    try {
                        if (!(f.this.f60345f == null || f.this.f60343a == null)) {
                            f.this.f60343a.a(f.this.f60345f);
                        }
                        try {
                            f.this.f60349j.countDown();
                            try {
                                iBinder = iBinder;
                                r0 = new IBinder.DeathRecipient() {
                                    /* class com.ss.android.socialbase.downloader.c.f.AnonymousClass2.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(37253);
                                    }

                                    public final void binderDied() {
                                        f.f60340b = false;
                                        f fVar = f.this;
                                        if (Build.VERSION.SDK_INT < 26 && !f.f60340b) {
                                            if (f.f60341c > 5) {
                                                a.d("SqlDownloadCacheAidlWra", "bindMainProcess: bind too many times!!! ");
                                            } else {
                                                long currentTimeMillis = System.currentTimeMillis();
                                                if (currentTimeMillis - f.f60342d < 15000) {
                                                    a.d("SqlDownloadCacheAidlWra", "bindMainProcess: time too short since last bind!!! ");
                                                } else {
                                                    f.f60341c++;
                                                    f.f60342d = currentTimeMillis;
                                                    fVar.f60344e.postDelayed(new Runnable() {
                                                        /* class com.ss.android.socialbase.downloader.c.f.AnonymousClass3 */

                                                        static {
                                                            Covode.recordClassIndex(37254);
                                                        }

                                                        public final void run() {
                                                            SqlDownloadCacheService.a(com.ss.android.socialbase.downloader.downloader.c.B(), f.this);
                                                        }
                                                    }, 1000);
                                                    return;
                                                }
                                            }
                                        }
                                        if (f.this.f60346g != null) {
                                            f.this.f60344e.postDelayed(f.this.f60347h, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                                        }
                                    }
                                };
                                iBinder.linkToDeath(r0, 0);
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(13796);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        f.this.f60349j.countDown();
                        try {
                            iBinder.linkToDeath(new IBinder.DeathRecipient() {
                                /* class com.ss.android.socialbase.downloader.c.f.AnonymousClass2.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(37253);
                                }

                                public final void binderDied() {
                                    f.f60340b = false;
                                    f fVar = f.this;
                                    if (Build.VERSION.SDK_INT < 26 && !f.f60340b) {
                                        if (f.f60341c > 5) {
                                            a.d("SqlDownloadCacheAidlWra", "bindMainProcess: bind too many times!!! ");
                                        } else {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (currentTimeMillis - f.f60342d < 15000) {
                                                a.d("SqlDownloadCacheAidlWra", "bindMainProcess: time too short since last bind!!! ");
                                            } else {
                                                f.f60341c++;
                                                f.f60342d = currentTimeMillis;
                                                fVar.f60344e.postDelayed(new Runnable() {
                                                    /* class com.ss.android.socialbase.downloader.c.f.AnonymousClass3 */

                                                    static {
                                                        Covode.recordClassIndex(37254);
                                                    }

                                                    public final void run() {
                                                        SqlDownloadCacheService.a(com.ss.android.socialbase.downloader.downloader.c.B(), f.this);
                                                    }
                                                }, 1000);
                                                return;
                                            }
                                        }
                                    }
                                    if (f.this.f60346g != null) {
                                        f.this.f60344e.postDelayed(f.this.f60347h, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                                    }
                                }
                            }, 0);
                        } catch (Throwable unused2) {
                        }
                        MethodCollector.o(13796);
                        throw th2;
                    }
                }
                MethodCollector.o(13796);
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void b(int i2, List<DownloadChunk> list) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.b(i2, list);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(int i2, List<DownloadChunk> list) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.a(i2, list);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(int i2, int i3, long j2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.a(i2, i3, j2);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo a(int i2, long j2, String str, String str2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                return cVar.a(i2, j2, str, str2);
            }
            return null;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(int i2, int i3, int i4, int i5) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.a(i2, i3, i4, i5);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(int i2, int i3, int i4, long j2) {
        try {
            c cVar = this.f60343a;
            if (cVar != null) {
                cVar.a(i2, i3, i4, j2);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }
}
