package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.d;

public final class b {
    static {
        Covode.recordClassIndex(105416);
    }

    public static final String a(byte[] bArr) {
        l.c(bArr, "");
        return new String(bArr, d.f158808a);
    }

    public static final byte[] a(String str) {
        l.c(str, "");
        byte[] bytes = str.getBytes(d.f158808a);
        l.a((Object) bytes, "");
        return bytes;
    }

    public static final void a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        l.c(bArr, "");
        l.c(bArr2, "");
        System.arraycopy(bArr, i2, bArr2, i3, i4);
    }
}
