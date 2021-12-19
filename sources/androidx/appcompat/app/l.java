package androidx.appcompat.app;

import android.content.ClipboardManager;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.core.content.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Calendar;

final class l {

    /* renamed from: a  reason: collision with root package name */
    private static l f974a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f975b;

    /* renamed from: c  reason: collision with root package name */
    private final LocationManager f976c;

    /* renamed from: d  reason: collision with root package name */
    private final a f977d = new a();

    static {
        Covode.recordClassIndex(284);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f978a;

        /* renamed from: b  reason: collision with root package name */
        long f979b;

        /* renamed from: c  reason: collision with root package name */
        long f980c;

        /* renamed from: d  reason: collision with root package name */
        long f981d;

        /* renamed from: e  reason: collision with root package name */
        long f982e;

        /* renamed from: f  reason: collision with root package name */
        long f983f;

        static {
            Covode.recordClassIndex(285);
        }

        a() {
        }
    }

    private boolean c() {
        if (this.f977d.f983f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    private Location b() {
        Location a2;
        Location location = null;
        if (c.a(this.f975b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = a("network");
        }
        if (c.a(this.f975b, "android.permission.ACCESS_FINE_LOCATION") != 0 || (a2 = a("gps")) == null) {
            return location;
        }
        if (location == null || a2.getTime() > location.getTime()) {
            return a2;
        }
        return location;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        a aVar = this.f977d;
        if (c()) {
            return aVar.f978a;
        }
        Location b2 = b();
        if (b2 != null) {
            a(b2);
            return aVar.f978a;
        }
        int i2 = Calendar.getInstance().get(11);
        if (i2 < 6 || i2 >= 22) {
            return true;
        }
        return false;
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    static l a(Context context) {
        if (f974a == null) {
            Context b2 = b(context);
            f974a = new l(b2, (LocationManager) a(b2, "location"));
        }
        return f974a;
    }

    private Location a(String str) {
        try {
            if (this.f976c.isProviderEnabled(str)) {
                LocationManager locationManager = this.f976c;
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(locationManager, new Object[]{str}, 100000, "android.location.Location", false, null);
                if (((Boolean) a2.first).booleanValue()) {
                    return (Location) a2.second;
                }
                com.bytedance.helios.sdk.a.a(null, locationManager, new Object[]{str}, 100000, "androidx_appcompat_app_TwilightManager_android_location_LocationManager_getLastKnownLocation(Landroid/location/LocationManager;Ljava/lang/String;)Landroid/location/Location;");
                return locationManager.getLastKnownLocation(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private void a(Location location) {
        boolean z;
        long j2;
        long j3;
        a aVar = this.f977d;
        long currentTimeMillis = System.currentTimeMillis();
        k a2 = k.a();
        a2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j4 = a2.f971a;
        a2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (a2.f973c == 1) {
            z = true;
        } else {
            z = false;
        }
        long j5 = a2.f972b;
        long j6 = a2.f971a;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a2.f972b;
        if (j5 == -1 || j6 == -1) {
            j2 = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j6) {
                j3 = 0 + j7;
            } else if (currentTimeMillis > j5) {
                j3 = 0 + j6;
            } else {
                j3 = 0 + j5;
            }
            j2 = j3 + 60000;
        }
        aVar.f978a = z;
        aVar.f979b = j4;
        aVar.f980c = j5;
        aVar.f981d = j6;
        aVar.f982e = j7;
        aVar.f983f = j2;
    }

    private l(Context context, LocationManager locationManager) {
        this.f975b = context;
        this.f976c = locationManager;
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
