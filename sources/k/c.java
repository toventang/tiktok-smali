package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(105417);
    }

    public static final int a(int i2) {
        return ((i2 & 255) << 24) | ((-16777216 & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final long a(long j2) {
        return ((j2 & 255) << 56) | ((-72057594037927936L & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }

    public static final void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final boolean a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        l.c(bArr, "");
        l.c(bArr2, "");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }
}
