package d.a.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f156575d = new int[256];

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f156576e = new int[256];

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f156577f = new int[256];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f156578g = new int[256];

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f156579h = new int[256];

    /* renamed from: i  reason: collision with root package name */
    public static final C4135a f156580i = new C4135a((byte) 0);

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f156581m = new int[256];
    private static final int[] n = new int[256];
    private static final int[] o = new int[256];
    private static final int[] p = new int[256];
    private static final int[] q = new int[256];
    private static final int[] r = {0, 1, 2, 4, 8, 16, 32, 64, 128, 27, 54};

    /* renamed from: a  reason: collision with root package name */
    public final int f156582a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f156583b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f156584c;

    /* renamed from: j  reason: collision with root package name */
    private final int f156585j;

    /* renamed from: k  reason: collision with root package name */
    private final int f156586k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f156587l;

    /* renamed from: d.a.c.a$a  reason: collision with other inner class name */
    public static final class C4135a {
        static {
            Covode.recordClassIndex(103970);
        }

        private C4135a() {
        }

        public /* synthetic */ C4135a(byte b2) {
            this();
        }

        public static int[] a(byte[] bArr) {
            int length = bArr.length / 4;
            int[] iArr = new int[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = i4 + 1;
                int i7 = bArr[i4] & 255;
                int i8 = i6 + 1;
                int i9 = bArr[i6] & 255;
                i2 = i8 + 1;
                iArr[i3] = (i5 << 24) | (i7 << 16) | (i9 << 8) | ((bArr[i8] & 255) << 0);
            }
            return iArr;
        }
    }

    static {
        Covode.recordClassIndex(103969);
        int[] iArr = new int[256];
        int i2 = 0;
        loop0:
        while (true) {
            int i3 = i2 << 1;
            while (true) {
                iArr[i2] = i3;
                i2++;
                if (i2 >= 256) {
                    break loop0;
                } else if (i2 >= 128) {
                    i3 = (i2 << 1) ^ 283;
                }
            }
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        do {
            int i7 = ((((i5 << 1) ^ i5) ^ (i5 << 2)) ^ (i5 << 3)) ^ (i5 << 4);
            int i8 = ((i7 & 255) ^ (i7 >>> 8)) ^ 99;
            f156581m[i6] = i8;
            f156575d[i8] = i6;
            int i9 = iArr[i6];
            int i10 = iArr[i9];
            int i11 = iArr[i10];
            int i12 = (iArr[i8] * 257) ^ (i8 * 16843008);
            n[i6] = (i12 << 24) | (i12 >>> 8);
            o[i6] = (i12 << 16) | (i12 >>> 16);
            p[i6] = (i12 << 8) | (i12 >>> 24);
            q[i6] = i12 << 0;
            int i13 = (((i10 * 65537) ^ (16843009 * i11)) ^ (i9 * 257)) ^ (16843008 * i6);
            f156576e[i8] = (i13 << 24) | (i13 >>> 8);
            f156577f[i8] = (i13 << 16) | (i13 >>> 16);
            f156578g[i8] = (i13 << 8) | (i13 >>> 24);
            f156579h[i8] = i13 << 0;
            if (i6 == 0) {
                i5 = 1;
                i6 = 1;
            } else {
                i6 = iArr[iArr[iArr[i11 ^ i9]]] ^ i9;
                i5 ^= iArr[iArr[i5]];
            }
            i4++;
        } while (i4 < 256);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(byte[] bArr) {
        this(C4135a.a(bArr));
        l.c(bArr, "");
    }

    private a(int[] iArr) {
        int i2;
        int i3;
        l.c(iArr, "");
        this.f156584c = iArr;
        int length = iArr.length;
        this.f156585j = length;
        int i4 = length + 6;
        this.f156582a = i4;
        int i5 = (i4 + 1) * 4;
        this.f156586k = i5;
        int[] iArr2 = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = this.f156585j;
            if (i6 < i7) {
                i3 = this.f156584c[i6];
            } else {
                int i8 = iArr2[i6 - 1];
                if (i6 % i7 == 0) {
                    int i9 = (i8 >>> 24) | (i8 << 8);
                    int[] iArr3 = f156581m;
                    i8 = (iArr3[i9 & 255] | (((iArr3[(i9 >>> 24) & 255] << 24) | (iArr3[(i9 >>> 16) & 255] << 16)) | (iArr3[(i9 >>> 8) & 255] << 8))) ^ (r[(i6 / i7) | 0] << 24);
                } else if (i7 > 6 && i6 % i7 == 4) {
                    int[] iArr4 = f156581m;
                    i8 = iArr4[i8 & 255] | (iArr4[(i8 >>> 24) & 255] << 24) | (iArr4[(i8 >>> 16) & 255] << 16) | (iArr4[(i8 >>> 8) & 255] << 8);
                }
                i3 = iArr2[i6 - i7] ^ i8;
            }
            iArr2[i6] = i3;
        }
        this.f156587l = iArr2;
        int i10 = this.f156586k;
        int[] iArr5 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f156586k - i11;
            if (i11 % 4 != 0) {
                i2 = this.f156587l[i12];
            } else {
                i2 = this.f156587l[i12 - 4];
            }
            if (i11 >= 4 && i12 > 4) {
                int[] iArr6 = f156576e;
                int[] iArr7 = f156581m;
                i2 = f156579h[iArr7[i2 & 255]] ^ ((iArr6[iArr7[(i2 >>> 24) & 255]] ^ f156577f[iArr7[(i2 >>> 16) & 255]]) ^ f156578g[iArr7[(i2 >>> 8) & 255]]);
            }
            iArr5[i11] = i2;
        }
        this.f156583b = iArr5;
    }
}
