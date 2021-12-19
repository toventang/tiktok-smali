package d.a.c;

import com.bytedance.covode.number.Covode;
import d.a.c.a.b;
import h.f.b.l;
import java.util.Arrays;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f156595b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f156596a;

    static {
        Covode.recordClassIndex(103974);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103975);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int hashCode() {
        byte[] bArr = this.f156596a;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    public final String toString() {
        return "Hash(bytes=" + Arrays.toString(this.f156596a) + ")";
    }

    public final boolean equals(Object obj) {
        byte[] bArr = this.f156596a;
        if (!(obj instanceof c) || !l.a(bArr, ((c) obj).f156596a)) {
            return false;
        }
        return true;
    }

    public static final String a(byte[] bArr) {
        l.c(bArr, "");
        String str = b.f156591a;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i2 = b2 & 255;
            sb.append(str.charAt((i2 >>> 4) & 15));
            sb.append(str.charAt((i2 >>> 0) & 15));
        }
        String sb2 = sb.toString();
        l.a((Object) sb2, "");
        return sb2;
    }
}
