package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.Comparable;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.internal.ab;

public class aa<T extends ab & Comparable<? super T>> {
    public volatile int _size;

    /* renamed from: b  reason: collision with root package name */
    public T[] f159114b;

    static {
        Covode.recordClassIndex(105641);
    }

    public final boolean a() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public final T b() {
        T d2;
        synchronized (this) {
            d2 = d();
        }
        return d2;
    }

    public final T d() {
        T[] tArr = this.f159114b;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final T c() {
        T t;
        synchronized (this) {
            if (this._size > 0) {
                t = a(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    public final boolean a(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            if (t.b() == null) {
                z = false;
            } else {
                int c2 = t.c();
                if (ar.f159021a) {
                    if (c2 < 0) {
                        throw new AssertionError();
                    }
                }
                a(c2);
            }
        }
        return z;
    }

    public final void b(int i2) {
        while (i2 > 0) {
            T[] tArr = this.f159114b;
            if (tArr == null) {
                l.a();
            }
            int i3 = (i2 - 1) / 2;
            T t = tArr[i3];
            if (t == null) {
                l.a();
            }
            Comparable comparable = (Comparable) t;
            T t2 = tArr[i2];
            if (t2 == null) {
                l.a();
            }
            if (comparable.compareTo(t2) > 0) {
                a(i2, i3);
                i2 = i3;
            } else {
                return;
            }
        }
    }

    private final void c(int i2) {
        while (true) {
            int i3 = (i2 * 2) + 1;
            if (i3 < this._size) {
                T[] tArr = this.f159114b;
                if (tArr == null) {
                    l.a();
                }
                int i4 = i3 + 1;
                if (i4 < this._size) {
                    T t = tArr[i4];
                    if (t == null) {
                        l.a();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i3];
                    if (t2 == null) {
                        l.a();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        i3 = i4;
                    }
                }
                T t3 = tArr[i2];
                if (t3 == null) {
                    l.a();
                }
                Comparable comparable2 = (Comparable) t3;
                T t4 = tArr[i3];
                if (t4 == null) {
                    l.a();
                }
                if (comparable2.compareTo(t4) > 0) {
                    a(i2, i3);
                    i2 = i3;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final T a(int i2) {
        if (!ar.f159021a || this._size > 0) {
            T[] tArr = this.f159114b;
            if (tArr == null) {
                l.a();
            }
            this._size--;
            if (i2 < this._size) {
                a(i2, this._size);
                int i3 = (i2 - 1) / 2;
                if (i2 > 0) {
                    T t = tArr[i2];
                    if (t == null) {
                        l.a();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i3];
                    if (t2 == null) {
                        l.a();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        a(i2, i3);
                        b(i3);
                    }
                }
                c(i2);
            }
            T t3 = tArr[this._size];
            if (t3 == null) {
                l.a();
            }
            if (!ar.f159021a || t3.b() == this) {
                t3.a(null);
                t3.a(-1);
                tArr[this._size] = null;
                return t3;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final void a(int i2, int i3) {
        T[] tArr = this.f159114b;
        if (tArr == null) {
            l.a();
        }
        T t = tArr[i3];
        if (t == null) {
            l.a();
        }
        T t2 = tArr[i2];
        if (t2 == null) {
            l.a();
        }
        tArr[i2] = t;
        tArr[i3] = t2;
        t.a(i2);
        t2.a(i3);
    }
}
