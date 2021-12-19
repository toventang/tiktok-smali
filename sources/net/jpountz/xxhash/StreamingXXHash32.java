package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.util.zip.Checksum;

public abstract class StreamingXXHash32 {
    final int seed;

    /* access modifiers changed from: package-private */
    public interface Factory {
        static {
            Covode.recordClassIndex(106029);
        }

        StreamingXXHash32 newStreamingHash(int i2);
    }

    static {
        Covode.recordClassIndex(106027);
    }

    public abstract int getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i2, int i3);

    public final Checksum asChecksum() {
        return new Checksum() {
            /* class net.jpountz.xxhash.StreamingXXHash32.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106028);
            }

            public void reset() {
                StreamingXXHash32.this.reset();
            }

            public String toString() {
                return StreamingXXHash32.this.toString();
            }

            public long getValue() {
                return ((long) StreamingXXHash32.this.getValue()) & 268435455;
            }

            public void update(int i2) {
                StreamingXXHash32.this.update(new byte[]{(byte) i2}, 0, 1);
            }

            public void update(byte[] bArr, int i2, int i3) {
                StreamingXXHash32.this.update(bArr, i2, i3);
            }
        };
    }

    public String toString() {
        return getClass().getSimpleName() + "(seed=" + this.seed + ")";
    }

    StreamingXXHash32(int i2) {
        this.seed = i2;
    }
}
