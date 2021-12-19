package com.ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.a.a;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.i.a;
import com.ss.android.socialbase.downloader.j.f;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    final List<k> f60912a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f60913b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f60914c;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f60915d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f60916e;

    /* renamed from: f  reason: collision with root package name */
    private final List<k> f60917f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final DownloadInfo f60918g;

    /* renamed from: h  reason: collision with root package name */
    private final l f60919h;

    /* renamed from: i  reason: collision with root package name */
    private final a f60920i;

    /* renamed from: j  reason: collision with root package name */
    private final f f60921j;

    /* renamed from: k  reason: collision with root package name */
    private final c f60922k;

    /* renamed from: l  reason: collision with root package name */
    private BaseException f60923l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.a.a f60924m;
    private final boolean n;
    private final long o;
    private final long p;
    private final boolean q;
    private long r;
    private volatile long s;

    static {
        Covode.recordClassIndex(37561);
    }

    private void a() {
        long j2;
        MethodCollector.i(13450);
        boolean z = this.q;
        if (z) {
            j2 = System.nanoTime();
        } else {
            j2 = 0;
        }
        DownloadInfo downloadInfo = this.f60918g;
        l lVar = this.f60919h;
        List<k> list = this.f60912a;
        List<k> list2 = this.f60917f;
        Map<Long, i> k2 = lVar.k(downloadInfo.getId());
        if (k2 == null) {
            k2 = new HashMap<>(4);
        }
        boolean z2 = false;
        synchronized (this) {
            try {
                a(list);
                try {
                    b(list);
                    z2 = true;
                } catch (Throwable unused) {
                }
                a(list, k2);
                if (list2.size() > 0) {
                    c(list2);
                    list.removeAll(list2);
                    list2.clear();
                }
            } finally {
                MethodCollector.o(13450);
            }
        }
        if (z2) {
            downloadInfo.updateRealDownloadTime(true);
            lVar.a(downloadInfo.getId(), k2);
            lVar.a(downloadInfo);
            this.f60916e = downloadInfo.getCurBytes();
        }
        if (z) {
            this.r += System.nanoTime() - j2;
        }
    }

    private static void a(List<k> list) {
        for (k kVar : list) {
            c cVar = kVar.f60952b;
            if (cVar.f60865a != null) {
                cVar.f60865a.flush();
            }
        }
    }

    private static void b(List<k> list) {
        for (k kVar : list) {
            c cVar = kVar.f60952b;
            if (cVar.f60866b != null) {
                cVar.f60866b.sync();
            }
        }
    }

    private static void c(List<k> list) {
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            com.ss.android.socialbase.downloader.k.g.a(it.next().f60952b);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01ba, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01bc, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01be, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e2, code lost:
        if (r19 <= 500) goto L_0x00e9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01ba A[ExcHandler: all (th java.lang.Throwable), Splitter:B:55:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e4 A[Catch:{ all -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x028f A[Catch:{ BaseException -> 0x0284, all -> 0x03e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0297 A[SYNTHETIC, Splitter:B:210:0x0297] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x02ae A[SYNTHETIC, Splitter:B:216:0x02ae] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0322 A[Catch:{ all -> 0x03d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x03b7 A[Catch:{ all -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x03ed A[SYNTHETIC, Splitter:B:311:0x03ed] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0404 A[SYNTHETIC, Splitter:B:317:0x0404] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ed A[Catch:{ StreamClosedException -> 0x01cb, BaseException -> 0x01c5, all -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.socialbase.downloader.segment.d r30) {
        /*
        // Method dump skipped, instructions count: 1123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.g.a(com.ss.android.socialbase.downloader.segment.d):void");
    }

    private static void a(List<k> list, Map<Long, i> map) {
        for (k kVar : list) {
            i iVar = kVar.f60951a;
            i iVar2 = map.get(Long.valueOf(iVar.f60927a));
            if (iVar2 == null) {
                map.put(Long.valueOf(iVar.f60927a), new i(iVar));
            } else {
                iVar2.a(iVar.c());
                iVar2.b(iVar.f60929c);
            }
        }
    }

    g(DownloadInfo downloadInfo, f fVar, c cVar) {
        boolean z;
        boolean z2 = false;
        this.f60913b = false;
        this.f60914c = false;
        this.f60915d = false;
        this.f60916e = 0;
        this.s = 0;
        this.f60918g = downloadInfo;
        this.f60919h = com.ss.android.socialbase.downloader.downloader.c.q();
        this.f60921j = fVar;
        this.f60922k = cVar;
        this.f60924m = a.b.f60273a;
        com.ss.android.socialbase.downloader.i.a a2 = com.ss.android.socialbase.downloader.i.a.a(downloadInfo.getId(), (DownloadInfo) null);
        this.f60920i = a2;
        if (a2.a("sync_strategy", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.n = z;
        if (z) {
            this.o = Math.max((long) a2.a("sync_interval_ms_fg", 5000), 500L);
            this.p = Math.max((long) a2.a("sync_interval_ms_bg", 1000), 500L);
        } else {
            this.o = 0;
            this.p = 0;
        }
        this.q = a2.a("monitor_rw", 0) == 1 ? true : z2;
    }
}
