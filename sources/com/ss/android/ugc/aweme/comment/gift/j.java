package com.ss.android.ugc.aweme.comment.gift;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;

public abstract class j extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    private Scroller f71903a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.n f71904b = new RecyclerView.n() {
        /* class com.ss.android.ugc.aweme.comment.gift.j.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        boolean f71906a;

        static {
            Covode.recordClassIndex(44210);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            super.a(recyclerView, i2);
            if (i2 == 0) {
                if (!this.f71906a) {
                    this.f71906a = j.this.a();
                } else {
                    this.f71906a = false;
                }
            } else if (i2 == 1) {
                this.f71906a = false;
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    protected RecyclerView f71905c;

    static {
        Covode.recordClassIndex(44209);
    }

    public abstract int a(RecyclerView.i iVar, int i2, int i3);

    public abstract View a(RecyclerView.i iVar);

    public abstract int[] a(RecyclerView.i iVar, View view);

    /* access modifiers changed from: package-private */
    public final boolean a() {
        RecyclerView.i layoutManager;
        View a2;
        RecyclerView recyclerView = this.f71905c;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (a2 = a(layoutManager)) == null) {
            return false;
        }
        int[] a3 = a(layoutManager, a2);
        if (a3[0] == 0 && a3[1] == 0) {
            return false;
        }
        this.f71905c.a(a3[0], a3[1]);
        return true;
    }

    /* access modifiers changed from: protected */
    public r b(RecyclerView.i iVar) {
        if (!(iVar instanceof RecyclerView.r.b)) {
            return null;
        }
        return new r(this.f71905c.getContext()) {
            /* class com.ss.android.ugc.aweme.comment.gift.j.AnonymousClass2 */

            static {
                Covode.recordClassIndex(44211);
            }

            @Override // androidx.recyclerview.widget.r
            public final float a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
            public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
                j jVar = j.this;
                int[] a2 = jVar.a(jVar.f71905c.getLayoutManager(), view);
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
        RecyclerView recyclerView2 = this.f71905c;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.b(this.f71904b);
                this.f71905c.setOnFlingListener(null);
            }
            this.f71905c = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f71905c.a(this.f71904b);
                this.f71905c.setOnFlingListener(this);
                this.f71903a = new Scroller(this.f71905c.getContext(), new DecelerateInterpolator());
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
        RecyclerView.i layoutManager = this.f71905c.getLayoutManager();
        if (layoutManager == null || this.f71905c.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f71905c.getMinFlingVelocity();
        if ((Math.abs(i3) <= minFlingVelocity && Math.abs(i2) <= minFlingVelocity) || !(layoutManager instanceof RecyclerView.r.b) || (b2 = b(layoutManager)) == null || (a2 = a(layoutManager, i2, i3)) == -1) {
            return false;
        }
        b2.f3862g = a2;
        layoutManager.a(b2);
        return true;
    }
}
