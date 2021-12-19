package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.zip.Deflater;

public final class j implements y {

    /* renamed from: a  reason: collision with root package name */
    private boolean f158876a;

    /* renamed from: b  reason: collision with root package name */
    private final g f158877b;

    /* renamed from: c  reason: collision with root package name */
    private final Deflater f158878c;

    static {
        Covode.recordClassIndex(105433);
    }

    @Override // k.y
    public final ab timeout() {
        return this.f158877b.timeout();
    }

    private void a() {
        this.f158878c.finish();
        a(false);
    }

    @Override // k.y, java.io.Flushable
    public final void flush() {
        a(true);
        this.f158877b.flush();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f158877b + ')';
    }

    @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f158876a) {
            Throwable th = null;
            try {
                a();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f158878c.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f158877b.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f158876a = true;
            if (th != null) {
                throw th;
            }
        }
    }

    private final void a(boolean z) {
        v j2;
        int deflate;
        f a2 = this.f158877b.a();
        while (true) {
            j2 = a2.j(1);
            if (z) {
                deflate = this.f158878c.deflate(j2.f158912a, j2.f158914c, 8192 - j2.f158914c, 2);
            } else {
                deflate = this.f158878c.deflate(j2.f158912a, j2.f158914c, 8192 - j2.f158914c);
            }
            if (deflate > 0) {
                j2.f158914c += deflate;
                a2.f158864b += (long) deflate;
                this.f158877b.b();
            } else if (this.f158878c.needsInput()) {
                break;
            }
        }
        if (j2.f158913b == j2.f158914c) {
            a2.f158863a = j2.c();
            w.a(j2);
        }
    }

    private j(g gVar, Deflater deflater) {
        l.c(gVar, "");
        l.c(deflater, "");
        this.f158877b = gVar;
        this.f158878c = deflater;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public j(y yVar, Deflater deflater) {
        this(q.a(yVar), deflater);
        l.c(yVar, "");
        l.c(deflater, "");
    }

    @Override // k.y
    public final void write(f fVar, long j2) {
        long j3 = j2;
        l.c(fVar, "");
        c.a(fVar.f158864b, 0, j3);
        while (j3 > 0) {
            v vVar = fVar.f158863a;
            if (vVar == null) {
                l.a();
            }
            int min = (int) Math.min(j3, (long) (vVar.f158914c - vVar.f158913b));
            this.f158878c.setInput(vVar.f158912a, vVar.f158913b, min);
            a(false);
            long j4 = (long) min;
            fVar.f158864b -= j4;
            vVar.f158913b += min;
            if (vVar.f158913b == vVar.f158914c) {
                fVar.f158863a = vVar.c();
                w.a(vVar);
            }
            j3 -= j4;
        }
    }
}
