package androidx.constraintlayout.a.a;

import com.bytedance.covode.number.Covode;

public final class n extends o {

    /* renamed from: a  reason: collision with root package name */
    float f1965a;

    static {
        Covode.recordClassIndex(598);
    }

    @Override // androidx.constraintlayout.a.a.o
    public final void b() {
        super.b();
        this.f1965a = 0.0f;
    }

    public final void a(int i2) {
        if (this.f1967i == 0 || this.f1965a != ((float) i2)) {
            this.f1965a = (float) i2;
            if (this.f1967i == 1) {
                c();
            }
            d();
        }
    }
}
