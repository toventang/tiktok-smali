package com.airbnb.epoxy;

import com.airbnb.epoxy.n;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class s<T> {

    /* renamed from: h  reason: collision with root package name */
    private static long f5076h = -1;

    /* renamed from: a  reason: collision with root package name */
    public long f5077a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5078b;

    /* renamed from: c  reason: collision with root package name */
    boolean f5079c;

    /* renamed from: d  reason: collision with root package name */
    n f5080d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5081e;

    /* renamed from: f  reason: collision with root package name */
    public int f5082f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5083g;

    /* renamed from: i  reason: collision with root package name */
    private int f5084i;

    /* renamed from: j  reason: collision with root package name */
    private n f5085j;

    /* renamed from: k  reason: collision with root package name */
    private a f5086k;

    public interface a {
        static {
            Covode.recordClassIndex(2149);
        }

        int a();
    }

    public void a(T t) {
    }

    /* access modifiers changed from: protected */
    public abstract int b();

    public void b(T t) {
    }

    public boolean c(T t) {
        return false;
    }

    public int f() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return c();
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (this.f5085j != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(2147);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s() {
        /*
            r6 = this;
            long r4 = com.airbnb.epoxy.s.f5076h
            r2 = 1
            long r0 = r4 - r2
            com.airbnb.epoxy.s.f5076h = r0
            r6.<init>(r4)
            r0 = 1
            r6.f5083g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.s.<init>():void");
    }

    public final int c() {
        int i2 = this.f5084i;
        if (i2 == 0) {
            return b();
        }
        return i2;
    }

    public final int g() {
        a aVar = this.f5086k;
        if (aVar != null) {
            return aVar.a();
        }
        return f();
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (!d() || this.f5081e) {
            n nVar = this.f5080d;
            if (nVar != null) {
                nVar.setStagedModel(this);
                return;
            }
            return;
        }
        throw new z(this, a(this.f5085j, (s<?>) this));
    }

    public int hashCode() {
        long j2 = this.f5077a;
        return (((((int) (j2 ^ (j2 >>> 32))) * 31) + c()) * 31) + (this.f5078b ? 1 : 0);
    }

    public String toString() {
        return getClass().getSimpleName() + "{id=" + this.f5077a + ", viewType=" + c() + ", shown=" + this.f5078b + ", addedToAdapter=" + this.f5079c + '}';
    }

    public void a(n nVar) {
        nVar.addInternal(this);
    }

    public s<T> a(int i2) {
        e();
        this.f5084i = i2;
        return this;
    }

    private s(long j2) {
        this.f5078b = true;
        a(j2);
    }

    public s<T> a(long j2) {
        if ((this.f5079c || this.f5085j != null) && j2 != this.f5077a) {
            throw new y("Cannot change a model's id after it has been added to the adapter.");
        }
        this.f5083g = false;
        this.f5077a = j2;
        return this;
    }

    /* access modifiers changed from: protected */
    public final void b(n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        } else if (nVar.isModelAddedMultipleTimes(this)) {
            throw new y("This model was already added to the controller at position " + nVar.getFirstIndexOfModelInBuildingList(this));
        } else if (this.f5085j == null) {
            this.f5085j = nVar;
            this.f5082f = hashCode();
            nVar.addAfterInterceptorCallback(new n.c() {
                /* class com.airbnb.epoxy.s.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(2148);
                }

                @Override // com.airbnb.epoxy.n.c
                public final void a() {
                    s.this.f5081e = true;
                }

                @Override // com.airbnb.epoxy.n.c
                public final void b() {
                    s sVar = s.this;
                    sVar.f5082f = sVar.hashCode();
                    s.this.f5081e = false;
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f5077a == sVar.f5077a && c() == sVar.c() && this.f5078b == sVar.f5078b) {
            return true;
        }
        return false;
    }

    public s<T> a(CharSequence charSequence) {
        long j2;
        if (charSequence == null) {
            j2 = 0;
        } else {
            j2 = -3750763034362895579L;
            int length = charSequence.length();
            for (int i2 = 0; i2 < length; i2++) {
                j2 = (j2 ^ ((long) charSequence.charAt(i2))) * 1099511628211L;
            }
        }
        a(j2);
        return this;
    }

    private static int a(n nVar, s<?> sVar) {
        if (nVar.isBuildingModels()) {
            return nVar.getFirstIndexOfModelInBuildingList(sVar);
        }
        return nVar.getAdapter().a(sVar);
    }

    public void a(T t, s<?> sVar) {
        a((Object) t);
    }

    public void a(T t, List<Object> list) {
        a((Object) t);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, int i2) {
        if (d() && !this.f5081e && this.f5082f != hashCode()) {
            throw new z(this, str, i2);
        }
    }
}
