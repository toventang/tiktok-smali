package d.a.g;

import com.bytedance.covode.number.Covode;
import d.a.b.c.e;
import d.a.b.d.h;
import d.a.b.d.i;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f156648a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final h.a f156649b = ((h) ((h.h) e.a(i.f156565a)).getValue()).a();

    private f() {
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ Runnable $runnable;

        static {
            Covode.recordClassIndex(104018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Runnable runnable) {
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

    static {
        Covode.recordClassIndex(104017);
    }

    public static void a(Runnable runnable) {
        l.c(runnable, "");
        f156649b.a(new a(runnable));
    }
}
