package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.Native;

enum XXHashJNI {
    ;

    static native int XXH32(byte[] bArr, int i2, int i3, int i4);

    static native int XXH32BB(ByteBuffer byteBuffer, int i2, int i3, int i4);

    static native int XXH32_digest(long j2);

    static native void XXH32_free(long j2);

    static native long XXH32_init(int i2);

    static native void XXH32_update(long j2, byte[] bArr, int i2, int i3);

    static native long XXH64(byte[] bArr, int i2, int i3, long j2);

    static native long XXH64BB(ByteBuffer byteBuffer, int i2, int i3, long j2);

    static native long XXH64_digest(long j2);

    static native void XXH64_free(long j2);

    static native long XXH64_init(long j2);

    static native void XXH64_update(long j2, byte[] bArr, int i2, int i3);

    private static native void init();

    static {
        MethodCollector.i(4883);
        Covode.recordClassIndex(106055);
        Native.load();
        init();
        MethodCollector.o(4883);
    }
}
