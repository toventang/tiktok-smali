package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.ab;
import com.facebook.j;
import com.facebook.m;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f48560d = b.class.getCanonicalName();

    /* renamed from: g  reason: collision with root package name */
    private static b f48561g;

    /* renamed from: a  reason: collision with root package name */
    public String f48562a;

    /* renamed from: b  reason: collision with root package name */
    public String f48563b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f48564c;

    /* renamed from: e  reason: collision with root package name */
    private String f48565e;

    /* renamed from: f  reason: collision with root package name */
    private long f48566f;

    /* access modifiers changed from: package-private */
    public static final class a implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f48567a;

        static {
            Covode.recordClassIndex(29284);
        }

        public final IBinder asBinder() {
            return this.f48567a;
        }

        public final String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f48567a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f48567a.transact(2, obtain, obtain2, 0);
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

        a(IBinder iBinder) {
            this.f48567a = iBinder;
        }
    }

    static {
        Covode.recordClassIndex(29283);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.b$b  reason: collision with other inner class name */
    public static final class ServiceConnectionC1186b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        AtomicBoolean f48593a;

        /* renamed from: b  reason: collision with root package name */
        final BlockingQueue<IBinder> f48594b;

        static {
            Covode.recordClassIndex(29285);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private ServiceConnectionC1186b() {
            this.f48593a = new AtomicBoolean(false);
            this.f48594b = new LinkedBlockingDeque();
        }

        /* synthetic */ ServiceConnectionC1186b(byte b2) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f48594b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public final String a() {
        if (!m.a() || !ab.c()) {
            return null;
        }
        return this.f48565e;
    }

    private static b a(b bVar) {
        bVar.f48566f = System.currentTimeMillis();
        f48561g = bVar;
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.internal.b c(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.b.c(android.content.Context):com.facebook.internal.b");
    }

    private static b b(Context context) {
        Object a2;
        try {
            Method a3 = ad.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (a3 != null) {
                Object a4 = ad.a((Object) null, a3, context);
                if (a4 instanceof Integer) {
                    if (((Integer) a4).intValue() == 0) {
                        Method a5 = ad.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                        if (a5 == null || (a2 = ad.a((Object) null, a5, context)) == null) {
                            return null;
                        }
                        Method a6 = ad.a(a2.getClass(), "getId", new Class[0]);
                        Method a7 = ad.a(a2.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                        if (a6 == null || a7 == null) {
                            return null;
                        }
                        b bVar = new b();
                        bVar.f48565e = (String) ad.a(a2, a6, new Object[0]);
                        bVar.f48564c = ((Boolean) ad.a(a2, a7, new Object[0])).booleanValue();
                        return bVar;
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            ad.a("android_id", e2);
            return null;
        }
    }

    public static b a(Context context) {
        Throwable th;
        Uri uri;
        String installerPackageName;
        MethodCollector.i(1281);
        b b2 = b(context);
        if (b2 == null && (b2 = c(context)) == null) {
            b2 = new b();
        }
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                if (f48561g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    b bVar = f48561g;
                    if (currentTimeMillis - bVar.f48566f < 3600000) {
                        MethodCollector.o(1281);
                        return bVar;
                    }
                }
                String[] strArr = {"aid", "androidid", "limit_tracking"};
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                if (resolveContentProvider != null && m.a(context, resolveContentProvider.packageName)) {
                    uri = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                } else if (resolveContentProvider2 == null || !m.a(context, resolveContentProvider2.packageName)) {
                    uri = null;
                } else {
                    uri = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                }
                PackageManager packageManager = context.getPackageManager();
                if (!(packageManager == null || (installerPackageName = packageManager.getInstallerPackageName(context.getPackageName())) == null)) {
                    b2.f48563b = installerPackageName;
                }
                if (uri == null) {
                    b a2 = a(b2);
                    MethodCollector.o(1281);
                    return a2;
                }
                Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex("aid");
                            int columnIndex2 = query.getColumnIndex("androidid");
                            int columnIndex3 = query.getColumnIndex("limit_tracking");
                            b2.f48562a = query.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && b2.a() == null) {
                                b2.f48565e = query.getString(columnIndex2);
                                b2.f48564c = Boolean.parseBoolean(query.getString(columnIndex3));
                            }
                            query.close();
                            b a3 = a(b2);
                            MethodCollector.o(1281);
                            return a3;
                        }
                    } catch (Exception unused) {
                        if (query != null) {
                            query.close();
                        }
                        MethodCollector.o(1281);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        MethodCollector.o(1281);
                        throw th;
                    }
                }
                b a4 = a(b2);
                if (query != null) {
                    query.close();
                }
                MethodCollector.o(1281);
                return a4;
            }
            j jVar = new j("getAttributionIdentifiers cannot be called on the main thread.");
            MethodCollector.o(1281);
            throw jVar;
        } catch (Exception unused2) {
            MethodCollector.o(1281);
            return null;
        } catch (Throwable th3) {
            th = th3;
            MethodCollector.o(1281);
            throw th;
        }
    }
}
