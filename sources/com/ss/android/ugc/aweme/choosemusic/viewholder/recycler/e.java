package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ac;
import androidx.recyclerview.widget.x;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e extends ac {

    /* renamed from: b  reason: collision with root package name */
    public x f70981b;

    /* renamed from: c  reason: collision with root package name */
    public x f70982c;

    /* renamed from: d  reason: collision with root package name */
    private final int f70983d = 3;

    static {
        Covode.recordClassIndex(43710);
    }

    private final x d(RecyclerView.i iVar) {
        if (this.f70982c == null) {
            x a2 = x.a(iVar);
            l.b(a2, "");
            this.f70982c = a2;
        }
        x xVar = this.f70982c;
        if (xVar == null) {
            l.a("horizontalHelper");
        }
        return xVar;
    }

    private final x e(RecyclerView.i iVar) {
        if (this.f70981b == null) {
            x b2 = x.b(iVar);
            l.b(b2, "");
            this.f70981b = b2;
        }
        x xVar = this.f70981b;
        if (xVar == null) {
            l.a("verticalHelper");
        }
        return xVar;
    }

    @Override // androidx.recyclerview.widget.ac
    public final View a(RecyclerView.i iVar) {
        l.d(iVar, "");
        if (iVar.g()) {
            return a(iVar, e(iVar));
        }
        if (iVar.f()) {
            return a(iVar, d(iVar));
        }
        return null;
    }

    private static int a(View view, x xVar) {
        return xVar.a(view) - xVar.b();
    }

    private final View a(RecyclerView.i iVar, x xVar) {
        boolean z;
        if (!(iVar instanceof LinearLayoutManager)) {
            return a(iVar);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
        int k2 = linearLayoutManager.k();
        if (linearLayoutManager.n() == iVar.A() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (k2 == -1) {
            return null;
        }
        if (z) {
            return iVar.c(k2);
        }
        View c2 = iVar.c(k2);
        if (xVar.b(c2) >= xVar.e(c2) / 2 && xVar.b(c2) > 0) {
            return c2;
        }
        if (linearLayoutManager.n() == iVar.A() - 1) {
            return null;
        }
        return iVar.c(k2 + 1);
    }

    @Override // androidx.recyclerview.widget.ac
    public final int[] a(RecyclerView.i iVar, View view) {
        l.d(iVar, "");
        l.d(view, "");
        int[] iArr = new int[2];
        if (iVar.f()) {
            iArr[0] = a(view, d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.g()) {
            iArr[1] = a(view, e(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.ac
    public final int a(RecyclerView.i iVar, int i2, int i3) {
        View a2;
        int e2;
        boolean z;
        PointF d2;
        l.d(iVar, "");
        int A = iVar.A();
        if (A == 0) {
            return -1;
        }
        if (iVar.g()) {
            a2 = a(iVar, e(iVar));
        } else {
            if (iVar.f()) {
                a2 = a(iVar, d(iVar));
            }
            return -1;
        }
        if (a2 == null || (e2 = RecyclerView.i.e(a2)) == -1) {
            return -1;
        }
        if (!iVar.f() ? i3 <= 0 : i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!(iVar instanceof RecyclerView.r.b) || (d2 = ((RecyclerView.r.b) iVar).d(A - 1)) == null || (d2.x >= 0.0f && d2.y >= 0.0f)) {
            if (z) {
                return e2 + this.f70983d;
            }
            return e2;
        } else if (z) {
            return e2 - this.f70983d;
        } else {
            return e2;
        }
    }
}
