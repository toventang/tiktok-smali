package k.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;
import k.b;
import k.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f158855a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static final i f158856b = i.a.a(new byte[0]);

    static {
        Covode.recordClassIndex(105411);
    }

    public static final i a(String str) {
        l.c(str, "");
        i iVar = new i(b.a(str));
        iVar.setUtf8$jvm(str);
        return iVar;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c2)));
            }
        }
        return (c2 - c3) + 10;
    }

    public static final i a(byte[] bArr) {
        l.c(bArr, "");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l.a((Object) copyOf, "");
        return new i(copyOf);
    }

    public static final i a(i iVar, int i2, int i3) {
        l.c(iVar, "");
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        } else if (i3 <= iVar.getData$jvm().length) {
            int i4 = i3 - i2;
            if (i4 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            } else if (i2 == 0 && i3 == iVar.getData$jvm().length) {
                return iVar;
            } else {
                byte[] bArr = new byte[i4];
                b.a(iVar.getData$jvm(), i2, bArr, 0, i4);
                return new i(bArr);
            }
        } else {
            throw new IllegalArgumentException(("endIndex > length(" + iVar.getData$jvm().length + ')').toString());
        }
    }
}
