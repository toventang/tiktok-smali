package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final class fh extends fp {
    private final int zzc;
    private final int zzd;

    static {
        Covode.recordClassIndex(31785);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.fp
    public final int a() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.fe, com.google.android.gms.internal.measurement.fp
    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.fe, com.google.android.gms.internal.measurement.fp
    public final byte a(int i2) {
        return this.zzb[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.measurement.fe, com.google.android.gms.internal.measurement.fp
    public final byte zza(int i2) {
        int zza = zza();
        if (((zza - (i2 + 1)) | i2) >= 0) {
            return this.zzb[this.zzc + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(22).append("Index < 0: ").append(i2).toString());
        }
        throw new ArrayIndexOutOfBoundsException(new StringBuilder(40).append("Index > length: ").append(i2).append(", ").append(zza).toString());
    }

    fh(byte[] bArr, int i2, int i3) {
        super(bArr);
        a(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }
}
