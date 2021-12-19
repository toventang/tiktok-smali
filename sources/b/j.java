package b;

import com.bytedance.covode.number.Covode;

public class j<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final i<TResult> f4869a = new i<>();

    static {
        Covode.recordClassIndex(1912);
    }

    public final void a() {
        if (!this.f4869a.g()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final boolean a(Exception exc) {
        return this.f4869a.b(exc);
    }

    public final boolean a(TResult tresult) {
        return this.f4869a.b((Object) tresult);
    }

    public final void b(Exception exc) {
        if (!a(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void b(TResult tresult) {
        if (!a((Object) tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
