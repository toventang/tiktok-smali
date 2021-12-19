package f.a.e.j;

import com.bytedance.covode.number.Covode;

public final class l<T> {

    /* renamed from: a  reason: collision with root package name */
    final float f157947a;

    /* renamed from: b  reason: collision with root package name */
    int f157948b;

    /* renamed from: c  reason: collision with root package name */
    public int f157949c;

    /* renamed from: d  reason: collision with root package name */
    int f157950d;

    /* renamed from: e  reason: collision with root package name */
    public T[] f157951e;

    static {
        Covode.recordClassIndex(104875);
    }

    private static int a(int i2) {
        int i3 = i2 * -1640531527;
        return i3 ^ (i3 >>> 16);
    }

    public l() {
        this(16);
    }

    private void a() {
        T[] tArr = this.f157951e;
        int length = tArr.length;
        int i2 = length << 1;
        int i3 = i2 - 1;
        T[] tArr2 = (T[]) new Object[i2];
        int i4 = this.f157949c;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a2 = a(tArr[length].hashCode()) & i3;
                if (tArr2[a2] != null) {
                    do {
                        a2 = (a2 + 1) & i3;
                    } while (tArr2[a2] != null);
                }
                tArr2[a2] = tArr[length];
                i4 = i5;
            } else {
                this.f157948b = i3;
                this.f157950d = (int) (((float) i2) * this.f157947a);
                this.f157951e = tArr2;
                return;
            }
        }
    }

    public l(byte b2) {
        this(32);
    }

    private l(int i2) {
        this.f157947a = 0.75f;
        int a2 = m.a(i2);
        this.f157948b = a2 - 1;
        this.f157950d = (int) (((float) a2) * 0.75f);
        this.f157951e = (T[]) new Object[a2];
    }

    public final boolean b(T t) {
        T t2;
        T[] tArr = this.f157951e;
        int i2 = this.f157948b;
        int a2 = a(t.hashCode()) & i2;
        T t3 = tArr[a2];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return a(a2, tArr, i2);
        }
        do {
            a2 = (a2 + 1) & i2;
            t2 = tArr[a2];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return a(a2, tArr, i2);
    }

    public final boolean a(T t) {
        T t2;
        T[] tArr = this.f157951e;
        int i2 = this.f157948b;
        int a2 = a(t.hashCode()) & i2;
        T t3 = tArr[a2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a2 = (a2 + 1) & i2;
                t2 = tArr[a2];
                if (t2 != null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a2] = t;
        int i3 = this.f157949c + 1;
        this.f157949c = i3;
        if (i3 >= this.f157950d) {
            a();
        }
        return true;
    }

    private boolean a(int i2, T[] tArr, int i3) {
        int i4;
        T t;
        this.f157949c--;
        while (true) {
            int i5 = i2 + 1;
            while (true) {
                i4 = i5 & i3;
                t = tArr[i4];
                if (t == null) {
                    tArr[i2] = null;
                    return true;
                }
                int a2 = a(t.hashCode()) & i3;
                if (i2 <= i4) {
                    if (i2 >= a2 || a2 > i4) {
                        break;
                    }
                    i5 = i4 + 1;
                } else {
                    if (i2 >= a2 && a2 > i4) {
                        break;
                    }
                    i5 = i4 + 1;
                }
            }
            tArr[i2] = t;
            i2 = i4;
        }
    }
}
