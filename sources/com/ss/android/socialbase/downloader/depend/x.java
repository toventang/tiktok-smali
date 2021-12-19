package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface x extends IInterface {

    public static abstract class a extends Binder implements x {
        static {
            Covode.recordClassIndex(37327);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.x$a$a  reason: collision with other inner class name */
        static class C1327a implements x {

            /* renamed from: a  reason: collision with root package name */
            public static x f60408a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60409b;

            static {
                Covode.recordClassIndex(37328);
            }

            public final IBinder asBinder() {
                return this.f60409b;
            }

            @Override // com.ss.android.socialbase.downloader.depend.x
            public final String a() {
                x xVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    if (!this.f60409b.transact(3, obtain, obtain2, 0) && (xVar = f60408a) != null) {
                        return xVar.a();
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C1327a(IBinder iBinder) {
                this.f60409b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.x
            public final boolean a(boolean z) {
                int i2;
                x xVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    boolean z2 = true;
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (!this.f60409b.transact(2, obtain, obtain2, 0) && (xVar = f60408a) != null) {
                        return xVar.a(z);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.x
            public final void a(int i2, DownloadInfo downloadInfo, String str, String str2) {
                x xVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    obtain.writeInt(i2);
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.f60409b.transact(1, obtain, obtain2, 0) || (xVar = f60408a) == null) {
                        obtain2.readException();
                    } else {
                        xVar.a(i2, downloadInfo, str, str2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
        }

        public static x a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof x)) {
                return new C1327a(iBinder);
            }
            return (x) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            DownloadInfo downloadInfo;
            boolean z;
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                } else {
                    downloadInfo = null;
                }
                a(readInt, downloadInfo, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean a2 = a(z);
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                String a3 = a();
                parcel2.writeNoException();
                parcel2.writeString(a3);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37326);
    }

    String a();

    void a(int i2, DownloadInfo downloadInfo, String str, String str2);

    boolean a(boolean z);
}
