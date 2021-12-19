package d.a.b.d;

import com.bytedance.covode.number.Covode;
import d.a.b.c.d;
import h.f.b.ab;
import h.h;
import java.util.concurrent.TimeUnit;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final d<h<h>> f156565a = new d<>(h.i.a((h.f.a.a) b.f156568a));

    /* renamed from: b  reason: collision with root package name */
    public static final d<h<h>> f156566b = new d<>(h.i.a((h.f.a.a) a.f156567a));

    static final /* synthetic */ class b extends h.f.b.i implements h.f.a.a<h> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f156568a = new b();

        static {
            Covode.recordClassIndex(103964);
        }

        b() {
            super(0);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "createMainScheduler";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "createMainScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new f();
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(c.class, "kn_common_release");
        }
    }

    static final /* synthetic */ class a extends h.f.b.i implements h.f.a.a<h> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f156567a = new a();

        static {
            Covode.recordClassIndex(103963);
        }

        a() {
            super(0);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "createIoScheduler";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "createIoScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(b.class, "kn_common_release");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new d(new a(TimeUnit.MINUTES.toMillis(1), new j("IO")));
        }
    }

    static {
        Covode.recordClassIndex(103962);
    }
}
