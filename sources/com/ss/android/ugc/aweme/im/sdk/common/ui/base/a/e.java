package com.ss.android.ugc.aweme.im.sdk.common.ui.base.a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;

public final class e<T extends RecyclerView.a<?>> implements g {

    /* renamed from: a  reason: collision with root package name */
    private final T f102527a;

    /* renamed from: b  reason: collision with root package name */
    private final b<Integer, Integer> f102528b;

    static {
        Covode.recordClassIndex(65660);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.g
    public final void a() {
        this.f102527a.notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(T t, b<? super Integer, Integer> bVar) {
        l.d(t, "");
        l.d(bVar, "");
        this.f102527a = t;
        this.f102528b = bVar;
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3) {
        if (i3 != 0) {
            this.f102527a.notifyItemRangeInserted(this.f102528b.invoke(Integer.valueOf(i2)).intValue(), i3);
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void b(int i2, int i3) {
        if (i3 != 0) {
            if (i2 == 0 && i3 == this.f102527a.getItemCount()) {
                this.f102527a.notifyDataSetChanged();
            }
            this.f102527a.notifyItemRangeRemoved(this.f102528b.invoke(Integer.valueOf(i2)).intValue(), i3);
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void c(int i2, int i3) {
        this.f102527a.notifyItemMoved(this.f102528b.invoke(Integer.valueOf(i2)).intValue(), this.f102528b.invoke(Integer.valueOf(i3)).intValue());
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3, Object obj) {
        this.f102527a.notifyItemRangeChanged(this.f102528b.invoke(Integer.valueOf(i2)).intValue(), i3, obj);
    }
}
