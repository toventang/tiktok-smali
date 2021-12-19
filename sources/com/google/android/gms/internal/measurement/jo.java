package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public abstract class jo {
    static {
        Covode.recordClassIndex(31912);
    }

    /* access modifiers changed from: package-private */
    public abstract int a(CharSequence charSequence, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract int a(byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract String b(byte[] bArr, int i2, int i3);

    jo() {
    }

    /* access modifiers changed from: package-private */
    public final boolean c(byte[] bArr, int i2, int i3) {
        if (a(bArr, i2, i3) == 0) {
            return true;
        }
        return false;
    }
}
