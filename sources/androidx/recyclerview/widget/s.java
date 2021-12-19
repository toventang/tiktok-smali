package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class s extends ac {

    /* renamed from: b  reason: collision with root package name */
    private x f4205b;

    /* renamed from: c  reason: collision with root package name */
    private x f4206c;

    static {
        Covode.recordClassIndex(1620);
    }

    private x d(RecyclerView.i iVar) {
        x xVar = this.f4205b;
        if (xVar == null || xVar.f4218a != iVar) {
            this.f4205b = x.b(iVar);
        }
        return this.f4205b;
    }

    private x e(RecyclerView.i iVar) {
        x xVar = this.f4206c;
        if (xVar == null || xVar.f4218a != iVar) {
            this.f4206c = x.a(iVar);
        }
        return this.f4206c;
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

    private static float b(RecyclerView.i iVar, x xVar) {
        int max;
        int s = iVar.s();
        if (s == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < s; i4++) {
            View g2 = iVar.g(i4);
            int e2 = RecyclerView.i.e(g2);
            if (e2 != -1) {
                if (e2 < i2) {
                    view = g2;
                    i2 = e2;
                }
                if (e2 > i3) {
                    view2 = g2;
                    i3 = e2;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(xVar.b(view), xVar.b(view2)) - Math.min(xVar.a(view), xVar.a(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i3 - i2) + 1));
    }

    @Override // androidx.recyclerview.widget.ac
    public final int[] a(RecyclerView.i iVar, View view) {
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
    public final int a(RecyclerView.i iVar, int i2, int i3) {
        int A;
        View a2;
        int e2;
        int i4;
        PointF d2;
        int i5;
        int i6;
        if (!(iVar instanceof RecyclerView.r.b) || (A = iVar.A()) == 0 || (a2 = a(iVar)) == null || (e2 = RecyclerView.i.e(a2)) == -1 || (d2 = ((RecyclerView.r.b) iVar).d(A - 1)) == null) {
            return -1;
        }
        int i7 = 0;
        if (iVar.f()) {
            i5 = a(iVar, e(iVar), i2, 0);
            if (d2.x < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (iVar.g()) {
            i6 = a(iVar, d(iVar), 0, i3);
            if (d2.y < 0.0f) {
                i6 = -i6;
            }
        } else {
            i6 = 0;
        }
        if (iVar.g()) {
            i5 = i6;
        }
        if (i5 == 0) {
            return -1;
        }
        int i8 = e2 + i5;
        if (i8 >= 0) {
            i7 = i8;
        }
        return i7 >= A ? i4 : i7;
    }

    private int a(RecyclerView.i iVar, x xVar, int i2, int i3) {
        int i4;
        int[] b2 = b(i2, i3);
        float b3 = b(iVar, xVar);
        if (b3 <= 0.0f) {
            return 0;
        }
        if (Math.abs(b2[0]) > Math.abs(b2[1])) {
            i4 = b2[0];
        } else {
            i4 = b2[1];
        }
        return Math.round(((float) i4) / b3);
    }
}
