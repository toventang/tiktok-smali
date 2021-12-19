package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class t<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.a<VH> {

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f4207a;

    /* renamed from: b  reason: collision with root package name */
    private final d.a<T> f4208b;

    static {
        Covode.recordClassIndex(1621);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f4207a.f4004f.size();
    }

    public final void a(List<T> list) {
        this.f4207a.a(list, null);
    }

    public final T a(int i2) {
        return this.f4207a.f4004f.get(i2);
    }

    public t(j.e<T> eVar) {
        AnonymousClass1 r3 = new d.a<T>() {
            /* class androidx.recyclerview.widget.t.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1622);
            }
        };
        this.f4208b = r3;
        d<T> dVar = new d<>(new b(this), new c.a(eVar).a());
        this.f4207a = dVar;
        dVar.f4002d.add(r3);
    }

    public final void a(List<T> list, Runnable runnable) {
        this.f4207a.a(list, runnable);
    }
}
