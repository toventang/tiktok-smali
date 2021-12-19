package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.f;

public interface CoroutineExceptionHandler extends f.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f158926c = a.f158927a;

    static {
        Covode.recordClassIndex(105457);
    }

    void handleException(f fVar, Throwable th);

    public static final class a implements f.c<CoroutineExceptionHandler> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f158927a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(105458);
        }
    }
}
