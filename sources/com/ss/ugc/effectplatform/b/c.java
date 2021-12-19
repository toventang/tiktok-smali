package com.ss.ugc.effectplatform.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.a.a;
import com.ss.ugc.effectplatform.b.a.d;
import d.a.b.c.f;
import d.a.e.b;
import h.f.b.l;
import h.q;
import h.r;
import java.util.Set;

public class c implements f {

    /* renamed from: b */
    public static final a f153527b = new a((byte) 0);

    /* renamed from: a */
    public final String f153528a;

    /* renamed from: c */
    private d.a.b.a<com.ss.ugc.effectplatform.b.a.a> f153529c;

    /* renamed from: d */
    private final f f153530d;

    /* renamed from: e */
    private final int f153531e;

    /* renamed from: f */
    private final int f153532f;

    /* renamed from: g */
    private final long f153533g;

    /* renamed from: h */
    private final d f153534h;

    static {
        Covode.recordClassIndex(102365);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102366);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public void a() {
        b.a("DiskLruCacheImpl", this.f153528a + " is creating");
    }

    public final com.ss.ugc.effectplatform.b.a.a c() {
        Object obj;
        V v;
        f fVar = this.f153530d;
        fVar.f156552a.lock();
        try {
            if (this.f153529c.f156544a == null || (v = this.f153529c.f156544a) == null || !d.a.d.a.d.f(v.f153489g) || !d.a.d.a.d.b(v.f153483a)) {
                a();
                try {
                    obj = q.m223constructorimpl(a.C4084a.a(this.f153528a, this.f153531e, this.f153532f, this.f153533g, this.f153534h));
                } catch (Throwable th) {
                    obj = q.m223constructorimpl(r.a(th));
                }
                Throwable r0 = q.m226exceptionOrNullimpl(obj);
                if (r0 != null) {
                    b.a("DiskLruCacheImpl", "DiskLruCache.open fails, ex: ".concat(String.valueOf(r0)), null);
                }
                d.a.b.a<com.ss.ugc.effectplatform.b.a.a> aVar = this.f153529c;
                if (q.m228isFailureimpl(obj)) {
                    obj = null;
                }
                d.a.b.b.a(aVar, obj);
            }
            return this.f153529c.f156544a;
        } finally {
            fVar.f156552a.unlock();
        }
    }

    @Override // com.ss.ugc.effectplatform.b.f
    public void e() {
        try {
            com.ss.ugc.effectplatform.b.a.a c2 = c();
            if (c2 != null) {
                c2.e();
            }
            com.ss.ugc.effectplatform.b.a.a c3 = c();
            if (c3 != null) {
                f fVar = c3.f153486d;
                fVar.f156552a.lock();
                try {
                    if (d.a.d.a.d.b(c3.f153484b)) {
                        if (d.a.d.a.d.b(c3.f153483a)) {
                            d.a.d.a.d.c(c3.f153484b);
                        } else {
                            a.C4084a.a(c3.f153484b, c3.f153483a, false);
                        }
                    }
                    if (d.a.d.a.d.b(c3.f153483a)) {
                        try {
                            c3.b();
                            c3.c();
                            return;
                        } catch (Exception e2) {
                            b.a("DiskLruCache", "DiskLruCache " + c3.f153489g + " is corrupt: " + e2.getMessage() + ", removing", null);
                            c3.e();
                        }
                    }
                    if (!d.a.d.a.d.f(c3.f153489g)) {
                        d.a.d.a.d.e(c3.f153489g);
                    }
                    c3.d();
                    fVar.f156552a.unlock();
                    return;
                } finally {
                    fVar.f156552a.unlock();
                }
            } else {
                return;
            }
        } catch (Exception e3) {
            b.a("DiskLruCacheImpl", "clear: exception", e3);
        }
    }

    @Override // com.ss.ugc.effectplatform.b.f
    public final String b(String str) {
        l.c(str, "");
        d.a.d.a.c c2 = c(str);
        if (c2 == null) {
            return null;
        }
        return d.a.d.a.d.a(c2, d.a.d.a.b.Utf8);
    }

