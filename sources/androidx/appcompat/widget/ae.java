package androidx.appcompat.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class ae {

    /* renamed from: a  reason: collision with root package name */
    public int f1497a;

    /* renamed from: b  reason: collision with root package name */
    public int f1498b;

    /* renamed from: c  reason: collision with root package name */
    int f1499c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    int f1500d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    int f1501e;

    /* renamed from: f  reason: collision with root package name */
    int f1502f;

    /* renamed from: g  reason: collision with root package name */
    boolean f1503g;

    /* renamed from: h  reason: collision with root package name */
    boolean f1504h;

    static {
        Covode.recordClassIndex(459);
    }

    ae() {
    }

    public final void a(int i2, int i3) {
        this.f1499c = i2;
        this.f1500d = i3;
        this.f1504h = true;
        if (this.f1503g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1497a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1498b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1497a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1498b = i3;
        }
    }

    public final void b(int i2, int i3) {
        this.f1504h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f1501e = i2;
            this.f1497a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1502f = i3;
            this.f1498b = i3;
        }
    }
}
