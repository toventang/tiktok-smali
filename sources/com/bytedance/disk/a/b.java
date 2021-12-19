package com.bytedance.disk.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.parcel.MigrationItem;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static {
            Covode.recordClassIndex(16769);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: com.bytedance.disk.a.b$a$a  reason: collision with other inner class name */
        public static class C0611a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static b f28527a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f28528b;

            static {
                Covode.recordClassIndex(16770);
            }

            public final IBinder asBinder() {
                return this.f28528b;
            }

            public C0611a(IBinder iBinder) {
                this.f28528b = iBinder;
            }

            @Override // com.bytedance.disk.a.b
            public final void a(MigrationItem migrationItem) {
                b bVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.disk.aidl.IProcessCallback");
                    if (migrationItem != null) {
                        obtain.writeInt(1);
                        migrationItem.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f28528b.transact(1, obtain, obtain2, 0) || (bVar = f28527a) == null) {
                        obtain2.readException();
                    } else {
                        bVar.a(migrationItem);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.bytedance.disk.aidl.IProcessCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            MigrationItem migrationItem;
            if (i2 == 1) {
                parcel.enforceInterface("com.bytedance.disk.aidl.IProcessCallback");
                if (parcel.readInt() != 0) {
                    migrationItem = MigrationItem.CREATOR.createFromParcel(parcel);
                } else {
                    migrationItem = null;
                }
                a(migrationItem);
                parcel2.writeNoException();
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("com.bytedance.disk.aidl.IProcessCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(16768);
    }

    void a(MigrationItem migrationItem);
}
