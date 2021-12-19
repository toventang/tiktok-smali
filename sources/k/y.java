package k;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.Flushable;

public interface y extends Closeable, Flushable {
    static {
        Covode.recordClassIndex(105453);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    ab timeout();

    void write(f fVar, long j2);
}
