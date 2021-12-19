package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private o f159821a;

    /* renamed from: b  reason: collision with root package name */
    private o f159822b;

    static {
        Covode.recordClassIndex(106488);
    }

    p() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized o a() {
        o oVar;
        MethodCollector.i(4189);
        oVar = this.f159821a;
        if (oVar != null) {
            o oVar2 = oVar.f159820c;
            this.f159821a = oVar2;
            if (oVar2 == null) {
                this.f159822b = null;
            }
        }
        MethodCollector.o(4189);
        return oVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized o b() {
        o a2;
        MethodCollector.i(4223);
        if (this.f159821a == null) {
            wait(1000);
        }
        a2 = a();
        MethodCollector.o(4223);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(o oVar) {
        MethodCollector.i(4188);
        if (oVar != null) {
            o oVar2 = this.f159822b;
            if (oVar2 != null) {
                oVar2.f159820c = oVar;
                this.f159822b = oVar;
            } else if (this.f159821a == null) {
                this.f159822b = oVar;
                this.f159821a = oVar;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Head present, but no tail");
                MethodCollector.o(4188);
                throw illegalStateException;
            }
            notifyAll();
            MethodCollector.o(4188);
        } else {
            NullPointerException nullPointerException = new NullPointerException("null cannot be enqueued");
            MethodCollector.o(4188);
            throw nullPointerException;
        }
    }
}
