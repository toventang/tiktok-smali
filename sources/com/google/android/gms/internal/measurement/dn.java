package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
public final class dn<E> extends dl<E> {

    /* renamed from: a  reason: collision with root package name */
    private final transient dl<E> f50780a;

    static {
        Covode.recordClassIndex(31734);
    }

    @Override // com.google.android.gms.internal.measurement.dl
    public final dl<E> zzd() {
        return this.f50780a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean d() {
        return this.f50780a.d();
    }

    public final int size() {
        return this.f50780a.size();
    }

    dn(dl<E> dlVar) {
        this.f50780a = dlVar;
    }

    private final int a(int i2) {
        return (size() - 1) - i2;
    }

    @Override // com.google.android.gms.internal.measurement.dl, com.google.android.gms.internal.measurement.dm
    public final boolean contains(Object obj) {
        return this.f50780a.contains(obj);
    }

    @Override // com.google.android.gms.internal.measurement.dl
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f50780a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return a(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.dl
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f50780a.indexOf(obj);
        if (indexOf >= 0) {
            return a(indexOf);
        }
        return -1;
    }

    @Override // java.util.List
    public final E get(int i2) {
        cl.a(i2, size());
        return this.f50780a.get(a(i2));
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.dl
    public final /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.dl
    public final dl<E> zza(int i2, int i3) {
        cl.a(i2, i3, size());
        return ((dl) this.f50780a.subList(size() - i3, size() - i2)).zzd();
    }
}
