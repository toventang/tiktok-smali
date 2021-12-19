package androidx.work;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;

public abstract class ListenableWorker {

    /* renamed from: a  reason: collision with root package name */
    public Context f4447a;

    /* renamed from: b  reason: collision with root package name */
    public WorkerParameters f4448b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f4449c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4450d;

    static {
        Covode.recordClassIndex(1733);
    }

    public abstract q<a> a();

    public void c() {
    }

    public static abstract class a {
        static {
            Covode.recordClassIndex(1734);
        }

        a() {
        }

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0066a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final e f4451a;

            static {
                Covode.recordClassIndex(1735);
            }

            public C0066a() {
                this(e.f4499a);
            }

            public final int hashCode() {
                return 28070863 + this.f4451a.hashCode();
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f4451a + '}';
            }

            private C0066a(e eVar) {
                this.f4451a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.f4451a.equals(((C0066a) obj).f4451a);
            }
        }

        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final e f4452a;

            static {
                Covode.recordClassIndex(1737);
            }

            public c() {
                this(e.f4499a);
            }

            public final int hashCode() {
                return 28070925 + this.f4452a.hashCode();
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f4452a + '}';
            }

            public c(e eVar) {
                this.f4452a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.f4452a.equals(((c) obj).f4452a);
            }
        }

        public static final class b extends a {
            static {
                Covode.recordClassIndex(1736);
            }

            public final int hashCode() {
                return 1386378834;
            }

            public final String toString() {
                return "Retry";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return true;
            }
        }
    }

    public final void b() {
        this.f4449c = true;
        c();
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f4447a = context;
            this.f4448b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }
}
