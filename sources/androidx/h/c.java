package androidx.h;

import androidx.h.h;
import androidx.h.i;
import androidx.h.k;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class c<K, V> extends i<V> implements k.a {

    /* renamed from: a  reason: collision with root package name */
    public final b<K, V> f3079a;

    /* renamed from: b  reason: collision with root package name */
    public h.a<V> f3080b = new h.a<V>() {
        /* class androidx.h.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1098);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
            if (r12.f3133c.size() == 0) goto L_0x0081;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0166  */
        @Override // androidx.h.h.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r11, androidx.h.h<V> r12) {
            /*
            // Method dump skipped, instructions count: 382
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.h.c.AnonymousClass1.a(int, androidx.h.h):void");
        }
    };
    private boolean n = false;
    private boolean o = false;
    private int p = 0;
    private int q = 0;

    static {
        Covode.recordClassIndex(1097);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.i
    public final boolean a() {
        return true;
    }

    @Override // androidx.h.i
    public final d<?, V> b() {
        return this.f3079a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.h.b<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.h.i
    public final Object c() {
        return this.f3079a.a((V) this.f3145i);
    }

    private void h() {
        if (!this.n) {
            this.n = true;
            final int i2 = this.f3143g.f3175b + this.f3143g.f3178e;
            final Object c2 = this.f3143g.c();
            this.f3140d.execute(new Runnable() {
                /* class androidx.h.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(1099);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.h.b<K, V> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    if (!c.this.f()) {
                        if (c.this.f3079a.f3088a.get()) {
                            c.this.g();
                        } else {
                            c.this.f3079a.b(c2, c.this.f3142f.f3163a, c.this.f3139c, c.this.f3080b);
                        }
                    }
                }
            });
        }
    }

    private void i() {
        if (!this.o) {
            this.o = true;
            final int i2 = ((this.f3143g.f3175b + this.f3143g.f3179f) - 1) + this.f3143g.f3178e;
            final Object d2 = this.f3143g.d();
            this.f3140d.execute(new Runnable() {
                /* class androidx.h.c.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(1100);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.h.b<K, V> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    if (!c.this.f()) {
                        if (c.this.f3079a.f3088a.get()) {
                            c.this.g();
                        } else {
                            c.this.f3079a.a(d2, c.this.f3142f.f3163a, c.this.f3139c, c.this.f3080b);
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.h.k.a
    public final void b(int i2) {
        a(0, i2);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.h.i
    public final void a(int i2) {
        int i3 = this.f3142f.f3164b - (i2 - this.f3143g.f3175b);
        int i4 = (i2 + this.f3142f.f3164b) - (this.f3143g.f3175b + this.f3143g.f3179f);
        int max = Math.max(i3, this.p);
        this.p = max;
        if (max > 0) {
            h();
        }
        int max2 = Math.max(i4, this.q);
        this.q = max2;
        if (max2 > 0) {
            i();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.i
    public final void a(i<V> iVar, i.c cVar) {
        k<T> kVar = iVar.f3143g;
        int i2 = this.f3143g.f3182i - kVar.f3182i;
        int i3 = this.f3143g.f3181h - kVar.f3181h;
        int i4 = kVar.f3177d;
        int i5 = kVar.f3175b;
        if (kVar.isEmpty() || i2 < 0 || i3 < 0 || this.f3143g.f3177d != Math.max(i4 - i2, 0) || this.f3143g.f3175b != Math.max(i5 - i3, 0) || this.f3143g.f3179f != kVar.f3179f + i2 + i3) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i2 != 0) {
            int min = Math.min(i4, i2);
            int i6 = i2 - min;
            int i7 = kVar.f3175b + kVar.f3179f;
            if (min != 0) {
                cVar.b(i7, min);
            }
            if (i6 != 0) {
                cVar.a(i7 + min, i6);
            }
        }
        if (i3 != 0) {
            int min2 = Math.min(i5, i3);
            int i8 = i3 - min2;
            if (min2 != 0) {
                cVar.b(i5, min2);
            }
            if (i8 != 0) {
                cVar.a(0, i8);
            }
        }
    }

    @Override // androidx.h.k.a
    public final void b(int i2, int i3, int i4) {
        int i5 = (this.q - i3) - i4;
        this.q = i5;
        this.o = false;
        if (i5 > 0) {
            i();
        }
        b(i2, i3);
        a(i2 + i3, i4);
    }

    @Override // androidx.h.k.a
    public final void a(int i2, int i3, int i4) {
        int i5 = (this.p - i3) - i4;
        this.p = i5;
        this.n = false;
        if (i5 > 0) {
            h();
        }
        b(i2, i3);
        a(0, i4);
        this.f3144h += i4;
        this.f3148l += i4;
        this.f3149m += i4;
    }

    c(b<K, V> bVar, Executor executor, Executor executor2, i.a<V> aVar, i.d dVar, K k2, int i2) {
        super(new k(), executor, executor2, aVar, dVar);
        this.f3079a = bVar;
        this.f3144h = -1;
        if (bVar.f3088a.get()) {
            g();
        } else {
            bVar.a(k2, this.f3142f.f3166d, this.f3142f.f3165c, this.f3139c, this.f3080b);
        }
    }
}
