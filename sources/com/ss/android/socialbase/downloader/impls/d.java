package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.c.e;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.downloader.n;
import com.ss.android.socialbase.downloader.downloader.o;
import com.ss.android.socialbase.downloader.downloader.v;
import com.ss.android.socialbase.downloader.e.a;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.j.h;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.segment.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class d implements l {

    /* renamed from: a  reason: collision with root package name */
    public final k f60616a = new k();

    /* renamed from: b  reason: collision with root package name */
    public v f60617b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f60618c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f60619d;

    /* renamed from: e  reason: collision with root package name */
    private h.a f60620e = new h.a() {
        /* class com.ss.android.socialbase.downloader.impls.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37433);
        }

        @Override // com.ss.android.socialbase.downloader.j.h.a
        public final void a(Message message) {
            if (message.what == 1) {
                c.g().execute(new Runnable() {
                    /* class com.ss.android.socialbase.downloader.impls.d.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37434);
                    }

                    public final void run() {
                        try {
                            d.this.f();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                });
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private h f60621f = null;

    static {
        Covode.recordClassIndex(37432);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean d() {
        return this.f60618c;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(DownloadChunk downloadChunk) {
        this.f60616a.a(downloadChunk);
        if (g.b()) {
            o a2 = l.a(true);
            if (a2 != null) {
                a2.a(downloadChunk);
            } else {
                this.f60617b.a(downloadChunk);
            }
        } else {
            this.f60617b.a(downloadChunk);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a2 = this.f60616a.a(downloadInfo);
        a(downloadInfo, true);
        return a2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(int i2, List<DownloadChunk> list) {
        if (list != null && list.size() != 0) {
            this.f60616a.a(i2, list);
            if (g.c()) {
                this.f60617b.b(i2, list);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean a(int i2, Map<Long, i> map) {
        this.f60616a.a(i2, map);
        this.f60617b.a(i2, map);
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> b() {
        return this.f60616a.b();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void c() {
        try {
            this.f60616a.c();
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
        if (g.b()) {
            o a2 = l.a(true);
            if (a2 != null) {
                a2.g();
            } else {
                this.f60617b.c();
            }
        } else {
            this.f60617b.c();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean e() {
        MethodCollector.i(14221);
        if (this.f60618c) {
            MethodCollector.o(14221);
            return true;
        }
        synchronized (this) {
            try {
                if (!this.f60618c) {
                    a.d("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting start!!!!");
                    try {
                        wait(5000);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    a.d("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting end!!!!");
                }
            } catch (Throwable th) {
                MethodCollector.o(14221);
                throw th;
            }
        }
        boolean z = this.f60618c;
        MethodCollector.o(14221);
        return z;
    }

    public d() {
        if (!com.ss.android.socialbase.downloader.i.a.f60573a.a("fix_sigbus_downloader_db", false)) {
            this.f60617b = new e();
        } else if (g.a() || !c.E()) {
            this.f60617b = new e();
        } else {
            this.f60617b = c.f60427b.a(new c.a.AbstractC1328a() {
                /* class com.ss.android.socialbase.downloader.impls.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(37435);
                }

                @Override // com.ss.android.socialbase.downloader.downloader.c.a.AbstractC1328a
                public final void a() {
                    d.this.f60617b = new e();
                }
            });
        }
        this.f60618c = false;
        this.f60621f = new h(Looper.getMainLooper(), this.f60620e);
        g();
    }

    private void g() {
        List<DownloadChunk> list;
        DownloadInfo downloadInfo;
        MethodCollector.i(14192);
        c.a(com.ss.android.socialbase.downloader.b.d.SYNC_START);
        final SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        final SparseArray<List<DownloadChunk>> sparseArray2 = new SparseArray<>();
        synchronized (this.f60616a) {
            try {
                SparseArray<DownloadInfo> sparseArray3 = this.f60616a.f60643a;
                for (int i2 = 0; i2 < sparseArray3.size(); i2++) {
                    int keyAt = sparseArray3.keyAt(i2);
                    if (!(keyAt == 0 || (downloadInfo = sparseArray3.get(keyAt)) == null)) {
                        sparseArray.put(keyAt, downloadInfo);
                    }
                }
                SparseArray<List<DownloadChunk>> sparseArray4 = this.f60616a.f60644b;
                for (int i3 = 0; i3 < sparseArray4.size(); i3++) {
                    int keyAt2 = sparseArray4.keyAt(i3);
                    if (!(keyAt2 == 0 || (list = sparseArray4.get(keyAt2)) == null)) {
                        sparseArray2.put(keyAt2, new CopyOnWriteArrayList(list));
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(14192);
                throw th;
            }
        }
        this.f60617b.a(sparseArray, sparseArray2, new com.ss.android.socialbase.downloader.c.d() {
            /* class com.ss.android.socialbase.downloader.impls.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(37436);
            }

            @Override // com.ss.android.socialbase.downloader.c.d
            public final void a() {
                MethodCollector.i(13530);
                synchronized (d.this.f60616a) {
                    try {
                        SparseArray<DownloadInfo> sparseArray = d.this.f60616a.f60643a;
                        if (sparseArray != null) {
                            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                                int keyAt = sparseArray.keyAt(i2);
                                if (keyAt != 0) {
                                    sparseArray.put(keyAt, (DownloadInfo) sparseArray.get(keyAt));
                                }
                            }
                        }
                        SparseArray<List<DownloadChunk>> sparseArray2 = d.this.f60616a.f60644b;
                        if (sparseArray2 != null) {
                            for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                                int keyAt2 = sparseArray2.keyAt(i3);
                                if (keyAt2 != 0) {
                                    sparseArray2.put(keyAt2, (List) sparseArray2.get(keyAt2));
                                }
                            }
                        }
                    } finally {
                        MethodCollector.o(13530);
                    }
                }
                d dVar = d.this;
                synchronized (dVar) {
                    try {
                        dVar.f60618c = true;
                        dVar.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                d.this.a();
                c.a(com.ss.android.socialbase.downloader.b.d.SYNC_SUCCESS);
                MethodCollector.o(13530);
            }
        });
        MethodCollector.o(14192);
    }

    public final void a() {
        long j2;
        if (com.ss.android.socialbase.downloader.i.a.f60573a.a("task_resume_delay", false)) {
            j2 = 4000;
        } else if (Build.VERSION.SDK_INT >= 23) {
            j2 = 1000;
        } else {
            j2 = 5000;
        }
        this.f60621f.sendMessageDelayed(this.f60621f.obtainMessage(1), j2);
    }

    public final void f() {
        List<String> list;
        ArrayList arrayList;
        DownloadInfo downloadInfo;
        DownloadInfo downloadInfo2;
        MethodCollector.i(14251);
        if (!this.f60618c) {
            MethodCollector.o(14251);
        } else if (this.f60619d) {
            a.b("DefaultDownloadCache", "resumeUnCompleteTask: has resumed, return!!!");
            MethodCollector.o(14251);
        } else {
            this.f60619d = true;
            if (!g.a()) {
                MethodCollector.o(14251);
                return;
            }
            n p = c.p();
            if (p != null) {
                list = p.a();
                arrayList = (list == null || list.isEmpty()) ? null : new ArrayList();
            } else {
                list = null;
                arrayList = null;
            }
            SparseArray sparseArray = new SparseArray();
            synchronized (this) {
                try {
                    SparseArray<DownloadInfo> sparseArray2 = this.f60616a.f60643a;
                    for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                        int keyAt = sparseArray2.keyAt(i2);
                        if (!(keyAt == 0 || (downloadInfo2 = sparseArray2.get(keyAt)) == null)) {
                            sparseArray.put(keyAt, downloadInfo2);
                        }
                    }
                } finally {
                    MethodCollector.o(14251);
                }
            }
            if (sparseArray.size() == 0) {
                MethodCollector.o(14251);
                return;
            }
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                int keyAt2 = sparseArray.keyAt(i3);
                if (!(keyAt2 == 0 || (downloadInfo = (DownloadInfo) sparseArray.get(keyAt2)) == null)) {
                    int realStatus = downloadInfo.getRealStatus();
                    int statusAtDbInit = downloadInfo.getStatusAtDbInit();
                    if (statusAtDbInit > 0 && statusAtDbInit <= 11) {
                        com.ss.android.socialbase.downloader.f.a.a(c.f60428c, downloadInfo, (BaseException) null, -5);
                    }
                    if (!(list == null || arrayList == null || downloadInfo.getMimeType() == null || !list.contains(downloadInfo.getMimeType()) || (com.ss.android.socialbase.downloader.i.a.a(downloadInfo.getId(), (DownloadInfo) null).a("enable_notification_ui", 0) < 2 && realStatus == -2 && !downloadInfo.isPauseReserveOnWifi()))) {
                        downloadInfo.setDownloadFromReserveWifi(false);
                        arrayList.add(downloadInfo);
                    }
                }
            }
            if (!(p == null || arrayList == null)) {
                arrayList.isEmpty();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> a(String str) {
        return this.f60616a.a(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo b(int i2) {
        return this.f60616a.b(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadChunk> c(int i2) {
        return this.f60616a.c(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> d(String str) {
        return this.f60616a.d(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo g(int i2) {
        DownloadInfo g2 = this.f60616a.g(i2);
        a(g2, true);
        return g2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo h(int i2) {
        DownloadInfo h2 = this.f60616a.h(i2);
        a(h2, true);
        return h2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo i(int i2) {
        DownloadInfo i3 = this.f60616a.i(i2);
        a(i3, true);
        return i3;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo j(int i2) {
        DownloadInfo j2 = this.f60616a.j(i2);
        a(j2, true);
        return j2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void l(int i2) {
        this.f60616a.l(i2);
        this.f60617b.l(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> c(String str) {
        return this.f60616a.c(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final Map<Long, i> k(int i2) {
        Map<Long, i> k2 = this.f60616a.k(i2);
        if (k2 != null && !k2.isEmpty()) {
            return k2;
        }
        Map<Long, i> k3 = this.f60617b.k(i2);
        this.f60616a.a(i2, k3);
        return k3;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<i> m(int i2) {
        List<i> m2 = this.f60616a.m(i2);
        if (m2 == null || m2.size() == 0) {
            return this.f60617b.m(i2);
        }
        return m2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final List<DownloadInfo> b(String str) {
        return this.f60616a.b(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void d(int i2) {
        this.f60616a.d(i2);
        if (g.b()) {
            o a2 = l.a(true);
            if (a2 != null) {
                a2.o(i2);
            } else {
                this.f60617b.d(i2);
            }
        } else {
            this.f60617b.d(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean f(int i2) {
        if (g.b()) {
            o a2 = l.a(true);
            if (a2 != null) {
                a2.p(i2);
            } else {
                this.f60617b.f(i2);
            }
        } else {
            this.f60617b.f(i2);
        }
        return this.f60616a.f(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final boolean e(int i2) {
        try {
            if (g.b()) {
                o a2 = l.a(true);
                if (a2 != null) {
                    a2.n(i2);
                } else {
                    this.f60617b.e(i2);
                }
            } else {
                this.f60617b.e(i2);
            }
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
        return this.f60616a.e(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void b(DownloadChunk downloadChunk) {
        if (g.b()) {
            o a2 = l.a(true);
            if (a2 != null) {
                a2.a(downloadChunk);
            } else {
                this.f60617b.a(downloadChunk);
            }
        } else {
            this.f60617b.a(downloadChunk);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void b(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f60616a.a(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo a(int i2, int i3) {
        DownloadInfo a2 = this.f60616a.a(i2, i3);
        a(a2, true);
        return a2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo b(int i2, long j2) {
        DownloadInfo b2 = this.f60616a.b(i2, j2);
        b(i2, (List<DownloadChunk>) null);
        return b2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo c(int i2, long j2) {
        DownloadInfo c2 = this.f60616a.c(i2, j2);
        b(i2, (List<DownloadChunk>) null);
        return c2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo d(int i2, long j2) {
        DownloadInfo d2 = this.f60616a.d(i2, j2);
        b(i2, (List<DownloadChunk>) null);
        return d2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo a(int i2, long j2) {
        DownloadInfo a2 = this.f60616a.a(i2, j2);
        a(a2, false);
        return a2;
    }

    private void a(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            if (!g.b()) {
                this.f60617b.a(downloadInfo);
            } else if (z) {
                o a2 = l.a(true);
                if (a2 != null) {
                    a2.c(downloadInfo);
                } else {
                    this.f60617b.a(downloadInfo);
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void b(int i2, List<DownloadChunk> list) {
        try {
            a(this.f60616a.b(i2));
            if (list == null) {
                list = this.f60616a.c(i2);
            }
            if (g.b()) {
                o a2 = l.a(true);
                if (a2 != null) {
                    a2.b(i2, list);
                } else {
                    this.f60617b.b(i2, list);
                }
            } else {
                this.f60617b.b(i2, list);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(int i2, int i3, long j2) {
        this.f60616a.a(i2, i3, j2);
        if (g.b()) {
            o a2 = l.a(true);
            if (a2 != null) {
                a2.a(i2, i3, j2);
            } else {
                this.f60617b.a(i2, i3, j2);
            }
        } else {
            this.f60617b.a(i2, i3, j2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final DownloadInfo a(int i2, long j2, String str, String str2) {
        DownloadInfo a2 = this.f60616a.a(i2, j2, str, str2);
        a(a2, true);
        return a2;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(int i2, int i3, int i4, int i5) {
        if (g.b()) {
            o a2 = l.a(true);
            if (a2 != null) {
                a2.a(i2, i3, i4, i5);
            } else {
                this.f60617b.a(i2, i3, i4, i5);
            }
        } else {
            this.f60617b.a(i2, i3, i4, i5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.l
    public final void a(int i2, int i3, int i4, long j2) {
        if (g.b()) {
            o a2 = l.a(true);
            if (a2 != null) {
                a2.a(i2, i3, i4, j2);
            } else {
                this.f60617b.a(i2, i3, i4, j2);
            }
        } else {
            this.f60617b.a(i2, i3, i4, j2);
        }
    }
}
