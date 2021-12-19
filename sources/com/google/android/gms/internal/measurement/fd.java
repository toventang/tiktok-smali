package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class fd extends ff {

    /* renamed from: a  reason: collision with root package name */
    private int f50856a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50857b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fe f50858c;

    static {
        Covode.recordClassIndex(31781);
    }

    public final boolean hasNext() {
        if (this.f50856a < this.f50857b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.fj
    public final byte a() {
        int i2 = this.f50856a;
        if (i2 < this.f50857b) {
            this.f50856a = i2 + 1;
            return this.f50858c.a(i2);
        }
        throw new NoSuchElementException();
    }

    fd(fe feVar) {
        this.f50858c = feVar;
        this.f50857b = feVar.zza();
    }
}
