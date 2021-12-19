package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class it extends iy {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ io f51041a;

    static {
        Covode.recordClassIndex(31886);
    }

    @Override // com.google.android.gms.internal.measurement.iy, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new iq(this.f51041a, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private it(io ioVar) {
        super(ioVar, (byte) 0);
        this.f51041a = ioVar;
    }

    /* synthetic */ it(io ioVar, byte b2) {
        this(ioVar);
    }
}
