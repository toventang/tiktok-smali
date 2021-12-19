package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class XXHash64JNI extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JNI();
    private static XXHash64 SAFE_INSTANCE;

    XXHash64JNI() {
    }

    static {
        Covode.recordClassIndex(106050);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public final long hash(byte[] bArr, int i2, int i3, long j2) {
        MethodCollector.i(4395);
        SafeUtils.checkRange(bArr, i2, i3);
        long XXH64 = XXHashJNI.XXH64(bArr, i2, i3, j2);
        MethodCollector.o(4395);
        return XXH64;
    }

    @Override // net.jpountz.xxhash.XXHash64
    public final long hash(ByteBuffer byteBuffer, int i2, int i3, long j2) {
        MethodCollector.i(4453);
        if (byteBuffer.isDirect()) {
            ByteBufferUtils.checkRange(byteBuffer, i2, i3);
            long XXH64BB = XXHashJNI.XXH64BB(byteBuffer, i2, i3, j2);
            MethodCollector.o(4453);
            return XXH64BB;
        } else if (byteBuffer.hasArray()) {
            long hash = hash(byteBuffer.array(), i2 + byteBuffer.arrayOffset(), i3, j2);
            MethodCollector.o(4453);
            return hash;
        } else {
            XXHash64 xXHash64 = SAFE_INSTANCE;
            if (xXHash64 == null) {
                xXHash64 = XXHashFactory.safeInstance().hash64();
                SAFE_INSTANCE = xXHash64;
            }
            long hash2 = xXHash64.hash(byteBuffer, i2, i3, j2);
            MethodCollector.o(4453);
            return hash2;
        }
    }
}
