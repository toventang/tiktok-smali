package com.facebook.imagepipeline.j;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.b;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import com.facebook.common.g.h;
import com.facebook.common.g.j;
import com.facebook.common.h.a;
import com.facebook.h.c;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.d;
import com.facebook.imageutils.g;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class e implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final a<h> f47989a;

    /* renamed from: b  reason: collision with root package name */
    public final k<FileInputStream> f47990b;

    /* renamed from: c  reason: collision with root package name */
    public c f47991c;

    /* renamed from: d  reason: collision with root package name */
    public int f47992d;

    /* renamed from: e  reason: collision with root package name */
    public int f47993e;

    /* renamed from: f  reason: collision with root package name */
    public int f47994f;

    /* renamed from: g  reason: collision with root package name */
    public int f47995g;

    /* renamed from: h  reason: collision with root package name */
    public int f47996h;

    /* renamed from: i  reason: collision with root package name */
    public int f47997i;

    /* renamed from: j  reason: collision with root package name */
    public com.facebook.imagepipeline.common.a f47998j;

    /* renamed from: k  reason: collision with root package name */
    private ColorSpace f47999k;

    static {
        Covode.recordClassIndex(29019);
    }

    private ColorSpace l() {
        m();
        return this.f47999k;
    }

    public final c c() {
        m();
        return this.f47991c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a.c(this.f47989a);
    }

    public final int e() {
        m();
        return this.f47993e;
    }

    public final int f() {
        m();
        return this.f47994f;
    }

    public final int g() {
        m();
        return this.f47995g;
    }

    private void m() {
        if (this.f47994f < 0 || this.f47995g < 0) {
            j();
        }
    }

    public final int d() {
        m();
        return this.f47992d;
    }

    private Pair<Integer, Integer> n() {
        Pair<Integer, Integer> a2 = com.facebook.imageutils.h.a(b());
        if (a2 != null) {
            this.f47994f = ((Integer) a2.first).intValue();
            this.f47995g = ((Integer) a2.second).intValue();
        }
        return a2;
    }

    public final int h() {
        a<h> aVar = this.f47989a;
        if (aVar == null || aVar.a() == null) {
            return this.f47997i;
        }
        return this.f47989a.a().a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.j.e k() {
        /*
            r3 = this;
            com.facebook.common.d.k<java.io.FileInputStream> r0 = r3.f47990b
            if (r0 == 0) goto L_0x0011
            com.facebook.imagepipeline.j.e r0 = new com.facebook.imagepipeline.j.e
            com.facebook.common.d.k<java.io.FileInputStream> r2 = r3.f47990b
            int r1 = r3.f47997i
            r0.<init>(r2, r1)
        L_0x000d:
            r0.b(r3)
        L_0x0010:
            return r0
        L_0x0011:
            com.facebook.common.h.a<com.facebook.common.g.h> r0 = r3.f47989a
            com.facebook.common.h.a r1 = com.facebook.common.h.a.b(r0)
            if (r1 != 0) goto L_0x0020
            r0 = 0
        L_0x001a:
            com.facebook.common.h.a.c(r1)
            if (r0 == 0) goto L_0x0010
            goto L_0x000d
        L_0x0020:
            com.facebook.imagepipeline.j.e r0 = new com.facebook.imagepipeline.j.e     // Catch:{ all -> 0x0026 }
            r0.<init>(r1)     // Catch:{ all -> 0x0026 }
            goto L_0x001a
        L_0x0026:
            r0 = move-exception
            com.facebook.common.h.a.c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.j.e.k():com.facebook.imagepipeline.j.e");
    }

    private d p() {
        Throwable th;
        try {
            InputStream b2 = b();
            try {
                d b3 = com.facebook.imageutils.a.b(b2);
                this.f47999k = b3.f48476b;
                Pair<Integer, Integer> pair = b3.f48475a;
                if (pair != null) {
                    this.f47994f = ((Integer) pair.first).intValue();
                    this.f47995g = ((Integer) pair.second).intValue();
                }
                if (b2 != null) {
                    try {
                        b2.close();
                    } catch (IOException unused) {
                    }
                }
                return b3;
            } catch (Throwable th2) {
                th = th2;
                if (b2 != null) {
                    try {
                        b2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized boolean a() {
        MethodCollector.i(1209);
        if (!a.a((a<?>) this.f47989a)) {
            if (this.f47990b == null) {
                MethodCollector.o(1209);
                return false;
            }
        }
        MethodCollector.o(1209);
        return true;
    }

    public final InputStream b() {
        k<FileInputStream> kVar = this.f47990b;
        if (kVar != null) {
            return kVar.b();
        }
        a b2 = a.b(this.f47989a);
        if (b2 == null) {
            return null;
        }
        try {
            return new j((h) b2.a());
        } finally {
            a.c(b2);
        }
    }

    private Pair<Integer, Integer> o() {
        MethodCollector.i(8);
        InputStream b2 = b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = b2.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int[] a2 = com.facebook.imageutils.c.a(byteArray, byteArray.length);
            if (a2 != null) {
                this.f47994f = a2[0];
                this.f47995g = a2[1];
                this.f47992d = a2[2];
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(a2[0]), Integer.valueOf(a2[1]));
                try {
                    b.a(byteArrayOutputStream);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                MethodCollector.o(8);
                return pair;
            }
            try {
                b.a(byteArrayOutputStream);
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            MethodCollector.o(8);
            return null;
        } catch (IOException e4) {
            e4.printStackTrace();
            b.a(byteArrayOutputStream);
        } catch (Throwable th) {
            try {
                b.a(byteArrayOutputStream);
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            MethodCollector.o(8);
            throw th;
        }
    }

    public final String i() {
        a b2 = a.b(this.f47989a);
        if (b2 == null) {
            return "";
        }
        int min = Math.min(h(), 10);
        byte[] bArr = new byte[min];
        try {
            h hVar = (h) b2.a();
            if (hVar == null) {
                return "";
            }
            hVar.a(0, bArr, 0, min);
            b2.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i2 = 0; i2 < min; i2++) {
                sb.append(com.a.a("%02X", new Object[]{Byte.valueOf(bArr[i2])}));
            }
            return sb.toString();
        } finally {
            b2.close();
        }
    }

    public final void j() {
        Pair<Integer, Integer> pair;
        c a2 = com.facebook.h.d.a(b());
        this.f47991c = a2;
        if (com.facebook.h.b.a(a2)) {
            pair = n();
        } else if (com.facebook.h.b.c(a2)) {
            pair = o();
        } else {
            pair = p().f48475a;
        }
        if (a2 == com.facebook.h.b.f47621a && this.f47992d == -1) {
            if (pair != null) {
                int a3 = com.facebook.imageutils.e.a(b());
                this.f47993e = a3;
                this.f47992d = g.a(a3);
            }
        } else if (a2 == com.facebook.h.b.f47631k && this.f47992d == -1) {
            int a4 = HeifExifUtil.a(b());
            this.f47993e = a4;
            this.f47992d = g.a(a4);
        } else {
            this.f47992d = 0;
        }
    }

    public static void d(e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    public static e a(e eVar) {
        if (eVar != null) {
            return eVar.k();
        }
        return null;
    }

    public static boolean c(e eVar) {
        if (eVar.f47992d < 0 || eVar.f47994f < 0 || eVar.f47995g < 0) {
            return false;
        }
        return true;
    }

    public static boolean e(e eVar) {
        if (eVar == null || !eVar.a()) {
            return false;
        }
        return true;
    }

    private e(k<FileInputStream> kVar) {
        this.f47991c = c.f47633a;
        this.f47992d = -1;
        this.f47994f = -1;
        this.f47995g = -1;
        this.f47996h = 1;
        this.f47997i = -1;
        i.a(kVar);
        this.f47989a = null;
        this.f47990b = kVar;
    }

    public e(a<h> aVar) {
        this.f47991c = c.f47633a;
        this.f47992d = -1;
        this.f47994f = -1;
        this.f47995g = -1;
        this.f47996h = 1;
        this.f47997i = -1;
        i.a(a.a((a<?>) aVar));
        this.f47989a = aVar.clone();
        this.f47990b = null;
    }

    public final void b(e eVar) {
        this.f47991c = eVar.c();
        this.f47994f = eVar.f();
        this.f47995g = eVar.g();
        this.f47992d = eVar.d();
        this.f47993e = eVar.e();
        this.f47996h = eVar.f47996h;
        this.f47997i = eVar.h();
        this.f47998j = eVar.f47998j;
        this.f47999k = eVar.l();
    }

    private e(k<FileInputStream> kVar, int i2) {
        this(kVar);
        this.f47997i = i2;
    }
}
