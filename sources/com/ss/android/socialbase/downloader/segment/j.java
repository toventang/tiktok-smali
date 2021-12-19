package com.ss.android.socialbase.downloader.segment;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.e.a;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.g.c;
import com.ss.android.socialbase.downloader.j.e;
import com.ss.android.socialbase.downloader.j.f;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.b;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class j implements c.a, f {
    private int A;
    private final boolean B;
    private final e.b C;
    private final e.b D;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f60935a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f60936b;

    /* renamed from: c  reason: collision with root package name */
    public final List<o> f60937c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public b f60938d;

    /* renamed from: e  reason: collision with root package name */
    public b f60939e;

    /* renamed from: f  reason: collision with root package name */
    public long f60940f;

    /* renamed from: g  reason: collision with root package name */
    private final DownloadInfo f60941g;

    /* renamed from: h  reason: collision with root package name */
    private final m f60942h;

    /* renamed from: i  reason: collision with root package name */
    private final b f60943i;

    /* renamed from: j  reason: collision with root package name */
    private final f f60944j;

    /* renamed from: k  reason: collision with root package name */
    private final g f60945k;

    /* renamed from: l  reason: collision with root package name */
    private final List<l> f60946l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f60947m;
    private long n;
    private final LinkedList<i> o;
    private final List<i> p;
    private int q;
    private BaseException r;
    private volatile boolean s;
    private final Object t;
    private final com.ss.android.socialbase.downloader.k.f u;
    private final e v;
    private volatile boolean w;
    private long x;
    private long y;
    private float z;

    static {
        Covode.recordClassIndex(37565);
    }

    @Override // com.ss.android.socialbase.downloader.g.c.a
    public final void a(String str, List<InetAddress> list) {
        boolean z2;
        MethodCollector.i(13228);
        if (this.f60936b || this.f60935a) {
            MethodCollector.o(13228);
            return;
        }
        ArrayList arrayList = null;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int i2 = 0;
                    for (InetAddress inetAddress : list) {
                        if (inetAddress != null) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                o oVar = new o(str, hostAddress);
                                LinkedList linkedList = (LinkedList) linkedHashMap.get(oVar.f60971c);
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    linkedHashMap.put(oVar.f60971c, linkedList);
                                }
                                linkedList.add(oVar);
                                i2++;
                            }
                        }
                    }
                    if (i2 > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            z2 = false;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                LinkedList linkedList2 = (LinkedList) entry.getValue();
                                if (linkedList2 != null && !linkedList2.isEmpty()) {
                                    arrayList2.add((o) linkedList2.pollFirst());
                                    i2--;
                                    z2 = true;
                                }
                            }
                            if (i2 <= 0) {
                                break;
                            }
                        } while (z2);
                        arrayList = arrayList2;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        synchronized (this) {
            if (arrayList != null) {
                try {
                    b(str, arrayList);
                } catch (Throwable th) {
                    MethodCollector.o(13228);
                    throw th;
                }
            }
            this.f60947m = false;
            this.f60942h.a(this.f60937c.size());
            e();
        }
        MethodCollector.o(13228);
    }

    @Override // com.ss.android.socialbase.downloader.segment.f
    public final void a(l lVar, i iVar, o oVar, b bVar) {
        MethodCollector.i(13997);
        synchronized (this) {
            try {
                if (this.f60935a || this.f60936b) {
                    StreamClosedException streamClosedException = new StreamClosedException("connected");
                    MethodCollector.o(13997);
                    throw streamClosedException;
                }
                l lVar2 = iVar.f60931e;
                if (lVar2 != null) {
                    if (lVar2 != lVar) {
                        SegmentApplyException segmentApplyException = new SegmentApplyException(1, "segment already has an owner");
                        MethodCollector.o(13997);
                        throw segmentApplyException;
                    }
                }
                if (lVar.f60957d == iVar.d()) {
                    if (!bVar.b()) {
                        if (iVar.d() <= 0) {
                            a.e("SegmentDispatcher", "parseHttpResponse: segment.getCurrentOffsetRead = " + iVar.d());
                            if (!bVar.a()) {
                                DownloadHttpException downloadHttpException = new DownloadHttpException(1004, bVar.f60862c, "2: response code error : " + bVar.f60862c + " segment=" + iVar);
                                MethodCollector.o(13997);
                                throw downloadHttpException;
                            }
                        } else {
                            DownloadHttpException downloadHttpException2 = new DownloadHttpException(1004, bVar.f60862c, "1: response code error : " + bVar.f60862c + " segment=" + iVar);
                            MethodCollector.o(13997);
                            throw downloadHttpException2;
                        }
                    }
                    if (!oVar.f60972d) {
                        b bVar2 = this.f60938d;
                        if (!(bVar2 == null && (bVar2 = this.f60939e) == null)) {
                            long j2 = bVar.j();
                            long j3 = bVar2.j();
                            if (j2 != j3) {
                                String str = "total len not equals,len=" + j2 + ",sLen=" + j3 + ",code=" + bVar.f60862c + ",sCode=" + bVar2.f60862c + ",range=" + bVar.e() + ",sRange = " + bVar2.e() + ",url = " + bVar.f60860a + ",sUrl=" + bVar2.f60860a;
                                a.e("SegmentDispatcher", str);
                                if (j2 > 0 && j3 > 0) {
                                    BaseException baseException = new BaseException(1074, str);
                                    MethodCollector.o(13997);
                                    throw baseException;
                                }
                            }
                            String c2 = bVar.c();
                            String c3 = bVar2.c();
                            if (!TextUtils.equals(c2, c3)) {
                                String str2 = "etag not equals with main url, etag = " + c2 + ", mainEtag = " + c3;
                                a.e("SegmentDispatcher", str2);
                                if (!TextUtils.isEmpty(c2) && !TextUtils.isEmpty(c3) && !c2.equalsIgnoreCase(c3)) {
                                    BaseException baseException2 = new BaseException(1074, str2);
                                    MethodCollector.o(13997);
                                    throw baseException2;
                                }
                            }
                        }
                        if (this.f60939e == null) {
                            this.f60939e = bVar;
                            if (this.f60941g.getTotalBytes() <= 0) {
                                long j4 = bVar.j();
                                a.c("SegmentDispatcher", "checkSegmentHttpResponse:len=" + j4 + ",url=" + oVar.f60969a);
                                this.f60941g.setTotalBytes(j4);
                            }
                            synchronized (this.t) {
                                try {
                                    this.t.notify();
                                } catch (Throwable th) {
                                    MethodCollector.o(13997);
                                    throw th;
                                }
                            }
                        }
                    } else if (this.f60938d == null) {
                        this.f60938d = bVar;
                        synchronized (this.t) {
                            try {
                                this.t.notify();
                            } catch (Throwable th2) {
                                MethodCollector.o(13997);
                                throw th2;
                            }
                        }
                        f fVar = this.f60944j;
                        if (fVar != null) {
                            fVar.a(oVar.f60969a, bVar.f60861b, iVar.d());
                        }
                        long j5 = bVar.j();
                        if (j5 > 0) {
                            for (i iVar2 : this.p) {
                                if (iVar2.f60929c <= 0 || iVar2.f60929c > j5 - 1) {
                                    iVar2.b(j5 - 1);
                                }
                            }
                        }
                    }
                    lVar.p = false;
                    if (this.n <= 0) {
                        long totalBytes = this.f60941g.getTotalBytes();
                        this.n = totalBytes;
                        if (totalBytes <= 0) {
                            this.n = bVar.j();
                        }
                        e();
                    } else if (this.f60942h.c()) {
                        e();
                    }
                } else {
                    SegmentApplyException segmentApplyException2 = new SegmentApplyException(5, "applySegment");
                    MethodCollector.o(13997);
                    throw segmentApplyException2;
                }
            } finally {
                MethodCollector.o(13997);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.f
    public final void a(l lVar, i iVar) {
        i iVar2;
        i iVar3;
        MethodCollector.i(14167);
        synchronized (this) {
            try {
                a.c("SegmentDispatcher", "applySegment: start ".concat(String.valueOf(iVar)));
                if (iVar.f60931e == lVar) {
                    a.c("SegmentDispatcher", "applySegment: " + lVar + " is already the owner of " + iVar);
                } else if (iVar.f60931e != null) {
                    a.e("SegmentDispatcher", "applySegment: " + iVar + " is already has an owner:" + iVar.f60931e);
                    SegmentApplyException segmentApplyException = new SegmentApplyException(1, "segment already has an owner");
                    MethodCollector.o(14167);
                    throw segmentApplyException;
                } else if (lVar.f60957d == iVar.d()) {
                    long j2 = iVar.f60927a;
                    int a2 = a(j2);
                    if (a2 == -1 || (iVar2 = this.p.get(a2)) == null) {
                        a.e("SegmentDispatcher", "applySegment: " + iVar + " not exist! segmentIndex = " + a2);
                        SegmentApplyException segmentApplyException2 = new SegmentApplyException(2, "segment not exist");
                        MethodCollector.o(14167);
                        throw segmentApplyException2;
                    }
                    if (iVar2 != iVar) {
                        if (iVar2.f60927a == iVar.f60927a) {
                            long c2 = c(iVar2);
                            if (c2 > 0) {
                                l lVar2 = iVar2.f60931e;
                                if (lVar2 != null) {
                                    if (c2 < 524288 && lVar.t - lVar2.t > 1000 && iVar2.d() - iVar.d() < c2 / 2) {
                                        lVar2.a(true);
                                    }
                                }
                                iVar.b(iVar2.f60929c);
                                iVar.f60932f = iVar2.f60932f;
                                this.p.set(a2, iVar);
                            }
                        }
                        a.e("SegmentDispatcher", "applySegment: " + iVar + " not exist! but has another same segment, segmentInList = " + iVar2);
                        SegmentApplyException segmentApplyException3 = new SegmentApplyException(2, "segment not exist, but has another same segment");
                        MethodCollector.o(14167);
                        throw segmentApplyException3;
                    }
                    long a3 = iVar.a();
                    int i2 = a2 - 1;
                    while (true) {
                        if (i2 < 0) {
                            break;
                        }
                        i iVar4 = this.p.get(i2);
                        long j3 = iVar4.f60929c;
                        if (j3 <= 0 || j3 >= j2) {
                            if (a3 <= 0 && iVar4.d() > j2) {
                                a.e("SegmentDispatcher", "applySegment:prev's current has over this start, prev = " + iVar4 + ", segment = " + iVar);
                                this.p.remove(iVar);
                                SegmentApplyException segmentApplyException4 = new SegmentApplyException(3, "prev overstep");
                                MethodCollector.o(14167);
                                throw segmentApplyException4;
                            } else if (iVar4.f60931e == null) {
                                iVar4.b(j2 - 1);
                                a.c("SegmentDispatcher", "applySegment: prev set end, prev = ".concat(String.valueOf(iVar4)));
                                if (iVar4.a() > 0) {
                                    break;
                                }
                            } else {
                                l lVar3 = iVar4.f60931e;
                                long j4 = j2 - 1;
                                long j5 = lVar3.f60959f;
                                if (j4 > 0 || j5 <= 0) {
                                    if (j4 <= j5 || j5 <= 0) {
                                        lVar3.f60958e = j4;
                                        lVar3.f60964k = true;
                                        iVar4.b(j4);
                                        a.c("SegmentDispatcher", "applySegment: adjustSegmentEndOffset succeed, prev = ".concat(String.valueOf(iVar4)));
                                    }
                                }
                                a.e("SegmentDispatcher", "applySegment: adjustSegmentEndOffset filed, prev = ".concat(String.valueOf(iVar4)));
                                SegmentApplyException segmentApplyException5 = new SegmentApplyException(4, "prev end adjust fail");
                                MethodCollector.o(14167);
                                throw segmentApplyException5;
                            }
                        }
                        i2--;
                    }
                    int i3 = a2 + 1;
                    int size = this.p.size();
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        iVar3 = this.p.get(i3);
                        if (iVar3.a() > 0 || iVar3.f60931e != null) {
                            long j6 = iVar.f60929c;
                            long j7 = iVar3.f60927a;
                        } else {
                            i3++;
                        }
                    }
                    long j62 = iVar.f60929c;
                    long j72 = iVar3.f60927a;
                    if (j62 <= 0 || j62 >= j72) {
                        long j8 = j72 - 1;
                        iVar.b(j8);
                        a.c("SegmentDispatcher", "applySegment: segment set end:" + j8 + ", later = " + iVar3);
                    }
                    long j9 = iVar.f60929c;
                    if (j9 <= 0 || (j2 <= j9 && iVar.d() <= j9)) {
                        iVar.f60931e = lVar;
                        a.c("SegmentDispatcher", "applySegment: OK ".concat(String.valueOf(iVar)));
                    } else {
                        SegmentApplyException segmentApplyException6 = new SegmentApplyException(6, "applySegment: ".concat(String.valueOf(iVar)));
                        MethodCollector.o(14167);
                        throw segmentApplyException6;
                    }
                } else {
                    SegmentApplyException segmentApplyException7 = new SegmentApplyException(5, "applySegment");
                    MethodCollector.o(14167);
                    throw segmentApplyException7;
                }
            } finally {
                MethodCollector.o(14167);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.f
    public final void b(l lVar, i iVar) {
        MethodCollector.i(14200);
        synchronized (this) {
            try {
                if (iVar.f60931e == lVar) {
                    a.c("SegmentDispatcher", "unApplySegment ".concat(String.valueOf(iVar)));
                    iVar.c(lVar.f60960g);
                    iVar.f60931e = null;
                    o oVar = lVar.f60956c;
                    try {
                        synchronized (lVar.f60954a) {
                            try {
                                long c2 = lVar.c();
                                if (c2 > 0) {
                                    lVar.f60961h += c2;
                                    oVar.f60973e.addAndGet(c2);
                                }
                                lVar.f60960g = -1;
                            } catch (Throwable th) {
                                MethodCollector.o(14200);
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            } finally {
                MethodCollector.o(14200);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.f
    public final void a(l lVar, BaseException baseException, int i2, int i3) {
        boolean b2 = g.b(baseException);
        int errorCode = baseException.getErrorCode();
        if (errorCode == 1047 || errorCode == 1074 || errorCode == 1055 || b2 || i2 >= i3) {
            d(lVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.f
    public final void a(l lVar, i iVar, BaseException baseException) {
        MethodCollector.i(14228);
        synchronized (this) {
            try {
                a.e("SegmentDispatcher", "onSegmentFailed: segment = " + iVar + ", e = " + baseException);
                lVar.p = true;
                if (lVar.f60963j == 0) {
                    this.r = baseException;
                }
                if (h()) {
                    if (this.r == null) {
                        this.r = baseException;
                    }
                    this.w = true;
                    a(this.r);
                }
            } finally {
                MethodCollector.o(14228);
            }
        }
    }

    public final boolean a(List<i> list) {
        long j2;
        BaseException baseException;
        MethodCollector.i(12618);
        try {
            this.f60937c.add(new o(this.f60941g.getUrl(), true));
            List<String> backUpUrls = this.f60941g.getBackUpUrls();
            if (backUpUrls != null) {
                for (String str : backUpUrls) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f60937c.add(new o(str, false));
                    }
                }
            }
            this.f60942h.a(this.f60937c.size());
            long totalBytes = this.f60941g.getTotalBytes();
            this.n = totalBytes;
            if (totalBytes <= 0) {
                this.n = this.f60941g.getExpectFileLength();
                a.c("SegmentDispatcher", "initSegments: getExpectFileLength = " + this.n);
            }
            synchronized (this) {
                try {
                    this.o.clear();
                    j2 = -1;
                    if (list == null || list.isEmpty()) {
                        a((List<i>) this.o, new i(0, -1), false);
                    } else {
                        for (i iVar : list) {
                            a((List<i>) this.o, new i(iVar), false);
                        }
                        c(this.o);
                        b(this.o);
                    }
                    a.c("SegmentDispatcher", "initSegments: totalLength = " + this.n);
                } finally {
                    MethodCollector.o(12618);
                }
            }
            e();
            m mVar = this.f60942h;
            long optInt = (long) mVar.f60967a.optInt("connect_timeout", -1);
            if (optInt >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                j2 = optInt;
            }
            this.f60940f = j2;
            this.x = mVar.e();
            this.z = Math.min(Math.max(0.0f, (float) mVar.f60967a.optDouble("poor_speed_ratio", 0.0d)), 1.0f);
            int i2 = this.A;
            if (i2 > 0) {
                this.v.a(this.C, (long) i2);
            }
            f();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                synchronized (this.t) {
                    try {
                        if (this.f60938d == null && this.f60939e == null) {
                            this.t.wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f60938d == null && this.f60939e == null && (baseException = this.r) != null) {
                    MethodCollector.o(12618);
                    throw baseException;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                this.f60941g.increaseAllConnectTime(currentTimeMillis2);
                this.f60941g.setFirstSpeedTime(currentTimeMillis2);
                if (this.f60936b || this.f60935a) {
                    if (!this.f60936b && !this.f60935a) {
                        a.c("SegmentDispatcher", "finally pause");
                        b();
                    }
                    this.v.a();
                    MethodCollector.o(12618);
                    return true;
                }
                this.f60944j.a(this.n);
                if (this.x > 0) {
                    this.y = System.currentTimeMillis();
                    this.v.a(this.D, 0);
                }
                d();
                return true;
            } catch (Throwable th2) {
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                this.f60941g.increaseAllConnectTime(currentTimeMillis3);
                this.f60941g.setFirstSpeedTime(currentTimeMillis3);
                MethodCollector.o(12618);
                throw th2;
            }
        } finally {
            if (!this.f60936b && !this.f60935a) {
                a.c("SegmentDispatcher", "finally pause");
                b();
            }
            this.v.a();
            MethodCollector.o(12618);
        }
    }

    private boolean h() {
        for (l lVar : this.f60946l) {
            if (!lVar.p) {
                return false;
            }
        }
        return true;
    }

    private long k() {
        long j2 = 0;
        for (l lVar : this.f60946l) {
            j2 += lVar.b();
        }
        return j2;
    }

    private void f() {
        List<String> backUpUrls;
        int f2 = this.f60942h.f();
        if (f2 <= 0) {
            this.f60947m = false;
            e();
            return;
        }
        c cVar = c.C1332c.f60542a;
        cVar.a(this.f60941g.getUrl(), this);
        if (f2 > 2 && (backUpUrls = this.f60941g.getBackUpUrls()) != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    cVar.a(str, this);
                }
            }
        }
    }

    private o g() {
        o oVar;
        MethodCollector.i(13232);
        synchronized (this) {
            try {
                int size = this.q % this.f60937c.size();
                if (this.f60942h.b()) {
                    this.q++;
                }
                oVar = this.f60937c.get(size);
            } finally {
                MethodCollector.o(13232);
            }
        }
        return oVar;
    }

    private boolean j() {
        MethodCollector.i(14412);
        long j2 = this.n;
        long j3 = 0;
        if (j2 <= 0) {
            this.s = false;
            MethodCollector.o(14412);
            return false;
        }
        synchronized (this) {
            try {
                List<i> list = this.p;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = list.get(i2);
                    if (iVar.f60927a > j3) {
                        break;
                    }
                    if (iVar.d() > j3) {
                        j3 = iVar.d();
                    }
                }
                a.c("SegmentDispatcher", "isAllContentDownloaded: firstOffset = ".concat(String.valueOf(j3)));
                if (j3 >= j2) {
                    this.s = true;
                    return true;
                }
                this.s = false;
                MethodCollector.o(14412);
                return false;
            } finally {
                MethodCollector.o(14412);
            }
        }
    }

    private void d() {
        MethodCollector.i(12864);
        try {
            this.f60945k.a(this.f60943i);
        } catch (StreamClosedException unused) {
        } catch (BaseException e2) {
            a.e("SegmentDispatcher", "dispatchSegments: loopAndWrite e = ".concat(String.valueOf(e2)));
            a(e2);
            MethodCollector.o(12864);
            throw e2;
        }
        if (this.f60936b || this.f60935a) {
            MethodCollector.o(12864);
            return;
        }
        try {
            synchronized (this) {
                while (!this.o.isEmpty()) {
                    try {
                        i poll = this.o.poll();
                        if (poll != null) {
                            a(this.p, poll, true);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(12864);
                        throw th;
                    }
                }
                b(this.p);
            }
        } catch (Throwable unused2) {
        }
        if (!this.w || this.r == null) {
            if (this.f60941g.getCurBytes() != this.f60941g.getTotalBytes()) {
                DownloadInfo downloadInfo = this.f60941g;
                List<i> list = this.p;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("segments", i.a(list));
                    jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                    if (com.ss.android.socialbase.downloader.downloader.c.D() != null) {
                        downloadInfo.getId();
                    }
                } catch (Throwable unused3) {
                }
            }
            a.c("SegmentDispatcher", "dispatchSegments::download finished");
            MethodCollector.o(12864);
            return;
        }
        a.e("SegmentDispatcher", "dispatchSegments: loopAndWrite  failedException = " + this.r);
        BaseException baseException = this.r;
        MethodCollector.o(12864);
        throw baseException;
    }

    private void e() {
        int i2;
        MethodCollector.i(13058);
        int i3 = 1;
        if (this.n <= 0 || this.f60947m) {
            i2 = 1;
        } else {
            i2 = this.f60942h.f60968b;
            long j2 = this.n;
            long optInt = ((long) this.f60942h.f60967a.optInt("segment_min_init_mb", 10)) * 1048576;
            if (optInt < 5242880) {
                optInt = 5242880;
            }
            int i4 = (int) (j2 / optInt);
            if (i2 > i4) {
                i2 = i4;
            }
        }
        a.c("SegmentDispatcher", "dispatchReadThread: totalLength = " + this.n + ", threadCount = " + i2);
        if (i2 > 0) {
            i3 = i2;
        }
        synchronized (this) {
            do {
                try {
                    if (this.f60946l.size() >= i3) {
                        break;
                    } else if (this.f60936b || this.f60935a) {
                        MethodCollector.o(13058);
                        return;
                    } else {
                        l lVar = new l(this.f60941g, this, this.f60943i, g(), this.f60946l.size());
                        this.f60946l.add(lVar);
                        lVar.f60962i = com.ss.android.socialbase.downloader.downloader.c.k().submit(lVar);
                    }
                } finally {
                    MethodCollector.o(13058);
                }
            } while (!this.f60942h.c());
        }
    }

    private void i() {
        int size;
        if (this.n > 0 && (size = this.p.size()) > 1) {
            ArrayList arrayList = null;
            int i2 = 0;
            for (int i3 = 1; i3 < size; i3++) {
                i iVar = this.p.get(i2);
                i iVar2 = this.p.get(i3);
                if (iVar.d() > iVar2.f60927a && iVar2.a() <= 0 && iVar2.f60931e == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(iVar2);
                } else if (iVar2.d() > iVar.d()) {
                    i2++;
                }
            }
            if (arrayList != null) {
                for (Object obj : arrayList) {
                    this.p.remove(obj);
                    for (l lVar : this.f60946l) {
                        if (lVar.f60955b == obj) {
                            lVar.a(true);
                        }
                    }
                }
            }
        }
    }

    private i l() {
        i iVar;
        int i2;
        int i3;
        int i4;
        int i5 = 14633;
        MethodCollector.i(14633);
        int i6 = 0;
        while (true) {
            int i7 = Integer.MAX_VALUE;
            iVar = null;
            for (i iVar2 : this.p) {
                if (c(iVar2) > 0 && (i4 = iVar2.f60932f) < i7) {
                    iVar = iVar2;
                    i7 = i4;
                }
            }
            if (iVar == null) {
                MethodCollector.o(i5);
                return null;
            }
            l lVar = iVar.f60931e;
            if (lVar == null) {
                MethodCollector.o(i5);
                return iVar;
            } else if (iVar.f60932f >= 2) {
                MethodCollector.o(i5);
                return null;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                b(currentTimeMillis);
                if (currentTimeMillis - lVar.t > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                    long j2 = currentTimeMillis - InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                    i2 = i6;
                    if (lVar.t > 0) {
                        long b2 = this.u.b(j2, currentTimeMillis);
                        int size = this.f60946l.size();
                        if (size > 0) {
                            b2 /= (long) size;
                        }
                        long a2 = lVar.a(j2, currentTimeMillis);
                        if (a2 < 500) {
                            break;
                        }
                        double d2 = (double) a2;
                        double d3 = (double) b2;
                        Double.isNaN(d3);
                        if (d2 < d3 * 1.0d) {
                            break;
                        }
                    }
                    i5 = 14633;
                } else {
                    i2 = i6;
                }
                i6 = i2 + 1;
                if (i2 > 2) {
                    MethodCollector.o(i5);
                    return iVar;
                }
                try {
                    synchronized (this) {
                        try {
                            wait(500);
                        } catch (InterruptedException unused) {
                            MethodCollector.o(i3);
                            return null;
                        } catch (Throwable th) {
                            i3 = 14633;
                            MethodCollector.o(14633);
                            throw th;
                        }
                    }
                    i5 = 14633;
                } catch (InterruptedException unused2) {
                    i3 = 14633;
                    MethodCollector.o(i3);
                    return null;
                }
            }
        }
        MethodCollector.o(14633);
        return iVar;
    }

    public final void a() {
        MethodCollector.i(14374);
        a.c("SegmentDispatcher", "cancel");
        this.f60935a = true;
        synchronized (this) {
            try {
                for (l lVar : this.f60946l) {
                    lVar.d();
                }
            } catch (Throwable th) {
                MethodCollector.o(14374);
                throw th;
            }
        }
        g gVar = this.f60945k;
        gVar.f60915d = true;
        gVar.f60913b = true;
        this.f60943i.c();
        MethodCollector.o(14374);
    }

    /* JADX INFO: finally extract failed */
    public final long c() {
        MethodCollector.i(11535);
        if (this.f60935a || this.f60936b) {
            MethodCollector.o(11535);
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            try {
                b(currentTimeMillis);
                long e2 = this.f60942h.e();
                if (e2 > 0) {
                    long j2 = this.y;
                    if (j2 > 0 && currentTimeMillis - j2 > e2) {
                        long j3 = currentTimeMillis - e2;
                        long b2 = this.u.b(j3, currentTimeMillis);
                        int size = this.f60946l.size();
                        if (size > 0) {
                            b2 /= (long) size;
                        }
                        long max = (long) Math.max(10.0f, ((float) b2) * this.z);
                        int i2 = size / 2;
                        l lVar = null;
                        int i3 = 0;
                        long j4 = Long.MAX_VALUE;
                        for (l lVar2 : this.f60946l) {
                            if (lVar2.t > 0) {
                                i3++;
                                if (lVar2.t < j3) {
                                    long a2 = lVar2.a(j3, currentTimeMillis);
                                    if (a2 >= 0 && a2 < j4) {
                                        lVar = lVar2;
                                        j4 = a2;
                                    }
                                }
                            }
                        }
                        if (lVar == null || i3 < i2 || j4 >= max) {
                            lVar = null;
                        } else {
                            a.c("SegmentDispatcher", "findPoorReadThread: ----------- minSpeed = " + j4 + ", threadIndex = " + lVar.f60963j);
                        }
                        if (lVar != null) {
                            d(lVar);
                            a.d("SegmentDispatcher", "handlePoorReadThread: reconnect for poor speed, threadIndex = " + lVar.f60963j);
                            lVar.a(false);
                        } else {
                            l a3 = a(true, currentTimeMillis, e2);
                            if (a3 != null) {
                                d(a3);
                                a.d("SegmentDispatcher", "handlePoorReadThread: reconnect for connect timeout, threadIndex = " + a3.f60963j);
                                a3.a(false);
                            }
                        }
                        this.y = currentTimeMillis;
                        this.A++;
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(11535);
                throw th;
            }
        }
        MethodCollector.o(11535);
        return InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    }

    public final void b() {
        MethodCollector.i(14393);
        a.c("SegmentDispatcher", "pause1");
        this.f60936b = true;
        synchronized (this) {
            try {
                for (l lVar : this.f60946l) {
                    lVar.d();
                }
            } catch (Throwable th) {
                MethodCollector.o(14393);
                throw th;
            }
        }
        g gVar = this.f60945k;
        gVar.f60914c = true;
        gVar.f60913b = true;
        this.f60943i.c();
        MethodCollector.o(14393);
    }

    private long c(i iVar) {
        long b2 = iVar.b();
        if (b2 != -1) {
            return b2;
        }
        long j2 = this.n;
        if (j2 > 0) {
            return j2 - iVar.d();
        }
        return b2;
    }

    private int a(long j2) {
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.p.get(i2);
            if (iVar.f60927a == j2) {
                return i2;
            }
            if (iVar.f60927a > j2) {
                return -1;
            }
        }
        return -1;
    }

    private void b(long j2) {
        this.u.a(this.f60941g.getCurBytes(), j2);
        for (l lVar : this.f60946l) {
            lVar.a(j2);
        }
    }

    private void a(BaseException baseException) {
        MethodCollector.i(14328);
        a.e("SegmentDispatcher", "onError, e = ".concat(String.valueOf(baseException)));
        this.r = baseException;
        this.f60943i.c();
        synchronized (this) {
            try {
                for (l lVar : this.f60946l) {
                    lVar.d();
                }
            } finally {
                MethodCollector.o(14328);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.f
    public final void c(l lVar) {
        MethodCollector.i(14298);
        a.c("SegmentDispatcher", "onReaderExit: threadIndex = " + lVar.f60963j);
        synchronized (this) {
            try {
                lVar.q = true;
                this.f60946l.remove(lVar);
                i();
                if (!this.f60946l.isEmpty()) {
                    if (j()) {
                        for (l lVar2 : this.f60946l) {
                            lVar2.d();
                        }
                    }
                }
                a.c("SegmentDispatcher", "onComplete");
                this.f60943i.c();
                synchronized (this.t) {
                    try {
                        this.t.notify();
                    } catch (Throwable th) {
                        MethodCollector.o(14298);
                        throw th;
                    }
                }
            } finally {
                MethodCollector.o(14298);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r6.f60942h.a() == 1) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(com.ss.android.socialbase.downloader.segment.l r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.j.d(com.ss.android.socialbase.downloader.segment.l):boolean");
    }

    private void b(List<i> list) {
        long a2 = n.a(list);
        a.c("SegmentDispatcher", "checkDownloadBytes: getCurBytes = " + this.f60941g.getCurBytes() + ", totalBytes = " + this.f60941g.getTotalBytes() + ", downloadedBytes = " + a2);
        if (a2 > this.f60941g.getTotalBytes() && this.f60941g.getTotalBytes() > 0) {
            a2 = this.f60941g.getTotalBytes();
        }
        if (this.f60941g.getCurBytes() != this.f60941g.getTotalBytes() && this.f60941g.getCurBytes() != a2) {
            this.f60941g.setCurBytes(a2);
        }
    }

    private void c(List<i> list) {
        long j2 = list.get(0).f60927a;
        if (j2 > 0) {
            a(list, new i(0, j2 - 1), true);
        }
        Iterator<i> it = list.iterator();
        if (it.hasNext()) {
            i next = it.next();
            while (it.hasNext()) {
                i next2 = it.next();
                if (next.f60929c < next2.f60927a - 1) {
                    a.d("SegmentDispatcher", "fixSegment: segment = " + next + ", new end = " + (next2.f60927a - 1));
                    next.b(next2.f60927a - 1);
                }
                next = next2;
            }
        }
        i iVar = list.get(list.size() - 1);
        long totalBytes = this.f60941g.getTotalBytes();
        if (totalBytes <= 0 || (iVar.f60929c != -1 && iVar.f60929c < totalBytes - 1)) {
            a.d("SegmentDispatcher", "fixSegment: last segment = " + iVar + ", new end=-1");
            iVar.b(-1);
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.f
    public final e b(i iVar) {
        e eVar;
        MethodCollector.i(14201);
        synchronized (this) {
            try {
                k kVar = new k(this.f60941g, this.f60943i, iVar);
                g gVar = this.f60945k;
                synchronized (gVar) {
                    try {
                        gVar.f60912a.add(kVar);
                    } finally {
                        MethodCollector.o(14201);
                    }
                }
                eVar = kVar.f60953c;
            } finally {
                MethodCollector.o(14201);
            }
        }
        return eVar;
    }

    @Override // com.ss.android.socialbase.downloader.segment.f
    public final void a(i iVar) {
        MethodCollector.i(13895);
        synchronized (this) {
            try {
                iVar.f60932f--;
            } finally {
                MethodCollector.o(13895);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d7, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r10.f60932f++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r10.f60932f <= 1) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r1 = new com.ss.android.socialbase.downloader.segment.i(r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0208 A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c2 A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0166 A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016e A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017e A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0180 A[Catch:{ all -> 0x02e0 }] */
    @Override // com.ss.android.socialbase.downloader.segment.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.socialbase.downloader.segment.i b(com.ss.android.socialbase.downloader.segment.l r20) {
        /*
        // Method dump skipped, instructions count: 744
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.j.b(com.ss.android.socialbase.downloader.segment.l):com.ss.android.socialbase.downloader.segment.i");
    }

    @Override // com.ss.android.socialbase.downloader.segment.f
    public final void a(l lVar) {
        if (this.B) {
            a.c("SegmentDispatcher", "onReaderRun, threadIndex = " + lVar.f60963j);
        }
    }

    private void b(String str, List<o> list) {
        if (this.B) {
            Iterator<o> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        int f2 = this.f60942h.f();
        if (f2 == 1 || f2 == 3) {
            int size = this.f60937c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (!TextUtils.equals(this.f60937c.get(i2).f60969a, str)) {
                    i2++;
                } else if (i2 >= 0 && i2 < this.f60937c.size()) {
                    this.f60937c.addAll(i2 + 1, list);
                    return;
                }
            }
        }
        this.f60937c.addAll(list);
    }

    private static void a(List<i> list, i iVar, boolean z2) {
        long j2 = iVar.f60927a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size && j2 >= list.get(i2).f60927a) {
            i2++;
        }
        list.add(i2, iVar);
        if (z2) {
            iVar.f60930d = size;
        }
    }

    public j(DownloadInfo downloadInfo, m mVar, f fVar) {
        boolean z2 = true;
        this.f60947m = true;
        this.o = new LinkedList<>();
        this.p = new ArrayList();
        this.t = new Object();
        this.w = false;
        this.C = new e.b() {
            /* class com.ss.android.socialbase.downloader.segment.j.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            private int f60949b;

            static {
                Covode.recordClassIndex(37566);
            }

            @Override // com.ss.android.socialbase.downloader.j.e.b
            public final long a() {
                MethodCollector.i(14185);
                if (j.this.f60935a || j.this.f60936b) {
                    MethodCollector.o(14185);
                    return -1;
                }
                synchronized (j.this) {
                    try {
                        if (j.this.f60938d != null || j.this.f60939e != null) {
                            return -1;
                        }
                        long j2 = j.this.f60940f;
                        if (j2 <= 0) {
                            MethodCollector.o(14185);
                            return -1;
                        }
                        this.f60949b++;
                        l a2 = j.this.a(false, System.currentTimeMillis(), j2);
                        if (a2 != null) {
                            j.this.d(a2);
                            a2.a(false);
                            long size = ((long) ((this.f60949b / j.this.f60937c.size()) + 1)) * j2;
                            MethodCollector.o(14185);
                            return size;
                        }
                        MethodCollector.o(14185);
                        return j2;
                    } finally {
                        MethodCollector.o(14185);
                    }
                }
            }
        };
        this.D = new e.b() {
            /* class com.ss.android.socialbase.downloader.segment.j.AnonymousClass2 */

            static {
                Covode.recordClassIndex(37567);
            }

            @Override // com.ss.android.socialbase.downloader.j.e.b
            public final long a() {
                return j.this.c();
            }
        };
        this.f60941g = downloadInfo;
        this.f60942h = mVar;
        b bVar = new b(mVar.f60967a.optInt("buffer_count", 512), mVar.f60967a.optInt("buffer_size", 8192));
        this.f60943i = bVar;
        this.f60944j = fVar;
        this.f60945k = new g(downloadInfo, fVar, bVar);
        this.v = new e();
        this.u = new com.ss.android.socialbase.downloader.k.f();
        this.B = com.ss.android.socialbase.downloader.i.a.a(downloadInfo.getId(), null).a("debug", 0) != 1 ? false : z2;
    }

    public final l a(boolean z2, long j2, long j3) {
        l lVar = null;
        for (l lVar2 : this.f60946l) {
            if ((lVar2.f60963j != 0 || z2) && lVar2.r > 0 && lVar2.s <= 0 && j2 - lVar2.r > j3) {
                if (lVar == null || lVar2.r < lVar.r) {
                    lVar = lVar2;
                }
            }
        }
        return lVar;
    }
}
