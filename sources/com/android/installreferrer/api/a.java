package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.b.a.a;
import com.ss.android.ugc.aweme.push.downgrade.d;
import java.util.List;

final class a extends InstallReferrerClient {

    /* renamed from: a  reason: collision with root package name */
    public int f5911a;

    /* renamed from: b  reason: collision with root package name */
    public com.google.android.b.a.a f5912b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5913c;

    /* renamed from: d  reason: collision with root package name */
    private ServiceConnection f5914d;

    static {
        Covode.recordClassIndex(2475);
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final boolean a() {
        return (this.f5911a != 2 || this.f5912b == null || this.f5914d == null) ? false : true;
    }

    private boolean d() {
        try {
            if (this.f5913c.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void b() {
        this.f5911a = 3;
        ServiceConnection serviceConnection = this.f5914d;
        if (serviceConnection != null) {
            this.f5913c.unbindService(serviceConnection);
            this.f5914d = null;
        }
        this.f5912b = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails c() {
        if (a()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f5913c.getPackageName());
            try {
                return new ReferrerDetails(this.f5912b.a(bundle));
            } catch (RemoteException e2) {
                this.f5911a = 0;
                throw e2;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    /* renamed from: com.android.installreferrer.api.a$a  reason: collision with other inner class name */
    final class ServiceConnectionC0077a implements ServiceConnection {

        /* renamed from: b  reason: collision with root package name */
        private final InstallReferrerStateListener f5916b;

        static {
            Covode.recordClassIndex(2476);
        }

        /* synthetic */ ServiceConnectionC0077a(a aVar, InstallReferrerStateListener installReferrerStateListener, byte b2) {
            this(installReferrerStateListener);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            a.this.f5912b = null;
            a.this.f5911a = 0;
            this.f5916b.onInstallReferrerServiceDisconnected();
        }

        private ServiceConnectionC0077a(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f5916b = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.google.android.b.a.a aVar;
            a aVar2 = a.this;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof com.google.android.b.a.a) {
                    aVar = (com.google.android.b.a.a) queryLocalInterface;
                } else {
                    aVar = new a.AbstractBinderC1195a.C1196a(iBinder);
                }
            }
            aVar2.f5912b = aVar;
            a.this.f5911a = 2;
            this.f5916b.onInstallReferrerSetupFinished(0);
        }
    }

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f5913c = applicationContext;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void a(InstallReferrerStateListener installReferrerStateListener) {
        boolean z;
        if (a()) {
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i2 = this.f5911a;
        if (i2 == 1) {
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (i2 == 3) {
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f5913c.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null || !d()) {
                        this.f5911a = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(2);
                        return;
                    }
                    Intent intent2 = new Intent(intent);
                    ServiceConnectionC0077a aVar = new ServiceConnectionC0077a(this, installReferrerStateListener, (byte) 0);
                    this.f5914d = aVar;
                    try {
                        Context context = this.f5913c;
                        if (context == null || !(context instanceof Context)) {
                            z = context.bindService(intent2, aVar, 1);
                        } else if (!d.a(context, intent2)) {
                            z = context.bindService(intent2, aVar, 1);
                        } else {
                            return;
                        }
                        if (!z) {
                            this.f5911a = 0;
                            installReferrerStateListener.onInstallReferrerSetupFinished(1);
                            return;
                        }
                        return;
                    } catch (SecurityException unused) {
                        this.f5911a = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(4);
                        return;
                    }
                }
            }
            this.f5911a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
        }
    }
}
