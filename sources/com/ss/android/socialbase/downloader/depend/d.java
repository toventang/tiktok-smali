package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        static {
            Covode.recordClassIndex(37287);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.d$a$a  reason: collision with other inner class name */
        public static class C1317a implements d {

            /* renamed from: a  reason: collision with root package name */
            public static d f60388a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60389b;

            static {
                Covode.recordClassIndex(37288);
            }

            public final IBinder asBinder() {
                return this.f60389b;
            }

            public C1317a(IBinder iBinder) {
                this.f60389b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.d
            public final void a(DownloadInfo downloadInfo, BaseException baseException, int i2) {
                d dVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
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
                    obtain.writeInt(i2);
                    if (this.f60389b.transact(1, obtain, obtain2, 0) || (dVar = f60388a) == null) {
                        obtain2.readException();
                    } else {
                        dVar.a(downloadInfo, baseException, i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            DownloadInfo downloadInfo;
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                BaseException baseException = null;
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                } else {
                    downloadInfo = null;
                }
                if (parcel.readInt() != 0) {
                    baseException = BaseException.CREATOR.createFromParcel(parcel);
                }
                a(downloadInfo, baseException, parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37286);
    }

    void a(DownloadInfo downloadInfo, BaseException baseException, int i2);
}
