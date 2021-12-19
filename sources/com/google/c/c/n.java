package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.i;
import com.google.c.a.k;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class n<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public transient long[] f54085a;

    /* renamed from: b  reason: collision with root package name */
    transient Object[] f54086b;

    /* renamed from: c  reason: collision with root package name */
    transient float f54087c;

    /* renamed from: d  reason: collision with root package name */
    transient int f54088d;

    /* renamed from: e  reason: collision with root package name */
    transient int f54089e;

    /* renamed from: f  reason: collision with root package name */
    private transient int[] f54090f;

    /* renamed from: g  reason: collision with root package name */
    private transient int f54091g;

    static {
        Covode.recordClassIndex(33528);
    }

    private static long a(long j2, int i2) {
        return (j2 & -4294967296L) | (((long) i2) & 4294967295L);
    }

    public final int size() {
        return this.f54089e;
    }

    n() {
        a();
    }

    public final boolean isEmpty() {
        if (this.f54089e == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new Iterator<E>() {
            /* class com.google.c.c.n.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            int f54092a;

            /* renamed from: b  reason: collision with root package name */
            int f54093b;

            /* renamed from: c  reason: collision with root package name */
            int f54094c;

            static {
                Covode.recordClassIndex(33529);
            }

            public final boolean hasNext() {
                if (this.f54093b >= 0) {
                    return true;
                }
                return false;
            }

            private void a() {
                if (n.this.f54088d != this.f54092a) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final E next() {
                a();
                if (hasNext()) {
                    this.f54094c = this.f54093b;
                    Object[] objArr = n.this.f54086b;
                    int i2 = this.f54093b;
                    E e2 = (E) objArr[i2];
                    int i3 = i2 + 1;
                    if (i3 >= n.this.f54089e) {
                        i3 = -1;
                    }
                    this.f54093b = i3;
                    return e2;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                boolean z;
                a();
                if (this.f54094c >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                k.b(z, "no calls to next() since the last call to remove()");
                this.f54092a++;
                n nVar = n.this;
                nVar.a(nVar.f54086b[this.f54094c], (int) (n.this.f54085a[this.f54094c] >>> 32));
                this.f54093b--;
                this.f54094c = -1;
            }

            {
                int i2;
                this.f54092a = n.this.f54088d;
                if (n.this.isEmpty()) {
                    i2 = -1;
                } else {
                    i2 = 0;
                }
                this.f54093b = i2;
                this.f54094c = -1;
            }
        };
    }

    private static long[] b() {
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public final Object[] toArray() {
        return Arrays.copyOf(this.f54086b, this.f54089e);
    }

    public final void clear() {
        this.f54088d++;
        Arrays.fill(this.f54086b, 0, this.f54089e, (Object) null);
        Arrays.fill(this.f54090f, -1);
        Arrays.fill(this.f54085a, -1L);
        this.f54089e = 0;
    }

    private void a() {
        k.a(true, (Object) "Initial capacity must be non-negative");
        k.a(true, (Object) "Illegal load factor");
        int a2 = w.a(3, 1.0d);
        this.f54090f = a(a2);
        this.f54087c = 1.0f;
        this.f54086b = new Object[3];
        this.f54085a = b();
        this.f54091g = Math.max(1, (int) (((float) a2) * 1.0f));
    }

    private static int[] a(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final boolean remove(Object obj) {
        return a(obj, w.a(obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.c.n<E> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        a();
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f54089e);
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr = this.f54086b;
        int i2 = this.f54089e;
        k.a(0, i2 + 0, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) ba.a(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i2);
        return tArr;
    }

    public final boolean contains(Object obj) {
        int a2 = w.a(obj);
        int[] iArr = this.f54090f;
        int i2 = iArr[(iArr.length - 1) & a2];
        while (i2 != -1) {
            long j2 = this.f54085a[i2];
            if (((int) (j2 >>> 32)) == a2 && i.a(obj, this.f54086b[i2])) {
                return true;
            }
            i2 = (int) j2;
        }
        return false;
    }

    private void b(int i2) {
        if (this.f54090f.length >= 1073741824) {
            this.f54091g = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (((float) i2) * this.f54087c)) + 1;
        int[] a2 = a(i2);
        long[] jArr = this.f54085a;
        int length = a2.length - 1;
        for (int i4 = 0; i4 < this.f54089e; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & length;
            int i7 = a2[i6];
            a2[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.f54091g = i3;
        this.f54090f = a2;
    }

    private void c(int i2) {
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.f54086b;
            objArr[i2] = objArr[size];
            objArr[size] = null;
            long[] jArr = this.f54085a;
            long j2 = jArr[size];
            jArr[i2] = j2;
            jArr[size] = -1;
            int[] iArr = this.f54090f;
            int length = ((int) (j2 >>> 32)) & (iArr.length - 1);
            int i3 = iArr[length];
            if (i3 == size) {
                iArr[length] = i2;
                return;
            }
            while (true) {
                long[] jArr2 = this.f54085a;
                long j3 = jArr2[i3];
                int i4 = (int) j3;
                if (i4 == size) {
                    jArr2[i3] = a(j3, i2);
                    return;
                }
                i3 = i4;
            }
        } else {
            this.f54086b[i2] = null;
            this.f54085a[i2] = -1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        long[] jArr = this.f54085a;
        Object[] objArr = this.f54086b;
        int a2 = w.a(e2);
        int[] iArr = this.f54090f;
        int length = (iArr.length - 1) & a2;
        int i2 = this.f54089e;
        int i3 = iArr[length];
        if (i3 == -1) {
            iArr[length] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (((int) (j2 >>> 32)) == a2 && i.a(e2, objArr[i3])) {
                    return false;
                }
                int i4 = (int) j2;
                if (i4 == -1) {
                    jArr[i3] = a(j2, i2);
                    break;
                }
                i3 = i4;
            }
        }
        int i5 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            int i6 = i2 + 1;
            int length2 = this.f54085a.length;
            if (i6 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max >= 0) {
                    i5 = max;
                }
                if (i5 != length2) {
                    this.f54086b = Arrays.copyOf(this.f54086b, i5);
                    long[] jArr2 = this.f54085a;
                    int length3 = jArr2.length;
                    long[] copyOf = Arrays.copyOf(jArr2, i5);
                    if (i5 > length3) {
                        Arrays.fill(copyOf, length3, i5, -1L);
                    }
                    this.f54085a = copyOf;
                }
            }
            this.f54085a[i2] = (((long) a2) << 32) | 4294967295L;
            this.f54086b[i2] = e2;
            this.f54089e = i6;
            if (i2 >= this.f54091g) {
                b(this.f54090f.length * 2);
            }
            this.f54088d++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public final boolean a(Object obj, int i2) {
        int[] iArr = this.f54090f;
        int length = (iArr.length - 1) & i2;
        int i3 = iArr[length];
        if (i3 == -1) {
            return false;
        }
        int i4 = -1;
        while (true) {
            if (((int) (this.f54085a[i3] >>> 32)) != i2 || !i.a(obj, this.f54086b[i3])) {
                int i5 = (int) this.f54085a[i3];
                if (i5 == -1) {
                    return false;
                }
                i4 = i3;
                i3 = i5;
            } else {
                if (i4 == -1) {
                    this.f54090f[length] = (int) this.f54085a[i3];
                } else {
                    long[] jArr = this.f54085a;
                    jArr[i4] = a(jArr[i4], (int) jArr[i3]);
                }
                c(i3);
                this.f54089e--;
                this.f54088d++;
                return true;
            }
        }
    }
}
