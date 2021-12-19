package com.bytedance.bpea.entry.a.b;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.bytedance.bpea.basics.d;
import com.bytedance.bpea.entry.common.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0568a f26663a = new C0568a((byte) 0);

    static {
        Covode.recordClassIndex(15709);
    }

    public static final void a(LocationManager locationManager, String str, long j2, LocationListener locationListener, Looper looper, d dVar) {
        C0568a.a(locationManager, str, j2, locationListener, looper, dVar);
    }

    /* renamed from: com.bytedance.bpea.entry.a.b.a$a  reason: collision with other inner class name */
    public static final class C0568a {
        static {
            Covode.recordClassIndex(15710);
        }

        private static void a(LocationManager locationManager, String str, long j2, float f2, LocationListener locationListener, Looper looper) {
            Float valueOf = Float.valueOf(0.0f);
            if (!((Boolean) com.bytedance.helios.sdk.a.a(locationManager, new Object[]{str, Long.valueOf(j2), valueOf, locationListener, looper}, 100001, "void", false, null).first).booleanValue()) {
                com.bytedance.helios.sdk.a.a(null, locationManager, new Object[]{str, Long.valueOf(j2), valueOf, locationListener, looper}, 100001, "com_bytedance_bpea_entry_api_location_LocationEntry$Companion_android_location_LocationManager_requestLocationUpdates(Landroid/location/LocationManager;Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V");
                locationManager.requestLocationUpdates(str, j2, 0.0f, locationListener, looper);
            }
        }

        private C0568a() {
        }

        public /* synthetic */ C0568a(byte b2) {
            this();
        }

        public static void a(LocationManager locationManager, String str, long j2, LocationListener locationListener, Looper looper, d dVar) {
            l.c(locationManager, "");
            l.c(str, "");
            l.c(locationListener, "");
            a.C0572a.d(dVar, "location_requestLocationUpdates");
            a(locationManager, str, j2, 0.0f, locationListener, looper);
        }
    }
}
