package com.ss.android.socialbase.downloader.downloader;

import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.b.a;
import com.ss.android.socialbase.downloader.b.b;
import com.ss.android.socialbase.downloader.b.f;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.b.i;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.k;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.r;
import com.ss.android.socialbase.downloader.k.d;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f60464a = g.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f60465b;

    /* renamed from: c  reason: collision with root package name */
    public DownloadInfo f60466c;

    /* renamed from: d  reason: collision with root package name */
    public final l f60467d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f60468e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicLong f60469f = new AtomicLong();

    /* renamed from: g  reason: collision with root package name */
    public boolean f60470g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f60471h;

    /* renamed from: i  reason: collision with root package name */
    public long f60472i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f60473j;

    /* renamed from: k  reason: collision with root package name */
    private DownloadTask f60474k;

    /* renamed from: l  reason: collision with root package name */
    private SparseArray<IDownloadListener> f60475l;

    /* renamed from: m  reason: collision with root package name */
    private SparseArray<IDownloadListener> f60476m;
    private SparseArray<IDownloadListener> n;
    private boolean o;
    private IDownloadDepend p;
    private w q;

    public final void b() {
        a(-4, (BaseException) null, true);
    }

    static {
        Covode.recordClassIndex(37351);
    }

    public final void a() {
        if (!this.f60466c.canSkipStatusHandler()) {
            this.f60466c.setStatus(1);
            ExecutorService g2 = c.g();
            if (g2 != null) {
                g2.execute(new Runnable() {
                    /* class com.ss.android.socialbase.downloader.downloader.g.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37352);
                    }

                    public final void run() {
                        g.this.f60467d.i(g.this.f60466c.getId());
                        g.this.a(1, (BaseException) null, true);
                    }
                });
            }
        }
    }

    private void g() {
        DownloadTask downloadTask = this.f60474k;
        if (downloadTask != null) {
            this.f60466c = downloadTask.getDownloadInfo();
            this.f60475l = this.f60474k.getDownloadListeners(h.MAIN);
            this.n = this.f60474k.getDownloadListeners(h.NOTIFICATION);
            this.f60476m = this.f60474k.getDownloadListeners(h.SUB);
            this.p = this.f60474k.getDepend();
            this.q = this.f60474k.getMonitorDepend();
        }
    }

    public final void c() {
        this.f60466c.setStatus(-2);
        try {
            this.f60467d.d(this.f60466c.getId(), this.f60466c.getCurBytes());
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
        a(-2, (BaseException) null, true);
    }

    public final void f() {
        this.f60466c.setStatus(8);
        this.f60466c.setAsyncHandleStatus(a.ASYNC_HANDLE_WAITING);
        com.ss.android.socialbase.downloader.impls.a u = c.u();
        if (u != null) {
            u.a(this.f60466c.getId(), this.f60474k.getHashCodeForSameTask(), 8);
        }
    }

    public final void e() {
        List<k> downloadCompleteHandlers = this.f60474k.getDownloadCompleteHandlers();
        if (!downloadCompleteHandlers.isEmpty()) {
            DownloadInfo downloadInfo = this.f60466c;
            a(11, (BaseException) null, true);
            this.f60467d.a(downloadInfo);
            for (k kVar : downloadCompleteHandlers) {
                try {
                    if (kVar.b(downloadInfo)) {
                        kVar.a(downloadInfo);
                        this.f60467d.a(downloadInfo);
                    }
                } catch (BaseException e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new BaseException(1071, th);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0175, code lost:
        r10 = new com.ss.android.socialbase.downloader.d.a(r6.getTempPath(), r6.getTempName());
        r2 = new com.ss.android.socialbase.downloader.d.a(r6.getSavePath(), r6.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0199, code lost:
        if (r6.isForce() != false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x019f, code lost:
        if (com.ss.android.socialbase.downloader.d.b.a(r2) == false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01a5, code lost:
        if (com.ss.android.socialbase.downloader.k.g.a(r6, r2) == false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01a7, code lost:
        com.ss.android.socialbase.downloader.e.a.b(com.ss.android.socialbase.downloader.k.g.f60748a, "targetFile exist");
        r11 = com.ss.android.socialbase.downloader.k.g.a(r2, r6.getMd5());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01ba, code lost:
        if (com.ss.android.socialbase.downloader.k.g.a(r11) == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01bc, code lost:
        com.ss.android.socialbase.downloader.e.a.b(com.ss.android.socialbase.downloader.k.g.f60748a, "tempFile not exist , targetFile exists and md5 check valid");
        r6.setTTMd5CheckStatus(r11);
        r4.a();
        com.ss.android.socialbase.downloader.k.g.a(r6.getId(), true, (com.ss.android.socialbase.downloader.exception.BaseException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01d6, code lost:
        if (r10.b() != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d8, code lost:
        r1 = new com.ss.android.socialbase.downloader.exception.BaseException(1005, com.a.a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist and target file is exist but md5 verify invalid :%s", new java.lang.Object[]{r6.getTempPath(), r6.getTempName(), r6.getSavePath(), r6.getName(), com.ss.android.socialbase.downloader.k.g.b(r11)}));
        r4.a(r1);
        com.ss.android.socialbase.downloader.k.g.a(r6.getId(), false, r1);
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0210, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0215, code lost:
        if (r2.d() != false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0217, code lost:
        if (r1 != false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0219, code lost:
        if (r12 == null) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x021b, code lost:
        com.ss.android.socialbase.downloader.f.a.a(r12, r6, new com.ss.android.socialbase.downloader.exception.BaseException(1038, "tempFile is not exist and target file is exist but md5 verify invalid, delete target file failed"), r6.getStatus());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x022d, code lost:
        r3 = new com.ss.android.socialbase.downloader.exception.BaseException(1037, "delete targetPath file existed with md5 check invalid status:" + com.ss.android.socialbase.downloader.k.g.b(r11));
        r4.a(r3);
        com.ss.android.socialbase.downloader.k.g.a(r6.getId(), false, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0253, code lost:
        if (r1 == false) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x025a, code lost:
        if (r10.b() != false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x025c, code lost:
        r10 = new com.ss.android.socialbase.downloader.exception.BaseException(1005, com.a.a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist", new java.lang.Object[]{r6.getTempPath(), r6.getTempName(), r6.getSavePath(), r6.getName()}));
        r4.a(r10);
        com.ss.android.socialbase.downloader.k.g.a(r6.getId(), false, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r1 = com.ss.android.socialbase.downloader.i.a.a(r6.getId(), (com.ss.android.socialbase.downloader.model.DownloadInfo) null).a("download_finish_check_ttmd5", 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x029b, code lost:
        if (r1 <= 0) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x029d, code lost:
        r3 = com.ss.android.socialbase.downloader.k.g.a(r10, r6.getMd5());
        r6.setTTMd5CheckStatus(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02a8, code lost:
        if (r1 < 2) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02ae, code lost:
        if (com.ss.android.socialbase.downloader.k.g.a(r3) != false) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02b0, code lost:
        r2 = new com.ss.android.socialbase.downloader.exception.BaseException(1034, com.ss.android.socialbase.downloader.k.g.b(r3));
        r4.a(r2);
        com.ss.android.socialbase.downloader.k.g.a(r6.getId(), false, r2);
        com.ss.android.socialbase.downloader.k.g.a(r6, com.ss.android.socialbase.downloader.k.g.e(r6.getSavePath()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02d0, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13681);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d6, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02dc, code lost:
        if ((!com.ss.android.socialbase.downloader.k.g.a(r10, r2)) == false) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02de, code lost:
        if (0 != 0) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02e1, code lost:
        r4.a();
        com.ss.android.socialbase.downloader.k.g.a(r6.getId(), true, (com.ss.android.socialbase.downloader.exception.BaseException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02f2, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02f5, code lost:
        r3 = new com.ss.android.socialbase.downloader.exception.BaseException(1038, com.a.a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s)", new java.lang.Object[]{r6.getTempPath(), r6.getTempName(), r6.getSavePath(), r6.getName()}));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
        // Method dump skipped, instructions count: 867
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.g.d():void");
    }

    public final void a(int i2) {
        a(i2, (BaseException) null, true);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.socialbase.downloader.exception.BaseException r7) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.g.a(com.ss.android.socialbase.downloader.exception.BaseException):void");
    }

    public final boolean a(boolean z) {
        boolean z2 = false;
        if (this.f60466c.getCurBytes() == this.f60466c.getTotalBytes()) {
            try {
                this.f60467d.a(this.f60466c.getId(), this.f60466c.getCurBytes());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return false;
        }
        if (this.o) {
            this.o = false;
            this.f60466c.setStatus(4);
        }
        if (this.f60466c.isNeedPostProgress() && z) {
            z2 = true;
        }
        a(4, (BaseException) null, z2);
        return z;
    }

    public g(DownloadTask downloadTask, Handler handler) {
        this.f60474k = downloadTask;
        g();
        this.f60473j = handler;
        this.f60467d = c.q();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            this.f60465b = com.ss.android.socialbase.downloader.i.a.a(downloadInfo.getId(), (DownloadInfo) null).a("fix_start_with_file_exist_update_error", false);
        } else {
            this.f60465b = false;
        }
    }

    public final void a(BaseException baseException, boolean z) {
        int i2;
        this.f60466c.setFirstDownload(false);
        this.f60469f.set(0);
        this.f60467d.h(this.f60466c.getId());
        if (z) {
            i2 = 7;
        } else {
            i2 = 5;
        }
        a(i2, baseException, true);
    }

    public final void a(long j2, String str, String str2) {
        this.f60466c.setTotalBytes(j2);
        this.f60466c.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f60466c.getName())) {
            this.f60466c.setName(str2);
        }
        try {
            this.f60467d.a(this.f60466c.getId(), j2, str, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        a(3, (BaseException) null, true);
        this.f60472i = this.f60466c.getMinByteIntervalForPostToMainThread(j2);
        this.f60471h = this.f60466c.getMinProgressTimeMsInterval();
        this.o = true;
        r.c().a(5, false);
    }

    public final void a(int i2, BaseException baseException, boolean z) {
        SparseArray<IDownloadListener> sparseArray;
        SparseArray<IDownloadListener> sparseArray2;
        int status = this.f60466c.getStatus();
        if (status != -3 || i2 != 4) {
            g();
            if (i2 != 4 && f.d(i2)) {
                this.f60466c.updateRealDownloadTime(false);
                if (f.c(i2)) {
                    this.f60466c.updateDownloadTime();
                }
            }
            if (!this.f60466c.isAddListenerToSameTask()) {
                com.ss.android.socialbase.downloader.f.a.a(this.f60474k, baseException, i2);
            }
            if (i2 == 6) {
                this.f60466c.setStatus(2);
            } else if (i2 == -6) {
                this.f60466c.setStatus(-3);
            } else {
                this.f60466c.setStatus(i2);
            }
            if (status == -3 || status == -1) {
                if (this.f60466c.getRetryDelayStatus() == i.DELAY_RETRY_DOWNLOADING) {
                    this.f60466c.setRetryDelayStatus(i.DELAY_RETRY_DOWNLOADED);
                }
                if (this.f60466c.getAsyncHandleStatus() == a.ASYNC_HANDLE_DOWNLOADING) {
                    this.f60466c.setAsyncHandleStatus(a.ASYNC_HANDLE_DOWNLOADED);
                }
                if (this.f60466c.getByteInvalidRetryStatus() == b.BYTE_INVALID_RETRY_STATUS_DOWNLOADING) {
                    this.f60466c.setByteInvalidRetryStatus(b.BYTE_INVALID_RETRY_STATUS_DOWNLOADED);
                }
            }
            d.a(i2, this.f60476m, true, this.f60466c, baseException);
            if (i2 != -4) {
                if (!z || this.f60473j == null || (((sparseArray = this.f60475l) == null || sparseArray.size() <= 0) && ((sparseArray2 = this.n) == null || sparseArray2.size() <= 0 || (!this.f60466c.canShowNotification() && !this.f60466c.isAutoInstallWithoutNotification())))) {
                    com.ss.android.socialbase.downloader.impls.a u = c.u();
                    if (u != null) {
                        u.a(this.f60466c.getId(), this.f60474k.getHashCodeForSameTask(), i2);
                        return;
                    }
                    return;
                }
                this.f60473j.obtainMessage(i2, this.f60466c.getId(), this.f60474k.getHashCodeForSameTask(), baseException).sendToTarget();
            }
        }
    }
}
