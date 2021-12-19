package h.f.b;

import com.bytedance.covode.number.Covode;

public abstract class t<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f158726a;

    /* renamed from: b  reason: collision with root package name */
    private final T[] f158727b = ((T[]) new Object[2]);

    /* renamed from: c  reason: collision with root package name */
    private final int f158728c = 2;

    static {
        Covode.recordClassIndex(105231);
    }

    /* access modifiers changed from: protected */
    public abstract int a(T t);

    /* access modifiers changed from: protected */
    public final int c() {
        int i2;
        int i3 = this.f158728c - 1;
        int i4 = 0;
        if (i3 >= 0) {
            int i5 = 0;
            while (true) {
                T t = this.f158727b[i5];
                if (t != null) {
                    i2 = a(t);
                } else {
                    i2 = 1;
                }
                i4 += i2;
                if (i5 == i3) {
                    break;
                }
                i5++;
            }
        }
        return i4;
    }

    public final void b(T t) {
        l.d(t, "");
        T[] tArr = this.f158727b;
        int i2 = this.f158726a;
        this.f158726a = i2 + 1;
        tArr[i2] = t;
    }

    /* access modifiers changed from: protected */
    public final T a(T t, T t2) {
        int i2;
        l.d(t, "");
        l.d(t2, "");
        int i3 = this.f158728c - 1;
        int i4 = 0;
        if (i3 >= 0) {
            int i5 = 0;
            int i6 = 0;
            i2 = 0;
            while (true) {
                T t3 = this.f158727b[i5];
                if (t3 != null) {
                    if (i6 < i5) {
                        int i7 = i5 - i6;
                        System.arraycopy(t, i6, t2, i2, i7);
                        i2 += i7;
                    }
                    int a2 = a(t3);
                    System.arraycopy(t3, 0, t2, i2, a2);
                    i2 += a2;
                    i6 = i5 + 1;
                }
                if (i5 == i3) {
                    break;
                }
                i5++;
            }
            i4 = i6;
        } else {
            i2 = 0;
        }
        int i8 = this.f158728c;
        if (i4 < i8) {
            System.arraycopy(t, i4, t2, i2, i8 - i4);
        }
        return t2;
    }
}
