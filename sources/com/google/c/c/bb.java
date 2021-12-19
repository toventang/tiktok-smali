package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;

/* access modifiers changed from: package-private */
public final class bb<E> extends z<E> {

    /* renamed from: a  reason: collision with root package name */
    static final z<Object> f53976a = new bb(new Object[0], 0);

    /* renamed from: b  reason: collision with root package name */
    final transient Object[] f53977b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f53978c;

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final boolean a() {
        return false;
    }

    public final int size() {
        return this.f53978c;
    }

    static {
        Covode.recordClassIndex(33459);
    }

    @Override // java.util.List
    public final E get(int i2) {
        k.a(i2, this.f53978c);
        return (E) this.f53977b[i2];
    }

    bb(Object[] objArr, int i2) {
        this.f53977b = objArr;
        this.f53978c = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.z, com.google.c.c.x
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f53977b, 0, objArr, i2, this.f53978c);
        return i2 + this.f53978c;
    }
}
