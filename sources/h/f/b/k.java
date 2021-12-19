package h.f.b;

import com.bytedance.covode.number.Covode;

public final class k extends t<int[]> {

    /* renamed from: b  reason: collision with root package name */
    private final int[] f158723b = new int[2];

    static {
        Covode.recordClassIndex(105222);
    }

    public final int[] b() {
        return (int[]) a(this.f158723b, new int[c()]);
    }

    public final void a() {
        int[] iArr = this.f158723b;
        int i2 = this.f158726a;
        this.f158726a = i2 + 1;
        iArr[i2] = 1000;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.b.t
    public final /* synthetic */ int a(int[] iArr) {
        int[] iArr2 = iArr;
        l.d(iArr2, "");
        return iArr2.length;
    }
}
