package com.airbnb.epoxy;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class u extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    s f5103a;

    /* renamed from: b  reason: collision with root package name */
    List<Object> f5104b;

    /* renamed from: c  reason: collision with root package name */
    private q f5105c;

    static {
        Covode.recordClassIndex(2167);
    }

    public final Object a() {
        q qVar = this.f5105c;
        if (qVar != null) {
            return qVar;
        }
        return this.itemView;
    }

    public final s<?> b() {
        c();
        return this.f5103a;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.f5103a == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
    public String toString() {
        return "EpoxyViewHolder{epoxyModel=" + this.f5103a + ", view=" + this.itemView + ", super=" + super.toString() + '}';
    }

    public u(View view) {
        super(view);
    }

    public final void a(s sVar, s<?> sVar2, List<Object> list, int i2) {
        this.f5104b = list;
        if (this.f5105c == null && (sVar instanceof t)) {
            q h2 = ((t) sVar).h();
            this.f5105c = h2;
            h2.a(this.itemView);
        }
        boolean z = sVar instanceof v;
        if (z) {
            a();
            ((v) sVar).b(i2);
        }
        if (sVar2 != null) {
            sVar.a(a(), sVar2);
        } else if (list.isEmpty()) {
            sVar.a(a());
        } else {
            sVar.a(a(), list);
        }
        if (z) {
            a();
            ((v) sVar).c(i2);
        }
        this.f5103a = sVar;
    }
}
