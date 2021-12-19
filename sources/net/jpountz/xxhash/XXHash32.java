package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public abstract class XXHash32 {
    static {
        Covode.recordClassIndex(106045);
    }

    public abstract int hash(ByteBuffer byteBuffer, int i2, int i3, int i4);

    public abstract int hash(byte[] bArr, int i2, int i3, int i4);

    public String toString() {
        return getClass().getSimpleName();
    }

    public final int hash(ByteBuffer byteBuffer, int i2) {
        int hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), i2);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }
}
