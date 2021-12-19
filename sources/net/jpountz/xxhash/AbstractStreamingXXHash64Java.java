package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;

abstract class AbstractStreamingXXHash64Java extends StreamingXXHash64 {
    int memSize;
    final byte[] memory = new byte[32];
    long totalLen;
    long v1;
    long v2;
    long v3;
    long v4;

    static {
        Covode.recordClassIndex(106026);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public void reset() {
        this.v1 = (this.seed - 7046029288634856825L) - 4417276706812531889L;
        this.v2 = this.seed - 4417276706812531889L;
        this.v3 = this.seed + 0;
        this.v4 = this.seed - -7046029288634856825L;
        this.totalLen = 0;
        this.memSize = 0;
    }

    AbstractStreamingXXHash64Java(long j2) {
        super(j2);
        reset();
    }
}
