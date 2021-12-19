package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public interface a extends IInterface {

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0004a extends Binder implements a {
        static {
            Covode.recordClassIndex(78);
        }

        /* renamed from: android.support.v4.app.a$a$a  reason: collision with other inner class name */
        public static class C0005a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static a f582a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f583b;

            static {
                Covode.recordClassIndex(79);
            }

            public final IBinder asBinder() {
                return this.f583b;
            }

            public C0005a(IBinder iBinder) {
                this.f583b = iBinder;
            }

            @Override // android.support.v4.app.a
            public final void a(String str) {
                a aVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.f583b.transact(3, obtain, null, 1) || (aVar = f582a) == null) {
                        obtain.recycle();
                    } else {
                        aVar.a(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public final void a(String str, int i2, String str2) {
                a aVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (this.f583b.transact(2, obtain, null, 1) || (aVar = f582a) == null) {
                        obtain.recycle();
                    } else {
                        aVar.a(str, i2, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public final void a(String str, int i2, String str2, Notification notification) {
                a aVar;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f583b.transact(1, obtain, null, 1) || (aVar = f582a) == null) {
                        obtain.recycle();
                    } else {
                        aVar.a(str, i2, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            Notification notification;
            if (i2 == 1) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                } else {
                    notification = null;
                }
                a(readString, readInt, readString2, notification);
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                a(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                a(parcel.readString());
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("android.support.v4.app.INotificationSideChannel");
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(77);
    }

    void a(String str);

    void a(String str, int i2, String str2);

    void a(String str, int i2, String str2, Notification notification);
}
