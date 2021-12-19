package h.a;

import com.bytedance.covode.number.Covode;
import h.a.d;
import h.f.b.l;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class h<E> extends e<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f158645d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f158646e = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f158647a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f158648b;

    /* renamed from: c  reason: collision with root package name */
    public int f158649c;

    public static final class a {
        static {
            Covode.recordClassIndex(105066);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // h.a.e
    public final int a() {
        return this.f158649c;
    }

    public h() {
        this.f158648b = f158646e;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    static {
        Covode.recordClassIndex(105065);
    }

    public final void clear() {
        int c2 = c(this.f158647a + size());
        int i2 = this.f158647a;
        if (i2 < c2) {
            i.a(this.f158648b, i2, c2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f158648b;
            i.a(objArr, this.f158647a, objArr.length);
            i.a(this.f158648b, 0, c2);
        }
        this.f158647a = 0;
        this.f158649c = 0;
    }

    public final E b() {
        if (!isEmpty()) {
            int i2 = this.f158647a;
            Object[] objArr = this.f158648b;
            E e2 = (E) objArr[i2];
            objArr[i2] = null;
            this.f158647a = e(i2);
            this.f158649c = size() - 1;
            return e2;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    private int c(int i2) {
        Object[] objArr = this.f158648b;
        if (i2 >= objArr.length) {
            return i2 - objArr.length;
        }
        return i2;
    }

    private int d(int i2) {
        if (i2 < 0) {
            return i2 + this.f158648b.length;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final boolean add(E e2) {
        b(e2);
        return true;
    }

    private int e(int i2) {
        if (i2 == i.i(this.f158648b)) {
            return 0;
        }
        return i2 + 1;
    }

    private final int f(int i2) {
        if (i2 == 0) {
            return i.i(this.f158648b);
        }
        return i2 - 1;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public h(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = f158646e;
        } else if (i2 > 0) {
            objArr = new Object[i2];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: ".concat(String.valueOf(i2)));
        }
        this.f158648b = objArr;
    }

    public final void a(E e2) {
        b(size() + 1);
        int f2 = f(this.f158647a);
        this.f158647a = f2;
        this.f158648b[f2] = e2;
        this.f158649c = size() + 1;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i2) {
        d.a.a(i2, size());
        return (E) this.f158648b[c(this.f158647a + i2)];
    }

    private void b(E e2) {
        b(size() + 1);
        this.f158648b[c(this.f158647a + size())] = e2;
        this.f158649c = size() + 1;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        l.d(collection, "");
        if (collection.isEmpty()) {
            return false;
        }
        b(size() + collection.size());
        a(c(this.f158647a + size()), collection);
        return true;
    }

    private final void b(int i2) {
        if (i2 >= 0) {
            Object[] objArr = this.f158648b;
            if (i2 > objArr.length) {
                if (objArr == f158646e) {
                    this.f158648b = new Object[h.j.h.b(i2, 10)];
                    return;
                }
                int length = objArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                if (i3 - d.a.d.a.a.f156613c > 0) {
                    if (i2 > 2147483639) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = d.a.d.a.a.f156613c;
                    }
                }
                Object[] objArr2 = new Object[i3];
                i.a(objArr, objArr2, 0, this.f158647a, objArr.length);
                Object[] objArr3 = this.f158648b;
                int length2 = objArr3.length;
                int i4 = this.f158647a;
                i.a(objArr3, objArr2, length2 - i4, 0, i4);
                this.f158647a = 0;
                this.f158648b = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int indexOf(Object obj) {
        int i2;
        int c2 = c(this.f158647a + size());
        int i3 = this.f158647a;
        if (i3 < c2) {
            while (i3 < c2) {
                if (l.a(obj, this.f158648b[i3])) {
                    i2 = this.f158647a;
                } else {
                    i3++;
                }
            }
            return -1;
        } else if (i3 < c2) {
            return -1;
        } else {
            int length = this.f158648b.length;
            while (true) {
                if (i3 >= length) {
                    for (int i4 = 0; i4 < c2; i4++) {
                        if (l.a(obj, this.f158648b[i4])) {
                            i3 = i4 + this.f158648b.length;
                            i2 = this.f158647a;
                        }
                    }
                    return -1;
                } else if (l.a(obj, this.f158648b[i3])) {
                    i2 = this.f158647a;
                    break;
                } else {
                    i3++;
                }
            }
        }
        return i3 - i2;
    }

    public final int lastIndexOf(Object obj) {
        int i2;
        int i3;
        int c2 = c(this.f158647a + size());
        int i4 = this.f158647a;
        if (i4 < c2) {
            i2 = c2 - 1;
            if (i2 < i4) {
                return -1;
            }
            while (!l.a(obj, this.f158648b[i2])) {
                if (i2 == i4) {
                    return -1;
                }
                i2--;
            }
            i3 = this.f158647a;
        } else if (i4 <= c2) {
            return -1;
        } else {
            int i5 = c2 - 1;
            while (true) {
                if (i5 < 0) {
                    i2 = i.i(this.f158648b);
                    int i6 = this.f158647a;
                    if (i2 < i6) {
                        return -1;
                    }
                    while (!l.a(obj, this.f158648b[i2])) {
                        if (i2 == i6) {
                            return -1;
                        }
                        i2--;
                    }
                    i3 = this.f158647a;
                } else if (l.a(obj, this.f158648b[i5])) {
                    i2 = i5 + this.f158648b.length;
                    i3 = this.f158647a;
                    break;
                } else {
                    i5--;
                }
            }
        }
        return i2 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2 = tArr;
        l.d(tArr2, "");
        if (tArr2.length < size()) {
            int size = size();
            l.d(tArr2, "");
            Object newInstance = Array.newInstance(tArr2.getClass().getComponentType(), size);
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<T>");
            tArr2 = (T[]) ((Object[]) newInstance);
        }
        Objects.requireNonNull(tArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int c2 = c(this.f158647a + size());
        int i2 = this.f158647a;
        if (i2 < c2) {
            i.a(this.f158648b, tArr2, 0, i2, c2, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f158648b;
            i.a(objArr, tArr2, 0, this.f158647a, objArr.length);
            Object[] objArr2 = this.f158648b;
            i.a(objArr2, tArr2, objArr2.length - this.f158647a, 0, c2);
        }
        if (tArr2.length > size()) {
            tArr2[size()] = null;
        }
        Objects.requireNonNull(tArr2, "null cannot be cast to non-null type kotlin.Array<T>");
        return tArr2;
    }

    @Override // h.a.e
    public final E a(int i2) {
        d.a.a(i2, size());
        if (i2 == n.a((List) this)) {
            if (!isEmpty()) {
                int c2 = c(this.f158647a + n.a((List) this));
                Object[] objArr = this.f158648b;
                E e2 = (E) objArr[c2];
                objArr[c2] = null;
                this.f158649c = size() - 1;
                return e2;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i2 == 0) {
            return b();
        } else {
            int c3 = c(this.f158647a + i2);
            E e3 = (E) this.f158648b[c3];
            if (i2 < (size() >> 1)) {
                int i3 = this.f158647a;
                if (c3 >= i3) {
                    Object[] objArr2 = this.f158648b;
                    i.a(objArr2, objArr2, i3 + 1, i3, c3);
                } else {
                    Object[] objArr3 = this.f158648b;
                    i.a(objArr3, objArr3, 1, 0, c3);
                    Object[] objArr4 = this.f158648b;
                    objArr4[0] = objArr4[objArr4.length - 1];
                    int i4 = this.f158647a;
                    i.a(objArr4, objArr4, i4 + 1, i4, objArr4.length - 1);
                }
                Object[] objArr5 = this.f158648b;
                int i5 = this.f158647a;
                objArr5[i5] = null;
                this.f158647a = e(i5);
            } else {
                int c4 = c(this.f158647a + n.a((List) this));
                if (c3 <= c4) {
                    Object[] objArr6 = this.f158648b;
                    i.a(objArr6, objArr6, c3, c3 + 1, c4 + 1);
                } else {
                    Object[] objArr7 = this.f158648b;
                    i.a(objArr7, objArr7, c3, c3 + 1, objArr7.length);
                    Object[] objArr8 = this.f158648b;
                    objArr8[objArr8.length - 1] = objArr8[0];
                    i.a(objArr8, objArr8, 0, 1, c4 + 1);
                }
                this.f158648b[c4] = null;
            }
            this.f158649c = size() - 1;
            return e3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i2;
        l.d(collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f158648b.length != 0) {
            int c2 = c(this.f158647a + size());
            int i3 = this.f158647a;
            if (i3 < c2) {
                i2 = i3;
                while (i3 < c2) {
                    Object obj = this.f158648b[i3];
                    if (!collection.contains(obj)) {
                        this.f158648b[i2] = obj;
                        i2++;
                    } else {
                        z = true;
                    }
                    i3++;
                }
                i.a(this.f158648b, i2, c2);
            } else {
                int length = this.f158648b.length;
                int i4 = i3;
                boolean z2 = false;
                while (i3 < length) {
                    Object[] objArr = this.f158648b;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (!collection.contains(obj2)) {
                        this.f158648b[i4] = obj2;
                        i4++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                i2 = c(i4);
                for (int i5 = 0; i5 < c2; i5++) {
                    Object[] objArr2 = this.f158648b;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (!collection.contains(obj3)) {
                        this.f158648b[i2] = obj3;
                        i2 = e(i2);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f158649c = d(i2 - this.f158647a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i2;
        l.d(collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f158648b.length != 0) {
            int c2 = c(this.f158647a + size());
            int i3 = this.f158647a;
            if (i3 < c2) {
                i2 = i3;
                while (i3 < c2) {
                    Object obj = this.f158648b[i3];
                    if (collection.contains(obj)) {
                        this.f158648b[i2] = obj;
                        i2++;
                    } else {
                        z = true;
                    }
                    i3++;
                }
                i.a(this.f158648b, i2, c2);
            } else {
                int length = this.f158648b.length;
                int i4 = i3;
                boolean z2 = false;
                while (i3 < length) {
                    Object[] objArr = this.f158648b;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f158648b[i4] = obj2;
                        i4++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                i2 = c(i4);
                for (int i5 = 0; i5 < c2; i5++) {
                    Object[] objArr2 = this.f158648b;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        this.f158648b[i2] = obj3;
                        i2 = e(i2);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f158649c = d(i2 - this.f158647a);
            }
        }
        return z;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E set(int i2, E e2) {
        d.a.a(i2, size());
        int c2 = c(this.f158647a + i2);
        Object[] objArr = this.f158648b;
        E e3 = (E) objArr[c2];
        objArr[c2] = e2;
        return e3;
    }

    private final void a(int i2, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f158648b.length;
        while (i2 < length && it.hasNext()) {
            this.f158648b[i2] = it.next();
            i2++;
        }
        int i3 = this.f158647a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f158648b[i4] = it.next();
        }
        this.f158649c = size() + collection.size();
    }

    @Override // java.util.List, java.util.AbstractList
    public final void add(int i2, E e2) {
        d.a.b(i2, size());
        if (i2 == size()) {
            b(e2);
        } else if (i2 == 0) {
            a(e2);
        } else {
            b(size() + 1);
            int c2 = c(this.f158647a + i2);
            if (i2 < ((size() + 1) >> 1)) {
                int f2 = f(c2);
                int f3 = f(this.f158647a);
                int i3 = this.f158647a;
                if (f2 >= i3) {
                    Object[] objArr = this.f158648b;
                    objArr[f3] = objArr[i3];
                    i.a(objArr, objArr, i3, i3 + 1, f2 + 1);
                } else {
                    Object[] objArr2 = this.f158648b;
                    i.a(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                    Object[] objArr3 = this.f158648b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    i.a(objArr3, objArr3, 0, 1, f2 + 1);
                }
                this.f158648b[f2] = e2;
                this.f158647a = f3;
            } else {
                int c3 = c(this.f158647a + size());
                if (c2 < c3) {
                    Object[] objArr4 = this.f158648b;
                    i.a(objArr4, objArr4, c2 + 1, c2, c3);
                } else {
                    Object[] objArr5 = this.f158648b;
                    i.a(objArr5, objArr5, 1, 0, c3);
                    Object[] objArr6 = this.f158648b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    i.a(objArr6, objArr6, c2 + 1, c2, objArr6.length - 1);
                }
                this.f158648b[c2] = e2;
            }
            this.f158649c = size() + 1;
        }
    }

    @Override // java.util.List, java.util.AbstractList
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        l.d(collection, "");
        d.a.b(i2, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == size()) {
            return addAll(collection);
        }
        b(size() + collection.size());
        int c2 = c(this.f158647a + size());
        int c3 = c(this.f158647a + i2);
        int size = collection.size();
        if (i2 < ((size() + 1) >> 1)) {
            int i3 = this.f158647a;
            int i4 = i3 - size;
            if (c3 < i3) {
                Object[] objArr = this.f158648b;
                i.a(objArr, objArr, i4, i3, objArr.length);
                if (size >= c3) {
                    Object[] objArr2 = this.f158648b;
                    i.a(objArr2, objArr2, objArr2.length - size, 0, c3);
                } else {
                    Object[] objArr3 = this.f158648b;
                    i.a(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f158648b;
                    i.a(objArr4, objArr4, 0, size, c3);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.f158648b;
                i.a(objArr5, objArr5, i4, i3, c3);
            } else {
                Object[] objArr6 = this.f158648b;
                i4 += objArr6.length;
                int i5 = c3 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    i.a(objArr6, objArr6, i4, i3, c3);
                } else {
                    i.a(objArr6, objArr6, i4, i3, i3 + length);
                    Object[] objArr7 = this.f158648b;
                    i.a(objArr7, objArr7, 0, this.f158647a + length, c3);
                }
            }
            this.f158647a = i4;
            a(d(c3 - size), collection);
        } else {
            int i6 = c3 + size;
            if (c3 < c2) {
                int i7 = size + c2;
                Object[] objArr8 = this.f158648b;
                if (i7 <= objArr8.length) {
                    i.a(objArr8, objArr8, i6, c3, c2);
                } else if (i6 >= objArr8.length) {
                    i.a(objArr8, objArr8, i6 - objArr8.length, c3, c2);
                } else {
                    int length2 = c2 - (i7 - objArr8.length);
                    i.a(objArr8, objArr8, 0, length2, c2);
                    Object[] objArr9 = this.f158648b;
                    i.a(objArr9, objArr9, i6, c3, length2);
                }
            } else {
                Object[] objArr10 = this.f158648b;
                i.a(objArr10, objArr10, size, 0, c2);
                Object[] objArr11 = this.f158648b;
                if (i6 >= objArr11.length) {
                    i.a(objArr11, objArr11, i6 - objArr11.length, c3, objArr11.length);
                } else {
                    i.a(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f158648b;
                    i.a(objArr12, objArr12, i6, c3, objArr12.length - size);
                }
            }
            a(c3, collection);
        }
        return true;
    }
}
