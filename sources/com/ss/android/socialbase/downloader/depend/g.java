package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface g extends IInterface {

    public static abstract class a extends Binder implements g {
        static {
            Covode.recordClassIndex(37296);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.g$a$a  reason: collision with other inner class name */
        static class C1320a implements g {

            /* renamed from: a  reason: collision with root package name */
            public static g f60394a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60395b;

            static {
                Covode.recordClassIndex(37297);
            }

            public final IBinder asBinder() {
                return this.f60395b;
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final int a() {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (!this.f60395b.transact(1, obtain, obtain2, 0) && (gVar = f60394a) != null) {
                        return gVar.a();
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

            C1320a(IBinder iBinder) {
                this.f60395b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void b(DownloadInfo downloadInfo) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(3, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.b(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void c(DownloadInfo downloadInfo) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(4, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.c(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void d(DownloadInfo downloadInfo) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(5, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.d(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void e(DownloadInfo downloadInfo) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(6, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.e(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void f(DownloadInfo downloadInfo) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(8, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.f(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void g(DownloadInfo downloadInfo) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(9, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.g(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void h(DownloadInfo downloadInfo) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(10, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.h(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void i(DownloadInfo downloadInfo) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(13, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.i(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void a(DownloadInfo downloadInfo) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(2, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.a(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void b(DownloadInfo downloadInfo, BaseException baseException) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(11, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.b(downloadInfo, baseException);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void c(DownloadInfo downloadInfo, BaseException baseException) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(12, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.c(downloadInfo, baseException);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.g
            public final void a(DownloadInfo downloadInfo, BaseException baseException) {
                g gVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60395b.transact(7, obtain, obtain2, 0) || (gVar = f60394a) == null) {
                        obtain2.readException();
                    } else {
                        gVar.a(downloadInfo, baseException);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof g)) {
                return new C1320a(iBinder);
            }
            return (g) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            DownloadInfo downloadInfo;
            DownloadInfo downloadInfo2;
            DownloadInfo downloadInfo3;
            if (i2 != 1598968902) {
                DownloadInfo downloadInfo4 = null;
                DownloadInfo downloadInfo5 = null;
                BaseException baseException = null;
                BaseException baseException2 = null;
                DownloadInfo downloadInfo6 = null;
                DownloadInfo downloadInfo7 = null;
                DownloadInfo downloadInfo8 = null;
                BaseException baseException3 = null;
                DownloadInfo downloadInfo9 = null;
                DownloadInfo downloadInfo10 = null;
                DownloadInfo downloadInfo11 = null;
                DownloadInfo downloadInfo12 = null;
                switch (i2) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        int a2 = a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a2);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo4 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        a(downloadInfo4);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo12 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        b(downloadInfo12);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo11 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        c(downloadInfo11);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo10 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        d(downloadInfo10);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo9 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        e(downloadInfo9);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo = null;
                        }
                        if (parcel.readInt() != 0) {
                            baseException3 = BaseException.CREATOR.createFromParcel(parcel);
                        }
                        a(downloadInfo, baseException3);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo8 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        f(downloadInfo8);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo7 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        g(downloadInfo7);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo6 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        h(downloadInfo6);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            baseException2 = BaseException.CREATOR.createFromParcel(parcel);
                        }
                        b(downloadInfo2, baseException2);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo3 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo3 = null;
                        }
                        if (parcel.readInt() != 0) {
                            baseException = BaseException.CREATOR.createFromParcel(parcel);
                        }
                        c(downloadInfo3, baseException);
                        parcel2.writeNoException();
                        return true;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo5 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        i(downloadInfo5);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37295);
    }

    int a();

    void a(DownloadInfo downloadInfo);

    void a(DownloadInfo downloadInfo, BaseException baseException);

    void b(DownloadInfo downloadInfo);

    void b(DownloadInfo downloadInfo, BaseException baseException);

    void c(DownloadInfo downloadInfo);

    void c(DownloadInfo downloadInfo, BaseException baseException);

    void d(DownloadInfo downloadInfo);

    void e(DownloadInfo downloadInfo);

    void f(DownloadInfo downloadInfo);

    void g(DownloadInfo downloadInfo);

    void h(DownloadInfo downloadInfo);

    void i(DownloadInfo downloadInfo);
}
