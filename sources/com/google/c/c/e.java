package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.c.au;
import com.google.c.c.av;
import com.google.c.f.a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

abstract class e<E> extends h<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    transient ay<E> f54042a;

    /* renamed from: b  reason: collision with root package name */
    transient long f54043b;

    static {
        Covode.recordClassIndex(33504);
    }

    @Override // com.google.c.c.au
    public final int size() {
        return a.a(this.f54043b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new av.e(this, entrySet().iterator());
    }

    @Override // com.google.c.c.h
    public final void clear() {
        ay<E> ayVar = this.f54042a;
        ayVar.f53960d++;
        Arrays.fill(ayVar.f53957a, 0, ayVar.f53959c, (Object) null);
        Arrays.fill(ayVar.f53958b, 0, ayVar.f53959c, 0);
        Arrays.fill(ayVar.f53961e, -1);
        Arrays.fill(ayVar.f53962f, -1L);
        ayVar.f53959c = 0;
        this.f54043b = 0;
    }

    @Override // com.google.c.c.au
    public final int count(Object obj) {
        return this.f54042a.b(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.c.e<E> */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(entrySet().size());
        for (au.a<E> aVar : entrySet()) {
            objectOutputStream.writeObject(aVar.a());
            objectOutputStream.writeInt(aVar.b());
        }
    }

    @Override // com.google.c.c.au, com.google.c.c.h
    public final int setCount(E e2, int i2) {
        int a2;
        k.a(i2, "count");
        ay<E> ayVar = this.f54042a;
        if (i2 == 0) {
            a2 = ayVar.b(e2, w.a(e2));
        } else {
            a2 = ayVar.a(e2, i2);
        }
        this.f54043b += (long) (i2 - a2);
        return a2;
    }

    @Override // com.google.c.c.au, com.google.c.c.h
    public final int remove(Object obj, int i2) {
        boolean z;
        if (i2 == 0) {
            return count(obj);
        }
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        k.a(z, "occurrences cannot be negative: %s", i2);
        int a2 = this.f54042a.a(obj);
        if (a2 == -1) {
            return 0;
        }
        int c2 = this.f54042a.c(a2);
        if (c2 > i2) {
            this.f54042a.a(a2, c2 - i2);
        } else {
            this.f54042a.e(a2);
            i2 = c2;
        }
        this.f54043b -= (long) i2;
        return c2;
    }

    @Override // com.google.c.c.au, com.google.c.c.h
    public final int add(E e2, int i2) {
        boolean z;
        if (i2 == 0) {
            return count(e2);
        }
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        k.a(z, "occurrences cannot be negative: %s", i2);
        int a2 = this.f54042a.a(e2);
        if (a2 == -1) {
            this.f54042a.a(e2, i2);
            this.f54043b += (long) i2;
            return 0;
        }
        int c2 = this.f54042a.c(a2);
        long j2 = (long) i2;
        long j3 = ((long) c2) + j2;
        if (j3 <= 2147483647L) {
            this.f54042a.a(a2, (int) j3);
            this.f54043b += j2;
            return c2;
        }
        throw new IllegalArgumentException(k.a("too many occurrences: %s", Long.valueOf(j3)));
    }

    @Override // com.google.c.c.au, com.google.c.c.h
    public final boolean setCount(E e2, int i2, int i3) {
        k.a(i2, "oldCount");
        k.a(i3, "newCount");
        int a2 = this.f54042a.a(e2);
        if (a2 == -1) {
            if (i2 != 0) {
                return false;
            }
            if (i3 > 0) {
                this.f54042a.a(e2, i3);
                this.f54043b += (long) i3;
            }
            return true;
        } else if (this.f54042a.c(a2) != i2) {
            return false;
        } else {
            if (i3 == 0) {
                this.f54042a.e(a2);
                this.f54043b -= (long) i2;
            } else {
                this.f54042a.a(a2, i3);
                this.f54043b += (long) (i3 - i2);
            }
            return true;
        }
    }
}
