package com.google.android.gms.internal.measurement;

import com.a;
import com.bytedance.covode.number.Covode;

final class jp extends jo {
    static {
        Covode.recordClassIndex(31913);
    }

    jp() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a1, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.measurement.jo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(byte[] r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.jp.a(byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.jo
    public final String b(byte[] bArr, int i2, int i3) {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte a2 = jk.a(bArr, (long) i2);
                if (a2 < 0) {
                    break;
                }
                i2++;
                jl.a(a2, cArr, i5);
                i5++;
            }
            while (i2 < i4) {
                int i6 = i2 + 1;
                byte a3 = jk.a(bArr, (long) i2);
                if (a3 >= 0) {
                    int i7 = i5 + 1;
                    jl.a(a3, cArr, i5);
                    while (i6 < i4) {
                        byte a4 = jk.a(bArr, (long) i6);
                        if (a4 < 0) {
                            break;
                        }
                        i6++;
                        jl.a(a4, cArr, i7);
                        i7++;
                    }
                    i2 = i6;
                    i5 = i7;
                } else if (jl.a(a3)) {
                    if (i6 < i4) {
                        i2 = i6 + 1;
                        jl.a(a3, jk.a(bArr, (long) i6), cArr, i5);
                        i5++;
                    } else {
                        throw gu.h();
                    }
                } else if (jl.b(a3)) {
                    if (i6 < i4 - 1) {
                        int i8 = i6 + 1;
                        i2 = i8 + 1;
                        jl.a(a3, jk.a(bArr, (long) i6), jk.a(bArr, (long) i8), cArr, i5);
                        i5++;
                    } else {
                        throw gu.h();
                    }
                } else if (i6 < i4 - 2) {
                    int i9 = i6 + 1;
                    byte a5 = jk.a(bArr, (long) i6);
                    int i10 = i9 + 1;
                    i2 = i10 + 1;
                    jl.a(a3, a5, jk.a(bArr, (long) i9), jk.a(bArr, (long) i10), cArr, i5);
                    i5 = i5 + 1 + 1;
                } else {
                    throw gu.h();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(a.a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    private static int a(byte[] bArr, int i2, long j2, int i3) {
        if (i3 == 0) {
            return jm.a(i2);
        }
        if (i3 == 1) {
            return jm.a(i2, jk.a(bArr, j2));
        }
        if (i3 == 2) {
            return jm.a(i2, jk.a(bArr, j2), jk.a(bArr, j2 + 1));
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[LOOP:1: B:13:0x0035->B:19:0x0049, LOOP_START, PHI: r2 r7 r13 r19 
      PHI: (r2v2 char) = (r2v1 char), (r2v22 char) binds: [B:10:0x0031, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v2 long) = (r7v1 long), (r7v16 long) binds: [B:10:0x0031, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v2 int) = (r13v1 int), (r13v7 int) binds: [B:10:0x0031, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v1 long) = (r19v0 long), (r19v2 long) binds: [B:10:0x0031, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.jo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.jp.a(java.lang.CharSequence, byte[], int, int):int");
    }
}
