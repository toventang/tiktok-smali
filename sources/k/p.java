package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class p implements aa {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f158889a;

    /* renamed from: b  reason: collision with root package name */
    private final ab f158890b;

    static {
        Covode.recordClassIndex(105439);
    }

    @Override // k.aa
    public final ab timeout() {
        return this.f158890b;
    }

    @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f158889a.close();
    }

    public final String toString() {
        return "source(" + this.f158889a + ')';
    }

    public p(InputStream inputStream, ab abVar) {
        l.c(inputStream, "");
        l.c(abVar, "");
        this.f158889a = inputStream;
        this.f158890b = abVar;
    }

    @Override // k.aa
    public final long read(f fVar, long j2) {
        MethodCollector.i(3339);
        l.c(fVar, "");
        if (j2 == 0) {
            MethodCollector.o(3339);
            return 0;
        } else if (j2 >= 0) {
            try {
                this.f158890b.throwIfReached();
                v j3 = fVar.j(1);
                int read = this.f158889a.read(j3.f158912a, j3.f158914c, (int) Math.min(j2, (long) (8192 - j3.f158914c)));
                if (read == -1) {
                    MethodCollector.o(3339);
                    return -1;
                }
                j3.f158914c += read;
                long j4 = (long) read;
                fVar.f158864b += j4;
                MethodCollector.o(3339);
                return j4;
            } catch (AssertionError e2) {
                if (q.a(e2)) {
                    IOException iOException = new IOException(e2);
                    MethodCollector.o(3339);
                    throw iOException;
                }
                MethodCollector.o(3339);
                throw e2;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)).toString());
            MethodCollector.o(3339);
            throw illegalArgumentException;
        }
    }
}
