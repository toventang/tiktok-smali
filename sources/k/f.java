package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.w;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class f implements Cloneable, ByteChannel, g, h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f158861c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f158862d;

    /* renamed from: a  reason: collision with root package name */
    public v f158863a;

    /* renamed from: b  reason: collision with root package name */
    public long f158864b;

    @Override // k.h, k.g
    public final f a() {
        return this;
    }

    @Override // java.lang.AutoCloseable, k.aa, java.io.Closeable, k.y, java.nio.channels.Channel
    public final void close() {
    }

    @Override // k.g, k.y, java.io.Flushable
    public final void flush() {
    }

    public final boolean isOpen() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105425);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // k.g
    public final /* bridge */ /* synthetic */ g b() {
        return this;
    }

    @Override // k.g
    public final /* bridge */ /* synthetic */ g c() {
        return this;
    }

    @Override // k.aa, k.y
    public final ab timeout() {
        return ab.NONE;
    }

    public final f a(f fVar, long j2, long j3) {
        long j4 = j3;
        long j5 = j2;
        l.c(fVar, "");
        c.a(this.f158864b, j5, j4);
        if (j4 == 0) {
            return this;
        }
        fVar.f158864b += j4;
        v vVar = this.f158863a;
        while (true) {
            if (vVar == null) {
                l.a();
            }
            if (j5 < ((long) (vVar.f158914c - vVar.f158913b))) {
                break;
            }
            j5 -= (long) (vVar.f158914c - vVar.f158913b);
            vVar = vVar.f158917f;
        }
        while (j4 > 0) {
            if (vVar == null) {
                l.a();
            }
            v a2 = vVar.a();
            a2.f158913b += (int) j5;
            a2.f158914c = Math.min(a2.f158913b + ((int) j4), a2.f158914c);
            v vVar2 = fVar.f158863a;
            if (vVar2 == null) {
                a2.f158918g = a2;
                a2.f158917f = a2.f158918g;
                fVar.f158863a = a2.f158917f;
            } else {
                v vVar3 = vVar2.f158918g;
                if (vVar3 == null) {
                    l.a();
                }
                vVar3.a(a2);
            }
            j4 -= (long) (a2.f158914c - a2.f158913b);
            vVar = vVar.f158917f;
            j5 = 0;
        }
        return this;
    }

    @Override // k.h
    public final void a(f fVar, long j2) {
        l.c(fVar, "");
        long j3 = this.f158864b;
        if (j3 >= j2) {
            fVar.write(this, j2);
        } else {
            fVar.write(this, j3);
            throw new EOFException();
        }
    }

    public final f a(String str, int i2, int i3) {
        char charAt;
        l.c(str, "");
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i2)).toString());
        } else if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        } else if (i3 <= str.length()) {
            while (i2 < i3) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < 128) {
                    v j2 = j(1);
                    byte[] bArr = j2.f158912a;
                    int i4 = j2.f158914c - i2;
                    int min = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt2;
                    while (true) {
                        i2 = i5;
                        if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                            int i6 = (i4 + i2) - j2.f158914c;
                            j2.f158914c += i6;
                            this.f158864b += (long) i6;
                        } else {
                            i5 = i2 + 1;
                            bArr[i2 + i4] = (byte) charAt;
                        }
                    }
                    int i62 = (i4 + i2) - j2.f158914c;
                    j2.f158914c += i62;
                    this.f158864b += (long) i62;
                } else {
                    if (charAt2 < 2048) {
                        a((charAt2 >> 6) | 192);
                        a((charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        a((charAt2 >> '\f') | 224);
                        a(((charAt2 >> 6) & 63) | 128);
                        a((charAt2 & '?') | 128);
                    } else {
                        int i7 = i2 + 1;
                        char charAt3 = i7 < i3 ? str.charAt(i7) : 0;
                        if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                            a(63);
                            i2 = i7;
                        } else {
                            int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                            a((i8 >> 18) | 240);
                            a(((i8 >> 12) & 63) | 128);
                            a(((i8 >> 6) & 63) | 128);
                            a((i8 & 63) | 128);
                            i2 += 2;
                        }
                    }
                    i2++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
    }

    public final f a(String str, int i2, int i3, Charset charset) {
        l.c(str, "");
        l.c(charset, "");
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i2)).toString());
        } else if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        } else if (i3 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        } else if (l.a(charset, h.m.d.f158808a)) {
            return a(str, i2, i3);
        } else {
            String substring = str.substring(i2, i3);
            l.a((Object) substring, "");
            if (substring != null) {
                byte[] bytes = substring.getBytes(charset);
                l.a((Object) bytes, "");
                return a(bytes, 0, bytes.length);
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    @Override // k.g
    public final OutputStream d() {
        return new d(this);
    }

    @Override // k.h
    public final InputStream f() {
        return new c(this);
    }

    @Override // k.h
    public final byte[] u() {
        return k(this.f158864b);
    }

    public final void v() {
        l(this.f158864b);
    }

    public static final class c extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f158872a;

        static {
            Covode.recordClassIndex(105427);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(this.f158872a.f158864b, 2147483647L);
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f158872a.f158864b > 0) {
                return this.f158872a.h() & 255;
            }
            return -1;
        }

        public final String toString() {
            return this.f158872a + ".inputStream()";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(f fVar) {
            this.f158872a = fVar;
            MethodCollector.i(4492);
            MethodCollector.o(4492);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) {
            l.c(bArr, "");
            return this.f158872a.b(bArr, i2, i3);
        }
    }

    @Override // k.h
    public final boolean e() {
        if (this.f158864b == 0) {
            return true;
        }
        return false;
    }

    @Override // k.h
    public final int m() {
        return c.a(j());
    }

    @Override // k.h
    public final long n() {
        return c.a(k());
    }

    public final i q() {
        return new i(u());
    }

    @Override // k.h
    public final String r() {
        return a(this.f158864b, h.m.d.f158808a);
    }

    @Override // k.h
    public final String s() {
        return i(Long.MAX_VALUE);
    }

    public final String toString() {
        return x().toString();
    }

    public static final class d extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f158873a;

        static {
            Covode.recordClassIndex(105428);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }

        public final String toString() {
            return this.f158873a + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
            this.f158873a.a(i2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(f fVar) {
            this.f158873a = fVar;
            MethodCollector.i(4426);
            MethodCollector.o(4426);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
            l.c(bArr, "");
            this.f158873a.a(bArr, i2, i3);
        }
    }

    static {
        Covode.recordClassIndex(105424);
        byte[] bytes = "0123456789abcdef".getBytes(h.m.d.f158808a);
        l.a((Object) bytes, "");
        f158862d = bytes;
    }

    public final short l() {
        int i2 = i() & 65535;
        return (short) (((i2 & 255) << 8) | ((65280 & i2) >>> 8));
    }

    public static final class b implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public f f158865a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f158866b;

        /* renamed from: c  reason: collision with root package name */
        public long f158867c = -1;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f158868d;

        /* renamed from: e  reason: collision with root package name */
        public int f158869e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f158870f = -1;

        /* renamed from: g  reason: collision with root package name */
        private v f158871g;

        static {
            Covode.recordClassIndex(105426);
        }

        public final int a() {
            long j2;
            long j3 = this.f158867c;
            f fVar = this.f158865a;
            if (fVar == null) {
                l.a();
            }
            if (j3 != fVar.f158864b) {
                long j4 = this.f158867c;
                if (j4 == -1) {
                    j2 = 0;
                } else {
                    j2 = j4 + ((long) (this.f158870f - this.f158869e));
                }
                return a(j2);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f158865a != null) {
                this.f158865a = null;
                this.f158871g = null;
                this.f158867c = -1;
                this.f158868d = null;
                this.f158869e = -1;
                this.f158870f = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int a(long j2) {
            f fVar = this.f158865a;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (j2 < -1 || j2 > fVar.f158864b) {
                String a2 = com.a.a("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(fVar.f158864b)}, 2));
                l.a((Object) a2, "");
                throw new ArrayIndexOutOfBoundsException(a2);
            } else if (j2 == -1 || j2 == fVar.f158864b) {
                this.f158871g = null;
                this.f158867c = j2;
                this.f158868d = null;
                this.f158869e = -1;
                this.f158870f = -1;
                return -1;
            } else {
                long j3 = 0;
                long j4 = fVar.f158864b;
                v vVar = fVar.f158863a;
                v vVar2 = fVar.f158863a;
                v vVar3 = this.f158871g;
                if (vVar3 != null) {
                    long j5 = this.f158867c - ((long) (this.f158869e - vVar3.f158913b));
                    if (j5 > j2) {
                        vVar2 = this.f158871g;
                        j4 = j5;
                    } else {
                        vVar = this.f158871g;
                        j3 = j5;
                    }
                }
                if (j4 - j2 > j2 - j3) {
                    while (true) {
                        if (vVar == null) {
                            l.a();
                        }
                        if (j2 < ((long) (vVar.f158914c - vVar.f158913b)) + j3) {
                            break;
                        }
                        j3 += (long) (vVar.f158914c - vVar.f158913b);
                        vVar = vVar.f158917f;
                    }
                } else {
                    while (j4 > j2) {
                        if (vVar2 == null) {
                            l.a();
                        }
                        vVar2 = vVar2.f158918g;
                        if (vVar2 == null) {
                            l.a();
                        }
                        j4 -= (long) (vVar2.f158914c - vVar2.f158913b);
                    }
                    j3 = j4;
                    vVar = vVar2;
                }
                if (this.f158866b) {
                    if (vVar == null) {
                        l.a();
                    }
                    if (vVar.f158915d) {
                        v b2 = vVar.b();
                        if (fVar.f158863a == vVar) {
                            fVar.f158863a = b2;
                        }
                        vVar = vVar.a(b2);
                        v vVar4 = vVar.f158918g;
                        if (vVar4 == null) {
                            l.a();
                        }
                        vVar4.c();
                    }
                }
                this.f158871g = vVar;
                this.f158867c = j2;
                if (vVar == null) {
                    l.a();
                }
                this.f158868d = vVar.f158912a;
                this.f158869e = vVar.f158913b + ((int) (j2 - j3));
                int i2 = vVar.f158914c;
                this.f158870f = i2;
                return i2 - this.f158869e;
            }
        }
    }

    public final long g() {
        long j2 = this.f158864b;
        if (j2 == 0) {
            return 0;
        }
        v vVar = this.f158863a;
        if (vVar == null) {
            l.a();
        }
        v vVar2 = vVar.f158918g;
        if (vVar2 == null) {
            l.a();
        }
        if (vVar2.f158914c >= 8192 || !vVar2.f158916e) {
            return j2;
        }
        return j2 - ((long) (vVar2.f158914c - vVar2.f158913b));
    }

    @Override // k.h
    public final byte h() {
        if (this.f158864b != 0) {
            v vVar = this.f158863a;
            if (vVar == null) {
                l.a();
            }
            int i2 = vVar.f158913b;
            int i3 = vVar.f158914c;
            int i4 = i2 + 1;
            byte b2 = vVar.f158912a[i2];
            this.f158864b--;
            if (i4 == i3) {
                this.f158863a = vVar.c();
                w.a(vVar);
            } else {
                vVar.f158913b = i4;
            }
            return b2;
        }
        throw new EOFException();
    }

    public final int hashCode() {
        v vVar = this.f158863a;
        if (vVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = vVar.f158914c;
            for (int i4 = vVar.f158913b; i4 < i3; i4++) {
                i2 = (i2 * 31) + vVar.f158912a[i4];
            }
            vVar = vVar.f158917f;
            if (vVar == null) {
                l.a();
            }
        } while (vVar != this.f158863a);
        return i2;
    }

    public final i x() {
        long j2 = this.f158864b;
        if (j2 <= 2147483647L) {
            return k((int) j2);
        }
        throw new IllegalStateException(("size > Integer.MAX_VALUE: " + this.f158864b).toString());
    }

    @Override // k.h
    public final short i() {
        if (this.f158864b >= 2) {
            v vVar = this.f158863a;
            if (vVar == null) {
                l.a();
            }
            int i2 = vVar.f158913b;
            int i3 = vVar.f158914c;
            if (i3 - i2 < 2) {
                return (short) (((h() & 255) << 8) | (h() & 255));
            }
            byte[] bArr = vVar.f158912a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            this.f158864b -= 2;
            if (i5 == i3) {
                this.f158863a = vVar.c();
                w.a(vVar);
            } else {
                vVar.f158913b = i5;
            }
            return (short) i6;
        }
        throw new EOFException();
    }

    @Override // k.h
    public final int j() {
        if (this.f158864b >= 4) {
            v vVar = this.f158863a;
            if (vVar == null) {
                l.a();
            }
            int i2 = vVar.f158913b;
            int i3 = vVar.f158914c;
            if (((long) (i3 - i2)) < 4) {
                return ((h() & 255) << 24) | ((h() & 255) << 16) | ((h() & 255) << 8) | (h() & 255);
            }
            byte[] bArr = vVar.f158912a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
            this.f158864b -= 4;
            if (i7 == i3) {
                this.f158863a = vVar.c();
                w.a(vVar);
            } else {
                vVar.f158913b = i7;
            }
            return i8;
        }
        throw new EOFException();
    }

    /* renamed from: w */
    public final f clone() {
        f fVar = new f();
        if (this.f158864b == 0) {
            return fVar;
        }
        v vVar = this.f158863a;
        if (vVar == null) {
            l.a();
        }
        v a2 = vVar.a();
        fVar.f158863a = a2;
        if (a2 == null) {
            l.a();
        }
        a2.f158918g = fVar.f158863a;
        v vVar2 = fVar.f158863a;
        if (vVar2 == null) {
            l.a();
        }
        v vVar3 = fVar.f158863a;
        if (vVar3 == null) {
            l.a();
        }
        vVar2.f158917f = vVar3.f158918g;
        v vVar4 = this.f158863a;
        if (vVar4 == null) {
            l.a();
        }
        while (true) {
            vVar4 = vVar4.f158917f;
            if (vVar4 != this.f158863a) {
                v vVar5 = fVar.f158863a;
                if (vVar5 == null) {
                    l.a();
                }
                v vVar6 = vVar5.f158918g;
                if (vVar6 == null) {
                    l.a();
                }
                if (vVar4 == null) {
                    l.a();
                }
                vVar6.a(vVar4.a());
            } else {
                fVar.f158864b = this.f158864b;
                return fVar;
            }
        }
    }

    @Override // k.h
    public final long k() {
        if (this.f158864b >= 8) {
            v vVar = this.f158863a;
            if (vVar == null) {
                l.a();
            }
            int i2 = vVar.f158913b;
            int i3 = vVar.f158914c;
            if (((long) (i3 - i2)) < 8) {
                return ((((long) j()) & 4294967295L) << 32) | (4294967295L & ((long) j()));
            }
            byte[] bArr = vVar.f158912a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            long j2 = ((((long) bArr[i2]) & 255) << 56) | ((((long) bArr[i4]) & 255) << 48) | ((((long) bArr[i5]) & 255) << 40);
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j3 = ((((long) bArr[i6]) & 255) << 32) | j2 | ((((long) bArr[i7]) & 255) << 24) | ((((long) bArr[i8]) & 255) << 16) | ((((long) bArr[i9]) & 255) << 8);
            int i11 = i10 + 1;
            long j4 = j3 | (((long) bArr[i10]) & 255);
            this.f158864b -= 8;
            if (i11 == i3) {
                this.f158863a = vVar.c();
                w.a(vVar);
            } else {
                vVar.f158913b = i11;
            }
            return j4;
        }
        throw new EOFException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r16 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r3.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r3.r());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r15 = true;
     */
    @Override // k.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long o() {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: k.f.o():long");
    }

    @Override // k.h
    public final long p() {
        int i2;
        int i3;
        if (this.f158864b != 0) {
            int i4 = 0;
            long j2 = 0;
            boolean z = false;
            do {
                v vVar = this.f158863a;
                if (vVar == null) {
                    l.a();
                }
                byte[] bArr = vVar.f158912a;
                int i5 = vVar.f158913b;
                int i6 = vVar.f158914c;
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    byte b2 = bArr[i5];
                    if (b2 < 48 || b2 > 57) {
                        if (b2 >= 97 && b2 <= 102) {
                            i2 = b2 - 97;
                        } else if (b2 >= 65 && b2 <= 70) {
                            i2 = b2 - 65;
                        } else if (i4 != 0) {
                            z = true;
                        } else {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b2));
                        }
                        i3 = i2 + 10;
                    } else {
                        i3 = b2 - 48;
                    }
                    if ((-1152921504606846976L & j2) == 0) {
                        j2 = (j2 << 4) | ((long) i3);
                        i5++;
                        i4++;
                    } else {
                        throw new NumberFormatException("Number too large: " + new f().c(j2).a((int) b2).r());
                    }
                }
                if (i5 == i6) {
                    this.f158863a = vVar.c();
                    w.a(vVar);
                } else {
                    vVar.f158913b = i5;
                }
                if (z) {
                    break;
                }
            } while (this.f158863a != null);
            this.f158864b -= (long) i4;
            return j2;
        }
        throw new EOFException();
    }

    public final int t() {
        int i2;
        int i3;
        int i4;
        if (this.f158864b != 0) {
            byte f2 = f(0L);
            if ((f2 & 128) == 0) {
                i2 = f2 & Byte.MAX_VALUE;
                i3 = 1;
                i4 = 0;
            } else if ((f2 & 224) == 192) {
                i2 = f2 & 31;
                i3 = 2;
                i4 = 128;
            } else if ((f2 & 240) == 224) {
                i2 = f2 & 15;
                i3 = 3;
                i4 = 2048;
            } else if ((f2 & 248) == 240) {
                i2 = f2 & 7;
                i3 = 4;
                i4 = 65536;
            } else {
                l(1);
                return 65533;
            }
            long j2 = (long) i3;
            if (this.f158864b >= j2) {
                for (int i5 = 1; i5 < i3; i5++) {
                    long j3 = (long) i5;
                    byte f3 = f(j3);
                    if ((f3 & 192) == 128) {
                        i2 = (i2 << 6) | (f3 & 63);
                    } else {
                        l(j3);
                        return 65533;
                    }
                }
                l(j2);
                if (i2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i2 && 57343 >= i2) || i2 < i4) {
                    return 65533;
                }
                return i2;
            }
            throw new EOFException("size < " + i3 + ": " + this.f158864b + " (to read code point prefixed 0x" + Integer.toHexString(f2) + ")");
        }
        throw new EOFException();
    }

    @Override // k.h
    public final String h(long j2) {
        return a(j2, h.m.d.f158808a);
    }

    private i k(int i2) {
        if (i2 == 0) {
            return i.EMPTY;
        }
        return new x(this, i2);
    }

    @Override // k.h
    public final String a(Charset charset) {
        l.c(charset, "");
        return a(this.f158864b, charset);
    }

    /* renamed from: b */
    public final f a(String str) {
        l.c(str, "");
        return a(str, 0, str.length());
    }

    public final long c(i iVar) {
        l.c(iVar, "");
        return e(iVar);
    }

    @Override // k.h
    public final i g(long j2) {
        return new i(k(j2));
    }

    /* renamed from: i */
    public final f d(int i2) {
        return c(c.a(i2));
    }

    @Override // k.g
    public final long a(aa aaVar) {
        l.c(aaVar, "");
        long j2 = 0;
        while (true) {
            long read = aaVar.read(this, 8192);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    /* renamed from: b */
    public final f a(i iVar) {
        l.c(iVar, "");
        iVar.write$jvm(this);
        return this;
    }

    /* renamed from: c */
    public final f a(byte[] bArr) {
        l.c(bArr, "");
        return a(bArr, 0, bArr.length);
    }

    @Override // k.h
    public final void d(long j2) {
        if (this.f158864b < j2) {
            throw new EOFException();
        }
    }

    @Override // k.h
    public final boolean e(long j2) {
        if (this.f158864b >= j2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final f a(int i2) {
        v j2 = j(1);
        byte[] bArr = j2.f158912a;
        int i3 = j2.f158914c;
        j2.f158914c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f158864b++;
        return this;
    }

    /* renamed from: n */
    public final f a(long j2) {
        return m(c.a(j2));
    }

    @Override // k.h
    public final boolean d(i iVar) {
        l.c(iVar, "");
        int size = iVar.size();
        l.c(iVar, "");
        if (size < 0 || this.f158864b - 0 < ((long) size) || iVar.size() - 0 < size) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (f(((long) i2) + 0) != iVar.getByte(i2 + 0)) {
                return false;
            }
        }
        return true;
    }

    public final String j(long j2) {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (f(j3) == 13) {
                String h2 = h(j3);
                l(2);
                return h2;
            }
        }
        String h3 = h(j2);
        l(1);
        return h3;
    }

    @Override // k.h
    public final byte[] k(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(j2)).toString());
        } else if (this.f158864b >= j2) {
            byte[] bArr = new byte[((int) j2)];
            b(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @Override // k.h
    public final void l(long j2) {
        while (j2 > 0) {
            v vVar = this.f158863a;
            if (vVar != null) {
                int min = (int) Math.min(j2, (long) (vVar.f158914c - vVar.f158913b));
                long j3 = (long) min;
                this.f158864b -= j3;
                j2 -= j3;
                vVar.f158913b += min;
                if (vVar.f158913b == vVar.f158914c) {
                    this.f158863a = vVar.c();
                    w.a(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        l.c(byteBuffer, "");
        v vVar = this.f158863a;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f158914c - vVar.f158913b);
        byteBuffer.put(vVar.f158912a, vVar.f158913b, min);
        vVar.f158913b += min;
        this.f158864b -= (long) min;
        if (vVar.f158913b == vVar.f158914c) {
            this.f158863a = vVar.c();
            w.a(vVar);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        l.c(byteBuffer, "");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            v j2 = j(1);
            int min = Math.min(i2, 8192 - j2.f158914c);
            byteBuffer.get(j2.f158912a, j2.f158914c, min);
            i2 -= min;
            j2.f158914c += min;
        }
        this.f158864b += (long) remaining;
        return remaining;
    }

    public final f e(int i2) {
        if (i2 < 128) {
            a(i2);
        } else if (i2 < 2048) {
            a((i2 >> 6) | 192);
            a((i2 & 63) | 128);
        } else if (55296 <= i2 && 57343 >= i2) {
            a(63);
        } else if (i2 < 65536) {
            a((i2 >> 12) | 224);
            a(((i2 >> 6) & 63) | 128);
            a((i2 & 63) | 128);
        } else if (i2 <= 1114111) {
            a((i2 >> 18) | 240);
            a(((i2 >> 12) & 63) | 128);
            a(((i2 >> 6) & 63) | 128);
            a((i2 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i2));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j2 = this.f158864b;
        f fVar = (f) obj;
        if (j2 != fVar.f158864b) {
            return false;
        }
        if (j2 == 0) {
            return true;
        }
        v vVar = this.f158863a;
        if (vVar == null) {
            l.a();
        }
        v vVar2 = fVar.f158863a;
        if (vVar2 == null) {
            l.a();
        }
        int i2 = vVar.f158913b;
        int i3 = vVar2.f158913b;
        long j3 = 0;
        while (j3 < this.f158864b) {
            long min = (long) Math.min(vVar.f158914c - i2, vVar2.f158914c - i3);
            long j4 = 0;
            while (j4 < min) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (vVar.f158912a[i2] != vVar2.f158912a[i3]) {
                    return false;
                }
                j4++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == vVar.f158914c) {
                vVar = vVar.f158917f;
                if (vVar == null) {
                    l.a();
                }
                i2 = vVar.f158913b;
            }
            if (i3 == vVar2.f158914c) {
                vVar2 = vVar2.f158917f;
                if (vVar2 == null) {
                    l.a();
                }
                i3 = vVar2.f158913b;
            }
            j3 += min;
        }
        return true;
    }

    public final byte f(long j2) {
        c.a(this.f158864b, j2, 1);
        v vVar = this.f158863a;
        if (vVar == null) {
            l.a();
            throw new NullPointerException("data");
        }
        long j3 = this.f158864b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                vVar = vVar.f158918g;
                if (vVar == null) {
                    l.a();
                }
                j3 -= (long) (vVar.f158914c - vVar.f158913b);
            }
            return vVar.f158912a[(int) ((((long) vVar.f158913b) + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            long j5 = ((long) (vVar.f158914c - vVar.f158913b)) + j4;
            if (j5 > j2) {
                return vVar.f158912a[(int) ((((long) vVar.f158913b) + j2) - j4)];
            }
            vVar = vVar.f158917f;
            if (vVar == null) {
                l.a();
            }
            j4 = j5;
        }
    }

    /* renamed from: g */
    public final f b(int i2) {
        v j2 = j(2);
        byte[] bArr = j2.f158912a;
        int i3 = j2.f158914c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        j2.f158914c = i4 + 1;
        this.f158864b += 2;
        return this;
    }

    /* renamed from: h */
    public final f c(int i2) {
        v j2 = j(4);
        byte[] bArr = j2.f158912a;
        int i3 = j2.f158914c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        j2.f158914c = i6 + 1;
        this.f158864b += 4;
        return this;
    }

    public final f m(long j2) {
        v j3 = j(8);
        byte[] bArr = j3.f158912a;
        int i2 = j3.f158914c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j2 >>> 56) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j2 >>> 48) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j2 >>> 40) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j2 >>> 32) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j2 >>> 24) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j2 >>> 16) & 255));
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((int) ((j2 >>> 8) & 255));
        bArr[i9] = (byte) ((int) (j2 & 255));
        j3.f158914c = i9 + 1;
        this.f158864b += 8;
        return this;
    }

    /* renamed from: p */
    public final f c(long j2) {
        if (j2 == 0) {
            return a(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        v j3 = j(numberOfTrailingZeros);
        byte[] bArr = j3.f158912a;
        int i2 = j3.f158914c;
        for (int i3 = (j3.f158914c + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = f158862d[(int) (15 & j2)];
            j2 >>>= 4;
        }
        j3.f158914c += numberOfTrailingZeros;
        this.f158864b += (long) numberOfTrailingZeros;
        return this;
    }

    @Override // k.h
    public final void b(byte[] bArr) {
        l.c(bArr, "");
        int i2 = 0;
        while (i2 < bArr.length) {
            int b2 = b(bArr, i2, bArr.length - i2);
            if (b2 != -1) {
                i2 += b2;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // k.h
    public final String i(long j2) {
        if (j2 >= 0) {
            long j3 = Long.MAX_VALUE;
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + 1;
            }
            long a2 = a((byte) 10, 0, j3);
            if (a2 != -1) {
                return j(a2);
            }
            if (j3 < this.f158864b && f(j3 - 1) == 13 && f(j3) == 10) {
                return j(j3);
            }
            f fVar = new f();
            a(fVar, 0, Math.min(32L, this.f158864b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f158864b, j2) + " content=" + fVar.q().hex() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j2)).toString());
    }

    public final v j(int i2) {
        if (i2 <= 0 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        v vVar = this.f158863a;
        if (vVar == null) {
            v a2 = w.a();
            this.f158863a = a2;
            a2.f158918g = a2;
            a2.f158917f = a2;
            return a2;
        }
        v vVar2 = vVar.f158918g;
        if (vVar2 == null) {
            l.a();
        }
        if (vVar2.f158914c + i2 > 8192 || !vVar2.f158916e) {
            return vVar2.a(w.a());
        }
        return vVar2;
    }

    private long e(i iVar) {
        int i2;
        int i3;
        l.c(iVar, "");
        v vVar = this.f158863a;
        if (vVar == null) {
            return -1;
        }
        long j2 = this.f158864b;
        long j3 = 0;
        if (j2 - 0 < 0) {
            while (j2 > 0) {
                vVar = vVar.f158918g;
                if (vVar == null) {
                    l.a();
                }
                j2 -= (long) (vVar.f158914c - vVar.f158913b);
            }
            if (iVar.size() == 2) {
                byte b2 = iVar.getByte(0);
                byte b3 = iVar.getByte(1);
                while (j2 < this.f158864b) {
                    byte[] bArr = vVar.f158912a;
                    i2 = (int) ((((long) vVar.f158913b) + j3) - j2);
                    int i4 = vVar.f158914c;
                    while (i2 < i4) {
                        byte b4 = bArr[i2];
                        if (!(b4 == b2 || b4 == b3)) {
                            i2++;
                        }
                    }
                    j3 = ((long) (vVar.f158914c - vVar.f158913b)) + j2;
                    vVar = vVar.f158917f;
                    if (vVar == null) {
                        l.a();
                    }
                    j2 = j3;
                }
            } else {
                byte[] internalArray$jvm = iVar.internalArray$jvm();
                while (j2 < this.f158864b) {
                    byte[] bArr2 = vVar.f158912a;
                    i2 = (int) ((((long) vVar.f158913b) + j3) - j2);
                    int i5 = vVar.f158914c;
                    while (i2 < i5) {
                        byte b5 = bArr2[i2];
                        for (byte b6 : internalArray$jvm) {
                            if (b5 == b6) {
                                i3 = vVar.f158913b;
                                return ((long) (i2 - i3)) + j2;
                            }
                        }
                        i2++;
                    }
                    j3 = ((long) (vVar.f158914c - vVar.f158913b)) + j2;
                    vVar = vVar.f158917f;
                    if (vVar == null) {
                        l.a();
                    }
                    j2 = j3;
                }
            }
            return -1;
        }
        j2 = 0;
        while (true) {
            long j4 = ((long) (vVar.f158914c - vVar.f158913b)) + j2;
            if (j4 > 0) {
                break;
            }
            vVar = vVar.f158917f;
            if (vVar == null) {
                l.a();
            }
            j2 = j4;
        }
        if (iVar.size() == 2) {
            byte b7 = iVar.getByte(0);
            byte b8 = iVar.getByte(1);
            while (j2 < this.f158864b) {
                byte[] bArr3 = vVar.f158912a;
                i2 = (int) ((((long) vVar.f158913b) + j3) - j2);
                int i6 = vVar.f158914c;
                while (i2 < i6) {
                    byte b9 = bArr3[i2];
                    if (!(b9 == b7 || b9 == b8)) {
                        i2++;
                    }
                }
                j3 = ((long) (vVar.f158914c - vVar.f158913b)) + j2;
                vVar = vVar.f158917f;
                if (vVar == null) {
                    l.a();
                }
                j2 = j3;
            }
        } else {
            byte[] internalArray$jvm2 = iVar.internalArray$jvm();
            while (j2 < this.f158864b) {
                byte[] bArr4 = vVar.f158912a;
                i2 = (int) ((((long) vVar.f158913b) + j3) - j2);
                int i7 = vVar.f158914c;
                while (i2 < i7) {
                    byte b10 = bArr4[i2];
                    for (byte b11 : internalArray$jvm2) {
                        if (b10 == b11) {
                            i3 = vVar.f158913b;
                            return ((long) (i2 - i3)) + j2;
                        }
                    }
                    i2++;
                }
                j3 = ((long) (vVar.f158914c - vVar.f158913b)) + j2;
                vVar = vVar.f158917f;
                if (vVar == null) {
                    l.a();
                }
                j2 = j3;
            }
        }
        return -1;
        i3 = vVar.f158913b;
        return ((long) (i2 - i3)) + j2;
    }

    /* renamed from: o */
    public final f b(long j2) {
        if (j2 == 0) {
            return a(48);
        }
        boolean z = false;
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return a("-9223372036854775808");
            }
            z = true;
        }
        if (j2 < 100000000) {
            if (j2 < 10000) {
                if (j2 < 100) {
                    if (j2 >= 10) {
                        i2 = 2;
                    }
                } else if (j2 < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j2 < 1000000) {
                if (j2 < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j2 < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j2 < 1000000000000L) {
            if (j2 < 10000000000L) {
                if (j2 < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j2 < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j2 < 1000000000000000L) {
            if (j2 < 10000000000000L) {
                i2 = 13;
            } else if (j2 < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j2 < 100000000000000000L) {
            if (j2 < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j2 < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        v j3 = j(i2);
        byte[] bArr = j3.f158912a;
        int i3 = j3.f158914c + i2;
        while (j2 != 0) {
            i3--;
            bArr[i3] = f158862d[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        j3.f158914c += i2;
        this.f158864b += (long) i2;
        return this;
    }

    @Override // k.h
    public final long a(y yVar) {
        l.c(yVar, "");
        long j2 = this.f158864b;
        if (j2 > 0) {
            yVar.write(this, j2);
        }
        return j2;
    }

    public final b a(b bVar) {
        l.c(bVar, "");
        if (bVar.f158865a == null) {
            bVar.f158865a = this;
            bVar.f158866b = true;
            return bVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    private String a(long j2, Charset charset) {
        l.c(charset, "");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(j2)).toString());
        } else if (this.f158864b < j2) {
            throw new EOFException();
        } else if (j2 == 0) {
            return "";
        } else {
            v vVar = this.f158863a;
            if (vVar == null) {
                l.a();
            }
            if (((long) vVar.f158913b) + j2 > ((long) vVar.f158914c)) {
                return new String(k(j2), charset);
            }
            int i2 = (int) j2;
            String str = new String(vVar.f158912a, vVar.f158913b, i2, charset);
            vVar.f158913b += i2;
            this.f158864b -= j2;
            if (vVar.f158913b == vVar.f158914c) {
                this.f158863a = vVar.c();
                w.a(vVar);
            }
            return str;
        }
    }

    @Override // k.aa
    public final long read(f fVar, long j2) {
        l.c(fVar, "");
        if (j2 >= 0) {
            long j3 = this.f158864b;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            fVar.write(this, j2);
            return j2;
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)).toString());
    }

    public final long a(i iVar, long j2) {
        l.c(iVar, "");
        if (iVar.size() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                v vVar = this.f158863a;
                long j4 = -1;
                if (vVar == null) {
                    return -1;
                }
                long j5 = this.f158864b;
                if (j5 - j2 < j2) {
                    while (j5 > j2) {
                        vVar = vVar.f158918g;
                        if (vVar == null) {
                            l.a();
                        }
                        j5 -= (long) (vVar.f158914c - vVar.f158913b);
                    }
                    byte b2 = iVar.getByte(0);
                    int size = iVar.size();
                    long j6 = (this.f158864b - ((long) size)) + 1;
                    while (j5 < j6) {
                        byte[] bArr = vVar.f158912a;
                        int min = (int) Math.min((long) vVar.f158914c, (((long) vVar.f158913b) + j6) - j5);
                        for (int i2 = (int) ((((long) vVar.f158913b) + j2) - j5); i2 < min; i2++) {
                            if (bArr[i2] == b2 && a(vVar, i2 + 1, iVar.internalArray$jvm(), size)) {
                                return ((long) (i2 - vVar.f158913b)) + j5;
                            }
                        }
                        j5 += (long) (vVar.f158914c - vVar.f158913b);
                        vVar = vVar.f158917f;
                        if (vVar == null) {
                            l.a();
                        }
                        j2 = j5;
                        j4 = -1;
                    }
                    return j4;
                }
                while (true) {
                    long j7 = ((long) (vVar.f158914c - vVar.f158913b)) + j3;
                    if (j7 > j2) {
                        break;
                    }
                    vVar = vVar.f158917f;
                    if (vVar == null) {
                        l.a();
                    }
                    j3 = j7;
                }
                byte b3 = iVar.getByte(0);
                int size2 = iVar.size();
                long j8 = (this.f158864b - ((long) size2)) + 1;
                while (j3 < j8) {
                    byte[] bArr2 = vVar.f158912a;
                    int min2 = (int) Math.min((long) vVar.f158914c, (((long) vVar.f158913b) + j8) - j3);
                    for (int i3 = (int) ((((long) vVar.f158913b) + j2) - j3); i3 < min2; i3++) {
                        if (bArr2[i3] == b3 && a(vVar, i3 + 1, iVar.internalArray$jvm(), size2)) {
                            return ((long) (i3 - vVar.f158913b)) + j3;
                        }
                    }
                    j3 += (long) (vVar.f158914c - vVar.f158913b);
                    vVar = vVar.f158917f;
                    if (vVar == null) {
                        l.a();
                    }
                    j2 = j3;
                }
                return -1;
            }
            throw new IllegalArgumentException("fromIndex < 0: ".concat(String.valueOf(j2)).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // k.y
    public final void write(f fVar, long j2) {
        int i2;
        v a2;
        v vVar;
        int i3;
        long j3 = j2;
        l.c(fVar, "");
        if (fVar != this) {
            c.a(fVar.f158864b, 0, j3);
            while (j3 > 0) {
                v vVar2 = fVar.f158863a;
                if (vVar2 == null) {
                    l.a();
                }
                int i4 = vVar2.f158914c;
                v vVar3 = fVar.f158863a;
                if (vVar3 == null) {
                    l.a();
                }
                if (j3 < ((long) (i4 - vVar3.f158913b))) {
                    v vVar4 = this.f158863a;
                    if (!(vVar4 == null || (vVar = vVar4.f158918g) == null || !vVar.f158916e)) {
                        long j4 = ((long) vVar.f158914c) + j3;
                        if (vVar.f158915d) {
                            i3 = 0;
                        } else {
                            i3 = vVar.f158913b;
                        }
                        if (j4 - ((long) i3) <= 8192) {
                            v vVar5 = fVar.f158863a;
                            if (vVar5 == null) {
                                l.a();
                            }
                            vVar5.a(vVar, (int) j3);
                            fVar.f158864b -= j3;
                            this.f158864b += j3;
                            return;
                        }
                    }
                    v vVar6 = fVar.f158863a;
                    if (vVar6 == null) {
                        l.a();
                    }
                    int i5 = (int) j3;
                    if (i5 <= 0 || i5 > vVar6.f158914c - vVar6.f158913b) {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                    if (i5 >= 1024) {
                        a2 = vVar6.a();
                    } else {
                        a2 = w.a();
                        b.a(vVar6.f158912a, vVar6.f158913b, a2.f158912a, 0, i5);
                    }
                    a2.f158914c = a2.f158913b + i5;
                    vVar6.f158913b += i5;
                    v vVar7 = vVar6.f158918g;
                    if (vVar7 == null) {
                        l.a();
                    }
                    vVar7.a(a2);
                    fVar.f158863a = a2;
                }
                v vVar8 = fVar.f158863a;
                if (vVar8 == null) {
                    l.a();
                }
                long j5 = (long) (vVar8.f158914c - vVar8.f158913b);
                fVar.f158863a = vVar8.c();
                v vVar9 = this.f158863a;
                if (vVar9 == null) {
                    this.f158863a = vVar8;
                    vVar8.f158918g = vVar8;
                    vVar8.f158917f = vVar8.f158918g;
                } else {
                    v vVar10 = vVar9.f158918g;
                    if (vVar10 == null) {
                        l.a();
                    }
                    v a3 = vVar10.a(vVar8);
                    if (a3.f158918g != a3) {
                        v vVar11 = a3.f158918g;
                        if (vVar11 == null) {
                            l.a();
                        }
                        if (vVar11.f158916e) {
                            int i6 = a3.f158914c - a3.f158913b;
                            v vVar12 = a3.f158918g;
                            if (vVar12 == null) {
                                l.a();
                            }
                            int i7 = 8192 - vVar12.f158914c;
                            v vVar13 = a3.f158918g;
                            if (vVar13 == null) {
                                l.a();
                            }
                            if (vVar13.f158915d) {
                                i2 = 0;
                            } else {
                                v vVar14 = a3.f158918g;
                                if (vVar14 == null) {
                                    l.a();
                                }
                                i2 = vVar14.f158913b;
                            }
                            if (i6 <= i7 + i2) {
                                v vVar15 = a3.f158918g;
                                if (vVar15 == null) {
                                    l.a();
                                }
                                a3.a(vVar15, i6);
                                a3.c();
                                w.a(a3);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                fVar.f158864b -= j5;
                this.f158864b += j5;
                j3 -= j5;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final int b(byte[] bArr, int i2, int i3) {
        l.c(bArr, "");
        c.a((long) bArr.length, (long) i2, (long) i3);
        v vVar = this.f158863a;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i3, vVar.f158914c - vVar.f158913b);
        System.arraycopy(vVar.f158912a, vVar.f158913b, bArr, i2, min);
        vVar.f158913b += min;
        this.f158864b -= (long) min;
        if (vVar.f158913b == vVar.f158914c) {
            this.f158863a = vVar.c();
            w.a(vVar);
        }
        return min;
    }

    /* renamed from: c */
    public final f a(byte[] bArr, int i2, int i3) {
        l.c(bArr, "");
        long j2 = (long) i3;
        c.a((long) bArr.length, (long) i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            v j3 = j(1);
            int min = Math.min(i4 - i2, 8192 - j3.f158914c);
            System.arraycopy(bArr, i2, j3.f158912a, j3.f158914c, min);
            i2 += min;
            j3.f158914c += min;
        }
        this.f158864b += j2;
        return this;
    }

    public final long a(byte b2, long j2, long j3) {
        v vVar;
        long j4 = 0;
        if (0 <= j2 && j3 >= j2) {
            long j5 = this.f158864b;
            if (j3 > j5) {
                j3 = j5;
            }
            if (j2 == j3 || (vVar = this.f158863a) == null) {
                return -1;
            }
            if (j5 - j2 < j2) {
                while (j5 > j2) {
                    vVar = vVar.f158918g;
                    if (vVar == null) {
                        l.a();
                    }
                    j5 -= (long) (vVar.f158914c - vVar.f158913b);
                }
                while (j5 < j3) {
                    byte[] bArr = vVar.f158912a;
                    int min = (int) Math.min((long) vVar.f158914c, (((long) vVar.f158913b) + j3) - j5);
                    for (int i2 = (int) ((((long) vVar.f158913b) + j2) - j5); i2 < min; i2++) {
                        if (bArr[i2] == b2) {
                            return ((long) (i2 - vVar.f158913b)) + j5;
                        }
                    }
                    j5 += (long) (vVar.f158914c - vVar.f158913b);
                    vVar = vVar.f158917f;
                    if (vVar == null) {
                        l.a();
                    }
                    j2 = j5;
                }
                return -1;
            }
            while (true) {
                long j6 = ((long) (vVar.f158914c - vVar.f158913b)) + j4;
                if (j6 > j2) {
                    break;
                }
                vVar = vVar.f158917f;
                if (vVar == null) {
                    l.a();
                }
                j4 = j6;
            }
            while (j4 < j3) {
                byte[] bArr2 = vVar.f158912a;
                int min2 = (int) Math.min((long) vVar.f158914c, (((long) vVar.f158913b) + j3) - j4);
                for (int i3 = (int) ((((long) vVar.f158913b) + j2) - j4); i3 < min2; i3++) {
                    if (bArr2[i3] == b2) {
                        return ((long) (i3 - vVar.f158913b)) + j4;
                    }
                }
                j4 += (long) (vVar.f158914c - vVar.f158913b);
                vVar = vVar.f158917f;
                if (vVar == null) {
                    l.a();
                }
                j2 = j4;
            }
            return -1;
        }
        throw new IllegalArgumentException(("size=" + this.f158864b + " fromIndex=" + j2 + " toIndex=" + j3).toString());
    }

    private static boolean a(v vVar, int i2, byte[] bArr, int i3) {
        int i4 = vVar.f158914c;
        byte[] bArr2 = vVar.f158912a;
        for (int i5 = 1; i5 < i3; i5++) {
            if (i2 == i4) {
                vVar = vVar.f158917f;
                if (vVar == null) {
                    l.a();
                }
                bArr2 = vVar.f158912a;
                i2 = vVar.f158913b;
                i4 = vVar.f158914c;
            }
            if (bArr2[i2] != bArr[i5]) {
                return false;
            }
            i2++;
        }
        return true;
    }
}
