package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.b.f;
import com.ss.android.socialbase.downloader.b.g;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.ac;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.j.h;
import com.ss.android.socialbase.downloader.k.d;
import com.ss.android.socialbase.downloader.k.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.notification.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public abstract class a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    final SparseArray<DownloadTask> f60587a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    final SparseArray<DownloadTask> f60588b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    final i<Integer, DownloadTask> f60589c = new i<>();

    /* renamed from: d  reason: collision with root package name */
    final l f60590d = c.q();

    /* renamed from: e  reason: collision with root package name */
    protected final h f60591e = new h(Looper.getMainLooper(), this);

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<DownloadTask> f60592f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<DownloadTask> f60593g = new SparseArray<>();

    /* renamed from: h  reason: collision with root package name */
    private final SparseArray<DownloadTask> f60594h = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    private final SparseArray<SparseArray<DownloadTask>> f60595i = new SparseArray<>();

    /* renamed from: j  reason: collision with root package name */
    private final SparseArray<Long> f60596j = new SparseArray<>();

    /* renamed from: k  reason: collision with root package name */
    private final LinkedBlockingDeque<DownloadTask> f60597k = new LinkedBlockingDeque<>();

    static {
        Covode.recordClassIndex(37423);
    }

    /* access modifiers changed from: protected */
    public abstract List<Integer> a();

    /* access modifiers changed from: protected */
    public abstract void a(int i2, DownloadTask downloadTask);

    public abstract void a(com.ss.android.socialbase.downloader.j.c cVar);

    public abstract boolean a(int i2);

    /* access modifiers changed from: protected */
    public abstract void b(int i2);

    /* access modifiers changed from: protected */
    public abstract com.ss.android.socialbase.downloader.j.c c(int i2);

    public abstract void d(int i2);

    public final synchronized void a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
                if (downloadInfo.getEnqueueType() != g.ENQUEUE_NONE) {
                    DownloadInfo downloadInfo2 = downloadTask.getDownloadInfo();
                    if (downloadInfo2 != null) {
                        try {
                            if (this.f60597k.isEmpty()) {
                                a(downloadTask, true);
                                this.f60597k.put(downloadTask);
                                return;
                            } else if (downloadInfo2.getEnqueueType() != g.ENQUEUE_TAIL) {
                                DownloadTask first = this.f60597k.getFirst();
                                if (first.getDownloadId() != downloadTask.getDownloadId() || !a(downloadTask.getDownloadId())) {
                                    f(first.getDownloadId());
                                    a(downloadTask, true);
                                    if (first.getDownloadId() != downloadTask.getDownloadId()) {
                                        this.f60597k.putFirst(downloadTask);
                                    }
                                    return;
                                }
                                return;
                            } else if (this.f60597k.getFirst().getDownloadId() != downloadTask.getDownloadId() || !a(downloadTask.getDownloadId())) {
                                Iterator<DownloadTask> it = this.f60597k.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        DownloadTask next = it.next();
                                        if (next != null && next.getDownloadId() == downloadTask.getDownloadId()) {
                                            it.remove();
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                this.f60597k.put(downloadTask);
                                new com.ss.android.socialbase.downloader.downloader.g(downloadTask, this.f60591e).a();
                                return;
                            } else {
                                return;
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                    return;
                }
                a(downloadTask, true);
            }
        }
    }

    public final synchronized boolean a(int i2, boolean z) {
        DownloadTask downloadTask = this.f60592f.get(i2);
        if (downloadTask == null && com.ss.android.socialbase.downloader.k.a.a(65536)) {
            downloadTask = q(i2);
        }
        if (downloadTask != null) {
            if (!com.ss.android.socialbase.downloader.i.a.a(i2, (DownloadInfo) null).a("fix_on_cancel_call_twice", true)) {
                new com.ss.android.socialbase.downloader.downloader.g(downloadTask, this.f60591e).b();
            }
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            final SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.b.h.MAIN);
            final SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.b.h.NOTIFICATION);
            this.f60591e.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.impls.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37424);
                }

                public final void run() {
                    SparseArray sparseArray;
                    MethodCollector.i(13813);
                    SparseArray sparseArray2 = downloadListeners;
                    if (sparseArray2 != null) {
                        synchronized (sparseArray2) {
                            for (int i2 = 0; i2 < downloadListeners.size(); i2++) {
                                try {
                                    IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i2));
                                    if (iDownloadListener != null) {
                                        iDownloadListener.onCanceled(downloadInfo);
                                    }
                                } catch (Throwable th) {
                                    MethodCollector.o(13813);
                                    throw th;
                                }
                            }
                        }
                    }
                    DownloadInfo downloadInfo = downloadInfo;
                    if (downloadInfo == null || !downloadInfo.canShowNotification() || (sparseArray = downloadListeners2) == null) {
                        MethodCollector.o(13813);
                        return;
                    }
                    synchronized (sparseArray) {
                        for (int i3 = 0; i3 < downloadListeners2.size(); i3++) {
                            try {
                                IDownloadListener iDownloadListener2 = (IDownloadListener) downloadListeners2.get(downloadListeners2.keyAt(i3));
                                if (iDownloadListener2 != null) {
                                    iDownloadListener2.onCanceled(downloadInfo);
                                }
                            } finally {
                                MethodCollector.o(13813);
                            }
                        }
                    }
                }
            });
        }
        DownloadInfo b2 = this.f60590d.b(i2);
        if (com.ss.android.socialbase.downloader.k.a.a(65536)) {
            if (b2 != null) {
                b2.setStatus(-4);
            }
        } else if (b2 != null && f.a(b2.getStatus())) {
            b2.setStatus(-4);
        }
        a(i2, z, false);
        return true;
    }

    public final synchronized void a(int i2, y yVar) {
        DownloadTask downloadTask = this.f60592f.get(i2);
        if (downloadTask != null) {
            downloadTask.setNotificationEventListener(yVar);
        }
    }

    public final synchronized void a(List<String> list) {
        DownloadInfo downloadInfo;
        try {
            boolean a2 = com.ss.android.socialbase.downloader.k.a.a(1048576) ? com.ss.android.socialbase.downloader.k.g.a(c.B()) : true;
            for (int i2 = 0; i2 < this.f60588b.size(); i2++) {
                DownloadTask downloadTask = this.f60588b.get(this.f60588b.keyAt(i2));
                if (!(downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null || downloadInfo.getMimeType() == null || !list.contains(downloadInfo.getMimeType()) || (downloadInfo.isOnlyWifi() && !a2))) {
                    downloadInfo.setAutoResumed(true);
                    downloadInfo.setShowNotificationForNetworkResumed(true);
                    a(downloadTask);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(final int i2, final boolean z, final boolean z2) {
        DownloadInfo b2 = this.f60590d.b(i2);
        if (b2 != null) {
            a(b2);
        }
        this.f60591e.post(new Runnable() {
            /* class com.ss.android.socialbase.downloader.impls.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(37425);
            }

            public final void run() {
                b.a().a(i2);
            }
        });
        c.a(new Runnable() {
            /* class com.ss.android.socialbase.downloader.impls.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(37426);
            }

            public final void run() {
                DownloadTask q;
                MethodCollector.i(13533);
                if (a.this.c(i2) == null && (q = a.this.q(i2)) != null) {
                    DownloadInfo downloadInfo = q.getDownloadInfo();
                    SparseArray<IDownloadListener> downloadListeners = q.getDownloadListeners(com.ss.android.socialbase.downloader.b.h.SUB);
                    if (downloadListeners != null) {
                        synchronized (downloadListeners) {
                            for (int i2 = 0; i2 < downloadListeners.size(); i2++) {
                                try {
                                    IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i2));
                                    if (iDownloadListener != null) {
                                        iDownloadListener.onCanceled(downloadInfo);
                                    }
                                } catch (Throwable th) {
                                    MethodCollector.o(13533);
                                    throw th;
                                }
                            }
                        }
                    }
                }
                a.this.b(i2, z, z2);
                MethodCollector.o(13533);
            }
        });
    }

    public final synchronized void a(int i2, int i3, final IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.b.h hVar, boolean z, boolean z2) {
        DownloadInfo b2;
        DownloadTask q = q(i2);
        if (q != null) {
            q.addDownloadListener(i3, iDownloadListener, hVar, z);
            final DownloadInfo downloadInfo = q.getDownloadInfo();
            if (z2 && downloadInfo != null && !a(i2) && (hVar == com.ss.android.socialbase.downloader.b.h.MAIN || hVar == com.ss.android.socialbase.downloader.b.h.NOTIFICATION)) {
                if (hVar != com.ss.android.socialbase.downloader.b.h.NOTIFICATION || downloadInfo.canShowNotification()) {
                    this.f60591e.post(new Runnable() {
                        /* class com.ss.android.socialbase.downloader.impls.a.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(37429);
                        }

                        public final void run() {
                            if (iDownloadListener == null) {
                                return;
                            }
                            if (downloadInfo.getStatus() == -3) {
                                iDownloadListener.onSuccessed(downloadInfo);
                            } else if (downloadInfo.getStatus() == -1) {
                                iDownloadListener.onFailed(downloadInfo, new BaseException(1000, "try add listener for failed task"));
                            }
                        }
                    });
                }
            }
            return;
        }
        if (!(!com.ss.android.socialbase.downloader.k.a.a(32768) || (b2 = this.f60590d.b(i2)) == null || b2.getStatus() == -3)) {
            DownloadTask downloadTask = (DownloadTask) this.f60589c.get(Integer.valueOf(i2));
            if (downloadTask == null) {
                downloadTask = new DownloadTask(b2);
                this.f60589c.put(Integer.valueOf(i2), downloadTask);
            }
            downloadTask.addDownloadListener(i3, iDownloadListener, hVar, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.j.h.a
    public final void a(Message message) {
        DownloadTask downloadTask;
        int i2 = message.arg1;
        int i3 = message.arg2;
        com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "handleMsg id: " + i2 + " listener hasCode: " + i3);
        BaseException baseException = null;
        if (message.obj instanceof Exception) {
            baseException = (BaseException) message.obj;
        }
        synchronized (this) {
            if (i3 == 0) {
                downloadTask = this.f60592f.get(i2);
            } else {
                SparseArray<DownloadTask> sparseArray = this.f60595i.get(i2);
                if (sparseArray != null) {
                    downloadTask = sparseArray.get(i3);
                }
            }
            if (downloadTask != null) {
                a(message.what, baseException, downloadTask);
                a(i2, i3, message.what);
            }
        }
    }

    public final void b() {
        List<Integer> a2 = a();
        if (a2 != null) {
            for (Integer num : a2) {
                f(num.intValue());
            }
        }
    }

    protected a() {
    }

    public final synchronized DownloadInfo e(int i2) {
        DownloadInfo b2;
        DownloadTask downloadTask;
        b2 = this.f60590d.b(i2);
        if (b2 == null && (downloadTask = this.f60592f.get(i2)) != null) {
            b2 = downloadTask.getDownloadInfo();
        }
        return b2;
    }

    public final void n(final int i2) {
        DownloadInfo b2 = this.f60590d.b(i2);
        if (b2 != null) {
            a(b2);
        }
        this.f60591e.post(new Runnable() {
            /* class com.ss.android.socialbase.downloader.impls.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(37427);
            }

            public final void run() {
                b.a().a(i2);
            }
        });
        c.a(new Runnable(i2, true) {
            /* class com.ss.android.socialbase.downloader.impls.a.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f60610a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f60611b = true;

            static {
                Covode.recordClassIndex(37428);
            }

            public final void run() {
                a.this.c(this.f60610a);
                a aVar = a.this;
                int i2 = this.f60610a;
                boolean z = this.f60611b;
                try {
                    DownloadInfo b2 = aVar.f60590d.b(i2);
                    if (b2 != null) {
                        com.ss.android.socialbase.downloader.k.g.a(b2, z);
                        b2.erase();
                    }
                    try {
                        aVar.f60590d.d(i2);
                        aVar.f60590d.a(b2);
                    } catch (SQLiteException e2) {
                        e2.printStackTrace();
                    }
                    if (aVar.f60588b.get(i2) != null) {
                        aVar.f60588b.remove(i2);
                    }
                    if (aVar.f60587a.get(i2) != null) {
                        aVar.f60587a.remove(i2);
                    }
                    aVar.f60589c.remove(Integer.valueOf(i2));
                    com.ss.android.socialbase.downloader.i.a.a(i2);
                } catch (Throwable unused) {
                }
            }

            {
                this.f60610a = r3;
            }
        });
    }

    public final synchronized void o(int i2) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f60592f.get(i2);
        if (!(downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null)) {
            downloadInfo.setForceIgnoreRecommendSize(true);
            a(downloadTask);
        }
    }

    public final synchronized boolean p(int i2) {
        boolean z;
        if (i2 != 0) {
            if (!(this.f60592f.get(i2) == null && this.f60588b.get(i2) == null)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    private void r(int i2) {
        DownloadTask first;
        if (!this.f60597k.isEmpty()) {
            DownloadTask first2 = this.f60597k.getFirst();
            if (first2 != null && first2.getDownloadId() == i2) {
                this.f60597k.poll();
            }
            if (!this.f60597k.isEmpty() && (first = this.f60597k.getFirst()) != null) {
                a(first, true);
            }
        }
    }

    public final List<DownloadInfo> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : a()) {
            DownloadInfo e2 = e(num.intValue());
            if (e2 != null && str.equals(e2.getMimeType())) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    public final synchronized boolean g(int i2) {
        DownloadTask downloadTask = this.f60592f.get(i2);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
            }
            a(downloadTask);
        } else {
            h(i2);
        }
        return true;
    }

    public final synchronized boolean h(int i2) {
        DownloadTask downloadTask = this.f60588b.get(i2);
        if (downloadTask == null) {
            downloadTask = this.f60593g.get(i2);
        }
        if (downloadTask == null) {
            return false;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            downloadInfo.setDownloadFromReserveWifi(false);
        }
        a(downloadTask);
        return true;
    }

    public final synchronized boolean l(int i2) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f60593g.get(i2);
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            DownloadInfo b2 = this.f60590d.b(i2);
            if (b2 != null && b2.canStartRetryDelayTask()) {
                a(new DownloadTask(b2), false);
            }
            return false;
        }
        if (downloadInfo.canStartRetryDelayTask()) {
            a(downloadTask, false);
        }
        return true;
    }

    public final synchronized boolean m(int i2) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.f60594h.get(i2);
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return false;
        }
        if (downloadInfo.canReStartAsyncTask()) {
            a(downloadTask);
        }
        return true;
    }

    public final DownloadTask q(int i2) {
        DownloadTask downloadTask = this.f60592f.get(i2);
        if (downloadTask != null) {
            return downloadTask;
        }
        DownloadTask downloadTask2 = this.f60588b.get(i2);
        if (downloadTask2 != null) {
            return downloadTask2;
        }
        DownloadTask downloadTask3 = this.f60587a.get(i2);
        if (downloadTask3 != null) {
            return downloadTask3;
        }
        DownloadTask downloadTask4 = this.f60593g.get(i2);
        if (downloadTask4 == null) {
            return this.f60594h.get(i2);
        }
        return downloadTask4;
    }

    public final synchronized void b(List<String> list) {
        DownloadInfo downloadInfo;
        try {
            if (com.ss.android.socialbase.downloader.k.g.a(c.B())) {
                for (int i2 = 0; i2 < this.f60592f.size(); i2++) {
                    DownloadTask downloadTask = this.f60592f.get(this.f60592f.keyAt(i2));
                    if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null && downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()) && downloadInfo.statusInPause() && downloadInfo.isPauseReserveOnWifi()) {
                        downloadInfo.setAutoResumed(true);
                        downloadInfo.setShowNotificationForNetworkResumed(true);
                        a(downloadTask);
                        downloadInfo.setDownloadFromReserveWifi(true);
                        Downloader.getInstance(c.B()).getReserveWifiStatusListener();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final synchronized boolean f(int i2) {
        com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "pause id=".concat(String.valueOf(i2)));
        DownloadInfo b2 = this.f60590d.b(i2);
        if (b2 != null && b2.getStatus() == 11) {
            return false;
        }
        synchronized (this.f60592f) {
            b(i2);
        }
        if (b2 == null) {
            DownloadTask downloadTask = this.f60592f.get(i2);
            if (downloadTask != null) {
                new com.ss.android.socialbase.downloader.downloader.g(downloadTask, this.f60591e).c();
                return true;
            }
        } else {
            a(b2);
            if (b2.getStatus() == 1) {
                DownloadTask downloadTask2 = this.f60592f.get(i2);
                if (downloadTask2 != null) {
                    new com.ss.android.socialbase.downloader.downloader.g(downloadTask2, this.f60591e).c();
                    return true;
                }
            } else if (f.a(b2.getStatus())) {
                b2.setStatus(-2);
                return true;
            }
        }
        return false;
    }

    public final synchronized ac i(int i2) {
        DownloadTask downloadTask = this.f60592f.get(i2);
        if (downloadTask != null) {
            return downloadTask.getNotificationClickCallback();
        }
        DownloadTask downloadTask2 = this.f60587a.get(i2);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationClickCallback();
        }
        DownloadTask downloadTask3 = this.f60588b.get(i2);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationClickCallback();
        }
        DownloadTask downloadTask4 = this.f60593g.get(i2);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationClickCallback();
        }
        DownloadTask downloadTask5 = this.f60594h.get(i2);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationClickCallback();
    }

    public final synchronized y j(int i2) {
        DownloadTask downloadTask = this.f60592f.get(i2);
        if (downloadTask != null) {
            return downloadTask.getNotificationEventListener();
        }
        DownloadTask downloadTask2 = this.f60587a.get(i2);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationEventListener();
        }
        DownloadTask downloadTask3 = this.f60588b.get(i2);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationEventListener();
        }
        DownloadTask downloadTask4 = this.f60593g.get(i2);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationEventListener();
        }
        DownloadTask downloadTask5 = this.f60594h.get(i2);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationEventListener();
    }

    public final synchronized q k(int i2) {
        DownloadTask downloadTask = this.f60592f.get(i2);
        if (downloadTask != null) {
            return downloadTask.getFileUriProvider();
        }
        DownloadTask downloadTask2 = this.f60587a.get(i2);
        if (downloadTask2 != null) {
            return downloadTask2.getFileUriProvider();
        }
        DownloadTask downloadTask3 = this.f60588b.get(i2);
        if (downloadTask3 != null) {
            return downloadTask3.getFileUriProvider();
        }
        DownloadTask downloadTask4 = this.f60593g.get(i2);
        if (downloadTask4 != null) {
            return downloadTask4.getFileUriProvider();
        }
        DownloadTask downloadTask5 = this.f60594h.get(i2);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getFileUriProvider();
    }

    private static void a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                if (downloadInfo.getStatus() == 7 || downloadInfo.getRetryDelayStatus() != com.ss.android.socialbase.downloader.b.i.DELAY_RETRY_NONE) {
                    downloadInfo.setStatus(5);
                    downloadInfo.setRetryDelayStatus(com.ss.android.socialbase.downloader.b.i.DELAY_RETRY_NONE);
                    com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "cancelAlarm");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final synchronized List<DownloadInfo> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> a2 = this.f60590d.a(str);
        if (!(a2 == null || a2.isEmpty())) {
            return a2;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f60592f.size();
        for (int i2 = 0; i2 < size; i2++) {
            DownloadTask valueAt = this.f60592f.valueAt(i2);
            if (!(valueAt == null || valueAt.getDownloadInfo() == null || !str.equals(valueAt.getDownloadInfo().getUrl()))) {
                arrayList.add(valueAt.getDownloadInfo());
            }
        }
        return arrayList;
    }

    private void a(int i2, int i3) {
        com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "removeTask id: " + i2 + " listener hasCode: " + i3);
        if (i3 == 0) {
            this.f60592f.remove(i2);
            this.f60595i.remove(i2);
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.f60595i.get(i2);
        if (sparseArray != null) {
            sparseArray.remove(i3);
            com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "after downloadTaskWithListenerMap removeTask taskArray.size: " + sparseArray.size());
            if (sparseArray.size() == 0) {
                this.f60592f.remove(i2);
                this.f60595i.remove(i2);
                return;
            }
            return;
        }
        this.f60592f.remove(i2);
    }

    private void a(DownloadTask downloadTask, boolean z) {
        DownloadInfo downloadInfo;
        int i2;
        DownloadInfo downloadInfo2;
        DownloadTask downloadTask2;
        if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
            if (downloadInfo.isEntityInvalid()) {
                com.ss.android.socialbase.downloader.f.a.a(downloadTask.getMonitorDepend(), downloadInfo, new BaseException(1003, "downloadInfo is Invalid, url is " + downloadInfo.getUrl() + " name is " + downloadInfo.getName() + " savePath is " + downloadInfo.getSavePath()), downloadInfo.getStatus());
                return;
            }
            boolean z2 = false;
            if (com.ss.android.socialbase.downloader.i.a.a(downloadInfo.getId(), (DownloadInfo) null).a("no_net_opt", 0) != 1 || com.ss.android.socialbase.downloader.k.g.b(c.B()) || downloadInfo.isFirstDownload()) {
                int id = downloadInfo.getId();
                if (z) {
                    a(downloadInfo);
                }
                if (this.f60588b.get(id) != null) {
                    this.f60588b.remove(id);
                }
                if (this.f60587a.get(id) != null) {
                    this.f60587a.remove(id);
                }
                if (this.f60593g.get(id) != null) {
                    this.f60593g.remove(id);
                }
                if (this.f60594h.get(id) != null) {
                    this.f60594h.remove(id);
                }
                if (!a(id) || downloadInfo.canReStartAsyncTask()) {
                    com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "no downloading task :".concat(String.valueOf(id)));
                    if (downloadInfo.canReStartAsyncTask()) {
                        downloadInfo.setAsyncHandleStatus(com.ss.android.socialbase.downloader.b.a.ASYNC_HANDLE_RESTART);
                    }
                    if (com.ss.android.socialbase.downloader.k.a.a(32768) && (downloadTask2 = (DownloadTask) this.f60589c.remove(Integer.valueOf(id))) != null) {
                        downloadTask.copyListenerFromPendingTask(downloadTask2);
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    DownloadTask downloadTask3 = this.f60592f.get(id);
                    if (downloadTask3 == null || (downloadInfo2 = downloadTask3.getDownloadInfo()) == null) {
                        i2 = 0;
                    } else {
                        i2 = downloadInfo2.getStatus();
                        if (f.a(i2)) {
                            z2 = true;
                        }
                    }
                    com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "can add listener " + z2 + " , oldTaskStatus is :" + i2);
                    if (z2) {
                        downloadTask.addListenerToDownloadingSameTask();
                        return;
                    }
                    int hashCodeForSameTask = downloadTask.getHashCodeForSameTask();
                    if (hashCodeForSameTask != 0 || (downloadTask.isAutoSetHashCodeForSameTask() && (hashCodeForSameTask = downloadTask.autoCalAndGetHashCodeForSameTask()) != 0)) {
                        SparseArray<DownloadTask> sparseArray = this.f60595i.get(downloadTask.getDownloadId());
                        if (sparseArray == null) {
                            sparseArray = new SparseArray<>();
                            this.f60595i.put(downloadTask.getDownloadId(), sparseArray);
                        }
                        com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "tryCacheSameTaskWithListenerHashCode id:" + downloadTask.getDownloadId() + " listener hasCode:" + hashCodeForSameTask);
                        sparseArray.put(hashCodeForSameTask, downloadTask);
                    }
                    this.f60592f.put(id, downloadTask);
                    this.f60596j.put(id, Long.valueOf(uptimeMillis));
                    a(id, downloadTask);
                    return;
                }
                com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "another task with same id is downloading when tryDownload");
                downloadTask.addListenerToDownloadingSameTask();
                com.ss.android.socialbase.downloader.f.a.a(downloadTask.getMonitorDepend(), downloadInfo, new BaseException(1003, "downloadInfo is isDownloading and addListenerToSameTask is false"), downloadInfo.getStatus());
                return;
            }
            new com.ss.android.socialbase.downloader.downloader.g(downloadTask, this.f60591e).a(new BaseException(1049, "network_not_available"));
        }
    }

    private static void a(int i2, BaseException baseException, DownloadTask downloadTask) {
        boolean z;
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.b.h.MAIN);
            SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(com.ss.android.socialbase.downloader.b.h.NOTIFICATION);
            if (downloadTask.canShowNotification() || downloadInfo.isAutoInstallWithoutNotification()) {
                z = true;
            } else {
                z = false;
            }
            d.a(i2, downloadListeners, true, downloadInfo, baseException);
            d.a(i2, downloadListeners2, z, downloadInfo, baseException);
        }
    }

    public final synchronized void b(int i2, boolean z, boolean z2) {
        com.ss.android.socialbase.downloader.e.a.b("AbsDownloadEngine", "clearDownloadDataInSubThread::id=" + i2 + " deleteTargetFile=" + z);
        try {
            DownloadInfo b2 = this.f60590d.b(i2);
            if (b2 != null) {
                if (z) {
                    if (z2) {
                        new com.ss.android.socialbase.downloader.d.a(b2.getSavePath(), b2.getName(), false, false).d();
                    }
                    com.ss.android.socialbase.downloader.k.g.a(b2, z);
                } else {
                    com.ss.android.socialbase.downloader.k.g.b(b2.getTempPath(), b2.getTempName());
                }
                b2.erase();
            }
            try {
                this.f60590d.f(i2);
            } catch (SQLiteException e2) {
                e2.printStackTrace();
            }
            a(i2, 0, -4);
            if (this.f60588b.get(i2) != null) {
                this.f60588b.remove(i2);
            }
            if (this.f60587a.get(i2) != null) {
                this.f60587a.remove(i2);
            }
            this.f60589c.remove(Integer.valueOf(i2));
            com.ss.android.socialbase.downloader.i.a.a(i2);
        } catch (Throwable unused) {
        }
    }

    public final synchronized void a(int i2, int i3, int i4) {
        if (i4 != -7) {
            if (i4 != -6) {
                if (i4 != -4) {
                    if (i4 == -3) {
                        this.f60587a.put(i2, this.f60592f.get(i2));
                        a(i2, i3);
                    } else if (i4 != -1) {
                        if (i4 == 7) {
                            DownloadTask downloadTask = this.f60592f.get(i2);
                            if (downloadTask != null) {
                                if (this.f60593g.get(i2) == null) {
                                    this.f60593g.put(i2, downloadTask);
                                }
                                a(i2, i3);
                            }
                            r(i2);
                            return;
                        } else if (i4 == 8) {
                            DownloadTask downloadTask2 = this.f60592f.get(i2);
                            if (downloadTask2 != null && this.f60594h.get(i2) == null) {
                                this.f60594h.put(i2, downloadTask2);
                            }
                        }
                    }
                    r(i2);
                } else {
                    a(i2, i3);
                    r(i2);
                }
                return;
            }
            this.f60587a.put(i2, this.f60592f.get(i2));
            a(i2, i3);
            return;
        }
        DownloadTask downloadTask3 = this.f60592f.get(i2);
        if (downloadTask3 != null) {
            if (this.f60588b.get(i2) == null) {
                this.f60588b.put(i2, downloadTask3);
            }
            a(i2, i3);
        }
        r(i2);
    }

    public final synchronized void b(int i2, int i3, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.b.h hVar, boolean z) {
        a(i2, i3, iDownloadListener, hVar, z, true);
    }

    public final synchronized void a(int i2, int i3, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.b.h hVar, boolean z) {
        DownloadTask q = q(i2);
        if (!(q == null && (q = (DownloadTask) this.f60589c.get(Integer.valueOf(i2))) == null)) {
            q.removeDownloadListener(i3, iDownloadListener, hVar, z);
        }
    }
}
