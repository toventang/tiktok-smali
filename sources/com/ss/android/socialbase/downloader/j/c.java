package com.ss.android.socialbase.downloader.j;

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.socialbase.downloader.b.j;
import com.ss.android.socialbase.downloader.depend.o;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.downloader.f;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadFileExistException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.ss.android.socialbase.downloader.g.a.a;
import com.ss.android.socialbase.downloader.g.a.d;
import com.ss.android.socialbase.downloader.g.g;
import com.ss.android.socialbase.downloader.g.i;
import com.ss.android.socialbase.downloader.i.a;
import com.ss.android.socialbase.downloader.impls.q;
import com.ss.android.socialbase.downloader.impls.r;
import com.ss.android.socialbase.downloader.k.e;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.model.b;
import com.ss.android.ugc.aweme.cs.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;

public class c implements f, Runnable {

    /* renamed from: k  reason: collision with root package name */
    private static final String f60707k = c.class.getSimpleName();
    private g A;
    private u B;
    private o C;
    private volatile int D = 5;
    private boolean E = false;
    private boolean F = false;
    private String G;
    private String H;
    private boolean I = false;
    private long J;
    private final a K;
    private int L = 0;

    /* renamed from: a  reason: collision with root package name */
    public Future f60708a;

    /* renamed from: b  reason: collision with root package name */
    public final DownloadTask f60709b;

    /* renamed from: c  reason: collision with root package name */
    volatile f f60710c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f60711d;

    /* renamed from: e  reason: collision with root package name */
    volatile j f60712e = j.RUN_STATUS_NONE;

    /* renamed from: f  reason: collision with root package name */
    DownloadInfo f60713f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.socialbase.downloader.downloader.g f60714g;

    /* renamed from: h  reason: collision with root package name */
    public i f60715h;

    /* renamed from: i  reason: collision with root package name */
    public long f60716i;

    /* renamed from: j  reason: collision with root package name */
    volatile com.ss.android.socialbase.downloader.segment.j f60717j = null;

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f60718l;

    /* renamed from: m  reason: collision with root package name */
    private AtomicInteger f60719m;
    private final ArrayList<b> n = new ArrayList<>();
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final l t;
    private com.ss.android.socialbase.downloader.downloader.j u;
    private final com.ss.android.socialbase.downloader.downloader.j v;
    private com.ss.android.socialbase.downloader.downloader.i w;
    private final com.ss.android.socialbase.downloader.downloader.i x;
    private com.ss.android.socialbase.downloader.downloader.u y;
    private volatile BaseException z;

