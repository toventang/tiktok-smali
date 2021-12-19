package f.a.e.g;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

final class c implements Future<Object> {

    /* renamed from: a  reason: collision with root package name */
    final b f157851a;

    static {
        Covode.recordClassIndex(104818);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    c(b bVar) {
        this.f157851a = bVar;
    }

    public final boolean cancel(boolean z) {
        this.f157851a.dispose();
        return false;
    }
}
