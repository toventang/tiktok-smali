package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class e implements y {
    static {
        Covode.recordClassIndex(105423);
    }

    @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // k.y, java.io.Flushable
    public final void flush() {
    }

    @Override // k.y
    public final ab timeout() {
        return ab.NONE;
    }

    @Override // k.y
    public final void write(f fVar, long j2) {
        l.c(fVar, "");
        fVar.l(j2);
    }
}
