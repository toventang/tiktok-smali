package d.a.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f156597a = 64;

    /* renamed from: b  reason: collision with root package name */
    public final int f156598b = 16;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f156599c = new byte[64];

    /* renamed from: d  reason: collision with root package name */
    private int f156600d;

    /* renamed from: e  reason: collision with root package name */
    private long f156601e;

    static {
        Covode.recordClassIndex(103976);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract byte[] a(long j2);

    /* access modifiers changed from: protected */
    public abstract void b(byte[] bArr);

    public final byte[] b() {
        byte[] bArr = new byte[this.f156598b];
        l.c(bArr, "");
        byte[] a2 = a(this.f156601e);
        int i2 = 0;
        while (i2 < a2.length) {
            int i3 = this.f156597a;
            int i4 = this.f156600d;
            int i5 = i3 - i4;
            b.a(a2, i2, this.f156599c, i4, i5);
            a(this.f156599c);
            this.f156600d = 0;
            i2 += i5;
        }
        b(bArr);
        a();
        l.c(bArr, "");
        return bArr;
    }

    public final d a(byte[] bArr, int i2) {
        l.c(bArr, "");
        int i3 = 0;
        int i4 = i2;
        while (i4 > 0) {
            int min = Math.min(this.f156597a - this.f156600d, i4);
            b.a(bArr, i3, this.f156599c, this.f156600d, min);
            i4 -= min;
            i3 += min;
            int i5 = this.f156600d + min;
            this.f156600d = i5;
            int i6 = this.f156597a;
            if (i5 >= i6) {
                this.f156600d = i5 - i6;
                a(this.f156599c);
            }
        }
        this.f156601e += (long) i2;
        return this;
    }
}
