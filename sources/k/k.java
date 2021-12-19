package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class k implements y {
    public final y delegate;

    static {
        Covode.recordClassIndex(105434);
    }

    @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // k.y, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // k.y
    public ab timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public k(y yVar) {
        l.c(yVar, "");
        this.delegate = yVar;
    }

    @Override // k.y
    public void write(f fVar, long j2) {
        l.c(fVar, "");
        this.delegate.write(fVar, j2);
    }
}
