package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.c.d;
import f.a.z;

public abstract class a<T, R> implements d<R>, z<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final z<? super R> f157209a;

    /* renamed from: b  reason: collision with root package name */
    protected b f157210b;

    /* renamed from: c  reason: collision with root package name */
    protected d<T> f157211c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f157212d;

    /* renamed from: e  reason: collision with root package name */
    protected int f157213e;

    static {
        Covode.recordClassIndex(104437);
    }

    @Override // f.a.e.c.i
    public void clear() {
        this.f157211c.clear();
    }

    @Override // f.a.b.b
    public void dispose() {
        this.f157210b.dispose();
    }

    @Override // f.a.b.b
    public boolean isDisposed() {
        return this.f157210b.isDisposed();
    }

    @Override // f.a.e.c.i
    public boolean isEmpty() {
        return this.f157211c.isEmpty();
    }

    @Override // f.a.z
    public void onComplete() {
        if (!this.f157212d) {
            this.f157212d = true;
            this.f157209a.onComplete();
        }
    }

    public a(z<? super R> zVar) {
        this.f157209a = zVar;
    }

    @Override // f.a.e.c.i
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        f.a.c.b.a(th);
        this.f157210b.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    public final int a(int i2) {
        d<T> dVar = this.f157211c;
        if (dVar == null || (i2 & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i2);
        if (requestFusion != 0) {
            this.f157213e = requestFusion;
        }
        return requestFusion;
    }

    @Override // f.a.z
    public void onError(Throwable th) {
        if (this.f157212d) {
            f.a.h.a.a(th);
            return;
        }
        this.f157212d = true;
        this.f157209a.onError(th);
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        if (f.a.e.a.b.validate(this.f157210b, bVar)) {
            this.f157210b = bVar;
            if (bVar instanceof d) {
                this.f157211c = (d) bVar;
            }
            this.f157209a.onSubscribe(this);
        }
    }
}
