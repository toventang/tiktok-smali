package com.ss.android.ugc.tools.view.b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.view.widget.AVStatusView;
import com.zhiliaoapp.musically.R;

public abstract class c extends f {

    /* renamed from: i  reason: collision with root package name */
    static final String f150024i = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private int f150025a;

    /* renamed from: b  reason: collision with root package name */
    private String f150026b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f150027c;

    /* renamed from: d  reason: collision with root package name */
    private long f150028d = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f150029j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f150030k;

    /* renamed from: l  reason: collision with root package name */
    public String f150031l;

    /* renamed from: m  reason: collision with root package name */
    public RecyclerView f150032m;
    public b n;
    public a o;
    public GridLayoutManager.c p;

    public interface a {
        static {
            Covode.recordClassIndex(98777);
        }

        void a();
    }

    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public e f150035a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f150036b;

        static {
            Covode.recordClassIndex(98778);
        }

        public final void a() {
            ((AVStatusView) this.itemView).b();
        }

        public final void b() {
            ((AVStatusView) this.itemView).a();
        }

        public b(View view, TextView textView) {
            super(view);
            this.f150036b = textView;
            textView.setOnClickListener(new d(this));
        }
    }

    static {
        Covode.recordClassIndex(98775);
    }

    public final void e() {
        b bVar = this.n;
        if (bVar != null) {
            bVar.b();
        }
        this.f150029j = -1;
        this.f150028d = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.tools.view.b.f
    public int getItemCount() {
        if (a() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    public final void d() {
        b bVar = this.n;
        if (bVar != null) {
            bVar.a();
        }
        this.f150029j = 0;
        if (this.f150028d == -1) {
            this.f150028d = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final void a(RecyclerView.ViewHolder viewHolder) {
        b bVar = (b) viewHolder;
        AVStatusView aVStatusView = (AVStatusView) bVar.itemView;
        aVStatusView.setStatus(c.this.f150029j);
        if (aVStatusView.f150218b == -1 && c.this.o != null) {
            c.this.o.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f150032m = recyclerView;
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.a(new GridLayoutManager.c() {
                /* class com.ss.android.ugc.tools.view.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98776);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.c
                public final int a(int i2) {
                    if (c.this.getItemViewType(i2) == Integer.MIN_VALUE) {
                        return gridLayoutManager.f3760b;
                    }
                    if (c.this.p != null) {
                        return c.this.p.a(i2);
                    }
                    return 1;
                }
            });
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
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (this.f150028d != -1 && !TextUtils.isEmpty(this.f150031l)) {
            g.a().I().a("aweme_feed_load_more_duration", this.f150031l, (float) (System.currentTimeMillis() - this.f150028d));
            this.f150028d = -1;
        }
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        AVStatusView aVStatusView = new AVStatusView(viewGroup.getContext());
        aVStatusView.setLayoutParams(new RecyclerView.j(-1, viewGroup.getResources().getDimensionPixelSize(R.dimen.gz)));
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjc, (ViewGroup) null);
        this.f150027c = textView;
        int i2 = this.f150030k;
        if (i2 != 0) {
            textView.setTextColor(i2);
        }
        int i3 = this.f150025a;
        if (i3 != 0) {
            this.f150027c.setText(i3);
        }
        String str = this.f150026b;
        if (str != null) {
            this.f150027c.setText(str);
        }
        this.f150027c.setGravity(17);
        TextView textView2 = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b47, (ViewGroup) null);
        textView2.setText(R.string.cyt);
        textView2.setGravity(17);
        AVStatusView.a a2 = AVStatusView.a.a(viewGroup.getContext());
        a2.f150223c = this.f150027c;
        a2.f150223c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        aVStatusView.setBuilder(a2.a(textView2));
        b bVar = new b(aVStatusView, textView2);
        this.n = bVar;
        return bVar;
    }
}
