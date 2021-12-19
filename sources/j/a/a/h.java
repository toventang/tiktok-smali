package j.a.a;

import com.bytedance.covode.number.Covode;

public final class h<T> implements i<T>, j<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f158850a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<? extends T> f158851b;

    /* renamed from: c  reason: collision with root package name */
    private c<T, ?>[] f158852c;

    static {
        Covode.recordClassIndex(105405);
    }

    @Override // j.a.a.j
    public final i<T> a(c<T, ?>... cVarArr) {
        this.f158852c = cVarArr;
        return this;
    }

    @Override // j.a.a.i
    public final void a(e<T> eVar) {
        c<T, ?>[] cVarArr = this.f158852c;
        for (c<T, ?> cVar : cVarArr) {
            this.f158850a.f158846c.a(this.f158851b, cVar, eVar);
        }
    }

    public h(f fVar, Class<? extends T> cls) {
        this.f158851b = cls;
        this.f158850a = fVar;
    }
}
