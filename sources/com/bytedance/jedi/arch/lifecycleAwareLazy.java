package com.bytedance.jedi.arch;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.af;
import androidx.lifecycle.ah;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.a;
import h.f.b.l;
import h.h;
import h.w;
import java.io.Serializable;

public class lifecycleAwareLazy<T extends ac> implements h<T>, Serializable, Serializable {
    private volatile Object _value;
    private a<? extends T> initializer;
    private final a<String> keyFactory;
    private final lifecycleAwareLazy<T> lock;
    private final m owner;

    static {
        Covode.recordClassIndex(24327);
    }

    public static /* synthetic */ void value$annotations() {
    }

    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onStart();
        }
    }

    @Override // h.h
    public boolean isInitialized() {
        if (this._value != ap.f39399a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return getValue().toString();
        }
        return "Lazy value not initialized yet.";
    }

    @v(a = i.a.ON_CREATE)
    public final void onStart() {
        if (!isInitialized()) {
            getValue();
        }
        if (this.keyFactory == null) {
            this.owner.getLifecycle().b(this);
        } else {
            a(this.owner, getValue(), this.keyFactory);
        }
    }

    @Override // h.h
    public T getValue() {
        T t;
        MethodCollector.i(7775);
        Object obj = this._value;
        if (obj == ap.f39399a) {
            synchronized (this.lock) {
                try {
                    Object obj2 = this._value;
                    if (obj2 == ap.f39399a) {
                        a<? extends T> aVar = this.initializer;
                        if (aVar == null) {
                            l.a();
                        }
                        t = (T) ((ac) aVar.invoke());
                        this._value = t;
                        this.initializer = null;
                    } else if (obj2 != null) {
                        t = (T) ((ac) obj2);
                    } else {
                        w wVar = new w("null cannot be cast to non-null type");
                        MethodCollector.o(7775);
                        throw wVar;
                    }
                } finally {
                    MethodCollector.o(7775);
                }
            }
            return t;
        } else if (obj != null) {
            T t2 = (T) ((ac) obj);
            MethodCollector.o(7775);
            return t2;
        } else {
            w wVar2 = new w("null cannot be cast to non-null type");
            MethodCollector.o(7775);
            throw wVar2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public lifecycleAwareLazy(m mVar, a<? extends T> aVar) {
        this(mVar, null, aVar);
        l.c(mVar, "");
        l.c(aVar, "");
    }

    public lifecycleAwareLazy(m mVar, a<String> aVar, a<? extends T> aVar2) {
        l.c(mVar, "");
        l.c(aVar2, "");
        this.owner = mVar;
        this.keyFactory = aVar;
        this.initializer = aVar2;
        this._value = ap.f39399a;
        this.lock = this;
        mVar.getLifecycle().a(this);
    }

    /* access modifiers changed from: protected */
    public void a(m mVar, T t, a<String> aVar) {
        l.c(mVar, "");
        l.c(t, "");
        l.c(aVar, "");
        Fragment fragment = (Fragment) mVar;
        l.c(fragment, "");
        l.c(t, "");
        l.c(aVar, "");
        af a2 = ah.a(fragment);
        l.a((Object) a2, "");
        String invoke = aVar.invoke();
        if (a2.a(invoke) == null) {
            a2.a(invoke, t);
        }
    }
}
