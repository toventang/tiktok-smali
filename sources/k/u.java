package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class u implements h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f158907a;

    /* renamed from: b  reason: collision with root package name */
    public final f f158908b = new f();

    /* renamed from: c  reason: collision with root package name */
    public final aa f158909c;

    static {
        Covode.recordClassIndex(105447);
    }

    @Override // k.h
    public final f a() {
        return this.f158908b;
    }

    public static final class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f158910a;

        static {
            Covode.recordClassIndex(105448);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public final void close() {
            this.f158910a.close();
        }

        @Override // java.io.InputStream
        public final int available() {
            if (!this.f158910a.f158907a) {
                return (int) Math.min(this.f158910a.f158908b.f158864b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return this.f158910a + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f158910a.f158907a) {
                throw new IOException("closed");
            } else if (this.f158910a.f158908b.f158864b == 0 && this.f158910a.f158909c.read(this.f158910a.f158908b, 8192) == -1) {
                return -1;
            } else {
                return this.f158910a.f158908b.h() & 255;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(u uVar) {
            this.f158910a = uVar;
            MethodCollector.i(4183);
            MethodCollector.o(4183);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) {
            l.c(bArr, "");
            if (!this.f158910a.f158907a) {
                c.a((long) bArr.length, (long) i2, (long) i3);
                if (this.f158910a.f158908b.f158864b == 0 && this.f158910a.f158909c.read(this.f158910a.f158908b, 8192) == -1) {
                    return -1;
                }
                return this.f158910a.f158908b.b(bArr, i2, i3);
            }
            throw new IOException("closed");
        }
    }

    @Override // k.h
    public final InputStream f() {
        return new a(this);
    }

    public final boolean isOpen() {
        if (!this.f158907a) {
            return true;
        }
        return false;
    }

    @Override // k.aa
    public final ab timeout() {
        return this.f158909c.timeout();
    }

    public final long b() {
        return a((byte) 0, Long.MAX_VALUE);
    }

    @Override // k.h
    public final byte h() {
        d(1);
        return this.f158908b.h();
    }

    @Override // k.h
    public final short i() {
        d(2);
        return this.f158908b.i();
    }

    @Override // k.h
    public final int j() {
        d(4);
        return this.f158908b.j();
    }

    @Override // k.h
    public final long k() {
        d(8);
        return this.f158908b.k();
    }

    @Override // k.h
    public final int m() {
        d(4);
        return c.a(this.f158908b.j());
    }

    @Override // k.h
    public final long n() {
        d(8);
        return c.a(this.f158908b.k());
    }

    @Override // k.h
    public final String r() {
        this.f158908b.a(this.f158909c);
        return this.f158908b.r();
    }

    @Override // k.h
    public final String s() {
        return i(Long.MAX_VALUE);
    }

    @Override // k.h
    public final byte[] u() {
        this.f158908b.a(this.f158909c);
        return this.f158908b.u();
    }

    @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f158907a) {
            this.f158907a = true;
            this.f158909c.close();
            this.f158908b.v();
        }
    }

    public final String toString() {
        return "buffer(" + this.f158909c + ')';
    }

    @Override // k.h
    public final boolean e() {
        if (!(!this.f158907a)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f158908b.e() || this.f158909c.read(this.f158908b, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r3 == 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r1 = com.a.a("Expected leading [0-9] or '-' character but was %#x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(r7)}, 1));
        h.f.b.l.a((java.lang.Object) r1, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        throw new java.lang.NumberFormatException(r1);
     */
    @Override // k.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long o() {
        /*
            r10 = this;
            r5 = 1
            r10.d(r5)
            r8 = 0
            r3 = 0
        L_0x0009:
            long r1 = r3 + r5
            boolean r0 = r10.e(r1)
            if (r0 == 0) goto L_0x002b
            k.f r0 = r10.f158908b
            byte r7 = r0.f(r3)
            r0 = 48
            if (r7 < r0) goto L_0x001f
            r0 = 57
            if (r7 <= r0) goto L_0x0032
        L_0x001f:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            r0 = 45
            if (r7 == r0) goto L_0x0032
        L_0x0027:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0034
        L_0x002b:
            k.f r0 = r10.f158908b
            long r0 = r0.o()
            return r0
        L_0x0032:
            r3 = r1
            goto L_0x0009
        L_0x0034:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r7)
            r2[r1] = r0
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r1 = com.a.a(r0, r1)
            java.lang.String r0 = ""
            h.f.b.l.a(r1, r0)
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.u.o():long");
    }

    @Override // k.h
    public final long p() {
        d(1);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!e((long) i3)) {
                break;
            }
            byte f2 = this.f158908b.f((long) i2);
            if ((f2 >= 48 && f2 <= 57) || ((f2 >= 97 && f2 <= 102) || (f2 >= 65 && f2 <= 70))) {
                i2 = i3;
            } else if (i2 == 0) {
                String a2 = com.a.a("Expected leading [0-9a-fA-F] character but was %#x", Arrays.copyOf(new Object[]{Byte.valueOf(f2)}, 1));
                l.a((Object) a2, "");
                throw new NumberFormatException(a2);
            }
        }
        return this.f158908b.p();
    }

    @Override // k.h
    public final void d(long j2) {
        if (!e(j2)) {
            throw new EOFException();
        }
    }

    @Override // k.h
    public final i g(long j2) {
        d(j2);
        return this.f158908b.g(j2);
    }

    public u(aa aaVar) {
        l.c(aaVar, "");
        this.f158909c = aaVar;
    }

    @Override // k.h
    public final String a(Charset charset) {
        l.c(charset, "");
        this.f158908b.a(this.f158909c);
        return this.f158908b.a(charset);
    }

    @Override // k.h
    public final String h(long j2) {
        d(j2);
        return this.f158908b.h(j2);
    }

    @Override // k.h
    public final byte[] k(long j2) {
        d(j2);
        return this.f158908b.k(j2);
    }

    @Override // k.h
    public final long a(y yVar) {
        l.c(yVar, "");
        long j2 = 0;
        while (this.f158909c.read(this.f158908b, 8192) != -1) {
            long g2 = this.f158908b.g();
            if (g2 > 0) {
                j2 += g2;
                yVar.write(this.f158908b, g2);
            }
        }
        if (this.f158908b.f158864b <= 0) {
            return j2;
        }
        long j3 = j2 + this.f158908b.f158864b;
        f fVar = this.f158908b;
        yVar.write(fVar, fVar.f158864b);
        return j3;
    }

    @Override // k.h
    public final void b(byte[] bArr) {
        l.c(bArr, "");
        try {
            d((long) bArr.length);
            this.f158908b.b(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (this.f158908b.f158864b > 0) {
                f fVar = this.f158908b;
                int b2 = fVar.b(bArr, i2, (int) fVar.f158864b);
                if (b2 != -1) {
                    i2 += b2;
                } else {
                    throw new AssertionError();
                }
            }
            throw e2;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        l.c(byteBuffer, "");
        if (this.f158908b.f158864b == 0 && this.f158909c.read(this.f158908b, 8192) == -1) {
            return -1;
        }
        return this.f158908b.read(byteBuffer);
    }

    @Override // k.h
    public final boolean d(i iVar) {
        l.c(iVar, "");
        int size = iVar.size();
        l.c(iVar, "");
        if (!(!this.f158907a)) {
            throw new IllegalStateException("closed".toString());
        } else if (size < 0 || iVar.size() - 0 < size) {
            return false;
        } else {
            for (int i2 = 0; i2 < size; i2++) {
                long j2 = ((long) i2) + 0;
                if (!(e(1 + j2) && this.f158908b.f(j2) == iVar.getByte(i2 + 0))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // k.h
    public final boolean e(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)).toString());
        } else if (!this.f158907a) {
            while (this.f158908b.f158864b < j2) {
                if (this.f158909c.read(this.f158908b, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // k.h
    public final void l(long j2) {
        if (!this.f158907a) {
            while (j2 > 0) {
                if (this.f158908b.f158864b == 0 && this.f158909c.read(this.f158908b, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, this.f158908b.f158864b);
                this.f158908b.l(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.h
    public final String i(long j2) {
        long j3;
        if (j2 >= 0) {
            if (j2 == Long.MAX_VALUE) {
                j3 = Long.MAX_VALUE;
            } else {
                j3 = j2 + 1;
            }
            long a2 = a((byte) 10, j3);
            if (a2 != -1) {
                return this.f158908b.j(a2);
            }
            if (j3 < Long.MAX_VALUE && e(j3) && this.f158908b.f(j3 - 1) == 13 && e(1 + j3) && this.f158908b.f(j3) == 10) {
                return this.f158908b.j(j3);
            }
            f fVar = new f();
            f fVar2 = this.f158908b;
            fVar2.a(fVar, 0, Math.min(32L, fVar2.f158864b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f158908b.f158864b, j2) + " content=" + fVar.q().hex() + "…");
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j2)).toString());
    }

    private long a(byte b2, long j2) {
        if (!this.f158907a) {
            long j3 = 0;
            if (j2 >= 0) {
                while (j3 < j2) {
                    long a2 = this.f158908b.a(b2, j3, j2);
                    if (a2 == -1) {
                        long j4 = this.f158908b.f158864b;
                        if (j4 >= j2 || this.f158909c.read(this.f158908b, 8192) == -1) {
                            break;
                        }
                        j3 = Math.max(j3, j4);
                    } else {
                        return a2;
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.aa
    public final long read(f fVar, long j2) {
        l.c(fVar, "");
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)).toString());
        } else if (!(true ^ this.f158907a)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f158908b.f158864b == 0 && this.f158909c.read(this.f158908b, 8192) == -1) {
            return -1;
        } else {
            return this.f158908b.read(fVar, Math.min(j2, this.f158908b.f158864b));
        }
    }

    @Override // k.h
    public final void a(f fVar, long j2) {
        l.c(fVar, "");
        try {
            d(j2);
            this.f158908b.a(fVar, j2);
        } catch (EOFException e2) {
            fVar.a((aa) this.f158908b);
            throw e2;
        }
    }
}
