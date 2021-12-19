package h.c.b.a;

import com.bytedance.covode.number.Covode;
import h.c.b.a.h;
import h.c.d;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.io.Serializable;
import java.lang.reflect.Method;

public abstract class a implements e, d<Object>, Serializable {
    private final d<Object> completion;

    static {
        Covode.recordClassIndex(105111);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final d<Object> getCompletion() {
        return this.completion;
    }

    @Override // h.c.b.a.e
    public e getCallerFrame() {
        d<Object> dVar = this.completion;
        if (!(dVar instanceof e)) {
            dVar = null;
        }
        return (e) dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        return sb.append(stackTraceElement).toString();
    }

    @Override // h.c.b.a.e
    public StackTraceElement getStackTraceElement() {
        int i2;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        String str;
        l.d(this, "");
        f fVar = (f) getClass().getAnnotation(f.class);
        String str2 = null;
        if (fVar == null) {
            return null;
        }
        int a2 = fVar.a();
        if (a2 <= 1) {
            int a3 = g.a(this);
            if (a3 < 0) {
                i2 = -1;
            } else {
                i2 = fVar.c()[a3];
            }
            l.d(this, "");
            h.a aVar = h.f158664b;
            if (aVar == null) {
                aVar = h.a(this);
            }
            if (!(aVar == h.f158663a || (method = aVar.f158666a) == null || (invoke = method.invoke(getClass(), new Object[0])) == null || (method2 = aVar.f158667b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null)) {
                Method method3 = aVar.f158668c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, new Object[0]);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = obj;
                }
                String str3 = str2;
                if (str3 != null) {
                    str = str3 + '/' + fVar.e();
                    return new StackTraceElement(str, fVar.d(), fVar.b(), i2);
                }
            }
            str = fVar.e();
            return new StackTraceElement(str, fVar.d(), fVar.b(), i2);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + a2 + ". Please update the Kotlin standard library.").toString());
    }

    public a(d<Object> dVar) {
        this.completion = dVar;
    }

    public d<z> create(d<?> dVar) {
        l.d(dVar, "");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // h.c.d
    public final void resumeWith(Object obj) {
        a aVar = this;
        while (true) {
            l.d(aVar, "");
            d<Object> dVar = aVar.completion;
            if (dVar == null) {
                l.b();
            }
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != h.c.a.a.COROUTINE_SUSPENDED) {
                    obj = q.m223constructorimpl(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (dVar instanceof a) {
                        aVar = (a) dVar;
                    } else {
                        dVar.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
        }
    }

    public d<z> create(Object obj, d<?> dVar) {
        l.d(dVar, "");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
