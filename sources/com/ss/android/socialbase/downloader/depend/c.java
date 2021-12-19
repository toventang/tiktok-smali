package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        static {
            Covode.recordClassIndex(37284);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.c$a$a  reason: collision with other inner class name */
        public static class C1316a implements c {

            /* renamed from: a  reason: collision with root package name */
            public static c f60386a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60387b;

            static {
                Covode.recordClassIndex(37285);
            }

            public final IBinder asBinder() {
                return this.f60387b;
            }

            public C1316a(IBinder iBinder) {
                this.f60387b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.c
            public final int a(long j2) {
                c cVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                    obtain.writeLong(j2);
                    if (!this.f60387b.transact(1, obtain, obtain2, 0) && (cVar = f60386a) != null) {
                        return cVar.a(j2);
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
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                int a2 = a(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37283);
    }

    int a(long j2);
}
