package com.google.android.gms.internal.measurement;

import com.a;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class fe implements Serializable, Iterable<Byte> {

    /* renamed from: a  reason: collision with root package name */
    private static final fk f50859a;

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<fe> f50860b = new fg();
    public static final fe zza = new fp(gp.f50958b);
    public int zzc;

    /* access modifiers changed from: package-private */
    public abstract byte a(int i2);

    /* access modifiers changed from: protected */
    public abstract int a(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void a(fb fbVar);

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i2);

    public abstract int zza();

    public abstract fe zza(int i2, int i3);

    public abstract boolean zzc();

    fe() {
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new fd(this);
    }

    public final String zzb() {
        Charset charset = gp.f50957a;
        if (zza() == 0) {
            return "";
        }
        return a(charset);
    }

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int zza2 = zza();
            i2 = a(zza2, zza2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    static {
        fk fiVar;
        Covode.recordClassIndex(31782);
        if (ex.a()) {
            fiVar = new fo((byte) 0);
        } else {
            fiVar = new fi((byte) 0);
        }
        f50859a = fiVar;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zza());
        if (zza() <= 50) {
            concat = ja.a(this);
        } else {
            concat = String.valueOf(ja.a(zza(0, 47))).concat("...");
        }
        objArr[2] = concat;
        return a.a(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    static fn b(int i2) {
        return new fn(i2, (byte) 0);
    }

    public static fe zza(String str) {
        return new fp(str.getBytes(gp.f50957a));
    }

    public static fe zza(byte[] bArr, int i2, int i3) {
        a(i2, i2 + i3, bArr.length);
        return new fp(f50859a.a(bArr, i2, i3));
    }

    static int a(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(new StringBuilder(32).append("Beginning index: ").append(i2).append(" < 0").toString());
        } else if (i3 < i2) {
            throw new IndexOutOfBoundsException(new StringBuilder(66).append("Beginning index larger than ending index: ").append(i2).append(", ").append(i3).toString());
        } else {
            throw new IndexOutOfBoundsException(new StringBuilder(37).append("End index: ").append(i3).append(" >= ").append(i4).toString());
        }
    }
}
