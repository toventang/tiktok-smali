package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.benchmark.d;
import com.bytedance.covode.number.Covode;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        static {
            Covode.recordClassIndex(2958);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.benchmark.c$a$a  reason: collision with other inner class name */
        public static class C0081a implements c {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f6094a;

            static {
                Covode.recordClassIndex(2959);
            }

            public final IBinder asBinder() {
                return this.f6094a;
            }

            @Override // com.benchmark.c
            public final void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBTCManager");
                    this.f6094a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0081a(IBinder iBinder) {
                this.f6094a = iBinder;
            }

            @Override // com.benchmark.c
            public final void a(int i2, String str, String str2, d dVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBTCManager");
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f6094a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.benchmark.IBTCManager");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            d aVar;
            if (i2 == 1) {
                parcel.enforceInterface("com.benchmark.IBTCManager");
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.benchmark.IByteBenchCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                        aVar = new d.a.C0083a(readStrongBinder);
                    } else {
                        aVar = (d) queryLocalInterface;
                    }
                }
                a(readInt, readString, readString2, aVar);
                parcel2.writeNoException();
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("com.benchmark.IBTCManager");
                a();
                parcel2.writeNoException();
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.benchmark.IBTCManager");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(2957);
    }

    void a();

    void a(int i2, String str, String str2, d dVar);
}
