package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        static {
            Covode.recordClassIndex(2996);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.benchmark.d$a$a  reason: collision with other inner class name */
        static class C0083a implements d {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f6185a;

            static {
                Covode.recordClassIndex(2997);
            }

            public final IBinder asBinder() {
                return this.f6185a;
            }

            C0083a(IBinder iBinder) {
                this.f6185a = iBinder;
            }

            @Override // com.benchmark.d
            public final void a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
                    obtain.writeString(str);
                    this.f6185a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.benchmark.d
            public final void a(int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f6185a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.benchmark.d
            public final void a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f6185a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.benchmark.d
            public final void a(int i2, int i3, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    this.f6185a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.benchmark.IByteBenchCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                a(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i2 == 4) {
                parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                a(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.benchmark.IByteBenchCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(2995);
    }

    void a(int i2, int i3, String str);

    void a(int i2, String str);

    void a(String str);

    void a(String str, String str2);
}
