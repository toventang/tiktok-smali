package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.metrics.b.e;
import com.toutiao.proxyserver.c.c;
import com.toutiao.proxyserver.g.b;
import com.toutiao.proxyserver.net.e;
import com.toutiao.proxyserver.x;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class a implements ac {

    /* renamed from: a  reason: collision with root package name */
    protected volatile b f154712a;

    /* renamed from: b  reason: collision with root package name */
    protected final c f154713b;

    /* renamed from: c  reason: collision with root package name */
    protected final AtomicInteger f154714c = new AtomicInteger();

    /* renamed from: d  reason: collision with root package name */
    protected final AtomicLong f154715d = new AtomicLong();

    /* renamed from: e  reason: collision with root package name */
    protected volatile List<com.toutiao.proxyserver.net.c> f154716e;

    /* renamed from: f  reason: collision with root package name */
    protected volatile com.toutiao.proxyserver.net.a f154717f;

    /* renamed from: g  reason: collision with root package name */
    protected volatile String f154718g;

    /* renamed from: h  reason: collision with root package name */
    protected volatile String f154719h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile y f154720i;

    /* renamed from: j  reason: collision with root package name */
    protected volatile ad f154721j;

    /* renamed from: k  reason: collision with root package name */
    protected volatile int f154722k;

    /* renamed from: l  reason: collision with root package name */
    protected AtomicLong f154723l = new AtomicLong(0);

    /* renamed from: m  reason: collision with root package name */
    private AtomicLong f154724m = new AtomicLong(0);
    private final AtomicInteger n = new AtomicInteger(0);
    private int o = -1;

    static {
        Covode.recordClassIndex(103087);
    }

    /* access modifiers changed from: protected */
    public final void a(final boolean z, final String str, final int i2, final int i3, final String str2, final String str3) {
        final o oVar = u.f154992g;
        if (oVar != null) {
            b.b(new Runnable() {
                /* class com.toutiao.proxyserver.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(103089);
                }

                public final void run() {
                    oVar.a(z, str, i2, i3, str3);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        if (r7 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Throwable r25, java.lang.String r26, int r27) {
        /*
        // Method dump skipped, instructions count: 427
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.a.a(java.lang.Throwable, java.lang.String, int):void");
    }

    /* access modifiers changed from: protected */
    public final void a(final String str, final String str2, final int i2, final long j2) {
        b.b(new Runnable() {
            /* class com.toutiao.proxyserver.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(103091);
            }

            public final void run() {
                if (u.f154992g != null) {
                    try {
                        o oVar = u.f154992g;
                        String str = str;
                        String str2 = str2;
                        int i2 = i2;
                        long j2 = j2;
                        com.toutiao.proxyserver.b.b bVar = new com.toutiao.proxyserver.b.b();
                        bVar.f154785a = str;
                        bVar.f154786b = str2;
                        bVar.f154787c = i2;
                        bVar.f154788d = (int) j2;
                        oVar.a(bVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void a(final String str, final String str2, final long j2, final long j3) {
        b.b(new Runnable() {
            /* class com.toutiao.proxyserver.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(103092);
            }

            public final void run() {
                if (u.f154993h != null) {
                    try {
                        com.toutiao.proxyserver.b.a aVar = new com.toutiao.proxyserver.b.a();
                        aVar.f154783c = j2;
                        aVar.f154784d = j3;
                        aVar.f154781a = str;
                        aVar.f154782b = str2;
                        u.f154993h.a(aVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public void a() {
        if (this.n.compareAndSet(0, 1)) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        com.toutiao.proxyserver.net.a aVar = this.f154717f;
        this.f154717f = null;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final boolean c() {
        if (this.n.get() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        this.n.compareAndSet(0, 2);
        this.f154717f = null;
    }

    public final boolean e() {
        if (this.n.get() == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        if (c()) {
            throw new e();
        }
    }

    /* access modifiers changed from: protected */
    public final void i() {
        this.f154724m.set(SystemClock.elapsedRealtime());
    }

    /* access modifiers changed from: protected */
    public final void j() {
        this.f154723l.set(0);
        this.f154724m.set(0);
    }

    /* access modifiers changed from: protected */
    public final int g() {
        if (this.f154720i != null) {
            return this.f154720i.f155052c.f155053a;
        }
        if (this.f154712a instanceof g) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void h() {
        this.f154723l.getAndAdd(SystemClock.elapsedRealtime() - this.f154724m.get());
    }

    /* access modifiers changed from: protected */
    public final void a(final String str) {
        final o oVar = u.f154992g;
        if (oVar != null) {
            b.b(new Runnable() {
                /* class com.toutiao.proxyserver.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(103090);
                }

                public final void run() {
                    o oVar = oVar;
                    a.this.g();
                    oVar.a(a.this.f154714c.get(), a.this.f154723l.get(), 0);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public final void a(final int i2, final String str) {
        b.b(new Runnable() {
            /* class com.toutiao.proxyserver.a.AnonymousClass8 */

            static {
                Covode.recordClassIndex(103095);
            }

            public final void run() {
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        com.toutiao.proxyserver.net.a aVar;
        if (i2 == 1 && (aVar = this.f154717f) != null) {
            String a2 = aVar.a(null);
            if (u.f154996k != null) {
                u.f154996k.a(a2, i3);
            }
        }
    }

    public a(b bVar, c cVar) {
        this.f154712a = bVar;
        this.f154713b = cVar;
        this.f154722k = 0;
    }

    /* access modifiers changed from: protected */
    public final void a(final int i2, final int i3) {
        final o oVar = u.f154992g;
        if (oVar != null && i2 > 0 && i3 >= 0) {
            int i4 = u.x;
            final int g2 = g();
            if (i4 == 1 || (i4 == 2 && g2 == 1)) {
                int i5 = (int) ((((float) i3) / ((float) i2)) * 100.0f);
                if (i5 > 100) {
                    i5 = 100;
                }
                synchronized (this) {
                    int i6 = this.o + u.o;
                    if (i6 > 100) {
                        i6 = 100;
                    }
                    if ((i5 > i6 || i5 == 100) && this.o != 100) {
                        this.o = i5;
                        b.b(new Runnable() {
                            /* class com.toutiao.proxyserver.a.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(103088);
                            }

                            public final void run() {
                                oVar.a(a.this.f154718g, i2, i3);
                            }
                        });
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Exception exc, int i2, int i3) {
        com.toutiao.proxyserver.net.a aVar;
        if (i2 == 1 && (aVar = this.f154717f) != null) {
            String a2 = aVar.a(exc);
            if (u.f154996k != null) {
                u.f154996k.a(exc, a2, i3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(final Exception exc, final int i2, final String str) {
        b.b(new Runnable() {
            /* class com.toutiao.proxyserver.a.AnonymousClass7 */

            static {
                Covode.recordClassIndex(103094);
            }

            public final void run() {
                j jVar;
                if (u.f154992g != null) {
                    o oVar = u.f154992g;
                    Exception exc = exc;
                    if (exc instanceof z) {
                        jVar = new j(((z) exc).errorCode, "RequestException", exc);
                    } else if (exc instanceof IOException) {
                        jVar = new j(2, "IOException", exc);
                    } else if (exc instanceof x.a) {
                        jVar = new j(4, "RandomAccessFileWrapper.FileException", exc);
                    } else if (exc instanceof f) {
                        jVar = new j(5, "ContentLengthNotMatchException", exc);
                    } else if (exc instanceof c) {
                        jVar = new j(15, "CacheWriteException", exc);
                    } else {
                        jVar = new j(16, "OtherException", exc);
                    }
                    oVar.a(jVar, i2, str);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void a(final String str, final int i2, final String str2) {
        b.a(new Runnable() {
            /* class com.toutiao.proxyserver.a.AnonymousClass6 */

            static {
                Covode.recordClassIndex(103093);
            }

            public final void run() {
                if (u.f154992g != null) {
                    u.f154992g.a(str, i2, str2);
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        if (r9 < 0) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.toutiao.proxyserver.net.e b(java.lang.String r8, int r9, int r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 464
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.a.b(java.lang.String, int, int, java.lang.String):com.toutiao.proxyserver.net.e");
    }

    /* access modifiers changed from: protected */
    public final e a(String str, int i2, int i3, String str2) {
        boolean z;
        int i4;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        int i5;
        long j2;
        String str6;
        String str7;
        String str8;
        int i6;
        String str9 = str;
        if (this.f154720i != null) {
            z = true;
        } else {
            z = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int lastIndexOf = str9.lastIndexOf("&source_id=");
        String str10 = "";
        if (!z || com.ss.android.ugc.aweme.metrics.b.a.a() || TextUtils.isEmpty(str9)) {
            i4 = 0;
            str3 = str10;
            strArr = null;
        } else {
            String str11 = this.f154718g;
            if (lastIndexOf <= 0 || (i6 = lastIndexOf + 11) >= str9.length()) {
                str3 = str10;
            } else {
                str3 = str9.substring(i6);
            }
            if (!TextUtils.isEmpty(str11)) {
                strArr = str11.split("_");
            } else {
                strArr = null;
            }
            long j3 = s.f93859c;
            s.f93859c = 0;
            com.ss.android.ugc.aweme.common.s sVar = new com.ss.android.ugc.aweme.common.s();
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() - j3;
            } else {
                j2 = 0;
            }
            com.ss.android.ugc.aweme.common.s a2 = sVar.a("duration", Long.toString(j2)).a("is_first", String.valueOf(com.ss.android.ugc.aweme.metrics.b.e.f109547a ? 1 : 0)).a("group_id", str3);
            if (strArr == null || strArr.length <= 3) {
                str6 = str10;
            } else {
                str6 = strArr[3];
            }
            com.ss.android.ugc.aweme.common.s a3 = a2.a("bitRate", str6);
            if (strArr == null || strArr.length <= 2) {
                str7 = str10;
            } else {
                str7 = strArr[2];
            }
            com.ss.android.ugc.aweme.common.s a4 = a3.a("video_type", str7);
            if (strArr == null || strArr.length <= 1) {
                str8 = str10;
            } else {
                str8 = strArr[1];
            }
            i.b(new e.a("video_api_request", a4.a("isBytevc1", str8).a("from_size", String.valueOf(i2)).a("to_size", String.valueOf(i3)).a()), i.f4824a);
            i4 = 0;
            com.ss.android.ugc.aweme.metrics.b.e.f109547a = false;
        }
        if (lastIndexOf > 0 && z && !TextUtils.isEmpty(str9)) {
            str9 = str9.substring(i4, lastIndexOf);
        }
        com.toutiao.proxyserver.net.e b2 = b(str9, i2, i3, str2);
        if (z && !com.ss.android.ugc.aweme.metrics.b.a.a()) {
            com.ss.android.ugc.aweme.common.s a5 = new com.ss.android.ugc.aweme.common.s().a("feed_tab", s.f93858b.name()).a("duration", String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)).a("is_first", String.valueOf(com.ss.android.ugc.aweme.metrics.b.e.f109548b ? 1 : 0)).a("group_id", str3);
            if (strArr == null || strArr.length <= 3) {
                str4 = str10;
            } else {
                str4 = strArr[3];
            }
            com.ss.android.ugc.aweme.common.s a6 = a5.a("bitRate", str4);
            if (strArr == null || strArr.length <= 2) {
                str5 = str10;
            } else {
                str5 = strArr[2];
            }
            com.ss.android.ugc.aweme.common.s a7 = a6.a("video_type", str5);
            if (strArr != null) {
                i5 = 1;
                if (strArr.length > 1) {
                    str10 = strArr[1];
                }
            } else {
                i5 = 1;
            }
            com.ss.android.ugc.aweme.common.s a8 = a7.a("isBytevc1", str10).a("from_size", String.valueOf(i2)).a("to_size", String.valueOf(i3));
            if (b2 == null || !b2.a()) {
                i5 = 0;
            }
            i.b(new e.a("video_api_response", a8.a("is_success", String.valueOf(i5)).a()), i.f4824a);
            com.ss.android.ugc.aweme.metrics.b.e.f109548b = false;
            if (s.f93860d < 0) {
                s.f93860d = SystemClock.elapsedRealtime();
            }
        }
        return b2;
    }
}
