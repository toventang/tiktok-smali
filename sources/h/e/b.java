package h.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.InputStream;
import java.io.OutputStream;

public final class b {
    static {
        Covode.recordClassIndex(105149);
    }

    public static final long a(InputStream inputStream, OutputStream outputStream, int i2) {
        l.d(inputStream, "");
        l.d(outputStream, "");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += (long) read;
            read = inputStream.read(bArr);
        }
        return j2;
    }
}
