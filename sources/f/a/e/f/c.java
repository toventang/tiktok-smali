package f.a.e.f;

import com.bytedance.covode.number.Covode;
import f.a.e.c.h;
import f.a.e.j.m;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class c<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    static final int f157825a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j  reason: collision with root package name */
    private static final Object f157826j = new Object();

    /* renamed from: b  reason: collision with root package name */
    final AtomicLong f157827b = new AtomicLong();

    /* renamed from: c  reason: collision with root package name */
    int f157828c;

    /* renamed from: d  reason: collision with root package name */
    long f157829d;

    /* renamed from: e  reason: collision with root package name */
    final int f157830e;

    /* renamed from: f  reason: collision with root package name */
    AtomicReferenceArray<Object> f157831f;

    /* renamed from: g  reason: collision with root package name */
    final int f157832g;

    /* renamed from: h  reason: collision with root package name */
    AtomicReferenceArray<Object> f157833h;

    /* renamed from: i  reason: collision with root package name */
    final AtomicLong f157834i = new AtomicLong();

    @Override // f.a.e.c.i
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    static {
        Covode.recordClassIndex(104812);
    }

    @Override // f.a.e.c.i
    public final boolean isEmpty() {
        if (this.f157827b.get() == this.f157834i.get()) {
            return true;
        }
        return false;
    }

    @Override // f.a.e.c.h, f.a.e.c.i
    public final T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f157833h;
        long j2 = this.f157834i.get();
        int i2 = this.f157832g;
        int i3 = ((int) j2) & i2;
        T t = (T) atomicReferenceArray.get(i3);
        if (t == f157826j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null) {
            if (!z) {
                atomicReferenceArray.lazySet(i3, null);
                b(j2 + 1);
                return t;
            }
        } else if (!z) {
            return null;
        }
        int i4 = i2 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
        atomicReferenceArray.lazySet(i4, null);
        this.f157833h = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i3);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i3, null);
            b(j2 + 1);
        }
        return t2;
    }

    private void a(long j2) {
        this.f157827b.lazySet(j2);
    }

    private void b(long j2) {
        this.f157834i.lazySet(j2);
    }

    public c(int i2) {
        int a2 = m.a(Math.max(8, i2));
        int i3 = a2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a2 + 1);
        this.f157831f = atomicReferenceArray;
        this.f157830e = i3;
        this.f157828c = Math.min(a2 / 4, f157825a);
        this.f157833h = atomicReferenceArray;
        this.f157832g = i3;
        this.f157829d = (long) (i3 - 1);
        a(0);
    }

    @Override // f.a.e.c.i
    public final boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.f157831f;
        long j2 = this.f157827b.get();
        int i2 = this.f157830e;
        int i3 = ((int) j2) & i2;
        if (j2 < this.f157829d) {
            return a(atomicReferenceArray, t, j2, i3);
        }
        long j3 = ((long) this.f157828c) + j2;
        if (atomicReferenceArray.get(((int) j3) & i2) == null) {
            this.f157829d = j3 - 1;
            return a(atomicReferenceArray, t, j2, i3);
        }
        long j4 = j2 + 1;
        if (atomicReferenceArray.get(((int) j4) & i2) == null) {
            return a(atomicReferenceArray, t, j2, i3);
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f157831f = atomicReferenceArray2;
        this.f157829d = (j2 + ((long) i2)) - 1;
        atomicReferenceArray2.lazySet(i3, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, f157826j);
        a(j4);
        return true;
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        atomicReferenceArray.lazySet(i2, t);
        a(j2 + 1);
        return true;
    }
}
