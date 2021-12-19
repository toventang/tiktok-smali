package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import h.f.a.m;

public abstract class a<T> extends JobSupport implements d<T>, am {

    /* renamed from: a  reason: collision with root package name */
    protected final f f158944a;

    /* renamed from: b  reason: collision with root package name */
    private final f f158945b;

    static {
        Covode.recordClassIndex(105469);
    }

    /* access modifiers changed from: protected */
    public void a(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    @Override // kotlinx.coroutines.am
    public final f a() {
        return this.f158945b;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void e() {
        d();
    }

    @Override // h.c.d
    public final f getContext() {
        return this.f158945b;
    }

    @Override // kotlinx.coroutines.bz, kotlinx.coroutines.JobSupport
    public boolean b() {
        return super.b();
    }

    public final void cL_() {
        a((bz) this.f158944a.get(bz.f159061c));
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String g() {
        return getClass().getSimpleName() + " was cancelled";
    }

    @Override // kotlinx.coroutines.JobSupport
    public String h() {
        ak akVar;
        String str;
        f fVar = this.f158945b;
        if (ar.f159022b && (akVar = (ak) fVar.get(ak.f159005b)) != null) {
            al alVar = (al) fVar.get(al.f159007b);
            if (alVar == null || (str = alVar.f159008a) == null) {
                str = "coroutine";
            }
            String str2 = str + '#' + akVar.f159006a;
            if (str2 != null) {
                return "\"" + str2 + "\":" + super.h();
            }
        }
        return super.h();
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
        c(obj);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void a_(Throwable th) {
        aj.a(this.f158945b, th);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    public final void a_(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            a(completedExceptionally.cause, completedExceptionally.getHandled());
            return;
        }
        f();
    }

    @Override // h.c.d
    public final void resumeWith(Object obj) {
        Object e2 = e(aa.a(obj));
        if (e2 != cf.f159086b) {
            b(e2);
        }
    }

    public a(f fVar, boolean z) {
        super(z);
        this.f158944a = fVar;
        this.f158945b = fVar.plus(this);
    }

    public final <R> void a(ao aoVar, R r, m<? super R, ? super d<? super T>, ? extends Object> mVar) {
        cL_();
        aoVar.invoke(mVar, r, this);
    }
}
