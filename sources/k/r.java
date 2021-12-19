package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.OutputStream;

/* access modifiers changed from: package-private */
public final class r implements y {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f158891a;

    /* renamed from: b  reason: collision with root package name */
    private final ab f158892b;

    static {
        Covode.recordClassIndex(105441);
    }

    @Override // k.y
    public final ab timeout() {
        return this.f158892b;
    }

    @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f158891a.close();
    }

    @Override // k.y, java.io.Flushable
    public final void flush() {
        this.f158891a.flush();
    }

    public final String toString() {
        return "sink(" + this.f158891a + ')';
    }

    public r(OutputStream outputStream, ab abVar) {
        l.c(outputStream, "");
        l.c(abVar, "");
        this.f158891a = outputStream;
        this.f158892b = abVar;
    }

    @Override // k.y
    public final void write(f fVar, long j2) {
        long j3 = j2;
        MethodCollector.i(3228);
        l.c(fVar, "");
        c.a(fVar.f158864b, 0, j3);
        while (j3 > 0) {
            this.f158892b.throwIfReached();
            v vVar = fVar.f158863a;
            if (vVar == null) {
                l.a();
            }
            int min = (int) Math.min(j3, (long) (vVar.f158914c - vVar.f158913b));
            this.f158891a.write(vVar.f158912a, vVar.f158913b, min);
            vVar.f158913b += min;
            long j4 = (long) min;
            j3 -= j4;
            fVar.f158864b -= j4;
            if (vVar.f158913b == vVar.f158914c) {
                fVar.f158863a = vVar.c();
                w.a(vVar);
            }
        }
        MethodCollector.o(3228);
    }
}
