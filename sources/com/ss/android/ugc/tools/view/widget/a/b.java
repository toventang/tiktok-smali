package com.ss.android.ugc.tools.view.widget.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class b<T> extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    public final List<T> f150339b = new ArrayList();

    static {
        Covode.recordClassIndex(98888);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f150339b.size();
    }

    public final List<T> a() {
        return n.g((Collection) this.f150339b);
    }

    public final T a(int i2) {
        return this.f150339b.get(i2);
    }

    public final void b(List<? extends T> list) {
        this.f150339b.clear();
        if (list != null) {
            this.f150339b.addAll(list);
        }
    }

    public final void a(List<? extends T> list) {
        b(list);
        notifyDataSetChanged();
    }

    public final void a(T t, int i2) {
        if (t != null) {
            this.f150339b.set(i2, t);
            notifyItemChanged(i2);
        }
    }
}