    @Override // com.ss.ugc.effectplatform.b.f
    public final d.a.d.a.c c(String str) {
        l.c(str, "");
        a.d a2 = a(str);
        if (a2 != null) {
            return a2.f153507b[0];
        }
        return null;
    }

    @Override // com.ss.ugc.effectplatform.b.f
    public final boolean e(String str) {
        l.c(str, "");
        String a2 = a.C4084a.a(str);
        com.ss.ugc.effectplatform.b.a.a c2 = c();
        if (c2 != null) {
            return c2.b(a2);
        }
        return false;
    }

    public final boolean g(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.b.a.a c2 = c();
        if (c2 != null) {
            return c2.a(str);
        }
        return false;
    }

    private final a.d a(String str) {
        String a2 = a.C4084a.a(str);
        try {
            com.ss.ugc.effectplatform.b.a.a c2 = c();
            if (c2 != null) {
                return c2.d(a2);
            }
            return null;
        } catch (Exception e2) {
            b.a("DiskLruCacheImpl", "get key:" + str + " exception", e2);
            return null;
        }
    }

    @Override // com.ss.ugc.effectplatform.b.f
    public final boolean d(String str) {
        l.c(str, "");
        String a2 = a.C4084a.a(str);
        try {
            com.ss.ugc.effectplatform.b.a.a c2 = c();
            if (c2 != null) {
                return c2.c(a2);
            }
            return false;
        } catch (Exception e2) {
            b.a("DiskLruCacheImpl", "remove key:" + str + " exception", e2);
            return false;
        }
    }

    @Override // com.ss.ugc.effectplatform.b.f
    public final void f(String str) {
        Set<String> a2;
        if (str != null) {
            l.c(str, "");
            int length = str.length();
            char[] cArr = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr[i2] = str.charAt(i2);
                if (cArr[i2] == d.a.d.a.d.f156619a.charAt(0)) {
                    cArr[i2] = '_';
                }
            }
            h.m.l lVar = new h.m.l(new String(cArr));
            com.ss.ugc.effectplatform.b.a.a c2 = c();
            if (!(c2 == null || (a2 = c2.a()) == null)) {
                for (T t : a2) {
                    if (lVar.matches(t)) {
                        d(t);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r8 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r8.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        d.a.e.b.a("DiskLruCacheImpl", "abort :".concat(java.lang.String.valueOf(r0)), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r4.a();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[SYNTHETIC, Splitter:B:20:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    @Override // com.ss.ugc.effectplatform.b.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(java.lang.String r10, d.a.d.a.c r11) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.b.c.a(java.lang.String, d.a.d.a.c):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r8 = null;
        r4 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC, Splitter:B:23:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070 A[SYNTHETIC, Splitter:B:28:0x0070] */
    @Override // com.ss.ugc.effectplatform.b.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.b.c.a(java.lang.String, java.lang.String):long");
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0099, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0146, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0148, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0149, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016f, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0171, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r2.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0199, code lost:
        r2.a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018b A[SYNTHETIC, Splitter:B:63:0x018b] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0199 A[Catch:{ Exception -> 0x019c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private h.p<java.lang.String, java.lang.Boolean> a(java.lang.String r18, d.a.d.a.c r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.b.c.a(java.lang.String, d.a.d.a.c, java.lang.String):h.p");
    }

    private c(String str, int i2, int i3, long j2, d dVar) {
        l.c(str, "");
        this.f153528a = str;
        this.f153531e = i2;
        this.f153532f = i3;
        this.f153533g = j2;
        this.f153534h = dVar;
        this.f153529c = new d.a.b.a<>(null);
        this.f153530d = new f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bc, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bd, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.c();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc A[SYNTHETIC, Splitter:B:29:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h.p<java.lang.String, java.lang.Boolean> a(java.lang.String r10, d.a.d.a.c r11, java.lang.String r12, long r13, h.f.a.m<? super java.lang.Integer, ? super java.lang.Long, h.z> r15) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.b.c.a(java.lang.String, d.a.d.a.c, java.lang.String, long, h.f.a.m):h.p");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i2, int i3, long j2, d dVar, int i4) {
        this(str, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 1 : i3, j2, (i4 & 16) != 0 ? null : dVar);
    }
}
