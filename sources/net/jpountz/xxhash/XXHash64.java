package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public abstract class XXHash64 {
    static {
        Covode.recordClassIndex(106049);
    }

    public abstract long hash(ByteBuffer byteBuffer, int i2, int i3, long j2);

    public abstract long hash(byte[] bArr, int i2, int i3, long j2);

    public String toString() {
        return getClass().getSimpleName();
    }

    public final long hash(ByteBuffer byteBuffer, long j2) {
        long hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), j2);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }
}
