package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

abstract class p extends n {

    /* renamed from: b  reason: collision with root package name */
    private static final WeakReference<byte[]> f50454b = new WeakReference<>(null);

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<byte[]> f50455a = f50454b;

    /* access modifiers changed from: protected */
    public abstract byte[] d();

    static {
        Covode.recordClassIndex(31445);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.n
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f50455a.get();
            if (bArr == null) {
                bArr = d();
                this.f50455a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    p(byte[] bArr) {
        super(bArr);
    }
}
