package com.bytedance.q;

import com.bytedance.covode.number.Covode;
import com.bytedance.q.i;

public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* renamed from: a  reason: collision with root package name */
    public IN f42383a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f42384b = true;

    static {
        Covode.recordClassIndex(25904);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(Throwable th);

    /* JADX WARN: Type inference failed for: r0v0, types: [IN, OUT] */
    /* access modifiers changed from: protected */
    public OUT a() {
        return this.f42383a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        if (objArr != null && objArr.length > 0) {
            this.f42384b = ((Boolean) objArr[0]).booleanValue();
        }
    }

    private Object a(b<OUT> bVar, Throwable th) {
        while (a(th) && this.f42384b) {
            try {
                return bVar.a(a());
            } catch (i.a e2) {
                th = e2.getCause();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    @Override // com.bytedance.q.d
    public final Object a(b<OUT> bVar, IN in) {
        this.f42383a = in;
        try {
            return bVar.a(a());
        } catch (i.a e2) {
            return a((b) bVar, e2.getCause());
        } catch (Throwable th) {
            return a((b) bVar, th);
        }
    }
}
