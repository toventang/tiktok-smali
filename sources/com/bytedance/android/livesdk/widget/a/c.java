package com.bytedance.android.livesdk.widget.a;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;

public abstract class c extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    private Scroller f22569a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.n f22570b = new RecyclerView.n() {
        /* class com.bytedance.android.livesdk.widget.a.c.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        boolean f22572a;

        static {
            Covode.recordClassIndex(13308);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            super.a(recyclerView, i2);
            if (i2 == 0) {
                if (!this.f22572a) {
                    this.f22572a = c.this.a();
                } else {
                    this.f22572a = false;
                }
            } else if (i2 == 1) {
                this.f22572a = false;
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    protected RecyclerView f22571d;

    static {
        Covode.recordClassIndex(13307);
    }

    public abstract int a(RecyclerView.i iVar, int i2, int i3);

    public abstract View a(RecyclerView.i iVar);

    public abstract int[] a(RecyclerView.i iVar, View view);

    /* access modifiers changed from: package-private */
    public final boolean a() {
        RecyclerView.i layoutManager;
        View a2;
        RecyclerView recyclerView = this.f22571d;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (a2 = a(layoutManager)) == null) {
            return false;
        }
        int[] a3 = a(layoutManager, a2);
        if (a3[0] == 0 && a3[1] == 0) {
            return false;
        }
        this.f22571d.a(a3[0], a3[1]);
        return true;
    }

    /* access modifiers changed from: protected */
    public r b(RecyclerView.i iVar) {
        if (!(iVar instanceof RecyclerView.r.b)) {
            return null;
        }
        return new r(this.f22571d.getContext()) {
            /* class com.bytedance.android.livesdk.widget.a.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(13309);
            }

            @Override // androidx.recyclerview.widget.r
            public final float a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
            public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
                c cVar = c.this;
                int[] a2 = cVar.a(cVar.f22571d.getLayoutManager(), view);
                int i2 = a2[0];
                int i3 = a2[1];
                int a3 = a(Math.max(Math.abs(i2), Math.abs(i3)));
                if (a3 > 0) {
                    aVar.a(i2, i3, a3, this.f4200b);
                }
            }
        };
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f22571d;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.b(this.f22570b);
                this.f22571d.setOnFlingListener(null);
            }
            this.f22571d = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f22571d.a(this.f22570b);
                this.f22571d.setOnFlingListener(this);
                this.f22569a = new Scroller(this.f22571d.getContext(), new DecelerateInterpolator());
                a();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean a(int i2, int i3) {
        r b2;
        int a2;
        RecyclerView.i layoutManager = this.f22571d.getLayoutManager();
        if (layoutManager == null || this.f22571d.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f22571d.getMinFlingVelocity();
        if ((Math.abs(i3) <= minFlingVelocity && Math.abs(i2) <= minFlingVelocity) || !(layoutManager instanceof RecyclerView.r.b) || (b2 = b(layoutManager)) == null || (a2 = a(layoutManager, i2, i3)) == -1) {
            return false;
        }
        b2.f3862g = a2;
        layoutManager.a(b2);
        return true;
    }
}
