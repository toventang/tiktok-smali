package com.google.android.gms.common.api;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.p;
import java.util.concurrent.TimeUnit;

public abstract class k<R extends p> {

    public interface a {
        static {
            Covode.recordClassIndex(31332);
        }

        void a(Status status);
    }

    static {
        Covode.recordClassIndex(31331);
    }

    public abstract R a(TimeUnit timeUnit);

    public abstract void a();

    public abstract void a(q<? super R> qVar);

    public abstract boolean b();

    public Integer c() {
        throw new UnsupportedOperationException();
    }

    public void a(a aVar) {
        throw new UnsupportedOperationException();
    }
}
