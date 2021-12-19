package net.openid.appauth.c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f159593a;

    /* renamed from: b  reason: collision with root package name */
    private final b f159594b;

    /* renamed from: c  reason: collision with root package name */
    private final int f159595c;

    public interface b {
        static {
            Covode.recordClassIndex(106072);
        }

        String a(Throwable th);

        boolean a(String str, int i2);
    }

    static {
        Covode.recordClassIndex(106070);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.openid.appauth.c.a$a  reason: collision with other inner class name */
    public static final class C4201a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C4201a f159596a = new C4201a();

        private C4201a() {
        }

        static {
            Covode.recordClassIndex(106071);
        }

        @Override // net.openid.appauth.c.a.b
        public final String a(Throwable th) {
            return Log.getStackTraceString(th);
        }

        @Override // net.openid.appauth.c.a.b
        public final boolean a(String str, int i2) {
            return Log.isLoggable(str, i2);
        }
    }

    private static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(12472);
            if (f159593a == null) {
                f159593a = new a(C4201a.f159596a);
            }
            aVar = f159593a;
            MethodCollector.o(12472);
        }
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a(net.openid.appauth.c.a.b r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = net.openid.appauth.p.a(r4)
            net.openid.appauth.c.a$b r0 = (net.openid.appauth.c.a.b) r0
            r3.f159594b = r0
            r2 = 7
        L_0x000c:
            net.openid.appauth.c.a$b r1 = r3.f159594b
            java.lang.String r0 = "AppAuth"
            boolean r0 = r1.a(r0, r2)
            if (r0 == 0) goto L_0x001c
            int r2 = r2 + -1
            r0 = 2
            if (r2 < r0) goto L_0x001c
            goto L_0x000c
        L_0x001c:
            int r0 = r2 + 1
            r3.f159595c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.c.a.<init>(net.openid.appauth.c.a$b):void");
    }

    public static void a(String str, Object... objArr) {
        a().a(3, null, str, objArr);
    }

    public static void b(String str, Object... objArr) {
        a().a(4, null, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        a().a(5, null, str, objArr);
    }

    public static void d(String str, Object... objArr) {
        a().a(6, null, str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        a().a(6, th, str, objArr);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        a().a(3, th, str, objArr);
    }

    private void a(int i2, Throwable th, String str, Object... objArr) {
        if (this.f159595c <= i2) {
            if (objArr != null && objArr.length > 0) {
                com.a.a(str, objArr);
            }
            if (th != null) {
                this.f159594b.a(th);
            }
        }
    }
}
