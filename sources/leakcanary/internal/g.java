package leakcanary.internal;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;

final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ a f159453a;

    static {
        Covode.recordClassIndex(105859);
    }

    g(a aVar) {
        this.f159453a = aVar;
    }

    public final /* synthetic */ void run() {
        l.a(this.f159453a.invoke(), "");
    }
}
