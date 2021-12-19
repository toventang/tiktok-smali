package androidx.i.a;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public interface d extends Closeable {
    static {
        Covode.recordClassIndex(1156);
    }

    void a(int i2);

    void a(int i2, double d2);

    void a(int i2, long j2);

    void a(int i2, String str);

    void a(int i2, byte[] bArr);
}
