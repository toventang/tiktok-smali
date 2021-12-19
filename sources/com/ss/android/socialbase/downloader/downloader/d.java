package com.ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f60439c;

    /* renamed from: a  reason: collision with root package name */
    public Handler f60440a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    volatile List<aa> f60441b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private volatile SparseArray<Boolean> f60442d = new SparseArray<>();

    static {
        Covode.recordClassIndex(37345);
    }

    public static d a() {
        MethodCollector.i(13120);
        if (f60439c == null) {
            synchronized (d.class) {
                try {
                    f60439c = new d();
                } catch (Throwable th) {
                    MethodCollector.o(13120);
                    throw th;
                }
            }
        }
        d dVar = f60439c;
        MethodCollector.o(13120);
        return dVar;
    }

    public final void b() {
        MethodCollector.i(13202);
        synchronized (this.f60441b) {
            try {
                Iterator<aa> it = this.f60441b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.o(13202);
            }
        }
    }

    public final boolean d(int i2) {
        o c2 = c(i2);
        if (c2 == null) {
            return false;
        }
        return c2.g(i2);
    }

    public final o c(int i2) {
        boolean z = true;
        if (a(i2) != 1 || g.c()) {
            z = false;
        }
        return l.a(z);
    }

    public final synchronized int b(int i2) {
        MethodCollector.i(13280);
        if (this.f60442d.get(i2) == null) {
            MethodCollector.o(13280);
            return -1;
        } else if (this.f60442d.get(i2).booleanValue()) {
            MethodCollector.o(13280);
            return 1;
        } else {
            MethodCollector.o(13280);
            return 0;
        }
    }

    public final int a(int i2) {
        if (!c.E()) {
            return -1;
        }
        if (g.c() || !l.a(true).h()) {
            return b(i2);
        }
        return l.a(true).m(i2);
    }

    public final o a(DownloadTask downloadTask) {
        boolean z;
        List<DownloadChunk> i2;
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return null;
        }
        boolean isNeedIndependentProcess = downloadInfo.isNeedIndependentProcess();
        boolean z2 = true;
        if (g.c() || !g.a()) {
            isNeedIndependentProcess = true;
        }
        int a2 = a(downloadInfo.getId());
        if (a2 >= 0 && a2 != isNeedIndependentProcess) {
            if (a2 == 1) {
                try {
                    if (g.a()) {
                        l.a(true).a(downloadInfo.getId());
                        DownloadInfo h2 = l.a(true).h(downloadInfo.getId());
                        if (h2 != null) {
                            l.a(false).b(h2);
                        }
                        if (h2.getChunkCount() > 1 && (i2 = l.a(true).i(downloadInfo.getId())) != null) {
                            l.a(false).a(downloadInfo.getId(), g.a(i2));
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (g.a()) {
                l.a(false).a(downloadInfo.getId());
                List<DownloadChunk> i3 = l.a(false).i(downloadInfo.getId());
                if (i3 != null) {
                    l.a(true).a(downloadInfo.getId(), g.a(i3));
                }
            } else {
                downloadTask.setNeedDelayForCacheSync(true);
                l.a(true).a(1, downloadInfo.getId());
            }
        }
        int id = downloadInfo.getId();
        if (isNeedIndependentProcess) {
            z = true;
        } else {
            z = false;
        }
        a(id, z);
        if (!isNeedIndependentProcess) {
            z2 = false;
        }
        return l.a(z2);
    }

    public final void c(int i2, boolean z) {
        o c2 = c(i2);
        if (c2 != null) {
            c2.a(i2, z, true);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.d.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public final synchronized void b(int i2, boolean z) {
        Boolean bool;
        MethodCollector.i(13278);
        SparseArray<Boolean> sparseArray = this.f60442d;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        sparseArray.put(i2, bool);
        MethodCollector.o(13278);
    }

    public final void a(int i2, boolean z) {
        b(i2, z);
        if (c.E() && !g.c() && l.a(true).h()) {
            l.a(true).b(i2, z);
        }
        if (!c.c() && !g.c() && !g.a()) {
            try {
                Intent intent = new Intent(c.B(), DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
                intent.putExtra("extra_download_id", i2);
                a(c.B(), intent);
            } catch (Throwable unused) {
            }
        }
    }

    static List<DownloadInfo> a(List<DownloadInfo> list, List<DownloadInfo> list2, SparseArray<DownloadInfo> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            for (DownloadInfo downloadInfo2 : list2) {
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i2)));
        }
        return arrayList;
    }

    public final void a(int i2, IDownloadListener iDownloadListener, h hVar, boolean z) {
        int hashCode;
        o c2 = c(i2);
        if (c2 != null) {
            if (iDownloadListener == null) {
                hashCode = 0;
            } else {
                hashCode = iDownloadListener.hashCode();
            }
            c2.b(i2, hashCode, iDownloadListener, hVar, z);
        }
    }

    public final void b(int i2, IDownloadListener iDownloadListener, h hVar, boolean z) {
        o c2 = c(i2);
        if (c2 != null) {
            c2.a(i2, iDownloadListener.hashCode(), iDownloadListener, hVar, z);
        }
    }
}
