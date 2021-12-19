package com.google.android.b.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.a.b;
import com.google.android.a.c;

public interface a extends IInterface {
    static {
        Covode.recordClassIndex(30848);
    }

    Bundle a(Bundle bundle);

    /* renamed from: com.google.android.b.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC1195a extends b implements a {
        static {
            Covode.recordClassIndex(30849);
        }

        /* renamed from: com.google.android.b.a.a$a$a  reason: collision with other inner class name */
        public static class C1196a extends com.google.android.a.a implements a {
            static {
                Covode.recordClassIndex(30850);
            }

            public C1196a(IBinder iBinder) {
                super(iBinder);
                MethodCollector.i(5575);
                MethodCollector.o(5575);
            }

            @Override // com.google.android.b.a.a
            public final Bundle a(Bundle bundle) {
                MethodCollector.i(5579);
                Parcel a2 = a();
                a2.writeInt(1);
                bundle.writeToParcel(a2, 0);
                Parcel a3 = a(a2);
                Bundle bundle2 = (Bundle) c.a(a3, Bundle.CREATOR);
                a3.recycle();
                MethodCollector.o(5579);
                return bundle2;
            }
        }

        @Override // com.google.android.a.b
        public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
            if (i2 != 1) {
                return false;
            }
            Bundle a2 = a((Bundle) c.a(parcel, Bundle.CREATOR));
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
