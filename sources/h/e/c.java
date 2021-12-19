package h.e;

import com.bytedance.covode.number.Covode;
import h.a;
import java.io.Closeable;

public final class c {
    static {
        Covode.recordClassIndex(105150);
    }

    public static final void a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            a.a(th, th2);
        }
    }
}
