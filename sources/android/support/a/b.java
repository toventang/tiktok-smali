package android.support.a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static {
            Covode.recordClassIndex(74);
        }

        /* renamed from: android.support.a.b$a$a  reason: collision with other inner class name */
        public static class C0003a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f581a;

            static {
                Covode.recordClassIndex(75);
            }

            public final IBinder asBinder() {
                return this.f581a;
            }

            @Override // android.support.a.b
            public final boolean a(a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f581a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.b
            public final boolean a(a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f581a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C0003a(IBinder iBinder) {
                this.f581a = iBinder;
            }

            @Override // android.support.a.b
            public final boolean a(long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j2);
                    boolean z = false;
                    this.f581a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.b
            public final boolean a(a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    this.f581a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.b
            public final Bundle a(String str, Bundle bundle) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f581a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.b
            public final boolean a(a aVar, Uri uri) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f581a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.b
            public final int a(a aVar, String str, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f581a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.b
            public final boolean a(a aVar, int i2, Uri uri, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i2);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f581a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            Uri uri;
            Uri uri2;
            if (i2 != 1598968902) {
                Bundle bundle = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                Uri uri3 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                switch (i2) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        boolean a2 = a(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(a2 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        boolean a3 = a(a.AbstractBinderC0001a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(a3 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        a a4 = a.AbstractBinderC0001a.a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean a5 = a(a4, uri, bundle, parcel.createTypedArrayList(Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(a5 ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        Bundle a6 = a(readString, bundle5);
                        parcel2.writeNoException();
                        if (a6 != null) {
                            parcel2.writeInt(1);
                            a6.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        a a7 = a.AbstractBinderC0001a.a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean a8 = a(a7, bundle4);
                        parcel2.writeNoException();
                        parcel2.writeInt(a8 ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        a a9 = a.AbstractBinderC0001a.a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        boolean a10 = a(a9, uri3);
                        parcel2.writeNoException();
                        parcel2.writeInt(a10 ? 1 : 0);
                        return true;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        a a11 = a.AbstractBinderC0001a.a(parcel.readStrongBinder());
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        int a12 = a(a11, readString2, bundle3);
                        parcel2.writeNoException();
                        parcel2.writeInt(a12);
                        return true;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        a a13 = a.AbstractBinderC0001a.a(parcel.readStrongBinder());
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        boolean a14 = a(a13, readInt, uri2, bundle2);
                        parcel2.writeNoException();
                        parcel2.writeInt(a14 ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            } else {
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(73);
    }

    int a(a aVar, String str, Bundle bundle);

    Bundle a(String str, Bundle bundle);

    boolean a(long j2);

    boolean a(a aVar);

    boolean a(a aVar, int i2, Uri uri, Bundle bundle);

    boolean a(a aVar, Uri uri);

    boolean a(a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    boolean a(a aVar, Bundle bundle);
}
