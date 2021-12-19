package k;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public interface aa extends Closeable {
    static {
        Covode.recordClassIndex(105412);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(f fVar, long j2);

    ab timeout();
}
