package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import h.z;
import java.util.concurrent.CancellationException;

public interface bz extends f.b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f159061c = b.f159062a;

    static {
        Covode.recordClassIndex(105581);
    }

    bh a(h.f.a.b<? super Throwable, z> bVar);

    bh a(boolean z, boolean z2, h.f.a.b<? super Throwable, z> bVar);

    s a(u uVar);

    void a(CancellationException cancellationException);

    Object b(d<? super z> dVar);

    boolean b();

    boolean k();

    boolean l();

    CancellationException m();

    boolean n();

    /* synthetic */ void o();

    public static final class b implements f.c<bz> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f159062a = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(105583);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105582);
        }

        public static /* synthetic */ bh a(bz bzVar, boolean z, boolean z2, h.f.a.b bVar, int i2) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return bzVar.a(z, z2, bVar);
        }
    }
}
