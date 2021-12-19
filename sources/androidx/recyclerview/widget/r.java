package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class r extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    protected final LinearInterpolator f4199a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    protected final DecelerateInterpolator f4200b = new DecelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    protected PointF f4201c;

    /* renamed from: d  reason: collision with root package name */
    protected int f4202d = 0;

    /* renamed from: e  reason: collision with root package name */
    protected int f4203e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final DisplayMetrics f4204f;
    private boolean n = false;
    private float o;

    static {
        Covode.recordClassIndex(1619);
    }

    private static int b(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a() {
        this.f4203e = 0;
        this.f4202d = 0;
        this.f4201c = null;
    }

    /* access modifiers changed from: protected */
    public int b() {
        PointF pointF = this.f4201c;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        if (this.f4201c.x > 0.0f) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int c() {
        PointF pointF = this.f4201c;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        if (this.f4201c.y > 0.0f) {
            return 1;
        }
        return -1;
    }

    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public final int a(int i2) {
        double b2 = (double) b(i2);
        Double.isNaN(b2);
        return (int) Math.ceil(b2 / 0.3356d);
    }

    public r(Context context) {
        this.f4204f = context.getResources().getDisplayMetrics();
    }

    public int b(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.n) {
            this.o = a(this.f4204f);
            this.n = true;
        }
        return (int) Math.ceil((double) (abs * this.o));
    }

    public int a(View view, int i2) {
        RecyclerView.i iVar = this.f3864i;
        if (iVar == null || !iVar.g()) {
            return 0;
        }
        RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
        return a(RecyclerView.i.p(view) - jVar.topMargin, RecyclerView.i.r(view) + jVar.bottomMargin, iVar.u(), iVar.K - iVar.w(), i2);
    }

    public int b(View view, int i2) {
        RecyclerView.i iVar = this.f3864i;
        if (iVar == null || !iVar.f()) {
            return 0;
        }
        RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
        return a(RecyclerView.i.o(view) - jVar.leftMargin, RecyclerView.i.q(view) + jVar.rightMargin, iVar.t(), iVar.J - iVar.v(), i2);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i2, int i3, RecyclerView.r.a aVar) {
        if (this.f3863h.o.s() == 0) {
            d();
            return;
        }
        this.f4202d = b(this.f4202d, i2);
        int b2 = b(this.f4203e, i3);
        this.f4203e = b2;
        if (this.f4202d == 0 && b2 == 0) {
            PointF c2 = c(this.f3862g);
            if (c2 == null || (c2.x == 0.0f && c2.y == 0.0f)) {
                aVar.f3872d = this.f3862g;
                d();
                return;
            }
            float sqrt = (float) Math.sqrt((double) ((c2.x * c2.x) + (c2.y * c2.y)));
            c2.x /= sqrt;
            c2.y /= sqrt;
            this.f4201c = c2;
            this.f4202d = (int) (c2.x * 10000.0f);
            this.f4203e = (int) (c2.y * 10000.0f);
            aVar.a((int) (((float) this.f4202d) * 1.2f), (int) (((float) this.f4203e) * 1.2f), (int) (((float) b(10000)) * 1.2f), this.f4199a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
        int b2 = b(view, b());
        int a2 = a(view, c());
        int a3 = a((int) Math.sqrt((double) ((b2 * b2) + (a2 * a2))));
        if (a3 > 0) {
            aVar.a(-b2, -a2, a3, this.f4200b);
        }
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }
}
