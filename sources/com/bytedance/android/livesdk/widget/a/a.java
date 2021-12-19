package com.bytedance.android.livesdk.widget.a;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;

public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private b f22561a;

    /* renamed from: b  reason: collision with root package name */
    public int f22562b = 1;

    /* renamed from: c  reason: collision with root package name */
    public int f22563c = 1;

    /* renamed from: e  reason: collision with root package name */
    private b f22564e;

    static {
        Covode.recordClassIndex(13302);
    }

    private int b() {
        return this.f22562b * this.f22563c;
    }

    private b c(RecyclerView.i iVar) {
        b bVar = this.f22561a;
        if (bVar == null || bVar.f22566a != iVar) {
            this.f22561a = b.b(iVar);
        }
        return this.f22561a;
    }

    private b d(RecyclerView.i iVar) {
        b bVar = this.f22564e;
        if (bVar == null || bVar.f22566a != iVar) {
            this.f22564e = b.a(iVar);
        }
        return this.f22564e;
    }

    @Override // com.bytedance.android.livesdk.widget.a.c
    public View a(RecyclerView.i iVar) {
        if (iVar.g()) {
            return a(iVar, c(iVar));
        }
        if (iVar.f()) {
            return a(iVar, d(iVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.widget.a.c
    public final r b(RecyclerView.i iVar) {
        if (!(iVar instanceof RecyclerView.r.b)) {
            return null;
        }
        return new r(this.f22571d.getContext()) {
            /* class com.bytedance.android.livesdk.widget.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13303);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r
            public final PointF c(int i2) {
                return null;
            }

            @Override // androidx.recyclerview.widget.r
            public final float a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            @Override // androidx.recyclerview.widget.r
            public final int b(int i2) {
                return Math.min(100, super.b(i2));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
            public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
                a aVar2 = a.this;
                int[] a2 = aVar2.a(aVar2.f22571d.getLayoutManager(), view);
                int i2 = a2[0];
                int i3 = a2[1];
                int a3 = a(Math.max(Math.abs(i2), Math.abs(i3)));
                if (a3 > 0) {
                    aVar.a(i2, i3, a3, this.f4200b);
                }
            }
        };
    }

    private static View b(RecyclerView.i iVar, b bVar) {
        int s = iVar.s();
        View view = null;
        if (s == 0) {
            return null;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            View g2 = iVar.g(i3);
            int a2 = bVar.a(g2);
            if (a2 < i2) {
                view = g2;
                i2 = a2;
            }
        }
        return view;
    }

    @Override // com.bytedance.android.livesdk.widget.a.c
    public final int[] a(RecyclerView.i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.f()) {
            iArr[0] = a(iVar, view, d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.g()) {
            iArr[1] = a(iVar, view, c(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    private static View a(RecyclerView.i iVar, b bVar) {
        int b2;
        int s = iVar.s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar.p()) {
            b2 = bVar.a() + (bVar.c() / 2);
        } else {
            b2 = bVar.b() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            View g2 = iVar.g(i3);
            int abs = Math.abs((bVar.a(g2) + (bVar.c(g2) / 2)) - b2);
            if (abs < i2) {
                view = g2;
                i2 = abs;
            }
        }
        return view;
    }

    private int a(RecyclerView.i iVar, View view, b bVar) {
        int i2;
        int a2;
        int i3;
        int a3;
        boolean a4 = com.bytedance.android.live.uikit.c.a.a(this.f22571d.getContext());
        if (iVar.f()) {
            int width = this.f22571d.getWidth() / this.f22563c;
            int e2 = RecyclerView.i.e(view);
            int b2 = (e2 / b()) * b();
            if (a4) {
                i3 = ((b() - (e2 - b2)) / this.f22562b) * width;
                a3 = bVar.b(view);
            } else {
                i3 = ((e2 - b2) / this.f22562b) * width;
                a3 = bVar.a(view);
            }
            int i4 = a3 - i3;
            if (i4 > 5 || i4 < -5) {
                return i4;
            }
            return 0;
        }
        int height = this.f22571d.getHeight() / this.f22562b;
        int e3 = RecyclerView.i.e(view);
        int b3 = (e3 / b()) * b();
        if (a4) {
            i2 = ((b() - (e3 - b3)) / this.f22563c) * height;
            a2 = bVar.b(view);
        } else {
            i2 = ((e3 - b3) / this.f22563c) * height;
            a2 = bVar.a(view);
        }
        int i5 = a2 - i2;
        if (i5 > 5 || i5 < -5) {
            return i5;
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.widget.a.c
    public int a(RecyclerView.i iVar, int i2, int i3) {
        View b2;
        int e2;
        boolean z;
        PointF d2;
        int A = iVar.A();
        if (A == 0) {
            return -1;
        }
        if (iVar.g()) {
            b2 = b(iVar, c(iVar));
        } else {
            if (iVar.f()) {
                b2 = b(iVar, d(iVar));
            }
            return -1;
        }
        if (b2 == null || (e2 = RecyclerView.i.e(b2)) == -1) {
            return -1;
        }
        boolean z2 = false;
        if (!iVar.f() ? i3 <= 0 : i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if ((iVar instanceof RecyclerView.r.b) && (d2 = ((RecyclerView.r.b) iVar).d(A - 1)) != null && (d2.x < 0.0f || d2.y < 0.0f)) {
            z2 = true;
        }
        int b3 = (e2 / b()) * b();
        if (z2) {
            if (z) {
                return b3 - b();
            }
            return b3;
        } else if (z) {
            return b3 + b();
        } else {
            return (b3 + b()) - 1;
        }
    }
}
