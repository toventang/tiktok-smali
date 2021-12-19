package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.do  reason: invalid class name */
final class Cdo<E> extends ct<E> {

    /* renamed from: a  reason: collision with root package name */
    private final dl<E> f50781a;

    static {
        Covode.recordClassIndex(31735);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.ct
    public final E a(int i2) {
        return this.f50781a.get(i2);
    }

    Cdo(dl<E> dlVar, int i2) {
        super(dlVar.size(), i2);
        this.f50781a = dlVar;
    }
}
