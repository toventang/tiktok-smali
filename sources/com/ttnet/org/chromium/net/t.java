package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import java.util.Date;
import java.util.concurrent.Executor;

public abstract class t {

    public static abstract class b {
        static {
            Covode.recordClassIndex(103555);
        }

        public abstract Date a();

        public abstract Date b();

        public abstract Date c();

        public abstract Date d();

        public abstract Date e();

        public abstract Date f();

        public abstract Date g();

        public abstract Date h();

        public abstract Date i();

        public abstract Date j();

        public abstract Date k();

        public abstract Date l();

        public abstract Date m();

        public abstract boolean n();

        public abstract Long o();

        public abstract Long p();

        public abstract Long q();

        public abstract Long r();

        public abstract Date s();

        public abstract String t();

        public abstract Long u();

        public abstract Long v();

        public abstract String w();

        public abstract String x();
    }

    static {
        Covode.recordClassIndex(103553);
    }

    public abstract String a();

    public abstract b b();

    public abstract int c();

    public abstract ac d();

    public abstract d e();

    public static abstract class a {
        private final Executor mExecutor;

        static {
            Covode.recordClassIndex(103554);
        }

        public abstract void onRequestFinished(t tVar);

        public Executor getExecutor() {
            return this.mExecutor;
        }

        public a(Executor executor) {
            if (executor != null) {
                this.mExecutor = executor;
                return;
            }
            throw new IllegalStateException("Executor must not be null");
        }
    }
}
