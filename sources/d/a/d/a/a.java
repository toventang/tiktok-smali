package d.a.d.a;

import com.bytedance.covode.number.Covode;
import h.a.i;
import h.f.b.l;
import java.util.Arrays;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f156613c = f156613c;

    /* renamed from: d  reason: collision with root package name */
    public static final C4136a f156614d = new C4136a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public byte[] f156615a;

    /* renamed from: b  reason: collision with root package name */
    public int f156616b;

    /* renamed from: d.a.d.a.a$a  reason: collision with other inner class name */
    public static final class C4136a {
        static {
            Covode.recordClassIndex(103986);
        }

        private C4136a() {
        }

        public /* synthetic */ C4136a(byte b2) {
            this();
        }
    }

    public /* synthetic */ a() {
        this(32);
    }

    public String toString() {
        return this.f156615a.toString();
    }

    static {
        Covode.recordClassIndex(103985);
    }

    public a(int i2) {
        if (i2 >= 0) {
            this.f156615a = new byte[i2];
            return;
        }
        throw new IllegalArgumentException("Negative initial size: ".concat(String.valueOf(i2)).toString());
    }

    public final void a(byte[] bArr, int i2, int i3) {
        l.c(bArr, "");
        if (i2 >= 0 && i2 <= bArr.length && i3 >= 0) {
            int i4 = i2 + i3;
            if (i4 - bArr.length <= 0) {
                int i5 = this.f156616b + i3;
                byte[] bArr2 = this.f156615a;
                if (i5 - bArr2.length > 0) {
                    int length = bArr2.length << 1;
                    if (length - i5 < 0) {
                        length = i5;
                    }
                    int i6 = f156613c;
                    if (length - i6 > 0) {
                        if (i5 < 0) {
                            throw new IllegalStateException("out of memory!".toString());
                        } else if (i5 > i6) {
                            length = Integer.MAX_VALUE;
                        } else {
                            length = i6;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, length);
                    l.a((Object) copyOf, "");
                    this.f156615a = copyOf;
                }
                i.a(bArr, this.f156615a, this.f156616b, i2, i4);
                this.f156616b += i3;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
