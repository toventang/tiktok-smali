package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.util.zip.Checksum;

public abstract class StreamingXXHash64 {
    final long seed;

    /* access modifiers changed from: package-private */
    public interface Factory {
        static {
            Covode.recordClassIndex(106038);
        }

        StreamingXXHash64 newStreamingHash(long j2);
    }

    static {
        Covode.recordClassIndex(106036);
    }

    public abstract long getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i2, int i3);

    public final Checksum asChecksum() {
        return new Checksum() {
            /* class net.jpountz.xxhash.StreamingXXHash64.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106037);
            }

            public long getValue() {
                return StreamingXXHash64.this.getValue();
            }

            public void reset() {
                StreamingXXHash64.this.reset();
            }

            public String toString() {
                return StreamingXXHash64.this.toString();
            }

            public void update(int i2) {
                StreamingXXHash64.this.update(new byte[]{(byte) i2}, 0, 1);
            }

            public void update(byte[] bArr, int i2, int i3) {
                StreamingXXHash64.this.update(bArr, i2, i3);
            }
        };
    }

    public String toString() {
        return getClass().getSimpleName() + "(seed=" + this.seed + ")";
    }

    StreamingXXHash64(long j2) {
        this.seed = j2;
    }
}
