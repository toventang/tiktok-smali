package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

final class iw implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f51042a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f51043b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f51044c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ io f51045d;

    static {
        Covode.recordClassIndex(31889);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f51044c == null) {
            this.f51044c = this.f51045d.f51026b.entrySet().iterator();
        }
        return this.f51044c;
    }

    public final boolean hasNext() {
        if (this.f51042a + 1 < this.f51045d.f51025a.size() || (!this.f51045d.f51026b.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f51043b = true;
        int i2 = this.f51042a + 1;
        this.f51042a = i2;
        if (i2 < this.f51045d.f51025a.size()) {
            return this.f51045d.f51025a.get(this.f51042a);
        }
        return a().next();
    }

    public final void remove() {
        if (this.f51043b) {
            this.f51043b = false;
            this.f51045d.e();
            if (this.f51042a < this.f51045d.f51025a.size()) {
                io ioVar = this.f51045d;
                int i2 = this.f51042a;
                this.f51042a = i2 - 1;
                ioVar.c(i2);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private iw(io ioVar) {
        this.f51045d = ioVar;
        this.f51042a = -1;
    }

    /* synthetic */ iw(io ioVar, byte b2) {
        this(ioVar);
    }
}
