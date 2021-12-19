package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static v f158919a;

    /* renamed from: b  reason: collision with root package name */
    public static long f158920b;

    /* renamed from: c  reason: collision with root package name */
    public static final w f158921c = new w();

    private w() {
    }

    static {
        Covode.recordClassIndex(105451);
    }

    public static final v a() {
        MethodCollector.i(3655);
        synchronized (f158921c) {
            try {
                v vVar = f158919a;
                if (vVar != null) {
                    f158919a = vVar.f158917f;
                    vVar.f158917f = null;
                    f158920b -= 8192;
                    return vVar;
                }
                v vVar2 = new v();
                MethodCollector.o(3655);
                return vVar2;
            } finally {
                MethodCollector.o(3655);
            }
        }
    }

    public static final void a(v vVar) {
        MethodCollector.i(3656);
        l.c(vVar, "");
        if (vVar.f158917f != null || vVar.f158918g != null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed requirement.".toString());
            MethodCollector.o(3656);
            throw illegalArgumentException;
        } else if (vVar.f158915d) {
            MethodCollector.o(3656);
        } else {
            synchronized (f158921c) {
                try {
                    long j2 = f158920b;
                    if (j2 + 8192 <= 65536) {
                        f158920b = j2 + 8192;
                        vVar.f158917f = f158919a;
                        vVar.f158914c = 0;
                        vVar.f158913b = vVar.f158914c;
                        f158919a = vVar;
                        MethodCollector.o(3656);
                    }
                } finally {
                    MethodCollector.o(3656);
                }
            }
        }
    }
}
