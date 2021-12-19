package androidx.recyclerview.widget;

import com.bytedance.covode.number.Covode;

public final class e implements u {

    /* renamed from: a  reason: collision with root package name */
    final u f4015a;

    /* renamed from: b  reason: collision with root package name */
    int f4016b;

    /* renamed from: c  reason: collision with root package name */
    int f4017c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f4018d = -1;

    /* renamed from: e  reason: collision with root package name */
    Object f4019e;

    static {
        Covode.recordClassIndex(1562);
    }

    public final void a() {
        int i2 = this.f4016b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f4015a.a(this.f4017c, this.f4018d);
            } else if (i2 == 2) {
                this.f4015a.b(this.f4017c, this.f4018d);
            } else if (i2 == 3) {
                this.f4015a.a(this.f4017c, this.f4018d, this.f4019e);
            }
            this.f4019e = null;
            this.f4016b = 0;
        }
    }

    public e(u uVar) {
        this.f4015a = uVar;
    }

    @Override // androidx.recyclerview.widget.u
    public final void c(int i2, int i3) {
        a();
        this.f4015a.c(i2, i3);
    }

    @Override // androidx.recyclerview.widget.u
    public final void b(int i2, int i3) {
        int i4;
        if (this.f4016b != 2 || (i4 = this.f4017c) < i2 || i4 > i2 + i3) {
            a();
            this.f4017c = i2;
            this.f4018d = i3;
            this.f4016b = 2;
            return;
        }
        this.f4018d += i3;
        this.f4017c = i2;
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3) {
        int i4;
        if (this.f4016b == 1 && i2 >= (i4 = this.f4017c)) {
            int i5 = this.f4018d;
            if (i2 <= i4 + i5) {
                this.f4018d = i5 + i3;
                this.f4017c = Math.min(i2, i4);
                return;
            }
        }
        a();
        this.f4017c = i2;
        this.f4018d = i3;
        this.f4016b = 1;
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3, Object obj) {
        int i4;
        if (this.f4016b == 3) {
            int i5 = this.f4017c;
            int i6 = this.f4018d;
            if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.f4019e == obj) {
                this.f4017c = Math.min(i2, i5);
                this.f4018d = Math.max(i6 + i5, i4) - this.f4017c;
                return;
            }
        }
        a();
        this.f4017c = i2;
        this.f4018d = i3;
        this.f4019e = obj;
        this.f4016b = 3;
    }
}
