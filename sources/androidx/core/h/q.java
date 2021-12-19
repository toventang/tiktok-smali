package androidx.core.h;

import com.bytedance.covode.number.Covode;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private int f2553a;

    /* renamed from: b  reason: collision with root package name */
    private int f2554b;

    static {
        Covode.recordClassIndex(868);
    }

    public final int a() {
        return this.f2553a | this.f2554b;
    }

    public final void a(int i2) {
        if (i2 == 1) {
            this.f2554b = 0;
        } else {
            this.f2553a = 0;
        }
    }

    public final void a(int i2, int i3) {
        if (i3 == 1) {
            this.f2554b = i2;
        } else {
            this.f2553a = i2;
        }
    }
}
