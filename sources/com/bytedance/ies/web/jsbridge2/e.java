package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class e<P, R> extends c<P, R> {
    public g callContext;
    private a callback;
    private boolean isValid = true;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(21289);
        }

        void a(Object obj);

        void a(Throwable th);

        void a(JSONObject jSONObject);
    }

    public interface b {
        static {
            Covode.recordClassIndex(21290);
        }

        e a();
    }

    static {
        Covode.recordClassIndex(21288);
    }

    /* access modifiers changed from: protected */
    public abstract void invoke(P p, g gVar);

    /* access modifiers changed from: protected */
    public abstract void onTerminate();

    public final void finishWithFailure() {
        finishWithFailure(null);
    }

    public final void finishWithSuccess() {
        finishWithResult(null);
    }

    @Override // com.bytedance.ies.web.jsbridge2.c
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public void onDestroy() {
        this.isValid = false;
        this.callContext = null;
    }

    /* access modifiers changed from: package-private */
    public void terminateActual() {
        onTerminate();
        onDestroy();
    }

    private boolean checkInvalid() {
        if (this.isValid) {
            return true;
        }
        k.a((RuntimeException) new IllegalStateException("Jsb async call already finished: " + getName() + ", hashcode: " + hashCode()));
        return false;
    }

    public final void finishWithFailure(Throwable th) {
        if (checkInvalid()) {
            this.callback.a(th);
            onDestroy();
        }
    }

    public final void finishWithRawResult(JSONObject jSONObject) {
        if (checkInvalid()) {
            this.callback.a(jSONObject);
            onDestroy();
        }
    }

    public final void finishWithResult(R r) {
        if (checkInvalid()) {
            this.callback.a((Object) r);
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    public void invokeActual(P p, g gVar, a aVar) {
        this.callContext = gVar;
        this.callback = aVar;
        invoke(p, gVar);
    }
}
