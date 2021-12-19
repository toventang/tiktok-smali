package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* access modifiers changed from: package-private */
public final class u {
    static {
        Covode.recordClassIndex(2768);
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final boolean f299;

        /* renamed from: ɩ  reason: contains not printable characters */
        final String f300;

        static {
            Covode.recordClassIndex(2769);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m200() {
            return this.f299;
        }

        b(String str, boolean z) {
            this.f300 = str;
            this.f299 = z;
        }
    }

    static final class e implements IInterface {

        /* renamed from: ǃ  reason: contains not printable characters */
        private IBinder f303;

        static {
            Covode.recordClassIndex(2771);
        }

        public final IBinder asBinder() {
            return this.f303;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m201() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f303.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String m202() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f303.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        e(IBinder iBinder) {
            this.f303 = iBinder;
        }
    }

    u() {
    }

    static final class d implements ServiceConnection {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f301;

        /* renamed from: Ι  reason: contains not printable characters */
        final LinkedBlockingQueue<IBinder> f302;

        static {
            Covode.recordClassIndex(2770);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private d() {
            this.f302 = new LinkedBlockingQueue<>(1);
            this.f301 = false;
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f302.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static b m199(Context context) {
        MethodCollector.i(2321);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                d dVar = new d((byte) 0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!com_appsflyer_internal_u_com_ss_android_ugc_aweme_lancet_StartServiceLancet_bindService(context, intent, dVar, 1)) {
                        context.unbindService(dVar);
                        IOException iOException = new IOException("Google Play connection failed");
                        MethodCollector.o(2321);
                        throw iOException;
                    } else if (!dVar.f301) {
                        dVar.f301 = true;
                        e eVar = new e(dVar.f302.take());
                        b bVar = new b(eVar.m202(), eVar.m201());
                        context.unbindService(dVar);
                        MethodCollector.o(2321);
                        return bVar;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(2321);
                        throw illegalStateException;
                    }
                } catch (Exception e2) {
                    MethodCollector.o(2321);
                    throw e2;
                } catch (Throwable th) {
                    context.unbindService(dVar);
                    MethodCollector.o(2321);
                    throw th;
                }
            } catch (Exception e3) {
                MethodCollector.o(2321);
                throw e3;
            }
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("Cannot be called from the main thread");
            MethodCollector.o(2321);
            throw illegalStateException2;
        }
    }

    public static boolean com_appsflyer_internal_u_com_ss_android_ugc_aweme_lancet_StartServiceLancet_bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, i2);
        }
        if (com.ss.android.ugc.aweme.push.downgrade.d.a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, i2);
    }
}
