package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static volatile j f5706a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f5707b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private b f5708c;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5722a;

        static {
            Covode.recordClassIndex(2396);
        }
    }

    static {
        Covode.recordClassIndex(2394);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(2395);
        }

        private a() {
        }

        public static j a() {
            MethodCollector.i(4616);
            if (j.f5706a == null) {
                synchronized (j.class) {
                    try {
                        if (j.f5706a == null) {
                            j.f5706a = new j((byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(4616);
                        throw th;
                    }
                }
            }
            j jVar = j.f5706a;
            if (jVar == null) {
                l.a();
            }
            MethodCollector.o(4616);
            return jVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private j() {
    }

    public /* synthetic */ j(byte b2) {
        this();
    }

    public final void a(Exception exc) {
        b bVar = this.f5708c;
        if (bVar != null && bVar.f5722a) {
            throw new RuntimeException(exc);
        }
    }
}
