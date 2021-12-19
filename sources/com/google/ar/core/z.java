package com.google.ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.c.b;

final class z extends ArCoreApk {

    /* renamed from: a  reason: collision with root package name */
    static final z f53484a = new z();

    /* renamed from: b  reason: collision with root package name */
    Exception f53485b;

    /* renamed from: c  reason: collision with root package name */
    boolean f53486c = true;

    /* renamed from: d  reason: collision with root package name */
    ArCoreApk.Availability f53487d;

    /* renamed from: e  reason: collision with root package name */
    boolean f53488e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f53489f;

    /* renamed from: g  reason: collision with root package name */
    private int f53490g;

    /* renamed from: h  reason: collision with root package name */
    private long f53491h;

    /* renamed from: i  reason: collision with root package name */
    private ak f53492i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f53493j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f53494k;

    /* renamed from: l  reason: collision with root package name */
    private int f53495l;

    z() {
    }

    private static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    static {
        Covode.recordClassIndex(33121);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        MethodCollector.i(12441);
        if (this.f53485b == null) {
            this.f53490g = 0;
        }
        this.f53489f = false;
        ak akVar = this.f53492i;
        if (akVar != null) {
            akVar.a();
            this.f53492i = null;
            MethodCollector.o(12441);
            return;
        }
        MethodCollector.o(12441);
    }

    private final boolean c(Context context) {
        e(context);
        return this.f53494k;
    }

