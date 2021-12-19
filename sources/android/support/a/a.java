package android.support.a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface a extends IInterface {

    /* renamed from: android.support.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0001a extends Binder implements a {
        static {
            Covode.recordClassIndex(71);
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: android.support.a.a$a$a  reason: collision with other inner class name */
        static class C0002a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f580a;

            static {
                Covode.recordClassIndex(72);
            }

            public final IBinder asBinder() {
                return this.f580a;
            }

            C0002a(IBinder iBinder) {
                this.f580a = iBinder;
            }

            @Override // android.support.a.a
            public final void a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f580a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.a
            public final void a(int i2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f580a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.a
            public final void b(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f580a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.a
            public final void a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f580a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.a.a
            public final void a(int i2, Uri uri, boolean z, Bundle bundle) {
                int i3;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i2);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    obtain.writeInt(i3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f580a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0001a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0002a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            Uri uri;
            boolean z;
            Bundle bundle = null;
            if (i2 == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(readInt, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(readString, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i2 == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(bundle);
                parcel2.writeNoException();
                return true;
            } else if (i2 == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                b(readString2, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i2 == 6) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                } else {
                    uri = null;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(readInt2, uri, z, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(70);
    }

    void a(int i2, Uri uri, boolean z, Bundle bundle);

    void a(int i2, Bundle bundle);

    void a(Bundle bundle);

    void a(String str, Bundle bundle);

    void b(String str, Bundle bundle);
}
