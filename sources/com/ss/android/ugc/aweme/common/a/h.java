package com.ss.android.ugc.aweme.common.a;

import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.o;
import com.zhiliaoapp.musically.R;

public abstract class h extends l {
    static final String o = h.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private long f76357a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f76358b = false;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.n f76359c = new RecyclerView.n() {
        /* class com.ss.android.ugc.aweme.common.a.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(47127);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            if (i3 >= 0 && h.this.h()) {
                recyclerView.i();
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final RecyclerView.l f76360d = new RecyclerView.l() {
        /* class com.ss.android.ugc.aweme.common.a.h.AnonymousClass2 */

        static {
            Covode.recordClassIndex(47128);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final boolean a(int i2, int i3) {
            if (i3 < 0) {
                return false;
            }
            return h.this.h();
        }
    };
    public String p;
    public RecyclerView q;
    public a r;
    public GridLayoutManager.c s;
    public m t;
    public final b u = new b();

    public interface a {
        static {
            Covode.recordClassIndex(47130);
        }

        void l();
    }

    /* access modifiers changed from: protected */
    public void b(View view) {
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return false;
    }

    public void ai_() {
        c(false);
    }

    static {
        Covode.recordClassIndex(47126);
    }

    public void ah_() {
        this.u.f76366b = 1;
        e();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        if (c() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    public final void i() {
        this.u.f76366b = 2;
        e();
    }

    public final void j() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            a(recyclerView, true);
        }
    }

    public final void k() {
        a(d.a().getString(R.string.b40));
    }

    private void e() {
        if (this.v && this.q != null) {
            this.q.post(new i(this, new RuntimeException("Notify when recyclerview scroll or layout")));
        }
    }

    public void ag_() {
        this.u.f76366b = 0;
        e();
        if (this.f76357a == -1) {
            this.f76357a = System.currentTimeMillis();
        }
    }

    public final boolean h() {
        if (this.q != null && g() && this.f76358b && !this.q.canScrollVertically(1)) {
            return true;
        }
        return false;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f76365a;

        /* renamed from: b  reason: collision with root package name */
        public int f76366b = -1;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f76367c = d.a().getString(R.string.cyu);

        /* renamed from: d  reason: collision with root package name */
        public int f76368d = -16777216;

        /* renamed from: e  reason: collision with root package name */
        public MovementMethod f76369e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f76370f = d.a().getString(R.string.cyt);

        /* renamed from: g  reason: collision with root package name */
        public int f76371g = -16777216;

        static {
            Covode.recordClassIndex(47131);
        }

        protected b() {
        }
    }

    public class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        k f76372a;

        /* renamed from: c  reason: collision with root package name */
        private final TextView f76374c;

        /* renamed from: d  reason: collision with root package name */
        private final TextView f76375d;

        static {
            Covode.recordClassIndex(47132);
        }

        public void a() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.itemView;
            this.f76375d.setText(h.this.u.f76370f);
            this.f76375d.setTextColor(h.this.u.f76371g);
            this.f76374c.setText(h.this.u.f76367c);
            this.f76374c.setTextColor(h.this.u.f76368d);
            if (h.this.u.f76369e != null) {
                this.f76374c.setMovementMethod(h.this.u.f76369e);
            }
            if (h.this.u.f76366b == -1) {
                dmtStatusView.d();
                if (h.this.u.f76365a) {
                    dmtStatusView.setVisibility(8);
                }
            } else if (h.this.u.f76366b == 1) {
                dmtStatusView.g();
            } else if (h.this.u.f76366b == 0) {
                dmtStatusView.d();
                dmtStatusView.f();
            } else if (h.this.u.f76366b == 2) {
                RecyclerView recyclerView = h.this.q;
                DmtStatusView dmtStatusView2 = (DmtStatusView) this.itemView;
                if (!TextUtils.equals(this.f76375d.getText(), this.f76375d.getResources().getString(R.string.f16))) {
                    this.f76375d.setText(R.string.f16);
                }
                dmtStatusView2.h();
                if (this.f76372a == null) {
                    this.f76372a = new k(recyclerView, h.this.r);
                }
                this.f76372a.f76379a = true;
            }
            if (dmtStatusView.e() && h.this.r != null) {
                h.this.r.l();
            }
        }

        public c(ViewGroup viewGroup) {
            super(new DmtStatusView(viewGroup.getContext()));
            MethodCollector.i(4330);
            DmtStatusView dmtStatusView = (DmtStatusView) this.itemView;
            int c_ = h.this.c_(viewGroup);
            h.this.b((View) dmtStatusView);
            dmtStatusView.setLayoutParams(new RecyclerView.j(-1, c_));
            TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjc, (ViewGroup) null);
            this.f76374c = textView;
            textView.setGravity(17);
            TextView textView2 = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjd, (ViewGroup) null);
            this.f76375d = textView2;
            textView2.setText(R.string.cyt);
            textView2.setGravity(17);
            dmtStatusView.setBuilder(DmtStatusView.a.a(viewGroup.getContext()).b(textView).c(textView2));
            textView2.setOnClickListener(new j(this));
            MethodCollector.o(4330);
        }
    }

    public void a(a aVar) {
        this.r = aVar;
    }

    public final void f(int i2) {
        g(i2);
    }

    public final void a(MovementMethod movementMethod) {
        this.u.f76369e = movementMethod;
        e();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        return b(viewGroup);
    }

    public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    public final void g(int i2) {
        this.u.f76368d = i2;
        e();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public void a(RecyclerView.ViewHolder viewHolder) {
        ((c) viewHolder).a();
    }

    public int c_(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.gz);
    }

    public final void c(boolean z) {
        if (z) {
            this.u.f76365a = true;
        }
        this.u.f76366b = -1;
        e();
        this.f76357a = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.b(this.f76359c);
        if (recyclerView.getOnFlingListener() == this.f76360d) {
            recyclerView.setOnFlingListener(null);
        }
    }

    public final void a(CharSequence charSequence) {
        this.u.f76367c = charSequence;
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.q = recyclerView;
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.a(new GridLayoutManager.c() {
                /* class com.ss.android.ugc.aweme.common.a.h.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(47129);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.c
                public final int a(int i2) {
                    int itemViewType = h.this.getItemViewType(i2);
                    if (itemViewType == Integer.MIN_VALUE) {
                        return gridLayoutManager.f3760b;
                    }
                    if (h.this.t != null) {
                        return h.this.t.b(itemViewType);
                    }
                    if (h.this.s != null) {
                        return h.this.s.a(i2);
                    }
                    return 1;
                }
            });
        }
        recyclerView.a(this.f76359c);
        if (recyclerView.getOnFlingListener() == null) {
            recyclerView.setOnFlingListener(this.f76360d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        super.onViewAttachedToWindow(viewHolder);
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.b)) {
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            bVar.f3934b = z;
        }
        if (viewHolder instanceof c) {
            this.f76358b = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (this.f76357a != -1 && !TextUtils.isEmpty(this.p)) {
            o.b("aweme_feed_load_more_duration", this.p, (float) (System.currentTimeMillis() - this.f76357a));
            this.f76357a = -1;
        }
        if (viewHolder instanceof c) {
            this.f76358b = false;
        }
    }

    public void a(Exception exc) {
        if (this.v && getItemCount() > 0) {
            notifyItemChanged(getItemCount() - 1);
        }
    }

    public final void a(RecyclerView recyclerView, boolean z) {
        this.u.f76366b = 2;
        e();
        if (z) {
            new com.bytedance.tux.g.b(recyclerView).e(R.string.cys).b();
        }
    }
}
