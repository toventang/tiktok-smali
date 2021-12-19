package k;

import com.bytedance.covode.number.Covode;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

public interface g extends WritableByteChannel, y {
    static {
        Covode.recordClassIndex(105429);
    }

    long a(aa aaVar);

    f a();

    g a(int i2);

    g a(long j2);

    g a(String str);

    g a(i iVar);

    g a(byte[] bArr);

    g a(byte[] bArr, int i2, int i3);

    g b();

    g b(int i2);

    g b(long j2);

    g c();

    g c(int i2);

    g c(long j2);

    OutputStream d();

    g d(int i2);

    @Override // k.y, java.io.Flushable
    void flush();
}
