package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.gi;
import com.google.android.gms.measurement.internal.ho;
import com.ss.android.ugc.aweme.bf.d;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;

public class f {

    /* renamed from: e  reason: collision with root package name */
    static Boolean f50836e;

    /* renamed from: i  reason: collision with root package name */
    private static volatile f f50837i;

    /* renamed from: l  reason: collision with root package name */
    private static String f50838l = "allow_remote_dynamite";

    /* renamed from: a  reason: collision with root package name */
    final String f50839a = "FA";

    /* renamed from: b  reason: collision with root package name */
    protected final e f50840b = g.f50507a;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.gms.measurement.a.a f50841c = new com.google.android.gms.measurement.a.a(this);

    /* renamed from: d  reason: collision with root package name */
    List<Pair<gi, Object>> f50842d;

    /* renamed from: f  reason: collision with root package name */
    boolean f50843f;

    /* renamed from: g  reason: collision with root package name */
    public String f50844g;

    /* renamed from: h  reason: collision with root package name */
    pa f50845h;

    /* renamed from: j  reason: collision with root package name */
    private final ExecutorService f50846j = gk.f50933a.a(new r());

    /* renamed from: k  reason: collision with root package name */
    private int f50847k;

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true);
    }

    public final void a(String str, String str2, Bundle bundle, boolean z) {
        a(new ag(this, str, str2, bundle, z));
    }

    public final void a(String str, String str2, Object obj, boolean z) {
        a(new af(this, str, str2, obj, z));
    }

    public final void a(String str, Object obj) {
        a(new aa(this, str, obj));
    }

    static {
        Covode.recordClassIndex(31775);
    }

    private static boolean b() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final long f50848a;

        /* renamed from: b  reason: collision with root package name */
        final long f50849b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f50850c;

        static {
            Covode.recordClassIndex(31776);
        }

        /* access modifiers changed from: protected */
        public void a() {
        }

        /* access modifiers changed from: package-private */
        public abstract void b();

        public void run() {
            if (f.this.f50843f) {
                a();
                return;
            }
            try {
                b();
            } catch (Exception e2) {
                f.this.a(e2, false, this.f50850c);
                a();
            }
        }

        a(f fVar) {
            this(true);
        }

        a(boolean z) {
            this.f50848a = f.this.f50840b.a();
            this.f50849b = f.this.f50840b.b();
            this.f50850c = z;
        }
    }

    public final long a() {
        oy oyVar = new oy();
        a(new v(this, oyVar));
        Long l2 = (Long) oy.a(oyVar.b(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f50840b.a()).nextLong();
        int i2 = this.f50847k + 1;
        this.f50847k = i2;
        return nextLong + ((long) i2);
    }

    class b implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(31777);
        }

        b() {
        }

        public final void onActivityDestroyed(Activity activity) {
            f.this.a(new an(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            f.this.a(new aj(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            f.this.a(new ak(this, activity));
        }

        public final void onActivityStarted(Activity activity) {
            f.this.a(new ah(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            f.this.a(new am(this, activity));
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            f.this.a(new ai(this, activity, bundle));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            oy oyVar = new oy();
            f.this.a(new al(this, activity, oyVar));
            Bundle b2 = oyVar.b(50);
            if (b2 != null) {
                bundle.putAll(b2);
            }
        }
    }

    private static boolean b(Context context) {
        try {
            if (ho.a(context, "google_app_id") != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
        }
    }

    static /* synthetic */ void a(Context context) {
        MethodCollector.i(2626);
        synchronized (f.class) {
            try {
                if (f50836e != null) {
                    try {
                        MethodCollector.o(2626);
                    } catch (Throwable th) {
                        MethodCollector.o(2626);
                        throw th;
                    }
                } else if (a(context, "app_measurement_internal_disable_startup_flags")) {
                    f50836e = false;
                    MethodCollector.o(2626);
                } else {
                    SharedPreferences a2 = d.a(context, "com.google.android.gms.measurement.prefs", 0);
                    f50836e = Boolean.valueOf(a2.getBoolean(f50838l, false));
                    SharedPreferences.Editor edit = a2.edit();
                    edit.remove(f50838l);
                    edit.apply();
                    MethodCollector.o(2626);
                }
            } catch (Exception unused) {
                f50836e = false;
            }
        }
    }

    public final void a(a aVar) {
        this.f50846j.execute(aVar);
    }

    public static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    static boolean a(String str, String str2) {
        if (str2 == null || str == null || b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final pa a(Context context, boolean z) {
        DynamiteModule.b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.f50536e;
            } catch (DynamiteModule.a e2) {
                a((Exception) e2, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.f50533b;
        }
        return oz.asInterface(DynamiteModule.a(context, bVar, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    public static f a(Context context, Bundle bundle) {
        MethodCollector.i(2581);
        r.a(context);
        if (f50837i == null) {
            synchronized (f.class) {
                try {
                    if (f50837i == null) {
                        f50837i = new f(context, bundle);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2581);
                    throw th;
                }
            }
        }
        f fVar = f50837i;
        MethodCollector.o(2581);
        return fVar;
    }

    private f(Context context, Bundle bundle) {
        boolean z;
        if (!b(context) || b()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f50844g = null;
            this.f50843f = true;
            return;
        }
        if (!a((String) null, (String) null)) {
            this.f50844g = "fa";
        } else {
            this.f50844g = null;
        }
        a(new i(this, null, null, context, bundle));
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        Application application = (Application) applicationContext;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    private static boolean a(Context context, String str) {
        r.a(str);
        try {
            ApplicationInfo a2 = c.f50295a.a(context).a(context.getPackageName(), 128);
            if (a2 != null) {
                if (a2.metaData != null) {
                    return a2.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(Exception exc, boolean z, boolean z2) {
        this.f50843f |= z;
        if (!z && z2) {
            a("Error with data collection. Data lost.", exc);
        }
    }
}
