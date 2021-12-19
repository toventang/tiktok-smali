package f.a.a.b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.d.g;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f157156a;

    public static aa a() {
        return f.a.a.a.a.a(f157156a);
    }

    /* renamed from: f.a.a.b.a$a  reason: collision with other inner class name */
    static final class C4153a {

        /* renamed from: a  reason: collision with root package name */
        static final aa f157157a = new b(new Handler(Looper.getMainLooper()));

        static {
            Covode.recordClassIndex(104354);
        }
    }

    static {
        aa aaVar;
        Covode.recordClassIndex(104352);
        AnonymousClass1 r1 = new Callable<aa>() {
            /* class f.a.a.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(104353);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ aa call() {
                return C4153a.f157157a;
            }
        };
        g<Callable<aa>, aa> gVar = f.a.a.a.a.f157154a;
        if (gVar == null) {
            aaVar = f.a.a.a.a.a(r1);
        } else {
            aaVar = (aa) f.a.a.a.a.a(gVar, r1);
            Objects.requireNonNull(aaVar, "Scheduler Callable returned null");
        }
        f157156a = aaVar;
    }
}
