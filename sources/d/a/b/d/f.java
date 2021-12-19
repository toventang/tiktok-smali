package d.a.b.d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import d.a.b.d.h;
import h.f.b.l;
import h.z;

public final class f implements h {
    static {
        Covode.recordClassIndex(103957);
    }

    @Override // d.a.b.d.h
    public final h.a a() {
        return new a();
    }

    static final class a implements h.a {

        /* renamed from: a  reason: collision with root package name */
        public volatile Handler f156562a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        public final Object f156563b = new Object();

        static {
            Covode.recordClassIndex(103958);
        }

        @Override // d.a.b.d.h.a
        public final void a() {
            MethodCollector.i(9432);
            if (this.f156562a != null) {
                synchronized (this.f156563b) {
                    try {
                        Handler handler = this.f156562a;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } finally {
                        MethodCollector.o(9432);
                    }
                }
                return;
            }
            MethodCollector.o(9432);
        }

        @Override // d.a.b.d.h.a
        public final void a(h.f.a.a<z> aVar) {
            MethodCollector.i(9235);
            l.c(aVar, "");
            if (this.f156562a != null) {
                synchronized (this.f156563b) {
                    try {
                        Handler handler = this.f156562a;
                        if (handler != null) {
                            Boolean.valueOf(handler.postDelayed(new g(aVar), 0));
                        }
                    } finally {
                        MethodCollector.o(9235);
                    }
                }
                return;
            }
            MethodCollector.o(9235);
        }
    }
}
