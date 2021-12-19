package f.a.e.h;

import com.bytedance.covode.number.Covode;
import f.a.c.b;
import f.a.e.c.f;
import org.a.d;

public abstract class a<T, R> implements f.a.e.c.a<T>, f<R> {

    /* renamed from: e  reason: collision with root package name */
    protected final f.a.e.c.a<? super R> f157926e;

    /* renamed from: f  reason: collision with root package name */
    protected d f157927f;

    /* renamed from: g  reason: collision with root package name */
    protected f<T> f157928g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f157929h;

    /* renamed from: i  reason: collision with root package name */
    protected int f157930i;

    static {
        Covode.recordClassIndex(104849);
    }

    @Override // org.a.d
    public void cancel() {
        this.f157927f.cancel();
    }

    @Override // f.a.e.c.i
    public void clear() {
        this.f157928g.clear();
    }

    @Override // f.a.e.c.i
    public boolean isEmpty() {
        return this.f157928g.isEmpty();
    }

    @Override // org.a.c
    public void onComplete() {
        if (!this.f157929h) {
            this.f157929h = true;
            this.f157926e.onComplete();
        }
    }

    public a(f.a.e.c.a<? super R> aVar) {
        this.f157926e = aVar;
    }

    @Override // f.a.e.c.i
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.a.d
    public void request(long j2) {
        this.f157927f.request(j2);
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        b.a(th);
        this.f157927f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    public final int a(int i2) {
        f<T> fVar = this.f157928g;
        if (fVar == null || (i2 & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i2);
        if (requestFusion != 0) {
            this.f157930i = requestFusion;
        }
        return requestFusion;
    }

    @Override // org.a.c
    public void onError(Throwable th) {
        if (this.f157929h) {
            f.a.h.a.a(th);
            return;
        }
        this.f157929h = true;
        this.f157926e.onError(th);
    }

    @Override // org.a.c, f.a.l
    public final void onSubscribe(d dVar) {
        if (f.a.e.i.f.validate(this.f157927f, dVar)) {
            this.f157927f = dVar;
            if (dVar instanceof f) {
                this.f157928g = (f) dVar;
            }
            this.f157926e.onSubscribe(this);
        }
    }
}
