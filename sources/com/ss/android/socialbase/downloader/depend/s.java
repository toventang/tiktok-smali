package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.r;

public interface s extends IInterface {

    public static abstract class a extends Binder implements s {
        static {
            Covode.recordClassIndex(37320);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.s$a$a  reason: collision with other inner class name */
        public static class C1326a implements s {

            /* renamed from: a  reason: collision with root package name */
            public static s f60406a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60407b;

            static {
                Covode.recordClassIndex(37321);
            }

            public final IBinder asBinder() {
                return this.f60407b;
            }

            public C1326a(IBinder iBinder) {
                this.f60407b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.s
            public final boolean a(r rVar) {
                IBinder iBinder;
                s sVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                    if (rVar != null) {
                        iBinder = rVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    if (!this.f60407b.transact(1, obtain, obtain2, 0) && (sVar = f60406a) != null) {
                        return sVar.a(rVar);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
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
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            r aVar;
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof r)) {
                        aVar = new r.a.C1325a(readStrongBinder);
                    } else {
                        aVar = (r) queryLocalInterface;
                    }
                }
                boolean a2 = a(aVar);
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37319);
    }

    boolean a(r rVar);
}
