package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public enum LZ4Utils {
    ;

    static int hash(int i2) {
        return (i2 * -1640531535) >>> 20;
    }

    static int hash64k(int i2) {
        return (i2 * -1640531535) >>> 19;
    }

    static int hashHC(int i2) {
        return (i2 * -1640531535) >>> 17;
    }

    static class Match {
        int len;
        int ref;
        int start;

        static {
            Covode.recordClassIndex(106018);
        }

        Match() {
        }

        /* access modifiers changed from: package-private */
        public int end() {
            return this.start + this.len;
        }

        /* access modifiers changed from: package-private */
        public void fix(int i2) {
            this.start += i2;
            this.ref += i2;
            this.len -= i2;
        }
    }

    static {
        Covode.recordClassIndex(106017);
    }

    static int maxCompressedLength(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("length must be >= 0, got ".concat(String.valueOf(i2)));
        } else if (i2 < 2113929216) {
            return i2 + (i2 / 255) + 16;
        } else {
            throw new IllegalArgumentException("length must be < 2113929216");
        }
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }
}
