package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;

public final class v {

    /* renamed from: h  reason: collision with root package name */
    public static final a f158911h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f158912a;

    /* renamed from: b  reason: collision with root package name */
    public int f158913b;

    /* renamed from: c  reason: collision with root package name */
    public int f158914c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f158915d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f158916e;

    /* renamed from: f  reason: collision with root package name */
    public v f158917f;

    /* renamed from: g  reason: collision with root package name */
    public v f158918g;

    static {
        Covode.recordClassIndex(105449);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105450);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public v() {
        this.f158912a = new byte[8192];
        this.f158916e = true;
    }

    public final v a() {
        this.f158915d = true;
        return new v(this.f158912a, this.f158913b, this.f158914c, true, false);
    }

    public final v b() {
        byte[] bArr = this.f158912a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l.a((Object) copyOf, "");
        return new v(copyOf, this.f158913b, this.f158914c, false, true);
    }

    public final v c() {
        v vVar = this.f158917f;
        if (vVar == this) {
            vVar = null;
        }
        v vVar2 = this.f158918g;
        if (vVar2 == null) {
            l.a();
        }
        vVar2.f158917f = this.f158917f;
        v vVar3 = this.f158917f;
        if (vVar3 == null) {
            l.a();
        }
        vVar3.f158918g = this.f158918g;
        this.f158917f = null;
        this.f158918g = null;
        return vVar;
    }

    public final v a(v vVar) {
        l.c(vVar, "");
        vVar.f158918g = this;
        vVar.f158917f = this.f158917f;
        v vVar2 = this.f158917f;
        if (vVar2 == null) {
            l.a();
        }
        vVar2.f158918g = vVar;
        this.f158917f = vVar;
        return vVar;
    }

    public final void a(v vVar, int i2) {
        l.c(vVar, "");
        if (vVar.f158916e) {
            int i3 = vVar.f158914c;
            if (i3 + i2 > 8192) {
                if (!vVar.f158915d) {
                    int i4 = vVar.f158913b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = vVar.f158912a;
                        b.a(bArr, i4, bArr, 0, i3 - i4);
                        vVar.f158914c -= vVar.f158913b;
                        vVar.f158913b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            b.a(this.f158912a, this.f158913b, vVar.f158912a, vVar.f158914c, i2);
            vVar.f158914c += i2;
            this.f158913b += i2;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public v(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        l.c(bArr, "");
        this.f158912a = bArr;
        this.f158913b = i2;
        this.f158914c = i3;
        this.f158915d = z;
        this.f158916e = z2;
    }
}
