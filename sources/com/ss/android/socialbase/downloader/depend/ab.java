package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface ab extends IInterface {

    public static abstract class a extends Binder implements ab {
        static {
            Covode.recordClassIndex(37271);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.ab$a$a  reason: collision with other inner class name */
        static class C1313a implements ab {

            /* renamed from: a  reason: collision with root package name */
            public static ab f60380a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60381b;

            static {
                Covode.recordClassIndex(37272);
            }

            public final IBinder asBinder() {
                return this.f60381b;
            }

            C1313a(IBinder iBinder) {
                this.f60381b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.ab
            public final boolean a(DownloadInfo downloadInfo) {
                ab abVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f60381b.transact(1, obtain, obtain2, 0) && (abVar = f60380a) != null) {
                        return abVar.a(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.ab
            public final boolean b(DownloadInfo downloadInfo) {
                ab abVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f60381b.transact(2, obtain, obtain2, 0) && (abVar = f60380a) != null) {
                        return abVar.b(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.ab
            public final boolean c(DownloadInfo downloadInfo) {
                ab abVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f60381b.transact(3, obtain, obtain2, 0) && (abVar = f60380a) != null) {
                        return abVar.c(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
        }

        public static ab a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ab)) {
                return new C1313a(iBinder);
            }
            return (ab) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            DownloadInfo downloadInfo = null;
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean a2 = a(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean b2 = b(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean c2 = c(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(c2 ? 1 : 0);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37270);
    }

    boolean a(DownloadInfo downloadInfo);

    boolean b(DownloadInfo downloadInfo);

    boolean c(DownloadInfo downloadInfo);
}
