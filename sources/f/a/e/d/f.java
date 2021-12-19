package f.a.e.d;

import com.bytedance.covode.number.Covode;

public final class f<T> extends e<T> {
    static {
        Covode.recordClassIndex(104442);
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        if (this.f157214a == null) {
            this.f157215b = th;
        }
        countDown();
    }

    @Override // f.a.z
    public final void onNext(T t) {
        if (this.f157214a == null) {
            this.f157214a = t;
            this.f157216c.dispose();
            countDown();
        }
    }
}
