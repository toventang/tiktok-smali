package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.f.a;
import f.a.t;
import f.a.z;
import java.util.concurrent.atomic.AtomicInteger;

public final class b<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final a<? extends T> f157513a;

    /* renamed from: b  reason: collision with root package name */
    final int f157514b = 1;

    /* renamed from: c  reason: collision with root package name */
    final f<? super f.a.b.b> f157515c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicInteger f157516d;

    static {
        Covode.recordClassIndex(104660);
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        this.f157513a.b((z<? super Object>) zVar);
        if (this.f157516d.incrementAndGet() == this.f157514b) {
            this.f157513a.e(this.f157515c);
        }
    }

    public b(a<? extends T> aVar, int i2, f<? super f.a.b.b> fVar) {
        this.f157513a = aVar;
        this.f157515c = fVar;
        this.f157516d = new AtomicInteger();
    }
}
