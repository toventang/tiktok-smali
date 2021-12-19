package com.ss.android.ugc.aweme.autoplay.d;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class f extends e {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f67397c;

    /* renamed from: d  reason: collision with root package name */
    public final int f67398d;

    static {
        Covode.recordClassIndex(41504);
    }

    public f(boolean z, int i2) {
        this.f67397c = z;
        this.f67398d = i2;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.e
    public int a(View view, x xVar) {
        l.d(view, "");
        l.d(xVar, "");
        if (!this.f67397c) {
            return xVar.a(view) - xVar.b();
        }
        return (this.f67398d - xVar.b()) - xVar.b(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.autoplay.d.e
    public final View a(RecyclerView.i iVar, x xVar) {
        int i2;
        l.d(iVar, "");
        l.d(xVar, "");
        int s = iVar.s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
            if (linearLayoutManager.n() == linearLayoutManager.A() - 1) {
                return null;
            }
        }
        int i3 = 0;
        if (iVar.p()) {
            i2 = xVar.b();
        } else {
            i2 = 0;
        }
        int i4 = Integer.MAX_VALUE;
        if (!this.f67397c) {
            int i5 = s - 1;
            if (i5 >= 0) {
                while (true) {
                    View g2 = iVar.g(i3);
                    int abs = Math.abs(xVar.a(g2) - i2);
                    if (abs < i4) {
                        view = g2;
                        i4 = abs;
                    }
                    if (i3 == i5) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            int i6 = this.f67398d;
            int i7 = s - 1;
            if (i7 >= 0) {
                while (true) {
                    View g3 = iVar.g(i3);
                    int abs2 = Math.abs((i6 - xVar.b(g3)) - i2);
                    if (abs2 < i4) {
                        view = g3;
                        i4 = abs2;
                    }
                    if (i3 == i7) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.y, com.ss.android.ugc.aweme.autoplay.d.e, androidx.recyclerview.widget.ac
    public final int[] a(RecyclerView.i iVar, View view) {
        l.d(iVar, "");
        l.d(view, "");
        int[] iArr = new int[2];
        int i2 = 0;
        do {
            iArr[i2] = 0;
            i2++;
        } while (i2 < 2);
        if (!iVar.f()) {
            iArr[0] = 0;
        } else if (!this.f67397c) {
            iArr[0] = a(view, e(iVar));
        } else {
            iArr[0] = a(view, e(iVar)) * -1;
        }
        if (iVar.g()) {
            iArr[1] = a(view, d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.y, androidx.recyclerview.widget.ac
    public final int a(RecyclerView.i iVar, int i2, int i3) {
        View a2;
        int e2;
        l.d(iVar, "");
        if (!this.f67397c) {
            return super.a(iVar, i2, i3);
        }
        if (iVar.A() == 0) {
            return -1;
        }
        if (iVar.g()) {
            a2 = a(iVar, d(iVar));
        } else {
            if (iVar.f()) {
                a2 = a(iVar, e(iVar));
            }
            return -1;
        }
        if (a2 == null || (e2 = RecyclerView.i.e(a2)) == -1) {
            return -1;
        }
        return e2;
    }
}
