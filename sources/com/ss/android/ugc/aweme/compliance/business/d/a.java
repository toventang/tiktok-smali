package com.ss.android.ugc.aweme.compliance.business.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import k.aa;
import k.ab;
import k.f;
import k.g;
import k.i;
import k.y;

public final class a implements g {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f76910e = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    public final f f76911a = new f();

    /* renamed from: b  reason: collision with root package name */
    public final b f76912b;

    /* renamed from: c  reason: collision with root package name */
    public final y f76913c;

    /* renamed from: d  reason: collision with root package name */
    boolean f76914d;

    @Override // k.g
    public final f a() {
        return this.f76911a;
    }

    @Override // k.g
    public final OutputStream d() {
        return new OutputStream() {
            /* class com.ss.android.ugc.aweme.compliance.business.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47541);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            public final String toString() {
                return this + ".outputStream()";
            }

            {
                MethodCollector.i(6145);
                MethodCollector.o(6145);
            }

            @Override // java.io.OutputStream
            public final void write(int i2) {
                if (!a.this.f76914d) {
                    a.this.f76911a.a((int) ((byte) i2));
                    return;
                }
                throw new IOException("closed");
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i2, int i3) {
                if (!a.this.f76914d) {
                    a.this.f76911a.a(bArr, i2, i3);
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    public final boolean isOpen() {
        if (!this.f76914d) {
            return true;
        }
        return false;
    }

    @Override // k.y
    public final ab timeout() {
        return this.f76913c.timeout();
    }

    static {
        Covode.recordClassIndex(47540);
    }

    @Override // k.g
    public final g b() {
        if (!this.f76914d) {
            long g2 = this.f76911a.g();
            if (g2 > 0) {
                this.f76913c.write(this.f76911a, g2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // k.g
    public final g c() {
        if (!this.f76914d) {
            long j2 = this.f76911a.f158864b;
            if (j2 > 0) {
                this.f76913c.write(this.f76911a, j2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return "buffer(" + this.f76913c + ")";
    }

    @Override // java.io.Closeable, k.y, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f76914d) {
            Throwable th = null;
            try {
                if (this.f76911a.f158864b > 0) {
                    y yVar = this.f76913c;
                    f fVar = this.f76911a;
                    yVar.write(fVar, fVar.f158864b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f76913c.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f76914d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // k.g, k.y, java.io.Flushable
    public final void flush() {
        if (!this.f76914d) {
            if (this.f76911a.f158864b > 0) {
                y yVar = this.f76913c;
                f fVar = this.f76911a;
                yVar.write(fVar, fVar.f158864b);
            }
            this.f76913c.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // k.g
    public final g a(i iVar) {
        write(iVar.asByteBuffer());
        return this;
    }

    @Override // k.g
    public final long a(aa aaVar) {
        if (aaVar != null) {
            return 0;
        }
        throw new IllegalArgumentException("source == null");
    }

    private boolean e(int i2) {
        if (this.f76912b.b(1) <= 0) {
            return false;
        }
        this.f76911a.a(i2);
        return true;
    }

    @Override // k.g
    public final g a(int i2) {
        if (!this.f76914d) {
            e(i2);
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // k.g
    public final g d(int i2) {
        return c(((i2 & 255) << 24) | ((-16777216 & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8));
    }

    @Override // k.g
    public final g a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    @Override // k.g
    public final g b(int i2) {
        if (!this.f76914d) {
            long b2 = this.f76912b.b(2);
            if (b2 > 0) {
                int i3 = 0;
                while (true) {
                    long j2 = (long) i3;
                    if (j2 >= b2) {
                        break;
                    }
                    this.f76911a.a((int) ((byte) ((i2 >> ((int) ((b2 - j2) * 8))) & 255)));
                    i3++;
                }
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // k.g
    public final g c(int i2) {
        if (!this.f76914d) {
            long b2 = this.f76912b.b(4);
            if (b2 > 0) {
                int i3 = 0;
                while (true) {
                    long j2 = (long) i3;
                    if (j2 >= b2) {
                        break;
                    }
                    this.f76911a.a((int) ((byte) ((i2 >> ((int) ((b2 - j2) * 8))) & 255)));
                    i3++;
                }
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.f76914d) {
            int b2 = (int) this.f76912b.b((long) byteBuffer.remaining());
            if (b2 > 0) {
                int i2 = b2;
                do {
                    int min = Math.min(i2, 4096);
                    byte[] bArr = new byte[min];
                    byteBuffer.get(bArr, 0, min);
                    i2 -= min;
                    this.f76911a.a(bArr);
                } while (i2 > 0);
                b();
            }
            return b2;
        }
        throw new IllegalStateException("closed");
    }

    @Override // k.g
    public final g a(long j2) {
        long j3 = ((j2 & 255) << 56) | ((-72057594037927936L & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
        if (!this.f76914d) {
            long b2 = this.f76912b.b(8);
            if (b2 > 0) {
                int i2 = 0;
                while (true) {
                    long j4 = (long) i2;
                    if (j4 >= b2) {
                        break;
                    }
                    this.f76911a.a((int) ((byte) ((int) ((j3 >> ((int) ((b2 - j4) * 8))) & 255))));
                    i2++;
                }
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // k.g
    public final g c(long j2) {
        if (this.f76914d) {
            throw new IllegalStateException("closed");
        } else if (j2 == 0 && e(48)) {
            return b();
        } else {
            long b2 = this.f76912b.b((long) ((Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1));
            if (b2 > 0) {
                for (int i2 = (int) (b2 - 1); i2 >= 0; i2--) {
                    this.f76911a.a((int) f76910e[(int) (15 & j2)]);
                    j2 >>>= 4;
                }
            }
            return this;
        }
    }

    @Override // k.g
    public final g a(String str) {
        char c2;
        char charAt;
        int length = str.length();
        if (this.f76914d) {
            throw new IllegalStateException("closed");
        } else if (length < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + length + " < 0");
        } else if (length <= str.length()) {
            int i2 = 0;
            while (i2 < length) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < 128) {
                    int min = Math.min(length, 4096);
                    byte[] bArr = new byte[min];
                    int i3 = -i2;
                    int i4 = i2 + 1;
                    bArr[i2 + i3] = (byte) charAt2;
                    while (true) {
                        i2 = i4;
                        if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                            long b2 = this.f76912b.b((long) (i3 + i2));
                        } else {
                            i4 = i2 + 1;
                            bArr[i2 + i3] = (byte) charAt;
                        }
                    }
                    long b22 = this.f76912b.b((long) (i3 + i2));
                    if (b22 > 0) {
                        this.f76911a.a(bArr, 0, (int) b22);
                    }
                } else {
                    if (charAt2 < 2048) {
                        e((charAt2 >> 6) | 192);
                        e((charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        e((charAt2 >> '\f') | 224);
                        e(((charAt2 >> 6) & 63) | 128);
                        e((charAt2 & '?') | 128);
                    } else {
                        int i5 = i2 + 1;
                        if (i5 < length) {
                            c2 = str.charAt(i5);
                        } else {
                            c2 = 0;
                        }
                        if (charAt2 > 56319 || c2 < 56320 || c2 > 57343) {
                            e(63);
                            i2 = i5;
                        } else {
                            int i6 = (((charAt2 & 10239) << 10) | (9215 & c2)) + 65536;
                            e((i6 >> 18) | 240);
                            e(((i6 >> 12) & 63) | 128);
                            e(((i6 >> 6) & 63) | 128);
                            e((i6 & 63) | 128);
                            i2 += 2;
                        }
                    }
                    i2++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
    }

    @Override // k.g
    public final g b(long j2) {
        int i2;
        if (this.f76914d) {
            throw new IllegalStateException("closed");
        } else if (j2 == 0 && e(48)) {
            return b();
        } else {
            int i3 = 0;
            if (j2 < 0) {
                j2 = -j2;
                if (j2 < 0) {
                    return a("-9223372036854775808");
                }
                i3 = 1;
            }
            if (j2 < 100000000) {
                if (j2 < 10000) {
                    if (j2 < 100) {
                        if (j2 < 10) {
                            i2 = 1;
                        } else {
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
            if (i3 != 0) {
                i2++;
            }
            long b2 = this.f76912b.b((long) i2);
            if (b2 > 0) {
                int i4 = (int) b2;
                byte[] bArr = new byte[i4];
                int i5 = i4 - 1;
                while (j2 != 0 && i5 > i3) {
                    i5--;
                    bArr[i5] = f76910e[(int) (j2 % 10)];
                    j2 /= 10;
                }
                if (i3 != 0) {
                    bArr[i5 - 1] = 45;
                }
                this.f76911a.a(bArr);
            }
            return this;
        }
    }

    public a(y yVar, b bVar) {
        Objects.requireNonNull(yVar, "sink == null");
        this.f76913c = yVar;
        this.f76912b = bVar;
    }

    @Override // k.y
    public final void write(f fVar, long j2) {
        if (!this.f76914d) {
            long b2 = this.f76912b.b((long) ((int) j2));
            if (b2 > 0) {
                this.f76911a.write(fVar, b2);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // k.g
    public final g a(byte[] bArr, int i2, int i3) {
        if (!this.f76914d) {
            long b2 = this.f76912b.b((long) i3);
            if (b2 > 0) {
                this.f76911a.a(bArr, i2, (int) b2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
