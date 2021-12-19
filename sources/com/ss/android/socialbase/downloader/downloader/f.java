package com.ss.android.socialbase.downloader.downloader;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.a.a;
import com.ss.android.socialbase.downloader.c.e;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.g.i;
import com.ss.android.socialbase.downloader.h.b;
import com.ss.android.socialbase.downloader.i.a;
import com.ss.android.socialbase.downloader.impls.d;
import com.ss.android.socialbase.downloader.impls.k;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.c;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

public final class f {

    /* renamed from: h  reason: collision with root package name */
    private static String f60450h = "ResponseHandler";
    private long A;
    private long B;
    private long C;
    private long D;
    private volatile long E;

    /* renamed from: a  reason: collision with root package name */
    public final i f60451a;

    /* renamed from: b  reason: collision with root package name */
    public long f60452b;

    /* renamed from: c  reason: collision with root package name */
    public long f60453c;

    /* renamed from: d  reason: collision with root package name */
    public volatile long f60454d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f60455e;

    /* renamed from: f  reason: collision with root package name */
    boolean f60456f;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f60457g;

    /* renamed from: i  reason: collision with root package name */
    private final DownloadInfo f60458i;

    /* renamed from: j  reason: collision with root package name */
    private final String f60459j;

    /* renamed from: k  reason: collision with root package name */
    private final DownloadChunk f60460k;

    /* renamed from: l  reason: collision with root package name */
    private l f60461l;

    /* renamed from: m  reason: collision with root package name */
    private k f60462m;
    private v n;
    private c o;
    private BaseException p;
    private volatile boolean q;
    private volatile boolean r;
    private final com.ss.android.socialbase.downloader.j.f s;
    private final a t;
    private final com.ss.android.socialbase.downloader.a.a u;
    private final boolean v;
    private final long w;
    private final long x;
    private final boolean y;
    private boolean z;

    static {
        Covode.recordClassIndex(37349);
    }

    private boolean d() {
        if (this.q || this.r) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (!this.q) {
            this.q = true;
            e();
        }
    }

    public final void b() {
        if (!this.r) {
            this.r = true;
            e();
        }
    }

