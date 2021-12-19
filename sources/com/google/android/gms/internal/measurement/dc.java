package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

final class dc extends dd<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ da f50766a;

    static {
        Covode.recordClassIndex(31723);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dc(da daVar) {
        super(daVar, (byte) 0);
        this.f50766a = daVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dd
    public final /* synthetic */ Object a(int i2) {
        return new df(this.f50766a, i2);
    }
}
