package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class b<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private a f53676a = a.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f53677b;

    static {
        Covode.recordClassIndex(33231);
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    protected b() {
    }

    /* access modifiers changed from: protected */
    public final T b() {
        this.f53676a = a.DONE;
        return null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f53676a = a.NOT_READY;
            T t = this.f53677b;
            this.f53677b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.a.b$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53678a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 33232(0x81d0, float:4.6568E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.c.a.b$a[] r0 = com.google.c.a.b.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.google.c.a.b.AnonymousClass1.f53678a = r2
                com.google.c.a.b$a r0 = com.google.c.a.b.a.READY     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.google.c.a.b.AnonymousClass1.f53678a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.c.a.b$a r0 = com.google.c.a.b.a.DONE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.c.a.b.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        static {
            Covode.recordClassIndex(33233);
        }
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f53676a != a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        k.b(z);
        int i2 = AnonymousClass1.f53678a[this.f53676a.ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 != 2) {
            this.f53676a = a.FAILED;
            this.f53677b = a();
            if (this.f53676a != a.DONE) {
                this.f53676a = a.READY;
                return true;
            }
        }
        return false;
    }
}
