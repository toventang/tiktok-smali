package d.a.b.b;

import com.bytedance.covode.number.Covode;
import d.a.b.c.e;
import d.a.b.d.h;
import d.a.b.d.i;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C4131a f156546a = new C4131a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.a f156547b = ((h) ((h.h) e.a(i.f156566b)).getValue()).a();

    static {
        Covode.recordClassIndex(103938);
    }

    /* renamed from: d.a.b.b.a$a  reason: collision with other inner class name */
    public static final class C4131a {
        static {
            Covode.recordClassIndex(103939);
        }

        private C4131a() {
        }

        public /* synthetic */ C4131a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ Runnable $runnable;

        static {
            Covode.recordClassIndex(103940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(0);
            this.$runnable = runnable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$runnable.run();
            return z.f158842a;
        }
    }

    @Override // d.a.b.b.b
    public final void shutdown() {
        this.f156547b.a();
    }

    public final void execute(Runnable runnable) {
        l.c(runnable, "");
        this.f156547b.a(new b(runnable));
    }
}
