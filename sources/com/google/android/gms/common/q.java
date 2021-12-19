package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class q extends n {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f50456a;

    static {
        Covode.recordClassIndex(31446);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.n
    public final byte[] c() {
        return this.f50456a;
    }

    q(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f50456a = bArr;
    }
}
