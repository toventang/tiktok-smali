package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public abstract class ab extends RecyclerView.f {

    /* renamed from: m  reason: collision with root package name */
    public boolean f3953m = true;

    static {
        Covode.recordClassIndex(1529);
    }

    public abstract boolean a(RecyclerView.ViewHolder viewHolder);

    public abstract boolean a(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5);

    public abstract boolean a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5);

    public abstract boolean b(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean g(RecyclerView.ViewHolder viewHolder) {
        if (!this.f3953m || viewHolder.isInvalid()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean c(RecyclerView.ViewHolder viewHolder, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        if (cVar.f3834a != cVar2.f3834a || cVar.f3835b != cVar2.f3835b) {
            return a(viewHolder, cVar.f3834a, cVar.f3835b, cVar2.f3834a, cVar2.f3835b);
        }
        f(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean a(RecyclerView.ViewHolder viewHolder, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.f3834a;
        int i5 = cVar.f3835b;
        View view = viewHolder.itemView;
        if (cVar2 == null) {
            i2 = view.getLeft();
        } else {
            i2 = cVar2.f3834a;
        }
        if (cVar2 == null) {
            i3 = view.getTop();
        } else {
            i3 = cVar2.f3835b;
        }
        if (viewHolder.isRemoved() || (i4 == i2 && i5 == i3)) {
            return a(viewHolder);
        }
        view.layout(i2, i3, view.getWidth() + i2, view.getHeight() + i3);
        return a(viewHolder, i4, i5, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean b(RecyclerView.ViewHolder viewHolder, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        if (cVar == null || (cVar.f3834a == cVar2.f3834a && cVar.f3835b == cVar2.f3835b)) {
            return b(viewHolder);
        }
        return a(viewHolder, cVar.f3834a, cVar.f3835b, cVar2.f3834a, cVar2.f3835b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.f.c cVar, RecyclerView.f.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.f3834a;
        int i5 = cVar.f3835b;
        if (viewHolder2.shouldIgnore()) {
            i2 = cVar.f3834a;
            i3 = cVar.f3835b;
        } else {
            i2 = cVar2.f3834a;
            i3 = cVar2.f3835b;
        }
        return a(viewHolder, viewHolder2, i4, i5, i2, i3);
    }
}
