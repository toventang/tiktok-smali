package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView.a f3989a;

    static {
        Covode.recordClassIndex(1553);
    }

    public b(RecyclerView.a aVar) {
        this.f3989a = aVar;
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3) {
        this.f3989a.notifyItemRangeInserted(i2, i3);
    }

    @Override // androidx.recyclerview.widget.u
    public final void b(int i2, int i3) {
        this.f3989a.notifyItemRangeRemoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.u
    public final void c(int i2, int i3) {
        this.f3989a.notifyItemMoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.u
    public final void a(int i2, int i3, Object obj) {
        this.f3989a.notifyItemRangeChanged(i2, i3, obj);
    }
}
