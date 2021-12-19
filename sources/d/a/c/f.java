package d.a.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f156603c = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f156604g = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f156605h;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f156606d = new int[4];

    /* renamed from: e  reason: collision with root package name */
    private final int[] f156607e = new int[4];

    /* renamed from: f  reason: collision with root package name */
    private final int[] f156608f = new int[16];

    public static final class a extends e {
        static {
            Covode.recordClassIndex(103979);
        }

        private a() {
            super(AnonymousClass1.f156609a);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public f() {
        a();
    }

    /* access modifiers changed from: protected */
    @Override // d.a.c.d
    public final void a() {
        int[] iArr = this.f156606d;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
    }

    static {
        Covode.recordClassIndex(103978);
        int i2 = 0;
        int[] iArr = new int[64];
        do {
            double d2 = (double) i2;
            Double.isNaN(d2);
            iArr[i2] = (int) ((long) (Math.abs(Math.sin(d2 + 1.0d)) * 4.294967296E9d));
            i2++;
        } while (i2 < 64);
        f156605h = iArr;
    }

    /* access modifiers changed from: protected */
    @Override // d.a.c.d
    public final void b(byte[] bArr) {
        l.c(bArr, "");
        int i2 = 0;
        do {
            bArr[i2] = (byte) (this.f156606d[i2 / 4] >>> ((i2 % 4) * 8));
            i2++;
        } while (i2 < 16);
    }

    /* access modifiers changed from: protected */
    @Override // d.a.c.d
    public final byte[] a(long j2) {
        long j3 = 8 * j2;
        int i2 = (int) (((((j2 + 8) / ((long) this.f156597a)) + 1) * ((long) this.f156597a)) - j2);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        bArr[0] = Byte.MIN_VALUE;
        do {
            bArr[(i2 - 8) + i3] = (byte) ((int) (j3 >>> (i3 * 8)));
            i3++;
        } while (i3 < 8);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    @Override // d.a.c.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte[] r15) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.c.f.a(byte[]):void");
    }
}
