package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        static {
            Covode.recordClassIndex(1652);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: androidx.room.d$a$a  reason: collision with other inner class name */
        static class C0062a implements d {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f4271a;

            static {
                Covode.recordClassIndex(1653);
            }

            public final IBinder asBinder() {
                return this.f4271a;
            }

            C0062a(IBinder iBinder) {
                this.f4271a = iBinder;
            }

            @Override // androidx.room.d
            public final void a(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f4271a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                return new C0062a(iBinder);
            }
            return (d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                a(parcel.createStringArray());
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(1651);
    }

    void a(String[] strArr);
}
