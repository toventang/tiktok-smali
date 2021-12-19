package f.a.e.h;

import com.bytedance.covode.number.Covode;
import f.a.e.c.f;
import f.a.h.a;
import f.a.l;
import org.a.c;
import org.a.d;

public abstract class b<T, R> implements f<R>, l<T> {

    /* renamed from: e  reason: collision with root package name */
    protected final c<? super R> f157931e;

    /* renamed from: f  reason: collision with root package name */
    protected d f157932f;

    /* renamed from: g  reason: collision with root package name */
    protected f<T> f157933g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f157934h;

    /* renamed from: i  reason: collision with root package name */
    protected int f157935i;

    static {
        Covode.recordClassIndex(104850);
    }

    @Override // org.a.d
    public void cancel() {
        this.f157932f.cancel();
    }

    @Override // f.a.e.c.i
    public void clear() {
        this.f157933g.clear();
    }

    @Override // f.a.e.c.i
    public boolean isEmpty() {
        return this.f157933g.isEmpty();
    }

    @Override // org.a.c
    public void onComplete() {
        if (!this.f157934h) {
            this.f157934h = true;
            this.f157931e.onComplete();
        }
    }

    public b(c<? super R> cVar) {
        this.f157931e = cVar;
    }

    @Override // f.a.e.c.i
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.a.d
    public void request(long j2) {
        this.f157932f.request(j2);
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        f.a.c.b.a(th);
        this.f157932f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    public final int a(int i2) {
        f<T> fVar = this.f157933g;
        if (fVar == null || (i2 & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i2);
        if (requestFusion != 0) {
            this.f157935i = requestFusion;
        }
        return requestFusion;
    }

    @Override // org.a.c
    public void onError(Throwable th) {
        if (this.f157934h) {
            a.a(th);
            return;
        }
        this.f157934h = true;
        this.f157931e.onError(th);
    }

    @Override // org.a.c, f.a.l
    public final void onSubscribe(d dVar) {
        if (f.a.e.i.f.validate(this.f157932f, dVar)) {
            this.f157932f = dVar;
            if (dVar instanceof f) {
                this.f157933g = (f) dVar;
            }
            this.f157931e.onSubscribe(this);
        }
    }
}
