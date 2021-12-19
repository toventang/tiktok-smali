package androidx.work.impl.a.a;

import androidx.work.impl.a.b.d;
import androidx.work.impl.b.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public abstract class c<T> implements androidx.work.impl.a.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f4517a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public T f4518b;

    /* renamed from: c  reason: collision with root package name */
    public d<T> f4519c;

    /* renamed from: d  reason: collision with root package name */
    private a f4520d;

    public interface a {
        static {
            Covode.recordClassIndex(1768);
        }

        void b(List<String> list);

        void c(List<String> list);
    }

    static {
        Covode.recordClassIndex(1767);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean a(g gVar);

    public abstract boolean b(T t);

    private void a() {
        if (!this.f4517a.isEmpty() && this.f4520d != null) {
            T t = this.f4518b;
            if (t == null || b(t)) {
                this.f4520d.c(this.f4517a);
            } else {
                this.f4520d.b(this.f4517a);
            }
        }
    }

    @Override // androidx.work.impl.a.a
    public final void a(T t) {
        this.f4518b = t;
        a();
    }

    c(d<T> dVar) {
        this.f4519c = dVar;
    }

    public final void a(a aVar) {
        if (this.f4520d != aVar) {
            this.f4520d = aVar;
            a();
        }
    }

    public final void a(List<g> list) {
        this.f4517a.clear();
        for (g gVar : list) {
            if (a(gVar)) {
                this.f4517a.add(gVar.f4578a);
            }
        }
        if (this.f4517a.isEmpty()) {
            this.f4519c.b(this);
        } else {
            this.f4519c.a((androidx.work.impl.a.a) this);
        }
        a();
    }
}
