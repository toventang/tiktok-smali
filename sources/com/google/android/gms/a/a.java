package com.google.android.gms.a;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.e.b;

public interface a extends IInterface {
    static {
        Covode.recordClassIndex(31040);
    }

    /* renamed from: com.google.android.gms.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC1201a extends com.google.android.gms.internal.e.a implements a {
        static {
            Covode.recordClassIndex(31041);
        }

        public AbstractBinderC1201a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
            MethodCollector.i(11640);
            MethodCollector.o(11640);
        }

        /* renamed from: com.google.android.gms.a.a$a$a  reason: collision with other inner class name */
        public static class C1202a extends b implements a {
            static {
                Covode.recordClassIndex(31042);
            }

            C1202a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
                MethodCollector.i(13302);
                MethodCollector.o(13302);
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new C1202a(iBinder);
        }
    }
}
