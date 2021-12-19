package com.ss.android.socialbase.downloader.j;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.b.j;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.i.a;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f60723a = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Download_OP_Thread"));

    /* renamed from: b  reason: collision with root package name */
    public volatile SparseArray<c> f60724b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public int f60725c;

    static {
        Covode.recordClassIndex(37467);
    }

    public final void a() {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f60724b.size(); i2++) {
                int keyAt = this.f60724b.keyAt(i2);
                if (!this.f60724b.get(keyAt).f60711d.get()) {
                    arrayList.add(Integer.valueOf(keyAt));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                try {
                    Integer num = (Integer) arrayList.get(i3);
                    if (num != null) {
                        this.f60724b.remove(num.intValue());
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final List<Integer> b() {
        ArrayList arrayList;
        MethodCollector.i(12526);
        synchronized (d.class) {
            try {
                a();
                arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.f60724b.size(); i2++) {
                    c cVar = this.f60724b.get(this.f60724b.keyAt(i2));
                    if (cVar != null) {
                        arrayList.add(Integer.valueOf(cVar.e()));
                    }
                }
            } finally {
                MethodCollector.o(12526);
            }
        }
        return arrayList;
    }

    public final boolean a(int i2) {
        MethodCollector.i(12085);
        synchronized (d.class) {
            try {
                boolean z = false;
                if (this.f60724b == null || this.f60724b.size() <= 0) {
                    return false;
                }
                c cVar = this.f60724b.get(i2);
                if (cVar != null && cVar.f60711d.get()) {
                    z = true;
                }
                MethodCollector.o(12085);
                return z;
            } finally {
                MethodCollector.o(12085);
            }
        }
    }

    public final void c(int i2) {
        MethodCollector.i(12385);
        synchronized (d.class) {
            try {
                a();
                c cVar = this.f60724b.get(i2);
                if (cVar != null) {
                    cVar.a();
                    a(cVar);
                    this.f60724b.remove(i2);
                }
            } finally {
                MethodCollector.o(12385);
            }
        }
    }

    private static void a(c cVar) {
        Future future;
        if (cVar != null) {
            try {
                ExecutorService j2 = c.j();
                DownloadTask downloadTask = cVar.f60709b;
                if (!(downloadTask == null || downloadTask.getDownloadInfo() == null)) {
                    int executorGroup = downloadTask.getDownloadInfo().getExecutorGroup();
                    if (executorGroup == 3) {
                        j2 = c.h();
                    } else if (executorGroup == 4) {
                        j2 = c.i();
                    }
                }
                if (j2 != null && (j2 instanceof ThreadPoolExecutor)) {
                    ((ThreadPoolExecutor) j2).remove(cVar);
                    if (a.a(cVar.e(), (DownloadInfo) null).a("pause_with_interrupt", false) && (future = cVar.f60708a) != null) {
                        future.cancel(true);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final c b(int i2) {
        MethodCollector.i(12240);
        synchronized (d.class) {
            try {
                a();
                c cVar = this.f60724b.get(i2);
                if (cVar != null) {
                    cVar.f60712e = j.RUN_STATUS_CANCELED;
                    if (cVar.f60717j != null) {
                        cVar.f60717j.a();
                    }
                    if (cVar.f60710c != null) {
                        cVar.f60710c.b();
                    }
                    if (cVar.f60717j == null && cVar.f60710c == null) {
                        cVar.c();
                        cVar.f60712e = j.RUN_STATUS_CANCELED;
                        cVar.b();
                    }
                    cVar.f();
                    a(cVar);
                    this.f60724b.remove(i2);
                    return cVar;
                }
                MethodCollector.o(12240);
                return null;
            } finally {
                MethodCollector.o(12240);
            }
        }
    }
}
