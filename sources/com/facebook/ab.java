package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.a.m;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.b;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.ss.android.ugc.aweme.bf.d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46900a = ab.class.getName();

    /* renamed from: b  reason: collision with root package name */
    private static AtomicBoolean f46901b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicBoolean f46902c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static a f46903d = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e  reason: collision with root package name */
    private static a f46904e = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f  reason: collision with root package name */
    private static a f46905f = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g  reason: collision with root package name */
    private static a f46906g = new a(false, "auto_event_setup_enabled");

    /* renamed from: h  reason: collision with root package name */
    private static a f46907h = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i  reason: collision with root package name */
    private static SharedPreferences f46908i;

    ab() {
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f46910a;

        /* renamed from: b  reason: collision with root package name */
        Boolean f46911b;

        /* renamed from: c  reason: collision with root package name */
        boolean f46912c;

        /* renamed from: d  reason: collision with root package name */
        long f46913d;

        static {
            Covode.recordClassIndex(28549);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            Boolean bool = this.f46911b;
            if (bool == null) {
                return this.f46912c;
            }
            return bool.booleanValue();
        }

        a(boolean z, String str) {
            this.f46912c = z;
            this.f46910a = str;
        }
    }

    public static boolean a() {
        if (com.facebook.internal.a.b.a.a(ab.class)) {
            return false;
        }
        try {
            i();
            return f46903d.a();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ab.class);
            return false;
        }
    }

    public static boolean b() {
        if (com.facebook.internal.a.b.a.a(ab.class)) {
            return false;
        }
        try {
            i();
            return f46904e.a();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ab.class);
            return false;
        }
    }

    public static boolean c() {
        if (com.facebook.internal.a.b.a.a(ab.class)) {
            return false;
        }
        try {
            i();
            return f46905f.a();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ab.class);
            return false;
        }
    }

    public static boolean d() {
        if (com.facebook.internal.a.b.a.a(ab.class)) {
            return false;
        }
        try {
            i();
            return f46906g.a();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ab.class);
            return false;
        }
    }

    public static boolean e() {
        if (com.facebook.internal.a.b.a.a(ab.class)) {
            return false;
        }
        try {
            i();
            return f46907h.a();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ab.class);
            return false;
        }
    }

    static /* synthetic */ a f() {
        if (com.facebook.internal.a.b.a.a(ab.class)) {
            return null;
        }
        try {
            return f46905f;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ab.class);
            return null;
        }
    }

    static /* synthetic */ a g() {
        if (com.facebook.internal.a.b.a.a(ab.class)) {
            return null;
        }
        try {
            return f46906g;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ab.class);
            return null;
        }
    }

    static /* synthetic */ AtomicBoolean h() {
        if (com.facebook.internal.a.b.a.a(ab.class)) {
            return null;
        }
        try {
            return f46902c;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, ab.class);
            return null;
        }
    }

    private static void l() {
        if (!com.facebook.internal.a.b.a.a(ab.class)) {
            try {
                if (!f46901b.get()) {
                    throw new n("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, ab.class);
            }
        }
    }

    static {
        Covode.recordClassIndex(28547);
    }

    private static void j() {
        if (!com.facebook.internal.a.b.a.a(ab.class)) {
            try {
                b(f46906g);
                final long currentTimeMillis = System.currentTimeMillis();
                if (f46906g.f46911b == null || currentTimeMillis - f46906g.f46913d >= 604800000) {
                    f46906g.f46911b = null;
                    f46906g.f46913d = 0;
                    if (f46902c.compareAndSet(false, true)) {
                        m.c().execute(new Runnable() {
                            /* class com.facebook.ab.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(28548);
                            }

                            public final void run() {
                                if (!com.facebook.internal.a.b.a.a(this)) {
                                    try {
                                        if (ab.f().a()) {
                                            ae.a();
                                            q a2 = r.a(m.f48915a, false);
                                            if (a2 != null && a2.f48651l) {
                                                ae.a();
                                                b a3 = b.a(m.f48921g);
                                                if (!(a3 == null || a3.a() == null || a3.a() == null)) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putString("advertiser_id", a3.a());
                                                    bundle.putString("fields", "auto_event_setup_enabled");
                                                    ae.a();
                                                    GraphRequest a4 = GraphRequest.a(m.f48915a);
                                                    a4.n = true;
                                                    a4.f46548j = bundle;
                                                    JSONObject jSONObject = GraphRequest.a(a4).f49017b;
                                                    if (jSONObject != null) {
                                                        ab.g().f46911b = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                                        ab.g().f46913d = currentTimeMillis;
                                                        a g2 = ab.g();
                                                        if (!com.facebook.internal.a.b.a.a(ab.class)) {
                                                            try {
                                                                ab.a(g2);
                                                            } catch (Throwable th) {
                                                                com.facebook.internal.a.b.a.a(th, ab.class);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ab.h().set(false);
                                    } catch (Throwable th2) {
                                        com.facebook.internal.a.b.a.a(th2, this);
                                    }
                                }
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, ab.class);
            }
        }
    }

    private static void i() {
        if (!com.facebook.internal.a.b.a.a(ab.class)) {
            try {
                if (m.a()) {
                    int i2 = 0;
                    if (f46901b.compareAndSet(false, true)) {
                        ae.a();
                        f46908i = d.a(m.f48921g, "com.facebook.sdk.USER_SETTINGS", 0);
                        a[] aVarArr = {f46904e, f46905f, f46903d};
                        if (!com.facebook.internal.a.b.a.a(ab.class)) {
                            do {
                                try {
                                    a aVar = aVarArr[i2];
                                    if (aVar == f46906g) {
                                        j();
                                    } else if (aVar.f46911b == null) {
                                        b(aVar);
                                        if (aVar.f46911b == null && !com.facebook.internal.a.b.a.a(ab.class)) {
                                            try {
                                                l();
                                                try {
                                                    ae.a();
                                                    Context context = m.f48921g;
                                                    ApplicationInfo a2 = a(context.getPackageManager(), context.getPackageName());
                                                    if (!(a2 == null || a2.metaData == null || !a2.metaData.containsKey(aVar.f46910a))) {
                                                        aVar.f46911b = Boolean.valueOf(a2.metaData.getBoolean(aVar.f46910a, aVar.f46912c));
                                                    }
                                                } catch (PackageManager.NameNotFoundException e2) {
                                                    ad.a(f46900a, (Exception) e2);
                                                }
                                            } catch (Throwable th) {
                                                com.facebook.internal.a.b.a.a(th, ab.class);
                                            }
                                        }
                                    } else {
                                        a(aVar);
                                    }
                                    i2++;
                                } catch (Throwable th2) {
                                    com.facebook.internal.a.b.a.a(th2, ab.class);
                                }
                            } while (i2 < 3);
                        }
                        j();
                        if (!com.facebook.internal.a.b.a.a(ab.class)) {
                            try {
                                ae.a();
                                Context context2 = m.f48921g;
                                ApplicationInfo a3 = a(context2.getPackageManager(), context2.getPackageName());
                                if (!(a3 == null || a3.metaData == null)) {
                                    a3.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                                    a3.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                                    c();
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            } catch (Throwable th3) {
                                com.facebook.internal.a.b.a.a(th3, ab.class);
                            }
                        }
                        k();
                    }
                }
            } catch (Throwable th4) {
                com.facebook.internal.a.b.a.a(th4, ab.class);
            }
        }
    }

    private static void k() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!com.facebook.internal.a.b.a.a(ab.class)) {
            try {
                if (f46901b.get() && m.a()) {
                    ae.a();
                    Context context = m.f48921g;
                    int i8 = 0;
                    if (f46903d.a()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    int i9 = (i2 << 0) | 0;
                    if (f46904e.a()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    int i10 = i9 | (i3 << 1);
                    if (f46905f.a()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i11 = i10 | (i4 << 2);
                    if (f46907h.a()) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    int i12 = i11 | (i5 << 3);
                    int i13 = f46908i.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                    if (i13 != i12) {
                        f46908i.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i12).commit();
                        try {
                            ApplicationInfo a2 = a(context.getPackageManager(), context.getPackageName());
                            if (!(a2 == null || a2.metaData == null)) {
                                String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                                boolean[] zArr = {true, true, true, true};
                                int i14 = 0;
                                i6 = 0;
                                i8 = 0;
                                while (true) {
                                    try {
                                        if (a2.metaData.containsKey(strArr[i14])) {
                                            i7 = 1;
                                        } else {
                                            i7 = 0;
                                        }
                                        i8 |= i7 << i14;
                                        i6 |= (a2.metaData.getBoolean(strArr[i14], zArr[i14]) ? 1 : 0) << i14;
                                        i14++;
                                        if (i14 >= 4) {
                                            break;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    }
                                }
                                m mVar = new m(context);
                                Bundle bundle = new Bundle();
                                bundle.putInt("usage", i8);
                                bundle.putInt("initial", i6);
                                bundle.putInt("previous", i13);
                                bundle.putInt("current", i12);
                                mVar.a(bundle);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        i6 = 0;
                        m mVar2 = new m(context);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("usage", i8);
                        bundle2.putInt("initial", i6);
                        bundle2.putInt("previous", i13);
                        bundle2.putInt("current", i12);
                        mVar2.a(bundle2);
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, ab.class);
            }
        }
    }

    static void a(a aVar) {
        if (!com.facebook.internal.a.b.a.a(ab.class)) {
            try {
                l();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("value", aVar.f46911b);
                    jSONObject.put("last_timestamp", aVar.f46913d);
                    f46908i.edit().putString(aVar.f46910a, jSONObject.toString()).commit();
                    k();
                } catch (Exception e2) {
                    ad.a(f46900a, e2);
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, ab.class);
            }
        }
    }

    private static void b(a aVar) {
        if (!com.facebook.internal.a.b.a.a(ab.class)) {
            try {
                l();
                try {
                    String string = f46908i.getString(aVar.f46910a, "");
                    if (!string.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(string);
                        aVar.f46911b = Boolean.valueOf(jSONObject.getBoolean("value"));
                        aVar.f46913d = jSONObject.getLong("last_timestamp");
                    }
                } catch (JSONException e2) {
                    ad.a(f46900a, (Exception) e2);
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, ab.class);
            }
        }
    }

    public static ApplicationInfo a(PackageManager packageManager, String str) {
        if (!TextUtils.equals(str, com.bytedance.ies.ugc.appcontext.d.a().getPackageName())) {
            return packageManager.getApplicationInfo(str, 128);
        }
        if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
            com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(str, 128);
        }
        return com.ss.android.ugc.aweme.lancet.c.b.f107191a;
    }
}
