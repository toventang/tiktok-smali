package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class y extends ac {

    /* renamed from: b  reason: collision with root package name */
    private x f4221b;

    /* renamed from: c  reason: collision with root package name */
    private x f4222c;

    static {
        Covode.recordClassIndex(1632);
    }

    private x d(RecyclerView.i iVar) {
        x xVar = this.f4221b;
        if (xVar == null || xVar.f4218a != iVar) {
            this.f4221b = x.b(iVar);
        }
        return this.f4221b;
    }

    private x e(RecyclerView.i iVar) {
        x xVar = this.f4222c;
        if (xVar == null || xVar.f4218a != iVar) {
            this.f4222c = x.a(iVar);
        }
        return this.f4222c;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.ac
    public final RecyclerView.r b(RecyclerView.i iVar) {
        if (!(iVar instanceof RecyclerView.r.b)) {
            return null;
        }
        return new r(this.f3954a.getContext()) {
            /* class androidx.recyclerview.widget.y.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1633);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.r
            public final float a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.r
            public final int b(int i2) {
                return Math.min(100, super.b(i2));
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
            public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
                y yVar = y.this;
                int[] a2 = yVar.a(yVar.f3954a.getLayoutManager(), view);
                int i2 = a2[0];
                int i3 = a2[1];
                int a3 = a(Math.max(Math.abs(i2), Math.abs(i3)));
                if (a3 > 0) {
                    aVar.a(i2, i3, a3, this.f4200b);
                }
            }
        };
    }

    @Override // androidx.recyclerview.widget.ac
    public View a(RecyclerView.i iVar) {
        if (iVar.g()) {
            return a(iVar, d(iVar));
        }
        if (iVar.f()) {
            return a(iVar, e(iVar));
        }
        return null;
    }

    private static int a(View view, x xVar) {
        return (xVar.a(view) + (xVar.e(view) / 2)) - (xVar.b() + (xVar.e() / 2));
    }

    private static View a(RecyclerView.i iVar, x xVar) {
        int s = iVar.s();
        View view = null;
        if (s == 0) {
            return null;
        }
        int b2 = xVar.b() + (xVar.e() / 2);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            View g2 = iVar.g(i3);
            int abs = Math.abs((xVar.a(g2) + (xVar.e(g2) / 2)) - b2);
            if (abs < i2) {
                view = g2;
                i2 = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.ac
    public int[] a(RecyclerView.i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.f()) {
            iArr[0] = a(view, e(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.g()) {
            iArr[1] = a(view, d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.ac
    public int a(RecyclerView.i iVar, int i2, int i3) {
        x e2;
        boolean z;
        PointF d2;
        int A = iVar.A();
        if (A == 0) {
            return -1;
        }
        View view = null;
        if (iVar.g()) {
            e2 = d(iVar);
        } else {
            if (iVar.f()) {
                e2 = e(iVar);
            }
            return -1;
        }
        if (e2 != null) {
            int s = iVar.s();
            boolean z2 = false;
            View view2 = null;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < s; i6++) {
                View g2 = iVar.g(i6);
                if (g2 != null) {
                    int a2 = a(g2, e2);
                    if (a2 <= 0) {
                        if (a2 > i4) {
                            view2 = g2;
                            i4 = a2;
                        }
                        if (a2 < 0) {
                        }
                    }
                    if (a2 < i5) {
                        view = g2;
                        i5 = a2;
                    }
                }
            }
            int i7 = 1;
            if (!iVar.f() ? i3 <= 0 : i2 <= 0) {
                z = false;
                if (view2 != null) {
                    return RecyclerView.i.e(view2);
                }
            } else {
                z = true;
                if (view != null) {
                    return RecyclerView.i.e(view);
                }
                view = view2;
            }
            if (view == null) {
                return -1;
            }
            int e3 = RecyclerView.i.e(view);
            int A2 = iVar.A();
            if ((iVar instanceof RecyclerView.r.b) && (d2 = ((RecyclerView.r.b) iVar).d(A2 - 1)) != null && (d2.x < 0.0f || d2.y < 0.0f)) {
                z2 = true;
            }
            if (z2 == z) {
                i7 = -1;
            }
            int i8 = e3 + i7;
            if (i8 < 0 || i8 >= A) {
                return -1;
            }
            return i8;
        }
        return -1;
    }
}
