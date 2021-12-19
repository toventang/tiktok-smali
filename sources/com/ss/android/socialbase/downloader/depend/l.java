package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface l extends IInterface {

    public static abstract class a extends Binder implements l {
        static {
            Covode.recordClassIndex(37307);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.l$a$a  reason: collision with other inner class name */
        static class C1323a implements l {

            /* renamed from: a  reason: collision with root package name */
            public static l f60400a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60401b;

            static {
                Covode.recordClassIndex(37308);
            }

            public final IBinder asBinder() {
                return this.f60401b;
            }

            @Override // com.ss.android.socialbase.downloader.depend.l
            public final void a() {
                l lVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    if (this.f60401b.transact(1, obtain, obtain2, 0) || (lVar = f60400a) == null) {
                        obtain2.readException();
                    } else {
                        lVar.a();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C1323a(IBinder iBinder) {
                this.f60401b = iBinder;
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                a();
                parcel2.writeNoException();
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37306);
    }

    void a();
}
