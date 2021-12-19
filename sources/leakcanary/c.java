package leakcanary;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public interface c {
    static {
        Covode.recordClassIndex(105812);
    }

    void a();

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f159365a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(105813);
        }

        @Override // leakcanary.c
        public final void a() {
            MethodCollector.i(4802);
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100);
                System.runFinalization();
                MethodCollector.o(4802);
            } catch (InterruptedException unused) {
                AssertionError assertionError = new AssertionError();
                MethodCollector.o(4802);
                throw assertionError;
            }
        }
    }
}
