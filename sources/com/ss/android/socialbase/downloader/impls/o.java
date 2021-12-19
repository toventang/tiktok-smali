package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.ag;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.d;
import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.downloader.q;
import com.ss.android.socialbase.downloader.e.a;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.k.h;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

public class o implements com.ss.android.socialbase.downloader.downloader.o, p {

    /* renamed from: a  reason: collision with root package name */
    private static final String f60654a = o.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private volatile k f60655b;

    /* renamed from: c  reason: collision with root package name */
    private q<IndependentProcessDownloadService> f60656c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.o f60657d = new p();

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.p
    public final void i() {
        this.f60655b = null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, boolean z) {
        if (this.f60655b != null) {
            try {
                this.f60655b.a(i2, z);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean b(int i2) {
        if (this.f60655b == null) {
            return false;
        }
        try {
            return this.f60655b.b(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(List<String> list) {
        if (this.f60655b == null) {
            this.f60657d.a(list);
            return;
        }
        try {
            this.f60655b.a(list);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, boolean z, boolean z2) {
        if (this.f60655b == null) {
            this.f60657d.a(i2, z, z2);
            return;
        }
        try {
            this.f60655b.a(i2, z, z2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, IDownloadListener iDownloadListener, h hVar, boolean z, boolean z2) {
        if (this.f60655b != null) {
            try {
                this.f60655b.a(i2, i3, com.ss.android.socialbase.downloader.k.h.a(iDownloadListener, hVar != h.SUB), hVar.ordinal(), z, z2);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean a(DownloadInfo downloadInfo) {
        if (this.f60655b == null) {
            return this.f60657d.a(downloadInfo);
        }
        try {
            this.f60655b.a(downloadInfo);
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, Notification notification) {
        if (this.f60655b == null) {
            a.d(f60654a, "startForeground, aidlService is null");
            return;
        }
        a.c(f60654a, "aidlService.startForeground, id = ".concat(String.valueOf(i2)));
        try {
            this.f60655b.a(i2, notification);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(boolean z) {
        if (this.f60655b == null) {
            a.d(f60654a, "stopForeground, aidlService is null");
            return;
        }
        a.c(f60654a, "aidlService.stopForeground");
        try {
            this.f60655b.a(z);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(DownloadTask downloadTask) {
        q<IndependentProcessDownloadService> qVar;
        if (downloadTask != null && (qVar = this.f60656c) != null) {
            qVar.b(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, List<DownloadChunk> list) {
        if (this.f60655b != null) {
            try {
                this.f60655b.b(i2, list);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(DownloadChunk downloadChunk) {
        if (this.f60655b == null) {
            this.f60657d.a(downloadChunk);
            return;
        }
        try {
            this.f60655b.a(downloadChunk);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(ag agVar) {
        h.AnonymousClass17 r0;
        if (this.f60655b != null) {
            try {
                k kVar = this.f60655b;
                if (agVar == null) {
                    r0 = null;
                } else {
                    r0 = new af.a(agVar) {
                        /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass17 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ ag f60796a;

                        static {
                            Covode.recordClassIndex(37506);
                        }

                        {
                            this.f60796a = r1;
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.af
                        public final void a(int i2, int i3) {
                            this.f60796a.a(i2, i3);
                        }
                    };
                }
                kVar.a(r0);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, y yVar) {
        if (this.f60655b != null) {
            try {
                this.f60655b.a(i2, com.ss.android.socialbase.downloader.k.h.a(yVar));
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.p
    public final void a(IBinder iBinder) {
        this.f60655b = k.a.a(iBinder);
        if (g.a()) {
            a(new ag() {
                /* class com.ss.android.socialbase.downloader.impls.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37452);
                }

                @Override // com.ss.android.socialbase.downloader.depend.ag
                public final void a(int i2, int i3) {
                    if (i3 == 1) {
                        Downloader.getInstance(c.B()).pause(i2);
                        List<DownloadChunk> i4 = l.a(false).i(i2);
                        if (i4 != null) {
                            l.a(true).a(i2, g.a(i4));
                        }
                    } else if (i3 == 2) {
                        Downloader.getInstance(c.B()).cancel(i2);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, long j2) {
        if (this.f60655b != null) {
            try {
                this.f60655b.a(i2, j2);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean c() {
        return c.C();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void e() {
        q<IndependentProcessDownloadService> qVar = this.f60656c;
        if (qVar != null) {
            qVar.g();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean h() {
        if (this.f60655b != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(37451);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a() {
        if (this.f60655b != null) {
            try {
                this.f60655b.a();
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    public o() {
        q<IndependentProcessDownloadService> s = c.s();
        this.f60656c = s;
        s.a(this);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> d() {
        if (this.f60655b == null) {
            return this.f60657d.d();
        }
        try {
            return this.f60655b.b();
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void g() {
        if (this.f60655b == null) {
            this.f60657d.g();
            return;
        }
        try {
            this.f60655b.e();
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean f() {
        if (this.f60655b == null) {
            return this.f60657d.f();
        }
        try {
            return this.f60655b.d();
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean b() {
        if (this.f60655b == null) {
            a.d(f60654a, "isServiceForeground, aidlService is null");
            return false;
        }
        a.c(f60654a, "aidlService.isServiceForeground");
        try {
            return this.f60655b.f();
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void k(int i2) {
        q<IndependentProcessDownloadService> qVar = this.f60656c;
        if (qVar != null) {
            qVar.a(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void c(int i2) {
        if (this.f60655b != null) {
            try {
                this.f60655b.c(i2);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void d(int i2) {
        if (this.f60655b != null) {
            try {
                this.f60655b.d(i2);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> a(String str) {
        if (this.f60655b == null) {
            return this.f60657d.a(str);
        }
        try {
            return this.f60655b.a(str);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> b(String str) {
        if (this.f60655b == null) {
            return this.f60657d.b(str);
        }
        try {
            return this.f60655b.b(str);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> c(String str) {
        if (this.f60655b == null) {
            return this.f60657d.c(str);
        }
        try {
            return this.f60655b.c(str);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final long e(int i2) {
        if (this.f60655b == null) {
            return 0;
        }
        try {
            return this.f60655b.e(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final int f(int i2) {
        if (this.f60655b == null) {
            return 0;
        }
        try {
            return this.f60655b.f(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final DownloadInfo h(int i2) {
        if (this.f60655b == null) {
            return this.f60657d.h(i2);
        }
        try {
            return this.f60655b.h(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadChunk> i(int i2) {
        if (this.f60655b == null) {
            return this.f60657d.i(i2);
        }
        try {
            return this.f60655b.i(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void j(int i2) {
        if (this.f60655b == null) {
            this.f60657d.j(i2);
            return;
        }
        try {
            this.f60655b.j(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean l(int i2) {
        if (this.f60655b == null) {
            return false;
        }
        try {
            return this.f60655b.k(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final int m(int i2) {
        if (this.f60655b == null) {
            return d.a().b(i2);
        }
        try {
            return this.f60655b.m(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean n(int i2) {
        if (this.f60655b == null) {
            return this.f60657d.n(i2);
        }
        try {
            return this.f60655b.n(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void o(int i2) {
        if (this.f60655b == null) {
            this.f60657d.o(i2);
            return;
        }
        try {
            this.f60655b.o(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean p(int i2) {
        if (this.f60655b == null) {
            return this.f60657d.p(i2);
        }
        try {
            return this.f60655b.p(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final y q(int i2) {
        if (this.f60655b == null) {
            return null;
        }
        try {
            return com.ss.android.socialbase.downloader.k.h.a(this.f60655b.q(i2));
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final ac r(int i2) {
        if (this.f60655b == null) {
            return null;
        }
        try {
            return com.ss.android.socialbase.downloader.k.h.a(this.f60655b.r(i2));
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final com.ss.android.socialbase.downloader.depend.q s(int i2) {
        if (this.f60655b == null) {
            return null;
        }
        try {
            return com.ss.android.socialbase.downloader.k.h.a(this.f60655b.s(i2));
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2) {
        if (this.f60655b != null) {
            try {
                this.f60655b.a(i2);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean c(DownloadInfo downloadInfo) {
        if (this.f60655b == null) {
            return this.f60657d.c(downloadInfo);
        }
        try {
            return this.f60655b.b(downloadInfo);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> d(String str) {
        if (this.f60655b == null) {
            return this.f60657d.d(str);
        }
        try {
            return this.f60655b.e(str);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> e(String str) {
        if (this.f60655b == null) {
            return null;
        }
        try {
            return this.f60655b.d(str);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean g(int i2) {
        if (this.f60655b == null) {
            return false;
        }
        try {
            return this.f60655b.g(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(DownloadTask downloadTask) {
        q<IndependentProcessDownloadService> qVar;
        if (downloadTask != null && (qVar = this.f60656c) != null) {
            qVar.c(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(List<String> list) {
        if (this.f60655b == null) {
            this.f60657d.b(list);
            return;
        }
        try {
            this.f60655b.b(list);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final int a(String str, String str2) {
        return c.a(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final DownloadInfo b(String str, String str2) {
        return h(c.a(str, str2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3) {
        if (this.f60655b != null) {
            try {
                this.f60655b.a(i2, i3);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(int i2, List<DownloadChunk> list) {
        if (this.f60655b == null) {
            this.f60657d.b(i2, list);
            return;
        }
        try {
            this.f60655b.a(i2, list);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(int i2, boolean z) {
        if (this.f60655b != null) {
            try {
                this.f60655b.c(i2, z);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, long j2) {
        if (this.f60655b == null) {
            this.f60657d.a(i2, i3, j2);
            return;
        }
        try {
            this.f60655b.a(i2, i3, j2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, int i4, int i5) {
        if (this.f60655b == null) {
            this.f60657d.a(i2, i3, i4, i5);
            return;
        }
        try {
            this.f60655b.a(i2, i3, i4, i5);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, int i4, long j2) {
        if (this.f60655b == null) {
            this.f60657d.a(i2, i3, i4, j2);
            return;
        }
        try {
            this.f60655b.a(i2, i3, i4, j2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(int i2, int i3, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.b.h hVar, boolean z) {
        boolean z2;
        if (this.f60655b != null) {
            try {
                k kVar = this.f60655b;
                if (hVar == com.ss.android.socialbase.downloader.b.h.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                kVar.a(i2, i3, com.ss.android.socialbase.downloader.k.h.a(iDownloadListener, z2), hVar.ordinal(), z);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.b.h hVar, boolean z) {
        boolean z2;
        if (this.f60655b != null) {
            try {
                k kVar = this.f60655b;
                if (hVar == com.ss.android.socialbase.downloader.b.h.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                kVar.b(i2, i3, com.ss.android.socialbase.downloader.k.h.a(iDownloadListener, z2), hVar.ordinal(), z);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }
}
