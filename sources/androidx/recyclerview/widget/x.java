package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.i f4218a;

    /* renamed from: b  reason: collision with root package name */
    int f4219b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f4220c;

    static {
        Covode.recordClassIndex(1629);
    }

    public abstract int a(View view);

    public abstract void a(int i2);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();

    public final int a() {
        if (Integer.MIN_VALUE == this.f4219b) {
            return 0;
        }
        return e() - this.f4219b;
    }

    public static x a(RecyclerView.i iVar) {
        return new x(iVar) {
            /* class androidx.recyclerview.widget.x.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1630);
            }

            @Override // androidx.recyclerview.widget.x
            public final int b() {
                return this.f4218a.t();
            }

            @Override // androidx.recyclerview.widget.x
            public final int d() {
                return this.f4218a.J;
            }

            @Override // androidx.recyclerview.widget.x
            public final int f() {
                return this.f4218a.v();
            }

            @Override // androidx.recyclerview.widget.x
            public final int g() {
                return this.f4218a.H;
            }

            @Override // androidx.recyclerview.widget.x
            public final int h() {
                return this.f4218a.I;
            }

            @Override // androidx.recyclerview.widget.x
            public final int c() {
                return this.f4218a.J - this.f4218a.v();
            }

            @Override // androidx.recyclerview.widget.x
            public final int e() {
                return (this.f4218a.J - this.f4218a.t()) - this.f4218a.v();
            }

            @Override // androidx.recyclerview.widget.x
            public final void a(int i2) {
                this.f4218a.h(i2);
            }

            @Override // androidx.recyclerview.widget.x
            public final int a(View view) {
                return RecyclerView.i.o(view) - ((RecyclerView.j) view.getLayoutParams()).leftMargin;
            }

            @Override // androidx.recyclerview.widget.x
            public final int b(View view) {
                return RecyclerView.i.q(view) + ((RecyclerView.j) view.getLayoutParams()).rightMargin;
            }

            @Override // androidx.recyclerview.widget.x
            public final int d(View view) {
                this.f4218a.a(view, this.f4220c);
                return this.f4220c.left;
            }

            @Override // androidx.recyclerview.widget.x
            public final int c(View view) {
                this.f4218a.a(view, this.f4220c);
                return this.f4220c.right;
            }

            @Override // androidx.recyclerview.widget.x
            public final int f(View view) {
                RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
                return RecyclerView.i.n(view) + jVar.topMargin + jVar.bottomMargin;
            }

            @Override // androidx.recyclerview.widget.x
            public final int e(View view) {
                RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
                return RecyclerView.i.m(view) + jVar.leftMargin + jVar.rightMargin;
            }
        };
    }

    public static x b(RecyclerView.i iVar) {
        return new x(iVar) {
            /* class androidx.recyclerview.widget.x.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1631);
            }

            @Override // androidx.recyclerview.widget.x
            public final int b() {
                return this.f4218a.u();
            }

            @Override // androidx.recyclerview.widget.x
            public final int d() {
                return this.f4218a.K;
            }

            @Override // androidx.recyclerview.widget.x
            public final int f() {
                return this.f4218a.w();
            }

            @Override // androidx.recyclerview.widget.x
            public final int g() {
                return this.f4218a.I;
            }

            @Override // androidx.recyclerview.widget.x
            public final int h() {
                return this.f4218a.H;
            }

            @Override // androidx.recyclerview.widget.x
            public final int c() {
                return this.f4218a.K - this.f4218a.w();
            }

            @Override // androidx.recyclerview.widget.x
            public final int e() {
                return (this.f4218a.K - this.f4218a.u()) - this.f4218a.w();
            }

            @Override // androidx.recyclerview.widget.x
            public final void a(int i2) {
                this.f4218a.i(i2);
            }

            @Override // androidx.recyclerview.widget.x
            public final int a(View view) {
                return RecyclerView.i.p(view) - ((RecyclerView.j) view.getLayoutParams()).topMargin;
            }

            @Override // androidx.recyclerview.widget.x
            public final int b(View view) {
                return RecyclerView.i.r(view) + ((RecyclerView.j) view.getLayoutParams()).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.x
            public final int d(View view) {
                this.f4218a.a(view, this.f4220c);
                return this.f4220c.top;
            }

            @Override // androidx.recyclerview.widget.x
            public final int c(View view) {
                this.f4218a.a(view, this.f4220c);
                return this.f4220c.bottom;
            }

            @Override // androidx.recyclerview.widget.x
            public final int f(View view) {
                RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
                return RecyclerView.i.m(view) + jVar.leftMargin + jVar.rightMargin;
            }

            @Override // androidx.recyclerview.widget.x
            public final int e(View view) {
                RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
                return RecyclerView.i.n(view) + jVar.topMargin + jVar.bottomMargin;
            }
        };
    }

    private x(RecyclerView.i iVar) {
        this.f4219b = Integer.MIN_VALUE;
        this.f4220c = new Rect();
        this.f4218a = iVar;
    }

    /* synthetic */ x(RecyclerView.i iVar, byte b2) {
        this(iVar);
    }

    public static x a(RecyclerView.i iVar, int i2) {
        if (i2 == 0) {
            return a(iVar);
        }
        if (i2 == 1) {
            return b(iVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }
}
