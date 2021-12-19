package androidx.c;

import com.bytedance.covode.number.Covode;

public class d<E> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1806a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1807b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f1808c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f1809d;

    /* renamed from: e  reason: collision with root package name */
    private int f1810e;

    public d() {
        this(10);
    }

    static {
        Covode.recordClassIndex(555);
    }

    public final int b() {
        if (this.f1807b) {
            d();
        }
        return this.f1810e;
    }

    private void d() {
        int i2 = this.f1810e;
        long[] jArr = this.f1808c;
        Object[] objArr = this.f1809d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1806a) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1807b = false;
        this.f1810e = i3;
    }

    /* renamed from: a */
    public final d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f1808c = (long[]) this.f1808c.clone();
            dVar.f1809d = (Object[]) this.f1809d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i2 = this.f1810e;
        Object[] objArr = this.f1809d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1810e = 0;
        this.f1807b = false;
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1810e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1810e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            E c2 = c(i2);
            if (c2 != this) {
                sb.append((Object) c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final E a(long j2) {
        return a(j2, null);
    }

    public final void a(int i2) {
        Object[] objArr = this.f1809d;
        Object obj = objArr[i2];
        Object obj2 = f1806a;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f1807b = true;
        }
    }

    public final int c(long j2) {
        if (this.f1807b) {
            d();
        }
        return c.a(this.f1808c, this.f1810e, j2);
    }

    public final boolean d(long j2) {
        if (c(j2) >= 0) {
            return true;
        }
        return false;
    }

    public d(int i2) {
        if (i2 == 0) {
            this.f1808c = c.f1804b;
            this.f1809d = c.f1805c;
            return;
        }
        int b2 = c.b(i2);
        this.f1808c = new long[b2];
        this.f1809d = new Object[b2];
    }

    public final long b(int i2) {
        if (this.f1807b) {
            d();
        }
        return this.f1808c[i2];
    }

    public final E c(int i2) {
        if (this.f1807b) {
            d();
        }
        return (E) this.f1809d[i2];
    }

    public final void b(long j2) {
        Object[] objArr;
        Object obj;
        int a2 = c.a(this.f1808c, this.f1810e, j2);
        if (a2 >= 0 && (objArr = this.f1809d)[a2] != (obj = f1806a)) {
            objArr[a2] = obj;
            this.f1807b = true;
        }
    }

    public final E a(long j2, E e2) {
        int a2 = c.a(this.f1808c, this.f1810e, j2);
        if (a2 >= 0) {
            Object[] objArr = this.f1809d;
            if (objArr[a2] != f1806a) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public final void c(long j2, E e2) {
        int i2 = this.f1810e;
        if (i2 == 0 || j2 > this.f1808c[i2 - 1]) {
            if (this.f1807b && i2 >= this.f1808c.length) {
                d();
            }
            int i3 = this.f1810e;
            if (i3 >= this.f1808c.length) {
                int b2 = c.b(i3 + 1);
                long[] jArr = new long[b2];
                Object[] objArr = new Object[b2];
                long[] jArr2 = this.f1808c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f1809d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1808c = jArr;
                this.f1809d = objArr;
            }
            this.f1808c[i3] = j2;
            this.f1809d[i3] = e2;
            this.f1810e = i3 + 1;
            return;
        }
        b(j2, e2);
    }

    public final void b(long j2, E e2) {
        int a2 = c.a(this.f1808c, this.f1810e, j2);
        if (a2 >= 0) {
            this.f1809d[a2] = e2;
            return;
        }
        int i2 = a2 ^ -1;
        int i3 = this.f1810e;
        if (i2 < i3) {
            Object[] objArr = this.f1809d;
            if (objArr[i2] == f1806a) {
                this.f1808c[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f1807b && i3 >= this.f1808c.length) {
            d();
            i2 = c.a(this.f1808c, this.f1810e, j2) ^ -1;
        }
        int i4 = this.f1810e;
        if (i4 >= this.f1808c.length) {
            int b2 = c.b(i4 + 1);
            long[] jArr = new long[b2];
            Object[] objArr2 = new Object[b2];
            long[] jArr2 = this.f1808c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1809d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1808c = jArr;
            this.f1809d = objArr2;
        }
        int i5 = this.f1810e;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f1808c;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1809d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1810e - i2);
        }
        this.f1808c[i2] = j2;
        this.f1809d[i2] = e2;
        this.f1810e++;
    }
}
