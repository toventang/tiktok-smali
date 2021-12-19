package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    final b f4020a;

    /* renamed from: b  reason: collision with root package name */
    final a f4021b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f4022c = new ArrayList();

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(1565);
        }

        int a();

        int a(View view);

        void a(int i2);

        void a(View view, int i2);

        void a(View view, int i2, ViewGroup.LayoutParams layoutParams);

        View b(int i2);

        RecyclerView.ViewHolder b(View view);

        void b();

        void c(int i2);

        void c(View view);

        void d(View view);
    }

    static {
        Covode.recordClassIndex(1563);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f4023a;

        /* renamed from: b  reason: collision with root package name */
        a f4024b;

        static {
            Covode.recordClassIndex(1564);
        }

        a() {
        }

        private void a() {
            if (this.f4024b == null) {
                this.f4024b = new a();
            }
        }

        public final String toString() {
            if (this.f4024b == null) {
                return Long.toBinaryString(this.f4023a);
            }
            return this.f4024b.toString() + "xx" + Long.toBinaryString(this.f4023a);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            a aVar = this;
            while (i2 >= 64) {
                aVar.a();
                aVar = aVar.f4024b;
                i2 -= 64;
            }
            aVar.f4023a |= 1 << i2;
        }

        /* access modifiers changed from: package-private */
        public final void b(int i2) {
            a aVar = this;
            while (i2 >= 64) {
                aVar = aVar.f4024b;
                if (aVar != null) {
                    i2 -= 64;
                } else {
                    return;
                }
            }
            aVar.f4023a &= (1 << i2) ^ -1;
        }

        /* access modifiers changed from: package-private */
        public final boolean c(int i2) {
            a aVar = this;
            while (i2 >= 64) {
                aVar.a();
                aVar = aVar.f4024b;
                i2 -= 64;
            }
            if ((aVar.f4023a & (1 << i2)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final int e(int i2) {
            a aVar = this.f4024b;
            if (aVar == null) {
                if (i2 >= 64) {
                    return Long.bitCount(this.f4023a);
                }
                return Long.bitCount(this.f4023a & ((1 << i2) - 1));
            } else if (i2 < 64) {
                return Long.bitCount(this.f4023a & ((1 << i2) - 1));
            } else {
                return aVar.e(i2 - 64) + Long.bitCount(this.f4023a);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean d(int i2) {
            boolean z;
            int i3 = i2;
            a aVar = this;
            while (i3 >= 64) {
                aVar.a();
                aVar = aVar.f4024b;
                i3 -= 64;
            }
            long j2 = 1 << i3;
            long j3 = aVar.f4023a;
            if ((j3 & j2) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j4 = j3 & (j2 ^ -1);
            aVar.f4023a = j4;
            long j5 = j2 - 1;
            aVar.f4023a = (j4 & j5) | Long.rotateRight((j5 ^ -1) & j4, 1);
            a aVar2 = aVar.f4024b;
            if (aVar2 != null) {
                if (aVar2.c(0)) {
                    aVar.a(63);
                }
                aVar.f4024b.d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, boolean z) {
            boolean z2;
            a aVar = this;
            while (i2 >= 64) {
                aVar.a();
                aVar = aVar.f4024b;
                i2 -= 64;
            }
            while (true) {
                long j2 = aVar.f4023a;
                if ((Long.MIN_VALUE & j2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j3 = (1 << i2) - 1;
                aVar.f4023a = ((j2 & (j3 ^ -1)) << 1) | (j2 & j3);
                if (z) {
                    aVar.a(i2);
                } else {
                    aVar.b(i2);
                }
                if (z2 || aVar.f4024b != null) {
                    aVar.a();
                    aVar = aVar.f4024b;
                    z = z2;
                    i2 = 0;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f4020a.a();
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f4020a.a() - this.f4022c.size();
    }

    public final String toString() {
        return this.f4021b.toString() + ", hidden list:" + this.f4022c.size();
    }

    /* access modifiers changed from: package-private */
    public final View c(int i2) {
        return this.f4020a.b(i2);
    }

    /* access modifiers changed from: package-private */
    public final boolean d(View view) {
        return this.f4022c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public final View b(int i2) {
        return this.f4020a.b(e(i2));
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        int e2 = e(i2);
        this.f4021b.d(e2);
        this.f4020a.c(e2);
    }

    f(b bVar) {
        this.f4020a = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        int e2 = e(i2);
        View b2 = this.f4020a.b(e2);
        if (b2 != null) {
            if (this.f4021b.d(e2)) {
                b(b2);
            }
            this.f4020a.a(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(View view) {
        if (!this.f4022c.remove(view)) {
            return false;
        }
        this.f4020a.d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int c(View view) {
        int a2 = this.f4020a.a(view);
        if (a2 != -1 && !this.f4021b.c(a2)) {
            return a2 - this.f4021b.e(a2);
        }
        return -1;
    }

    private int e(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int a2 = this.f4020a.a();
        int i3 = i2;
        while (i3 < a2) {
            int e2 = i2 - (i3 - this.f4021b.e(i3));
            if (e2 == 0) {
                while (this.f4021b.c(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += e2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        this.f4022c.add(view);
        this.f4020a.c(view);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2, boolean z) {
        int e2;
        if (i2 < 0) {
            e2 = this.f4020a.a();
        } else {
            e2 = e(i2);
        }
        this.f4021b.a(e2, z);
        if (z) {
            a(view);
        }
        this.f4020a.a(view, e2);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int e2;
        if (i2 < 0) {
            e2 = this.f4020a.a();
        } else {
            e2 = e(i2);
        }
        this.f4021b.a(e2, z);
        if (z) {
            a(view);
        }
        this.f4020a.a(view, e2, layoutParams);
    }
}
