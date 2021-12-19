package com.bytedance.disk.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public interface a extends IInterface {
    static {
        Covode.recordClassIndex(16766);
    }

    int a(MigrationOpt migrationOpt);

    int a(MigrationOpt migrationOpt, int i2);

    MigrationItem a(MigrationOpt migrationOpt, boolean z, boolean z2);

    void a(long j2);

    int b(MigrationOpt migrationOpt);

    int c(MigrationOpt migrationOpt);

    /* renamed from: com.bytedance.disk.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0610a extends Binder implements a {
        static {
            Covode.recordClassIndex(16767);
        }

        public IBinder asBinder() {
            return this;
        }

        public AbstractBinderC0610a() {
            attachInterface(this, "com.bytedance.disk.aidl.IMigrationManager");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            boolean z;
            boolean z2;
            if (i2 != 1598968902) {
                MigrationOpt migrationOpt = null;
                switch (i2) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        int a2 = a(migrationOpt);
                        parcel2.writeNoException();
                        parcel2.writeInt(a2);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        int b2 = b(migrationOpt);
                        parcel2.writeNoException();
                        parcel2.writeInt(b2);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        int a3 = a(migrationOpt, parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(a3);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        int c2 = c(migrationOpt);
                        parcel2.writeNoException();
                        parcel2.writeInt(c2);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        if (parcel.readInt() != 0) {
                            migrationOpt = MigrationOpt.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        MigrationItem a4 = a(migrationOpt, z, z2);
                        parcel2.writeNoException();
                        if (a4 != null) {
                            parcel2.writeInt(1);
                            a4.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        parcel.enforceInterface("com.bytedance.disk.aidl.IMigrationManager");
                        a(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            } else {
                parcel2.writeString("com.bytedance.disk.aidl.IMigrationManager");
                return true;
            }
        }
    }
}
