package com.ss.android.socialbase.downloader.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.depend.ab;
import com.ss.android.socialbase.downloader.depend.ad;
import com.ss.android.socialbase.downloader.depend.c;
import com.ss.android.socialbase.downloader.depend.d;
import com.ss.android.socialbase.downloader.depend.e;
import com.ss.android.socialbase.downloader.depend.f;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.h;
import com.ss.android.socialbase.downloader.depend.j;
import com.ss.android.socialbase.downloader.depend.m;
import com.ss.android.socialbase.downloader.depend.s;
import com.ss.android.socialbase.downloader.depend.x;

public interface a extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.model.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC1333a extends Binder implements a {
        static {
            Covode.recordClassIndex(37543);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.model.a$a$a  reason: collision with other inner class name */
        public static class C1334a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static a f60858a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60859b;

            static {
                Covode.recordClassIndex(37544);
            }

            public final IBinder asBinder() {
                return this.f60859b;
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final x c() {
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(6, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.c();
                    }
                    obtain2.readException();
                    x a2 = x.a.a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final ab d() {
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(7, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.d();
                    }
                    obtain2.readException();
                    ab a2 = ab.a.a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final int l() {
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(15, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.l();
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final c b() {
                c cVar;
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(2, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.b();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof c)) {
                            cVar = new c.a.C1316a(readStrongBinder);
                        } else {
                            cVar = (c) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return cVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final f e() {
                f fVar;
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(8, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.e();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof f)) {
                            fVar = new f.a.C1319a(readStrongBinder);
                        } else {
                            fVar = (f) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return fVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final d f() {
                d dVar;
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(9, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.f();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        dVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                            dVar = new d.a.C1317a(readStrongBinder);
                        } else {
                            dVar = (d) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return dVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final s g() {
                s sVar;
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(10, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.g();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        sVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof s)) {
                            sVar = new s.a.C1326a(readStrongBinder);
                        } else {
                            sVar = (s) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return sVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final ad h() {
                ad adVar;
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(11, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.h();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        adVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof ad)) {
                            adVar = new ad.a.C1314a(readStrongBinder);
                        } else {
                            adVar = (ad) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return adVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final m i() {
                m mVar;
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(12, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.i();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        mVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof m)) {
                            mVar = new m.a.C1324a(readStrongBinder);
                        } else {
                            mVar = (m) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return mVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final h j() {
                h hVar;
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(13, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.j();
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        hVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof h)) {
                            hVar = new h.a.C1321a(readStrongBinder);
                        } else {
                            hVar = (h) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return hVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final e k() {
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(14, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.k();
                    }
                    obtain2.readException();
                    e a2 = e.a.a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final DownloadInfo a() {
                DownloadInfo downloadInfo;
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.f60859b.transact(1, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.a();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C1334a(IBinder iBinder) {
                this.f60859b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final int a(int i2) {
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i2);
                    if (!this.f60859b.transact(3, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.a(i2);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final j c(int i2) {
                j jVar;
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i2);
                    if (!this.f60859b.transact(16, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.c(i2);
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    if (readStrongBinder == null) {
                        jVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof j)) {
                            jVar = new j.a.C1322a(readStrongBinder);
                        } else {
                            jVar = (j) queryLocalInterface;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return jVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final g b(int i2) {
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i2);
                    if (!this.f60859b.transact(5, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.b(i2);
                    }
                    obtain2.readException();
                    g a2 = g.a.a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.a
            public final g a(int i2, int i3) {
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.f60859b.transact(4, obtain, obtain2, 0) && (aVar = f60858a) != null) {
                        return aVar.a(i2, i3);
                    }
                    obtain2.readException();
                    g a2 = g.a.a(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return a2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC1333a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 1598968902) {
                IBinder iBinder = null;
                switch (i2) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        DownloadInfo a2 = a();
                        parcel2.writeNoException();
                        if (a2 != null) {
                            parcel2.writeInt(1);
                            a2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        c b2 = b();
                        parcel2.writeNoException();
                        if (b2 != null) {
                            iBinder = b2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int a3 = a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a3);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        g a4 = a(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a4 != null) {
                            iBinder = a4.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        g b3 = b(parcel.readInt());
                        parcel2.writeNoException();
                        if (b3 != null) {
                            iBinder = b3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        x c2 = c();
                        parcel2.writeNoException();
                        if (c2 != null) {
                            iBinder = c2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        ab d2 = d();
                        parcel2.writeNoException();
                        if (d2 != null) {
                            iBinder = d2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        f e2 = e();
                        parcel2.writeNoException();
                        if (e2 != null) {
                            iBinder = e2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        d f2 = f();
                        parcel2.writeNoException();
                        if (f2 != null) {
                            iBinder = f2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        s g2 = g();
                        parcel2.writeNoException();
                        if (g2 != null) {
                            iBinder = g2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        ad h2 = h();
                        parcel2.writeNoException();
                        if (h2 != null) {
                            iBinder = h2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        m i4 = i();
                        parcel2.writeNoException();
                        if (i4 != null) {
                            iBinder = i4.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        h j2 = j();
                        parcel2.writeNoException();
                        if (j2 != null) {
                            iBinder = j2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case ABRConfig.ABR_SELECT_SCENE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        e k2 = k();
                        parcel2.writeNoException();
                        if (k2 != null) {
                            iBinder = k2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int l2 = l();
                        parcel2.writeNoException();
                        parcel2.writeInt(l2);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        j c3 = c(parcel.readInt());
                        parcel2.writeNoException();
                        if (c3 != null) {
                            iBinder = c3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37542);
    }

    int a(int i2);

    g a(int i2, int i3);

    DownloadInfo a();

    c b();

    g b(int i2);

    j c(int i2);

    x c();

    ab d();

    f e();

    d f();

    s g();

    ad h();

    m i();

    h j();

    e k();

    int l();
}
