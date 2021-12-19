package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface a extends IInterface {

    /* renamed from: android.support.v4.os.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0014a extends Binder implements a {
        static {
            Covode.recordClassIndex(196);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: android.support.v4.os.a$a$a  reason: collision with other inner class name */
        static class C0015a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static a f782a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f783b;

            static {
                Covode.recordClassIndex(197);
            }

            public final IBinder asBinder() {
                return this.f783b;
            }

            C0015a(IBinder iBinder) {
                this.f783b = iBinder;
            }

            @Override // android.support.v4.os.a
            public final void a(int i2, Bundle bundle) {
                a aVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f783b.transact(1, obtain, null, 1) || (aVar = f782a) == null) {
                        obtain.recycle();
                    } else {
                        aVar.a(i2, bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0014a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            Bundle bundle;
            if (i2 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                a(readInt, bundle);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(195);
    }

    void a(int i2, Bundle bundle);
}
