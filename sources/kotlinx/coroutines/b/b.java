package kotlinx.coroutines.b;

import com.bytedance.covode.number.Covode;
import h.c.a.a;
import h.c.b.a.e;
import h.c.d;
import h.f.a.m;
import h.f.b.ad;
import h.w;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.cf;
import kotlinx.coroutines.cz;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.u;

public final class b {
    static {
        Covode.recordClassIndex(105553);
    }

    public static final <T, R> Object a(t<? super T> tVar, R r, m<? super R, ? super d<? super T>, ? extends Object> mVar) {
        Object obj;
        tVar.cL_();
        if (mVar != null) {
            try {
                obj = ((m) ad.b(mVar, 2)).invoke(r, tVar);
            } catch (Throwable th) {
                obj = new CompletedExceptionally(th, false, 2, null);
            }
            if (obj == a.COROUTINE_SUSPENDED) {
                return a.COROUTINE_SUSPENDED;
            }
            Object e2 = tVar.e(obj);
            if (e2 == cf.f159086b) {
                return a.COROUTINE_SUSPENDED;
            }
            if (!(e2 instanceof CompletedExceptionally)) {
                return cf.b(e2);
            }
            Throwable th2 = ((CompletedExceptionally) e2).cause;
            d<T> dVar = tVar.f159155e;
            if (!ar.f159023c) {
                throw th2;
            } else if (!(dVar instanceof e)) {
                throw th2;
            } else {
                throw u.a(th2, (e) dVar);
            }
        } else {
            throw new w("null cannot be cast to non-null type");
        }
    }

    public static final <T, R> Object b(t<? super T> tVar, R r, m<? super R, ? super d<? super T>, ? extends Object> mVar) {
        Object obj;
        tVar.cL_();
        boolean z = false;
        try {
            obj = ((m) ad.b(mVar, 2)).invoke(r, tVar);
        } catch (Throwable th) {
            obj = new CompletedExceptionally(th, false, 2, null);
        }
        if (obj == a.COROUTINE_SUSPENDED) {
            return a.COROUTINE_SUSPENDED;
        }
        Object e2 = tVar.e(obj);
        if (e2 == cf.f159086b) {
            return a.COROUTINE_SUSPENDED;
        }
        if (!(e2 instanceof CompletedExceptionally)) {
            return cf.b(e2);
        }
        CompletedExceptionally completedExceptionally = (CompletedExceptionally) e2;
        Throwable th2 = completedExceptionally.cause;
        if (!(th2 instanceof cz) || ((cz) th2).coroutine != tVar) {
            z = true;
        }
        if (z) {
            Throwable th3 = completedExceptionally.cause;
            d<T> dVar = tVar.f159155e;
            if (!ar.f159023c) {
                throw th3;
            } else if (!(dVar instanceof e)) {
                throw th3;
            } else {
                throw u.a(th3, (e) dVar);
            }
        } else if (!(obj instanceof CompletedExceptionally)) {
            return obj;
        } else {
            Throwable th4 = ((CompletedExceptionally) obj).cause;
            d<T> dVar2 = tVar.f159155e;
            if (!ar.f159023c) {
                throw th4;
            } else if (!(dVar2 instanceof e)) {
                throw th4;
            } else {
                throw u.a(th4, (e) dVar2);
            }
        }
    }
}
