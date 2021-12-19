package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class fa {
    static {
        Covode.recordClassIndex(31778);
    }

    static int a(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    static int a(byte[] bArr, int i2, gv<?> gvVar, ez ezVar) {
        gn gnVar = (gn) gvVar;
        int a2 = a(bArr, i2, ezVar);
        int i3 = ezVar.f50832a + a2;
        while (a2 < i3) {
            a2 = a(bArr, a2, ezVar);
            gnVar.d(ezVar.f50832a);
        }
        if (a2 == i3) {
            return a2;
        }
        throw gu.a();
    }

    static double c(byte[] bArr, int i2) {
        return Double.longBitsToDouble(b(bArr, i2));
    }

    static float d(byte[] bArr, int i2) {
        return Float.intBitsToFloat(a(bArr, i2));
    }

    static long b(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    static int a(byte[] bArr, int i2, ez ezVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return a(b2, bArr, i3, ezVar);
        }
        ezVar.f50832a = b2;
        return i3;
    }

    static int c(byte[] bArr, int i2, ez ezVar) {
        int a2 = a(bArr, i2, ezVar);
        int i3 = ezVar.f50832a;
        if (i3 < 0) {
            throw gu.b();
        } else if (i3 == 0) {
            ezVar.f50834c = "";
            return a2;
        } else {
            ezVar.f50834c = new String(bArr, a2, i3, gp.f50957a);
            return a2 + i3;
        }
    }

    static int d(byte[] bArr, int i2, ez ezVar) {
        int a2 = a(bArr, i2, ezVar);
        int i3 = ezVar.f50832a;
        if (i3 < 0) {
            throw gu.b();
        } else if (i3 == 0) {
            ezVar.f50834c = "";
            return a2;
        } else {
            ezVar.f50834c = jm.b(bArr, a2, i3);
            return a2 + i3;
        }
    }

    static int b(byte[] bArr, int i2, ez ezVar) {
        int i3 = i2 + 1;
        long j2 = (long) bArr[i2];
        if (j2 >= 0) {
            ezVar.f50833b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            b2 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i5;
            i4++;
        }
        ezVar.f50833b = j3;
        return i4;
    }

    static int e(byte[] bArr, int i2, ez ezVar) {
        int a2 = a(bArr, i2, ezVar);
        int i3 = ezVar.f50832a;
        if (i3 < 0) {
            throw gu.b();
        } else if (i3 > bArr.length - a2) {
            throw gu.a();
        } else if (i3 == 0) {
            ezVar.f50834c = fe.zza;
            return a2;
        } else {
            ezVar.f50834c = fe.zza(bArr, a2, i3);
            return a2 + i3;
        }
    }

    static int a(int i2, byte[] bArr, int i3, ez ezVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            ezVar.f50832a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            ezVar.f50832a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            ezVar.f50832a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            ezVar.f50832a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                ezVar.f50832a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    static int a(int i2, byte[] bArr, int i3, int i4, ez ezVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                return b(bArr, i3, ezVar);
            }
            if (i5 == 1) {
                return i3 + 8;
            }
            if (i5 == 2) {
                return a(bArr, i3, ezVar) + ezVar.f50832a;
            }
            if (i5 == 3) {
                int i6 = (i2 & -8) | 4;
                int i7 = 0;
                while (i3 < i4) {
                    i3 = a(bArr, i3, ezVar);
                    i7 = ezVar.f50832a;
                    if (i7 == i6) {
                        break;
                    }
                    i3 = a(i7, bArr, i3, i4, ezVar);
                }
                if (i3 <= i4 && i7 == i6) {
                    return i3;
                }
                throw gu.g();
            } else if (i5 == 5) {
                return i3 + 4;
            } else {
                throw gu.d();
            }
        } else {
            throw gu.d();
        }
    }

    static int a(in inVar, byte[] bArr, int i2, int i3, ez ezVar) {
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        byte b3 = b2;
        if (b2 < 0) {
            i4 = a(b2, bArr, i4, ezVar);
            b3 = ezVar.f50832a;
        }
        if (b3 < 0 || b3 > i3 - i4) {
            throw gu.a();
        }
        Object a2 = inVar.a();
        int i5 = (b3 == 1 ? 1 : 0) + i4;
        inVar.a(a2, bArr, i4, i5, ezVar);
        inVar.c(a2);
        ezVar.f50834c = a2;
        return i5;
    }

    static int a(int i2, byte[] bArr, int i3, int i4, gv<?> gvVar, ez ezVar) {
        gn gnVar = (gn) gvVar;
        int a2 = a(bArr, i3, ezVar);
        gnVar.d(ezVar.f50832a);
        while (a2 < i4) {
            int a3 = a(bArr, a2, ezVar);
            if (i2 != ezVar.f50832a) {
                break;
            }
            a2 = a(bArr, a3, ezVar);
            gnVar.d(ezVar.f50832a);
        }
        return a2;
    }

    static int a(int i2, byte[] bArr, int i3, int i4, jd jdVar, ez ezVar) {
        int i5 = i3;
        if ((i2 >>> 3) != 0) {
            int i6 = i2 & 7;
            if (i6 == 0) {
                int b2 = b(bArr, i5, ezVar);
                jdVar.a(i2, Long.valueOf(ezVar.f50833b));
                return b2;
            } else if (i6 == 1) {
                jdVar.a(i2, Long.valueOf(b(bArr, i5)));
                return i5 + 8;
            } else if (i6 == 2) {
                int a2 = a(bArr, i5, ezVar);
                int i7 = ezVar.f50832a;
                if (i7 < 0) {
                    throw gu.b();
                } else if (i7 <= bArr.length - a2) {
                    if (i7 == 0) {
                        jdVar.a(i2, fe.zza);
                    } else {
                        jdVar.a(i2, fe.zza(bArr, a2, i7));
                    }
                    return a2 + i7;
                } else {
                    throw gu.a();
                }
            } else if (i6 == 3) {
                jd jdVar2 = new jd();
                int i8 = (i2 & -8) | 4;
                int i9 = 0;
                while (i5 < i4) {
                    i5 = a(bArr, i5, ezVar);
                    i9 = ezVar.f50832a;
                    if (i9 == i8) {
                        break;
                    }
                    i5 = a(i9, bArr, i5, i4, jdVar2, ezVar);
                }
                if (i5 > i4 || i9 != i8) {
                    throw gu.g();
                }
                jdVar.a(i2, jdVar2);
                return i5;
            } else if (i6 == 5) {
                jdVar.a(i2, Integer.valueOf(a(bArr, i5)));
                return i5 + 4;
            } else {
                throw gu.d();
            }
        } else {
            throw gu.d();
        }
    }

    static int a(in inVar, byte[] bArr, int i2, int i3, int i4, ez ezVar) {
        hx hxVar = (hx) inVar;
        Object a2 = hxVar.a();
        int a3 = hxVar.a(a2, bArr, i2, i3, i4, ezVar);
        hxVar.c(a2);
        ezVar.f50834c = a2;
        return a3;
    }

    static int a(in<?> inVar, int i2, byte[] bArr, int i3, int i4, gv<?> gvVar, ez ezVar) {
        int a2 = a(inVar, bArr, i3, i4, ezVar);
        gvVar.add(ezVar.f50834c);
        while (a2 < i4) {
            int a3 = a(bArr, a2, ezVar);
            if (i2 != ezVar.f50832a) {
                break;
            }
            a2 = a(inVar, bArr, a3, i4, ezVar);
            gvVar.add(ezVar.f50834c);
        }
        return a2;
    }
}