    private static final ArCoreApk.InstallStatus a(Activity activity) {
        PendingIntent a2 = i.a(activity);
        if (a2 != null) {
            try {
                activity.startIntentSender(a2.getIntentSender(), null, 0, 0, 0);
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException | RuntimeException unused) {
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    private boolean b(Context context) {
        e(context);
        if (d(context) == 0 || d(context) >= this.f53495l) {
            return true;
        }
        return false;
    }

    private static int d(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i2 = packageInfo.versionCode;
            if (i2 != 0) {
                return i2;
            }
            if (packageInfo.services == null || packageInfo.services.length == 0) {
                return -1;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized ak a(Context context) {
        ak akVar;
        MethodCollector.i(12440);
        if (this.f53492i == null) {
            ak akVar2 = new ak((byte) 0);
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = a.f107166a;
                }
            }
            akVar2.a(applicationContext);
            this.f53492i = akVar2;
        }
        akVar = this.f53492i;
        MethodCollector.o(12440);
        return akVar;
    }

    private final synchronized void e(Context context) {
        ApplicationInfo applicationInfo;
        String str;
        MethodCollector.i(12574);
        if (this.f53493j) {
            MethodCollector.o(12574);
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            if (TextUtils.equals(packageName, d.a().getPackageName())) {
                if (b.f107191a == null) {
                    b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = b.f107191a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle.containsKey("com.google.ar.core")) {
                String string = bundle.getString("com.google.ar.core");
                string.getClass();
                this.f53494k = string.equals("required");
                if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                    this.f53495l = bundle.getInt("com.google.ar.core.min_apk_version");
                    try {
                        ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                        String canonicalName = InstallActivity.class.getCanonicalName();
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (canonicalName.equals(activityInfo.name)) {
                                this.f53493j = true;
                                MethodCollector.o(12574);
                                return;
                            }
                        }
                        String valueOf = String.valueOf(canonicalName);
                        if (valueOf.length() != 0) {
                            str = "Application manifest must contain activity ".concat(valueOf);
                        } else {
                            str = new String("Application manifest must contain activity ");
                        }
                        FatalException fatalException = new FatalException(str);
                        MethodCollector.o(12574);
                        throw fatalException;
                    } catch (PackageManager.NameNotFoundException e2) {
                        FatalException fatalException2 = new FatalException("Could not load application package info", e2);
                        MethodCollector.o(12574);
                        throw fatalException2;
                    }
                } else {
                    FatalException fatalException3 = new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
                    MethodCollector.o(12574);
                    throw fatalException3;
                }
            } else {
                FatalException fatalException4 = new FatalException("Application manifest must contain meta-data com.google.ar.core");
                MethodCollector.o(12574);
                throw fatalException4;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            FatalException fatalException5 = new FatalException("Could not load application package metadata", e3);
            MethodCollector.o(12574);
            throw fatalException5;
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.Availability checkAvailability(Context context) {
        ArCoreApk.Availability availability;
        MethodCollector.i(12438);
        if (!b()) {
            ArCoreApk.Availability availability2 = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
            MethodCollector.o(12438);
            return availability2;
        }
        try {
            if (b(context)) {
                a();
                try {
                    if (i.a(context) != null) {
                        availability = ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
                    } else {
                        availability = ArCoreApk.Availability.SUPPORTED_INSTALLED;
                    }
                } catch (UnavailableDeviceNotCompatibleException unused) {
                    availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                    availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                }
                MethodCollector.o(12438);
                return availability;
            }
            synchronized (this) {
                try {
                    ArCoreApk.Availability availability3 = this.f53487d;
                    if ((availability3 == null || availability3.isUnknown()) && !this.f53488e) {
                        this.f53488e = true;
                        y yVar = new y(this);
                        if (b(context)) {
                            yVar.a(ArCoreApk.Availability.SUPPORTED_INSTALLED);
                        } else if (d(context) != -1) {
                            yVar.a(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
                        } else if (c(context)) {
                            yVar.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                        } else {
                            a(context).a(context, yVar);
                        }
                    }
                    ArCoreApk.Availability availability4 = this.f53487d;
                    if (availability4 != null) {
                        return availability4;
                    }
                    if (this.f53488e) {
                        ArCoreApk.Availability availability5 = ArCoreApk.Availability.UNKNOWN_CHECKING;
                        MethodCollector.o(12438);
                        return availability5;
                    }
                    ArCoreApk.Availability availability6 = ArCoreApk.Availability.UNKNOWN_ERROR;
                    MethodCollector.o(12438);
                    return availability6;
                } finally {
                    MethodCollector.o(12438);
                }
            }
        } catch (FatalException unused3) {
            ArCoreApk.Availability availability7 = ArCoreApk.Availability.UNKNOWN_ERROR;
            MethodCollector.o(12438);
            return availability7;
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) {
        ArCoreApk.InstallBehavior installBehavior;
        ArCoreApk.UserMessageType userMessageType;
        if (c(activity)) {
            installBehavior = ArCoreApk.InstallBehavior.REQUIRED;
        } else {
            installBehavior = ArCoreApk.InstallBehavior.OPTIONAL;
        }
        if (c(activity)) {
            userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        } else {
            userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
        }
        return requestInstall(activity, z, installBehavior, userMessageType);
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        if (!b()) {
            throw new UnavailableDeviceNotCompatibleException();
        } else if (b(activity)) {
            a();
            return a(activity);
        } else if (this.f53489f) {
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        } else {
            Exception exc = this.f53485b;
            if (exc != null) {
                if (z) {
                    this.f53485b = null;
                } else if (exc instanceof UnavailableDeviceNotCompatibleException) {
                    throw exc;
                } else if (exc instanceof UnavailableUserDeclinedInstallationException) {
                    throw exc;
                } else if (exc instanceof RuntimeException) {
                    throw exc;
                } else {
                    throw new RuntimeException("Unexpected exception type", exc);
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f53491h > 5000) {
                this.f53490g = 0;
            }
            int i2 = this.f53490g + 1;
            this.f53490g = i2;
            this.f53491h = uptimeMillis;
            if (i2 <= 2) {
                try {
                    Intent putExtra = new Intent(activity, InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior);
                    com.ss.android.ugc.tiktok.security.a.a.a(putExtra, activity);
                    activity.startActivity(putExtra);
                    this.f53489f = true;
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                } catch (ActivityNotFoundException e2) {
                    throw new FatalException("Failed to launch InstallActivity", e2);
                }
            } else {
                throw new FatalException("Requesting ARCore installation too rapidly.");
            }
        }
    }
}
