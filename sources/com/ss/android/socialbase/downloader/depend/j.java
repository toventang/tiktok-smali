package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {
        static {
            Covode.recordClassIndex(37303);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.j$a$a  reason: collision with other inner class name */
        public static class C1322a implements j {

            /* renamed from: a  reason: collision with root package name */
            public static j f60398a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60399b;

            static {
                Covode.recordClassIndex(37304);
            }

            public final IBinder asBinder() {
                return this.f60399b;
            }

            public C1322a(IBinder iBinder) {
                this.f60399b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.j
            public final void a(DownloadInfo downloadInfo) {
                j jVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f60399b.transact(1, obtain, obtain2, 0) || (jVar = f60398a) == null) {
                        obtain2.readException();
                    } else {
                        jVar.a(downloadInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.j
            public final boolean b(DownloadInfo downloadInfo) {
                j jVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f60399b.transact(2, obtain, obtain2, 0) && (jVar = f60398a) != null) {
                        return jVar.b(downloadInfo);
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
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            DownloadInfo downloadInfo = null;
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                a(downloadInfo);
                parcel2.writeNoException();
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean b2 = b(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(b2 ? 1 : 0);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37302);
    }

    void a(DownloadInfo downloadInfo);

    boolean b(DownloadInfo downloadInfo);
}
