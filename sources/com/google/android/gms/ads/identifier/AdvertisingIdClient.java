package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.a.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AdvertisingIdClient {
    private final Context mContext;
    private com.google.android.gms.common.a zze;
    private c zzf;
    private boolean zzg;
    private final Object zzh;
    private a zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        static {
            Covode.recordClassIndex(31045);
        }

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            return new StringBuilder(String.valueOf(str).length() + 7).append("{").append(str).append("}").append(this.zzr).toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        CountDownLatch f49678a = new CountDownLatch(1);

        /* renamed from: b  reason: collision with root package name */
        boolean f49679b = false;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<AdvertisingIdClient> f49680c;

        /* renamed from: d  reason: collision with root package name */
        private long f49681d;

        static {
            Covode.recordClassIndex(31046);
        }

        public a(AdvertisingIdClient advertisingIdClient, long j2) {
            this.f49680c = new WeakReference<>(advertisingIdClient);
            this.f49681d = j2;
            start();
        }

        private final void a() {
            AdvertisingIdClient advertisingIdClient = this.f49680c.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.f49679b = true;
            }
        }

        public final void run() {
            try {
                if (!this.f49678a.await(this.f49681d, TimeUnit.MILLISECONDS)) {
                    a();
                }
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    static {
        Covode.recordClassIndex(31044);
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    private AdvertisingIdClient(Context context, long j2, boolean z, boolean z2) {
        Context com_google_android_gms_ads_identifier_AdvertisingIdClient_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
        this.zzh = new Object();
        r.a(context);
        if (z && (com_google_android_gms_ads_identifier_AdvertisingIdClient_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_google_android_gms_ads_identifier_AdvertisingIdClient_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context)) != null) {
            context = com_google_android_gms_ads_identifier_AdvertisingIdClient_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j2;
        this.zzj = z2;
    }

    public static int com_google_android_gms_ads_identifier_AdvertisingIdClient_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2, Throwable th) {
        return 0;
    }

    public static Context com_google_android_gms_ads_identifier_AdvertisingIdClient_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        return (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) ? com.ss.android.ugc.aweme.lancet.a.a.f107166a : applicationContext;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        b bVar = new b(context);
        boolean a2 = bVar.a("gads:ad_id_app_context:enabled");
        float b2 = bVar.b("gads:ad_id_app_context:ping_ratio");
        String a3 = bVar.a("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, a2, bVar.a("gads:ad_id_use_persistent_service:enabled"));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, a2, b2, SystemClock.elapsedRealtime() - elapsedRealtime, a3, null);
            advertisingIdClient.finish();
            return info;
        } catch (Throwable th) {
            advertisingIdClient.finish();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        b bVar = new b(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, bVar.a("gads:ad_id_app_context:enabled"), bVar.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START"));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private static com.google.android.gms.common.a zza(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int isGooglePlayServicesAvailable = com.google.android.gms.common.c.getInstance().isGooglePlayServicesAvailable(context, 12451000);
            if (isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    com.google.android.gms.common.stats.a.a();
                    if (com.google.android.gms.common.stats.a.b(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new d(9);
        }
    }

    private final void zza() {
        MethodCollector.i(10321);
        synchronized (this.zzh) {
            try {
                a aVar = this.zzi;
                if (aVar != null) {
                    aVar.f49678a.countDown();
                    try {
                        this.zzi.join();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.zzk > 0) {
                    this.zzi = new a(this, this.zzk);
                }
            } finally {
                MethodCollector.o(10321);
            }
        }
    }

    private final void zza(boolean z) {
        MethodCollector.i(10151);
        r.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg) {
                    finish();
                }
                com.google.android.gms.common.a zza = zza(this.mContext, this.zzj);
                this.zze = zza;
                this.zzf = zza(this.mContext, zza);
                this.zzg = true;
                if (z) {
                    zza();
                }
            } finally {
                MethodCollector.o(10151);
            }
        }
    }

    private final boolean zza(Info info, boolean z, float f2, long j2, String str, Throwable th) {
        if (Math.random() > ((double) f2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (info != null) {
            if (!info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            if (info.getId() != null) {
                hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j2));
        new a(hashMap).start();
        return true;
    }

    private final boolean zzb() {
        boolean c2;
        MethodCollector.i(10629);
        r.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzg) {
                    synchronized (this.zzh) {
                        try {
                            a aVar = this.zzi;
                            if (aVar == null || !aVar.f49679b) {
                                IOException iOException = new IOException("AdvertisingIdClient is not connected.");
                                MethodCollector.o(10629);
                                throw iOException;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        zza(false);
                        if (!this.zzg) {
                            IOException iOException2 = new IOException("AdvertisingIdClient cannot reconnect.");
                            MethodCollector.o(10629);
                            throw iOException2;
                        }
                    } catch (Exception e2) {
                        IOException iOException3 = new IOException("AdvertisingIdClient cannot reconnect.", e2);
                        MethodCollector.o(10629);
                        throw iOException3;
                    }
                }
                r.a(this.zze);
                r.a(this.zzf);
                try {
                    c2 = this.zzf.c();
                } catch (RemoteException e3) {
                    com_google_android_gms_ads_identifier_AdvertisingIdClient_com_ss_android_ugc_aweme_lancet_LogLancet_i("AdvertisingIdClient", "GMS remote exception ", e3);
                    IOException iOException4 = new IOException("Remote exception");
                    MethodCollector.o(10629);
                    throw iOException4;
                }
            } finally {
                MethodCollector.o(10629);
            }
        }
        zza();
        MethodCollector.o(10629);
        return c2;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        finish();
        super.finalize();
    }

    public Info getInfo() {
        Info info;
        MethodCollector.i(10470);
        r.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzg) {
                    synchronized (this.zzh) {
                        try {
                            a aVar = this.zzi;
                            if (aVar == null || !aVar.f49679b) {
                                IOException iOException = new IOException("AdvertisingIdClient is not connected.");
                                MethodCollector.o(10470);
                                throw iOException;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        zza(false);
                        if (!this.zzg) {
                            IOException iOException2 = new IOException("AdvertisingIdClient cannot reconnect.");
                            MethodCollector.o(10470);
                            throw iOException2;
                        }
                    } catch (Exception e2) {
                        IOException iOException3 = new IOException("AdvertisingIdClient cannot reconnect.", e2);
                        MethodCollector.o(10470);
                        throw iOException3;
                    }
                }
                r.a(this.zze);
                r.a(this.zzf);
                try {
                    info = new Info(this.zzf.a(), this.zzf.b());
                } catch (RemoteException e3) {
                    com_google_android_gms_ads_identifier_AdvertisingIdClient_com_ss_android_ugc_aweme_lancet_LogLancet_i("AdvertisingIdClient", "GMS remote exception ", e3);
                    IOException iOException4 = new IOException("Remote exception");
                    MethodCollector.o(10470);
                    throw iOException4;
                }
            } finally {
                MethodCollector.o(10470);
            }
        }
        zza();
        MethodCollector.o(10470);
        return info;
    }

    public void start() {
        zza(true);
    }

    public final void finish() {
        MethodCollector.i(10779);
        r.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.mContext != null && this.zze != null) {
                    try {
                        if (this.zzg) {
                            com.google.android.gms.common.stats.a.a();
                            this.mContext.unbindService(this.zze);
                        }
                    } catch (Throwable th) {
                        com_google_android_gms_ads_identifier_AdvertisingIdClient_com_ss_android_ugc_aweme_lancet_LogLancet_i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.zzg = false;
                    this.zzf = null;
                    this.zze = null;
                    MethodCollector.o(10779);
                }
            } finally {
                MethodCollector.o(10779);
            }
        }
    }

    private static c zza(Context context, com.google.android.gms.common.a aVar) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            r.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
            if (!aVar.f49951a) {
                aVar.f49951a = true;
                IBinder poll = aVar.f49952b.poll(10000, timeUnit);
                if (poll != null) {
                    IInterface queryLocalInterface = poll.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    return queryLocalInterface instanceof c ? (c) queryLocalInterface : new com.google.android.gms.internal.a.d(poll);
                }
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            throw new IllegalStateException("Cannot call get on this connection more than once");
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
