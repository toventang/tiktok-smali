package h.c.b.a;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;

public final class c implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f158662a = new c();

    public final String toString() {
        return "This continuation is already complete";
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(105113);
    }

    @Override // h.c.d
    public final f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // h.c.d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