    private void e() {
        ExecutorService g2;
        if (this.f60451a != null && (g2 = c.g()) != null) {
            g2.execute(new Runnable() {
                /* class com.ss.android.socialbase.downloader.downloader.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37350);
                }

                public final void run() {
                    try {
                        f.this.f60451a.d();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void f() {
        long j2;
        if (this.y) {
            j2 = System.nanoTime();
        } else {
            j2 = 0;
        }
        boolean z2 = false;
        try {
            this.o.a();
            this.f60458i.updateRealDownloadTime(true);
            if (this.f60458i.getChunkCount() > 1) {
                z2 = true;
            }
            o a2 = l.a(g.b());
            if (z2) {
                a(this.n);
                if (a2 != null) {
                    a2.c(this.f60458i);
                } else {
                    this.n.a(this.f60458i.getId(), this.f60458i.getCurBytes());
                }
            } else if (a2 != null) {
                a2.c(this.f60458i);
            } else {
                this.n.a(this.f60460k.f60820a, this.f60452b);
            }
            this.f60457g = this.f60452b;
        } catch (Exception unused) {
        }
        if (this.y) {
            this.C += System.nanoTime() - j2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.ss.android.socialbase.downloader.i.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0242, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0245, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02a2, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02db, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013e, code lost:
        if (r21 <= 500) goto L_0x0145;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02a2 A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), Splitter:B:22:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02e0 A[SYNTHETIC, Splitter:B:176:0x02e0] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x055f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 1547
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.f.c():void");
    }

    private b a(InputStream inputStream) {
        int w2 = c.w();
        if (this.t.a("rw_concurrent", 0) == 1 && this.f60458i.getChunkCount() == 1 && this.f60458i.getTotalBytes() > 20971520) {
            try {
                com.ss.android.socialbase.downloader.h.a aVar = new com.ss.android.socialbase.downloader.h.a(inputStream, w2, this.t.a("rw_concurrent_max_buffer_count", 4));
                this.z = true;
                return aVar;
            } catch (Throwable unused) {
            }
        }
        com.ss.android.socialbase.downloader.h.c cVar = new com.ss.android.socialbase.downloader.h.c(inputStream, w2);
        this.z = false;
        return cVar;
    }

    private void a(l lVar) {
        DownloadChunk downloadChunk;
        if (lVar != null) {
            o oVar = null;
            boolean z2 = lVar instanceof e;
            if (!z2 || (oVar = l.a(g.b())) != null) {
                if (this.f60460k.b()) {
                    downloadChunk = this.f60460k.c();
                } else {
                    downloadChunk = this.f60460k;
                }
                if (downloadChunk != null) {
                    downloadChunk.a(this.f60452b);
                    if (!z2 || oVar == null) {
                        lVar.a(downloadChunk.f60820a, downloadChunk.f60824e, downloadChunk.a(), this.f60452b);
                    } else {
                        oVar.a(downloadChunk.f60820a, downloadChunk.f60824e, downloadChunk.a(), this.f60452b);
                    }
                    if (downloadChunk.e()) {
                        if (downloadChunk.f()) {
                            long g2 = downloadChunk.g();
                            if (g2 > this.f60452b) {
                                if (!z2 || oVar == null) {
                                    lVar.a(downloadChunk.f60820a, downloadChunk.a(), g2);
                                    return;
                                } else {
                                    oVar.a(downloadChunk.f60820a, downloadChunk.a(), g2);
                                    return;
                                }
                            }
                        }
                        if (!z2 || oVar == null) {
                            lVar.a(downloadChunk.f60820a, downloadChunk.a(), this.f60452b);
                        } else {
                            oVar.a(downloadChunk.f60820a, downloadChunk.a(), this.f60452b);
                        }
                    }
                } else if (!this.f60460k.b()) {
                } else {
                    if (!z2 || oVar == null) {
                        lVar.a(this.f60460k.f60820a, this.f60460k.f60824e, this.f60452b);
                    } else {
                        oVar.a(this.f60460k.f60820a, this.f60460k.f60824e, this.f60452b);
                    }
                }
            }
        }
    }

    public f(DownloadInfo downloadInfo, String str, i iVar, DownloadChunk downloadChunk, com.ss.android.socialbase.downloader.j.f fVar) {
        boolean z2;
        this.f60458i = downloadInfo;
        this.f60459j = str;
        l q2 = c.q();
        this.f60461l = q2;
        if (q2 instanceof d) {
            d dVar = (d) q2;
            this.f60462m = dVar.f60616a;
            this.n = dVar.f60617b;
        }
        this.f60451a = iVar;
        this.f60460k = downloadChunk;
        this.s = fVar;
        long i2 = downloadChunk.i();
        this.f60452b = i2;
        this.f60453c = i2;
        boolean z3 = false;
        if (downloadChunk.b()) {
            this.f60455e = downloadChunk.f60823d;
        } else {
            this.f60455e = downloadChunk.b(false);
        }
        this.f60454d = downloadChunk.f60822c;
        this.u = a.b.f60273a;
        com.ss.android.socialbase.downloader.i.a a2 = com.ss.android.socialbase.downloader.i.a.a(downloadInfo.getId(), (DownloadInfo) null);
        this.t = a2;
        if (a2.a("sync_strategy", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.v = z2;
        if (z2) {
            this.w = Math.max((long) a2.a("sync_interval_ms_fg", 5000), 500L);
            this.x = Math.max((long) a2.a("sync_interval_ms_bg", 1000), 500L);
        } else {
            this.w = 0;
            this.x = 0;
        }
        this.y = a2.a("monitor_rw", 0) == 1 ? true : z3;
    }
}
