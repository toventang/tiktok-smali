package com.google.firebase.iid;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

interface s extends IInterface {
    static {
        Covode.recordClassIndex(33815);
    }

    void a(Message message);

    public static class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f54486a;

        static {
            Covode.recordClassIndex(33816);
        }

        public final IBinder asBinder() {
            return this.f54486a;
        }

        a(IBinder iBinder) {
            this.f54486a = iBinder;
        }

        @Override // com.google.firebase.iid.s
        public final void a(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f54486a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }
}
