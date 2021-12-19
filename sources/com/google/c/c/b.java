package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.util.NoSuchElementException;

public abstract class b<T> extends br<T> {

    /* renamed from: a  reason: collision with root package name */
    private a f53968a = a.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f53969b;

    static {
        Covode.recordClassIndex(33455);
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    protected b() {
    }

    /* access modifiers changed from: protected */
    public final T b() {
        this.f53968a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f53968a = a.NOT_READY;
            T t = this.f53969b;
            this.f53969b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.c.b$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53970a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 33456(0x82b0, float:4.6882E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.c.c.b$a[] r0 = com.google.c.c.b.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.google.c.c.b.AnonymousClass1.f53970a = r2
                com.google.c.c.b$a r0 = com.google.c.c.b.a.DONE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.google.c.c.b.AnonymousClass1.f53970a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.c.c.b$a r0 = com.google.c.c.b.a.READY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.c.c.b.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        static {
            Covode.recordClassIndex(33457);
        }
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f53968a != a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        k.b(z);
        int i2 = AnonymousClass1.f53970a[this.f53968a.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        this.f53968a = a.FAILED;
        this.f53969b = a();
        if (this.f53968a == a.DONE) {
            return false;
        }
        this.f53968a = a.READY;
        return true;
    }
}
