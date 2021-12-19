package com.google.c.c;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class be<E> extends ai<E> {

    /* renamed from: a  reason: collision with root package name */
    static final be<Object> f53996a = new be<>(new Object[0], 0, null, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    final transient Object[] f53997b;

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f53998c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f53999d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f54000e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f54001f;

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ai
    public final boolean c() {
        return true;
    }

    @Override // com.google.c.c.ai
    public final int hashCode() {
        return this.f54000e;
    }

    public final int size() {
        return this.f54001f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ai
    public final z<E> d() {
        return z.b(this.f53997b, this.f54001f);
    }

    @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
    public final br<E> iterator() {
        return asList().iterator();
    }

    static {
        Covode.recordClassIndex(33468);
    }

    @Override // com.google.c.c.x
    public final boolean contains(Object obj) {
        Object[] objArr = this.f53998c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = w.a(obj);
        while (true) {
            int i2 = a2 & this.f53999d;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f53997b, 0, objArr, i2, this.f54001f);
        return i2 + this.f54001f;
    }

    be(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f53997b = objArr;
        this.f53998c = objArr2;
        this.f53999d = i3;
        this.f54000e = i2;
        this.f54001f = i4;
    }
}
