package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

final class hz<T> implements in<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ht f51003a;

    /* renamed from: b  reason: collision with root package name */
    private final je<?, ?> f51004b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f51005c;

    /* renamed from: d  reason: collision with root package name */
    private final ga<?> f51006d;

    static {
        Covode.recordClassIndex(31865);
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final T a() {
        return (T) this.f51003a.o().v();
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final void c(T t) {
        this.f51004b.d(t);
        this.f51006d.c(t);
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final boolean d(T t) {
        return this.f51006d.a((Object) t).c();
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final int a(T t) {
        int hashCode = this.f51004b.b(t).hashCode();
        if (this.f51005c) {
            return (hashCode * 53) + this.f51006d.a((Object) t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final int b(T t) {
        je<?, ?> jeVar = this.f51004b;
        int e2 = jeVar.e(jeVar.b(t)) + 0;
        if (!this.f51005c) {
            return e2;
        }
        gb<?> a2 = this.f51006d.a((Object) t);
        int i2 = 0;
        for (int i3 = 0; i3 < a2.f50902a.b(); i3++) {
            i2 += gb.a((Map.Entry) a2.f50902a.b(i3));
        }
        for (Map.Entry<T, Object> entry : a2.f50902a.c()) {
            i2 += gb.a((Map.Entry) entry);
        }
        return e2 + i2;
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final void b(T t, T t2) {
        ip.a(this.f51004b, t, t2);
        if (this.f51005c) {
            ip.a(this.f51006d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final boolean a(T t, T t2) {
        if (!this.f51004b.b(t).equals(this.f51004b.b(t2))) {
            return false;
        }
        if (this.f51005c) {
            return this.f51006d.a((Object) t).equals(this.f51006d.a((Object) t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final void a(T t, jw jwVar) {
        Iterator<Map.Entry<?, Object>> b2 = this.f51006d.a((Object) t).b();
        while (b2.hasNext()) {
            Map.Entry<?, Object> next = b2.next();
            gd gdVar = (gd) next.getKey();
            if (gdVar.c() != jx.MESSAGE || gdVar.d() || gdVar.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof ha) {
                jwVar.a(gdVar.a(), (Object) ((ha) next).f50966a.getValue().b());
            } else {
                jwVar.a(gdVar.a(), next.getValue());
            }
        }
        je<?, ?> jeVar = this.f51004b;
        jeVar.b(jeVar.b(t), jwVar);
    }

    static <T> hz<T> a(je<?, ?> jeVar, ga<?> gaVar, ht htVar) {
        return new hz<>(jeVar, gaVar, htVar);
    }

    private hz(je<?, ?> jeVar, ga<?> gaVar, ht htVar) {
        this.f51004b = jeVar;
        this.f51005c = gaVar.a(htVar);
        this.f51006d = gaVar;
        this.f51003a = htVar;
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final void a(T t, ij ijVar, fy fyVar) {
        boolean z;
        je<?, ?> jeVar = this.f51004b;
        ga<?> gaVar = this.f51006d;
        Object c2 = jeVar.c(t);
        gaVar.b((Object) t);
        while (ijVar.a() != Integer.MAX_VALUE) {
            try {
                int b2 = ijVar.b();
                if (b2 != 11) {
                    if ((b2 & 7) != 2) {
                        z = ijVar.c();
                    } else if (gaVar.a(fyVar, this.f51003a, b2 >>> 3) != null) {
                        gaVar.b();
                    } else {
                        z = jeVar.a(c2, ijVar);
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    int i2 = 0;
                    Object obj = null;
                    fe feVar = null;
                    while (ijVar.a() != Integer.MAX_VALUE) {
                        int b3 = ijVar.b();
                        if (b3 == 16) {
                            i2 = ijVar.o();
                            obj = gaVar.a(fyVar, this.f51003a, i2);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                gaVar.b();
                            } else {
                                feVar = ijVar.n();
                            }
                        } else if (!ijVar.c()) {
                            break;
                        }
                    }
                    if (ijVar.b() != 12) {
                        throw gu.e();
                    } else if (feVar != null) {
                        if (obj != null) {
                            gaVar.c();
                        } else {
                            jeVar.a(c2, i2, feVar);
                        }
                    }
                }
            } finally {
                jeVar.b(t, c2);
            }
        }
        jeVar.b(t, c2);
    }

    @Override // com.google.android.gms.internal.measurement.in
    public final void a(T t, byte[] bArr, int i2, int i3, ez ezVar) {
        int i4 = i2;
        T t2 = t;
        jd jdVar = t2.zzb;
        if (jdVar == jd.f51055a) {
            jdVar = new jd();
            t2.zzb = jdVar;
        }
        t.a();
        Object obj = null;
        while (i4 < i3) {
            i4 = fa.a(bArr, i4, ezVar);
            int i5 = ezVar.f50832a;
            if (i5 == 11) {
                int i6 = 0;
                Object obj2 = null;
                while (i4 < i3) {
                    i4 = fa.a(bArr, i4, ezVar);
                    int i7 = ezVar.f50832a;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            if (obj != null) {
                                throw new NoSuchMethodError();
                            } else if (i9 == 2) {
                                i4 = fa.e(bArr, i4, ezVar);
                                obj2 = ezVar.f50834c;
                            }
                        }
                    } else if (i9 == 0) {
                        i4 = fa.a(bArr, i4, ezVar);
                        i6 = ezVar.f50832a;
                        obj = this.f51006d.a(ezVar.f50835d, this.f51003a, i6);
                    }
                    if (i7 == 12) {
                        break;
                    }
                    i4 = fa.a(i7, bArr, i4, i3, ezVar);
                }
                if (obj2 != null) {
                    jdVar.a((i6 << 3) | 2, obj2);
                }
            } else if ((i5 & 7) == 2) {
                obj = this.f51006d.a(ezVar.f50835d, this.f51003a, i5 >>> 3);
                if (obj == null) {
                    i4 = fa.a(i5, bArr, i4, i3, jdVar, ezVar);
                } else {
                    throw new NoSuchMethodError();
                }
            } else {
                i4 = fa.a(i5, bArr, i4, i3, ezVar);
            }
        }
        if (i4 != i3) {
            throw gu.g();
        }
    }
}
