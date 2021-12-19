package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface af extends IInterface {

    public static abstract class a extends Binder implements af {
        static {
            Covode.recordClassIndex(37279);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.ss.android.socialbase.downloader.depend.af$a$a  reason: collision with other inner class name */
        public static class C1315a implements af {

            /* renamed from: a  reason: collision with root package name */
            public static af f60384a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f60385b;

            static {
                Covode.recordClassIndex(37280);
            }

            public final IBinder asBinder() {
                return this.f60385b;
            }

            public C1315a(IBinder iBinder) {
                this.f60385b = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.af
            public final void a(int i2, int i3) {
                af afVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (this.f60385b.transact(1, obtain, obtain2, 0) || (afVar = f60384a) == null) {
                        obtain2.readException();
                    } else {
                        afVar.a(i2, i3);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(37278);
    }

    void a(int i2, int i3);
}
