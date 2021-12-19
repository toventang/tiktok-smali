package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public interface o extends IInterface {

    public static abstract class a extends Binder implements o {
        static {
            Covode.recordClassIndex(31415);
        }

        /* renamed from: com.google.android.gms.common.internal.o$a$a  reason: collision with other inner class name */
        static class C1212a implements o {

            /* renamed from: a  reason: collision with root package name */
            private final IBinder f50427a;

            static {
                Covode.recordClassIndex(31416);
            }

            public final IBinder asBinder() {
                return this.f50427a;
            }

            C1212a(IBinder iBinder) {
                this.f50427a = iBinder;
            }

            @Override // com.google.android.gms.common.internal.o
            public final void a(n nVar, GetServiceRequest getServiceRequest) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (nVar != null) {
                        iBinder = nVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f50427a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            n amVar;
            if (i2 > 16777215) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder readStrongBinder = parcel.readStrongBinder();
            GetServiceRequest getServiceRequest = null;
            if (readStrongBinder == null) {
                amVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof n) {
                    amVar = (n) queryLocalInterface;
                } else {
                    amVar = new am(readStrongBinder);
                }
            }
            if (i2 == 46) {
                if (parcel.readInt() != 0) {
                    getServiceRequest = GetServiceRequest.CREATOR.createFromParcel(parcel);
                }
                a(amVar, getServiceRequest);
                parcel2.writeNoException();
                return true;
            } else if (i2 == 47) {
                if (parcel.readInt() != 0) {
                    zzs.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            } else {
                parcel.readInt();
                if (i2 != 4) {
                    parcel.readString();
                    if (i2 != 1) {
                        if (!(i2 == 2 || i2 == 23 || i2 == 25 || i2 == 27)) {
                            if (i2 != 30) {
                                if (i2 != 34) {
                                    if (!(i2 == 41 || i2 == 43 || i2 == 37 || i2 == 38)) {
                                        switch (i2) {
                                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                                parcel.readString();
                                                parcel.createStringArray();
                                                parcel.readString();
                                                parcel.readStrongBinder();
                                                parcel.readString();
                                                if (parcel.readInt() != 0) {
                                                    Bundle.CREATOR.createFromParcel(parcel);
                                                    break;
                                                }
                                                break;
                                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                                parcel.readString();
                                                parcel.createStringArray();
                                                break;
                                            case 19:
                                                parcel.readStrongBinder();
                                                if (parcel.readInt() != 0) {
                                                    Bundle.CREATOR.createFromParcel(parcel);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                } else {
                                    parcel.readString();
                                }
                            }
                            parcel.createStringArray();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                                Bundle.CREATOR.createFromParcel(parcel);
                            }
                        }
                        if (parcel.readInt() != 0) {
                            Bundle.CREATOR.createFromParcel(parcel);
                        }
                    } else {
                        parcel.readString();
                        parcel.createStringArray();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            Bundle.CREATOR.createFromParcel(parcel);
                        }
                    }
                }
                throw new UnsupportedOperationException();
            }
        }
    }

    static {
        Covode.recordClassIndex(31414);
    }

    void a(n nVar, GetServiceRequest getServiceRequest);
}
