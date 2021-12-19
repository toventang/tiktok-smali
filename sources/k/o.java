package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class o implements aa {

    /* renamed from: a  reason: collision with root package name */
    private int f158885a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f158886b;

    /* renamed from: c  reason: collision with root package name */
    private final h f158887c;

    /* renamed from: d  reason: collision with root package name */
    private final Inflater f158888d;

    static {
        Covode.recordClassIndex(105438);
    }

    @Override // k.aa
    public final ab timeout() {
        return this.f158887c.timeout();
    }

    private final void b() {
        int i2 = this.f158885a;
        if (i2 != 0) {
            int remaining = i2 - this.f158888d.getRemaining();
            this.f158885a -= remaining;
            this.f158887c.l((long) remaining);
        }
    }

    @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f158886b) {
            this.f158888d.end();
            this.f158886b = true;
            this.f158887c.close();
        }
    }

    public final boolean a() {
        if (!this.f158888d.needsInput()) {
            return false;
        }
        b();
        if (this.f158888d.getRemaining() != 0) {
            throw new IllegalStateException("?".toString());
        } else if (this.f158887c.e()) {
            return true;
        } else {
            v vVar = this.f158887c.a().f158863a;
            if (vVar == null) {
                l.a();
            }
            this.f158885a = vVar.f158914c - vVar.f158913b;
            this.f158888d.setInput(vVar.f158912a, vVar.f158913b, this.f158885a);
            return false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(aa aaVar, Inflater inflater) {
        this(q.a(aaVar), inflater);
        l.c(aaVar, "");
        l.c(inflater, "");
    }

    public o(h hVar, Inflater inflater) {
        l.c(hVar, "");
        l.c(inflater, "");
        this.f158887c = hVar;
        this.f158888d = inflater;
    }

    @Override // k.aa
    public final long read(f fVar, long j2) {
        v j3;
        l.c(fVar, "");
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)).toString());
        } else if (!(!this.f158886b)) {
            throw new IllegalStateException("closed".toString());
        } else if (j2 == 0) {
            return 0;
        } else {
            while (true) {
                boolean a2 = a();
                try {
                    j3 = fVar.j(1);
                    int inflate = this.f158888d.inflate(j3.f158912a, j3.f158914c, (int) Math.min(j2, (long) (8192 - j3.f158914c)));
                    if (inflate > 0) {
                        j3.f158914c += inflate;
                        long j4 = (long) inflate;
                        fVar.f158864b += j4;
                        return j4;
                    } else if (this.f158888d.finished() || this.f158888d.needsDictionary()) {
                        b();
                    } else if (a2) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            b();
            if (j3.f158913b != j3.f158914c) {
                return -1;
            }
            fVar.f158863a = j3.c();
            w.a(j3);
            return -1;
        }
    }
}