    public final void a() {
        this.f60712e = j.RUN_STATUS_PAUSE;
        if (this.f60717j != null) {
            this.f60717j.b();
        }
        if (this.f60710c != null) {
            this.f60710c.a();
        }
        if (this.f60717j == null && this.f60710c == null) {
            c();
            this.f60712e = j.RUN_STATUS_PAUSE;
            b();
        }
        try {
            Iterator it = ((ArrayList) this.n.clone()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != null) {
                    bVar.a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:523:0x0231 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:545:0x0311 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v344, resolved type: com.ss.android.socialbase.downloader.i.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v348, resolved type: com.ss.android.socialbase.downloader.i.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v366, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01aa, code lost:
        if (r25.K.a("fix_file_exist_update_download_info", (boolean) r5) != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0456, code lost:
        if (r8 == null) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0484, code lost:
        com.ss.android.socialbase.downloader.e.a.c(com.ss.android.socialbase.downloader.j.c.f60707k, "downloadSegments return");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04ce, code lost:
        if (r2 >= 0) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x067a, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x067d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0680, code lost:
        if (r13 <= 0) goto L_0x0682;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x07e1, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x07eb, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x083d, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x083f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x084a, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x084b, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0871, code lost:
        r0 = r25.f60719m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0874, code lost:
        if (r0 == null) goto L_0x088d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x087c, code lost:
        r25.f60713f.updateCurRetryTime(r25.f60719m.decrementAndGet());
        r25.f60713f.setStatus(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x088f, code lost:
        if (r25.f60719m != null) goto L_0x0891;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0897, code lost:
        if (r25.f60713f.trySwitchToNextBackupUrl() != false) goto L_0x0899;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0899, code lost:
        r25.f60713f.setStatus(5);
        r25.f60719m.set(r25.f60713f.getRetryCount());
        r25.f60713f.updateCurRetryTime(r25.f60719m.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x08b5, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x08d9, code lost:
        if (r2.getErrorCode() == 1025) goto L_0x08e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x08e3, code lost:
        r25.f60712e = com.ss.android.socialbase.downloader.b.j.RUN_STATUS_END_RIGHT_NOW;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x08ed, code lost:
        if (a(r2) != false) goto L_0x08ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x08f3, code lost:
        if (com.ss.android.socialbase.downloader.k.g.a(r2) != false) goto L_0x08f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x08f5, code lost:
        s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0900, code lost:
        if (b(r2, 0) == com.ss.android.socialbase.downloader.exception.a.RETURN) goto L_0x09d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0916, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0925, code lost:
        c();
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x093d, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0950, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0955, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x095c, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0962, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x097d, code lost:
        b(new com.ss.android.socialbase.downloader.exception.BaseException(1045, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0988, code lost:
        r2 = new java.lang.Object[2];
        r2[r18] = java.lang.String.valueOf(r25.f60713f.getRetryCount());
        r2[1] = r8.getErrorMsg();
        b(new com.ss.android.socialbase.downloader.exception.BaseException(1018, com.a.a("retry for Throwable, but retry Time %s all used, last error is %s", r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x09af, code lost:
        b(new com.ss.android.socialbase.downloader.exception.BaseException(1043, "retry for Throwable, but retain retry time is NULL, last error is" + r8.getErrorMsg()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x09cd, code lost:
        b(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x044a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05c9 A[SYNTHETIC, Splitter:B:285:0x05c9] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05f3 A[Catch:{ DownloadFileExistException -> 0x095e, BaseException -> 0x07eb, b -> 0x07e1, all -> 0x0950 }] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x084a A[ExcHandler: b (e com.ss.android.socialbase.downloader.exception.b), Splitter:B:164:0x0319] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0871 A[Catch:{ all -> 0x09d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x08d3  */
    /* JADX WARNING: Removed duplicated region for block: B:497:? A[ExcHandler: DownloadFileExistException (unused com.ss.android.socialbase.downloader.exception.DownloadFileExistException), SYNTHETIC, Splitter:B:294:0x05e0] */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0962 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:164:0x0319] */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x097d  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x02e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x09d0 A[EDGE_INSN: B:525:0x09d0->B:506:0x09d0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0472 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x09d0 A[EDGE_INSN: B:532:0x09d0->B:506:0x09d0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x05f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0183 A[Catch:{ all -> 0x019f }, DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
        // Method dump skipped, instructions count: 2530
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.j.c.h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011e, code lost:
        if (r2 > r10) goto L_0x0120;
     */
    @Override // com.ss.android.socialbase.downloader.j.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r25) {
        /*
        // Method dump skipped, instructions count: 529
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.j.c.a(long):void");
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final void a(String str, g gVar, long j2) {
        String str2;
        long j3;
        if (gVar != null) {
            try {
                b bVar = new b(str, gVar);
                int i2 = bVar.f60862c;
                String d2 = bVar.d();
                if (TextUtils.isEmpty(this.f60713f.getMimeType()) && !TextUtils.isEmpty(d2)) {
                    this.f60713f.setMimeType(d2);
                }
                boolean b2 = bVar.b();
                this.q = b2;
                this.f60713f.setSupportPartial(b2);
                this.r = bVar.a();
                String str3 = this.f60713f.geteTag();
                String c2 = bVar.c();
                String f2 = bVar.f();
                String g2 = bVar.g();
                String str4 = f60707k;
                com.ss.android.socialbase.downloader.e.a.b(str4, "dcache=responseCode=" + i2 + " last_modified=" + f2 + " CACHE_CONTROL=" + g2 + " max-age=" + com.ss.android.socialbase.downloader.k.g.f(bVar.g()) + " isDeleteCacheIfCheckFailed=" + this.f60713f.isDeleteCacheIfCheckFailed());
                com.ss.android.socialbase.downloader.e.a.b(str4, "dcache=firstOffset=" + j2 + " cur=" + f2 + " before=" + this.f60713f.getLastModified() + " cur=" + bVar.j() + " before=" + this.f60713f.getTotalBytes());
                if (!TextUtils.isEmpty(g2)) {
                    this.f60713f.setCacheControl(g2);
                    if (com.ss.android.socialbase.downloader.k.g.f(bVar.g()) > 0) {
                        this.f60713f.setCacheExpiredTime(System.currentTimeMillis() + (com.ss.android.socialbase.downloader.k.g.f(bVar.g()) * 1000));
                    }
                }
                if (this.f60713f.isExpiredRedownload() && this.I && !TextUtils.isEmpty(this.H)) {
                    if (i2 != 304) {
                        if ((TextUtils.isEmpty(this.f60713f.getLastModified()) && this.f60713f.isDeleteCacheIfCheckFailed()) || !TextUtils.equals(f2, this.f60713f.getLastModified())) {
                            com.ss.android.socialbase.downloader.k.g.a(this.f60713f, true);
                        }
                    }
                    com.ss.android.socialbase.downloader.e.a.b(str4, "dcache=responseCode=" + i2 + " lastModified not changed, use local file  " + f2);
                    throw new DownloadFileExistException(this.G, this.H);
                }
                if (j2 > 0 && this.f60713f.isExpiredRedownload() && !TextUtils.equals(f2, this.f60713f.getLastModified())) {
                    com.ss.android.socialbase.downloader.e.a.b(str4, "dcache cdn file change, so retry");
                    a("", "cdn file changed");
                }
                if (!TextUtils.isEmpty(f2)) {
                    this.f60713f.setLastModified(f2);
                }
                if (a(i2, str3, c2)) {
                    if (gVar instanceof i) {
                        if (!TextUtils.isEmpty(str3) && str3.equals(c2)) {
                            c2 = "";
                        }
                        a(c2, "eTag of server file changed");
                    } else {
                        throw new DownloadHttpException(1002, i2, "");
                    }
                }
                if (this.q || this.r) {
                    if (this.r && j2 > 0) {
                        if (gVar instanceof i) {
                            a("", "http head request not support");
                        } else {
                            throw new BaseException(1004, "isResponseFromBegin but firstOffset > 0");
                        }
                    }
                    long h2 = bVar.h();
                    if ((gVar instanceof i) || h2 >= 0 || !e.a(this.f60713f)) {
                        if (TextUtils.isEmpty(this.f60713f.getName())) {
                            str2 = com.ss.android.socialbase.downloader.k.g.a(gVar, this.f60713f.getUrl());
                        } else {
                            str2 = "";
                        }
                        boolean i3 = bVar.i();
                        this.s = i3;
                        if (i3) {
                            j3 = -1;
                        } else if (h2 != 0 || (gVar instanceof i)) {
                            String b3 = com.ss.android.socialbase.downloader.k.g.b(gVar, "Content-Range");
                            com.ss.android.socialbase.downloader.e.a.c(str4, "firstConnection: contentRange = ".concat(String.valueOf(b3)));
                            if (TextUtils.isEmpty(b3) || !this.K.a("fix_get_total_bytes", true)) {
                                j3 = j2 + h2;
                                com.ss.android.socialbase.downloader.e.a.e(str4, "firstConnection: 2 totalLength = " + j3 + ", contentLength = " + h2);
                            } else {
                                j3 = com.ss.android.socialbase.downloader.k.g.a(b3);
                                com.ss.android.socialbase.downloader.e.a.c(str4, "firstConnection: 1 totalLength = ".concat(String.valueOf(j3)));
                            }
                        } else {
                            throw new BaseException(1004, "");
                        }
                        if (!TextUtils.isEmpty(this.f60713f.getTaskKey()) && this.f60713f.getTotalBytes() > 0 && j3 != this.f60713f.getTotalBytes()) {
                            if (gVar instanceof i) {
                                a("", "file totalLength changed");
                            } else {
                                throw new DownloadHttpException(1002, i2, "");
                            }
                        }
                        if (!d()) {
                            if (this.f60713f.getExpectFileLength() <= 0 || a.a(this.f60713f.getId(), (DownloadInfo) null).a("force_check_file_length", 0) != 1 || this.f60713f.getExpectFileLength() == j3) {
                                this.f60714g.a(j3, c2, str2);
                                return;
                            }
                            throw new BaseException(1070, "expectFileLength = " + this.f60713f.getExpectFileLength() + " , totalLength = " + j3);
                        }
                        return;
                    }
                    throw new BaseException(1004, "");
                } else if (i2 == 403) {
                    throw new BaseException(1047, "response code error : 403");
                } else {
                    throw new DownloadHttpException(1004, i2, "response code error : ".concat(String.valueOf(i2)));
                }
            } catch (BaseException e2) {
                throw e2;
            } catch (com.ss.android.socialbase.downloader.exception.b e3) {
                throw e3;
            } catch (Throwable th) {
                com.ss.android.socialbase.downloader.k.g.a(th, "HandleFirstConnection");
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final void a(b bVar) {
        MethodCollector.i(11289);
        if (!this.o) {
            synchronized (this) {
                try {
                    this.n.remove(bVar);
                } finally {
                    MethodCollector.o(11289);
                }
            }
            return;
        }
        MethodCollector.o(11289);
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final boolean a(BaseException baseException) {
        if (this.f60717j != null && com.ss.android.socialbase.downloader.k.g.d(baseException) && this.f60719m.get() < this.f60713f.getRetryCount()) {
            return false;
        }
        if (com.ss.android.socialbase.downloader.k.g.b(baseException)) {
            if (this.o && !this.f60718l) {
                com.ss.android.socialbase.downloader.k.g.a(this.f60713f, true);
                this.f60718l = true;
            }
            return true;
        }
        AtomicInteger atomicInteger = this.f60719m;
        if (((atomicInteger == null || atomicInteger.get() <= 0) && !this.f60713f.hasNextBackupUrl() && ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f60713f.canReplaceHttpForRetry())) || (baseException instanceof DownloadRetryNeedlessException)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final com.ss.android.socialbase.downloader.exception.a a(BaseException baseException, long j2) {
        boolean z2;
        MethodCollector.i(11631);
        if (m()) {
            com.ss.android.socialbase.downloader.exception.a aVar = com.ss.android.socialbase.downloader.exception.a.RETURN;
            MethodCollector.o(11631);
            return aVar;
        } else if (baseException.getErrorCode() == 1047 || com.ss.android.socialbase.downloader.k.g.c(baseException)) {
            com.ss.android.socialbase.downloader.exception.a b2 = b(baseException, j2);
            MethodCollector.o(11631);
            return b2;
        } else {
            this.z = baseException;
            this.f60713f.increaseCurBytes(-j2);
            this.t.a(this.f60713f);
            if (d(baseException)) {
                com.ss.android.socialbase.downloader.exception.a aVar2 = com.ss.android.socialbase.downloader.exception.a.RETURN;
                MethodCollector.o(11631);
                return aVar2;
            }
            com.ss.android.socialbase.downloader.downloader.g gVar = this.f60714g;
            if (this.f60712e == j.RUN_STATUS_RETRY_DELAY) {
                z2 = true;
            } else {
                z2 = false;
            }
            gVar.f60466c.setFirstDownload(false);
            gVar.f60469f.set(0);
            gVar.f60467d.h(gVar.f60466c.getId());
            gVar.a(z2 ? 10 : 9, baseException, true);
            if (this.f60712e != j.RUN_STATUS_RETRY_DELAY && this.f60713f.isNeedRetryDelay()) {
                long a2 = this.y.a(this.f60713f.getCurRetryTimeInTotal(), this.f60713f.getTotalRetryCount());
                if (a2 > 0) {
                    com.ss.android.socialbase.downloader.e.a.c(f60707k, "onSingleChunkRetry with delay time ".concat(String.valueOf(a2)));
                    try {
                        Thread.sleep(a2);
                    } catch (Throwable th) {
                        com.ss.android.socialbase.downloader.e.a.d(f60707k, "onSingleChunkRetry:" + th.getMessage());
                    }
                }
            }
            com.ss.android.socialbase.downloader.exception.a aVar3 = com.ss.android.socialbase.downloader.exception.a.CONTINUE;
            MethodCollector.o(11631);
            return aVar3;
        }
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final synchronized DownloadChunk a(int i2) {
        MethodCollector.i(11961);
        if (this.f60713f.getChunkCount() < 2) {
            MethodCollector.o(11961);
            return null;
        }
        List<DownloadChunk> c2 = this.t.c(this.f60713f.getId());
        if (c2 == null || c2.isEmpty()) {
            MethodCollector.o(11961);
            return null;
        }
        for (int i3 = 0; i3 < c2.size(); i3++) {
            DownloadChunk downloadChunk = c2.get(i3);
            if (downloadChunk != null && downloadChunk.b()) {
                long b2 = downloadChunk.b(true);
                com.ss.android.socialbase.downloader.e.a.b(f60707k, "reuseChunk retainLen:" + b2 + " chunkIndex:" + i2);
                if (!downloadChunk.d() && b2 > com.ss.android.socialbase.downloader.b.e.f60288f && this.f60713f.isNeedReuseChunkRunnable()) {
                    List<DownloadChunk> a2 = downloadChunk.a(this.f60713f.getChunkCount(), this.f60713f.getTotalBytes());
                    if (a2 != null) {
                        for (DownloadChunk downloadChunk2 : a2) {
                            this.t.b(downloadChunk2);
                        }
                    }
                } else if (!downloadChunk.d()) {
                    continue;
                }
                if (downloadChunk.d()) {
                    for (int i4 = 1; i4 < downloadChunk.f60826g.size(); i4++) {
                        DownloadChunk downloadChunk3 = downloadChunk.f60826g.get(i4);
                        if (downloadChunk3 != null) {
                            com.ss.android.socialbase.downloader.e.a.b(f60707k, "check can checkUnCompletedChunk -- chunkIndex:" + downloadChunk3.f60824e + " currentOffset:" + downloadChunk3.i() + "  startOffset:" + downloadChunk3.f60821b + " contentLen:" + downloadChunk3.f60823d);
                            if (downloadChunk3.f60824e < 0 || (!downloadChunk3.f() && (downloadChunk3.f60830k == null || !downloadChunk3.f60830k.get()))) {
                                com.ss.android.socialbase.downloader.e.a.b(f60707k, "unComplete chunk " + downloadChunk.f60824e + " curOffset:" + downloadChunk.i() + " reuseChunk chunkIndex:" + i2 + " for subChunk:" + downloadChunk3.f60824e);
                                this.t.a(downloadChunk3.f60820a, downloadChunk3.f60824e, downloadChunk3.a(), i2);
                                downloadChunk3.f60824e = i2;
                                downloadChunk3.a(true);
                                MethodCollector.o(11961);
                                return downloadChunk3;
                            }
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        MethodCollector.o(11961);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final void a(g gVar) {
        if (gVar != null) {
            try {
                int a2 = gVar.a();
                this.f60713f.setHttpStatusCode(a2);
                this.f60713f.setHttpStatusMessage(com.ss.android.socialbase.downloader.k.c.a(a2));
                return;
            } catch (Throwable unused) {
            }
        }
        this.f60713f.setHttpStatusCode(-1);
        this.f60713f.setHttpStatusMessage("");
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        k();
        l();
    }

    static {
        Covode.recordClassIndex(37464);
    }

    private void k() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.b();
            this.A = null;
        }
    }

    private void l() {
        i iVar = this.f60715h;
        if (iVar != null) {
            iVar.d();
            this.f60715h = null;
        }
    }

    private boolean m() {
        if (this.f60712e == j.RUN_STATUS_CANCELED || this.f60712e == j.RUN_STATUS_PAUSE) {
            return true;
        }
        return false;
    }

    public final int e() {
        DownloadInfo downloadInfo = this.f60713f;
        if (downloadInfo != null) {
            return downloadInfo.getId();
        }
        return 0;
    }

    private void g() {
        DownloadInfo downloadInfo = this.f60713f;
        if (downloadInfo != null) {
            int retryCount = downloadInfo.getRetryCount() - this.f60713f.getCurRetryTime();
            if (retryCount < 0) {
                retryCount = 0;
            }
            AtomicInteger atomicInteger = this.f60719m;
            if (atomicInteger == null) {
                this.f60719m = new AtomicInteger(retryCount);
            } else {
                atomicInteger.set(retryCount);
            }
        }
    }

    private void j() {
        int retryCount;
        if (a.a(this.f60713f.getId(), (DownloadInfo) null).a("reset_retain_retry_times", 0) == 1 && this.L < 3) {
            AtomicInteger atomicInteger = this.f60719m;
            if (this.f60713f.isBackUpUrlUsed()) {
                retryCount = this.f60713f.getBackUpUrlRetryCount();
            } else {
                retryCount = this.f60713f.getRetryCount();
            }
            atomicInteger.set(retryCount);
            this.L++;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (!m() && this.f60713f.getStatus() != -2) {
            return false;
        }
        if (m()) {
            return true;
        }
        if (this.f60713f.getStatus() == -2) {
            this.f60712e = j.RUN_STATUS_PAUSE;
            return true;
        } else if (this.f60713f.getStatus() != -4) {
            return true;
        } else {
            this.f60712e = j.RUN_STATUS_CANCELED;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        try {
            Iterator it = ((ArrayList) this.n.clone()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != null) {
                    bVar.b();
                }
            }
        } catch (Throwable th) {
            com.ss.android.socialbase.downloader.e.a.c(f60707k, "cancelAllChunkRunnable: " + th.toString());
        }
    }

    private void i() {
        com.ss.android.socialbase.downloader.e.a.b(f60707k, "finishWithFileExist");
        if (a.f60573a.a("fix_end_for_file_exist_error", true)) {
            if (this.H.equals(this.f60713f.getName())) {
                this.f60712e = j.RUN_STATUS_END_RIGHT_NOW;
            } else {
                this.f60712e = j.RUN_STATUS_END_FOR_FILE_EXIST;
            }
        } else if (this.H.equals(this.f60713f.getTargetFilePath())) {
            this.f60712e = j.RUN_STATUS_END_RIGHT_NOW;
        } else {
            this.f60712e = j.RUN_STATUS_END_FOR_FILE_EXIST;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean o() {
        /*
            r7 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f60713f
            int r0 = r0.getChunkCount()
            r6 = 0
            r3 = 1
            if (r0 > r3) goto L_0x0028
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f60713f
            long r4 = r0.getCurBytes()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f60713f
            long r4 = r0.getCurBytes()
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f60713f
            long r1 = r0.getTotalBytes()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            return r3
        L_0x0027:
            return r6
        L_0x0028:
            com.ss.android.socialbase.downloader.downloader.l r1 = r7.t
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f60713f
            int r0 = r0.getId()
            java.util.List r1 = r1.c(r0)
            if (r1 == 0) goto L_0x003c
            int r0 = r1.size()
            if (r0 > r3) goto L_0x003d
        L_0x003c:
            return r6
        L_0x003d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r1.next()
            com.ss.android.socialbase.downloader.model.DownloadChunk r0 = (com.ss.android.socialbase.downloader.model.DownloadChunk) r0
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x0041
        L_0x0055:
            return r6
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.j.c.o():boolean");
    }

    private void s() {
        com.ss.android.socialbase.downloader.e.a.d(f60707k, "clearCurrentDownloadData::" + Log.getStackTraceString(new Throwable()));
        try {
            this.t.d(this.f60713f.getId());
            this.t.l(this.f60713f.getId());
            com.ss.android.socialbase.downloader.k.g.a(this.f60713f, true);
            this.p = false;
            this.f60713f.resetDataForEtagEndure("");
            this.t.a(this.f60713f);
        } catch (Throwable unused) {
        }
    }

    public void run() {
        MethodCollector.i(13651);
        synchronized (com.ss.android.socialbase.downloader.downloader.c.f60432g) {
            try {
                Iterator<Object> it = com.ss.android.socialbase.downloader.downloader.c.f60432g.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th) {
                MethodCollector.o(13651);
                throw th;
            }
        }
        try {
            com.ss.android.socialbase.downloader.g.b a2 = com.ss.android.socialbase.downloader.g.b.a();
            try {
                com.ss.android.socialbase.downloader.e.a.c(com.ss.android.socialbase.downloader.g.b.f60520a, "startSampling: mSamplingCounter = " + a2.f60524b);
                if (a2.f60524b.getAndIncrement() == 0) {
                    a2.f60525c.sendEmptyMessage(1);
                    a2.f60526e = SystemClock.uptimeMillis();
                }
            } catch (Throwable unused) {
            }
            h();
            com.ss.android.socialbase.downloader.g.b.a().b();
            com.ss.android.socialbase.downloader.downloader.c.d();
            MethodCollector.o(13651);
        } catch (Throwable th2) {
            com.ss.android.socialbase.downloader.g.b.a().b();
            MethodCollector.o(13651);
            throw th2;
        }
    }

    private boolean p() {
        if (this.f60713f.isChunked()) {
            DownloadInfo downloadInfo = this.f60713f;
            downloadInfo.setTotalBytes(downloadInfo.getCurBytes());
        }
        com.ss.android.socialbase.downloader.e.a.c(f60707k, "checkCompletedByteValid: downloadInfo.getCurBytes() = " + this.f60713f.getCurBytes() + ",  downloadInfo.getTotalBytes() = " + this.f60713f.getTotalBytes());
        if (this.f60713f.getCurBytes() > 0 && (this.f60713f.isIgnoreDataVerify() || (this.f60713f.getTotalBytes() > 0 && this.f60713f.getCurBytes() == this.f60713f.getTotalBytes()))) {
            return true;
        }
        this.f60713f.setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.b.b.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.f60713f.reset();
        this.t.a(this.f60713f);
        this.t.d(this.f60713f.getId());
        this.t.l(this.f60713f.getId());
        com.ss.android.socialbase.downloader.k.g.a(this.f60713f, true);
        return false;
    }

    private void q() {
        com.ss.android.socialbase.downloader.impls.a u2;
        int id = this.f60713f.getId();
        int a2 = com.ss.android.socialbase.downloader.downloader.c.a(this.f60713f);
        if (!this.f60713f.isDownloaded() || this.f60713f.isExpiredRedownload() || this.I) {
            DownloadInfo b2 = this.t.b(a2);
            if (!(b2 == null || (u2 = com.ss.android.socialbase.downloader.downloader.c.u()) == null || b2.getId() == id || !b2.equalsTask(this.f60713f))) {
                if (!u2.a(b2.getId())) {
                    List<DownloadChunk> c2 = this.t.c(a2);
                    com.ss.android.socialbase.downloader.k.g.a(this.f60713f, true);
                    this.t.f(a2);
                    if (b2.isBreakpointAvailable()) {
                        this.f60713f.copyFromCacheData(b2, false);
                        this.t.a(this.f60713f);
                        if (c2 != null) {
                            for (DownloadChunk downloadChunk : c2) {
                                downloadChunk.f60820a = id;
                                this.t.a(downloadChunk);
                            }
                        }
                        throw new com.ss.android.socialbase.downloader.exception.b("retry task because id generator changed");
                    }
                    return;
                }
                this.t.f(id);
                throw new BaseException(1025, "another same task is downloading");
            }
            return;
        }
        throw new BaseException(1009, "file has downloaded");
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        boolean z2;
        com.ss.android.socialbase.downloader.e.a.b(f60707k, "endDownloadRunnable::runStatus=" + this.f60712e);
        int i2 = 0;
        if (this.f60712e == j.RUN_STATUS_PAUSE || this.f60712e == j.RUN_STATUS_CANCELED) {
            z2 = false;
        } else {
            z2 = true;
        }
        try {
            if (!n()) {
                if (0 == 0) {
                    this.E = true;
                    com.ss.android.socialbase.downloader.e.a.b(f60707k, "jump to restart");
                    return;
                }
            }
        } catch (Exception e2) {
            if (e2 instanceof BaseException) {
                this.f60714g.a((BaseException) e2);
            } else {
                this.f60714g.a(new BaseException(1046, e2));
            }
        }
        this.f60711d.set(false);
        if (z2) {
            try {
                com.ss.android.socialbase.downloader.impls.a u2 = com.ss.android.socialbase.downloader.downloader.c.u();
                if (u2 != null) {
                    u2.a(this);
                }
            } catch (Throwable th) {
                w monitorDepend = this.f60709b.getMonitorDepend();
                DownloadInfo downloadInfo = this.f60713f;
                BaseException baseException = new BaseException(1014, com.ss.android.socialbase.downloader.k.g.b(th, "removeDownloadRunnable"));
                DownloadInfo downloadInfo2 = this.f60713f;
                if (downloadInfo2 != null) {
                    i2 = downloadInfo2.getStatus();
                }
                com.ss.android.socialbase.downloader.f.a.a(monitorDepend, downloadInfo, baseException, i2);
            }
        }
    }

    private boolean n() {
        if (this.f60712e == j.RUN_STATUS_ERROR) {
            this.f60714g.a(this.z);
        } else if (this.f60712e == j.RUN_STATUS_CANCELED) {
            this.f60714g.b();
        } else if (this.f60712e == j.RUN_STATUS_PAUSE) {
            this.f60714g.c();
        } else if (this.f60712e == j.RUN_STATUS_END_RIGHT_NOW) {
            try {
                com.ss.android.socialbase.downloader.downloader.g gVar = this.f60714g;
                if (gVar.f60465b) {
                    gVar.e();
                    com.ss.android.socialbase.downloader.e.a.b(com.ss.android.socialbase.downloader.downloader.g.f60464a, "onCompleteForFileExist");
                    gVar.f60466c.setSuccessByCache(true);
                    gVar.a(-3);
                    gVar.f60467d.c(gVar.f60466c.getId(), gVar.f60466c.getTotalBytes());
                    gVar.f60467d.d(gVar.f60466c.getId());
                    gVar.f60467d.a(gVar.f60466c);
                    gVar.f60467d.l(gVar.f60466c.getId());
                } else {
                    gVar.e();
                    com.ss.android.socialbase.downloader.e.a.b(com.ss.android.socialbase.downloader.downloader.g.f60464a, "onCompleteForFileExist");
                    gVar.f60466c.setSuccessByCache(true);
                    gVar.a(-3);
                    gVar.f60467d.c(gVar.f60466c.getId(), gVar.f60466c.getTotalBytes());
                    gVar.f60467d.d(gVar.f60466c.getId());
                    gVar.f60467d.l(gVar.f60466c.getId());
                }
            } catch (BaseException e2) {
                this.f60714g.a(e2);
            }
        } else if (this.f60712e == j.RUN_STATUS_END_FOR_FILE_EXIST) {
            try {
                com.ss.android.socialbase.downloader.downloader.g gVar2 = this.f60714g;
                String str = this.G;
                String str2 = this.H;
                com.ss.android.socialbase.downloader.e.a.b(com.ss.android.socialbase.downloader.downloader.g.f60464a, "onCompleteForFileExist existTargetFileName is " + str2 + " but curName is " + gVar2.f60466c.getName());
                if (gVar2.f60465b) {
                    com.ss.android.socialbase.downloader.k.g.a(gVar2.f60466c, str, str2);
                    gVar2.e();
                    gVar2.f60466c.setSuccessByCache(true);
                    gVar2.a(-3);
                    gVar2.f60467d.a(gVar2.f60466c);
                } else {
                    gVar2.f60467d.a(gVar2.f60466c);
                    com.ss.android.socialbase.downloader.k.g.a(gVar2.f60466c, str, str2);
                    gVar2.f60466c.setSuccessByCache(true);
                    gVar2.e();
                    gVar2.a(-3);
                }
            } catch (BaseException e3) {
                this.f60714g.a(e3);
            }
        } else if (this.f60712e == j.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET) {
            this.f60714g.a(this.z, false);
            return false;
        } else if (this.f60712e == j.RUN_STATUS_WAITING_ASYNC_HANDLER) {
            return true;
        } else {
            if (this.f60712e != j.RUN_STATUS_RETRY_DELAY || o()) {
                try {
                    if (!p()) {
                        return false;
                    }
                    this.f60714g.d();
                    r.c().d();
                } catch (Throwable th) {
                    b(new BaseException(1008, com.ss.android.socialbase.downloader.k.g.b(th, "doTaskStatusHandle onComplete")));
                }
            } else {
                com.ss.android.socialbase.downloader.e.a.b(f60707k, "doTaskStatusHandle retryDelay");
                this.f60712e = j.RUN_STATUS_NONE;
                if (this.f60712e == j.RUN_STATUS_RETRY_DELAY) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cd, code lost:
        if (r8 != false) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r() {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.j.c.r():void");
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final void c(BaseException baseException) {
        DownloadInfo downloadInfo = this.f60713f;
        if (downloadInfo != null) {
            downloadInfo.setChunkDowngradeRetryUsed(true);
        }
        a(baseException, false);
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final void b(BaseException baseException) {
        com.ss.android.socialbase.downloader.e.a.b(f60707k, "onError:" + baseException.getMessage());
        this.f60712e = j.RUN_STATUS_ERROR;
        this.z = baseException;
        f();
    }

    private boolean d(BaseException baseException) {
        AtomicInteger atomicInteger = this.f60719m;
        boolean z2 = true;
        if (atomicInteger != null) {
            if (atomicInteger.get() <= 0 || (baseException != null && baseException.getErrorCode() == 1070)) {
                if (this.f60713f.trySwitchToNextBackupUrl()) {
                    this.f60719m.set(this.f60713f.getBackUpUrlRetryCount());
                    this.f60713f.updateCurRetryTime(this.f60719m.get());
                } else if (baseException == null || ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f60713f.canReplaceHttpForRetry())) {
                    b(new BaseException(baseException.getErrorCode(), com.a.a("retry for exception, but current retry time : %s , retry Time %s all used, last error is %s", new Object[]{String.valueOf(this.f60719m), String.valueOf(this.f60713f.getRetryCount()), baseException.getErrorMessage()})));
                    return true;
                } else {
                    this.f60719m.set(this.f60713f.getRetryCount());
                    this.f60713f.updateCurRetryTime(this.f60719m.get());
                    this.f60713f.setHttpsToHttpRetryUsed(true);
                }
                z2 = false;
            }
            if (this.f60712e != j.RUN_STATUS_RETRY_DELAY && z2) {
                this.f60713f.updateCurRetryTime(this.f60719m.decrementAndGet());
            }
            return false;
        }
        b(new BaseException(1043, "retry for exception, but retain retry time is null, last error is :" + baseException.getErrorMessage()));
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final boolean b(long j2) {
        long j3;
        int a2;
        if (this.J > 0 && this.f60713f.getCurBytes() > this.J) {
            try {
                j3 = com.ss.android.socialbase.downloader.k.g.b(this.f60713f.getTempPath());
            } catch (BaseException unused) {
                j3 = 0;
            }
            String str = f60707k;
            StringBuilder sb = new StringBuilder("checkSpaceOverflowInProgress: available = ");
            double d2 = (double) j3;
            Double.isNaN(d2);
            com.ss.android.socialbase.downloader.e.a.c(str, sb.append(d2 / 1048576.0d).append("MB").toString());
            if (j3 > 0) {
                long totalBytes = this.f60713f.getTotalBytes() - this.f60713f.getCurBytes();
                if (j3 < totalBytes && (a2 = a.a(this.f60713f.getId(), (DownloadInfo) null).a("space_fill_min_keep_mb", 100)) > 0) {
                    long j4 = j3 - (((long) a2) * 1048576);
                    StringBuilder append = new StringBuilder("checkSpaceOverflowInProgress: minKeep  = ").append(a2).append("MB, canDownload = ");
                    double d3 = (double) j4;
                    Double.isNaN(d3);
                    com.ss.android.socialbase.downloader.e.a.c(str, append.append(d3 / 1048576.0d).append("MB").toString());
                    if (j4 > 0) {
                        this.J = this.f60713f.getCurBytes() + j4 + 1048576;
                    } else {
                        this.J = 0;
                        throw new DownloadOutOfSpaceException(j3, totalBytes);
                    }
                }
            }
            this.J = 0;
        }
        com.ss.android.socialbase.downloader.downloader.g gVar = this.f60714g;
        gVar.f60469f.addAndGet(j2);
        gVar.f60466c.increaseCurBytes(j2);
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z2 = true;
        if (!gVar.f60470g) {
            gVar.f60470g = true;
        } else {
            long j5 = uptimeMillis - gVar.f60468e;
            if (gVar.f60469f.get() >= gVar.f60472i || j5 >= ((long) gVar.f60471h)) {
                gVar.f60468e = uptimeMillis;
                gVar.f60469f.set(0);
            } else {
                z2 = false;
            }
        }
        return gVar.a(z2);
    }

    private static boolean a(File file) {
        MethodCollector.i(10965);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(10965);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10965);
        return delete;
    }

    @Override // com.ss.android.socialbase.downloader.j.f
    public final void a(BaseException baseException, boolean z2) {
        com.ss.android.socialbase.downloader.e.a.b(f60707k, "onAllChunkRetryWithReset");
        this.f60712e = j.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;
        this.z = baseException;
        f();
        if (!z2 || !d(baseException)) {
            s();
        }
    }

    private void a(String str, String str2) {
        this.t.d(this.f60713f.getId());
        this.t.l(this.f60713f.getId());
        com.ss.android.socialbase.downloader.k.g.a(this.f60713f, true);
        this.p = false;
        this.f60713f.resetDataForEtagEndure(str);
        this.t.a(this.f60713f);
        throw new com.ss.android.socialbase.downloader.exception.b(str2);
    }

    private void a(long j2, int i2) {
        long j3;
        long j4 = j2 / ((long) i2);
        int id = this.f60713f.getId();
        ArrayList arrayList = new ArrayList();
        long j5 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == i2 - 1) {
                j3 = 0;
            } else {
                j3 = (j5 + j4) - 1;
            }
            DownloadChunk.a aVar = new DownloadChunk.a(id);
            aVar.f60837f = i3;
            aVar.f60833b = j5;
            aVar.f60838g = j5;
            aVar.f60834c = j5;
            aVar.f60835d = j3;
            DownloadChunk a2 = aVar.a();
            arrayList.add(a2);
            this.t.a(a2);
            j5 += j4;
        }
        this.f60713f.setChunkCount(i2);
        this.t.a(id, i2);
        a(arrayList, j2);
    }

    public c(DownloadTask downloadTask, Handler handler) {
        this.f60709b = downloadTask;
        if (downloadTask != null) {
            this.f60713f = downloadTask.getDownloadInfo();
            this.u = downloadTask.getChunkStrategy();
            this.w = downloadTask.getChunkAdjustCalculator();
            this.B = downloadTask.getForbiddenHandler();
            this.C = downloadTask.getDiskSpaceHandler();
            com.ss.android.socialbase.downloader.downloader.u retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
            if (retryDelayTimeCalculator == null) {
                DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                if (downloadInfo != null) {
                    String retryDelayTimeArray = downloadInfo.getRetryDelayTimeArray();
                    if (!TextUtils.isEmpty(retryDelayTimeArray)) {
                        retryDelayTimeCalculator = new q(retryDelayTimeArray);
                    }
                }
                retryDelayTimeCalculator = com.ss.android.socialbase.downloader.downloader.c.z();
            }
            this.y = retryDelayTimeCalculator;
            this.K = a.a(this.f60713f.getId(), (DownloadInfo) null);
        } else {
            this.K = a.f60573a;
        }
        g();
        this.t = com.ss.android.socialbase.downloader.downloader.c.q();
        this.v = com.ss.android.socialbase.downloader.downloader.c.x();
        this.x = com.ss.android.socialbase.downloader.downloader.c.y();
        this.f60714g = new com.ss.android.socialbase.downloader.downloader.g(downloadTask, handler);
        this.f60711d = new AtomicBoolean(true);
    }

    private void a(String str, List<HttpHeader> list) {
        i iVar;
        boolean z2;
        d b2;
        if (this.f60715h == null) {
            if (this.f60713f.getChunkCount() != 1 || (b2 = a.C1331a.f60500a.b(str, list)) == null) {
                try {
                    boolean isNeedDefaultHttpServiceBackUp = this.f60713f.isNeedDefaultHttpServiceBackUp();
                    this.f60713f.getMaxBytes();
                    int a2 = this.K.a("net_lib_strategy", 0);
                    if (this.K.a("monitor_download_connect", 0) > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    iVar = com.ss.android.socialbase.downloader.downloader.c.a(isNeedDefaultHttpServiceBackUp, str, null, list, a2, z2, this.f60713f);
                    this.f60715h = iVar;
                } catch (BaseException e2) {
                    throw e2;
                } catch (Throwable th) {
                    a(this.f60715h);
                    throw th;
                }
                a(iVar);
            } else {
                a(this.f60715h);
                this.f60713f.setPreconnectLevel(2);
                this.f60715h = b2;
            }
            if (this.f60715h == null) {
                throw new BaseException(1022, new IOException("download can't continue, firstConnection is null"));
            }
        }
    }

    private void a(List<DownloadChunk> list, long j2) {
        long i2;
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                if (downloadChunk.f60822c == 0) {
                    i2 = j2 - downloadChunk.i();
                } else {
                    i2 = (downloadChunk.f60822c - downloadChunk.i()) + 1;
                }
                if (i2 > 0) {
                    downloadChunk.f60823d = i2;
                    if (!this.f60713f.isNeedReuseFirstConnection() || this.f60715h == null || (this.f60713f.isHeadConnectionAvailable() && !this.F)) {
                        this.n.add(new b(downloadChunk, this.f60709b, this));
                    } else if (downloadChunk.f60824e == 0) {
                        this.n.add(new b(downloadChunk, this.f60709b, this.f60715h, this));
                    } else if (downloadChunk.f60824e > 0) {
                        this.n.add(new b(downloadChunk, this.f60709b, this));
                    }
                }
            }
        }
        if (com.ss.android.socialbase.downloader.k.a.a(64)) {
            ArrayList arrayList = new ArrayList(this.n.size());
            Iterator<b> it = this.n.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (this.f60712e == j.RUN_STATUS_CANCELED) {
                    next.b();
                } else if (this.f60712e == j.RUN_STATUS_PAUSE) {
                    next.a();
                } else {
                    arrayList.add(next);
                }
            }
            try {
                List<Future> c2 = com.ss.android.socialbase.downloader.impls.e.c(arrayList);
                for (Runnable runnable = (Runnable) arrayList.remove(0); runnable != null; runnable = com.ss.android.socialbase.downloader.impls.e.d(c2)) {
                    if (!d()) {
                        try {
                            runnable.run();
                        } catch (Throwable unused) {
                        }
                    } else {
                        return;
                    }
                }
                if (!c2.isEmpty()) {
                    for (Future future : c2) {
                        if (future != null && !future.isDone()) {
                            try {
                                future.get();
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        } else {
            ArrayList arrayList2 = new ArrayList(this.n.size());
            Iterator<b> it2 = this.n.iterator();
            while (it2.hasNext()) {
                b next2 = it2.next();
                if (this.f60712e == j.RUN_STATUS_CANCELED) {
                    next2.b();
                } else if (this.f60712e == j.RUN_STATUS_PAUSE) {
                    next2.a();
                } else {
                    arrayList2.add(Executors.callable(next2));
                }
            }
            if (!d()) {
                try {
                    ExecutorService k2 = com.ss.android.socialbase.downloader.downloader.c.k();
                    if (k2 != null) {
                        k2.invokeAll(arrayList2);
                    }
                } catch (InterruptedException e2) {
                    throw new BaseException(1020, e2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (d(r12) == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        r0 = com.ss.android.socialbase.downloader.exception.a.RETURN;
        com.bytedance.frameworks.apm.trace.MethodCollector.o(11797);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        return r0;
     */
    @Override // com.ss.android.socialbase.downloader.j.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.socialbase.downloader.exception.a b(com.ss.android.socialbase.downloader.exception.BaseException r12, long r13) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.j.c.b(com.ss.android.socialbase.downloader.exception.BaseException, long):com.ss.android.socialbase.downloader.exception.a");
    }

    private boolean a(int i2, String str, String str2) {
        if (i2 == 412) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2) && (this.r || this.q)) {
            return true;
        }
        if ((i2 == 201 || i2 == 416) && this.f60713f.getCurBytes() > 0) {
            return true;
        }
        return false;
    }
}
