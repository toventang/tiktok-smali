package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.k;
import com.google.android.gms.common.internal.r;
import com.google.firebase.b;
import com.google.firebase.b.d;
import com.google.firebase.c.c;
import com.google.firebase.iid.aq;
import com.google.firebase.installations.h;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public class FirebaseInstanceId {
    private static final Pattern API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static aq store;
    static ScheduledExecutorService syncExecutor;
    public final b app;
    private final a autoInit;
    final Executor fileIoExecutor;
    private final h firebaseInstallations;
    private final ae metadata;
    private final ah requestDeduplicator;
    private final q rpc;
    private boolean syncScheduledOrRunning;

    /* access modifiers changed from: package-private */
    public b getApp() {
        return this.app;
    }

    public boolean isFcmAutoInitEnabled() {
        return this.autoInit.a();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.a();
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(b.d());
    }

    /* access modifiers changed from: package-private */
    public String blockingGetMasterToken() {
        return getToken(ae.a(this.app), "*");
    }

    /* access modifiers changed from: package-private */
    public void forceTokenRefresh() {
        store.c(getSubtype());
        startSync();
    }

    public long getCreationTime() {
        return store.a(this.app.h());
    }

    public String getId() {
        checkRequiredFirebaseOptions(this.app);
        startSyncIfNecessary();
        return getIdWithoutTriggeringSync();
    }

    /* access modifiers changed from: package-private */
    public aq.a getTokenWithoutTriggeringSync() {
        return getTokenWithoutTriggeringSync(ae.a(this.app), "*");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$FirebaseInstanceId() {
        if (isFcmAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    public void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    static {
        Covode.recordClassIndex(33761);
    }

    public static synchronized void clearInstancesForTest() {
        synchronized (FirebaseInstanceId.class) {
            MethodCollector.i(14571);
            ScheduledExecutorService scheduledExecutorService = syncExecutor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
            syncExecutor = null;
            store = null;
            MethodCollector.o(14571);
        }
    }

    private String getSubtype() {
        if ("[DEFAULT]".equals(this.app.b())) {
            return "";
        }
        return this.app.h();
    }

    static boolean isDebugLogEnabled() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseInstanceId", 3)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public String getIdWithoutTriggeringSync() {
        try {
            store.b(this.app.h());
            return (String) awaitTaskAllowOnMainThread(this.firebaseInstallations.a());
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public String getToken() {
        checkRequiredFirebaseOptions(this.app);
        aq.a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            startSync();
        }
        if (tokenWithoutTriggeringSync == null) {
            return null;
        }
        return tokenWithoutTriggeringSync.f54428b;
    }

    /* access modifiers changed from: package-private */
    public synchronized void resetStorageAndScheduleSync() {
        MethodCollector.i(14572);
        store.a();
        if (isFcmAutoInitEnabled()) {
            startSync();
        }
        MethodCollector.o(14572);
    }

    /* access modifiers changed from: package-private */
    public synchronized void startSync() {
        MethodCollector.i(14555);
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0);
        }
        MethodCollector.o(14555);
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        private boolean f54377b;

        /* renamed from: c  reason: collision with root package name */
        private final d f54378c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f54379d;

        /* renamed from: e  reason: collision with root package name */
        private com.google.firebase.b.b<com.google.firebase.a> f54380e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f54381f;

        static {
            Covode.recordClassIndex(33762);
        }

        private synchronized void b() {
            MethodCollector.i(13036);
            if (this.f54379d) {
                MethodCollector.o(13036);
                return;
            }
            this.f54377b = d();
            Boolean c2 = c();
            this.f54381f = c2;
            if (c2 == null && this.f54377b) {
                o oVar = new o(this);
                this.f54380e = oVar;
                this.f54378c.a(com.google.firebase.a.class, oVar);
            }
            this.f54379d = true;
            MethodCollector.o(13036);
        }

        private boolean d() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a2 = FirebaseInstanceId.this.app.a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a2.getPackageName());
                ResolveInfo resolveService = a2.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean a() {
            MethodCollector.i(13037);
            b();
            Boolean bool = this.f54381f;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                MethodCollector.o(13037);
                return booleanValue;
            } else if (!this.f54377b || !FirebaseInstanceId.this.app.e()) {
                MethodCollector.o(13037);
                return false;
            } else {
                MethodCollector.o(13037);
                return true;
            }
        }

        private Boolean c() {
            ApplicationInfo applicationInfo;
            Context a2 = FirebaseInstanceId.this.app.a();
            SharedPreferences a3 = com.ss.android.ugc.aweme.bf.d.a(a2, "com.google.firebase.messaging", 0);
            if (a3.contains("auto_init")) {
                return Boolean.valueOf(a3.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = a2.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                String packageName = a2.getPackageName();
                if (TextUtils.equals(packageName, com.bytedance.ies.ugc.appcontext.d.a().getPackageName())) {
                    if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
                        com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = com.ss.android.ugc.aweme.lancet.c.b.f107191a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public final synchronized void a(boolean z) {
            MethodCollector.i(13123);
            b();
            com.google.firebase.b.b<com.google.firebase.a> bVar = this.f54380e;
            if (bVar != null) {
                this.f54378c.b(com.google.firebase.a.class, bVar);
                this.f54380e = null;
            }
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(FirebaseInstanceId.this.app.a(), "com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.startSyncIfNecessary();
            }
            this.f54381f = Boolean.valueOf(z);
            MethodCollector.o(13123);
        }

        a(d dVar) {
            this.f54378c = dVar;
        }
    }

    public void deleteInstanceId() {
        checkRequiredFirebaseOptions(this.app);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            awaitTask(this.firebaseInstallations.c());
            resetStorageAndScheduleSync();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public com.google.android.gms.c.h<v> getInstanceId() {
        checkRequiredFirebaseOptions(this.app);
        return getInstanceId(ae.a(this.app), "*");
    }

    static boolean isValidAppIdFormat(String str) {
        return str.contains(":");
    }

    public void setFcmAutoInitEnabled(boolean z) {
        this.autoInit.a(z);
    }

    static boolean isValidApiKeyFormat(String str) {
        return API_KEY_FORMAT.matcher(str).matches();
    }

    /* access modifiers changed from: package-private */
    public synchronized void setSyncScheduledOrRunning(boolean z) {
        MethodCollector.i(14554);
        this.syncScheduledOrRunning = z;
        MethodCollector.o(14554);
    }

    public static FirebaseInstanceId getInstance(b bVar) {
        checkRequiredFirebaseOptions(bVar);
        return (FirebaseInstanceId) bVar.a(FirebaseInstanceId.class);
    }

    private static String rationaliseScope(String str) {
        if (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) {
            return "*";
        }
        return str;
    }

    private <T> T awaitTask(com.google.android.gms.c.h<T> hVar) {
        try {
            return (T) k.a(hVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    resetStorageAndScheduleSync();
                }
                throw cause;
            } else if (cause instanceof RuntimeException) {
                throw cause;
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private static <T> T awaitTaskAllowOnMainThread(com.google.android.gms.c.h<T> hVar) {
        r.a(hVar, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hVar.a(k.f54466a, new l(countDownLatch));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        return (T) getResultOrThrowException(hVar);
    }

    private static void checkRequiredFirebaseOptions(b bVar) {
        r.a(bVar.c().f54362g, (Object) "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        r.a(bVar.c().f54357b, (Object) "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        r.a(bVar.c().f54356a, (Object) "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        r.b(isValidAppIdFormat(bVar.c().f54357b), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(isValidApiKeyFormat(bVar.c().f54356a), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private static <T> T getResultOrThrowException(com.google.android.gms.c.h<T> hVar) {
        if (hVar.b()) {
            return hVar.d();
        }
        if (hVar.c()) {
            throw new CancellationException("Task is already canceled");
        } else if (hVar.a()) {
            throw new IllegalStateException(hVar.e());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void syncWithDelaySecondsInternal(long j2) {
        MethodCollector.i(14556);
        enqueueTaskWithDelaySeconds(new ar(this, Math.min(Math.max(30L, j2 << 1), MAX_DELAY_SEC)), j2);
        this.syncScheduledOrRunning = true;
        MethodCollector.o(14556);
    }

    /* access modifiers changed from: package-private */
    public boolean tokenNeedsRefresh(aq.a aVar) {
        if (aVar != null) {
            String c2 = this.metadata.c();
            if (System.currentTimeMillis() > aVar.f54430d + aq.a.f54427a || !c2.equals(aVar.f54429c)) {
                return true;
            }
            return false;
        }
        return true;
    }

    private com.google.android.gms.c.h<v> getInstanceId(String str, String str2) {
        return k.a((Object) null).b(this.fileIoExecutor, new j(this, str, rationaliseScope(str2)));
    }

    /* access modifiers changed from: package-private */
    public aq.a getTokenWithoutTriggeringSync(String str, String str2) {
        return store.a(getSubtype(), str, str2);
    }

    /* access modifiers changed from: package-private */
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j2) {
        MethodCollector.i(14566);
        synchronized (FirebaseInstanceId.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.b("FirebaseInstanceId"));
                }
                syncExecutor.schedule(runnable, j2, TimeUnit.SECONDS);
            } finally {
                MethodCollector.o(14566);
            }
        }
    }

    public String getToken(String str, String str2) {
        checkRequiredFirebaseOptions(this.app);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((v) awaitTask(getInstanceId(str, str2))).b();
        }
        throw new IOException("MAIN_THREAD");
    }

    public void deleteToken(String str, String str2) {
        checkRequiredFirebaseOptions(this.app);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String rationaliseScope = rationaliseScope(str2);
            String idWithoutTriggeringSync = getIdWithoutTriggeringSync();
            q qVar = this.rpc;
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            awaitTask(qVar.a(qVar.a(idWithoutTriggeringSync, str, rationaliseScope, bundle)));
            store.b(getSubtype(), str, rationaliseScope);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ com.google.android.gms.c.h lambda$getInstanceId$2$FirebaseInstanceId(String str, String str2, String str3) {
        q qVar = this.rpc;
        return qVar.a(qVar.a(str, str2, str3, new Bundle())).a(this.fileIoExecutor, new n(this, str2, str3, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ com.google.android.gms.c.h lambda$getInstanceId$3$FirebaseInstanceId(String str, String str2, com.google.android.gms.c.h hVar) {
        String idWithoutTriggeringSync = getIdWithoutTriggeringSync();
        aq.a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync(str, str2);
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return k.a(new w(idWithoutTriggeringSync, tokenWithoutTriggeringSync.f54428b));
        }
        return this.requestDeduplicator.a(str, str2, new m(this, idWithoutTriggeringSync, str, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ com.google.android.gms.c.h lambda$getInstanceId$1$FirebaseInstanceId(String str, String str2, String str3, String str4) {
        store.a(getSubtype(), str, str2, str4, this.metadata.c());
        return k.a(new w(str3, str4));
    }

    FirebaseInstanceId(b bVar, d dVar, com.google.firebase.f.h hVar, c cVar, h hVar2) {
        this(bVar, new ae(bVar.a()), g.a(), g.a(), dVar, hVar, cVar, hVar2);
    }

    FirebaseInstanceId(b bVar, ae aeVar, Executor executor, Executor executor2, d dVar, com.google.firebase.f.h hVar, c cVar, h hVar2) {
        MethodCollector.i(14553);
        if (ae.a(bVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                try {
                    if (store == null) {
                        store = new aq(bVar.a());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14553);
                    throw th;
                }
            }
            this.app = bVar;
            this.metadata = aeVar;
            this.rpc = new q(bVar, aeVar, hVar, cVar, hVar2);
            this.fileIoExecutor = executor2;
            this.autoInit = new a(dVar);
            this.requestDeduplicator = new ah(executor);
            this.firebaseInstallations = hVar2;
            executor2.execute(new i(this));
            MethodCollector.o(14553);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        MethodCollector.o(14553);
        throw illegalStateException;
    }
}
