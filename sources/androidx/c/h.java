package androidx.c;

import com.bytedance.covode.number.Covode;

public class h<E> implements Cloneable {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f1840d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f1841a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f1842b;

    /* renamed from: c  reason: collision with root package name */
    public int f1843c;

    /* renamed from: e  reason: collision with root package name */
    private int[] f1844e;

    public h() {
        this(10);
    }

    static {
        Covode.recordClassIndex(564);
    }

    public final int b() {
        if (this.f1841a) {
            c();
        }
        return this.f1843c;
    }

    private void c() {
        int i2 = this.f1843c;
        int[] iArr = this.f1844e;
        Object[] objArr = this.f1842b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1840d) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1841a = false;
        this.f1843c = i3;
    }

    /* renamed from: a */
    public final h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f1844e = (int[]) this.f1844e.clone();
            hVar.f1842b = (Object[]) this.f1842b.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1843c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1843c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            E d2 = d(i2);
            if (d2 != this) {
                sb.append((Object) d2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final E a(int i2) {
        return a(i2, null);
    }

    public final int c(int i2) {
        if (this.f1841a) {
            c();
        }
        return this.f1844e[i2];
    }

    public final E d(int i2) {
        if (this.f1841a) {
            c();
        }
        return (E) this.f1842b[i2];
    }

    public final int e(int i2) {
        if (this.f1841a) {
            c();
        }
        return c.a(this.f1844e, this.f1843c, i2);
    }

    public h(int i2) {
        if (i2 == 0) {
            this.f1844e = c.f1803a;
            this.f1842b = c.f1805c;
            return;
        }
        int a2 = c.a(i2);
        this.f1844e = new int[a2];
        this.f1842b = new Object[a2];
    }

    public final void b(int i2) {
        Object[] objArr;
        Object obj;
        int a2 = c.a(this.f1844e, this.f1843c, i2);
        if (a2 >= 0 && (objArr = this.f1842b)[a2] != (obj = f1840d)) {
            objArr[a2] = obj;
            this.f1841a = true;
        }
    }

    public final E a(int i2, E e2) {
        int a2 = c.a(this.f1844e, this.f1843c, i2);
        if (a2 >= 0) {
            Object[] objArr = this.f1842b;
            if (objArr[a2] != f1840d) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public final void c(int i2, E e2) {
        int i3 = this.f1843c;
        if (i3 == 0 || i2 > this.f1844e[i3 - 1]) {
            if (this.f1841a && i3 >= this.f1844e.length) {
                c();
            }
            int i4 = this.f1843c;
            if (i4 >= this.f1844e.length) {
                int a2 = c.a(i4 + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                int[] iArr2 = this.f1844e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f1842b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1844e = iArr;
                this.f1842b = objArr;
            }
            this.f1844e[i4] = i2;
            this.f1842b[i4] = e2;
            this.f1843c = i4 + 1;
            return;
        }
        b(i2, e2);
    }

    public final void b(int i2, E e2) {
        int a2 = c.a(this.f1844e, this.f1843c, i2);
        if (a2 >= 0) {
            this.f1842b[a2] = e2;
            return;
        }
        int i3 = a2 ^ -1;
        int i4 = this.f1843c;
        if (i3 < i4) {
            Object[] objArr = this.f1842b;
            if (objArr[i3] == f1840d) {
                this.f1844e[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f1841a && i4 >= this.f1844e.length) {
            c();
            i3 = c.a(this.f1844e, this.f1843c, i2) ^ -1;
        }
        int i5 = this.f1843c;
        if (i5 >= this.f1844e.length) {
            int a3 = c.a(i5 + 1);
            int[] iArr = new int[a3];
            Object[] objArr2 = new Object[a3];
            int[] iArr2 = this.f1844e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1842b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1844e = iArr;
            this.f1842b = objArr2;
        }
        int i6 = this.f1843c;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f1844e;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f1842b;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f1843c - i3);
        }
        this.f1844e[i3] = i2;
        this.f1842b[i3] = e2;
        this.f1843c++;
    }
}
