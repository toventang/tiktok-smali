package com.ss.android.ugc.tools.view.b;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.hx;
import java.util.List;

public abstract class a<T> extends c {

    /* renamed from: h  reason: collision with root package name */
    static final String f150018h = a.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    public List<T> f150019f;

    /* renamed from: g  reason: collision with root package name */
    protected int f150020g;

    static {
        Covode.recordClassIndex(98772);
    }

    public a() {
        registerAdapterDataObserver(new RecyclerView.c() {
            /* class com.ss.android.ugc.tools.view.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98773);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a() {
                a aVar = a.this;
                aVar.f150020g = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void b(int i2, int i3) {
                a aVar = a.this;
                aVar.f150020g = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void c(int i2, int i3) {
                a aVar = a.this;
                aVar.f150020g = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3) {
                a aVar = a.this;
                aVar.f150020g = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, int i4) {
                a aVar = a.this;
                aVar.f150020g = aVar.getItemCount();
            }
        });
    }

    @Override // com.ss.android.ugc.tools.view.b.f
    public final int a() {
        List<T> list = this.f150019f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void c() {
        List<T> list = this.f150019f;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    public void b(List<T> list) {
        hx.a(0, new b(this, list));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.tools.view.b.f
    public final void c(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.f150020g = getItemCount();
    }

    public final void c(List<T> list) {
        this.f150019f = list;
        if (this.q) {
            notifyItemRangeInserted(this.f150020g - 1, getItemCount() - this.f150020g);
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyItemRangeInserted(this.f150020g, getItemCount() - this.f150020g);
    }
}
