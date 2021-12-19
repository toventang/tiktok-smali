package h.j;

import com.bytedance.covode.number.Covode;
import h.d.c;
import java.util.Iterator;

public class e implements h.f.b.a.a, Iterable<Integer> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f158746d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f158747a;

    /* renamed from: b  reason: collision with root package name */
    public final int f158748b;

    /* renamed from: c  reason: collision with root package name */
    public final int f158749c;

    static {
        Covode.recordClassIndex(105270);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105271);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static e a(int i2, int i3, int i4) {
            return new e(i2, i3, i4);
        }
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Integer> iterator() {
        return new f(this.f158747a, this.f158748b, this.f158749c);
    }

    public boolean a() {
        if (this.f158749c > 0) {
            if (this.f158747a > this.f158748b) {
                return true;
            }
            return false;
        } else if (this.f158747a < this.f158748b) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.f158747a * 31) + this.f158748b) * 31) + this.f158749c;
    }

    public String toString() {
        StringBuilder append;
        int i2;
        if (this.f158749c > 0) {
            append = new StringBuilder().append(this.f158747a).append("..").append(this.f158748b).append(" step ");
            i2 = this.f158749c;
        } else {
            append = new StringBuilder().append(this.f158747a).append(" downTo ").append(this.f158748b).append(" step ");
            i2 = -this.f158749c;
        }
        return append.append(i2).toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (a() && ((e) obj).a()) {
            return true;
        }
        e eVar = (e) obj;
        if (this.f158747a == eVar.f158747a && this.f158748b == eVar.f158748b && this.f158749c == eVar.f158749c) {
            return true;
        }
        return false;
    }

    public e(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.f158747a = i2;
            if (i4 > 0) {
                if (i2 < i3) {
                    i3 -= c.a(i3, i2, i4);
                }
            } else if (i2 > i3) {
                i3 += c.a(i2, i3, -i4);
            }
            this.f158748b = i3;
            this.f158749c = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
