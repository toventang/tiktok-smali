package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class XXHash32JNI extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JNI();
    private static XXHash32 SAFE_INSTANCE;

    XXHash32JNI() {
    }

    static {
        Covode.recordClassIndex(106046);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public final int hash(byte[] bArr, int i2, int i3, int i4) {
        MethodCollector.i(5168);
        SafeUtils.checkRange(bArr, i2, i3);
        int XXH32 = XXHashJNI.XXH32(bArr, i2, i3, i4);
        MethodCollector.o(5168);
        return XXH32;
    }

    @Override // net.jpountz.xxhash.XXHash32
    public final int hash(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        MethodCollector.i(5349);
        if (byteBuffer.isDirect()) {
            ByteBufferUtils.checkRange(byteBuffer, i2, i3);
            int XXH32BB = XXHashJNI.XXH32BB(byteBuffer, i2, i3, i4);
            MethodCollector.o(5349);
            return XXH32BB;
        } else if (byteBuffer.hasArray()) {
            int hash = hash(byteBuffer.array(), i2 + byteBuffer.arrayOffset(), i3, i4);
            MethodCollector.o(5349);
            return hash;
        } else {
            XXHash32 xXHash32 = SAFE_INSTANCE;
            if (xXHash32 == null) {
                xXHash32 = XXHashFactory.safeInstance().hash32();
                SAFE_INSTANCE = xXHash32;
            }
            int hash2 = xXHash32.hash(byteBuffer, i2, i3, i4);
            MethodCollector.o(5349);
            return hash2;
        }
    }
}
