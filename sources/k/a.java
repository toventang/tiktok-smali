package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import k.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f158853a = i.a.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$jvm();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f158854b = i.a.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$jvm();

    static {
        Covode.recordClassIndex(105410);
    }

    public static final String a(byte[] bArr, byte[] bArr2) {
        l.c(bArr, "");
        l.c(bArr2, "");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            i2 = i5 + 1;
            byte b4 = bArr[i5];
            int i6 = i3 + 1;
            bArr3[i3] = bArr2[(b2 & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 = i8 + 1;
            bArr3[i8] = bArr2[b4 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i2];
            int i9 = i3 + 1;
            bArr3[i3] = bArr2[(b5 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b5 & 3) << 4];
            bArr3[i10] = 61;
            bArr3[i10 + 1] = 61;
        } else if (length2 == 2) {
            byte b6 = bArr[i2];
            byte b7 = bArr[i2 + 1];
            int i11 = i3 + 1;
            bArr3[i3] = bArr2[(b6 & 255) >> 2];
            int i12 = i11 + 1;
            bArr3[i11] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i12] = bArr2[(b7 & 15) << 2];
            bArr3[i12 + 1] = 61;
        }
        return b.a(bArr3);
    }
}
