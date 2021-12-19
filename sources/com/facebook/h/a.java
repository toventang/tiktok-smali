package com.facebook.h;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.g;
import com.facebook.common.d.i;
import com.facebook.h.c;
import com.ss.ugc.effectplatform.b.a.e;

public final class a implements c.a {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f47608b = {-1, -40, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int f47609c = 3;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f47610d = {-119, 80, 78, 71, e.f153515b, 10, 26, 10};

    /* renamed from: e  reason: collision with root package name */
    private static final int f47611e = 8;

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f47612f = e.a("GIF87a");

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f47613g = e.a("GIF89a");

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f47614h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f47615i;

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f47616j = {0, 0, 1, 0};

    /* renamed from: k  reason: collision with root package name */
    private static final int f47617k = 4;

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f47618l;

    /* renamed from: m  reason: collision with root package name */
    private static final int f47619m;

    /* renamed from: a  reason: collision with root package name */
    final int f47620a = g.a(21, 20, f47609c, f47611e, 6, f47615i, f47617k, f47619m);

    @Override // com.facebook.h.c.a
    public final int a() {
        return this.f47620a;
    }

    static {
        Covode.recordClassIndex(28873);
        byte[] a2 = e.a("BM");
        f47614h = a2;
        f47615i = a2.length;
        String[] strArr = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};
        f47618l = strArr;
        f47619m = e.a("ftyp" + strArr[0]).length;
    }

    @Override // com.facebook.h.c.a
    public final c a(byte[] bArr, int i2) {
        boolean z;
        boolean z2;
        i.a(bArr);
        if (com.facebook.common.l.c.a(bArr, 0, i2)) {
            i.a(com.facebook.common.l.c.a(bArr, 0, i2));
            if (com.facebook.common.l.c.a(bArr, 12, com.facebook.common.l.c.f47140e)) {
                return b.f47626f;
            }
            if (com.facebook.common.l.c.a(bArr, 12, com.facebook.common.l.c.f47141f)) {
                return b.f47627g;
            }
            if (i2 < 21 || !com.facebook.common.l.c.a(bArr, 12, com.facebook.common.l.c.f47142g)) {
                return c.f47633a;
            }
            boolean a2 = com.facebook.common.l.c.a(bArr, 12, com.facebook.common.l.c.f47142g);
            if ((bArr[20] & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (a2 && z) {
                return b.f47630j;
            }
            boolean a3 = com.facebook.common.l.c.a(bArr, 12, com.facebook.common.l.c.f47142g);
            if ((bArr[20] & 16) == 16) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!a3 || !z2) {
                return b.f47628h;
            }
            return b.f47629i;
        }
        byte[] bArr2 = f47608b;
        if (i2 >= bArr2.length && e.a(bArr, bArr2)) {
            return b.f47621a;
        }
        byte[] bArr3 = f47610d;
        if (i2 >= bArr3.length && e.a(bArr, bArr3)) {
            return b.f47622b;
        }
        if (i2 >= 6 && (e.a(bArr, f47612f) || e.a(bArr, f47613g))) {
            return b.f47623c;
        }
        byte[] bArr4 = f47614h;
        if (i2 >= bArr4.length && e.a(bArr, bArr4)) {
            return b.f47624d;
        }
        byte[] bArr5 = f47616j;
        if (i2 >= bArr5.length && e.a(bArr, bArr5)) {
            return b.f47625e;
        }
        if (i2 >= f47619m && bArr[3] >= 8) {
            String[] strArr = f47618l;
            for (String str : strArr) {
                int length = bArr.length;
                byte[] a4 = e.a("ftyp".concat(String.valueOf(str)));
                int i3 = f47619m;
                i.a(bArr);
                i.a(a4);
                if (i3 <= length) {
                    byte b2 = a4[0];
                    int i4 = length - i3;
                    int i5 = 0;
                    while (true) {
                        if (i5 > i4) {
                            continue;
                            break;
                        }
                        if (bArr[i5] != b2) {
                            do {
                                i5++;
                                if (i5 > i4) {
                                    break;
                                }
                            } while (bArr[i5] != b2);
                        }
                        if (i5 <= i4) {
                            int i6 = i5 + 1;
                            int i7 = (i6 + i3) - 1;
                            int i8 = 1;
                            while (i6 < i7 && bArr[i6] == a4[i8]) {
                                i6++;
                                i8++;
                            }
                            if (i6 == i7) {
                                if (i5 >= 0) {
                                    return b.f47631k;
                                }
                            }
                        }
                        i5++;
                    }
                }
            }
        }
        return c.f47633a;
    }
}
