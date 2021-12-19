package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.d;
import com.bytedance.covode.number.Covode;

public interface e extends IInterface {

    public static abstract class a extends Binder implements e {
        static {
            Covode.recordClassIndex(1655);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: androidx.room.e$a$a  reason: collision with other inner class name */
        static class C0063a implements e {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f4272a;

            static {
                Covode.recordClassIndex(1656);
            }

            public final IBinder asBinder() {
                return this.f4272a;
            }

            C0063a(IBinder iBinder) {
                this.f4272a = iBinder;
            }

            @Override // androidx.room.e
            public final void a(int i2, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i2);
                    obtain.writeStringArray(strArr);
                    this.f4272a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.e
            public final int a(d dVar, String str) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.f4272a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.e
            public final void a(d dVar, int i2) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    if (dVar != null) {
                        iBinder = dVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i2);
                    this.f4272a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int a2 = a(d.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                a(d.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                a(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(1654);
    }

    int a(d dVar, String str);

    void a(int i2, String[] strArr);

    void a(d dVar, int i2);
}
