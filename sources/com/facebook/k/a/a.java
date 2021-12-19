package com.facebook.k.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface a extends IInterface {

    /* renamed from: com.facebook.k.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC1187a extends Binder implements a {
        static {
            Covode.recordClassIndex(29404);
        }

        /* renamed from: com.facebook.k.a.a$a$a  reason: collision with other inner class name */
        public static class C1188a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static a f48754a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f48755b;

            static {
                Covode.recordClassIndex(29405);
            }

            public final IBinder asBinder() {
                return this.f48755b;
            }

            public C1188a(IBinder iBinder) {
                this.f48755b = iBinder;
            }

            @Override // com.facebook.k.a.a
            public final int a(Bundle bundle) {
                a aVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f48755b.transact(1, obtain, obtain2, 0) && (aVar = f48754a) != null) {
                        return aVar.a(bundle);
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

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            Bundle bundle;
            if (i2 == 1) {
                parcel.enforceInterface("com.facebook.ppml.receiver.IReceiverService");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                int a2 = a(bundle);
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.facebook.ppml.receiver.IReceiverService");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(29403);
    }

    int a(Bundle bundle);
}
