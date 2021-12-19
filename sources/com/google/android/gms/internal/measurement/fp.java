package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.util.Objects;

/* access modifiers changed from: package-private */
public class fp extends fm {
    protected final byte[] zzb;

    static {
        Covode.recordClassIndex(31793);
    }

    /* access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public final boolean zzc() {
        int a2 = a();
        return jm.a(this.zzb, a2, zza() + a2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.fe
    public byte a(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public byte zza(int i2) {
        return this.zzb[i2];
    }

    fp(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zzb = bArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.fe
    public final String a(Charset charset) {
        return new String(this.zzb, a(), zza(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.fe
    public final void a(fb fbVar) {
        fbVar.a(this.zzb, a(), zza());
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fe) || zza() != ((fe) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof fp)) {
            return obj.equals(this);
        }
        fe feVar = (fe) obj;
        int i2 = this.zzc;
        int i3 = feVar.zzc;
        if (i2 == 0 || i3 == 0 || i2 == i3) {
            return a(feVar, zza());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.fe
    public final int a(int i2, int i3) {
        return gp.a(i2, this.zzb, a(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public final fe zza(int i2, int i3) {
        int a2 = a(0, i3, zza());
        if (a2 == 0) {
            return fe.zza;
        }
        return new fh(this.zzb, a(), a2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.fm
    public final boolean a(fe feVar, int i2) {
        if (i2 > feVar.zza()) {
            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(i2).append(zza()).toString());
        } else if (i2 > feVar.zza()) {
            throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: 0, ").append(i2).append(", ").append(feVar.zza()).toString());
        } else if (!(feVar instanceof fp)) {
            return feVar.zza(0, i2).equals(zza(0, i2));
        } else {
            fp fpVar = (fp) feVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = fpVar.zzb;
            int a2 = a() + i2;
            int a3 = a();
            int a4 = fpVar.a();
            while (a3 < a2) {
                if (bArr[a3] != bArr2[a4]) {
                    return false;
                }
                a3++;
                a4++;
            }
            return true;
        }
    }
}
