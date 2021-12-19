package ms.bd.o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.mobsec.matrix.net.TTNetHttpClient;
import com.bytedance.mobsec.metasec.ov.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ms.bd.o.b;

public class n1 {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f159521a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, e0> f159522b = new ConcurrentHashMap();

    public interface a {
        static {
            Covode.recordClassIndex(105935);
        }

        void a(int i2);

        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);
    }

    static {
        Covode.recordClassIndex(105934);
    }

    protected n1() {
    }

    public static synchronized boolean a(Context context, e0 e0Var, String str) {
        synchronized (n1.class) {
            MethodCollector.i(8805);
            if (context == null) {
                NullPointerException nullPointerException = new NullPointerException("context could not be null");
                MethodCollector.o(8805);
                throw nullPointerException;
            } else if (e0Var != null) {
                String str2 = e0Var.f159496b;
                String str3 = (str2 == null || str2.length() <= 0) ? e0Var.f159502h : e0Var.f159496b;
                if (str3 == null || str3.length() <= 0) {
                    NullPointerException nullPointerException2 = new NullPointerException("appID must be set");
                    MethodCollector.o(8805);
                    throw nullPointerException2;
                }
                if (!f159521a) {
                    synchronized (n1.class) {
                        try {
                            if (!f159521a) {
                                a(context, str);
                                f159521a = true;
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(8805);
                            throw th;
                        }
                    }
                }
                if (f159522b.containsKey(str3)) {
                    MethodCollector.o(8805);
                    return false;
                } else if (((Boolean) b.a(67108865, e0Var.a())).booleanValue()) {
                    f159522b.put(str3, e0Var);
                    MethodCollector.o(8805);
                    return true;
                } else {
                    MethodCollector.o(8805);
                    return false;
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("config could not be null");
                MethodCollector.o(8805);
                throw nullPointerException3;
            }
        }
    }

    public static synchronized a a(String str) {
        synchronized (n1.class) {
            MethodCollector.i(8301);
            if (str == null) {
                NullPointerException nullPointerException = new NullPointerException("appID must be set");
                MethodCollector.o(8301);
                throw nullPointerException;
            } else if (!f159521a) {
                MethodCollector.o(8301);
                return null;
            } else {
                Object a2 = b.a(67108866, str);
                if (a2 == null) {
                    MethodCollector.o(8301);
                    return null;
                }
                e0 e0Var = f159522b.get(str);
                if (e0Var == null) {
                    MethodCollector.o(8301);
                    return null;
                }
                m1 m1Var = new m1(e0Var, a.f159493a.f159494b, ((Long) a2).longValue());
                MethodCollector.o(8301);
                return m1Var;
            }
        }
    }

    private static synchronized void a(Context context, String str) {
        Context context2;
        b.a p1Var;
        b.a bVar;
        j iVar;
        synchronized (n1.class) {
            MethodCollector.i(8254);
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            a aVar = a.f159493a;
            if (applicationContext != null) {
                context2 = applicationContext.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (context2 == null) {
                        context2 = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
            } else {
                context2 = null;
            }
            aVar.f159494b = context2;
            n.a(applicationContext, str);
            h.a(16777217, 0, 0, "1b9c4d", new byte[]{110, 109, 89});
            b.a(16777218, new p0());
            b.a(16777217, new a1());
            h.a(16777217, 0, 0, "744e24", new byte[]{104, 59, 67});
            b.a(16777219, new f1());
            b.a(16777221, new g1());
            b.a(16777222, new h1());
            b.a(16777223, new i1());
            b.a(16777224, new j1());
            b.a(16777225, new k1());
            b.a(16777226, new l1());
            b.a(16777227, new f0());
            b.a(16777228, new g0());
            b.a(16777232, new h0());
            b.a(16777233, new i0());
            b.a(16777235, new j0());
            b.a(16777238, new k0());
            b.a(16777239, new l0());
            b.a(16777241, new m0());
            b.a(16777242, new n0());
            b.a(16777243, new o0());
            b.a(16777244, new q0());
            b.a(16777245, new r0());
            b.a(16777246, new s0());
            b.a(16777247, new t0());
            b.a(16777248, new u0());
            b.a(16777249, new v0());
            b.a(16777250, new w0());
            b.a(16777251, new x0());
            b.a(16777240, new y0());
            b.a(16777252, new z0());
            b.a(16777253, new b1());
            b.a(16777254, new c1());
            b.a(16777255, new d1());
            b.a(16777256, new e1());
            if (b0.a()) {
                p1Var = new r1();
            } else {
                p1Var = new p1();
            }
            b.a(33554433, p1Var);
            b.a(65537, new c());
            b.a(65538, new d());
            b.a(65539, new e());
            b.a(65540, new f());
            if (b0.a()) {
                bVar = new TTNetHttpClient();
            } else {
                bVar = new com.bytedance.mobsec.matrix.net.b();
            }
            b.a(196609, bVar);
            b.a(196610, bVar);
            b.a(196611, bVar);
            if (b0.a((String) h.a(16777217, 0, 0, "34ba9d", new byte[]{33, 57, 28, 91, 4, 106, 36, 16, 55, 48, 44, 53, 20, 91, 0, 97, 49, 24, 36, 62, 48, 61, 95, 22, 9, 97, 53, 91, 32, 53, 41, 59, 30, 27, 15, 103, 63, 7, 125, 2, 6, 29, 60, 26, 8, 122, 36, 26, 33, 4, 54, 63, 29, 6}))) {
                iVar = new k();
            } else {
                iVar = new i();
            }
            j.a(iVar);
            b.a(131073, iVar);
            b.a(131074, iVar);
            b.a(268435457, new d.a());
            b.a(268435458, new d.b());
            b.a(268435459, new d.c());
            h.a(16777219, 0, 0, null, applicationContext);
            MethodCollector.o(8254);
        }
    }
}
