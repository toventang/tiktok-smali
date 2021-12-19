package androidx.recyclerview.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ae {

    /* renamed from: a  reason: collision with root package name */
    final b f3967a;

    /* renamed from: b  reason: collision with root package name */
    a f3968b = new a();

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(1543);
        }

        int a();

        int a(View view);

        View a(int i2);

        int b();

        int b(View view);
    }

    static {
        Covode.recordClassIndex(1541);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f3969a;

        /* renamed from: b  reason: collision with root package name */
        int f3970b;

        /* renamed from: c  reason: collision with root package name */
        int f3971c;

        /* renamed from: d  reason: collision with root package name */
        int f3972d;

        /* renamed from: e  reason: collision with root package name */
        int f3973e;

        static {
            Covode.recordClassIndex(1542);
        }

        private static int a(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            int i2 = this.f3969a;
            if ((i2 & 7) != 0 && (i2 & (a(this.f3972d, this.f3970b) << 0)) == 0) {
                return false;
            }
            int i3 = this.f3969a;
            if ((i3 & 112) != 0 && (i3 & (a(this.f3972d, this.f3971c) << 4)) == 0) {
                return false;
            }
            int i4 = this.f3969a;
            if ((i4 & 1792) != 0 && (i4 & (a(this.f3973e, this.f3970b) << 8)) == 0) {
                return false;
            }
            int i5 = this.f3969a;
            if ((i5 & 28672) == 0 || (i5 & (a(this.f3973e, this.f3971c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            this.f3969a = i2 | this.f3969a;
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3, int i4, int i5) {
            this.f3970b = i2;
            this.f3971c = i3;
            this.f3972d = i4;
            this.f3973e = i5;
        }
    }

    ae(b bVar) {
        this.f3967a = bVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view) {
        this.f3968b.a(this.f3967a.a(), this.f3967a.b(), this.f3967a.a(view), this.f3967a.b(view));
        this.f3968b.f3969a = 0;
        this.f3968b.a(24579);
        return this.f3968b.a();
    }

    /* access modifiers changed from: package-private */
    public final View a(int i2, int i3, int i4, int i5) {
        int i6;
        int a2 = this.f3967a.a();
        int b2 = this.f3967a.b();
        if (i3 > i2) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        View view = null;
        while (i2 != i3) {
            View a3 = this.f3967a.a(i2);
            this.f3968b.a(a2, b2, this.f3967a.a(a3), this.f3967a.b(a3));
            if (i4 != 0) {
                this.f3968b.f3969a = 0;
                this.f3968b.a(i4);
                if (this.f3968b.a()) {
                    return a3;
                }
            }
            if (i5 != 0) {
                this.f3968b.f3969a = 0;
                this.f3968b.a(i5);
                if (this.f3968b.a()) {
                    view = a3;
                }
            }
            i2 += i6;
        }
        return view;
    }
}
