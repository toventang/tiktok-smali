package k;

import com.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class n implements aa {

    /* renamed from: a  reason: collision with root package name */
    private byte f158880a;

    /* renamed from: b  reason: collision with root package name */
    private final u f158881b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f158882c;

    /* renamed from: d  reason: collision with root package name */
    private final o f158883d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f158884e = new CRC32();

    static {
        Covode.recordClassIndex(105437);
    }

    @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f158883d.close();
    }

    @Override // k.aa
    public final ab timeout() {
        return this.f158881b.timeout();
    }

    public n(aa aaVar) {
        l.c(aaVar, "");
        u uVar = new u(aaVar);
        this.f158881b = uVar;
        Inflater inflater = new Inflater(true);
        this.f158882c = inflater;
        this.f158883d = new o((h) uVar, inflater);
    }

    @Override // k.aa
    public final long read(f fVar, long j2) {
        boolean z;
        boolean z2;
        l.c(fVar, "");
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)).toString());
        } else if (j2 == 0) {
            return 0;
        } else {
            if (this.f158880a == 0) {
                this.f158881b.d(10);
                byte f2 = this.f158881b.f158908b.f(3L);
                if (((f2 >> 1) & 1) == 1) {
                    z = true;
                    a(this.f158881b.f158908b, 0, 10);
                } else {
                    z = false;
                }
                a("ID1ID2", 8075, this.f158881b.i());
                this.f158881b.l(8);
                if (((f2 >> 2) & 1) == 1 && 1 != 0) {
                    this.f158881b.d(2);
                    if (z) {
                        a(this.f158881b.f158908b, 0, 2);
                    }
                    long l2 = (long) this.f158881b.f158908b.l();
                    this.f158881b.d(l2);
                    if (z) {
                        a(this.f158881b.f158908b, 0, l2);
                    }
                    this.f158881b.l(l2);
                }
                if (((f2 >> 3) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    long b2 = this.f158881b.b();
                    if (b2 != -1) {
                        if (z) {
                            a(this.f158881b.f158908b, 0, b2 + 1);
                        }
                        this.f158881b.l(b2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((f2 >> 4) & 1) == 1) {
                    long b3 = this.f158881b.b();
                    if (b3 != -1) {
                        if (z) {
                            a(this.f158881b.f158908b, 0, b3 + 1);
                        }
                        this.f158881b.l(b3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    u uVar = this.f158881b;
                    uVar.d(2);
                    a("FHCRC", uVar.f158908b.l(), (short) ((int) this.f158884e.getValue()));
                    this.f158884e.reset();
                }
                this.f158880a = 1;
            }
            if (this.f158880a == 1) {
                long j3 = fVar.f158864b;
                long read = this.f158883d.read(fVar, j2);
                if (read != -1) {
                    a(fVar, j3, read);
                    return read;
                }
                this.f158880a = 2;
            }
            if (this.f158880a == 2) {
                a("CRC", this.f158881b.m(), (int) this.f158884e.getValue());
                a("ISIZE", this.f158881b.m(), (int) this.f158882c.getBytesWritten());
                this.f158880a = 3;
                if (!this.f158881b.e()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    private static void a(String str, int i2, int i3) {
        if (i3 != i2) {
            String a2 = a.a("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
            l.a((Object) a2, "");
            throw new IOException(a2);
        }
    }

    private final void a(f fVar, long j2, long j3) {
        v vVar = fVar.f158863a;
        if (vVar == null) {
            l.a();
        }
        while (j2 >= ((long) (vVar.f158914c - vVar.f158913b))) {
            j2 -= (long) (vVar.f158914c - vVar.f158913b);
            vVar = vVar.f158917f;
            if (vVar == null) {
                l.a();
            }
        }
        while (j3 > 0) {
            int i2 = (int) (((long) vVar.f158913b) + j2);
            int min = (int) Math.min((long) (vVar.f158914c - i2), j3);
            this.f158884e.update(vVar.f158912a, i2, min);
            j3 -= (long) min;
            vVar = vVar.f158917f;
            if (vVar == null) {
                l.a();
            }
            j2 = 0;
        }
    }
}
