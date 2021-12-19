package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.l;

public interface m extends IInterface {

    public static abstract class a extends Binder implements m {
        static {
            Covode.recordClassIndex(37310);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.m$a$a  reason: collision with other inner class name */
        public static class C1324a implements m {

            /* renamed from: a  reason: collision with root package name */
            public static m f60402a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60403b;

            static {
                Covode.recordClassIndex(37311);
            }

            public final IBinder asBinder() {
                return this.f60403b;
            }

            public C1324a(IBinder iBinder) {
                this.f60403b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.m
            public final boolean a(long j2, long j3, l lVar) {
                IBinder iBinder;
                m mVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                    obtain.writeLong(j2);
                    obtain.writeLong(j3);
                    if (lVar != null) {
                        iBinder = lVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    if (!this.f60403b.transact(1, obtain, obtain2, 0) && (mVar = f60402a) != null) {
                        return mVar.a(j2, j3, lVar);
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
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            l aVar;
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof l)) {
                        aVar = new l.a.C1323a(readStrongBinder);
                    } else {
                        aVar = (l) queryLocalInterface;
                    }
                }
                boolean a2 = a(readLong, readLong2, aVar);
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37309);
    }

    boolean a(long j2, long j3, l lVar);
}
