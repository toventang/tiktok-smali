package com.ss.android.socialbase.downloader.depend;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface e extends IInterface {

    public static abstract class a extends Binder implements e {
        static {
            Covode.recordClassIndex(37290);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.e$a$a  reason: collision with other inner class name */
        static class C1318a implements e {

            /* renamed from: a  reason: collision with root package name */
            public static e f60390a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60391b;

            static {
                Covode.recordClassIndex(37291);
            }

            public final IBinder asBinder() {
                return this.f60391b;
            }

            C1318a(IBinder iBinder) {
                this.f60391b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.e
            public final Uri a(String str, String str2) {
                Uri uri;
                e eVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.f60391b.transact(1, obtain, obtain2, 0) && (eVar = f60390a) != null) {
                        return eVar.a(str, str2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(obtain2);
                    } else {
                        uri = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return uri;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                return new C1318a(iBinder);
            }
            return (e) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                Uri a2 = a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a2 != null) {
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37289);
    }

    Uri a(String str, String str2);
}
