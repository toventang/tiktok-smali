package com.ss.android.socialbase.downloader.j;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.f;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.g.i;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private static final String f60695b = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public f f60696a;

    /* renamed from: c  reason: collision with root package name */
    private DownloadChunk f60697c;

    /* renamed from: d  reason: collision with root package name */
    private DownloadChunk f60698d;

    /* renamed from: e  reason: collision with root package name */
    private final DownloadTask f60699e;

    /* renamed from: f  reason: collision with root package name */
    private DownloadInfo f60700f;

    /* renamed from: g  reason: collision with root package name */
    private final f f60701g;

    /* renamed from: h  reason: collision with root package name */
    private i f60702h;

    /* renamed from: i  reason: collision with root package name */
    private l f60703i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f60704j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f60705k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f60706l;

    static {
        Covode.recordClassIndex(37463);
    }

    private void c() {
        i iVar = this.f60702h;
        if (iVar != null) {
            iVar.d();
            this.f60702h = null;
        }
    }

    private boolean d() {
        if (this.f60704j || this.f60705k) {
            return true;
        }
        return false;
    }

    public final void a() {
        this.f60704j = true;
        f fVar = this.f60696a;
        if (fVar != null) {
            fVar.a();
        }
    }

    public final void b() {
        this.f60705k = true;
        f fVar = this.f60696a;
        if (fVar != null) {
            fVar.b();
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        MethodCollector.i(12826);
        Process.setThreadPriority(10);
        this.f60697c = this.f60698d;
        while (true) {
            try {
                this.f60697c.a(this);
                if (a(this.f60697c)) {
                    this.f60697c.a(false);
                    if (d()) {
                        break;
                    }
                    this.f60697c = this.f60701g.a(this.f60697c.f60824e);
                    if (d() || this.f60697c == null) {
                        break;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (Throwable unused) {
                    }
                } else {
                    this.f60697c.a(false);
                    break;
                }
            } catch (Throwable th) {
                DownloadChunk downloadChunk = this.f60697c;
                if (downloadChunk != null) {
                    downloadChunk.a(false);
                }
                c();
                this.f60701g.a(this);
                MethodCollector.o(12826);
                throw th;
            }
        }
        DownloadChunk downloadChunk2 = this.f60697c;
        if (downloadChunk2 != null) {
            downloadChunk2.a(false);
        }
        c();
        this.f60701g.a(this);
        MethodCollector.o(12826);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01a5, code lost:
        if (com.ss.android.socialbase.downloader.k.g.b(r4) != false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01a7, code lost:
        r28.f60701g.a(r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b4, code lost:
        if (r28.f60701g.a(r4) != false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ba, code lost:
        if (com.ss.android.socialbase.downloader.k.g.a(r4) != false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01bc, code lost:
        r28.f60701g.a(r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01c3, code lost:
        if (r16 != false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01c8, code lost:
        if (r2 < 0) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01ca, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ce, code lost:
        if (r28.f60696a != null) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01d6, code lost:
        if (com.ss.android.socialbase.downloader.k.a.a(32) != false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d8, code lost:
        r2 = r28.f60696a.f60452b - r28.f60696a.f60457g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01e3, code lost:
        if (r2 > 0) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01e5, code lost:
        a(r29, r28.f60696a.f60457g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01f2, code lost:
        if (com.ss.android.socialbase.downloader.k.a.a(16) == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f4, code lost:
        r1 = r28.f60701g.a(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01fd, code lost:
        r1 = r28.f60701g.b(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0204, code lost:
        r0 = r28.f60696a.f60452b - r14;
        a(r29, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x020d, code lost:
        if (r1 != com.ss.android.socialbase.downloader.exception.a.RETURN) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x020f, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0212, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x022c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x022e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x022f, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0234, code lost:
        if (d() == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0236, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0239, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        com.ss.android.socialbase.downloader.k.g.a(r1, "downloadChunkInner");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0240, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0241, code lost:
        r28.f60701g.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x024a, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x024d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x024e, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0251, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0252, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0255, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0256, code lost:
        r28.f60701g.b(r4);
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x025e, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0277, code lost:
        r2 = r28.f60700f;
        r1 = r4.getErrorCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x02bb, code lost:
        r28.f60701g.c(r4);
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x02c3, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x02c4, code lost:
        r28.f60701g.b(r4);
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02cc, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0118, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0119, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0160, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0161, code lost:
        r16 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a1 A[Catch:{ all -> 0x02cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01f4 A[Catch:{ all -> 0x02cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01fd A[Catch:{ all -> 0x02cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0213 A[LOOP:0: B:1:0x0002->B:145:0x0213, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x022c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:75:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x022e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x020f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x019f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.ss.android.socialbase.downloader.model.DownloadChunk r29) {
        /*
        // Method dump skipped, instructions count: 722
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.j.b.a(com.ss.android.socialbase.downloader.model.DownloadChunk):boolean");
    }

    private void a(DownloadChunk downloadChunk, long j2) {
        DownloadChunk downloadChunk2;
        if (downloadChunk.b()) {
            downloadChunk2 = downloadChunk.c();
            if (downloadChunk2 == null) {
                if (downloadChunk.b()) {
                    this.f60703i.a(downloadChunk.f60820a, downloadChunk.f60824e, j2);
                    return;
                }
                return;
            }
        } else {
            downloadChunk2 = downloadChunk;
        }
        if (downloadChunk2.e()) {
            this.f60703i.a(downloadChunk2.f60820a, downloadChunk2.a(), j2);
        }
        downloadChunk2.a(j2);
        this.f60703i.a(downloadChunk2.f60820a, downloadChunk2.f60824e, downloadChunk2.a(), j2);
    }

    public b(DownloadChunk downloadChunk, DownloadTask downloadTask, f fVar) {
        this.f60698d = downloadChunk;
        this.f60699e = downloadTask;
        if (downloadTask != null) {
            this.f60700f = downloadTask.getDownloadInfo();
        }
        this.f60701g = fVar;
        this.f60703i = c.q();
        this.f60698d.a(this);
    }

    public b(DownloadChunk downloadChunk, DownloadTask downloadTask, i iVar, f fVar) {
        this(downloadChunk, downloadTask, fVar);
        this.f60702h = iVar;
    }
}
