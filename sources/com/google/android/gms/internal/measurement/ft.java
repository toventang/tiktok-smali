package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ft extends fb {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f50882b = Logger.getLogger(ft.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f50883c = jk.f51068b;

    /* renamed from: a  reason: collision with root package name */
    fv f50884a;

    public static int d(long j2) {
        int i2;
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if ((-34359738368L & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    static long e(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int m(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    static int n(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public abstract void a(int i2);

    public abstract void a(int i2, int i3);

    public abstract void a(int i2, long j2);

    public abstract void a(int i2, fe feVar);

    public abstract void a(int i2, ht htVar);

    /* access modifiers changed from: package-private */
    public abstract void a(int i2, ht htVar, in inVar);

    public abstract void a(int i2, String str);

    public abstract void a(int i2, boolean z);

    public abstract void a(long j2);

    public abstract void a(fe feVar);

    public abstract void a(ht htVar);

    public abstract void a(String str);

    /* access modifiers changed from: package-private */
    public abstract void a(byte[] bArr, int i2);

    public abstract void b(int i2);

    public abstract void b(int i2, int i3);

    public abstract void b(int i2, fe feVar);

    public abstract void c(int i2, int i3);

    public abstract void c(int i2, long j2);

    public abstract void c(long j2);

    public abstract void d(int i2);

    public abstract void e(int i2, int i3);

    private ft() {
    }

    public final void a(int i2, float f2) {
        e(i2, Float.floatToRawIntBits(f2));
    }

    public final void b(long j2) {
        a(e(j2));
    }

    public final void a(boolean z) {
        a(z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public static class a extends ft {

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f50885b;

        /* renamed from: c  reason: collision with root package name */
        private final int f50886c;

        /* renamed from: d  reason: collision with root package name */
        private final int f50887d;

        /* renamed from: e  reason: collision with root package name */
        private int f50888e;

        static {
            Covode.recordClassIndex(31798);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(int i2, boolean z) {
            a(i2, 0);
            a(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(fe feVar) {
            b(feVar.zza());
            feVar.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(byte[] bArr, int i2) {
            b(i2);
            b(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(ht htVar) {
            b(htVar.m());
            htVar.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(long j2) {
            if (!ft.f50883c || a() < 10) {
                while ((j2 & -128) != 0) {
                    try {
                        byte[] bArr = this.f50885b;
                        int i2 = this.f50888e;
                        this.f50888e = i2 + 1;
                        bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                        j2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new b(com.a.a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f50888e), Integer.valueOf(this.f50887d), 1}), e2);
                    }
                }
                byte[] bArr2 = this.f50885b;
                int i3 = this.f50888e;
                this.f50888e = i3 + 1;
                bArr2[i3] = (byte) ((int) j2);
                return;
            }
            while ((j2 & -128) != 0) {
                byte[] bArr3 = this.f50885b;
                int i4 = this.f50888e;
                this.f50888e = i4 + 1;
                jk.a(bArr3, (long) i4, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr4 = this.f50885b;
            int i5 = this.f50888e;
            this.f50888e = i5 + 1;
            jk.a(bArr4, (long) i5, (byte) ((int) j2));
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(String str) {
            int i2 = this.f50888e;
            try {
                int m2 = m(str.length() * 3);
                int m3 = m(str.length());
                if (m3 == m2) {
                    int i3 = i2 + m3;
                    this.f50888e = i3;
                    int a2 = jm.a(str, this.f50885b, i3, a());
                    this.f50888e = i2;
                    b((a2 - i2) - m3);
                    this.f50888e = a2;
                    return;
                }
                b(jm.a(str));
                this.f50888e = jm.a(str, this.f50885b, this.f50888e, a());
            } catch (jq e2) {
                this.f50888e = i2;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final int a() {
            return this.f50887d - this.f50888e;
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(int i2) {
            if (i2 >= 0) {
                b(i2);
            } else {
                a((long) i2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(byte b2) {
            try {
                byte[] bArr = this.f50885b;
                int i2 = this.f50888e;
                this.f50888e = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(com.a.a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f50888e), Integer.valueOf(this.f50887d), 1}), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void d(int i2) {
            try {
                byte[] bArr = this.f50885b;
                int i3 = this.f50888e;
                int i4 = i3 + 1;
                this.f50888e = i4;
                bArr[i3] = (byte) i2;
                int i5 = i4 + 1;
                this.f50888e = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i5 + 1;
                this.f50888e = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.f50888e = i6 + 1;
                bArr[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(com.a.a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f50888e), Integer.valueOf(this.f50887d), 1}), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void b(int i2) {
            if (!ft.f50883c || ex.a() || a() < 5) {
                while ((i2 & -128) != 0) {
                    try {
                        byte[] bArr = this.f50885b;
                        int i3 = this.f50888e;
                        this.f50888e = i3 + 1;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new b(com.a.a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f50888e), Integer.valueOf(this.f50887d), 1}), e2);
                    }
                }
                byte[] bArr2 = this.f50885b;
                int i4 = this.f50888e;
                this.f50888e = i4 + 1;
                bArr2[i4] = (byte) i2;
            } else if ((i2 & -128) == 0) {
                byte[] bArr3 = this.f50885b;
                int i5 = this.f50888e;
                this.f50888e = i5 + 1;
                jk.a(bArr3, (long) i5, (byte) i2);
            } else {
                byte[] bArr4 = this.f50885b;
                int i6 = this.f50888e;
                this.f50888e = i6 + 1;
                jk.a(bArr4, (long) i6, (byte) (i2 | 128));
                int i7 = i2 >>> 7;
                if ((i7 & -128) == 0) {
                    byte[] bArr5 = this.f50885b;
                    int i8 = this.f50888e;
                    this.f50888e = i8 + 1;
                    jk.a(bArr5, (long) i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f50885b;
                int i9 = this.f50888e;
                this.f50888e = i9 + 1;
                jk.a(bArr6, (long) i9, (byte) (i7 | 128));
                int i10 = i7 >>> 7;
                if ((i10 & -128) == 0) {
                    byte[] bArr7 = this.f50885b;
                    int i11 = this.f50888e;
                    this.f50888e = i11 + 1;
                    jk.a(bArr7, (long) i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f50885b;
                int i12 = this.f50888e;
                this.f50888e = i12 + 1;
                jk.a(bArr8, (long) i12, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & -128) == 0) {
                    byte[] bArr9 = this.f50885b;
                    int i14 = this.f50888e;
                    this.f50888e = i14 + 1;
                    jk.a(bArr9, (long) i14, (byte) i13);
                    return;
                }
                byte[] bArr10 = this.f50885b;
                int i15 = this.f50888e;
                this.f50888e = i15 + 1;
                jk.a(bArr10, (long) i15, (byte) (i13 | 128));
                byte[] bArr11 = this.f50885b;
                int i16 = this.f50888e;
                this.f50888e = i16 + 1;
                jk.a(bArr11, (long) i16, (byte) (i13 >>> 7));
            }
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void c(long j2) {
            try {
                byte[] bArr = this.f50885b;
                int i2 = this.f50888e;
                int i3 = i2 + 1;
                this.f50888e = i3;
                bArr[i2] = (byte) ((int) j2);
                int i4 = i3 + 1;
                this.f50888e = i4;
                bArr[i3] = (byte) ((int) (j2 >> 8));
                int i5 = i4 + 1;
                this.f50888e = i5;
                bArr[i4] = (byte) ((int) (j2 >> 16));
                int i6 = i5 + 1;
                this.f50888e = i6;
                bArr[i5] = (byte) ((int) (j2 >> 24));
                int i7 = i6 + 1;
                this.f50888e = i7;
                bArr[i6] = (byte) ((int) (j2 >> 32));
                int i8 = i7 + 1;
                this.f50888e = i8;
                bArr[i7] = (byte) ((int) (j2 >> 40));
                int i9 = i8 + 1;
                this.f50888e = i9;
                bArr[i8] = (byte) ((int) (j2 >> 48));
                this.f50888e = i9 + 1;
                bArr[i9] = (byte) ((int) (j2 >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new b(com.a.a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f50888e), Integer.valueOf(this.f50887d), 1}), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void b(int i2, int i3) {
            a(i2, 0);
            a(i3);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void c(int i2, int i3) {
            a(i2, 0);
            b(i3);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void e(int i2, int i3) {
            a(i2, 5);
            d(i3);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void c(int i2, long j2) {
            a(i2, 1);
            c(j2);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(int i2, int i3) {
            b((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void b(int i2, fe feVar) {
            a(1, 3);
            c(2, i2);
            a(3, feVar);
            a(1, 4);
        }

        a(byte[] bArr, int i2) {
            super((byte) 0);
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                this.f50885b = bArr;
                this.f50886c = 0;
                this.f50888e = 0;
                this.f50887d = i3;
                return;
            }
            throw new IllegalArgumentException(com.a.a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(int i2, long j2) {
            a(i2, 0);
            a(j2);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(int i2, fe feVar) {
            a(i2, 2);
            a(feVar);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(int i2, ht htVar) {
            a(1, 3);
            c(2, i2);
            a(3, 2);
            a(htVar);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(int i2, String str) {
            a(i2, 2);
            a(str);
        }

        @Override // com.google.android.gms.internal.measurement.fb
        public final void a(byte[] bArr, int i2, int i3) {
            b(bArr, i2, i3);
        }

        private final void b(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.f50885b, this.f50888e, i3);
                this.f50888e += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(com.a.a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f50888e), Integer.valueOf(this.f50887d), Integer.valueOf(i3)}), e2);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.measurement.ft
        public final void a(int i2, ht htVar, in inVar) {
            a(i2, 2);
            ev evVar = (ev) htVar;
            int i3 = evVar.i();
            if (i3 == -1) {
                i3 = inVar.b(evVar);
                evVar.b(i3);
            }
            b(i3);
            inVar.a((Object) htVar, (jw) this.f50884a);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, jq jqVar) {
        f50882b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) jqVar);
        byte[] bytes = str.getBytes(gp.f50957a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new b(e2);
        } catch (b e3) {
            throw e3;
        }
    }

    public static class b extends IOException {
        static {
            Covode.recordClassIndex(31799);
        }

        b() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        b(java.lang.String r4, java.lang.Throwable r5) {
            /*
                r3 = this;
                java.lang.String r2 = java.lang.String.valueOf(r4)
                int r0 = r2.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0014
                java.lang.String r0 = r1.concat(r2)
            L_0x0010:
                r3.<init>(r0, r5)
                return
            L_0x0014:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r1)
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ft.b.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    static {
        Covode.recordClassIndex(31797);
    }

    public final void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* synthetic */ ft(byte b2) {
        this();
    }

    public static ft a(byte[] bArr) {
        return new a(bArr, bArr.length);
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return m(length) + length;
    }

    public final void c(int i2) {
        b(n(i2));
    }

    public static int a(hc hcVar) {
        int a2 = hcVar.a();
        return m(a2) + a2;
    }

    public static int e(int i2) {
        return m(i2 << 3) + 4;
    }

    public static int f(int i2) {
        return m(i2 << 3) + 4;
    }

    public static int g(int i2) {
        return m(i2 << 3) + 8;
    }

    public static int h(int i2) {
        return m(i2 << 3) + 8;
    }

    public static int i(int i2) {
        return m(i2 << 3) + 4;
    }

    public static int j(int i2) {
        return m(i2 << 3) + 8;
    }

    public static int k(int i2) {
        return m(i2 << 3) + 1;
    }

    public static int l(int i2) {
        if (i2 >= 0) {
            return m(i2);
        }
        return 10;
    }

    public static int b(fe feVar) {
        int zza = feVar.zza();
        return m(zza) + zza;
    }

    public static int b(ht htVar) {
        int m2 = htVar.m();
        return m(m2) + m2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int b(String str) {
        int i2;
        try {
            str = jm.a(str);
            i2 = str;
        } catch (jq unused) {
            i2 = str.getBytes(gp.f50957a).length;
        }
        return m(i2) + i2;
    }

    public final void a(double d2) {
        c(Double.doubleToRawLongBits(d2));
    }

    public final void a(float f2) {
        d(Float.floatToRawIntBits(f2));
    }

    public final void d(int i2, int i3) {
        c(i2, n(i3));
    }

    public static int d(int i2, long j2) {
        return m(i2 << 3) + d(j2);
    }

    public static int a(int i2, hc hcVar) {
        int m2 = m(i2 << 3);
        int a2 = hcVar.a();
        return m2 + m(a2) + a2;
    }

    public static int b(int i2, String str) {
        return m(i2 << 3) + b(str);
    }

    public static int c(int i2, fe feVar) {
        int m2 = m(i2 << 3);
        int zza = feVar.zza();
        return m2 + m(zza) + zza;
    }

    public static int e(int i2, long j2) {
        return m(i2 << 3) + d(j2);
    }

    public static int f(int i2, int i3) {
        return m(i2 << 3) + l(i3);
    }

    public static int g(int i2, int i3) {
        return m(i2 << 3) + m(i3);
    }

    public static int h(int i2, int i3) {
        return m(i2 << 3) + m(n(i3));
    }

    public static int i(int i2, int i3) {
        return m(i2 << 3) + l(i3);
    }

    static int a(ht htVar, in inVar) {
        ev evVar = (ev) htVar;
        int i2 = evVar.i();
        if (i2 == -1) {
            i2 = inVar.b(evVar);
            evVar.b(i2);
        }
        return m(i2) + i2;
    }

    public static int f(int i2, long j2) {
        return m(i2 << 3) + d(e(j2));
    }

    public final void a(int i2, double d2) {
        c(i2, Double.doubleToRawLongBits(d2));
    }

    public final void b(int i2, long j2) {
        a(i2, e(j2));
    }

    static int b(int i2, ht htVar, in inVar) {
        return m(i2 << 3) + a(htVar, inVar);
    }

    static int c(int i2, ht htVar, in inVar) {
        int m2 = m(i2 << 3) << 1;
        ev evVar = (ev) htVar;
        int i3 = evVar.i();
        if (i3 == -1) {
            i3 = inVar.b(evVar);
            evVar.b(i3);
        }
        return m2 + i3;
    }
}
