package androidx.recyclerview.widget;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public abstract class ac extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f3954a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f3955b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.n f3956c = new RecyclerView.n() {
        /* class androidx.recyclerview.widget.ac.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        boolean f3957a;

        static {
            Covode.recordClassIndex(1531);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            super.a(recyclerView, i2);
            if (i2 == 0 && this.f3957a) {
                this.f3957a = false;
                ac.this.a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            if (i2 != 0 || i3 != 0) {
                this.f3957a = true;
            }
        }
    };

    static {
        Covode.recordClassIndex(1530);
    }

    public abstract int a(RecyclerView.i iVar, int i2, int i3);

    public abstract View a(RecyclerView.i iVar);

    public abstract int[] a(RecyclerView.i iVar, View view);

    /* access modifiers changed from: package-private */
    public final void a() {
        RecyclerView.i layoutManager;
        View a2;
        RecyclerView recyclerView = this.f3954a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (a2 = a(layoutManager)) != null) {
            int[] a3 = a(layoutManager, a2);
            if (a3[0] != 0 || a3[1] != 0) {
                this.f3954a.a(a3[0], a3[1]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public RecyclerView.r b(RecyclerView.i iVar) {
        return c(iVar);
    }

    /* access modifiers changed from: protected */
    public r c(RecyclerView.i iVar) {
        if (!(iVar instanceof RecyclerView.r.b)) {
            return null;
        }
        return new r(this.f3954a.getContext()) {
            /* class androidx.recyclerview.widget.ac.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1532);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.r
            public final float a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
            public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
                if (ac.this.f3954a != null) {
                    ac acVar = ac.this;
                    int[] a2 = acVar.a(acVar.f3954a.getLayoutManager(), view);
                    int i2 = a2[0];
                    int i3 = a2[1];
                    int a3 = a(Math.max(Math.abs(i2), Math.abs(i3)));
                    if (a3 > 0) {
                        aVar.a(i2, i3, a3, this.f4200b);
                    }
                }
            }
        };
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3954a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.b(this.f3956c);
                this.f3954a.setOnFlingListener(null);
            }
            this.f3954a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f3954a.a(this.f3956c);
                this.f3954a.setOnFlingListener(this);
                this.f3955b = new Scroller(this.f3954a.getContext(), new DecelerateInterpolator());
                a();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public final int[] b(int i2, int i3) {
        this.f3955b.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f3955b.getFinalX(), this.f3955b.getFinalY()};
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean a(int i2, int i3) {
        RecyclerView.r b2;
        int a2;
        RecyclerView.i layoutManager = this.f3954a.getLayoutManager();
        if (layoutManager == null || this.f3954a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3954a.getMinFlingVelocity();
        if ((Math.abs(i3) <= minFlingVelocity && Math.abs(i2) <= minFlingVelocity) || !(layoutManager instanceof RecyclerView.r.b) || (b2 = b(layoutManager)) == null || (a2 = a(layoutManager, i2, i3)) == -1) {
            return false;
        }
        b2.f3862g = a2;
        layoutManager.a(b2);
        return true;
    }
}
