package com.bytedance.ies.ugc.statisticlogger;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import f.a.d.k;
import f.a.l.g;
import f.a.t;
import h.f.b.l;
import h.m.p;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final g<Boolean> f35308a;

    /* renamed from: b  reason: collision with root package name */
    static final g<Boolean> f35309b;

    /* renamed from: c  reason: collision with root package name */
    static final g<b> f35310c;

    /* renamed from: d  reason: collision with root package name */
    static final String f35311d = "-2147483648";

    /* renamed from: e  reason: collision with root package name */
    public static final C0801a f35312e = new C0801a();

    /* renamed from: f  reason: collision with root package name */
    public static final a f35313f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static final g<String> f35314g;

    /* renamed from: h  reason: collision with root package name */
    private static final g<String> f35315h;

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a$a  reason: collision with other inner class name */
    public static final class C0801a implements DeviceRegisterManager.a {
        static {
            Covode.recordClassIndex(21140);
        }

        C0801a() {
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z) {
            a.f35308a.onNext(Boolean.valueOf(z));
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z, boolean z2) {
            a.f35309b.onNext(Boolean.valueOf(z));
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(String str, String str2) {
            l.b(com.a.a("onDeviceIdChanged,did:%s,installId:%s", Arrays.copyOf(new Object[]{str, str2}, 2)), "");
            a.e();
            a.f35310c.onNext(b.INSTANCE);
        }
    }

    private a() {
    }

    public static String a() {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            return "";
        }
        return serverDeviceId;
    }

    public static Map<String, String> b() {
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        return hashMap;
    }

    public static t<b> d() {
        t<b> i2 = f35310c.e().i();
        l.b(i2, "");
        return i2;
    }

    public static void e() {
        String a2 = a();
        if (a2 != null) {
            f35314g.onNext(a2);
        }
        String installId = AppLog.getInstallId();
        if (installId != null) {
            f35315h.onNext(installId);
        }
    }

    public static void f() {
        g<String> gVar = f35314g;
        String str = f35311d;
        gVar.onNext(str);
        String a2 = a();
        if (a2 != null) {
            gVar.onNext(a2);
        }
        g<String> gVar2 = f35315h;
        gVar2.onNext(str);
        String installId = AppLog.getInstallId();
        if (installId != null) {
            gVar2.onNext(installId);
        }
    }

    public static t<String> c() {
        t<String> a2 = f35314g.e().i().a(f.a.e.b.a.f157188a).a(b.f35317a).a(c.f35320a);
        l.b(a2, "");
        return a2;
    }

    static {
        Covode.recordClassIndex(21139);
        g<String> j2 = new f.a.l.b().j();
        l.b(j2, "");
        f35314g = j2;
        g<String> j3 = new f.a.l.b().j();
        l.b(j3, "");
        f35315h = j3;
        g<Boolean> j4 = new f.a.l.c().j();
        l.b(j4, "");
        f35308a = j4;
        g<Boolean> j5 = new f.a.l.c().j();
        l.b(j5, "");
        f35309b = j5;
        g<b> j6 = new f.a.l.c().j();
        l.b(j6, "");
        f35310c = j6;
    }

    static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35317a = new b();

        static {
            Covode.recordClassIndex(21141);
        }

        b() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
            return false;
        }
    }

    static final class c<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35320a = new c();

        static {
            Covode.recordClassIndex(21142);
        }

        c() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            if (!p.a(a.f35311d, str, true)) {
                return true;
            }
            return false;
        }
    }
}
