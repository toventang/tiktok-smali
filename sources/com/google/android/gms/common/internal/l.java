package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.e.b;
import com.google.android.gms.internal.e.c;

public interface l extends IInterface {
    static {
        Covode.recordClassIndex(31408);
    }

    Account a();

    public static abstract class a extends com.google.android.gms.internal.e.a implements l {
        static {
            Covode.recordClassIndex(31409);
        }

        /* renamed from: com.google.android.gms.common.internal.l$a$a  reason: collision with other inner class name */
        public static class C1211a extends b implements l {
            static {
                Covode.recordClassIndex(31410);
            }

            @Override // com.google.android.gms.common.internal.l
            public final Account a() {
                MethodCollector.i(11891);
                Parcel a2 = a(2, c());
                Account account = (Account) c.a(a2, Account.CREATOR);
                a2.recycle();
                MethodCollector.o(11891);
                return account;
            }

            C1211a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                MethodCollector.i(11889);
                MethodCollector.o(11889);
            }
        }

        public static l a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof l) {
                return (l) queryLocalInterface;
            }
            return new C1211a(iBinder);
        }

        @Override // com.google.android.gms.internal.e.a
        public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
            if (i2 != 2) {
                return false;
            }
            Account a2 = a();
            parcel2.writeNoException();
            if (a2 == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                a2.writeToParcel(parcel2, 1);
            }
            return true;
        }
    }
}
