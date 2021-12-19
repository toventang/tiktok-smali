package android.ss.com.vboost.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static g f414a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f415b = f.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static int f416c = 1000;

    /* renamed from: d  reason: collision with root package name */
    private static int f417d = 10;

    /* renamed from: e  reason: collision with root package name */
    private static int f418e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f419f = false;

    /* renamed from: g  reason: collision with root package name */
    private static int f420g = 8;

    /* renamed from: h  reason: collision with root package name */
    private static int f421h = 1500000;

    /* renamed from: i  reason: collision with root package name */
    private static int f422i = 2000000;

    @Override // android.ss.com.vboost.b.c
    public final void b() {
        c();
    }

    private static void c() {
        int i2 = f418e;
        if (i2 != -1) {
            f414a.b(i2);
        }
    }

    static {
        Covode.recordClassIndex(20);
    }

    @Override // android.ss.com.vboost.b.c
    public final void a() {
        c();
        g gVar = f414a;
        if (gVar != null) {
            int a2 = gVar.a();
            f418e = a2;
            if (-1 != a2) {
                f414a.a(a2, 10, 3, -1);
                f414a.a(f418e, 1, f420g, -1);
                f414a.a(f418e, 4, f422i, -1);
                f414a.a(f418e, 6, f422i, f421h);
                f414a.a(f418e, 23, 1000, -1);
                f414a.a(f418e, 30000);
            }
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final void b(long j2) {
        c();
        g gVar = f414a;
        if (gVar != null) {
            int a2 = gVar.a();
            f418e = a2;
            if (-1 != a2) {
                f414a.a(a2, 10, 3, -1);
                f414a.a(f418e, (int) j2);
            }
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final void c(long j2) {
        c();
        g gVar = f414a;
        if (gVar != null) {
            int a2 = gVar.a();
            f418e = a2;
            if (-1 != a2) {
                f414a.a(a2, 10, 3, -1);
                f414a.a(f418e, 8, f417d, -1);
                f414a.a(f418e, (int) j2);
            }
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final void a(long j2) {
        c();
        g gVar = f414a;
        if (gVar != null) {
            int a2 = gVar.a();
            f418e = a2;
            if (-1 != a2) {
                f414a.a(a2, 10, 3, -1);
                f414a.a(f418e, 1, f420g, -1);
                f414a.a(f418e, 4, f422i, -1);
                f414a.a(f418e, 6, f422i, f421h);
                f414a.a(f418e, 23, 1000, -1);
                f414a.a(f418e, (int) j2);
            }
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final boolean a(Context context) {
        if (f414a == null) {
            f414a = new g(context);
            if (g.f423a) {
                f416c = f414a.a(0);
                f417d = f414a.a(3);
                int a2 = f414a.a();
                f418e = a2;
                if (a2 == -1) {
                    return false;
                }
                f420g = e.b();
                f421h = e.a(0);
                f422i = e.a(6);
                return true;
            }
        }
        return false;
    }
}
