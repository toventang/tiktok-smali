package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.ag;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.d;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.downloader.o;
import com.ss.android.socialbase.downloader.downloader.q;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.k.a;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final a f60659a;

    /* renamed from: b  reason: collision with root package name */
    private final l f60660b;

    /* renamed from: c  reason: collision with root package name */
    private final q f60661c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f60662d;

    static {
        Covode.recordClassIndex(37453);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void e() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, boolean z) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.a(i2, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean b(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            return aVar.p(i2);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(List<String> list) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.a(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, boolean z, boolean z2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.a(i2, z, z2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, IDownloadListener iDownloadListener, h hVar, boolean z, boolean z2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.a(i2, i3, iDownloadListener, hVar, z, z2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a2 = g.a(downloadInfo.getStatus(), downloadInfo.getSavePath(), downloadInfo.getName());
        if (a2) {
            if (a.a(33554432)) {
                a(downloadInfo.getId(), true, false);
            } else {
                int id = downloadInfo.getId();
                a aVar = this.f60659a;
                if (aVar != null) {
                    aVar.n(id);
                }
            }
        }
        return a2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, Notification notification) {
        q qVar = this.f60661c;
        if (qVar != null) {
            qVar.a(i2, notification);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(boolean z) {
        q qVar = this.f60661c;
        if (qVar != null) {
            qVar.a(z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(DownloadTask downloadTask) {
        q qVar = this.f60661c;
        if (qVar != null) {
            qVar.b(downloadTask);
        } else if (downloadTask != null) {
            com.ss.android.socialbase.downloader.f.a.a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "downloadServiceHandler is null"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, List<DownloadChunk> list) {
        this.f60660b.a(i2, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(DownloadChunk downloadChunk) {
        this.f60660b.a(downloadChunk);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, y yVar) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.a(i2, yVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, long j2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            DownloadInfo b2 = aVar.f60590d.b(i2);
            if (b2 != null) {
                b2.setThrottleNetSpeed(j2);
            }
            aVar.d(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(ag agVar) {
        if (agVar != null) {
            c.f60429d.add(agVar);
        }
    }

    public p() {
        this(false);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean f() {
        return this.f60660b.d();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void g() {
        this.f60660b.c();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> d() {
        l lVar = this.f60660b;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a() {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean c() {
        return c.C();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean h() {
        q qVar;
        if (!this.f60662d || (qVar = this.f60661c) == null || !qVar.a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean b() {
        q qVar = this.f60661c;
        if (qVar != null) {
            return qVar.b();
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void k(int i2) {
        com.ss.android.socialbase.downloader.e.a.f60494a = i2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void c(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.g(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void d(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.h(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadChunk> i(int i2) {
        return this.f60660b.c(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void j(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.o(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean n(int i2) {
        return this.f60660b.e(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void o(int i2) {
        this.f60660b.d(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean p(int i2) {
        return this.f60660b.f(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> a(String str) {
        a aVar = this.f60659a;
        if (aVar != null) {
            return aVar.a(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> c(String str) {
        l lVar = this.f60660b;
        if (lVar != null) {
            return lVar.c(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> e(String str) {
        a aVar = this.f60659a;
        if (aVar != null) {
            return aVar.b(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean g(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            return aVar.a(i2);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final DownloadInfo h(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            return aVar.e(i2);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean l(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            return aVar.l(i2);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final int m(int i2) {
        return d.a().a(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final y q(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            return aVar.j(i2);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final ac r(int i2) {
        ac i3;
        a aVar = this.f60659a;
        if (aVar == null || (i3 = aVar.i(i2)) == null) {
            return c.f60426a;
        }
        return i3;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final com.ss.android.socialbase.downloader.depend.q s(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            return aVar.k(i2);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> b(String str) {
        l lVar = this.f60660b;
        if (lVar != null) {
            return lVar.b(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final List<DownloadInfo> d(String str) {
        l lVar = this.f60660b;
        if (lVar != null) {
            return lVar.d(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final int f(int i2) {
        DownloadInfo e2;
        a aVar = this.f60659a;
        if (aVar == null || (e2 = aVar.e(i2)) == null) {
            return 0;
        }
        return e2.getStatus();
    }

    public p(boolean z) {
        this.f60659a = c.u();
        this.f60660b = c.q();
        if (!z) {
            this.f60661c = c.r();
        } else {
            this.f60661c = c.s();
        }
        this.f60662d = com.ss.android.socialbase.downloader.i.a.f60573a.a("service_alive", false);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.f(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final boolean c(DownloadInfo downloadInfo) {
        return this.f60660b.a(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final long e(int i2) {
        DownloadInfo b2;
        l lVar = this.f60660b;
        if (lVar == null || (b2 = lVar.b(i2)) == null) {
            return 0;
        }
        int chunkCount = b2.getChunkCount();
        if (chunkCount <= 1) {
            return b2.getCurBytes();
        }
        List<DownloadChunk> c2 = this.f60660b.c(i2);
        if (c2 == null || c2.size() != chunkCount) {
            return 0;
        }
        return g.b(c2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(DownloadInfo downloadInfo) {
        this.f60660b.b(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(DownloadTask downloadTask) {
        q qVar = this.f60661c;
        if (qVar != null) {
            qVar.c(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(List<String> list) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.b(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final int a(String str, String str2) {
        return c.a(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(int i2, List<DownloadChunk> list) {
        this.f60660b.b(i2, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final DownloadInfo b(String str, String str2) {
        return h(c.a(str, str2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3) {
        if (c.f60429d != null) {
            for (ag agVar : c.f60429d) {
                if (agVar != null) {
                    agVar.a(i3, i2);
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(int i2, boolean z) {
        d.a().a(i2, z);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, long j2) {
        this.f60660b.a(i2, i3, j2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, int i4, int i5) {
        this.f60660b.a(i2, i3, i4, i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, int i4, long j2) {
        this.f60660b.a(i2, i3, i4, j2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void b(int i2, int i3, IDownloadListener iDownloadListener, h hVar, boolean z) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.a(i2, i3, iDownloadListener, hVar, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.o
    public final void a(int i2, int i3, IDownloadListener iDownloadListener, h hVar, boolean z) {
        a aVar = this.f60659a;
        if (aVar != null) {
            aVar.b(i2, i3, iDownloadListener, hVar, z);
        }
    }
}
