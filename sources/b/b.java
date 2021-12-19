package b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final class b {

    /* renamed from: a  reason: collision with root package name */
    static final b f4803a = new b();

    /* renamed from: c  reason: collision with root package name */
    static final int f4804c;

    /* renamed from: d  reason: collision with root package name */
    static final int f4805d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f4806e;

    /* renamed from: b  reason: collision with root package name */
    final Executor f4807b = new a((byte) 0);

    static class a implements Executor {
        static {
            Covode.recordClassIndex(1892);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(1891);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f4806e = availableProcessors;
        f4804c = availableProcessors + 1;
        f4805d = (availableProcessors * 2) + 1;
    }
}
