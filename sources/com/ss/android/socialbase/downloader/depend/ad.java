package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface ad extends IInterface {

    public static abstract class a extends Binder implements ad {
        static {
            Covode.recordClassIndex(37275);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.ad$a$a  reason: collision with other inner class name */
        public static class C1314a implements ad {

            /* renamed from: a  reason: collision with root package name */
            public static ad f60382a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60383b;

            static {
                Covode.recordClassIndex(37276);
            }

            public final IBinder asBinder() {
                return this.f60383b;
            }

            public C1314a(IBinder iBinder) {
                this.f60383b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.ad
            public final long a(int i2, int i3) {
                ad adVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.f60383b.transact(1, obtain, obtain2, 0) && (adVar = f60382a) != null) {
                        return adVar.a(i2, i3);
                    }
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                long a2 = a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(a2);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37274);
    }

    long a(int i2, int i3);
}
