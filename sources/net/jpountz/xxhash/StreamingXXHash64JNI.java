package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import net.jpountz.xxhash.StreamingXXHash64;

final class StreamingXXHash64JNI extends StreamingXXHash64 {
    private long state;

    static {
        Covode.recordClassIndex(106039);
    }

    static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        Factory() {
        }

        static {
            Covode.recordClassIndex(106040);
        }

        @Override // net.jpountz.xxhash.StreamingXXHash64.Factory
        public StreamingXXHash64 newStreamingHash(long j2) {
            return new StreamingXXHash64JNI(j2);
        }
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        MethodCollector.i(5790);
        super.finalize();
        XXHashJNI.XXH64_free(this.state);
        this.state = 0;
        MethodCollector.o(5790);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final long getValue() {
        MethodCollector.i(5782);
        checkState();
        long XXH64_digest = XXHashJNI.XXH64_digest(this.state);
        MethodCollector.o(5782);
        return XXH64_digest;
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final void reset() {
        MethodCollector.i(5774);
        checkState();
        XXHashJNI.XXH64_free(this.state);
        this.state = XXHashJNI.XXH64_init(this.seed);
        MethodCollector.o(5774);
    }

    StreamingXXHash64JNI(long j2) {
        super(j2);
        MethodCollector.i(5532);
        this.state = XXHashJNI.XXH64_init(j2);
        MethodCollector.o(5532);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final void update(byte[] bArr, int i2, int i3) {
        MethodCollector.i(5786);
        checkState();
        XXHashJNI.XXH64_update(this.state, bArr, i2, i3);
        MethodCollector.o(5786);
    }
}
