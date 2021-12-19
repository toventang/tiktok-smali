package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import net.jpountz.xxhash.StreamingXXHash32;

final class StreamingXXHash32JNI extends StreamingXXHash32 {
    private long state;

    static {
        Covode.recordClassIndex(106030);
    }

    static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        Factory() {
        }

        static {
            Covode.recordClassIndex(106031);
        }

        @Override // net.jpountz.xxhash.StreamingXXHash32.Factory
        public StreamingXXHash32 newStreamingHash(int i2) {
            return new StreamingXXHash32JNI(i2);
        }
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        MethodCollector.i(5006);
        super.finalize();
        XXHashJNI.XXH32_free(this.state);
        this.state = 0;
        MethodCollector.o(5006);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public final int getValue() {
        MethodCollector.i(5002);
        checkState();
        int XXH32_digest = XXHashJNI.XXH32_digest(this.state);
        MethodCollector.o(5002);
        return XXH32_digest;
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public final void reset() {
        MethodCollector.i(4999);
        checkState();
        XXHashJNI.XXH32_free(this.state);
        this.state = XXHashJNI.XXH32_init(this.seed);
        MethodCollector.o(4999);
    }

    StreamingXXHash32JNI(int i2) {
        super(i2);
        MethodCollector.i(4970);
        this.state = XXHashJNI.XXH32_init(i2);
        MethodCollector.o(4970);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public final void update(byte[] bArr, int i2, int i3) {
        MethodCollector.i(5004);
        checkState();
        XXHashJNI.XXH32_update(this.state, bArr, i2, i3);
        MethodCollector.o(5004);
    }
}
