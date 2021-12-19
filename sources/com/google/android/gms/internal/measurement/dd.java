package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public abstract class dd<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private int f50767a;

    /* renamed from: b  reason: collision with root package name */
    private int f50768b;

    /* renamed from: c  reason: collision with root package name */
    private int f50769c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ da f50770d;

    static {
        Covode.recordClassIndex(31724);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(int i2);

    public boolean hasNext() {
        if (this.f50768b >= 0) {
            return true;
        }
        return false;
    }

    private final void a() {
        if (this.f50770d.f50760f != this.f50767a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public T next() {
        a();
        if (hasNext()) {
            int i2 = this.f50768b;
            this.f50769c = i2;
            T a2 = a(i2);
            this.f50768b = this.f50770d.a(this.f50768b);
            return a2;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        boolean z;
        a();
        if (this.f50769c >= 0) {
            z = true;
        } else {
            z = false;
        }
        cl.b(z, "no calls to next() since the last call to remove()");
        this.f50767a += 32;
        da daVar = this.f50770d;
        daVar.remove(daVar.f50758d[this.f50769c]);
        this.f50768b--;
        this.f50769c = -1;
    }

    private dd(da daVar) {
        this.f50770d = daVar;
        this.f50767a = daVar.f50760f;
        this.f50768b = daVar.e();
        this.f50769c = -1;
    }

    /* synthetic */ dd(da daVar, byte b2) {
        this(daVar);
    }
}
