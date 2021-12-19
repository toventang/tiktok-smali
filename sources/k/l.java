package k;

import com.bytedance.covode.number.Covode;

public abstract class l implements aa {
    public final aa delegate;

    static {
        Covode.recordClassIndex(105435);
    }

    @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // k.aa
    public ab timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public l(aa aaVar) {
        h.f.b.l.c(aaVar, "");
        this.delegate = aaVar;
    }

    @Override // k.aa
    public long read(f fVar, long j2) {
        h.f.b.l.c(fVar, "");
        return this.delegate.read(fVar, j2);
    }
}
