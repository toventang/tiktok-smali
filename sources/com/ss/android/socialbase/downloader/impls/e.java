package com.ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.b.f;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.e.a;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.g.i;
import com.ss.android.socialbase.downloader.j.c;
import com.ss.android.socialbase.downloader.j.d;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public final class e extends a {

    /* renamed from: f  reason: collision with root package name */
    private static d f60628f;

    static {
        Covode.recordClassIndex(37437);
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public final List<Integer> a() {
        return f60628f.b();
    }

    public e() {
        f60628f = new d();
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public final void b(int i2) {
        d dVar = f60628f;
        if (dVar != null) {
            dVar.c(i2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.socialbase.downloader.impls.a
    public final c c(int i2) {
        d dVar = f60628f;
        if (dVar == null) {
            return null;
        }
        return dVar.b(i2);
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public final void d(int i2) {
        c cVar;
        d dVar = f60628f;
        if (dVar != null && (cVar = dVar.f60724b.get(i2)) != null) {
            i iVar = cVar.f60715h;
        }
    }

    public static List<Future> c(List<Runnable> list) {
        ExecutorService k2 = com.ss.android.socialbase.downloader.downloader.c.k();
        ArrayList arrayList = new ArrayList(list.size());
        for (Runnable runnable : list) {
            arrayList.add(k2.submit(runnable));
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|(2:10|(1:12))(1:13)|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13687);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002f */
    @Override // com.ss.android.socialbase.downloader.impls.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.socialbase.downloader.j.c r6) {
        /*
            r5 = this;
            r4 = 13687(0x3577, float:1.918E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            com.ss.android.socialbase.downloader.j.d r3 = com.ss.android.socialbase.downloader.impls.e.f60628f
            if (r3 != 0) goto L_0x000d
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x000d:
            java.lang.Class<com.ss.android.socialbase.downloader.j.d> r2 = com.ss.android.socialbase.downloader.j.d.class
            monitor-enter(r2)
            r0 = 524288(0x80000, float:7.34684E-40)
            boolean r0 = com.ss.android.socialbase.downloader.k.a.a(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0026
            android.util.SparseArray<com.ss.android.socialbase.downloader.j.c> r0 = r3.f60724b     // Catch:{ all -> 0x002f }
            int r1 = r0.indexOfValue(r6)     // Catch:{ all -> 0x002f }
            if (r1 < 0) goto L_0x002f
            android.util.SparseArray<com.ss.android.socialbase.downloader.j.c> r0 = r3.f60724b     // Catch:{ all -> 0x002f }
            r0.removeAt(r1)     // Catch:{ all -> 0x002f }
            goto L_0x002f
        L_0x0026:
            android.util.SparseArray<com.ss.android.socialbase.downloader.j.c> r1 = r3.f60724b     // Catch:{ all -> 0x002f }
            int r0 = r6.e()     // Catch:{ all -> 0x002f }
            r1.remove(r0)     // Catch:{ all -> 0x002f }
        L_0x002f:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.e.a(com.ss.android.socialbase.downloader.j.c):void");
    }

    public static Runnable d(List<Future> list) {
        BlockingQueue<Runnable> queue;
        Runnable runnable;
        if (list != null && !list.isEmpty()) {
            try {
                ExecutorService k2 = com.ss.android.socialbase.downloader.downloader.c.k();
                if ((k2 instanceof ThreadPoolExecutor) && (queue = ((ThreadPoolExecutor) k2).getQueue()) != null && !queue.isEmpty()) {
                    Iterator<Future> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            runnable = null;
                            break;
                        }
                        Future next = it.next();
                        if ((next instanceof Runnable) && queue.remove(next)) {
                            runnable = (Runnable) next;
                            break;
                        }
                    }
                    if (runnable != null) {
                        list.remove(runnable);
                        return runnable;
                    }
                }
            } catch (Throwable th) {
                a.d("DefaultDownloadEngine", "getUnstartedTask() error: " + th.toString());
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public final boolean a(int i2) {
        DownloadInfo e2;
        d dVar = f60628f;
        if (dVar == null || !dVar.a(i2) || (e2 = e(i2)) == null) {
            return false;
        }
        if (f.a(e2.getStatus())) {
            return true;
        }
        b(i2);
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.impls.a
    public final void a(int i2, DownloadTask downloadTask) {
        int i3;
        int i4;
        MethodCollector.i(13852);
        if (downloadTask == null) {
            MethodCollector.o(13852);
            return;
        }
        a.b("DownloadTask", "start doDownload for task : ".concat(String.valueOf(i2)));
        c cVar = new c(downloadTask, this.f60591e);
        d dVar = f60628f;
        cVar.f60716i = System.currentTimeMillis();
        cVar.f60714g.a();
        synchronized (d.class) {
            try {
                i3 = 0;
                if (dVar.f60725c >= 500) {
                    dVar.a();
                    dVar.f60725c = 0;
                } else {
                    dVar.f60725c++;
                }
                dVar.f60724b.put(cVar.e(), cVar);
            } finally {
                MethodCollector.o(13852);
            }
        }
        DownloadTask downloadTask2 = cVar.f60709b;
        try {
            ExecutorService j2 = com.ss.android.socialbase.downloader.downloader.c.j();
            if (!(downloadTask2 == null || downloadTask2.getDownloadInfo() == null)) {
                if ("mime_type_plg".equals(downloadTask2.getDownloadInfo().getMimeType()) && com.ss.android.socialbase.downloader.i.a.f60573a.a("divide_plugin", 1) == 1) {
                    downloadTask2.getDownloadInfo().safePutToDBJsonData("executor_group", 3);
                }
                int executorGroup = downloadTask2.getDownloadInfo().getExecutorGroup();
                if (executorGroup == 3) {
                    j2 = com.ss.android.socialbase.downloader.downloader.c.h();
                } else if (executorGroup == 4) {
                    j2 = com.ss.android.socialbase.downloader.downloader.c.i();
                }
            }
            if (j2 == null) {
                w monitorDepend = downloadTask2.getMonitorDepend();
                DownloadInfo downloadInfo = downloadTask2.getDownloadInfo();
                BaseException baseException = new BaseException(1003, "execute failed cpu thread executor service is null");
                if (downloadTask2.getDownloadInfo() != null) {
                    i4 = downloadTask2.getDownloadInfo().getStatus();
                } else {
                    i4 = 0;
                }
                com.ss.android.socialbase.downloader.f.a.a(monitorDepend, downloadInfo, baseException, i4);
            } else if (com.ss.android.socialbase.downloader.i.a.a(cVar.e(), (DownloadInfo) null).a("pause_with_interrupt", false)) {
                cVar.f60708a = j2.submit(cVar);
                MethodCollector.o(13852);
            } else {
                j2.execute(cVar);
                MethodCollector.o(13852);
            }
        } catch (Exception e2) {
            if (downloadTask2 != null) {
                w monitorDepend2 = downloadTask2.getMonitorDepend();
                DownloadInfo downloadInfo2 = downloadTask2.getDownloadInfo();
                BaseException baseException2 = new BaseException(1003, g.b(e2, "DownloadThreadPoolExecute"));
                if (downloadTask2.getDownloadInfo() != null) {
                    i3 = downloadTask2.getDownloadInfo().getStatus();
                }
                com.ss.android.socialbase.downloader.f.a.a(monitorDepend2, downloadInfo2, baseException2, i3);
            }
            e2.printStackTrace();
            MethodCollector.o(13852);
        } catch (OutOfMemoryError e3) {
            if (downloadTask2 != null) {
                w monitorDepend3 = downloadTask2.getMonitorDepend();
                DownloadInfo downloadInfo3 = downloadTask2.getDownloadInfo();
                BaseException baseException3 = new BaseException(1003, "execute OOM");
                if (downloadTask2.getDownloadInfo() != null) {
                    i3 = downloadTask2.getDownloadInfo().getStatus();
                }
                com.ss.android.socialbase.downloader.f.a.a(monitorDepend3, downloadInfo3, baseException3, i3);
            }
            e3.printStackTrace();
            MethodCollector.o(13852);
        }
    }
}
