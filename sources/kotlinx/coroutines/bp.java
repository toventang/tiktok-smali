package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.b;
import java.io.Closeable;
import java.util.concurrent.Executor;

public abstract class bp extends ah implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f159050c = new a((byte) 0);

    static {
        Covode.recordClassIndex(105569);
    }

    public abstract Executor a();

    public static final class a extends b<ah, bp> {
        static {
            Covode.recordClassIndex(105570);
        }

        private a() {
            super(ah.Key, AnonymousClass1.f159051a);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
